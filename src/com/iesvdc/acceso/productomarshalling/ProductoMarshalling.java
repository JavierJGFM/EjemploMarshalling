/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesvdc.acceso.productomarshalling;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;



/**
 *
 * @author matinal
 */
public class ProductoMarshalling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JAXBException {
       try { 
        Producto p;
        Producto p2;
        Productos ps;
        
        p= new Producto(0, "nombre", "categoria", "descripcion", "imagen", 0, "unidadesMedidas", 0);
        p2= new Producto(0, "nombre2", "categoria2", "descripcion2", "imagen2", 0, "unidadesMedidas2", 0);

        ps= new Productos();
        ps.addProducto(p);
        ps.addProducto(p2);

        JAXBContext jaxbContext = JAXBContext.newInstance(ps.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            //Marshal the employees list in file
            jaxbMarshaller.marshal(ps, new File("clientes.xml"));
        } catch (JAXBException ex) {
           System.out.println("Error.");
        }
    }
}
