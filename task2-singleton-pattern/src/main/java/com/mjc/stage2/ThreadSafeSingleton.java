package com.mjc.stage2;

public class ThreadSafeSingleton {
    // Write your code here!
  private static ThreadSafeSingleton instance;
  private ThreadSafeSingleton() {

  }

  public static ThreadSafeSingleton getInstance() {
    if (instance == null) {
      instance = new ThreadSafeSingleton();
    }
    return instance;
  }
}
