package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes23.dex */
public class czk implements IRequest {

    @SerializedName("timeZone")
    private String e;

    public void d(String str) {
        this.e = str;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.getContext()).getUrl("healthCloudUrl") + "/healthExpansion/toDo";
    }

    public String toString() {
        return "TodoTaskBaseReq{, timeZone='" + this.e + "'}";
    }
}
