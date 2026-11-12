package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.utils.CloudParamKeys;

/* JADX INFO: loaded from: classes23.dex */
public class cjo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("state")
    private String f1636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("deviceCloudState")
    private String f1637c;

    @SerializedName(CloudParamKeys.INFO)
    private cjm e;

    public void b(String str) {
        this.f1637c = str;
    }

    public void d(String str) {
        this.f1636b = str;
    }

    public cjm e() {
        return this.e;
    }

    public void e(cjm cjmVar) {
        this.e = cjmVar;
    }
}
