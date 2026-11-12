package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bwu extends bwi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.KAKA_CHECKED_IN_RECORDES)
    private List<HealthLifeBean> f1261b;

    public List<HealthLifeBean> c() {
        return this.f1261b;
    }

    @Override // defpackage.bwi
    public String toString() {
        return "HealthModelRecordResponse{records=" + this.f1261b + "}";
    }
}
