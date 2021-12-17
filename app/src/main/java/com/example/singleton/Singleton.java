package com.example.singleton;

public class Singleton {

    private  static  final  Singleton instance= new Singleton();
    String name;
    String num;

    private Singleton()
    {}

    public static  Singleton getInstance(){
        return  instance;

    }
    public String getName()
    {
        return name;
    }
    public  void  setName(String name)
    {
        this.name=name;
    }
    public String getNum()
    {
        return num;
    }
    public  void  setNum(String num)
    {
        this.num=num;
    }



}
