package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes28.dex */
public class ffp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("resultDesc")
    private String f33999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("healthWeekReport")
    private ffc f34000c;

    @SerializedName("resultCode")
    private int e;

    public int a() {
        return this.e;
    }

    public ffc d() {
        return this.f34000c;
    }

    public String toString() {
        return "HealthReportResponse{mResultCode=" + this.e + ", mResultDescription=" + this.f33999b + ", mHealthWeekReport=" + this.f34000c + "}";
    }
}
