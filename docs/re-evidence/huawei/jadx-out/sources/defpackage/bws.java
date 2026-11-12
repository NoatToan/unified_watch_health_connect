package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bws extends bwi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.KAKA_CHECKED_IN_RECORDES)
    private List<HealthLifeBean> f1258c;

    public List<HealthLifeBean> d() {
        return this.f1258c;
    }

    @Override // defpackage.bwi
    public String toString() {
        return "HealthModelRecordResponse{records=" + this.f1258c + "}";
    }
}
