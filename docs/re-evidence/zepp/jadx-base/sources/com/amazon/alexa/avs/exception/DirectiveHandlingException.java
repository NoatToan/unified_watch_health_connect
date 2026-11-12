package com.amazon.alexa.avs.exception;

/* JADX INFO: loaded from: classes2.dex */
public class DirectiveHandlingException extends Exception {
    private ExceptionType type;

    public enum ExceptionType {
        UNEXPECTED_INFORMATION_RECEIVED,
        UNSUPPORTED_OPERATION,
        INTERNAL_ERROR
    }

    public DirectiveHandlingException(ExceptionType exceptionType, String str) {
        super(str);
        this.type = exceptionType;
    }

    public ExceptionType getType() {
        return this.type;
    }
}
