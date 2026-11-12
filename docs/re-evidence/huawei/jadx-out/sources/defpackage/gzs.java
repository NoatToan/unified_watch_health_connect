package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes8.dex */
public class gzs {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mTime")
    private long f36300c = -1;

    @SerializedName("mCadence")
    private int e = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("mDeltaCircle")
    private long f36299b = -1;

    @SerializedName("mSumCircle")
    private long d = -1;

    public void a(long j) {
        this.f36300c = j;
    }

    public int c() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    public long a() {
        return this.f36300c;
    }

    public String toString() {
        return "RidePostureDataInfo {mCadence = " + this.e + "mDeltaCircle = " + this.f36299b + "mSumCircle = " + this.d + "}";
    }
}
