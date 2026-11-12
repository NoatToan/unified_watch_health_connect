package com.xiaomi.mitv.airkan.sdk.impl;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends Exception {
    private int a;

    public g(int i, String str) {
        super(str);
        this.a = -1;
        this.a = i;
    }

    private g(int i, String str, Throwable th) {
        super(str, th);
        this.a = -1;
        this.a = i;
    }

    private g(String str) {
        super(str);
        this.a = -1;
    }

    private g(String str, Throwable th) {
        super(str, th);
        this.a = -1;
    }

    public final int a() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
