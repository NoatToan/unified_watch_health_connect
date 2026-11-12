package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes28.dex */
public class eye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("deepSleepDuration")
    private int f33676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("day")
    private String f33677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("allSleepDuration")
    private long f33678c;

    @SerializedName("fallAsleepTime")
    private long d;

    @SerializedName("deepSleepReferenceRange")
    private String e;

    @SerializedName("wakeupTime")
    private long f;

    @SerializedName("sleepScore")
    private int g;

    public void a(String str) {
        this.f33677b = str;
    }

    public void b(long j) {
        this.d = j;
    }

    public void c(long j) {
        this.f = j;
    }

    public void a(long j) {
        this.f33678c = j;
    }

    public void d(int i) {
        this.g = i;
    }

    public void e(int i) {
        this.f33676a = i;
    }

    public void d(String str) {
        this.e = str;
    }
}
