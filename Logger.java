// Singleton Design Pattern in java

// Singleton pattern ensures that a class has only one instance in the application and
//provides a global point of access to that instance.
//it used to restrict the instantioation of a class to one object.

public class Logger {
  private static Logger instance;
  private Logger(){
    System.out.println("Logger instance created");
  }
  // if two threads try to access the getInstance() method at the same time, 
  //it can lead to the creation of multiple instances of the Logger class, violating the singleton pattern. 
  //hence use synchronized keyword to make the method thread-safe, ensuring that only one thread can access it at a time.
  public static synchronized Logger getInstance(){
    // synchronized keyword is used to make the method thread-safe, ensuring that only one thread can access it at a time.
    if(instance == null){
      instance = new Logger();
    }
    return instance;
  }
  public void log(String message){
    System.out.println("Log: " + message);
  }

}

