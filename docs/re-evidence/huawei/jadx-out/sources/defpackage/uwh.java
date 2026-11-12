package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hihealth.ResultUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class uwh implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mBmi")
    private double f50652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("mBmr")
    private double f50653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mBodyScore")
    private double f50654c;

    @SerializedName("mBoneMineral")
    private double d;

    @SerializedName("deviceUuid")
    private String e;

    @SerializedName("mClientId")
    private int f;

    @SerializedName("mFatLevel")
    private double g;

    @SerializedName("mDeviceId")
    private int h;

    @SerializedName("mDeviceType")
    private int i;

    @SerializedName("mMetaData")
    private String j;

    @SerializedName("type")
    private int l;

    @SerializedName("mProtein")
    private double m;

    @SerializedName("mMuscles")
    private double o;

    @SerializedName("mWaterRate")
    private double x;

    @SerializedName("mWater")
    private double y;

    @SerializedName("mTime")
    private long k = 0;

    @SerializedName("mTimeExtra")
    private long n = 0;

    @SerializedName("mValueFirst")
    private double q = 0.0d;

    @SerializedName("mValueSecond")
    private double t = 0.0d;

    @SerializedName("mValueThird")
    private double u = 0.0d;

    @SerializedName("mValueForth")
    private double s = 0.0d;

    @SerializedName("mValueFifth")
    private double p = 0.0d;

    @SerializedName("mValueSixth")
    private String r = "";

    public String toString() {
        return "HealthData-->[mTime =" + this.k + "; temeextra = " + this.n + "; mValue1 = " + this.q + "; mValue2 = " + this.t + "; mValue3 = " + this.u + "; mValue4 = " + this.s + "; mValue5 = " + this.p + "; type = " + this.l + "]";
    }

    public String i() {
        return this.e;
    }

    public void b(String str) {
        this.e = (String) ResultUtils.c(str);
    }

    public String j() {
        return this.j;
    }

    public void c(String str) {
        this.j = str;
    }

    public void e(long j) {
        this.k = j;
    }

    public long g() {
        return ((Long) vdk.e(Long.valueOf(this.k))).longValue();
    }

    public void b(long j) {
        this.n = j;
    }

    public long f() {
        return ((Long) vdk.e(Long.valueOf(this.n))).longValue();
    }

    public void c(double d) {
        this.q = d;
    }

    public double m() {
        return ((Double) vdk.e(Double.valueOf(this.q))).doubleValue();
    }

    public void e(double d) {
        this.t = d;
    }

    public double o() {
        return ((Double) vdk.e(Double.valueOf(this.t))).doubleValue();
    }

    public void b(double d) {
        this.u = d;
    }

    public double l() {
        return ((Double) vdk.e(Double.valueOf(this.u))).doubleValue();
    }

    public void a(double d) {
        this.s = d;
    }

    public double n() {
        return ((Double) vdk.e(Double.valueOf(this.s))).doubleValue();
    }

    public void d(double d) {
        this.p = d;
    }

    public double k() {
        return ((Double) vdk.e(Double.valueOf(this.p))).doubleValue();
    }

    public void n(double d) {
        this.y = d;
    }

    public void k(double d) {
        this.x = d;
    }

    public void j(double d) {
        this.g = d;
    }

    public void i(double d) {
        this.d = d;
    }

    public void g(double d) {
        this.f50652a = d;
    }

    public void f(double d) {
        this.f50653b = d;
    }

    public void l(double d) {
        this.o = d;
    }

    public void o(double d) {
        this.m = d;
    }

    public void h(double d) {
        this.f50654c = d;
    }

    public int b() {
        return this.h;
    }

    public void a(int i) {
        this.h = i;
    }

    public int d() {
        return this.i;
    }

    public void c(int i) {
        this.i = i;
    }

    public int a() {
        return this.f;
    }

    public void d(int i) {
        this.f = i;
    }

    public int h() {
        return this.l;
    }

    public void j(int i) {
        this.l = i;
    }
}
