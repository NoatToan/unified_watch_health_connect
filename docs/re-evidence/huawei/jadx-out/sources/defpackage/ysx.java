package defpackage;

/* JADX INFO: loaded from: classes46.dex */
public class ysx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f53816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53818c;
    public int d;
    public int e;

    public ysx() {
        this.e = 2400;
        this.f53818c = 380;
        this.f53817b = 48;
        this.d = 800;
        this.f53816a = 200;
    }

    public ysx(int i, int i2, int i3, int i4, int i5) {
        this.e = i;
        this.f53818c = i2;
        this.f53817b = i3;
        this.d = i4;
        this.f53816a = i5;
    }

    public int e() {
        return this.e;
    }

    public int d() {
        return this.f53818c;
    }

    public int c() {
        return this.f53817b;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.f53816a;
    }

    public String toString() {
        return "PositioningParam{seqLen=" + this.e + ", sigProcPeriod=" + this.f53818c + ", pointPerMills=" + this.f53817b + ", sigBeforePoint=" + this.d + ", sigAfterPoint=" + this.f53816a + '}';
    }
}
