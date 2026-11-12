package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes23.dex */
public class bwv extends bwg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("challengeId")
    private int f1263c;

    @SerializedName("status")
    private int d;

    @SerializedName("timestamp")
    private long e = System.currentTimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.RECORD_DAY)
    private int f1262b = DateFormatUtil.a(System.currentTimeMillis());

    public void c(int i) {
        this.f1263c = i;
    }

    public void a(int i) {
        this.d = i;
    }

    @Override // defpackage.bwg, com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("achievementUrl") + "/achievement/updateHealthLifeChallenge";
    }
}
