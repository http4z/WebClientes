/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloClientes;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author sebas
 */
public class Conexion {
    public Connection conexionBD;
    private final String puerto= "3306";
    private final String bd= "proyecto_final";
    private final String urlConexion = String.format("jdbc:mysql://localhost:3306/db_clientes", bd);
    private final String usuario = "root";
    private final String contra = "root";
    private final String jdbc ="com.mysql.cj.jdbc.Driver";
    
    
    public void abrir_conexion(){
      try{
                Class.forName(jdbc);
                conexionBD = DriverManager.getConnection(urlConexion,usuario,contra);
               
                
            }catch(HeadlessException | ClassNotFoundException | SQLException ex){
                    System.out.println("Error: " + ex.getMessage());
            }
   
      }
      
     public void cerrar_conexion(){
        try{
            conexionBD.close();
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    
     }
    
}

  
    
