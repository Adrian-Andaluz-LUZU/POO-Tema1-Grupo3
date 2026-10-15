public class Principal {
    public static void main(String[] args) {
        // 4 y 5. Instanciar tres objetos de tipo Estudiante y asignarles valores diferentes
        Estudiante est1 = new Estudiante("Adrián", "Andaluz", 19, "Ingeniería en Software", 1);
        Estudiante est2 = new Estudiante("Mateo", "Salazar", 19, "Ingeniería en Software", 1);
        Estudiante est3 = new Estudiante("Emily", "Pérez", 19, "Ingeniería en Software", 1);

        System.out.println("=== REGISTRO DE ESTUDIANTES - UNIVERSIDAD TÉCNICA DE AMBATO ===");

        // 6. Presentar la información utilizando System.out.println (a través del método)
        est1.mostrarInformacion();
        est2.mostrarInformacion();
        est3.mostrarInformacion();
    }
}