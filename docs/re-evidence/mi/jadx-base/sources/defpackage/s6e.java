package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class s6e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33344b;
    public int c;
    public short[][][] d;
    public short[][][] e;
    public short[][] f;
    public short[] g;

    public s6e(byte b2, byte b3, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        int i = b2 & 255;
        this.f33343a = i;
        int i2 = b3 & 255;
        this.f33344b = i2;
        this.c = i2 - i;
        this.d = sArr;
        this.e = sArr2;
        this.f = sArr3;
        this.g = sArr4;
    }

    public short[][][] a() {
        return this.d;
    }

    public short[][][] b() {
        return this.e;
    }

    public short[] c() {
        return this.g;
    }

    public short[][] d() {
        return this.f;
    }

    public int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof s6e)) {
            return false;
        }
        s6e s6eVar = (s6e) obj;
        return this.f33343a == s6eVar.f() && this.f33344b == s6eVar.g() && this.c == s6eVar.e() && lbj.k(this.d, s6eVar.a()) && lbj.k(this.e, s6eVar.b()) && lbj.j(this.f, s6eVar.d()) && lbj.i(this.g, s6eVar.c());
    }

    public int f() {
        return this.f33343a;
    }

    public int g() {
        return this.f33344b;
    }

    public int hashCode() {
        return (((((((((((this.f33343a * 37) + this.f33344b) * 37) + this.c) * 37) + vj1.x(this.d)) * 37) + vj1.x(this.e)) * 37) + vj1.w(this.f)) * 37) + vj1.v(this.g);
    }
}
