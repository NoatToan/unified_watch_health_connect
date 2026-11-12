package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes23.dex */
public class bwi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("currentVersion")
    private long f1233a;

    @SerializedName("resultCode")
    private int d;

    public int b() {
        return this.d;
    }

    public long a() {
        return this.f1233a;
    }

    public String toString() {
        return "HealthModelBaseResponse{mResultCode=" + this.d + ", currentVersion=" + this.f1233a + "}";
    }
}
