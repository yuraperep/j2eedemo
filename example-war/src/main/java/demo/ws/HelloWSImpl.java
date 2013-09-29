package demo.ws;

import main.java.demo.ejb.HelloEjb;

import javax.ejb.EJB;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 28.09.13
 * Time: 0:44
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "demo.ws.HelloWS")
public class HelloWSImpl implements HelloWS {

    //HelloEjb helloEjb;
    @EJB
    HelloEjb helloEjb;

    @Override
    public String getHelloWorldAsString(@WebParam(name = "arg0", partName = "arg0") String arg0) {
        return "Hello world from WS and ..."+helloEjb.sayHello(arg0);
    }
}
