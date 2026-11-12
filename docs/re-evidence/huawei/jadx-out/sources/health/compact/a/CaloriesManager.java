package health.compact.a;

import android.content.Context;
import com.huawei.caloriecalculate.ActivityCaloriesCalculateApi;
import com.huawei.health.connectivity.extendstepcounter.ExtendStepDataManager;
import com.huawei.health.manager.CaloriesManager$CaloriesData;
import com.huawei.health.manager.common.SingleDayBaseManager;
import com.huawei.health.manager.util.UserInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.chh;
import defpackage.lsl;
import defpackage.npt;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class CaloriesManager extends SingleDayBaseManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static CaloriesManager f36520a;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DistanceManager f36521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ExtendStepDataManager f36522c;
    private CaloriesManager$CaloriesData e;
    private int f;
    private long g;
    private double h;
    private int i;
    private int j;
    private UserInfo l;

    private CaloriesManager(Context context, DistanceManager distanceManager, ExtendStepDataManager extendStepDataManager) {
        super(context);
        this.l = null;
        this.f36521b = null;
        this.g = 0L;
        this.f = 0;
        this.i = 0;
        this.h = 0.0d;
        this.j = 0;
        if (distanceManager == null) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_CaloriesManager", "distanceManager is null");
            return;
        }
        this.f36521b = distanceManager;
        this.f36522c = extendStepDataManager;
        com.huawei.hwlogsmodel.LogUtil.a("Step_CaloriesManager", "init DistanceManager context=", context);
        this.e = e();
        this.l = UserInfo.a();
        com.huawei.hwlogsmodel.LogUtil.a("Step_CaloriesManager", "init mIsSupportExtendStep=", Boolean.valueOf(this.mIsSupportExtendStep));
    }

    public static CaloriesManager b(Context context, DistanceManager distanceManager, ExtendStepDataManager extendStepDataManager) {
        CaloriesManager caloriesManager;
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_CaloriesManager", "context = null");
            context = BaseApplication.getContext();
        }
        if (distanceManager == null) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_CaloriesManager", "distanceManager = null");
            distanceManager = DistanceManager.a(context);
        }
        synchronized (d) {
            if (f36520a == null) {
                f36520a = new CaloriesManager(context, distanceManager, extendStepDataManager);
            }
            caloriesManager = f36520a;
        }
        return caloriesManager;
    }

    private void d() throws Exception {
        checkDataConsistency(this.e.b(), this.mEventClock.c());
    }

    @Override // com.huawei.health.manager.common.SingleDayBaseManager
    public void reduceClass() {
        synchronized (d) {
            super.reduceClass();
            a(System.currentTimeMillis());
        }
    }

    public void a(long j) {
        synchronized (d) {
            if (this.e == null) {
                com.huawei.hwlogsmodel.LogUtil.j("Step_CaloriesManager", "mCaloriesData is null");
                return;
            }
            this.mEventClock.b(j);
            try {
                d();
            } catch (Exception unused) {
                this.e.d();
                this.e.e(j, 0.0d);
                com.huawei.hwlogsmodel.LogUtil.j("Step_CaloriesManager", "clearDiff checkDataConsistency error:", " caloriesDiff reset zero");
            }
            this.e.d();
        }
    }

    private CaloriesManager$CaloriesData e() {
        CaloriesManager$CaloriesData caloriesManager$CaloriesData = new CaloriesManager$CaloriesData();
        com.huawei.hwlogsmodel.LogUtil.a("Step_CaloriesManager", "initDiffCaloriesfromFile");
        if (this.mContext == null) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_CaloriesManager", "initDiffCaloriesfromFile mContext null");
            return caloriesManager$CaloriesData;
        }
        String[] strArrJ = SharedPerferenceUtils.j(this.mContext);
        try {
            if (strArrJ == null) {
                com.huawei.hwlogsmodel.LogUtil.j("Step_CaloriesManager", "initDiffCaloriesfromFile diffCalArray null");
                return caloriesManager$CaloriesData;
            }
            long j = Long.parseLong(strArrJ[0]);
            if (lsl.c(System.currentTimeMillis(), j)) {
                caloriesManager$CaloriesData.f8032a = j;
                caloriesManager$CaloriesData.f8033b = Double.parseDouble(strArrJ[1]);
                com.huawei.hwlogsmodel.LogUtil.a("Step_CaloriesManager", "initDiffCaloriesfromFile timestampRecord=", Long.valueOf(j));
                return caloriesManager$CaloriesData;
            }
            return caloriesManager$CaloriesData;
        } catch (NumberFormatException e) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_CaloriesManager", "initDiffCaloriesfromFile ", e.getMessage());
            caloriesManager$CaloriesData.d();
        }
    }

    public void d(long j, int i, int i2) {
        synchronized (d) {
            if (this.e == null) {
                com.huawei.hwlogsmodel.LogUtil.j("Step_CaloriesManager", "CaloriesData is null");
                return;
            }
            com.huawei.hwlogsmodel.LogUtil.a("Step_CaloriesManager", "syncCalories eventTimestamp=", Long.valueOf(j), " steps=", Integer.valueOf(i), " calDB ", Integer.valueOf(i2));
            this.mEventClock.b(j);
            try {
                d();
            } catch (Exception unused) {
                this.e.d();
                this.e.e(j, 0.0d);
                com.huawei.hwlogsmodel.LogUtil.j("Step_CaloriesManager", "syncCalories checkDataConsistency error:", " caloriesDiff reset eventTimestamp=", Long.valueOf(j));
            }
            int iE = e(j, i, true);
            this.j = Math.max(i2, this.j);
            if (i2 > iE) {
                this.e.d(i2 - iE);
                b(j, this.e.f8033b);
            }
        }
    }

    private void b(long j, double d2) {
        if (this.mContext != null) {
            SharedPerferenceUtils.a(this.mContext, j, d2);
            health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_CaloriesManager", npt.d("saveCaloriesToFile total db caloriesdiff mIsSupportExtendStep", Boolean.valueOf(this.mIsSupportExtendStep), " diffCal ", Double.valueOf(d2)));
        }
    }

    public int d(long j, int i) {
        double d2 = this.j % 1000;
        double dAbs = Math.abs(this.e.f8033b - this.h);
        ExtendStepDataManager extendStepDataManager = this.f36522c;
        int iJ = extendStepDataManager != null ? extendStepDataManager.j() : 0;
        if (i == 0 || Math.abs(i - this.f) > 25 || d2 + dAbs > 1000.0d || (iJ != 0 && Math.abs(iJ - this.i) > 0)) {
            this.j = e(j, i, false);
            this.f = i;
            this.h = this.e.f8033b;
            this.i = iJ;
        }
        return this.j;
    }

    public int e(long j, int i, boolean z) {
        double dA;
        synchronized (d) {
            if (this.e == null) {
                com.huawei.hwlogsmodel.LogUtil.j("Step_CaloriesManager", "CaloriesData is null");
                return 0;
            }
            this.mEventClock.b(j);
            try {
                d();
            } catch (Exception unused) {
                this.e.d();
                this.e.e(j, 0.0d);
                com.huawei.hwlogsmodel.LogUtil.j("Step_CaloriesManager", "acquireDistance checkDataConsistency error:", " caloriesDiff reset eventTimestamp=", Long.valueOf(j));
            }
            double dE = e(i);
            if (this.mIsSupportExtendStep) {
                dA = this.f36522c.a() + this.e.f8033b;
                if (!z && dE > dA) {
                    dA = dE;
                }
            } else {
                dA = this.e.f8033b + dE;
            }
            int i2 = (int) dA;
            long jA = com.huawei.hwlogsmodel.LogUtil.a(2000, this.g);
            if (jA != -1) {
                health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_CaloriesManager", npt.d("acquireDistance stepsSum =", Integer.valueOf(i), " mIsSupportExtendStep = ", Boolean.valueOf(this.mIsSupportExtendStep), " isForceTruth ", Boolean.valueOf(z), " stepCal ", Double.valueOf(dE), " calNow ", Integer.valueOf(i2)));
                this.g = jA;
            }
            return i2;
        }
    }

    private double e(int i) {
        if (i == 0) {
            return 0.0d;
        }
        ActivityCaloriesCalculateApi activityCaloriesCalculateApi = (ActivityCaloriesCalculateApi) Services.b("BaseSportModel", ActivityCaloriesCalculateApi.class);
        chh.c cVar = new chh.c();
        UserInfo userInfo = this.l;
        if (userInfo != null) {
            cVar.c(userInfo.e()).e(this.l.c() / 100.0f).c(this.l.j()).b(this.l.b());
        }
        activityCaloriesCalculateApi.initUserInfo(cVar.c());
        activityCaloriesCalculateApi.initCalculateCalories(lsl.r(new Date().getTime()), -1);
        if (activityCaloriesCalculateApi != null) {
            return activityCaloriesCalculateApi.calculateCaloriesFromSteps(System.currentTimeMillis(), i) * 1000.0d;
        }
        return 0.0d;
    }
}
