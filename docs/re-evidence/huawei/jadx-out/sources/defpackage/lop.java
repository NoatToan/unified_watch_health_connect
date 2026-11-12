package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes10.dex */
public class lop implements IRequest {
    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthRecommendUrl") + "/dataRecommend/v1/abtest/getStrategy";
    }
}
