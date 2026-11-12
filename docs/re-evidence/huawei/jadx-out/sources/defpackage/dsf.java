package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes27.dex */
public class dsf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mAerobic")
    private int f32309c;
    private float d;

    @SerializedName("mAnaerobic")
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    @SerializedName("mFatburn")
    private int j;

    @SerializedName("mLimit")
    private int k;
    private int l;
    private String m;
    private String n;
    private int o;

    @SerializedName("mWarmup")
    private int p;
    private String q;
    private int r;
    private int s;
    private int t;

    public void a(String str) {
        this.n = str;
    }

    public String o() {
        return this.m;
    }

    public void d(String str) {
        this.m = str;
    }

    public void l(int i) {
        this.r = i;
    }

    public int f() {
        return this.i;
    }

    public void f(int i) {
        this.i = i;
    }

    public int i() {
        return this.h;
    }

    public void h(int i) {
        this.h = i;
    }

    public int g() {
        return this.f;
    }

    public void d(int i) {
        this.f = i;
    }

    public int m() {
        return this.l;
    }

    public void k(int i) {
        this.l = i;
    }

    public int n() {
        return this.o;
    }

    public void o(int i) {
        this.o = i;
    }

    public float b() {
        return this.d;
    }

    public void a(float f) {
        this.d = f;
    }

    public int c() {
        return this.f32307a;
    }

    public void a(int i) {
        this.f32307a = i;
    }

    public void n(int i) {
        this.t = i;
    }

    public int h() {
        return this.g;
    }

    public void i(int i) {
        this.g = i;
    }

    public int p() {
        return this.s;
    }

    public void m(int i) {
        this.s = i;
    }

    public int e() {
        return this.f32308b;
    }

    public void e(int i) {
        this.f32308b = i;
    }

    public int l() {
        return this.k;
    }

    public void g(int i) {
        this.k = i;
    }

    public int a() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public int d() {
        return this.f32309c;
    }

    public void c(int i) {
        this.f32309c = i;
    }

    public int j() {
        return this.j;
    }

    public void j(int i) {
        this.j = i;
    }

    public int s() {
        return this.p;
    }

    public void p(int i) {
        this.p = i;
    }

    public String k() {
        return this.q;
    }

    public void e(String str) {
        this.q = str;
    }

    public String toString() {
        return "PostureRecord{id='" + this.n + "', postureId='" + this.m + "', startTime=" + this.t + ", endTime=" + this.g + ", totalTime=" + this.s + ", userTime=" + this.r + ", goalType=" + this.i + ", goal=" + this.h + ", doneCount=" + this.f + ", minHeartRate=" + this.l + ", maxHeartRate=" + this.o + ", mLimit=" + this.k + ", mAnaerobic=" + this.e + ", mAerobic=" + this.f32309c + ", mFatburn=" + this.j + ", mWarmup=" + this.p + ", carlorie=" + this.d + ", bestRecord=" + this.f32307a + ", deviceType=" + this.f32308b + ", postureName=" + this.q + '}';
    }
}
