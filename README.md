# Bank Manager

## Description

Application Java utilisant l’héritage pour gérer différents types de comptes bancaires.

## Classes

* BankAccount (classe mère)
* CheckingAccount (avec limite)
* SavingsAccount
* COD

## Lancer

### Java

javac src/*.java
java -cp src Main

### Docker

docker build -t bankapp .
docker run bankapp

## Auteur

Karidja Kone
