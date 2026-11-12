package defpackage;

import com.huawei.haf.application.BaseApplication;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes23.dex */
public class bwq extends bwg {
    @Override // defpackage.bwg, com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("achievementUrl") + "/achievement/getHealthLife";
    }
}
