package demo.ejb;

import main.java.demo.ejb.HelloEjb;

import javax.ejb.Stateless;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 20.09.13
 * Time: 2:01
 * To change this template use File | Settings | File Templates.
 */
@Stateless
public class HelloEjbBean implements HelloEjb {
    @Override
    public String sayHello(String param) {
        return param + " = hello from EJB yeahh !! ";
    }
}
