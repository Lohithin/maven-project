package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * 
   *@param some persons name.
   *@return getting some  persons name.
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
