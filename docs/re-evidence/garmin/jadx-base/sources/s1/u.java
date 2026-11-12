package s1;

import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\nB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ls1/u;", "", "", "arcModes", "", "timePoints", "", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "<init>", "([I[F[[F)V", "a", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[][] f155789a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BA\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ls1/u$a;", "", "", "mode", "", "time1", "time2", "x1", "y1", "x2", "y2", "<init>", "(IFFFFFF)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f155790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f155791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f155792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f155793d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f155794e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f155795f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f155796g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f155797h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f155798i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float[] f155799j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final float f155800k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final float f155801l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final float f155802m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final float f155803n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final float f155804o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f155805p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final float f155806q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final float f155807r;

        public a(int i14, float f14, float f15, float f16, float f17, float f18, float f19) {
            boolean z14;
            int i15;
            float f22;
            float[] fArr;
            this.f155790a = f14;
            this.f155791b = f15;
            this.f155792c = f16;
            this.f155793d = f17;
            this.f155794e = f18;
            this.f155795f = f19;
            float f24 = f18 - f16;
            float f25 = f19 - f17;
            float f26 = 0.0f;
            int i16 = 1;
            boolean z15 = i14 == 1 || (i14 == 4 ? f25 > 0.0f : !(i14 != 5 || f25 >= 0.0f));
            float f27 = z15 ? -1.0f : 1.0f;
            this.f155802m = f27;
            float f28 = 1 / (f15 - f14);
            this.f155800k = f28;
            float[] fArr2 = new float[101];
            this.f155799j = fArr2;
            boolean z16 = i14 == 3;
            if (z16 || Math.abs(f24) < 0.001f || Math.abs(f25) < 0.001f) {
                float fHypot = (float) Math.hypot(f25, f24);
                this.f155796g = fHypot;
                this.f155801l = fHypot * f28;
                this.f155806q = f24 * f28;
                this.f155807r = f25 * f28;
                this.f155803n = Float.NaN;
                this.f155804o = Float.NaN;
                z14 = true;
            } else {
                this.f155803n = f24 * f27;
                this.f155804o = f25 * (-f27);
                this.f155806q = z15 ? f18 : f16;
                this.f155807r = z15 ? f17 : f19;
                float f29 = f18 - f16;
                float f34 = f17 - f19;
                float f35 = 90;
                float f36 = f34;
                float fHypot2 = 0.0f;
                float f37 = 0.0f;
                int i17 = 1;
                while (true) {
                    i15 = i16;
                    float f38 = f36;
                    double radians = (float) Math.toRadians((((double) i17) * 90.0d) / ((double) 90));
                    float fSin = ((float) Math.sin(radians)) * f29;
                    float fCos = ((float) Math.cos(radians)) * f34;
                    f22 = f26;
                    fHypot2 += (float) Math.hypot(fSin - f37, fCos - f38);
                    fArr = v.f155814a;
                    fArr[i17] = fHypot2;
                    if (i17 == 90) {
                        break;
                    }
                    i17++;
                    f37 = fSin;
                    f26 = f22;
                    f36 = fCos;
                    i16 = i15;
                }
                this.f155796g = fHypot2;
                int i18 = i15;
                while (true) {
                    fArr[i18] = fArr[i18] / fHypot2;
                    if (i18 == 90) {
                        break;
                    } else {
                        i18++;
                    }
                }
                int length = fArr2.length;
                for (int i19 = 0; i19 < length; i19++) {
                    float f39 = i19 / 100.0f;
                    int iBinarySearch = Arrays.binarySearch(fArr, 0, 91, f39);
                    if (iBinarySearch >= 0) {
                        fArr2[i19] = iBinarySearch / f35;
                    } else if (iBinarySearch == -1) {
                        fArr2[i19] = f22;
                    } else {
                        int i24 = -iBinarySearch;
                        int i25 = i24 - 2;
                        float f44 = i25;
                        float f45 = fArr[i25];
                        fArr2[i19] = (((f39 - f45) / (fArr[i24 - 1] - f45)) + f44) / f35;
                    }
                }
                this.f155801l = this.f155796g * this.f155800k;
                z14 = z16;
            }
            this.f155805p = z14;
        }

        public final float a() {
            float f14 = this.f155803n * this.f155798i;
            return f14 * this.f155802m * (this.f155801l / ((float) Math.hypot(f14, (-this.f155804o) * this.f155797h)));
        }

        public final float b() {
            float f14 = this.f155803n * this.f155798i;
            float f15 = (-this.f155804o) * this.f155797h;
            return f15 * this.f155802m * (this.f155801l / ((float) Math.hypot(f14, f15)));
        }

        public final void c(float f14) {
            float f15 = (this.f155802m == -1.0f ? this.f155791b - f14 : f14 - this.f155790a) * this.f155800k;
            float fA = 0.0f;
            if (f15 > 0.0f) {
                fA = 1.0f;
                if (f15 < 1.0f) {
                    float f16 = f15 * 100;
                    int i14 = (int) f16;
                    float[] fArr = this.f155799j;
                    float f17 = fArr[i14];
                    fA = j20.x.a(fArr[i14 + 1], f17, f16 - i14, f17);
                }
            }
            double d14 = fA * 1.5707964f;
            this.f155797h = (float) Math.sin(d14);
            this.f155798i = (float) Math.cos(d14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024 A[PHI: r9
      0x0024: PHI (r9v1 int) = (r9v0 int), (r9v3 int), (r9v4 int) binds: [B:5:0x0014, B:10:0x001d, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    public u(int[] iArr, float[] fArr, float[][] fArr2) {
        int i14;
        int length = fArr.length - 1;
        a[][] aVarArr = new a[length][];
        int i15 = 1;
        int i16 = 1;
        int i17 = 0;
        while (i17 < length) {
            int i18 = iArr[i17];
            int i19 = 3;
            if (i18 == 0) {
                i14 = i19;
            } else if (i18 == 1) {
                i15 = 1;
                i14 = i15;
            } else {
                if (i18 != 2) {
                    if (i18 != 3) {
                        i19 = 4;
                        if (i18 != 4) {
                            i19 = 5;
                            if (i18 != 5) {
                                i14 = i16;
                            } else {
                                i14 = i19;
                            }
                        } else {
                            i14 = i19;
                        }
                    } else {
                        if (i15 != 1) {
                            i15 = 1;
                        }
                        i14 = i15;
                    }
                }
                i15 = 2;
                i14 = i15;
            }
            float[] fArr3 = fArr2[i17];
            int i24 = i17 + 1;
            float[] fArr4 = fArr2[i24];
            float f14 = fArr[i17];
            float f15 = fArr[i24];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            a[] aVarArr2 = new a[length2];
            int i25 = 0;
            while (i25 < length2) {
                int i26 = i25 * 2;
                a[] aVarArr3 = aVarArr2;
                int i27 = i25;
                int i28 = i26 + 1;
                aVarArr3[i27] = new a(i14, f14, f15, fArr3[i26], fArr3[i28], fArr4[i26], fArr4[i28]);
                i25 = i27 + 1;
                aVarArr2 = aVarArr3;
            }
            aVarArr[i17] = aVarArr2;
            i17 = i24;
            i16 = i14;
        }
        this.f155789a = aVarArr;
    }
}
