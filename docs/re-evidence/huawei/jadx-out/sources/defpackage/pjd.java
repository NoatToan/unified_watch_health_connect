package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.network.embedded.k;

/* JADX INFO: loaded from: classes14.dex */
public class pjd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("functionName")
    private String f45485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("functionId")
    private String f45486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(k.g)
    private int f45487c;

    public String d() {
        return this.f45486b;
    }

    public int b() {
        return this.f45487c;
    }

    public String toString() {
        return "FunctionEntranceInfo{mFunctionId=" + this.f45486b + ", mFunctionName=" + this.f45485a + ", mEnable=" + this.f45487c + '}';
    }
}
