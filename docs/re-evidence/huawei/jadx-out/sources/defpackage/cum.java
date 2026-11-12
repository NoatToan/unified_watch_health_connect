package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes23.dex */
public class cum implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("queryType")
    private int f31310a;

    public void e(int i) {
        this.f31310a = i;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.getContext()).getUrl("activityUrl") + "/activity/v2/getMyGrpActivityList";
    }
}
