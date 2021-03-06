package db.hibernate.tables.classifier;

// Generated 2015-8-15 4:58:47 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tourism generated by hbm2java
 */
@Entity
@Table(name = "tourism", catalog = "classifier")
public class Tourism implements java.io.Serializable {

	private String word;
	private Integer weight;

	public Tourism() {
	}

	public Tourism(String word) {
		this.word = word;
	}

	public Tourism(String word, Integer weight) {
		this.word = word;
		this.weight = weight;
	}

	@Id
	@Column(name = "word", unique = true, nullable = false)
	public String getWord() {
		return this.word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Column(name = "weight")
	public Integer getWeight() {
		return this.weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

}
