package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;

/* JADX INFO: loaded from: classes3.dex */
public class pqo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HeartZoneConf f45844a = new HeartZoneConf();

    @SerializedName("walkRunThreshold")
    private int o = 110;

    @SerializedName("climbThreshold")
    private int h = 60;

    @SerializedName("heartRateThreshold")
    private int g = 65;

    @SerializedName("cycleSpeedThreshold")
    private int j = 80;

    @SerializedName("sampleThreshold")
    private int n = 3;

    @SerializedName("countLength")
    private int f = 5;

    @SerializedName("walkRunThreshold_v2")
    private int r = 105;

    @SerializedName("climbThreshold_v2")
    private int d = 60;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("heartRateThreshold_v2")
    private int f45846c = 20;

    @SerializedName("cycleSpeedThreshold_v2")
    private int e = 88;

    @SerializedName("sampleThreshold_v2")
    private int k = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("countLength_v2")
    private int f45845b = 1;

    @SerializedName("walkRunThresholdWithHeartRate_v2")
    private int m = 40;

    @SerializedName("heartRateThreshold_v3")
    private int i = 25;

    @SerializedName("walkRunSpeedThreshold_v2")
    private int l = 40;

    public int o() {
        return this.o;
    }

    public int a() {
        return this.h;
    }

    public int h() {
        return this.g;
    }

    public int c() {
        return this.j;
    }

    public int j() {
        return this.n;
    }

    public int b() {
        return this.f;
    }

    public void c(int i) {
        this.h = i;
    }

    public void i(int i) {
        this.g = i;
    }

    public void b(int i) {
        this.j = i;
    }

    public void h(int i) {
        this.n = i;
    }

    public void d(int i) {
        this.f = i;
    }

    public int k() {
        return this.l;
    }

    public void o(int i) {
        this.l = i;
    }

    public void n(int i) {
        this.o = i;
    }

    public int b(HeartZoneConf heartZoneConf) {
        return (int) (((g() / 100.0f) * (heartZoneConf.getMaxThreshold() - heartZoneConf.getRestHeartRate())) + heartZoneConf.getRestHeartRate());
    }

    public int l() {
        return this.r;
    }

    public void k(int i) {
        this.r = i;
    }

    public int e() {
        return this.d;
    }

    public void e(int i) {
        this.d = i;
    }

    public int f() {
        return this.e;
    }

    public void j(int i) {
        this.e = i;
    }

    public int i() {
        return this.k;
    }

    public void g(int i) {
        this.k = i;
    }

    public int d() {
        return this.f45845b;
    }

    public void a(int i) {
        this.f45845b = i;
    }

    public int n() {
        return this.m;
    }

    public int g() {
        return this.i;
    }

    public void f(int i) {
        this.i = i;
    }

    public String toString() {
        return "SportIntensityConfig WalkRunThreshold = " + this.r + " ClimbThreshold = " + this.d + " CycleSpeedThreshold = " + this.e + " WalkRunSpeedThreshold = " + this.l + " WalkRunThresholdWithHeartRate = " + this.m + " heartRateThreshold = " + this.i;
    }
}
