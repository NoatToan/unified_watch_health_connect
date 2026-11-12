package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes23.dex */
public class bwg implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("timeZone")
    private String f1230b = lsl.q(System.currentTimeMillis());

    @SerializedName("iVersion")
    private String d;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return null;
    }

    public bwg() {
        this.d = Utils.o() ? "2" : "3";
    }
}
