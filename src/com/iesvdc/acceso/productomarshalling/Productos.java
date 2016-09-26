/*
*192.168.16.219
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesvdc.acceso.productomarshalling;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author matinal
 */
@XmlRootElement(name = "productos")
@XmlAccessorType (XmlAccessType.FIELD)
public class Productos {
@XmlElement(name= "producto")
private List<Producto> productos;    

    public Productos() {
        this.productos= new ArrayList<Producto>();
    }

    public Productos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void addProducto(Producto p){
        this.productos.add(p);
    }
    
}
