package defpackage;

import com.huawei.caloriecalculate.ActivityCaloriesCalculateApi;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CalculateCaloriesUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class iye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected float f38202a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f38203b = 0.0f;
    private long e = 0;

    public void c(ActivityCaloriesCalculateApi activityCaloriesCalculateApi, float f, float f2, int i) {
        this.f38202a = this.f38203b + c(activityCaloriesCalculateApi, e(f, f2, i));
        LogUtil.a(d(), "updateCalorie, ", Float.valueOf(this.f38202a), " speed = ", Float.valueOf(f), " stepRate = ", Float.valueOf(f2));
    }

    public void e(float f, long j, float f2) {
        if (j - this.e <= 0) {
            ReleaseLogUtil.e(d(), "updateCalorie : duration <= 0");
            return;
        }
        this.f38202a += (float) CalculateCaloriesUtils.c(f / 1000.0f, f2);
        this.e = j;
        LogUtil.a(d(), "updateClimbCalorie, ", Float.valueOf(this.f38202a), " sportDuration, ", Long.valueOf(this.e));
    }

    public float c() {
        return this.f38202a;
    }

    public void b(float f) {
        this.f38202a = f;
        LogUtil.a(d(), "setCalorie: ", Float.valueOf(f));
    }

    public void c(float f) {
        this.f38203b = f;
        this.f38202a = f;
        LogUtil.a(d(), "setRecoveryCalorie: ", Float.valueOf(this.f38203b));
    }

    public void d(float f) {
        this.f38202a *= f;
        LogUtil.a(d(), "changeRatioOfCalories: ", Float.valueOf(this.f38202a));
    }

    protected float c(ActivityCaloriesCalculateApi activityCaloriesCalculateApi, chg chgVar) {
        return Math.max(activityCaloriesCalculateApi != null ? (float) activityCaloriesCalculateApi.calculateTotalCalories(System.currentTimeMillis(), chgVar) : 0.0f, 0.0f);
    }

    private chg e(float f, float f2, int i) {
        if (i == 264) {
            return new chg.c().b(f2).b();
        }
        return new chg.c().b(f2).e(f).b();
    }

    protected String d() {
        return "Track_CalorieCalculate";
    }
}
