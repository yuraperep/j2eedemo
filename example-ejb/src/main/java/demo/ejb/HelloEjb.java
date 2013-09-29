package main.java.demo.ejb;

import javax.ejb.Local;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 29.09.13
 * Time: 13:50
 * To change this template use File | Settings | File Templates.
 */
@Local
public interface HelloEjb {
    public String sayHello(String param);
}
