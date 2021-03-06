package cl.backoffice.sidi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "compras_productos")
public class ComprasProductoRelModel {
    @EmbeddedId
    private ComprasProductoPK id;

    private Long cantidad;
    private BigDecimal total;
    private Boolean estado;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private CompraModel compra;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private ProductoModel producto;




}
