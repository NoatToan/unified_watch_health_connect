package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lpp implements IRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("userLabels")
    private List<lpn> f40605c;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataRecommend/userlabel/saveUserLabel";
    }

    public void e(List<lpn> list) {
        this.f40605c = list;
    }
}
