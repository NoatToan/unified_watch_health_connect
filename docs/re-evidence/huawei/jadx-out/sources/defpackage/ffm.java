package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes28.dex */
public class ffm implements IRequest {

    @SerializedName("type")
    private String d;

    @SerializedName("startDay")
    private long e;

    public void c(String str) {
        this.d = str;
    }

    public void d(long j) {
        this.e = j;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/healthExpansion/healthReport/queryHealthReport";
    }
}
