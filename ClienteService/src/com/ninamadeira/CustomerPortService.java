
package com.ninamadeira;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CustomerPortService", targetNamespace = "http://ninamadeira.com.br", wsdlLocation = "http://localhost:8080/ws/customers.wsdl")
public class CustomerPortService
    extends Service
{

    private final static URL CUSTOMERPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException CUSTOMERPORTSERVICE_EXCEPTION;
    private final static QName CUSTOMERPORTSERVICE_QNAME = new QName("http://ninamadeira.com.br", "CustomerPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ws/customers.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CUSTOMERPORTSERVICE_WSDL_LOCATION = url;
        CUSTOMERPORTSERVICE_EXCEPTION = e;
    }

    public CustomerPortService() {
        super(__getWsdlLocation(), CUSTOMERPORTSERVICE_QNAME);
    }

    public CustomerPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CUSTOMERPORTSERVICE_QNAME, features);
    }

    public CustomerPortService(URL wsdlLocation) {
        super(wsdlLocation, CUSTOMERPORTSERVICE_QNAME);
    }

    public CustomerPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CUSTOMERPORTSERVICE_QNAME, features);
    }

    public CustomerPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CustomerPort
     */
    @WebEndpoint(name = "CustomerPortSoap11")
    public CustomerPort getCustomerPortSoap11() {
        return super.getPort(new QName("http://ninamadeira.com.br", "CustomerPortSoap11"), CustomerPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerPort
     */
    @WebEndpoint(name = "CustomerPortSoap11")
    public CustomerPort getCustomerPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://ninamadeira.com.br", "CustomerPortSoap11"), CustomerPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CUSTOMERPORTSERVICE_EXCEPTION!= null) {
            throw CUSTOMERPORTSERVICE_EXCEPTION;
        }
        return CUSTOMERPORTSERVICE_WSDL_LOCATION;
    }

}
