import java.util.LinkedList;

import javax.swing.JOptionPane;

public class app {
    static LinkedList <cls_pacientes> pacientes = new LinkedList<>(); //Creacion de la lista de pacientes
    public static void main(String[] args) {
        fnt_menuPrincipal(true);
    }
    private static void fnt_Pacientes(){
        String opcionesPaciente = JOptionPane.showInputDialog(null, "Menu pacientes\n\n1. Registrar\n2. Consultar\n3. Salir");
        if (opcionesPaciente.equals("1")){
            if (opcionesPaciente.equals("1")){
                String nombre = JOptionPane.showInputDialog(null, "Nombre");
                String id = JOptionPane.showInputDialog(null, "Id");
                int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad"));
                String contacto = JOptionPane.showInputDialog(null, "Contacto");
                String historia = JOptionPane.showInputDialog(null, "Historia");
                pacientes.add(new cls_pacientes(nombre, id, edad, contacto, historia));
                JOptionPane.showMessageDialog(null, "Paciente Registrado con exito");
                
        
            }
    
        }

    }
    private static void fnt_menuPrincipal(boolean m){
        while (m == true) {
            String opcionesStr = JOptionPane.showInputDialog(null, "Menu Principal\n\n1. Nuevo Paciente\n2. Nueva cita\n4. Salir");
            
        }
    }
}
