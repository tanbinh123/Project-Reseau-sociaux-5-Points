package com.grokonez.jwtauthentication.message.request;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.validation.constraints.*;

import com.grokonez.jwtauthentication.model.user.ColorName;
import com.grokonez.jwtauthentication.model.user.GenderName;
import com.grokonez.jwtauthentication.model.user.Image;

public class SignUpForm {
	@NotBlank
	@Size(min = 3, max = 50)
	private String name;

	@NotBlank
	@Size(min = 3, max = 50)
	private String username;

	@NotBlank
	@Size(max = 60)
	@Email
	private String email;

	private Set<String> role;

	private List<Image> images;

	@NotBlank
	@Size(min = 6, max = 40)
	private String password;

	private Date birthdate;
	private GenderName gender;
	private String description;
	private ColorName hairColor;
	private ColorName eyesColor;
	private boolean blocked;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<String> getRole() {
		return this.role;
	}

	public void setRole(Set<String> role) {
		this.role = role;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ColorName getHairColor() {
		return hairColor;
	}

	public void setHairColor(ColorName hairColor) {
		this.hairColor = hairColor;
	}

	public ColorName getEyesColor() {
		return eyesColor;
	}

	public void setEyesColor(ColorName eyesColor) {
		this.eyesColor = eyesColor;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public GenderName getGender() {
		return gender;
	}

	public void setGender(GenderName gender) {
		this.gender = gender;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

}