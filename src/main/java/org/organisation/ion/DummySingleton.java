package org.organisation.ion;
 
public class DummySingleton {
     
    private static final DummySingleton instance = new DummySingleton();
     
    private DummySingleton(){}
 
    public static DummySingleton getInstance(){
        return instance;
    }
}