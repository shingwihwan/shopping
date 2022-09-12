package com.shin.shopping.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberSaveDto {
    private String userName;
    private String password;
    private String nickName;
    private String birthday;
    private String gender;
    private String phoneNum;
    private String email;
    private String address;
}
