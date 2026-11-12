package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes7.dex */
public class eac {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f32565b = "R_Weight_" + eac.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f32566c = "com.huawei.health.device.util.WeightAlgorithm";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f32567a;
    private wj d;
    private int e;
    private float f;
    private float g;
    private float h;
    private byte i;
    private int j;

    public eac(float f, float f2, byte b2, int i, float f3, double d) {
        this.f = f;
        this.g = f2;
        this.i = b2;
        this.e = i;
        this.f32567a = f3;
        wj wjVar = new wj();
        this.d = wjVar;
        if (d == 0.0d) {
            wjVar.b(f, f2, b2, i, k());
            this.j = this.d.d(f, f2, b2, i, k());
        } else {
            float f4 = (float) d;
            wjVar.b(f, f2, b2, i, f4);
            this.j = this.d.d(f, f2, b2, i, f4);
        }
        ReleaseLogUtil.d(f32565b, "WeightAlgorithm mCheckCode == ", Integer.valueOf(this.j));
    }

    public float j() {
        return this.h;
    }

    private float k() {
        if (wj.c(this.f, this.i, this.g, this.e, this.f32567a) < 0) {
            LogUtil.j(f32566c, "calcResistance()");
            return -1.0f;
        }
        float fC = wj.c(this.f, this.i, this.g, this.e, this.f32567a);
        this.h = fC;
        LogUtil.a(f32566c, "get resistance = ", Float.valueOf(fC));
        return this.h;
    }

    public float h() {
        float fH;
        if (this.j < 0) {
            return -1.0f;
        }
        try {
            fH = this.d.h();
        } catch (Exception unused) {
            LogUtil.e(f32566c, "getTFR() occurred unknown exception");
            fH = -1.0f;
        }
        if (fH >= 0.0f && fH <= 100.0f) {
            return fH;
        }
        LogUtil.j(f32566c, "getTFR()");
        return -1.0f;
    }

    public float b() {
        float fB;
        if (this.j < 0) {
            return -1.0f;
        }
        try {
            fB = this.d.b();
        } catch (Exception unused) {
            LogUtil.e(f32566c, "getBMR() occurred unknown exception");
            fB = -1.0f;
        }
        if (fB >= 0.0f) {
            return fB;
        }
        LogUtil.j(f32566c, "getBMR()");
        return -1.0f;
    }

    public float l() {
        float fG;
        if (this.j < 0) {
            return -1.0f;
        }
        try {
            fG = this.d.g();
        } catch (Exception unused) {
            LogUtil.e(f32566c, "getVFR() occurred unknown exception");
            fG = -1.0f;
        }
        if (fG >= 1.0d && fG <= 59.0f) {
            return fG;
        }
        LogUtil.j(f32566c, "getVFR()");
        return -1.0f;
    }

    public float i() {
        float fJ;
        if (this.j < 0) {
            return -1.0f;
        }
        try {
            fJ = this.d.j();
        } catch (Exception unused) {
            LogUtil.e(f32566c, "getSLM() occurred unknown exception");
            fJ = -1.0f;
        }
        if (fJ >= 1.0d && fJ <= 150.0f) {
            return fJ;
        }
        LogUtil.j(f32566c, "getSLM()");
        return -1.0f;
    }

    public float d() {
        float fE;
        if (this.j < 0) {
            return -1.0f;
        }
        try {
            fE = this.d.e();
        } catch (Exception unused) {
            LogUtil.e(f32566c, "getMSW() occurred unknown exception");
            fE = -1.0f;
        }
        if (fE >= 1.0d && fE <= 4.0f) {
            return fE;
        }
        LogUtil.j(f32566c, "getMSW()");
        return -1.0f;
    }

    public float e() {
        float fA;
        if (this.j < 0) {
            return -1.0f;
        }
        try {
            fA = this.d.a();
        } catch (Exception unused) {
            LogUtil.e(f32566c, "getPM() occurred unknown exception");
            fA = -1.0f;
        }
        if (fA >= 0.0f && fA <= this.g) {
            return fA;
        }
        LogUtil.j(f32566c, "getPM()");
        return -1.0f;
    }

    public float c() {
        float fD;
        if (this.j < 0) {
            return -1.0f;
        }
        try {
            fD = this.d.d();
        } catch (Exception unused) {
            LogUtil.e(f32566c, "getBodyAge() occurred unknown exception");
            fD = -1.0f;
        }
        if (fD >= 18.0f && fD <= 99.0f) {
            return fD;
        }
        LogUtil.j(f32566c, "getBodyAge()");
        return -1.0f;
    }

    public float g() {
        float fI;
        if (this.j < 0) {
            return -1.0f;
        }
        try {
            fI = this.d.i();
        } catch (Exception unused) {
            LogUtil.e(f32566c, "getScore() getScore Exception.");
            fI = -1.0f;
        }
        if (fI >= 0.0f && fI <= 100.0f) {
            return fI;
        }
        LogUtil.j(f32566c, "getScore()");
        return -1.0f;
    }

    public float a() {
        float f = this.f;
        if (f != 0.0f) {
            float f2 = this.g;
            if (f2 >= 0.0f) {
                return new BigDecimal(((f2 * 100.0f) * 100.0f) / (f * f)).setScale(1, RoundingMode.HALF_UP).floatValue();
            }
        }
        LogUtil.j(f32566c, "getBMI()");
        return -1.0f;
    }

    public float f() {
        float f;
        if (this.j < 0) {
            return -1.0f;
        }
        try {
            f = this.d.f();
        } catch (Exception unused) {
            LogUtil.e(f32566c, "getSMM() occurred unknown exception");
            f = -1.0f;
        }
        if (f >= 1.0d && f <= 150.0f) {
            return f;
        }
        LogUtil.j(f32566c, "getSMM()");
        return -1.0f;
    }
}
