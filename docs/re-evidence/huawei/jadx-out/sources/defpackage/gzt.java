package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class gzt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mCadence")
    private int f36303c = -1;

    @SerializedName("mStepLength")
    private int l = -1;

    @SerializedName("mGroundContactTime")
    private int i = -1;

    @SerializedName("mGroundImpactAcceleration")
    private int g = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("mForeFootStrikePattern")
    private int f36302b = -1;

    @SerializedName("mWholeFootStrikePattern")
    private int p = -1;

    @SerializedName("mHindPawStrikePattern")
    private int j = -1;

    @SerializedName("mStep")
    private int o = -1;

    @SerializedName("mSwingAngle")
    private int t = -1;

    @SerializedName("mEversionExcursion")
    private int e = -101;

    @SerializedName("mHangTime")
    private int h = -1;

    @SerializedName("mImpactHangRate")
    private int n = -1;

    @SerializedName("mTimeInfo")
    private long q = -1;

    @SerializedName("mRideCadence")
    private int k = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mAverageVerticalImpactRate")
    private float f36301a = -1.0f;

    @SerializedName("mImpactPeak")
    private float m = -1.0f;

    @SerializedName("mVerticalOscillation")
    private float s = -1.0f;

    @SerializedName("mGcTimeBalance")
    private float f = -1.0f;

    @SerializedName("mVerticalRatio")
    private float r = -1.0f;

    @SerializedName("mExtraDataMap")
    private LinkedHashMap<String, String> d = new LinkedHashMap<>();

    public int d() {
        return this.f36303c;
    }

    public void b(int i) {
        this.f36303c = i;
    }

    public int l() {
        return this.l;
    }

    public void j(int i) {
        this.l = i;
    }

    public int b() {
        return this.i;
    }

    public void a(int i) {
        this.i = i;
    }

    public int f() {
        return this.g;
    }

    public void c(int i) {
        this.g = i;
    }

    public int a() {
        return this.f36302b;
    }

    public void e(int i) {
        this.f36302b = i;
    }

    public int o() {
        return this.p;
    }

    public void o(int i) {
        this.p = i;
    }

    public int j() {
        return this.j;
    }

    public void f(int i) {
        this.j = i;
    }

    public int k() {
        return this.t;
    }

    public void k(int i) {
        this.t = i;
    }

    public int e() {
        return this.e;
    }

    public void d(int i) {
        this.e = i - 100;
    }

    public int g() {
        return this.h;
    }

    public void h(int i) {
        this.h = i;
    }

    public int i() {
        return this.n;
    }

    public void g(int i) {
        this.n = i;
    }

    public void a(long j) {
        this.q = j;
    }

    public int h() {
        return this.k;
    }

    public void i(int i) {
        this.k = i;
    }

    public LinkedHashMap<String, String> c() {
        return this.d;
    }

    public String toString() {
        return "RunPostureDataInfo {mCadence = " + this.f36303c + "mStepLength = " + this.l + "mGroundContactTime = " + this.i + "mGroundImpactAcceleration = " + this.g + "mForeFootStrikePattern = " + this.f36302b + "mWholeFootStrikePattern = " + this.p + "mHindPawStrikePattern = " + this.j + "mStep = " + this.o + "mSwingAngle = " + this.t + "mEversionExcursion = " + this.e + "mHangTime = " + this.h + "mImpactHangRate = " + this.n + "mTimeInfo = " + this.q + "mRideCadence = " + this.k + "mAverageVerticalImpactRate = " + this.f36301a + "mImpactPeak = " + this.m + "mVerticalOscillation = " + this.s + "mGcTimeBalance = " + this.f + "mVerticalRatio = " + this.r + "mExtraDataMap = " + this.d.toString() + "}";
    }
}
