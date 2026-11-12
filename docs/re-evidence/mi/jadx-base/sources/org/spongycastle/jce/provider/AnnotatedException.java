package org.spongycastle.jce.provider;

/* JADX INFO: loaded from: classes3.dex */
public class AnnotatedException extends Exception {
    private Throwable _underlyingException;

    public AnnotatedException(String str, Throwable th) {
        super(str);
        this._underlyingException = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this._underlyingException;
    }

    public Throwable getUnderlyingException() {
        return this._underlyingException;
    }

    public AnnotatedException(String str) {
        this(str, null);
    }
}
