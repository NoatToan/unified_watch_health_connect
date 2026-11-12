package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class dyh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32524a;
    private ayu e;

    public dyh(float f, float f2, int i, int i2, int i3, double d) {
        this(f, f2, i, i2, i3, d, 0.0d);
    }

    public dyh(float f, float f2, int i, int i2, int i3, double d, double d2) {
        ayu ayuVar = new ayu(f, f2, i, dor.a(i3, i2), dor.e(i3), (float) d, (d2 < 0.03d || d2 > 0.6d) ? 0.0f : (float) d2);
        this.e = ayuVar;
        int iC = ayuVar.c();
        this.f32524a = iC;
        if (iC < 0) {
            ReleaseLogUtil.e("R_Weight_PluginDevice_HwWeightAlgorithm", "HwWeightAlgorithm pole four illegal arguments, check code :", Integer.valueOf(iC));
        }
    }

    public dyh(float f, float f2, int i, int i2, int i3, double[] dArr) {
        this(f, f2, i, i2, i3, dArr, 0.0d);
    }

    public dyh(float f, float f2, int i, int i2, int i3, double[] dArr, double d) {
        int iA = dor.a(i3, i2);
        int iE = dor.e(i3);
        if (dArr == null || dArr.length < 6) {
            this.e = new ayu(f, f2, i, iA, iE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
            LogUtil.j("PluginDevice_HwWeightAlgorithm", "can not initialize Algorithm with illegal resistArray");
        } else {
            this.e = new ayu(f, f2, i, iA, iE, (float) dArr[1], (float) dArr[2], (float) dArr[3], (float) dArr[4], (float) dArr[5], (float) dArr[0], (d < 0.03d || d > 0.6d) ? 0.0f : (float) d);
        }
        int iC = this.e.c();
        this.f32524a = iC;
        if (iC < 0) {
            ReleaseLogUtil.e("R_Weight_PluginDevice_HwWeightAlgorithm", "HwWeightAlgorithm pole eight illegal arguments, check code :", Integer.valueOf(iC));
        }
    }

    public dyh(float f, float f2, int i, int i2, int i3, int i4, double[] dArr, int i5, double[] dArr2) {
        this(f, f2, i, i2, i3, i4, dArr, 0.0d, i5, dArr2);
    }

    public dyh(float f, float f2, int i, int i2, int i3, int i4, double[] dArr, double d, int i5, double[] dArr2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (dArr == null || dArr.length < 6) {
            f3 = 0.0f;
            f4 = 0.0f;
            f5 = 0.0f;
            f6 = 0.0f;
            f7 = 0.0f;
            f8 = 0.0f;
        } else {
            float f15 = (float) dArr[1];
            float f16 = (float) dArr[2];
            float f17 = (float) dArr[3];
            float f18 = (float) dArr[4];
            float f19 = (float) dArr[5];
            f8 = (float) dArr[0];
            f6 = f18;
            f4 = f16;
            f5 = f17;
            f7 = f19;
            f3 = f15;
        }
        if (dArr2 == null || dArr2.length < 6) {
            f9 = 0.0f;
            f10 = 0.0f;
            f11 = 0.0f;
            f12 = 0.0f;
            f13 = 0.0f;
            f14 = 0.0f;
        } else {
            float f20 = (float) dArr2[1];
            float f21 = (float) dArr2[2];
            float f22 = (float) dArr2[3];
            float f23 = (float) dArr2[4];
            float f24 = (float) dArr2[5];
            f9 = f20;
            f14 = (float) dArr2[0];
            f10 = f21;
            f11 = f22;
            f12 = f23;
            f13 = f24;
        }
        ayu ayuVar = new ayu(f, f2, i, dor.a(i3, i2), dor.e(i3), i4, i5, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, (d < 0.03d || d > 0.6d) ? 0.0f : (float) d);
        this.e = ayuVar;
        int iC = ayuVar.c();
        this.f32524a = iC;
        if (iC < 0) {
            ReleaseLogUtil.e("R_Weight_PluginDevice_HwWeightAlgorithm", "HwWeightAlgorithm pole eight illegal arguments, check code :", Integer.valueOf(iC));
        }
    }

    public static boolean b(double[] dArr) {
        if (dArr != null && dArr.length == 6) {
            double d = dArr[0];
            if (d != 0.0d) {
                boolean z = d != 0.0d;
                for (int i = 1; i < dArr.length; i++) {
                    if (dArr[i] != 0.0d) {
                        z = false;
                    }
                }
                return z;
            }
        }
        LogUtil.a("PluginDevice_HwWeightAlgorithm", "isFourElectrode illegal resistance array");
        return false;
    }

    public static double[] a(double[] dArr) {
        if (dArr == null || dArr.length == 0) {
            return new double[0];
        }
        int length = dArr.length;
        double[] dArr2 = new double[length];
        System.arraycopy(dArr, 0, dArr2, 0, dArr.length);
        for (int i = 0; i < length; i++) {
            dArr2[i] = dArr2[i] / 10.0d;
        }
        return dArr2;
    }

    public float an() {
        if (this.f32524a >= 0) {
            return this.e.am();
        }
        return -1.0f;
    }

    public float al() {
        if (this.f32524a >= 0) {
            return this.e.as() * 100.0f;
        }
        return -1.0f;
    }

    public float am() {
        if (this.f32524a >= 0) {
            return this.e.aq() * 100.0f;
        }
        return -1.0f;
    }

    public float y() {
        if (this.f32524a >= 0) {
            return this.e.x();
        }
        return -1.0f;
    }

    public float v() {
        if (this.f32524a >= 0) {
            return this.e.u();
        }
        return -1.0f;
    }

    public float m() {
        if (this.f32524a >= 0) {
            return this.e.k();
        }
        return -1.0f;
    }

    public float k() {
        if (this.f32524a >= 0) {
            return this.e.l();
        }
        return -1.0f;
    }

    public float w() {
        if (this.f32524a >= 0) {
            return this.e.v();
        }
        return -1.0f;
    }

    public float u() {
        if (this.f32524a >= 0) {
            return this.e.y();
        }
        return -1.0f;
    }

    public float n() {
        if (this.f32524a >= 0) {
            return this.e.m() * 100.0f;
        }
        return -1.0f;
    }

    public float j() {
        if (this.f32524a >= 0) {
            return this.e.g() * 100.0f;
        }
        return -1.0f;
    }

    public float b() {
        if (this.f32524a >= 0) {
            return this.e.a();
        }
        return -1.0f;
    }

    public float aa() {
        if (this.f32524a >= 0) {
            return this.e.ab();
        }
        return -1.0f;
    }

    public float r() {
        if (this.f32524a >= 0) {
            return this.e.s();
        }
        return -1.0f;
    }

    public float ah() {
        if (this.f32524a >= 0) {
            return this.e.ae();
        }
        return -1.0f;
    }

    public float s() {
        if (this.f32524a >= 0) {
            return this.e.q();
        }
        return -1.0f;
    }

    public float ar() {
        if (this.f32524a >= 0) {
            return this.e.an();
        }
        return -1.0f;
    }

    public float z() {
        if (this.f32524a >= 0) {
            return this.e.aa();
        }
        return -1.0f;
    }

    public float p() {
        if (this.f32524a >= 0) {
            return this.e.p();
        }
        return -1.0f;
    }

    public float ac() {
        if (this.f32524a >= 0) {
            return this.e.ag();
        }
        return -1.0f;
    }

    public float q() {
        if (this.f32524a >= 0) {
            return this.e.t();
        }
        return -1.0f;
    }

    public float ak() {
        if (this.f32524a >= 0) {
            return this.e.aj();
        }
        return -1.0f;
    }

    public float e() {
        if (this.f32524a >= 0) {
            return this.e.j();
        }
        return -1.0f;
    }

    public float d() {
        if (this.f32524a >= 0) {
            return this.e.h();
        }
        return -1.0f;
    }

    public float ap() {
        if (this.f32524a >= 0) {
            return this.e.ao();
        }
        return -1.0f;
    }

    public float ae() {
        if (this.f32524a >= 0) {
            return this.e.al();
        }
        return -1.0f;
    }

    public float af() {
        if (this.f32524a >= 0) {
            return this.e.af();
        }
        return -1.0f;
    }

    public float x() {
        if (this.f32524a >= 0) {
            return this.e.ac();
        }
        return -1.0f;
    }

    public float as() {
        if (this.f32524a >= 0) {
            return this.e.ar();
        }
        return -1.0f;
    }

    public float ao() {
        if (this.f32524a >= 0) {
            return this.e.ap();
        }
        return -1.0f;
    }

    public float ai() {
        if (this.f32524a >= 0) {
            return this.e.ai();
        }
        return -1.0f;
    }

    public float ag() {
        if (this.f32524a >= 0) {
            return this.e.ah();
        }
        return -1.0f;
    }

    public float a() {
        if (this.f32524a >= 0) {
            return this.e.d();
        }
        return -1.0f;
    }

    public float c() {
        if (this.f32524a >= 0) {
            return this.e.e();
        }
        return -1.0f;
    }

    public float f() {
        if (this.f32524a >= 0) {
            return this.e.i();
        }
        return -1.0f;
    }

    public float g() {
        if (this.f32524a >= 0) {
            return this.e.f();
        }
        return -1.0f;
    }

    public float h() {
        if (this.f32524a >= 0) {
            return this.e.b();
        }
        return -1.0f;
    }

    public float t() {
        if (this.f32524a >= 0) {
            return this.e.w();
        }
        return -1.0f;
    }

    public float i() {
        if (this.f32524a >= 0) {
            return this.e.o();
        }
        return -1.0f;
    }

    public float ad() {
        if (this.f32524a >= 0) {
            return this.e.z() * 100.0f;
        }
        return -1.0f;
    }

    public float o() {
        if (this.f32524a >= 0) {
            return this.e.n() * 100.0f;
        }
        return -1.0f;
    }

    public float ab() {
        if (this.f32524a >= 0) {
            return this.e.ad() * 100.0f;
        }
        return -1.0f;
    }

    public float l() {
        if (this.f32524a >= 0) {
            return this.e.r() * 100.0f;
        }
        return -1.0f;
    }

    public float aj() {
        if (this.f32524a >= 0) {
            return this.e.ak() * 100.0f;
        }
        return -1.0f;
    }
}
