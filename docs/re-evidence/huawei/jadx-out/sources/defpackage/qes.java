package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes43.dex */
public class qes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("endDay")
    private Integer f46072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("version")
    private long f46073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("timeZone")
    private String f46074c;

    @SerializedName(TypedValues.Custom.S_DIMENSION)
    private String d;

    @SerializedName("startDay")
    private Integer e;

    public String c() {
        return this.d;
    }

    public long d() {
        return this.f46073b;
    }

    public void a(long j) {
        this.f46073b = j;
    }

    public String toString() {
        return "HealthLifeConf{dimension='" + this.d + ", version=" + this.f46073b + ", endDay=" + this.f46072a + ", startDay=" + this.e + ", timeZone='" + this.f46074c + '}';
    }
}
