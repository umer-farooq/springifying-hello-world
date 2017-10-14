package com.somethinlikecoding.spHelloWorld;
public class HelloWorldWithCommandLineArguments{

	public static void main(String[] args) {
		if (args.length > 0) {
		    for(String arg : args)
			   System.out.println(arg);
		} else {
			System.out.println("Hello World!");
		}
	}
}