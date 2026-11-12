package defpackage;

/* JADX INFO: loaded from: classes16.dex */
public class qlb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46421c;
    private int d;
    private int e;
    private int h;

    public qlb(int i, int i2) {
        this.h = i;
        this.f46420b = i2;
    }

    public qlc c() {
        return new qlc(this);
    }

    public qlb c(int i, int i2, int i3, int i4) {
        this.d = i;
        this.e = i2;
        this.f46419a = i3;
        this.f46421c = i4;
        return this;
    }

    public int i() {
        return this.h;
    }

    public int e() {
        return this.f46420b;
    }

    public int b() {
        return this.d;
    }

    public int j() {
        return this.e;
    }

    public int d() {
        return this.f46419a;
    }

    public int a() {
        return this.f46421c;
    }
}
