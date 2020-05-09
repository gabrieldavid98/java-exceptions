package edu.sena.oop.exceptions;

public class InvalidLoginException extends Exception {
   public InvalidLoginException(String mensaje) {
      super(mensaje);
   }
}
