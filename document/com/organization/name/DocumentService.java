
package com.organization.name;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "DocumentService", targetNamespace = "http://service.server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DocumentService {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "delete", targetNamespace = "http://service.server/", className = "com.organization.name.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://service.server/", className = "com.organization.name.DeleteResponse")
    public void delete(
        @WebParam(name = "arg0", targetNamespace = "")
        Document arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "save", targetNamespace = "http://service.server/", className = "com.organization.name.Save")
    @ResponseWrapper(localName = "saveResponse", targetNamespace = "http://service.server/", className = "com.organization.name.SaveResponse")
    public void save(
        @WebParam(name = "arg0", targetNamespace = "")
        Document arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.organization.name.Document>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://service.server/", className = "com.organization.name.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://service.server/", className = "com.organization.name.FindAllResponse")
    public List<Document> findAll();

    /**
     * 
     * @param arg0
     * @return
     *     returns com.organization.name.Document
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findById", targetNamespace = "http://service.server/", className = "com.organization.name.FindById")
    @ResponseWrapper(localName = "findByIdResponse", targetNamespace = "http://service.server/", className = "com.organization.name.FindByIdResponse")
    public Document findById(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

}