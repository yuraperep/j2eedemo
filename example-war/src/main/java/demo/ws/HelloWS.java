package demo.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.soap.Addressing;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 28.09.13
 * Time: 0:42
 * To change this template use File | Settings | File Templates.
 */
@WebService(name = "HelloWorld", targetNamespace = "http://a.b.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWS {

    @WebMethod
    @WebResult(partName = "return")
    //@Addressing(enabled = true,required = true)
    public String getHelloWorldAsString(@WebParam(name = "arg0", partName = "arg0")   String arg0);
}


