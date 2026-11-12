package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.GRSManager;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class cyr implements IRequest {

    @SerializedName(ParsedFieldTag.KAKA_CHECKED_IN_RECORDES)
    private List<cys> d;

    public void e(List<cys> list) {
        this.d = list;
    }

    public String toString() {
        return "UpdateActiveTargetReq{records=" + this.d + '}';
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("achievementUrl") + "/achievement/updateGoalRecord";
    }
}
