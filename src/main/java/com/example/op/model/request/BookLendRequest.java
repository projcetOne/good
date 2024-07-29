package com.example.op.model.request;

import lombok.Data;

@Data
public class BookLendRequest {
    private Long bookIds;
    private Long memberId;
}