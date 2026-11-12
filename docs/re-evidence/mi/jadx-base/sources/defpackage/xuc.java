package defpackage;

import com.fasterxml.jackson.core.JsonEncoding;

/* JADX INFO: loaded from: classes4.dex */
public class xuc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JsonEncoding f39478b;
    public final boolean c;
    public final x53 d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public char[] h;
    public char[] i;
    public char[] j;

    public xuc(x53 x53Var, Object obj, boolean z) {
        this.d = x53Var;
        this.f39477a = obj;
        this.c = z;
    }

    public final void a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw v();
        }
    }

    public final void c(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw v();
        }
    }

    public byte[] d() {
        a(this.g);
        byte[] bArrA = this.d.a(3);
        this.g = bArrA;
        return bArrA;
    }

    public char[] e() {
        a(this.i);
        char[] cArrC = this.d.c(1);
        this.i = cArrC;
        return cArrC;
    }

    public char[] f(int i) {
        a(this.j);
        char[] cArrD = this.d.d(3, i);
        this.j = cArrD;
        return cArrD;
    }

    public byte[] g() {
        a(this.e);
        byte[] bArrA = this.d.a(0);
        this.e = bArrA;
        return bArrA;
    }

    public char[] h() {
        a(this.h);
        char[] cArrC = this.d.c(0);
        this.h = cArrC;
        return cArrC;
    }

    public char[] i(int i) {
        a(this.h);
        char[] cArrD = this.d.d(0, i);
        this.h = cArrD;
        return cArrD;
    }

    public byte[] j() {
        a(this.f);
        byte[] bArrA = this.d.a(1);
        this.f = bArrA;
        return bArrA;
    }

    public o7p k() {
        return new o7p(this.d);
    }

    public JsonEncoding l() {
        return this.f39478b;
    }

    public Object m() {
        return this.f39477a;
    }

    public boolean n() {
        return this.c;
    }

    public void o(byte[] bArr) {
        if (bArr != null) {
            b(bArr, this.g);
            this.g = null;
            this.d.i(3, bArr);
        }
    }

    public void p(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.i);
            this.i = null;
            this.d.j(1, cArr);
        }
    }

    public void q(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.j);
            this.j = null;
            this.d.j(3, cArr);
        }
    }

    public void r(byte[] bArr) {
        if (bArr != null) {
            b(bArr, this.e);
            this.e = null;
            this.d.i(0, bArr);
        }
    }

    public void s(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.h);
            this.h = null;
            this.d.j(0, cArr);
        }
    }

    public void t(byte[] bArr) {
        if (bArr != null) {
            b(bArr, this.f);
            this.f = null;
            this.d.i(1, bArr);
        }
    }

    public void u(JsonEncoding jsonEncoding) {
        this.f39478b = jsonEncoding;
    }

    public final IllegalArgumentException v() {
        return new IllegalArgumentException("Trying to release buffer smaller than original");
    }
}
