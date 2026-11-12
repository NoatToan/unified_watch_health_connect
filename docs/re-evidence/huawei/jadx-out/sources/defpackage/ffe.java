package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.healthmodel.bean.HealthLifeStatistic;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ffe {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("maxDays")
    private int f33986c;

    @SerializedName("statisticList")
    private List<HealthLifeStatistic> d;

    @SerializedName("currentDay")
    private int e;

    public int e() {
        return this.e;
    }

    public void a(int i) {
        this.e = i;
    }

    public void b(int i) {
        this.f33986c = i;
    }

    public int c() {
        return this.f33986c;
    }

    public void e(List<HealthLifeStatistic> list) {
        this.d = list;
    }

    public List<HealthLifeStatistic> d() {
        return this.d;
    }

    public String toString() {
        return "HealthTaskConsInfo{mMaxDays=" + this.f33986c + " mHealthLiftStatisticList" + this.d + "}";
    }
}
