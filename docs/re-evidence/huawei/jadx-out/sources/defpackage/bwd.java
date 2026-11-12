package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes23.dex */
public class bwd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("alarmId")
    private int f1224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("hour")
    private int f1225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("enabled")
    private boolean f1226c;

    @SerializedName("endHour")
    private int d;

    @SerializedName("endMinute")
    private int e;

    @SerializedName("minute")
    private int h;

    public bwd(int i, boolean z) {
        this.f1224a = i;
        this.f1226c = z;
    }

    public int e() {
        return this.f1225b;
    }

    public void d(int i) {
        this.f1225b = i;
    }

    public int a() {
        return this.h;
    }

    public void a(int i) {
        this.h = i;
    }

    public int b() {
        return this.d;
    }

    public void c(int i) {
        this.d = i;
    }

    public int d() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    public boolean c() {
        return this.f1226c;
    }

    public void c(boolean z) {
        this.f1226c = z;
    }

    public String toString() {
        return "DrinkWaterReminderBean{mAlarmId=" + this.f1224a + ", mHour=" + this.f1225b + ", mMinute=" + this.h + ", mEndHour=" + this.d + ", mEndMinute=" + this.e + ", mIsEnabled=" + this.f1226c + '}';
    }
}
