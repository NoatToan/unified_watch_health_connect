package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class vgt {

    @SerializedName("initialWeight")
    private float e = 0.0f;

    @SerializedName("targetWeight")
    private float d = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("fulfilledTime")
    private long f51077b = 0;

    public void c(float f) {
        this.e = f;
    }

    public void b(float f) {
        this.d = f;
    }

    public String toString() {
        return "WeightControlSetting{mInitialWeight=" + this.e + ", mTargetWeight=" + this.d + ", mFulfilledTime=" + this.f51077b + '}';
    }
}
