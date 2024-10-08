
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class usuario extends ABaseEntity{

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "apellido", length = 50)
    private String apellido;

    @Column(name = "correo", length = 20)
    private String correo;

    @Column(name = "direccion", length = 20)
    private String direccion;

    @Column(name = "telefono", length = 20)
    private String telefono;

    @Column(name = "contrasenia", length = 20)
    private String contrasenia;







}
