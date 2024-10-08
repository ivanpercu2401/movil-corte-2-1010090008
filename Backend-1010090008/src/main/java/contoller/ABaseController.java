
import jakarta.persistence.*;
import java.time.LocalDateTime;


@MappedSuperclass
public abstract class ABaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "state", nullable = true)
    private Boolean state;

    @Column(name = "created_at", nullable = true)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = true)
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at", nullable = true)
    private LocalDateTime deletedAt;

    @Column(name = "created_by", nullable = true)
    private Long createdBy;

    @Column(name = "updated_by", nullable = true)
    private Long updatedBy;

    @Column(name = "deleted_by", nullable = true)
    private Long deletedBy;