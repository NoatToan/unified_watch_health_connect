package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class ffj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("resultDesc")
    private String f33992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("resultCode")
    private int f33993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("messages")
    private List<fes> f33994c;

    @SerializedName("unReadMsgCount")
    private int d;

    public int e() {
        return this.f33993b;
    }

    public List<fes> d() {
        return this.f33994c;
    }

    public int b() {
        return this.d;
    }

    public String toString() {
        return "DoctorImInfoResponse{mResultCode=" + this.f33993b + ", mResultDescription=" + this.f33992a + ", mDoctorImInfoMapList=" + this.f33994c + "}";
    }
}
