package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class cxw implements IRequest {

    @SerializedName("followUsers")
    private List<Long> e;

    public void c(List<Long> list) {
        this.e = list;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/healthCare/familyCare/deleteFollowUsers";
    }
}
