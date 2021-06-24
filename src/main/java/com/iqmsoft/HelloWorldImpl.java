
package com.iqmsoft;

import javax.jws.WebService;

@WebService(endpointInterface = "com.iqmsoft.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

