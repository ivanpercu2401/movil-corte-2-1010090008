import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona")
public class persona extends ABaseEntity{

    @Column(name = "correo", length = 20)
    private String correo;

    @Column(name = "contrasenia", length = 20)
    private String contrasenia;





}

