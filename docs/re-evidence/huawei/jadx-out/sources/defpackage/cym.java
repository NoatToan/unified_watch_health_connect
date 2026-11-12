package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes6.dex */
public class cym implements IRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("iVersion")
    private String f31497c;

    public void e(String str) {
        this.f31497c = str;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("achievementUrl") + "/achievement/getGoalList";
    }
}
