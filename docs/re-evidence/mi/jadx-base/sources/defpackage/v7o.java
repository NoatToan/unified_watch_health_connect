package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class v7o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f36596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f36597b;

    public v7o(float f, float f2) {
        double d = f2;
        this.f36597b = Math.pow(6.283185307179586d / d, 2.0d);
        this.f36596a = (((double) f) * 12.566370614359172d) / d;
    }

    public double a(double d, double d2, double d3, double d4) {
        return (d * (1.0d - (this.f36596a * d2))) + ((double) ((float) (this.f36597b * (d3 - d4) * d2)));
    }
}
