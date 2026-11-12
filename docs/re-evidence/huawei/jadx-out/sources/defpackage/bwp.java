package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes23.dex */
public class bwp extends bwg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("challengeEndTime")
    private int f1256a;

    @SerializedName("challengeTime")
    private int e;

    public void d(int i) {
        this.e = i;
    }

    public void c(int i) {
        this.f1256a = i;
    }

    @Override // defpackage.bwg, com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("achievementUrl") + "/achievement/getHealthLifeChallenges";
    }
}
