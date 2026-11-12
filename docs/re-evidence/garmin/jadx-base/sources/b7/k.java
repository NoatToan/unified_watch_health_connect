package b7;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k f16266k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f16269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f16270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f16271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f16272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f16273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f16274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f16275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f16276j;

    static {
        float fC = (float) ((((double) b.c()) * 63.66197723675813d) / 100.0d);
        float[] fArr = b.f16236c;
        float f14 = fArr[0];
        float[][] fArr2 = b.f16234a;
        float[] fArr3 = fArr2[0];
        float f15 = fArr3[0] * f14;
        float f16 = fArr[1];
        float f17 = (fArr3[1] * f16) + f15;
        float f18 = fArr[2];
        float f19 = (fArr3[2] * f18) + f17;
        float[] fArr4 = fArr2[1];
        float f22 = (fArr4[2] * f18) + (fArr4[1] * f16) + (fArr4[0] * f14);
        float[] fArr5 = fArr2[2];
        float f24 = (f18 * fArr5[2]) + (f16 * fArr5[1]) + (f14 * fArr5[0]);
        float f25 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fC) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d14 = fExp;
        if (d14 > 1.0d) {
            fExp = 1.0f;
        } else if (d14 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f19) * fExp) + 1.0f) - fExp, (((100.0f / f22) * fExp) + 1.0f) - fExp, (((100.0f / f24) * fExp) + 1.0f) - fExp};
        float f26 = 1.0f / ((5.0f * fC) + 1.0f);
        float f27 = f26 * f26 * f26 * f26;
        float f28 = 1.0f - f27;
        float fCbrt = (0.1f * f28 * f28 * ((float) Math.cbrt(((double) fC) * 5.0d))) + (f27 * fC);
        float fC2 = b.c() / fArr[1];
        double d15 = fC2;
        float fSqrt = ((float) Math.sqrt(d15)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d15, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f19)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f22)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f24)) / 100.0d, 0.42d)};
        float f29 = fArr7[0];
        float f34 = (f29 * 400.0f) / (f29 + 27.13f);
        float f35 = fArr7[1];
        float f36 = (f35 * 400.0f) / (f35 + 27.13f);
        float f37 = fArr7[2];
        float[] fArr8 = {f34, f36, (400.0f * f37) / (f37 + 27.13f)};
        f16266k = new k(fC2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f25, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    private k(float f14, float f15, float f16, float f17, float f18, float f19, float[] fArr, float f22, float f24, float f25) {
        this.f16272f = f14;
        this.f16267a = f15;
        this.f16268b = f16;
        this.f16269c = f17;
        this.f16270d = f18;
        this.f16271e = f19;
        this.f16273g = fArr;
        this.f16274h = f22;
        this.f16275i = f24;
        this.f16276j = f25;
    }
}
