package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class npm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f43404c;
    private double d;
    private double e;

    public npm(double d, double d2, double d3) {
        this.e = d2;
        this.d = d;
        this.f43404c = d3;
    }

    public double e() {
        return this.e;
    }

    public double b() {
        return this.d;
    }

    public double d() {
        return this.f43404c;
    }

    public String toString() {
        return "SimpleLocation{mLatitude=" + this.e + ", mLongitude=" + this.d + ", mAltitude=" + this.f43404c + '}';
    }
}
