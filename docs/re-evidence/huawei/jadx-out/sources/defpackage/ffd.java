package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class ffd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("endTime")
    private int f33983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("id")
    private int f33984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("startTime")
    private int f33985c;

    @SerializedName("timestamp")
    private long e;

    public int c() {
        return this.f33984b;
    }

    public int b() {
        return this.f33985c;
    }

    public void b(int i) {
        this.f33985c = i;
    }

    public int a() {
        return this.f33983a;
    }

    public String toString() {
        return "HealthLifeChallengeBean{mId=" + this.f33984b + ", mStartTime=" + this.f33985c + ", mEndTime=" + this.f33983a + ", mTimestamp=" + this.e + "}";
    }
}
