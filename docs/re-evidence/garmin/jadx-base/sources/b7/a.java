package b7;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f16230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f16231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f16232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f16233f;

    public a(float f14, float f15, float f16, float f17, float f18, float f19, float f22, float f24, float f25) {
        this.f16228a = f14;
        this.f16229b = f15;
        this.f16230c = f16;
        this.f16231d = f22;
        this.f16232e = f24;
        this.f16233f = f25;
    }

    public static a a(int i14) {
        k kVar = k.f16266k;
        float fB = b.b(Color.red(i14));
        float fB2 = b.b(Color.green(i14));
        float fB3 = b.b(Color.blue(i14));
        float[][] fArr = b.f16237d;
        float[] fArr2 = fArr[0];
        float f14 = (fArr2[2] * fB3) + (fArr2[1] * fB2) + (fArr2[0] * fB);
        float[] fArr3 = fArr[1];
        float f15 = (fArr3[2] * fB3) + (fArr3[1] * fB2) + (fArr3[0] * fB);
        float[] fArr4 = fArr[2];
        float f16 = (fB3 * fArr4[2]) + (fB2 * fArr4[1]) + (fB * fArr4[0]);
        float[] fArr5 = {f14, f15, f16};
        float[][] fArr6 = b.f16234a;
        float[] fArr7 = fArr6[0];
        float f17 = (fArr7[2] * f16) + (fArr7[1] * f15) + (fArr7[0] * f14);
        float[] fArr8 = fArr6[1];
        float f18 = (fArr8[2] * f16) + (fArr8[1] * f15) + (fArr8[0] * f14);
        float[] fArr9 = fArr6[2];
        float f19 = (f16 * fArr9[2]) + (f15 * fArr9[1]) + (f14 * fArr9[0]);
        float[] fArr10 = kVar.f16273g;
        float f22 = kVar.f16275i;
        float f24 = kVar.f16270d;
        float f25 = kVar.f16267a;
        float f26 = fArr10[0] * f17;
        float f27 = fArr10[1] * f18;
        float f28 = fArr10[2] * f19;
        float f29 = kVar.f16274h;
        float fPow = (float) Math.pow(((double) (Math.abs(f26) * f29)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f27) * f29)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f28) * f29)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f26) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f27) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f28) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d14 = fSignum3;
        float f34 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d14)) / 11.0f;
        float f35 = ((float) (((double) (fSignum + fSignum2)) - (d14 * 2.0d))) / 9.0f;
        float f36 = fSignum2 * 20.0f;
        float f37 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f36)) / 20.0f;
        float f38 = (((fSignum * 40.0f) + f36) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f35, f34)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f39 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f38 * kVar.f16268b) / f25, kVar.f16276j * f24)) * 100.0f;
        float f44 = 4.0f + f25;
        float fSqrt = (4.0f / f24) * ((float) Math.sqrt(fPow4 / 100.0f)) * f44 * f22;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, kVar.f16272f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? fAtan2 + 360.0f : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * kVar.f16271e) * kVar.f16269c) * ((float) Math.sqrt((f35 * f35) + (f34 * f34)))) / (f37 + 0.305f), 0.9d));
        float fSqrt2 = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * fPow5;
        float f45 = fSqrt2 * f22;
        float fSqrt3 = ((float) Math.sqrt((fPow5 * f24) / f44)) * 50.0f;
        float f46 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * f45) + 1.0f)) * 43.85965f;
        double d15 = f39;
        float fCos = fLog * ((float) Math.cos(d15));
        float fSin = fLog * ((float) Math.sin(d15));
        fArr5[0] = fAtan2;
        fArr5[1] = fSqrt2;
        return new a(fArr5[0], fArr5[1], fPow4, fSqrt, f45, fSqrt3, f46, fCos, fSin);
    }

    public static a b(float f14, float f15, float f16) {
        k kVar = k.f16266k;
        double d14 = ((double) f14) / 100.0d;
        float fSqrt = (4.0f / kVar.f16270d) * ((float) Math.sqrt(d14));
        float f17 = kVar.f16267a + 4.0f;
        float f18 = kVar.f16275i;
        float f19 = fSqrt * f17 * f18;
        float f22 = f18 * f15;
        float fSqrt2 = ((float) Math.sqrt(((f15 / ((float) Math.sqrt(d14))) * kVar.f16270d) / f17)) * 50.0f;
        float f24 = (1.7f * f14) / ((0.007f * f14) + 1.0f);
        float fLog = ((float) Math.log((((double) f22) * 0.0228d) + 1.0d)) * 43.85965f;
        double d15 = (3.1415927f * f16) / 180.0f;
        return new a(f16, f15, f14, f19, f22, fSqrt2, f24, ((float) Math.cos(d15)) * fLog, fLog * ((float) Math.sin(d15)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final int c(k kVar) {
        float fSqrt;
        float f14 = this.f16229b;
        double d14 = f14;
        float f15 = this.f16230c;
        if (d14 != 0.0d) {
            double d15 = f15;
            if (d15 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f14 / ((float) Math.sqrt(d15 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float f16 = kVar.f16272f;
        float f17 = kVar.f16274h;
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, f16), 0.73d), 1.1111111111111112d);
        double d16 = (this.f16228a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d16) + 3.8d)) * 0.25f;
        float fPow2 = kVar.f16267a * ((float) Math.pow(((double) f15) / 100.0d, (1.0d / ((double) kVar.f16270d)) / ((double) kVar.f16276j)));
        float f18 = fCos * 3846.1538f * kVar.f16271e * kVar.f16269c;
        float f19 = fPow2 / kVar.f16268b;
        float fSin = (float) Math.sin(d16);
        float fCos2 = (float) Math.cos(d16);
        float f22 = (((0.305f + f19) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f18 * 23.0f)));
        float f24 = fCos2 * f22;
        float f25 = f22 * fSin;
        float f26 = f19 * 460.0f;
        float f27 = ((288.0f * f25) + ((451.0f * f24) + f26)) / 1403.0f;
        float fC = hb.a.c(f25, 261.0f, f26 - (891.0f * f24), 1403.0f);
        float fC2 = hb.a.c(f25, 6300.0f, f26 - (f24 * 220.0f), 1403.0f);
        float f28 = 100.0f / f17;
        float fSignum = Math.signum(f27) * f28 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f27)) * 27.13d) / (400.0d - ((double) Math.abs(f27)))), 2.380952380952381d));
        float fSignum2 = Math.signum(fC) * f28 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(fC)) * 27.13d) / (400.0d - ((double) Math.abs(fC)))), 2.380952380952381d));
        float fSignum3 = Math.signum(fC2) * f28 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(fC2)) * 27.13d) / (400.0d - ((double) Math.abs(fC2)))), 2.380952380952381d));
        float[] fArr = kVar.f16273g;
        float f29 = fSignum / fArr[0];
        float f34 = fSignum2 / fArr[1];
        float f35 = fSignum3 / fArr[2];
        float[][] fArr2 = b.f16235b;
        float[] fArr3 = fArr2[0];
        float f36 = (fArr3[2] * f35) + (fArr3[1] * f34) + (fArr3[0] * f29);
        float[] fArr4 = fArr2[1];
        float f37 = (fArr4[2] * f35) + (fArr4[1] * f34) + (fArr4[0] * f29);
        float[] fArr5 = fArr2[2];
        return c7.d.a(f36, f37, (f35 * fArr5[2]) + (f34 * fArr5[1]) + (f29 * fArr5[0]));
    }
}
