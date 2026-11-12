package com.miot.spec.exception;

/* JADX INFO: loaded from: classes.dex */
public class ProtocolVersionIsLowException extends SpecException {
    public ProtocolVersionIsLowException() {
        super(-1015, "app protocol version is less than firmware protocol version,you need update App");
    }
}
