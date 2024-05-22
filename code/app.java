import java.util.LinkedList;

import javax.swing.JOptionPane;

public class app {
    static LinkedList <cls_pacientes> pacientes = new LinkedList<>(); //Creacion de la lista de pacientes
    public static void main(String[] args) {
        fnt_menuPrincipal(true);
    }
    private static void fnt_Pacientes(boolean mp){
        while (mp == true) {
            String opcionesPac = JOptionPane.showInputDialog(null, "Menu pacientes\n\n1. Registrar\n2. Consultar\n3. Salir");
            if (opcionesPac.equals("1")){
                boolean sw = false;
                String id = JOptionPane.showInputDialog(null, "Id");
                for (int i = 0; i <pacientes.size(); i++){
                    if (pacientes.get(i).getIdStr().equals(id)){
                        sw = true;
                        break;
                    }   
                }
                if (sw == false){
                    String nombre = JOptionPane.showInputDialog(null, "Nombre");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad"));
                    String contacto = JOptionPane.showInputDialog(null, "Contacto");
                    String historia = JOptionPane.showInputDialog(null, "Historia");
                    pacientes.add(new cls_pacientes(nombre, id, edad, contacto, historia));
                    JOptionPane.showMessageDialog(null, "Paciente Registrado con exito");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Este paciente ya se encuentra registrado");
                }
            }
            if (opcionesPac.equals("2")){
                boolean sw = false;
                int pos = 0;
                String id = JOptionPane.showInputDialog(null, "Id");
                for (int i = 0; i <pacientes.size(); i++){
                    if (pacientes.get(i).getIdStr().equals(id)){
                        sw = true;
                        pos = i;
                        break;
                    }
                }
            
                if (sw == true){
                    JOptionPane.showMessageDialog(null,
                    "Nombre: " + pacientes.get(pos).getNombreStr() + 
                    "\n Edad " + pacientes.get(pos).getEdadInt() + 
                    "\n Contacto: " + pacientes.get(pos).getContactoStr() +
                    "\n Historia: " + pacientes.get(pos).getHistoriaStr());
                }
                else{
                
                    JOptionPane.showMessageDialog(null, "Este paciente no se encuentra registrado");
                }
            }
            if (opcionesPac.equals("3")){
                mp = false;
            }
            
        }
    }

        

    private static void fnt_menuPrincipal(boolean m){
        while (m == true) {
            String opcionesStr = JOptionPane.showInputDialog(null, "Menu Principal\n\n1. Nuevo Paciente\n2. Nueva cita\n3. Reporte\n4. Salir");
            if (opcionesStr.equals("1")){
                fnt_Pacientes(true);
            }
        }
    }
}
