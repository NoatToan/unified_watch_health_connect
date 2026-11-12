package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class ydt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40084b;
    public byte[] c;

    public int a() {
        return this.f40084b;
    }

    public void b(int i) {
        this.f40084b = i;
    }

    public void c(byte[] bArr) {
        this.c = bArr;
    }

    public void d(int i) {
        this.f40083a = i;
    }

    public byte[] e() {
        return this.c;
    }

    public int f() {
        return this.f40083a;
    }

    public String toString() {
        return "{version=" + this.f40083a + ", algorithm=" + this.f40084b + ", publicKeyHash=" + tet.x(this.c) + AbstractJsonLexerKt.END_OBJ;
    }
}
