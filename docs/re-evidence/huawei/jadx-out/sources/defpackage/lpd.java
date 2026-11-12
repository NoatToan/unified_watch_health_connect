package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes10.dex */
public class lpd implements IRequest {

    @SerializedName("labelGroupId")
    private String d;

    @SerializedName("labelGroupName")
    private String e;

    public void c(String str) {
        this.d = str;
    }

    public void b(String str) {
        this.e = str;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataRecommend/userlabel/getLabelRuleGroup";
    }
}
