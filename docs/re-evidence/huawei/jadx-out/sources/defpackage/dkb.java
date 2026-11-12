package defpackage;

import com.huawei.caloriecalculate.ActivityCaloriesCalculateApi;
import com.huawei.health.trusport_ee.Activity;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes26.dex */
@ApiDefine(uri = ActivityCaloriesCalculateApi.class)
public class dkb implements ActivityCaloriesCalculateApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f31839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f31840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f31841c;
    private double d;
    private double e;
    private imh f;

    @Override // com.huawei.caloriecalculate.ActivityCaloriesCalculateApi
    public void initUserInfo(chh chhVar) {
        try {
            this.f = new imh();
            this.f.d(new ima(chhVar.b(), chhVar.d(), chhVar.e(), djz.c(chhVar.a())));
            if (chhVar.c() > 0) {
                this.f.d(chhVar.c());
            }
        } catch (Throwable th) {
            ReleaseLogUtil.e("R_ActivityCaloriesCalculateImpl", "initUserInfo, throwable: ", LogAnonymous.b(th));
        }
    }

    @Override // com.huawei.caloriecalculate.ActivityCaloriesCalculateApi
    public void initCalculateCalories(long j, int i) {
        Activity activityE = djz.e(i);
        this.f31839a = activityE;
        if (activityE == Activity.TS_ACTIVITY_IDLE) {
            this.f31841c += this.f31840b;
            this.f31840b = 0.0d;
            this.e += this.d;
            this.d = 0.0d;
        }
        try {
            this.f.d(j, this.f31839a);
        } catch (Throwable th) {
            ReleaseLogUtil.e("R_ActivityCaloriesCalculateImpl", "initCalculateCalories, throwable: ", th.getMessage());
        }
    }

    @Override // com.huawei.caloriecalculate.ActivityCaloriesCalculateApi
    public double calculateCalories(long j) {
        imh imhVar = this.f;
        if (imhVar == null) {
            LogUtil.j("ActivityCaloriesCalculateImpl", "calculateCalories, mTruSportEe == null");
            return 0.0d;
        }
        try {
            imhVar.a(j);
        } catch (Throwable th) {
            LogUtil.j("ActivityCaloriesCalculateImpl", "calculateCalories, throwable: ", th.getMessage());
        }
        return b();
    }

    @Override // com.huawei.caloriecalculate.ActivityCaloriesCalculateApi
    public double calculateCalories(long j, chg chgVar) {
        if (chgVar == null) {
            LogUtil.j("ActivityCaloriesCalculateImpl", "calculateCalories, sampleData == null");
            return this.f31841c + this.f31840b;
        }
        if (this.f == null) {
            LogUtil.j("ActivityCaloriesCalculateImpl", "calculateCalories, mTruSportEe == null");
            return 0.0d;
        }
        e(j, chgVar);
        return b();
    }

    private void e(long j, chg chgVar) {
        img.b bVar = new img.b(j);
        if (djz.b(chgVar.a(), this.f31839a)) {
            bVar.c(chgVar.a());
        }
        if (djz.a(chgVar.e())) {
            bVar.a(chgVar.e());
        }
        if (djz.a(chgVar.b())) {
            bVar.d(chgVar.b());
        }
        try {
            this.f.d(bVar.a());
        } catch (Throwable th) {
            LogUtil.j("ActivityCaloriesCalculateImpl", "calculateCalories, throwable: ", th.getMessage());
        }
    }

    @Override // com.huawei.caloriecalculate.ActivityCaloriesCalculateApi
    public double calculateTotalCalories(long j, chg chgVar) {
        if (chgVar == null) {
            LogUtil.j("ActivityCaloriesCalculateImpl", "calculateTotalCalories, sampleData == null");
            return this.e + this.d;
        }
        if (this.f == null) {
            LogUtil.j("ActivityCaloriesCalculateImpl", "calculateTotalCalories, mTruSportEe == null");
            return 0.0d;
        }
        e(j, chgVar);
        return e();
    }

    @Override // com.huawei.caloriecalculate.ActivityCaloriesCalculateApi
    public double calculateCaloriesFromSteps(long j, int i) {
        if (this.f == null) {
            LogUtil.j("ActivityCaloriesCalculateImpl", "calculateCalories, mTruSportEe == null");
            return 0.0d;
        }
        d(j, i);
        return b();
    }

    private void d(long j, int i) {
        try {
            this.f.d(j, i);
        } catch (Throwable th) {
            LogUtil.j("ActivityCaloriesCalculateImpl", "calculateCaloriesFromSteps, throwable: ", th.getMessage());
        }
    }

    @Override // com.huawei.caloriecalculate.ActivityCaloriesCalculateApi
    public double calculateTotalCaloriesFromSteps(long j, int i) {
        if (this.f == null) {
            LogUtil.j("ActivityCaloriesCalculateImpl", "calculateCalories, mTruSportEe == null");
            return 0.0d;
        }
        d(j, i);
        return e();
    }

    @Override // com.huawei.caloriecalculate.ActivityCaloriesCalculateApi
    public float calculateCaloriesOnlyStep(long j) {
        imh imhVar = this.f;
        if (imhVar == null) {
            LogUtil.j("ActivityCaloriesCalculateImpl", "calculateCaloriesOnlyStep, mTruSportEe == null");
            return 0.0f;
        }
        try {
            return imhVar.b(j).floatValue();
        } catch (Throwable th) {
            LogUtil.j("ActivityCaloriesCalculateImpl", "calculateCaloriesOnlyStep, throwable: ", th.getMessage());
            return 0.0f;
        }
    }

    @Override // com.huawei.caloriecalculate.ActivityCaloriesCalculateApi
    public long calculateDurationByCalories(float f, int i, int i2) {
        imh imhVar = this.f;
        if (imhVar == null) {
            LogUtil.j("ActivityCaloriesCalculateImpl", "calculateDurationByCalories, mTruSportEe == null");
            return 0L;
        }
        try {
            return imhVar.c(f, djz.e(i), djz.d(i2));
        } catch (Throwable th) {
            LogUtil.j("ActivityCaloriesCalculateImpl", "calculateDurationByCalories, throwable: ", th.getMessage());
            return 0L;
        }
    }

    private double b() {
        double f37814a;
        try {
            f37814a = this.f.c() != null ? this.f.c().getF37814a() : 0.0d;
        } catch (Throwable th) {
            LogUtil.j("ActivityCaloriesCalculateImpl", "getActiveCalories, throwable: ", th.getMessage());
        }
        this.f31840b = f37814a;
        return this.f31841c + f37814a;
    }

    private double e() {
        double d;
        try {
            d = this.f.c() != null ? this.f.c().getD() : 0.0d;
        } catch (Throwable th) {
            LogUtil.j("ActivityCaloriesCalculateImpl", "getTotalCalories, throwable: ", th.getMessage());
        }
        this.d = d;
        LogUtil.a("ActivityCaloriesCalculateImpl", "current = ", Double.valueOf(d), " last = ", Double.valueOf(this.e));
        return this.e + this.d;
    }
}
