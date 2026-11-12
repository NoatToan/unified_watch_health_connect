package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.healthmodel.bean.HealthLifeStatistic;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bww extends bwi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("statisticList")
    private List<HealthLifeStatistic> f1264a;

    @SerializedName("maxDays")
    private int d;

    public int e() {
        return this.d;
    }

    public List<HealthLifeStatistic> d() {
        return this.f1264a;
    }

    @Override // defpackage.bwi
    public String toString() {
        return "HealthModelStatResponse{mMaxDays=" + this.d + "mHealthLiftStatisticList=" + this.f1264a + "}";
    }
}
