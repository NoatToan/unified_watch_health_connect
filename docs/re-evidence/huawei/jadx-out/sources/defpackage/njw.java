package defpackage;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.google.gson.annotations.SerializedName;
import health.compact.a.CommonUtil;
import lib.android.paypal.com.magnessdk.g;

/* JADX INFO: loaded from: classes11.dex */
public class njw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("aat")
    private int f43105a;

    @SerializedName("ti")
    private long aa;

    @SerializedName("ta")
    private int ad;

    @SerializedName("wdt")
    private long ae;

    @SerializedName("tr")
    private int ah;

    @SerializedName(g.t1)
    private int ai;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("at")
    private int f43106b;

    @SerializedName("cd")
    private int i;

    @SerializedName("cr")
    private int l;

    @SerializedName("hr")
    private int m;

    @SerializedName("hz")
    private int n;

    @SerializedName("dt")
    private long o;

    @SerializedName("mm")
    private long p;

    @SerializedName(CmcdConfiguration.KEY_OBJECT_TYPE)
    private int q;

    @SerializedName("pa")
    private float r;

    @SerializedName("rt")
    private long u;

    @SerializedName("pc")
    private int v;

    @SerializedName(CmcdConfiguration.KEY_STREAM_TYPE)
    private int z;

    @SerializedName("al")
    private int e = 0;

    @SerializedName("UUID")
    private String af = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mActiveCalorie")
    private int f43107c = 0;

    @SerializedName("mPower")
    private int y = 0;

    @SerializedName("mInclination")
    private int t = 0;

    @SerializedName("mCyclingCadence")
    private int k = 0;

    @SerializedName("mAnalogPower")
    private int f = 0;

    @SerializedName("mMaxSpeed")
    private int s = 0;

    @SerializedName("mAverageSpeed")
    private int g = 0;

    @SerializedName("mRealAvgPower")
    private int x = 0;

    @SerializedName("mRealAvgAnalogPower")
    private int w = 0;

    @SerializedName("mAnalogCadence")
    private int d = 0;

    @SerializedName("mAvgCadence")
    private int h = 0;

    @SerializedName("mAvgAnalogCadence")
    private int j = 0;

    @SerializedName("mThreeSecPower")
    private int ac = 0;

    @SerializedName("mThreeSecAnalogPower")
    private int ab = 0;

    public void k(int i) {
        this.k = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void p(int i) {
        this.y = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void ab(int i) {
        this.t = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void a(long j) {
        this.ae = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public int j() {
        return ((Integer) lst.d(Integer.valueOf(this.m))).intValue();
    }

    public void o(int i) {
        this.m = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void n(int i) {
        this.n = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int m() {
        return ((Integer) lst.d(Integer.valueOf(this.z))).intValue();
    }

    public void w(int i) {
        this.z = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int b() {
        return ((Integer) lst.d(Integer.valueOf(this.i))).intValue();
    }

    public void f(int i) {
        this.i = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void b(float f) {
        this.r = ((Float) lst.d(Float.valueOf(f))).floatValue();
    }

    public void e(long j) {
        this.o = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public int h() {
        return ((Integer) lst.d(Integer.valueOf(this.l))).intValue();
    }

    public void l(int i) {
        this.l = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int o() {
        return ((Integer) lst.d(Integer.valueOf(this.ah))).intValue();
    }

    public void ad(int i) {
        this.ah = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int n() {
        return ((Integer) lst.d(Integer.valueOf(this.ai))).intValue();
    }

    public void x(int i) {
        this.ai = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int k() {
        return ((Integer) lst.d(Integer.valueOf(this.ad))).intValue();
    }

    public void v(int i) {
        this.ad = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int a() {
        return ((Integer) lst.d(Integer.valueOf(this.f43106b))).intValue();
    }

    public void c(int i) {
        this.f43106b = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int d() {
        return ((Integer) lst.d(Integer.valueOf(this.f43105a))).intValue();
    }

    public void d(int i) {
        this.f43105a = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int i() {
        return ((Integer) lst.d(Integer.valueOf(this.v))).intValue();
    }

    public void s(int i) {
        this.v = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public long l() {
        return ((Long) lst.d(Long.valueOf(this.aa))).longValue();
    }

    public void c(long j) {
        this.aa = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public void q(int i) {
        this.q = i;
    }

    public long f() {
        return this.u;
    }

    public void d(long j) {
        this.u = j;
    }

    public long g() {
        return this.p;
    }

    public void b(long j) {
        this.p = j;
    }

    public int e() {
        return this.e;
    }

    public void a(int i) {
        this.e = i;
    }

    public String p() {
        return this.af;
    }

    public void c(String str) {
        this.af = str;
    }

    public int c() {
        return this.f43107c;
    }

    public void b(int i) {
        this.f43107c = i;
    }

    public void g(int i) {
        this.f = i;
    }

    public void r(int i) {
        this.w = i;
    }

    public void i(int i) {
        this.g = i;
    }

    public void m(int i) {
        this.s = i;
    }

    public void t(int i) {
        this.x = i;
    }

    public void e(int i) {
        this.d = i;
    }

    public void j(int i) {
        this.h = i;
    }

    public void h(int i) {
        this.j = i;
    }

    public void u(int i) {
        this.ac = i;
    }

    public void y(int i) {
        this.ab = i;
    }

    public String r() {
        return "WorkoutReportPlayData{wdt=" + this.ae + ", hr=" + this.m + ", hz=" + this.n + ", st=" + this.z + ", cd=" + this.i + ", pa=" + this.r + ", dt=" + this.o + ", cr=" + this.l + ", tr=" + this.ah + ", td=" + this.ai + ", ta=" + this.ad + ", at=" + this.f43106b + ", aat=" + this.f43105a + ", pc=" + this.v + ", ti=" + this.aa + ", ot=" + this.q + ", rt=" + this.u + ", mm=" + this.p + ", al=" + this.e + ", cal=" + this.f43107c + ", mAnalogPower=" + this.f + ", mAnalogCadence=" + this.d + ", mAvgCadence=" + this.h + ", mAvgAnalogCadence=" + this.j + ", mThreeSecPower=" + this.ac + ", mThreeSecAnalogPower=" + this.ab + ", UUID='" + CommonUtil.n(this.af) + '}';
    }
}
