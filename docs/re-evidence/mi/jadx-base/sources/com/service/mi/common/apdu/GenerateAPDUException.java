package com.service.mi.common.apdu;

/* JADX INFO: loaded from: classes6.dex */
public class GenerateAPDUException extends Exception {
    private static final long serialVersionUID = 1;

    public GenerateAPDUException() {
        super("generate APDU error!");
    }

    public GenerateAPDUException(String str) {
        super(str);
    }

    public GenerateAPDUException(String str, Throwable th) {
        super(str, th);
    }
}
