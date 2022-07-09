package com.learn.websocketproject.model;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MessageModel {

    private String message;
    private String fromLogin;
}
