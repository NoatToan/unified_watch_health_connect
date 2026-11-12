package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes23.dex */
public class cuk implements IRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("activityId")
    private String f31307c;

    @SerializedName("groupId")
    private String e;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.getContext()).getUrl("activityUrl") + "/activity/v2/group/getUserLocShareInfo";
    }
}
