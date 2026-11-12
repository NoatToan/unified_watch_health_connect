package com.nimbusds.jose.shaded.gson.stream;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class MalformedJsonException extends IOException {
    private static final long serialVersionUID = 1;

    public MalformedJsonException(String str) {
        super(str);
    }

    public MalformedJsonException(String str, Throwable th3) {
        super(str, th3);
    }

    public MalformedJsonException(Throwable th3) {
        super(th3);
    }
}
