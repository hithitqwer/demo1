package com.gravityone.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Demo1Result<T> {

    private Integer errorCode;

    private String msg;

    private T data;

}
