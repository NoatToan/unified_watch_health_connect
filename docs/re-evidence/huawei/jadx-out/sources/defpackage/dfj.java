package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class dfj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("alarmId")
    private int f31737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("enabled")
    private boolean f31738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("daysOfWeek")
    private int f31739c;

    @SerializedName("minute")
    private int d;

    @SerializedName("hour")
    private int e;

    @SerializedName("planId")
    private int g;

    public int b() {
        return this.f31737a;
    }

    public void d(int i) {
        this.f31737a = i;
    }

    public int i() {
        return this.g;
    }

    public void c(int i) {
        this.g = i;
    }

    public int c() {
        return this.e;
    }

    public void a(int i) {
        this.e = i;
    }

    public int a() {
        return this.d;
    }

    public void e(int i) {
        this.d = i;
    }

    public int d() {
        return this.f31739c;
    }

    public void b(int i) {
        this.f31739c = i;
    }

    public boolean e() {
        return this.f31738b;
    }

    public void c(boolean z) {
        this.f31738b = z;
    }

    public String toString() {
        return "BloodPressureAlarmInfoCloud{mAlarmId=" + this.f31737a + ", mPlanId=" + this.g + ", mHour=" + this.e + ", mMinute=" + this.d + ", mDaysOfWeek=" + this.f31739c + ", mEnabled=" + this.f31738b + "}";
    }
}
