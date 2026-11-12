package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public final class f4t extends h4t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f17408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17409b;
    public int c;

    @Override // defpackage.h4t
    public int a() {
        return this.f17409b;
    }

    @Override // defpackage.h4t
    public int b(byte[] bArr, int i, int i2) {
        int iF = f();
        if (i2 > iF) {
            i2 = iF;
        }
        if (i2 > 0) {
            System.arraycopy(this.f17408a, this.f17409b, bArr, i, i2);
            c(i2);
        }
        return i2;
    }

    @Override // defpackage.h4t
    public void c(int i) {
        this.f17409b += i;
    }

    @Override // defpackage.h4t
    public void d(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // defpackage.h4t
    public byte[] e() {
        return this.f17408a;
    }

    @Override // defpackage.h4t
    public int f() {
        return this.c - this.f17409b;
    }

    public void h(byte[] bArr) {
        i(bArr, 0, bArr.length);
    }

    public void i(byte[] bArr, int i, int i2) {
        this.f17408a = bArr;
        this.f17409b = i;
        this.c = i + i2;
    }
}
