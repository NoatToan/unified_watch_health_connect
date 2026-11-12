package com.xmlywind.volley;

/* JADX INFO: loaded from: classes22.dex */
public class s extends Exception {
    public final i a;
    private long b;

    public s() {
        this.a = null;
    }

    public s(i iVar) {
        this.a = iVar;
    }

    public s(String str) {
        super(str);
        this.a = null;
    }

    public s(Throwable th) {
        super(th);
        this.a = null;
    }

    public long a() {
        return this.b;
    }

    public void a(long j) {
        this.b = j;
    }
}
