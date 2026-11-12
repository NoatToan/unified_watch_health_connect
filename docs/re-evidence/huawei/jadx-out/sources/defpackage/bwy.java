package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.basichealthmodel.cloud.bean.Record;
import com.huawei.haf.application.BaseApplication;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.GRSManager;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bwy extends bwg {

    @SerializedName(ParsedFieldTag.KAKA_CHECKED_IN_RECORDES)
    private List<Record> e;

    public void b(List<Record> list) {
        this.e = list;
    }

    @Override // defpackage.bwg, com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("achievementUrl") + "/achievement/addHealthLifeRecord";
    }
}
