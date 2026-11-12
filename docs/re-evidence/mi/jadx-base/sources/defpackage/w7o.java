package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class w7o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f37698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f37699b;

    public w7o(float f, float f2) {
        double d = f2;
        this.f37699b = Math.pow(6.283185307179586d / d, 2.0d);
        this.f37698a = (((double) f) * 12.566370614359172d) / d;
    }

    public double a(double d, float f, double d2, double d3) {
        double d4 = f;
        return (d * (1.0d - (this.f37698a * d4))) + ((double) ((float) (this.f37699b * (d2 - d3) * d4)));
    }
}
