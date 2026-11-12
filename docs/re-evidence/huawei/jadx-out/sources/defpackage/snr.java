package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes43.dex */
public class snr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("resultCode")
    private int f48435a;

    @SerializedName("audioWorkoutDetail")
    private snk d;

    public String toString() {
        return "AudioWorkoutRsp{audioWorkoutDetail=" + this.d + ", resultCode=" + this.f48435a + '}';
    }
}
