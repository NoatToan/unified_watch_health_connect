package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class ciq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f1624c;
    private long d;
    private int e;
    private int f;
    private long g;
    private int h;

    @SerializedName("snoreFreq")
    private int i;
    private float j;
    private long k;

    public void e(long j) {
        this.g = j;
    }

    public long h() {
        return this.g;
    }

    public void b(long j) {
        this.f1624c = j;
    }

    public long c() {
        return this.f1624c;
    }

    public void c(long j) {
        this.k = j;
    }

    public long i() {
        return this.k;
    }

    public void e(int i) {
        this.h = i;
    }

    public int f() {
        return this.h;
    }

    public void a(int i) {
        this.f = i;
    }

    public int a() {
        return this.f;
    }

    public void d(long j) {
        this.d = j;
    }

    public long b() {
        return this.d;
    }

    public void c(float f) {
        this.j = f;
    }

    public float j() {
        return this.j;
    }

    public void d(int i) {
        this.e = i;
    }

    public int d() {
        return this.e;
    }

    public void b(int i) {
        this.f1623b = i;
    }

    public int e() {
        return this.f1623b;
    }

    public void c(int i) {
        this.i = i;
    }

    public int g() {
        return this.i;
    }

    public String toString() {
        return "SleepCalcFrame{startTime=" + this.g + "fallAsleepTime=" + this.f1624c + "wakeUpTime=" + this.k + "sleepScore=" + this.h + "sleepLatency=" + this.f + "goBedTime=" + this.d + "validData=" + this.j + "sleepEfficiency=" + this.e + "deepSleepTime=" + this.f1622a + "deepSleepPart=" + this.f1623b + "snoreFrequency=" + this.i;
    }
}
