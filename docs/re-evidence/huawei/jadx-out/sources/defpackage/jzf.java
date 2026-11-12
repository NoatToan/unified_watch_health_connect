package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class jzf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("resultCode")
    private int f39248a;

    @SerializedName("healthLifeVersionList")
    private List<fer> d;

    @SerializedName("resultDesc")
    private String e;

    public int c() {
        return this.f39248a;
    }

    public List<fer> a() {
        return this.d;
    }

    public String toString() {
        return "HealthLifeVersionResponse{mResultCode=" + this.f39248a + ", mResultDesc='" + this.e + ", mHealthLifeVersionList=" + this.d + '}';
    }
}
