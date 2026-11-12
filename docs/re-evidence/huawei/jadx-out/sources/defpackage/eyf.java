package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes28.dex */
public class eyf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("startTime")
    private long f33679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("bpm")
    private int f33680c;

    @SerializedName("endTime")
    private long e;

    public void b(long j) {
        this.f33679b = j;
    }

    public void c(long j) {
        this.e = j;
    }

    public void e(int i) {
        this.f33680c = i;
    }

    public String toString() {
        return "RealtimeHeartRate{startTime=" + this.f33679b + ", endTime=" + this.e + ", bpm=" + this.f33680c + '}';
    }
}
