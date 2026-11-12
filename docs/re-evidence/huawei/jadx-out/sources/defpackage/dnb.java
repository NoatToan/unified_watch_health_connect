package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class dnb implements Serializable, BaseViewBeanApi {
    private static final long serialVersionUID = 7211266658293312319L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mBasalMetabolicRate")
    private double f32042a;

    @SerializedName("mMuscleMass")
    private double aa;

    @SerializedName("mLeftUpperLimbMuscleMass")
    private double ab;

    @SerializedName("mModifyTime")
    private long ac;

    @SerializedName("mPole")
    private int ad;

    @SerializedName("mRasm")
    private double ae;

    @SerializedName("mProtein")
    private double ag;

    @SerializedName("mPressureIndex")
    private double ah;

    @SerializedName("mRightFootFatRate")
    private double ai;

    @SerializedName("mRightLowerLimbMuscleMass")
    private double aj;

    @SerializedName("mRightHandFatRate")
    private double ak;

    @SerializedName("mRightUpperLimbFatMass")
    private double al;

    @SerializedName("mRightUpperLimbMuscleMass")
    private double am;

    @SerializedName("mRightLowerLimbFatMass")
    private double an;

    @SerializedName("mTotalWaterRate")
    private double ao;

    @SerializedName("mTotalWater")
    private double ap;

    @SerializedName("mSex")
    private byte aq;

    @SerializedName("mTrunkFatMass")
    private double ar;

    @SerializedName("mSkeletalMuscle")
    private double as;

    @SerializedName("mWaistToHipRatio")
    private double at;

    @SerializedName("mWaistToHipRatioUser")
    private double au;

    @SerializedName("mTrunkMuscleMass")
    private double av;

    @SerializedName("mTrunkFatRate")
    private double aw;

    @SerializedName("mVisceraFatLevel")
    private double ax;

    @SerializedName("mWeighTime")
    private long ay;

    @SerializedName("resistance")
    private double az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("mAge")
    private int f32043b;

    @SerializedName("mWeightEndTime")
    private long bb;

    @SerializedName("mWeight")
    private double bc;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mBodyScore")
    private double f32044c;

    @SerializedName("mBodyMassIndex")
    private double d;

    @SerializedName("mBodyAge")
    private double e;

    @SerializedName("mDataType")
    private int f;

    @SerializedName("mClientId")
    private int g;

    @SerializedName("mBodyType")
    private double h;

    @SerializedName("mDeviceName")
    private String i;

    @SerializedName("mBodyShape")
    private double j;

    @SerializedName("mFatMass")
    private double k;

    @SerializedName("mDeviceUuid")
    private String l;

    @SerializedName("mFatRate")
    private double m;

    @SerializedName("mFatBalance")
    private double n;

    @SerializedName("mIsManual")
    private boolean p;

    @SerializedName("mInorganicSalt")
    private double r;

    @SerializedName("mHeartRate")
    private double s;

    @SerializedName("mHeight")
    private int t;

    @SerializedName("mLeftUpperLimbFatMass")
    private double u;

    @SerializedName("mLeftHandFatRate")
    private double v;

    @SerializedName("mLeftFootFatRate")
    private double w;

    @SerializedName("mLeftLowerLimbFatMass")
    private double x;

    @SerializedName("mLeftLowerLimbMuscleMass")
    private double y;

    @SerializedName("mMuscleBalance")
    private double z;

    @SerializedName("mResistanceArray")
    private double[] af = new double[6];

    @SerializedName("mHfResistanceArray")
    private double[] q = new double[6];

    @SerializedName("mFreq")
    private int o = 1;

    @Override // com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public double getDoubleOrIntLevelByType(int i) {
        return -1.0d;
    }

    @Override // com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public int getFractionDigitByType(int i) {
        return 1;
    }

    @Override // com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public boolean isNewScaleType() {
        return false;
    }

    public String k() {
        return this.i;
    }

    public void e(String str) {
        this.i = str;
    }

    public String n() {
        return this.l;
    }

    public void c(String str) {
        this.l = str;
    }

    public double av() {
        if (Double.isNaN(this.bc) || Double.isInfinite(this.bc)) {
            return 0.0d;
        }
        return ((Double) dym.d(Double.valueOf(this.bc))).doubleValue();
    }

    public void af(double d) {
        this.bc = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public double b() {
        return ((Double) dym.d(Double.valueOf(this.m))).doubleValue();
    }

    public void d(double d) {
        this.m = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public double d() {
        return UnitUtil.d((UnitUtil.d(this.bc, 1) * this.m) / 100.0d, 1);
    }

    public void e(double d) {
        this.k = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public double ag() {
        return ((Double) dym.d(Double.valueOf(this.az))).doubleValue();
    }

    public void v(double d) {
        this.az = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public double ak() {
        return ((Double) dym.d(Double.valueOf(this.ap))).doubleValue();
    }

    public void aa(double d) {
        this.ap = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public double aq() {
        return this.ao;
    }

    public void ag(double d) {
        this.ao = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public double s() {
        return ((Double) dym.d(Double.valueOf(this.ax))).doubleValue();
    }

    public void l(double d) {
        this.ax = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public double g() {
        return ((Double) dym.d(Double.valueOf(this.r))).doubleValue();
    }

    public void h(double d) {
        this.r = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public double f() {
        return ((Double) dym.d(Double.valueOf(this.d))).doubleValue();
    }

    public void c(double d) {
        this.d = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public double e() {
        return ((Double) dym.d(Double.valueOf(this.f32042a))).doubleValue();
    }

    public void b(double d) {
        this.f32042a = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public double ad() {
        return ((Double) dym.d(Double.valueOf(this.aa))).doubleValue();
    }

    public void p(double d) {
        this.aa = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public double aa() {
        return ((Double) dym.d(Double.valueOf(this.ag))).doubleValue();
    }

    public void s(double d) {
        this.ag = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public double h() {
        return ((Double) dym.d(Double.valueOf(this.f32044c))).doubleValue();
    }

    public void j(double d) {
        this.f32044c = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public double a() {
        return ((Double) dym.d(Double.valueOf(this.e))).doubleValue();
    }

    public void a(double d) {
        this.e = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public double q() {
        return this.s;
    }

    public void o(double d) {
        this.s = d;
    }

    public double z() {
        return this.ah;
    }

    public void t(double d) {
        this.ah = d;
    }

    public long ax() {
        return ((Long) dym.d(Long.valueOf(this.ay))).longValue();
    }

    public void e(long j) {
        this.ay = ((Long) dym.d(Long.valueOf(j))).longValue();
    }

    public long aw() {
        return ((Long) dym.d(Long.valueOf(this.bb))).longValue();
    }

    public void d(long j) {
        this.bb = ((Long) dym.d(Long.valueOf(j))).longValue();
    }

    public int o() {
        return this.f;
    }

    public void d(int i) {
        this.f = i;
    }

    public double am() {
        return ((Double) dym.d(Double.valueOf(this.as))).doubleValue();
    }

    public void ab(double d) {
        this.as = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public int ac() {
        return this.ad;
    }

    public void f(int i) {
        this.ad = i;
    }

    public double ah() {
        return this.aj;
    }

    public void w(double d) {
        this.aj = d;
    }

    public double y() {
        return this.y;
    }

    public void m(double d) {
        this.y = d;
    }

    public double aj() {
        return this.am;
    }

    public void ad(double d) {
        this.am = d;
    }

    public double w() {
        return this.ab;
    }

    public void q(double d) {
        this.ab = d;
    }

    public double ar() {
        return this.av;
    }

    public void z(double d) {
        this.av = d;
    }

    public double ae() {
        return this.an;
    }

    public void x(double d) {
        this.an = d;
    }

    public double u() {
        return this.x;
    }

    public void n(double d) {
        this.x = d;
    }

    public double al() {
        return this.al;
    }

    public void y(double d) {
        this.al = d;
    }

    public double v() {
        return this.u;
    }

    public void k(double d) {
        this.u = d;
    }

    public double ap() {
        return this.ar;
    }

    public void ac(double d) {
        this.ar = d;
    }

    public double ao() {
        return this.at;
    }

    public void ae(double d) {
        this.at = d;
    }

    public void ah(double d) {
        this.au = d;
    }

    public double as() {
        return this.au;
    }

    public void a(int i) {
        this.o = i;
    }

    public double[] t() {
        double[] dArr = this.q;
        if (dArr != null) {
            return (double[]) dArr.clone();
        }
        return new double[6];
    }

    public void d(double[] dArr) {
        if (dArr != null) {
            this.q = (double[]) dArr.clone();
        }
    }

    public double[] ai() {
        double[] dArr = this.af;
        if (dArr != null) {
            return (double[]) dArr.clone();
        }
        return new double[6];
    }

    public void c(double[] dArr) {
        if (dArr != null) {
            this.af = (double[]) dArr.clone();
        }
    }

    public double af() {
        return this.ae;
    }

    public void u(double d) {
        this.ae = d;
    }

    public double i() {
        return this.h;
    }

    public void i(double d) {
        this.h = d;
    }

    public double j() {
        return this.j;
    }

    public void f(double d) {
        this.j = d;
    }

    public double m() {
        return this.n;
    }

    public void g(double d) {
        this.n = d;
    }

    public double ab() {
        return this.z;
    }

    public void r(double d) {
        this.z = d;
    }

    public int c() {
        return ((Integer) dym.d(Integer.valueOf(this.f32043b))).intValue();
    }

    public void e(int i) {
        this.f32043b = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public int r() {
        return ((Integer) dym.d(Integer.valueOf(this.t))).intValue();
    }

    public void c(int i) {
        this.t = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public byte an() {
        return ((Byte) dym.d(Byte.valueOf(this.aq))).byteValue();
    }

    public void c(byte b2) {
        this.aq = ((Byte) dym.d(Byte.valueOf(b2))).byteValue();
    }

    public int l() {
        return this.g;
    }

    public void b(int i) {
        this.g = i;
    }

    public long x() {
        return this.ac;
    }

    public void b(long j) {
        this.ac = j;
    }

    public boolean p() {
        return this.p;
    }

    public void d(boolean z) {
        this.p = z;
    }

    @Override // com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public String getWeightScaleProductId() {
        return "";
    }

    @Override // com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public String getStringLevelByType(int i) {
        return "";
    }

    @Override // com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public String[] getStringArrayLevelByType(int i) {
        return new String[0];
    }

    @Override // com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public double[] getDoubleArrayLevelByType(int i) {
        return new double[0];
    }

    public boolean equals(Object obj) {
        return (obj instanceof dnb) && ((dnb) obj).ax() == this.ay;
    }

    @Override // com.huawei.health.device.fatscale.datatypes.BaseViewBeanApi
    public boolean isVisible(int i, boolean z) {
        if (i != 31) {
            return true;
        }
        if (z || !etn.b(this.f32044c)) {
            return false;
        }
        return LanguageUtil.l(BaseApplication.getContext()) || LanguageUtil.q(BaseApplication.getContext());
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "WeightBean{mWeight=" + this.bc + ", mFatRate=" + this.m + ", mFatMass=" + this.k + ", mTotalWater=" + this.ap + ", mTotalWaterRate=" + this.ao + ", mVisceraFatLevel=" + this.ax + ", mInorganicSalt=" + this.r + ", mBodyMassIndex=" + this.d + ", mBasalMetabolicRate=" + this.f32042a + ", mMuscleMass=" + this.aa + ", mProtein=" + this.ag + ", mSkeletalMuscle=" + this.as + ", mHeartRate=" + this.s + ", mPressureIndex=" + this.ah + ", mRightLowerLimbMuscleMass=" + this.aj + ", mLeftLowerLimbMuscleMass=" + this.y + ", mRightUpperLimbMuscleMass=" + this.am + ", mLeftUpperLimbMuscleMass=" + this.ab + ", mTrunkMuscleMass=" + this.av + ", mRightLowerLimbFatMass=" + this.an + ", mLeftLowerLimbFatMass=" + this.x + ", mRightUpperLimbFatMass=" + this.al + ", mLeftUpperLimbFatMass=" + this.u + ", mTrunkFatMass=" + this.ar + ", mRasm=" + this.ae + ", mWaistToHipRatio=" + this.at + ", mWaistToHipRatioUser=" + this.au + ", mFatBalance=" + this.n + ", mMuscleBalance=" + this.z + ", mBodyAge=" + this.e + ", mBodyScore=" + this.f32044c + ", mBodyType=" + this.h + ", mBodyShape=" + this.j + ", mAge=" + this.f32043b + ", mHeight=" + this.t + ", mSex=" + ((int) this.aq) + ", mPole=" + this.ad + ", resistance=" + this.az + ", mWeighTime=" + this.ay + ", mRightHandFatRate=" + this.ak + ", mLeftHandFatRate=" + this.v + ", mRightFootFatRate=" + this.ai + ", mLeftFootFatRate=" + this.w + ", mTrunkFatRate=" + this.aw + ", mResistanceArray=" + Arrays.toString(this.af) + ", mHfResistanceArray=" + Arrays.toString(this.q) + ", mFreq=" + this.o + ", mWeightEndTime=" + this.bb + ", mDataType=" + this.f + ", mDeviceUuid='" + this.l + "', mClientId=" + this.g + ", mIsManual=" + this.p + ", mModifyTime=" + this.ac + ", mDeviceName='" + this.i + "'}";
    }
}
