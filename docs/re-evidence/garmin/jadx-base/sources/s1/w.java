package s1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls1/w;", "Ls1/b0;", "", "a", "b", "c", "d", "<init>", "(FFFF)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f155821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f155822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f155823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f155824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f155825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f155826f;

    public w(float f14, float f15, float f16, float f17) {
        int iL;
        this.f155821a = f14;
        this.f155822b = f15;
        this.f155823c = f16;
        this.f155824d = f17;
        if (!((Float.isNaN(f14) || Float.isNaN(f15) || Float.isNaN(f16) || Float.isNaN(f17)) ? false : true)) {
            StringBuilder sbI = v.e0.i("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", f14, ", ", f15, ", ");
            sbI.append(f16);
            sbI.append(", ");
            sbI.append(f17);
            sbI.append('.');
            x0.a(sbI.toString());
        }
        float[] fArr = new float[5];
        float f18 = (f15 - 0.0f) * 3.0f;
        float f19 = (f17 - f15) * 3.0f;
        float f22 = (1.0f - f17) * 3.0f;
        double d14 = f18;
        double d15 = f19;
        double d16 = f22;
        double d17 = d15 * 2.0d;
        double d18 = (d14 - d17) + d16;
        if (d18 == 0.0d) {
            iL = d15 == d16 ? 0 : o4.l1.l(fArr, (float) ((d17 - d16) / (d17 - (d16 * 2.0d))), 0);
        } else {
            double d19 = -Math.sqrt((d15 * d15) - (d16 * d14));
            double d24 = (-d14) + d15;
            int iL2 = o4.l1.l(fArr, (float) ((-(d19 + d24)) / d18), 0);
            int iL3 = o4.l1.l(fArr, (float) ((d19 - d24) / d18), iL2) + iL2;
            if (iL3 > 1) {
                float f24 = fArr[0];
                float f25 = fArr[1];
                if (f24 > f25) {
                    fArr[0] = f25;
                    fArr[1] = f24;
                } else if (f24 == f25) {
                    iL = iL3 - 1;
                }
                iL = iL3;
            } else {
                iL = iL3;
            }
        }
        float f26 = (f19 - f18) * 2.0f;
        int iL4 = o4.l1.l(fArr, (-f26) / (((f22 - f19) * 2.0f) - f26), iL) + iL;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i14 = 0; i14 < iL4; i14++) {
            float f27 = fArr[i14];
            float f28 = (((((((((f15 - f17) * 3.0f) + 1.0f) - 0.0f) * f27) + (((f17 - (f15 * 2.0f)) + 0.0f) * 3.0f)) * f27) + f18) * f27) + 0.0f;
            fMin = Math.min(fMin, f28);
            fMax = Math.max(fMax, f28);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.f155825e = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f155826f = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0092 A[PHI: r3
      0x0092: PHI (r3v28 float) = (r3v5 float), (r3v16 float), (r3v21 float), (r3v32 float), (r3v37 float) binds: [B:128:0x0236, B:117:0x0206, B:92:0x01bb, B:47:0x00e5, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0162 A[PHI: r12
      0x0162: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:68:0x0160, B:81:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // s1.b0
    public final float a(float f14) {
        float f15;
        if (f14 <= 0.0f || f14 >= 1.0f) {
            return f14;
        }
        float fMax = Math.max(f14, 1.1920929E-7f);
        float f16 = 0.0f - fMax;
        float f17 = this.f155821a;
        float f18 = f17 - fMax;
        float f19 = this.f155823c;
        float f22 = f19 - fMax;
        double d14 = f16;
        float f24 = 0.0f;
        double d15 = ((d14 - (((double) f18) * 2.0d)) + ((double) f22)) * 3.0d;
        double d16 = ((double) (f18 - f16)) * 3.0d;
        double d17 = (((double) (f18 - f22)) * 3.0d) + ((double) (-f16)) + ((double) (1.0f - fMax));
        float f25 = Float.NaN;
        if (Math.abs(d17 - 0.0d) >= 1.0E-7d) {
            double d18 = d15 / d17;
            double d19 = d16 / d17;
            double d24 = d14 / d17;
            double d25 = ((d19 * 3.0d) - (d18 * d18)) / 9.0d;
            double d26 = ((d24 * 27.0d) + ((((2.0d * d18) * d18) * d18) - ((9.0d * d18) * d19))) / 54.0d;
            double d27 = d25 * d25 * d25;
            double d28 = (d26 * d26) + d27;
            double d29 = d18 / 3.0d;
            if (d28 < 0.0d) {
                double dSqrt = Math.sqrt(-d27);
                double d34 = (-d26) / dSqrt;
                if (d34 < -1.0d) {
                    d34 = -1.0d;
                }
                if (d34 > 1.0d) {
                    d34 = 1.0d;
                }
                double dAcos = Math.acos(d34);
                double dR = gl.b.r((float) dSqrt) * 2.0f;
                float fCos = (float) ((Math.cos(dAcos / 3.0d) * dR) - d29);
                float f26 = fCos < 0.0f ? 0.0f : fCos;
                if (f26 > 1.0f) {
                    f26 = 1.0f;
                }
                if (Math.abs(f26 - fCos) > 1.05E-6f) {
                    f26 = Float.NaN;
                }
                if (Float.isNaN(f26)) {
                    float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dR) - d29);
                    f26 = fCos2 < 0.0f ? 0.0f : fCos2;
                    if (f26 > 1.0f) {
                        f26 = 1.0f;
                    }
                    if (Math.abs(f26 - fCos2) > 1.05E-6f) {
                        f26 = Float.NaN;
                    }
                    if (Float.isNaN(f26)) {
                        float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dR) - d29);
                        if (fCos3 >= 0.0f) {
                            f24 = fCos3;
                        }
                        f15 = f24 > 1.0f ? 1.0f : f24;
                        if (Math.abs(f15 - fCos3) <= 1.05E-6f) {
                            f25 = f15;
                        }
                    } else {
                        f25 = f26;
                    }
                } else {
                    f25 = f26;
                }
            } else if (d28 == 0.0d) {
                float f27 = -gl.b.r((float) d26);
                float f28 = (float) d29;
                float f29 = (f27 * 2.0f) - f28;
                float f34 = f29 < 0.0f ? 0.0f : f29;
                if (f34 > 1.0f) {
                    f34 = 1.0f;
                }
                if (Math.abs(f34 - f29) > 1.05E-6f) {
                    f34 = Float.NaN;
                }
                if (Float.isNaN(f34)) {
                    float f35 = (-f27) - f28;
                    if (f35 >= 0.0f) {
                        f24 = f35;
                    }
                    f15 = f24 > 1.0f ? 1.0f : f24;
                    if (Math.abs(f15 - f35) <= 1.05E-6f) {
                        f25 = f15;
                    }
                } else {
                    f25 = f34;
                }
            } else {
                double dSqrt2 = Math.sqrt(d28);
                float fR = (float) (((double) (gl.b.r((float) ((-d26) + dSqrt2)) - gl.b.r((float) (d26 + dSqrt2)))) - d29);
                if (fR >= 0.0f) {
                    f24 = fR;
                }
                f15 = f24 > 1.0f ? 1.0f : f24;
                if (Math.abs(f15 - fR) <= 1.05E-6f) {
                    f25 = f15;
                }
            }
        } else if (Math.abs(d15 - 0.0d) >= 1.0E-7d) {
            double dSqrt3 = Math.sqrt((d16 * d16) - ((4.0d * d15) * d14));
            double d35 = d15 * 2.0d;
            float f36 = (float) ((dSqrt3 - d16) / d35);
            float f37 = f36 < 0.0f ? 0.0f : f36;
            if (f37 > 1.0f) {
                f37 = 1.0f;
            }
            if (Math.abs(f37 - f36) > 1.05E-6f) {
                f37 = Float.NaN;
            }
            if (Float.isNaN(f37)) {
                float f38 = (float) (((-d16) - dSqrt3) / d35);
                if (f38 >= 0.0f) {
                    f24 = f38;
                }
                f15 = f24 > 1.0f ? 1.0f : f24;
                if (Math.abs(f15 - f38) <= 1.05E-6f) {
                    f25 = f15;
                }
            } else {
                f25 = f37;
            }
        } else if (Math.abs(d16 - 0.0d) >= 1.0E-7d) {
            float f39 = (float) ((-d14) / d16);
            if (f39 >= 0.0f) {
                f24 = f39;
            }
            f15 = f24 > 1.0f ? 1.0f : f24;
            if (Math.abs(f15 - f39) <= 1.05E-6f) {
                f25 = f15;
            }
        }
        boolean zIsNaN = Float.isNaN(f25);
        float f44 = this.f155824d;
        float f45 = this.f155822b;
        if (!zIsNaN) {
            float f46 = ((((((f45 - f44) + 0.33333334f) * f25) + (f44 - (2.0f * f45))) * f25) + f45) * 3.0f * f25;
            float f47 = this.f155825e;
            if (f46 < f47) {
                f46 = f47;
            }
            float f48 = this.f155826f;
            return f46 > f48 ? f48 : f46;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f17 + ", " + f45 + ", " + f19 + ", " + f44 + ") has no solution at " + f14);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f155821a == wVar.f155821a && this.f155822b == wVar.f155822b && this.f155823c == wVar.f155823c && this.f155824d == wVar.f155824d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f155824d) + q6.f.d(this.f155823c, q6.f.d(this.f155822b, Float.hashCode(this.f155821a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CubicBezierEasing(a=");
        sb3.append(this.f155821a);
        sb3.append(", b=");
        sb3.append(this.f155822b);
        sb3.append(", c=");
        sb3.append(this.f155823c);
        sb3.append(", d=");
        return q6.f.p(sb3, this.f155824d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
