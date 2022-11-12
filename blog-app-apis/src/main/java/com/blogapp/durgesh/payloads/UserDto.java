package com.blogapp.durgesh.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter

public class UserDto {

	private int id;
	private String name;
	private String email;
	private String password;
	private String about;
}
