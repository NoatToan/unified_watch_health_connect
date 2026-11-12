package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40113b;
    public int c;
    public int d;
    public int e;
    public int f;

    public yet(int i, int i2, int i3, int i4) {
        this.f40112a = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public int a() {
        return this.c;
    }

    public String toString() {
        return "[[[ " + yet.class.getSimpleName() + " ]]]\n  connIntMin: " + ((int) (((double) this.f40112a) * 1.25d)) + "ms\n  connIntMax: " + ((int) (((double) this.c) * 1.25d)) + "ms\n     latency: " + this.d + "ms\n     timeout: " + (this.e * 10) + "ms\n     connInt: " + ((int) (((double) this.f40113b) * 1.25d)) + "ms\n      advInt: " + ((int) (((double) this.f) * 0.625d)) + "ms";
    }
}
