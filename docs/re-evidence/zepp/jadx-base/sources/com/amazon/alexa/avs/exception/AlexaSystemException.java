package com.amazon.alexa.avs.exception;

import com.amazon.alexa.avs.log.Logger;
import com.amazon.alexa.avs.log.LoggerFactory;

/* JADX INFO: loaded from: classes2.dex */
public class AlexaSystemException extends AVSException {
    private static final Logger log = LoggerFactory.getLogger(AlexaSystemException.class);
    private AlexaSystemExceptionCode exceptionCode;
    private final String rawCode;

    public AlexaSystemException(String str, String str2) {
        super(str2);
        this.rawCode = str;
        try {
            this.exceptionCode = AlexaSystemExceptionCode.valueOf(str);
        } catch (IllegalArgumentException unused) {
            log.warn(String.format("Received AlexaSystemException with unrecognized code %s.", str));
        }
    }

    public String getDescription() {
        return getMessage();
    }

    public AlexaSystemExceptionCode getExceptionCode() {
        return this.exceptionCode;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "" + this.rawCode + ": " + getMessage();
    }
}
