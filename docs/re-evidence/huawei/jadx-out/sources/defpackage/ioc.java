package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ioc implements IRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("labelConfig")
    private List<inz> f37898c;

    public ioc(List<inz> list) {
        this.f37898c = list;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataRecommend/v1/labelConfig/saveUserLabelConfig";
    }
}
