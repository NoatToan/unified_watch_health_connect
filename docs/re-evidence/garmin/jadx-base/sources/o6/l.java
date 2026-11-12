package o6;

/* JADX INFO: loaded from: classes.dex */
public class l implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f129509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f129510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f129511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f129512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f129513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f129514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f129515h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f129508a = 0.5d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f129516i = 0;

    @Override // o6.n
    public final float a() {
        return 0.0f;
    }

    @Override // o6.n
    public final boolean b() {
        double d14 = ((double) this.f129512e) - this.f129510c;
        double d15 = this.f129509b;
        double d16 = this.f129513f;
        return Math.sqrt((((d15 * d14) * d14) + ((d16 * d16) * ((double) this.f129514g))) / d15) <= ((double) this.f129515h);
    }

    @Override // o6.n
    public final float getInterpolation(float f14) {
        double d14 = f14 - this.f129511d;
        if (d14 > 0.0d) {
            double d15 = this.f129509b;
            double d16 = this.f129508a;
            int iSqrt = (int) ((9.0d / ((Math.sqrt(d15 / ((double) this.f129514g)) * d14) * 4.0d)) + 1.0d);
            double d17 = d14 / ((double) iSqrt);
            int i14 = 0;
            while (i14 < iSqrt) {
                float f15 = this.f129512e;
                double d18 = f15;
                double d19 = this.f129510c;
                double d24 = d17;
                float f16 = this.f129513f;
                double d25 = f16;
                double d26 = ((-d15) * (d18 - d19)) - (d16 * d25);
                double d27 = this.f129514g;
                double d28 = (((d26 / d27) * d24) / 2.0d) + d25;
                double d29 = ((((-((((d24 * d28) / 2.0d) + d18) - d19)) * d15) - (d28 * d16)) / d27) * d24;
                float f17 = f16 + ((float) d29);
                this.f129513f = f17;
                float f18 = f15 + ((float) (((d29 / 2.0d) + d25) * d24));
                this.f129512e = f18;
                int i15 = this.f129516i;
                if (i15 > 0) {
                    if (f18 < 0.0f && (i15 & 1) == 1) {
                        this.f129512e = -f18;
                        this.f129513f = -f17;
                    }
                    float f19 = this.f129512e;
                    if (f19 > 1.0f && (i15 & 2) == 2) {
                        this.f129512e = 2.0f - f19;
                        this.f129513f = -this.f129513f;
                    }
                }
                i14++;
                d17 = d24;
            }
        }
        this.f129511d = f14;
        if (b()) {
            this.f129512e = (float) this.f129510c;
        }
        return this.f129512e;
    }
}
