package defpackage;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import com.autonavi.amap.mapcore.VirtualEarthProjection;
import kotlin.jvm.internal.DoubleCompanionObject;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ac3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f872b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public ac3(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f871a = f;
        this.f872b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
    }

    public static ac3 b(@FloatRange(from = 0.0d, to = VirtualEarthProjection.MAX_LONGITUDE) float f, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = 0.0d, to = 100.0d) float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        ac3 ac3Var = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int iP = e(f8, f2, f).p();
            float fB = bc3.b(iP);
            float fAbs = Math.abs(f3 - fB);
            if (fAbs < 0.2f) {
                ac3 ac3VarC = c(iP);
                float fA = ac3VarC.a(e(ac3VarC.k(), ac3VarC.i(), f));
                if (fA <= 1.0f) {
                    ac3Var = ac3VarC;
                    f5 = fAbs;
                    f7 = fA;
                }
            }
            if (f5 == 0.0f && f7 == 0.0f) {
                break;
            }
            if (fB < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return ac3Var;
    }

    public static ac3 c(int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i, vyq.f37372k, fArr, fArr2);
        return new ac3(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    public static void d(int i, vyq vyqVar, @Size(7) float[] fArr, @Size(3) float[] fArr2) {
        bc3.f(i, fArr2);
        float[][] fArr3 = bc3.f4048a;
        float f = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f2 = fArr4[0] * f;
        float f3 = fArr2[1];
        float f4 = f2 + (fArr4[1] * f3);
        float f5 = fArr2[2];
        float f6 = f4 + (fArr4[2] * f5);
        float[] fArr5 = fArr3[1];
        float f7 = (fArr5[0] * f) + (fArr5[1] * f3) + (fArr5[2] * f5);
        float[] fArr6 = fArr3[2];
        float f8 = (f * fArr6[0]) + (f3 * fArr6[1]) + (f5 * fArr6[2]);
        float f9 = vyqVar.i()[0] * f6;
        float f10 = vyqVar.i()[1] * f7;
        float f11 = vyqVar.i()[2] * f8;
        float fPow = (float) Math.pow(((double) (vyqVar.c() * Math.abs(f9))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (vyqVar.c() * Math.abs(f10))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (vyqVar.c() * Math.abs(f11))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f9) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f10) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f11) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f12 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d)) / 11.0f;
        float f13 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f14 = fSignum2 * 20.0f;
        float f15 = (((fSignum * 20.0f) + f14) + (21.0f * fSignum3)) / 20.0f;
        float f16 = (((fSignum * 40.0f) + f14) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f17 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f16 * vyqVar.f()) / vyqVar.a(), vyqVar.b() * vyqVar.j())) * 100.0f;
        float fB = (4.0f / vyqVar.b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (vyqVar.a() + 4.0f) * vyqVar.d();
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, vyqVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * vyqVar.g()) * vyqVar.h()) * ((float) Math.sqrt((f12 * f12) + (f13 * f13)))) / (f15 + 0.305f), 0.9d));
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * fPow5;
        float fD = vyqVar.d() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((fPow5 * vyqVar.b()) / (vyqVar.a() + 4.0f))) * 50.0f;
        float f18 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fD) + 1.0f)) * 43.85965f;
        double d2 = f17;
        float fCos = ((float) Math.cos(d2)) * fLog;
        float fSin = fLog * ((float) Math.sin(d2));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fB;
            fArr[2] = fD;
            fArr[3] = fSqrt2;
            fArr[4] = f18;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    public static ac3 e(@FloatRange(from = 0.0d, to = 100.0d) float f, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = 0.0d, to = VirtualEarthProjection.MAX_LONGITUDE) float f3) {
        return f(f, f2, f3, vyq.f37372k);
    }

    public static ac3 f(@FloatRange(from = 0.0d, to = 100.0d) float f, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = 0.0d, to = VirtualEarthProjection.MAX_LONGITUDE) float f3, vyq vyqVar) {
        double d = ((double) f) / 100.0d;
        float fB = (4.0f / vyqVar.b()) * ((float) Math.sqrt(d)) * (vyqVar.a() + 4.0f) * vyqVar.d();
        float fD = f2 * vyqVar.d();
        float fSqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * vyqVar.b()) / (vyqVar.a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) fD) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new ac3(f3, f2, f, fB, fD, fSqrt, f4, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    public static int m(@FloatRange(from = 0.0d, to = VirtualEarthProjection.MAX_LONGITUDE) float f, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = 0.0d, to = 100.0d) float f3) {
        return n(f, f2, f3, vyq.f37372k);
    }

    public static int n(@FloatRange(from = 0.0d, to = VirtualEarthProjection.MAX_LONGITUDE) float f, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = 0.0d, to = 100.0d) float f3, vyq vyqVar) {
        if (f2 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return bc3.a(f3);
        }
        float fMin = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        ac3 ac3Var = null;
        boolean z = true;
        float f4 = 0.0f;
        float f5 = f2;
        while (Math.abs(f4 - f2) >= 0.4f) {
            ac3 ac3VarB = b(fMin, f5, f3);
            if (!z) {
                if (ac3VarB == null) {
                    f2 = f5;
                } else {
                    f4 = f5;
                    ac3Var = ac3VarB;
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
            } else {
                if (ac3VarB != null) {
                    return ac3VarB.o(vyqVar);
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
                z = false;
            }
        }
        return ac3Var == null ? bc3.a(f3) : ac3Var.o(vyqVar);
    }

    public float a(ac3 ac3Var) {
        float fL = l() - ac3Var.l();
        float fG = g() - ac3Var.g();
        float fH = h() - ac3Var.h();
        return (float) (Math.pow(Math.sqrt((fL * fL) + (fG * fG) + (fH * fH)), 0.63d) * 1.41d);
    }

    @FloatRange(from = DoubleCompanionObject.NEGATIVE_INFINITY, fromInclusive = false, to = Double.POSITIVE_INFINITY, toInclusive = false)
    public float g() {
        return this.h;
    }

    @FloatRange(from = DoubleCompanionObject.NEGATIVE_INFINITY, fromInclusive = false, to = Double.POSITIVE_INFINITY, toInclusive = false)
    public float h() {
        return this.i;
    }

    @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false)
    public float i() {
        return this.f872b;
    }

    @FloatRange(from = 0.0d, to = VirtualEarthProjection.MAX_LONGITUDE, toInclusive = false)
    public float j() {
        return this.f871a;
    }

    @FloatRange(from = 0.0d, to = 100.0d)
    public float k() {
        return this.c;
    }

    @FloatRange(from = 0.0d, to = 100.0d)
    public float l() {
        return this.g;
    }

    public int o(vyq vyqVar) {
        float fPow = (float) Math.pow(((double) ((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(((double) k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, vyqVar.e()), 0.73d), 1.1111111111111112d);
        double dJ = (j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dJ) + 3.8d)) * 0.25f;
        float fA = vyqVar.a() * ((float) Math.pow(((double) k()) / 100.0d, (1.0d / ((double) vyqVar.b())) / ((double) vyqVar.j())));
        float fG = fCos * 3846.1538f * vyqVar.g() * vyqVar.h();
        float f = fA / vyqVar.f();
        float fSin = (float) Math.sin(dJ);
        float fCos2 = (float) Math.cos(dJ);
        float f2 = (((0.305f + f) * 23.0f) * fPow) / (((fG * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f3 = fCos2 * f2;
        float f4 = f2 * fSin;
        float f5 = f * 460.0f;
        float f6 = (((451.0f * f3) + f5) + (288.0f * f4)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float f8 = ((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f;
        float fSignum = Math.signum(f6) * (100.0f / vyqVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f6)) * 27.13d) / (400.0d - ((double) Math.abs(f6)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f7) * (100.0f / vyqVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f8) * (100.0f / vyqVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f8)) * 27.13d) / (400.0d - ((double) Math.abs(f8)))), 2.380952380952381d));
        float f9 = fSignum / vyqVar.i()[0];
        float f10 = fSignum2 / vyqVar.i()[1];
        float f11 = fSignum3 / vyqVar.i()[2];
        float[][] fArr = bc3.f4049b;
        float[] fArr2 = fArr[0];
        float f12 = (fArr2[0] * f9) + (fArr2[1] * f10) + (fArr2[2] * f11);
        float[] fArr3 = fArr[1];
        float f13 = (fArr3[0] * f9) + (fArr3[1] * f10) + (fArr3[2] * f11);
        float[] fArr4 = fArr[2];
        return z44.c(f12, f13, (f9 * fArr4[0]) + (f10 * fArr4[1]) + (f11 * fArr4[2]));
    }

    public int p() {
        return o(vyq.f37372k);
    }
}
