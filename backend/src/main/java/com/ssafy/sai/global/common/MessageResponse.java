package com.ssafy.sai.global.common;

public class MessageResponse {
    private int code;
    private String message;

    public MessageResponse() {

    }
    public MessageResponse(int code, String message){
        this.code = code;
        this.message = message;
    }
}