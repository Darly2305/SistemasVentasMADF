package Modelo;

public class login {
    private int id;
    private String nombre , correo , pass;

    public login(){ //constructor vacio

    }

    public login(int _id , String _nombre , String _correo , String _pass){
        this.id = _id;
        this.nombre = _nombre;
        this.correo = _correo;
        this.pass = _pass;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPass() {
        return pass;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
}
