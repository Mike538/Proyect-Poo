/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.instituto_tecn;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author LUIS
 */
public abstract class Docente1 extends Docentes {
    private int Id;
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String Curp;
    private String Rfc;
    private int IdA;
    private String NombreAs;
    private String Asignatura;
    public Docente1 (int Id, String Nombre, String ApellidoP,String ApellidoM, String Curp, String Rfc, int IdA,String NombreAs, String Asignatura)
    {
        this.Id =  Id;
        this.Nombre =  Nombre;
        this.ApellidoP =  ApellidoP;
        this.ApellidoM =  ApellidoM;
        this.Curp =  Curp;
        this.Rfc =  Rfc;
        this.IdA =  IdA;
        this.NombreAs =  NombreAs;
        this.Asignatura =  Asignatura;
    }
    
    public void darId(int Id)
    {
        Id = Id;
    }
    public void darnombre(String Nombre)
    {
        Nombre = Nombre;
    }
    public String Establecernombre()
    {
        return Nombre;
    }
    public void darApellidoP(String ApellidoP)
    {
        ApellidoP = ApellidoP;
    }
    
    // Este es un método abstracto
      /**
     *
     * @return
     */
    public float importeNomination()
    { 
        return 0;
    }
}

