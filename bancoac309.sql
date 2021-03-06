-- MySQL Script generated by MySQL Workbench
-- Mon Jun  4 21:35:21 2018
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ac309db` DEFAULT CHARACTER SET utf8 ;
USE `ac309db` ;

-- -----------------------------------------------------
-- Table `mydb`.`table1`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ac309db`.`Clientes` (
  `Nome` VARCHAR(25) NOT NULL,
  `RG` VARCHAR(8) NOT NULL,
  `CPF` VARCHAR(12) NOT NULL,
  `Estado` VARCHAR(2) NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`RG`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
