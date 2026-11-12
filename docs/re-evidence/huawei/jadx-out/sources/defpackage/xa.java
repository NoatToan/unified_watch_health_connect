package defpackage;

import com.fasterxml.jackson.core.JsonEncoding;

/* JADX INFO: loaded from: classes21.dex */
public class xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected byte[] f52641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final xw f52642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected char[] f52643c;
    protected final boolean d;
    protected JsonEncoding e;
    protected char[] f;
    protected byte[] g;
    protected char[] h;
    protected byte[] i;
    protected final Object j;

    public xa(xw xwVar, Object obj, boolean z) {
        this.f52642b = xwVar;
        this.j = obj;
        this.d = z;
    }

    public void a(JsonEncoding jsonEncoding) {
        this.e = jsonEncoding;
    }

    public Object g() {
        return this.j;
    }

    public JsonEncoding f() {
        return this.e;
    }

    public boolean i() {
        return this.d;
    }

    public yh h() {
        return new yh(this.f52642b);
    }

    public byte[] d() {
        b(this.i);
        byte[] bArrB = this.f52642b.b(0);
        this.i = bArrB;
        return bArrB;
    }

    public byte[] a() {
        b(this.g);
        byte[] bArrB = this.f52642b.b(1);
        this.g = bArrB;
        return bArrB;
    }

    public byte[] c() {
        b(this.f52641a);
        byte[] bArrB = this.f52642b.b(3);
        this.f52641a = bArrB;
        return bArrB;
    }

    public char[] b() {
        b((Object) this.h);
        char[] cArrA = this.f52642b.a(0);
        this.h = cArrA;
        return cArrA;
    }

    public char[] d(int i) {
        b((Object) this.h);
        char[] cArrE = this.f52642b.e(0, i);
        this.h = cArrE;
        return cArrE;
    }

    public char[] e() {
        b((Object) this.f52643c);
        char[] cArrA = this.f52642b.a(1);
        this.f52643c = cArrA;
        return cArrA;
    }

    public char[] b(int i) {
        b((Object) this.f);
        char[] cArrE = this.f52642b.e(3, i);
        this.f = cArrE;
        return cArrE;
    }

    public void e(byte[] bArr) {
        if (bArr != null) {
            c(bArr, this.i);
            this.i = null;
            this.f52642b.a(0, bArr);
        }
    }

    public void d(byte[] bArr) {
        if (bArr != null) {
            c(bArr, this.g);
            this.g = null;
            this.f52642b.a(1, bArr);
        }
    }

    public void a(byte[] bArr) {
        if (bArr != null) {
            c(bArr, this.f52641a);
            this.f52641a = null;
            this.f52642b.a(3, bArr);
        }
    }

    public void b(char[] cArr) {
        if (cArr != null) {
            d(cArr, this.h);
            this.h = null;
            this.f52642b.e(0, cArr);
        }
    }

    public void d(char[] cArr) {
        if (cArr != null) {
            d(cArr, this.f52643c);
            this.f52643c = null;
            this.f52642b.e(1, cArr);
        }
    }

    public void e(char[] cArr) {
        if (cArr != null) {
            d(cArr, this.f);
            this.f = null;
            this.f52642b.e(3, cArr);
        }
    }

    protected final void b(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    protected final void c(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw j();
        }
    }

    protected final void d(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw j();
        }
    }

    private IllegalArgumentException j() {
        return new IllegalArgumentException("Trying to release buffer smaller than original");
    }
}
