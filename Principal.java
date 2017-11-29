package figura;

import javax.swing.JOptionPane;

public class Principal {
    public static double suma=0;
    public static void main(String[] args) {
        String msj = "";
        int opc = 0;
        do {
            msj = "Bienvenido\n\nIngrese una opción:\n"
                    + "1. Calcular Area\n2. Calcular Perimetro\n3. Salir";
            opc = Integer.parseInt(JOptionPane.showInputDialog(msj));
            int opc2 = 0;
            msj = "1. Triangulo\n2. Recatangulo\n3. Circulo\n4. Regresar a menú principal";
            switch (opc) {
                case 1:
                    opc2 = Integer.parseInt(JOptionPane.showInputDialog("Calcular area de: \n" + msj));
                    ejecutarMenu(opc2);
                    break;
                case 2:
                    opc2 = Integer.parseInt(JOptionPane.showInputDialog("Calcular perimetro"
                            + " de: \n" + msj));
                    ejecutarMenu(opc2);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Adios");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion válida");
                    break;
            }
        } while (opc != 3);

    }

    public static void ejecutarMenu(int opc) {
        if (opc == 1) {
            switch (opc) {
                case 1:
                    Double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese base del triángulo"));
                    Double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura del triángulo"));
                    Triangulo t = new Triangulo(base,altura);
                    JOptionPane.showMessageDialog(null, "El area del triangulo es es: "+t.area());
                    suma =suma+t.area();
                    break;
                case 2:
                    Double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese lado 1 del rectángulo"));
                    Double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese lado 2 del rectángulo"));
                    Rectangulo r = new Rectangulo(a, b);
                    JOptionPane.showMessageDialog(null, "El area del rectangulo es: "+r.area());
                     suma =suma+r.area();
                    break;
                case 3:
                    Double p =Double.parseDouble(JOptionPane.showInputDialog("Ingrese radio del circulo"));
                    Circulo c = new Circulo(p);
                    JOptionPane.showMessageDialog(null, "El area del circulo es: "+c.area());
                    suma =suma+c.area();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Regresando al menú Principal");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion válida");
                    break;
            }
            while (opc != 4);
        } else {
            switch (opc) {
                case 1:
                    Double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese base del triángulo"));
                    Double ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese lado 1 del triángulo"));
                    Double ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese lado 2 del triángulo"));
                    Triangulo t = new Triangulo(base,ladoA,ladoB);
                    JOptionPane.showMessageDialog(null, "El perimetro del triangulo es es: "+t.perimetro());
                     suma =suma+t.perimetro();
                    break;
                case 2:
                    Double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese lado 1 del rectángulo"));
                    Double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese lado 2 del rectángulo"));
                    Rectangulo r = new Rectangulo(a,b);
                    JOptionPane.showMessageDialog(null, "El perimetro del rectangulo es: "+r.perimetro());
                     suma =suma+r.perimetro();
                    break;
                case 3:
                    Double p =Double.parseDouble(JOptionPane.showInputDialog("Ingrese radio del circulo"));
                    Circulo c = new Circulo(p);
                    JOptionPane.showMessageDialog(null, "El perimetro del circulo es: "+c.perimetro());
                     suma =suma+c.perimetro();
                   
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Regresando al menú Principal");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion válida");
                    break;
            }
            while (opc != 4);
        }

    }

}
