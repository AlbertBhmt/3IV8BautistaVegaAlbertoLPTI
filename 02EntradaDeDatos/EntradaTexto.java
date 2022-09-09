//Esto es un comentario
/* 
Todo programa en java debe de tener el nombre de
la clase tal cual como el archivo
*/

class EntradaTexto {
    // los limites de la clase

    // toda la clase debe tener un metodo principal
    /*
     * vamos a realizar un programa mediante el cual podamos introducir texto a
     * nuestra conveniencia
     */
    // el ; es el fin de linea

    // metodo principal
    public static void main(String[] args) {
        // tipo de dato
        String nombre;
        // instancia
        System.out.println("Introduce tu nombre");
        // vamos a obtener el nombre del usuario
        nombre = System.console().readLine();
        System.out.println("Hola " + nombre + " Bienvenido a tu programa");
    }
}