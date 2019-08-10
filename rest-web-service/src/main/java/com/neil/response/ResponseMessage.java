package com.neil.response;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
public class ResponseMessage {
    private long id;
    private String content;

    public ResponseMessage(long incrementAndGet, String format) {
        this.id = incrementAndGet;
        this.content = format;
    }
}
