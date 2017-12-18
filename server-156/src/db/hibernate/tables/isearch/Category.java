package db.hibernate.tables.isearch;

// Generated 2016-4-12 17:44:14 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Category generated by hbm2java
 */
public class Category implements java.io.Serializable {

	private Integer id;
	private String categoryName;
	private Set<UserFavorWords> userFavorWordses = new HashSet<UserFavorWords>(
			0);
	private Set<UserInterestValue> userInterestValues = new HashSet<UserInterestValue>(
			0);
	private Set<GroupToCategory> groupToCategories = new HashSet<GroupToCategory>(
			0);
	private Set<ClickLog> clickLogs = new HashSet<ClickLog>(0);

	public Category() {
	}

	public Category(String categoryName, Set<UserFavorWords> userFavorWordses,
			Set<UserInterestValue> userInterestValues,
			Set<GroupToCategory> groupToCategories, Set<ClickLog> clickLogs) {
		this.categoryName = categoryName;
		this.userFavorWordses = userFavorWordses;
		this.userInterestValues = userInterestValues;
		this.groupToCategories = groupToCategories;
		this.clickLogs = clickLogs;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Set<UserFavorWords> getUserFavorWordses() {
		return this.userFavorWordses;
	}

	public void setUserFavorWordses(Set<UserFavorWords> userFavorWordses) {
		this.userFavorWordses = userFavorWordses;
	}

	public Set<UserInterestValue> getUserInterestValues() {
		return this.userInterestValues;
	}

	public void setUserInterestValues(Set<UserInterestValue> userInterestValues) {
		this.userInterestValues = userInterestValues;
	}

	public Set<GroupToCategory> getGroupToCategories() {
		return this.groupToCategories;
	}

	public void setGroupToCategories(Set<GroupToCategory> groupToCategories) {
		this.groupToCategories = groupToCategories;
	}

	public Set<ClickLog> getClickLogs() {
		return this.clickLogs;
	}

	public void setClickLogs(Set<ClickLog> clickLogs) {
		this.clickLogs = clickLogs;
	}

}
