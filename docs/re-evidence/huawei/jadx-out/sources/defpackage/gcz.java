package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes29.dex */
public class gcz implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("pathId")
    private String f34915b;

    @SerializedName("pageIndex")
    private int d;

    @SerializedName(IAchieveDBMgr.PARAM_PAGE_SIZE)
    private int e;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataAnalyse/inner/getFeedbackInfos";
    }

    public String toString() {
        return "GetFeedbackInfosReq{pageIndex=" + this.d + ", pageSize=" + this.e + ", pathId='" + this.f34915b + "'}";
    }
}
