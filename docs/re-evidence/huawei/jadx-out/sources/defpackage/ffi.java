package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class ffi implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("idList")
    private List<ffb> f33991b;

    public ffi(List<ffb> list) {
        this.f33991b = list;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/profile/getUserSampleConfig";
    }
}
