package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;

/* JADX INFO: loaded from: classes8.dex */
public class gud extends CloudCommonReponse {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("showData")
    private int f36038b;

    @SerializedName("count")
    private int d;

    @SerializedName("authResult")
    private int e;

    public int e() {
        return this.d;
    }

    public int c() {
        return this.f36038b;
    }

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        return "AuthRsq{authResult=" + this.e + ", showData=" + this.f36038b + ", count=" + this.d + '}';
    }
}
