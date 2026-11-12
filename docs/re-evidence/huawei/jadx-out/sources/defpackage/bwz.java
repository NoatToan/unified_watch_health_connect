package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.GRSManager;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bwz extends bwg {

    @SerializedName("ids")
    private List<Integer> d;

    public void c(List<Integer> list) {
        this.d = list;
    }

    @Override // defpackage.bwg, com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("achievementUrl") + "/achievement/getHealthLifeConDays";
    }
}
