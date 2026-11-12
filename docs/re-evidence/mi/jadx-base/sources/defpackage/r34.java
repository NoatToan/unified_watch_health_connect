package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class r34 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32130b;
    public final int c;
    public final int d;
    public int e = -1;

    public r34(int i, int i2, int i3, int i4) {
        this.f32129a = i;
        this.f32130b = i2;
        this.c = i3;
        this.d = i4;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.f32130b;
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return this.f32129a;
    }

    public int e() {
        return this.d;
    }

    public int f() {
        return this.f32130b - this.f32129a;
    }

    public boolean g() {
        return h(this.e);
    }

    public boolean h(int i) {
        return i != -1 && this.c == (i % 3) * 3;
    }

    public void i(int i) {
        this.e = i;
    }

    public void j() {
        this.e = ((this.d / 30) * 3) + (this.c / 3);
    }

    public String toString() {
        return this.e + "|" + this.d;
    }
}
