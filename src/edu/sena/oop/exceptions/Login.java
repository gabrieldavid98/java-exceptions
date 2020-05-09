package edu.sena.oop.exceptions;

import java.util.Scanner;

public class Login {
   private final String USERNAME = "Admin";
   private final String PASSWORD = "2020";

   private String username;
   private String password;
   private Scanner scanner;

   public Login() {
      this.scanner = new Scanner(System.in);
   }

   public Login ingresarLogin() {
      System.out.println("======= Login ========");
      System.out.print("Usuario: ");
      username = scanner.nextLine();

      System.out.print("Contraseña: ");
      password = scanner.nextLine();

      return this;
   }

   public void validarLogin() throws InvalidLoginException {
      if (!username.equals(USERNAME)) {
         throw new InvalidLoginException("El usuario ingresado no es correcto");
      }

      if (!password.equals(PASSWORD)) {
         throw new InvalidLoginException("La contraseña no coincide");
      }
   }
}
