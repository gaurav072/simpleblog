package com.startwithjava.simpleblog.java8;
import org.springframework.stereotype.Service;
@Service
public class A {
	B b;
	public void hello() {
		System.out.println("A hello()");
		B b = new B();
		b.test();
	}
}
