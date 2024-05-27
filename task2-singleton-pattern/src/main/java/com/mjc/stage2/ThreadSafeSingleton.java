package com.mjc.stage2;

public class ThreadSafeSingleton {
    // Write your code here!
  private final static ThreadSafeSingleton threadSafeSingleton= new ThreadSafeSingleton();
  private ThreadSafeSingleton() {

  }

  public static ThreadSafeSingleton getInstance() {
    return threadSafeSingleton;
  }
}
