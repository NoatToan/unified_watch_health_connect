package o6;

/* JADX INFO: loaded from: classes.dex */
public class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f129518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f129519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f129520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f129521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f129522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f129523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f129524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f129525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f129526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f129527j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f129528k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f129529l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f129530m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f129531n;

    @Override // o6.n
    public final float a() {
        boolean z14 = this.f129528k;
        float f14 = this.f129531n;
        return z14 ? -c(f14) : c(f14);
    }

    @Override // o6.n
    public final boolean b() {
        return a() < 1.0E-5f && Math.abs(this.f129526i - this.f129530m) < 1.0E-5f;
    }

    public final float c(float f14) {
        float f15;
        float f16;
        float f17 = this.f129521d;
        if (f14 <= f17) {
            f15 = this.f129518a;
            f16 = this.f129519b;
        } else {
            int i14 = this.f129527j;
            if (i14 == 1) {
                return 0.0f;
            }
            f14 -= f17;
            f17 = this.f129522e;
            if (f14 >= f17) {
                if (i14 == 2) {
                    return 0.0f;
                }
                float f18 = f14 - f17;
                float f19 = this.f129523f;
                if (f18 >= f19) {
                    return 0.0f;
                }
                float f22 = this.f129520c;
                return f22 - ((f18 * f22) / f19);
            }
            f15 = this.f129519b;
            f16 = this.f129520c;
        }
        return (((f16 - f15) * f14) / f17) + f15;
    }

    public final void d(float f14, float f15, float f16, float f17, float f18) {
        this.f129526i = f15;
        if (f14 == 0.0f) {
            f14 = 1.0E-4f;
        }
        float f19 = f14 / f16;
        float f22 = (f19 * f14) / 2.0f;
        if (f14 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f15 - ((((-f14) / f16) * f14) / 2.0f)) * f16);
            if (fSqrt < f17) {
                this.f129527j = 2;
                this.f129518a = f14;
                this.f129519b = fSqrt;
                this.f129520c = 0.0f;
                float f24 = (fSqrt - f14) / f16;
                this.f129521d = f24;
                this.f129522e = fSqrt / f16;
                this.f129524g = ((f14 + fSqrt) * f24) / 2.0f;
                this.f129525h = f15;
                this.f129526i = f15;
                return;
            }
            this.f129527j = 3;
            this.f129518a = f14;
            this.f129519b = f17;
            this.f129520c = f17;
            float f25 = (f17 - f14) / f16;
            this.f129521d = f25;
            float f26 = f17 / f16;
            this.f129523f = f26;
            float f27 = ((f14 + f17) * f25) / 2.0f;
            float f28 = (f26 * f17) / 2.0f;
            this.f129522e = ((f15 - f27) - f28) / f17;
            this.f129524g = f27;
            this.f129525h = f15 - f28;
            this.f129526i = f15;
            return;
        }
        if (f22 >= f15) {
            this.f129527j = 1;
            this.f129518a = f14;
            this.f129519b = 0.0f;
            this.f129524g = f15;
            this.f129521d = (2.0f * f15) / f14;
            return;
        }
        float f29 = f15 - f22;
        float f34 = f29 / f14;
        if (f34 + f19 < f18) {
            this.f129527j = 2;
            this.f129518a = f14;
            this.f129519b = f14;
            this.f129520c = 0.0f;
            this.f129524g = f29;
            this.f129525h = f15;
            this.f129521d = f34;
            this.f129522e = f19;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f14 * f14) / 2.0f) + (f16 * f15));
        float f35 = (fSqrt2 - f14) / f16;
        this.f129521d = f35;
        float f36 = fSqrt2 / f16;
        this.f129522e = f36;
        if (fSqrt2 < f17) {
            this.f129527j = 2;
            this.f129518a = f14;
            this.f129519b = fSqrt2;
            this.f129520c = 0.0f;
            this.f129521d = f35;
            this.f129522e = f36;
            this.f129524g = ((f14 + fSqrt2) * f35) / 2.0f;
            this.f129525h = f15;
            return;
        }
        this.f129527j = 3;
        this.f129518a = f14;
        this.f129519b = f17;
        this.f129520c = f17;
        float f37 = (f17 - f14) / f16;
        this.f129521d = f37;
        float f38 = f17 / f16;
        this.f129523f = f38;
        float f39 = ((f14 + f17) * f37) / 2.0f;
        float f44 = (f38 * f17) / 2.0f;
        this.f129522e = ((f15 - f39) - f44) / f17;
        this.f129524g = f39;
        this.f129525h = f15 - f44;
        this.f129526i = f15;
    }

    @Override // o6.n
    public final float getInterpolation(float f14) {
        float f15;
        float f16 = this.f129521d;
        if (f14 <= f16) {
            float f17 = this.f129518a;
            f15 = ((((this.f129519b - f17) * f14) * f14) / (f16 * 2.0f)) + (f17 * f14);
        } else {
            int i14 = this.f129527j;
            if (i14 == 1) {
                f15 = this.f129524g;
            } else {
                float f18 = f14 - f16;
                float f19 = this.f129522e;
                if (f18 < f19) {
                    float f22 = this.f129524g;
                    float f24 = this.f129519b;
                    f15 = ((((this.f129520c - f24) * f18) * f18) / (f19 * 2.0f)) + (f24 * f18) + f22;
                } else if (i14 == 2) {
                    f15 = this.f129525h;
                } else {
                    float f25 = f18 - f19;
                    float f26 = this.f129523f;
                    if (f25 <= f26) {
                        float f27 = this.f129525h;
                        float f28 = this.f129520c * f25;
                        f15 = (f27 + f28) - ((f28 * f25) / (f26 * 2.0f));
                    } else {
                        f15 = this.f129526i;
                    }
                }
            }
        }
        this.f129530m = f15;
        this.f129531n = f14;
        boolean z14 = this.f129528k;
        float f29 = this.f129529l;
        return z14 ? f29 - f15 : f29 + f15;
    }
}
