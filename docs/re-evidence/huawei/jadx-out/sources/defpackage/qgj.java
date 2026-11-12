package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiDateUtil;

/* JADX INFO: loaded from: classes15.dex */
public class qgj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("effectiveGoal")
    private int f46184a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("lastEffectiveGoal")
    private int f46185c;

    @SerializedName("effectiveTime")
    private long d = -1;

    @SerializedName("goalKey")
    private String e;

    public int c() {
        if (d()) {
            return this.f46184a;
        }
        return this.f46185c;
    }

    private boolean d() {
        long j = this.d;
        if (j != -1 && j != 0) {
            return j <= HiDateUtil.g(System.currentTimeMillis());
        }
        LogUtil.j("ActiveGoalModel", "isGoalEffective mEffectiveTime is not init ok");
        return false;
    }

    public String toString() {
        return "ActiveGoalModel{mGoalKey='" + this.e + "', mLastEffectiveGoal=" + this.f46185c + ", mEffectiveGoal=" + this.f46184a + ", mEffectiveTime=" + this.d + '}';
    }
}
