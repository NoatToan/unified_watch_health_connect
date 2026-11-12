package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class ayx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("alarmId")
    private int f815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("hour")
    private int f816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("label")
    private String f817c;

    @SerializedName("enabled")
    private boolean d;

    @SerializedName("daysOfWeek")
    private int e;

    @SerializedName("ringTone")
    private String f;

    @SerializedName("minute")
    private int g;

    @SerializedName("toneDuration")
    private int h;

    @SerializedName("retryTimes")
    private int i;

    @SerializedName("name")
    private String j;

    @SerializedName("vibrate")
    private int k;

    @SerializedName("toneInterval")
    private int m;

    public ayx() {
        this.d = true;
        this.f816b = 7;
        this.k = 1;
        this.h = 5;
        this.m = 10;
        this.i = 3;
    }

    public ayx(int i, int i2, int i3, String str) {
        this.d = true;
        this.k = 1;
        this.h = 5;
        this.m = 10;
        this.i = 3;
        this.f815a = i;
        this.f816b = i2;
        this.g = i3;
        this.f = str;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof ayx) && d() == ((ayx) obj).d();
    }

    public int hashCode() {
        return d();
    }

    public boolean h() {
        return this.d;
    }

    public void b(boolean z) {
        this.d = z;
    }

    public int e() {
        return this.g;
    }

    public int c() {
        return this.f816b;
    }

    public int a() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public int j() {
        return this.k;
    }

    public int f() {
        return this.m;
    }

    public int b() {
        return this.i;
    }

    public int d() {
        return this.f815a;
    }

    public void c(int i) {
        this.g = i;
    }

    public void d(int i) {
        this.f816b = i;
    }
}
