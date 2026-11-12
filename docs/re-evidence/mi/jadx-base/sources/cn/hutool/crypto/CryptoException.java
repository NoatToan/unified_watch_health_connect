package cn.hutool.crypto;

import defpackage.mf8;
import defpackage.tt3;

/* JADX INFO: loaded from: classes.dex */
public class CryptoException extends RuntimeException {
    private static final long serialVersionUID = 8068509879445395353L;

    public CryptoException(Throwable th) {
        super(mf8.a(th), th);
    }

    public CryptoException(String str) {
        super(str);
    }

    public CryptoException(String str, Object... objArr) {
        super(tt3.y(str, objArr));
    }

    public CryptoException(String str, Throwable th) {
        super(str, th);
    }

    public CryptoException(Throwable th, String str, Object... objArr) {
        super(tt3.y(str, objArr), th);
    }
}
