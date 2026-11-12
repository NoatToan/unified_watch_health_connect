package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class ffq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("latestJoinTime")
    private long f34001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("currentTime")
    private long f34002c;

    @SerializedName("resultCode")
    private int d;

    @SerializedName("isCreatedPlan")
    private boolean e;

    public int a() {
        return this.d;
    }

    public long d() {
        return this.f34001b;
    }

    public boolean c() {
        return this.e;
    }

    public String toString() {
        return "InterventionPlanInfoResponse{mResultCode=" + this.d + ", mLatestJoinTime=" + this.f34001b + ", mCurrentTime=" + this.f34002c + ", mIsCreatedPlan=" + this.e + '}';
    }
}
