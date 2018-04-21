import java.sql.Connection;
import java.sql.Statement;

public class user {

    private Integer id;
    private String Nombre;
    private String Clave;
    private Integer Estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String clave) {
        Clave = clave;
    }

    public Integer getEstado() {
        return Estado;
    }

    public void setEstado(Integer estado) {
        Estado = estado;
    }

    public void insertarUser(Integer _id, String _Nombre, String _Clave, Integer _Estado) throws Exception {
        id= _id;
        Nombre = _Nombre;
        Clave = _Clave;
        Estado = _Estado;
        String Consulta = "insert into User (idUser,Nombre,Clave,Estado) value ("+id.toString()+","+Nombre+","+Clave+","+Estado.toString();
        Connection Conn = svr.getConnection();
        Statement inst = Conn.createStatement();
        inst.execute(Consulta);

        inst.close();
        Conn.close();


    }
}
