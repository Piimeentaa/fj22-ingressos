package br.com.caelum.ingresso.model;

<<<<<<< HEAD
<<<<<<< HEAD
=======
import java.math.BigDecimal;
import java.math.RoundingMode;
>>>>>>> ff1b65a... Adicionando preço e martelando banco
=======

import java.math.BigDecimal;
import java.math.RoundingMode;
>>>>>>> master
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

<<<<<<< HEAD

<<<<<<< HEAD
=======
/**
 * Created by nando on 03/03/17.
 */
>>>>>>> ff1b65a... Adicionando preço e martelando banco
=======
/**
 * Created by nando on 03/03/17.
 */

>>>>>>> master
@Entity
public class Sala {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
<<<<<<< HEAD

	private String nome;

	@OneToMany(fetch = FetchType.EAGER)
	private Set<Lugar> lugares = new HashSet<>();

	private BigDecimal preco = BigDecimal.ZERO;

	/**
	 * @deprecated hibernate only
	 */
	public Sala() {

	}

	public Sala(String nome, BigDecimal preco) {
		this.nome = nome;
		this.preco = preco;
	}

<<<<<<< HEAD
    /**
     * @deprecated hiberna te only
     */
    public Sala() {
=======
	public BigDecimal getPreco() {
		return preco.setScale(2, RoundingMode.HALF_UP);
	}
>>>>>>> ff1b65a... Adicionando preço e martelando banco

	public void setPreco(BigDecimal preco) {
		this.preco = preco;

	}

	// getters e setters e demais métodos

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

=======

	private String nome;

	@OneToMany(fetch = FetchType.EAGER)
	private Set<Lugar> lugares = new HashSet<>();

	private BigDecimal preco = BigDecimal.ZERO;

	/**
	 * @deprecated hibernate only
	 */
	public Sala() {

	}

	public Sala(String nome, BigDecimal preco) {
		this.nome = nome;
		this.preco = preco;
	}


	public BigDecimal getPreco() {
		return preco.setScale(2, RoundingMode.HALF_UP);
	}

    /**
     * @deprecated hiberna te only
     */
  

	public void setPreco(BigDecimal preco) {
		this.preco = preco;

	}

	// getters e setters e demais métodos

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

>>>>>>> master
	public void add(Lugar lugar) {
		this.lugares.add(lugar);
	}

	public Set<Lugar> getLugares() {
		return lugares;
	}

	public void setLugares(Set<Lugar> lugares) {
		this.lugares = lugares;
	}

	public Map<String, List<Lugar>> getMapaDeLugares() {
		if (!this.lugares.isEmpty()) {
			return this.lugares.stream().collect(Collectors.groupingBy(Lugar::getFileira, Collectors.toList()));
		}
		return Collections.emptyMap();
	}

	public Integer lugar(String fileira, Integer posicao) {
		Optional<Lugar> optional = this.lugares.stream()
				.filter((x) -> fileira.equals(x.getFileira()) && posicao.equals(x.getPosicao())).findFirst();
		return optional.get().getId();
	}
}
