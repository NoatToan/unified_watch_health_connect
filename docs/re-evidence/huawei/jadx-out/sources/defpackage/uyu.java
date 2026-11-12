package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes19.dex */
public class uyu implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("orderCode")
    private String f50754a;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("tradeService") + "/tradeservice/v1/invoice-queryResult?orderCode=" + this.f50754a;
    }

    public void e(String str) {
        this.f50754a = str;
    }
}
