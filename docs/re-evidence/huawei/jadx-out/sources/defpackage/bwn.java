package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes23.dex */
public class bwn extends bwy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("operType")
    private int f1253b;

    @SerializedName("timestamp")
    private long d;

    public void e(long j) {
        this.d = j;
    }

    public void a(int i) {
        this.f1253b = i;
    }

    @Override // defpackage.bwy, defpackage.bwg, com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("achievementUrl") + "/achievement/addHealthLifeConfig";
    }
}
