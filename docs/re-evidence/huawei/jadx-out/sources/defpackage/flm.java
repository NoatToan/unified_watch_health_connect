package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;
import java.util.Set;

/* JADX INFO: loaded from: classes29.dex */
public class flm implements IRequest {

    @SerializedName("dataTypeNames")
    private Set<String> d;

    @SerializedName("serviceId")
    private int e = 0;

    public void e(Set<String> set) {
        this.d = set;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthRecommendUrl") + "/dataRecommend/userlabel/queryLabelRuleByService";
    }
}
