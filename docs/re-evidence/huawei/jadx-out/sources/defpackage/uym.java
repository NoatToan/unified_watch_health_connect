package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes19.dex */
public class uym implements IRequest {

    @SerializedName("orderCode")
    private String d;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("tradeService") + "/tradeservice/v1/invoice-download?orderCode=" + this.d;
    }

    public void c(String str) {
        this.d = str;
    }
}
