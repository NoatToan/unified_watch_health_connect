package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes9.dex */
public class ins implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("pageIndex")
    private int f37876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("serviceId")
    private int f37877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(IAchieveDBMgr.PARAM_PAGE_SIZE)
    private int f37878c;

    @SerializedName("filterType")
    private int e;

    public ins(int i, int i2, int i3, int i4) {
        this.f37876a = i;
        this.f37878c = i2;
        this.e = i3;
        this.f37877b = i4;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataRecommend/v1/labelConfig/queryUserLabelConfig";
    }
}
