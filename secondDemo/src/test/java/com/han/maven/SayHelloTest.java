package com.han.maven;

import org.junit.Test;

/**
 * SayHello Tester.
 *
 * @author HanShuang
 * @since <pre>06/10/2021</pre>
 */
public class SayHelloTest {
    @Test
    public void successTest() throws Exception {
        new SayHello().Success();

    }


    /**
     * Method: sayHello(String name)
     */
    @Test
    public void SayHelloTest() throws Exception {
//TODO
        new SayHello().sayHello("Anna");
    }

    @Test
    public void SayHelloTest1() throws Exception {
//TODO
        new SayHello().sayHello("Bill");
    }

    @Test
    public void SayHelloTest3() throws Exception {
//TODO
        new SayHello().sayHello("");
    }

} 
