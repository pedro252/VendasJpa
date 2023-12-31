package springbootvendas.domain.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table (name = "CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome", length = 100)
    private String nome;

    @OneToMany(mappedBy = "cliente")
    private Set<Pedido> pedidos;

    public Integer getId() {
        return id;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
