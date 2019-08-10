package com.neil.response;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseMessage {
    private long id;
    private String content;
}
