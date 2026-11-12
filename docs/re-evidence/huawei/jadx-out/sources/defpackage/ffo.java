package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class ffo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("infoList")
    private List<fez> f33998b;

    @SerializedName("resultCode")
    private int e;

    public int c() {
        return this.e;
    }

    public List<fez> e() {
        return this.f33998b;
    }

    public String toString() {
        return "GetUserSampleConfigResponse{mResultCode=" + this.e + ", mGetUserSampleConfigResultList=" + this.f33998b + "}";
    }
}
