package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes17.dex */
public class snn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("audioWorkoutDetail")
    private snk f48424b;

    @SerializedName("onlineDate")
    private String e;

    public snk d() {
        return this.f48424b;
    }

    public String a() {
        return this.e;
    }

    public String toString() {
        return "AudioWorkoutDetailByDate{audioWorkoutDetail=" + this.f48424b + ", onlineDate='" + this.e + "'}";
    }
}
