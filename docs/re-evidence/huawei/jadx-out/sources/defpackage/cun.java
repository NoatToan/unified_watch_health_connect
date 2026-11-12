package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.featuregroup.constants.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes5.dex */
public class cun implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("syncDevice")
    private DeviceInfo f31311b;

    @SerializedName("activityId")
    private String d;

    @SerializedName("groupId")
    private String e;

    public void b(String str) {
        this.d = str;
    }

    public void a(String str) {
        this.e = str;
    }

    public void d(DeviceInfo deviceInfo) {
        this.f31311b = deviceInfo;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.getContext()).getUrl("activityUrl") + "/activity/v2/group/setUserSyncDevice";
    }
}
