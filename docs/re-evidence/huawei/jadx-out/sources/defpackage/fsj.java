package defpackage;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class fsj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34478a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private Map<Long, Integer> ae;
    private int af;
    private Map<Long, Integer> ag;
    private int ah;
    private Map<Long, Integer> ai;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f34479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f34480c;
    private int d;
    private float e;
    private float f;
    private boolean g = false;
    private long h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private long[] s;
    private int t;
    private int u;
    private int v;
    private long w;
    private int x;
    private float y;
    private float z;

    public int ad() {
        return this.aa;
    }

    public void p(int i) {
        this.aa = i;
    }

    public boolean ag() {
        return this.g;
    }

    public void e(boolean z) {
        this.g = z;
    }

    public int a() {
        return this.d;
    }

    public void b(int i) {
        this.d = i;
    }

    public int y() {
        return this.u;
    }

    public void k(int i) {
        this.u = i;
    }

    public float w() {
        return this.y;
    }

    public void b(float f) {
        this.y = f;
    }

    public int u() {
        return this.x;
    }

    public float v() {
        return this.z;
    }

    public void c(float f) {
        this.z = f;
    }

    public void n(int i) {
        this.x = i;
    }

    public int x() {
        return this.v;
    }

    public void o(int i) {
        this.v = i;
    }

    public Map<Long, Integer> af() {
        return this.ae;
    }

    public void e(Map<Long, Integer> map) {
        this.ae = map;
    }

    public Map<Long, Integer> aa() {
        return this.ag;
    }

    public void b(Map<Long, Integer> map) {
        this.ag = map;
    }

    public int ab() {
        return this.ac;
    }

    public void t(int i) {
        this.ac = i;
    }

    public int g() {
        return this.i;
    }

    public void e(int i) {
        this.i = i;
    }

    public int i() {
        return this.j;
    }

    public void a(int i) {
        this.j = i;
    }

    public int c() {
        return this.f34478a;
    }

    public void d(int i) {
        this.f34478a = i;
    }

    public int p() {
        return this.p;
    }

    public void m(int i) {
        this.p = i;
    }

    public int q() {
        return this.t;
    }

    public void l(int i) {
        this.t = i;
    }

    public float j() {
        return this.f;
    }

    public void d(float f) {
        this.f = f;
    }

    public int b() {
        return Math.round(this.e);
    }

    public float d() {
        return this.e;
    }

    public void a(float f) {
        this.e = f;
    }

    public float h() {
        return this.f34480c;
    }

    public void e(float f) {
        this.f34480c = f;
    }

    public long t() {
        return this.w;
    }

    public void e(long j) {
        this.w = j;
    }

    public void d(long j) {
        this.h = j;
    }

    public long f() {
        long j = this.f34479b;
        return j == 0 ? System.currentTimeMillis() : j;
    }

    public void c(long j) {
        this.f34479b = j;
    }

    public void a(long[] jArr) {
        this.s = jArr == null ? new long[0] : (long[]) jArr.clone();
    }

    public int z() {
        return this.af;
    }

    public void q(int i) {
        this.af = i;
    }

    public int l() {
        return this.k;
    }

    public void j(int i) {
        this.k = i;
    }

    public int ac() {
        return this.ad;
    }

    public void r(int i) {
        this.ad = i;
    }

    public int m() {
        return this.o;
    }

    public void i(int i) {
        this.o = i;
    }

    public int ai() {
        return this.ah;
    }

    public void w(int i) {
        this.ah = i;
    }

    public int r() {
        return this.r;
    }

    public void f(int i) {
        this.r = i;
    }

    public void c(boolean z) {
        this.m = z;
    }

    public boolean o() {
        return this.m;
    }

    public Map<Long, Integer> ah() {
        return this.ai;
    }

    public void c(Map<Long, Integer> map) {
        this.ai = map;
    }

    public int k() {
        return this.l;
    }

    public void c(int i) {
        this.l = i;
    }

    public void s(int i) {
        this.ab = i;
    }

    public int n() {
        return this.n;
    }

    public void h(int i) {
        this.n = i;
    }

    public int s() {
        return this.q;
    }

    public void g(int i) {
        this.q = i;
    }

    public String toString() {
        return "ActiveRecordData{mDayStep=" + this.aa + ", mStepValue=" + this.x + ", mStepGoal=" + this.v + ", mDayIntensity=" + this.ac + ", mIntensityValue=" + this.i + ", mIntensityGoal=" + this.j + ", mStandValue=" + this.p + ", mStandGoal=" + this.t + ", mDistance=" + this.f + ", mCalorie=" + this.e + ", mClimbs=" + this.f34480c + ", mDayTime=" + this.f34479b + ", mStartTime=" + this.w + ", mEndTime=" + this.h + ", mStartEndOfWeek=" + Arrays.toString(this.s) + ", mWeekAverageStep=" + this.af + ", mLastWeekAverageStep=" + this.k + ", mWeekAverageIntensity=" + this.ad + ", mLastWeekAverageIntensity=" + this.o + ", mYesterdayStand=" + this.ah + ", mLastYesterdayStand=" + this.r + ", mIsSupportFloor=" + this.m + ", mPushesVal=" + this.q + '}';
    }

    public String e() {
        return "ActiveRecordData{a=" + this.aa + ", b=" + this.x + ", c=" + this.v + ", d=" + this.ac + ", e=" + this.i + ", f=" + this.j + ", g=" + this.p + ", h=" + this.t + ", i=" + this.f + ", j=" + this.e + ", k=" + this.f34480c + ", l=" + this.f34479b + ", m=" + this.w + ", n=" + this.h + ", o=" + Arrays.toString(this.s) + ", p=" + this.af + ", q=" + this.k + ", r=" + this.ad + ", s=" + this.o + ", t=" + this.ah + ", u=" + this.r + ", v=" + this.m + ", pv=" + this.q + '}';
    }
}
