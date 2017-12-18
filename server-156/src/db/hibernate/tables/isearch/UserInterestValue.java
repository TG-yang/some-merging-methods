package db.hibernate.tables.isearch;

// Generated 2016-4-12 17:44:14 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * UserInterestValue generated by hbm2java
 */
public class UserInterestValue implements java.io.Serializable {

	private Integer id;
	private User user;
	private Category category;
	private Double value;
	private Date date;

	public UserInterestValue() {
	}

	public UserInterestValue(User user, Category category, Double value,
			Date date) {
		this.user = user;
		this.category = category;
		this.value = value;
		this.date = date;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Double getValue() {
		return this.value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
