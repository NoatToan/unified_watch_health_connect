package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class pja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("resultCode")
    private int f45478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("functionList")
    private List<pjd> f45479b;

    @SerializedName("resultDesc")
    private String e;

    public int e() {
        return this.f45478a;
    }

    public List<pjd> b() {
        return this.f45479b;
    }

    public String toString() {
        return "FunctionEntranceResponse{mResultCode=" + this.f45478a + ", mResultDesc=" + this.e + ", mFunctionList=" + this.f45479b + '}';
    }
}
