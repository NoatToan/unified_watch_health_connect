package com.amazon.alexa.avs.message.request.system;

import com.amazon.alexa.avs.exception.DirectiveHandlingException;
import com.amazon.alexa.avs.message.Payload;

/* JADX INFO: loaded from: classes2.dex */
public class ExceptionEncounteredPayload extends Payload {
    private ErrorStructure error;
    private String unparsedDirective;

    public static class ErrorStructure {
        private String message;
        private DirectiveHandlingException.ExceptionType type;

        public ErrorStructure(DirectiveHandlingException.ExceptionType exceptionType, String str) {
            this.type = exceptionType;
            this.message = str;
        }

        public String getMessage() {
            return this.message;
        }

        public DirectiveHandlingException.ExceptionType getType() {
            return this.type;
        }
    }

    public ExceptionEncounteredPayload(String str, DirectiveHandlingException.ExceptionType exceptionType, String str2) {
        this.unparsedDirective = str;
        this.error = new ErrorStructure(exceptionType, str2);
    }

    public ErrorStructure getError() {
        return this.error;
    }

    public String getUnparsedDirective() {
        return this.unparsedDirective;
    }
}
