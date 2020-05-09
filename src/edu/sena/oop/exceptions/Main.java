package edu.sena.oop.exceptions;

public class Main {
   public static void main(String[] args) {
      try {
         new Login().
            ingresarLogin().
            validarLogin();

         System.out.println("Bienvenido! :D");
      } catch (InvalidLoginException ilEx) {
         System.out.println(ilEx.getMessage());
      }
   }
}
