public class Estudiante {
    // 2. Definición de los cinco atributos
    String nombre;
    String apellido;
    int edad;
    String carrera;
    int semestre;

    // Constructor opcional para facilitar la asignación de valores
    public Estudiante(String nombre, String apellido, int edad, String carrera, int semestre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    // Método para mostrar la información del estudiante
    public void mostrarInformacion() {
        System.out.println("----------------------------------------");
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
        System.out.println("----------------------------------------");
    }
}