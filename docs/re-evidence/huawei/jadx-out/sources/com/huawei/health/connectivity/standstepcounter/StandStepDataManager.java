package com.huawei.health.connectivity.standstepcounter;

import android.content.Context;
import android.os.SystemClock;
import com.huawei.health.manager.ScreenOnStatisticsUtil;
import com.huawei.health.manager.util.TotalDetailStepsCacheBean;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dln;
import defpackage.ipa;
import defpackage.ipb;
import defpackage.lsl;
import defpackage.npt;
import health.compact.a.CommonUtil;
import health.compact.a.DaemonServiceSpUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.LogicalStepCounter;
import health.compact.a.SharedPerferenceUtils;
import health.compact.a.StepCounterSupport;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class StandStepDataManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f6272a;
    private boolean f;
    private boolean j;
    private dln m;
    private long n;
    private int p = 0;
    private int t = 0;
    private int o = 0;
    private int d = 0;
    private int l = 0;
    private long k = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f6273b = -1;
    private long h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6274c = 0;
    private final boolean g = CommonUtil.bg();
    private d s = new d();
    private Context e = BaseApplication.getContext();
    private long i = SharedPerferenceUtils.k(this.e);

    public interface IGetCacheTodaySteps {
        int getCacheTodaySteps();

        boolean isProcessNewDayReport(boolean z);
    }

    public StandStepDataManager() {
        this.n = 0L;
        this.f6272a = 0L;
        this.f = false;
        this.f6272a = System.currentTimeMillis();
        if (StepCounterSupport.b(this.e) == 3) {
            this.f = true;
        }
        f();
        TotalDetailStepsCacheBean totalDetailStepsCacheBeanU = SharedPerferenceUtils.u(this.e);
        if (totalDetailStepsCacheBeanU != null) {
            this.n = totalDetailStepsCacheBeanU.h();
            return;
        }
        String[] strArrX = SharedPerferenceUtils.x(this.e);
        if (strArrX != null) {
            try {
                this.n = Long.parseLong(strArrX[0]);
            } catch (NumberFormatException e) {
                LogUtil.j("Step_StandStepDtaMgr", "StandStepDataManager(context) ", e.getMessage());
            }
        }
        LogUtil.a("Step_StandStepDtaMgr", "the first init mLastReportTimestamp = ", Long.valueOf(this.n));
    }

    public static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f6275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f6276c;

        public d() {
            this(-1L, -1);
        }

        private d(long j, int i) {
            this.f6275b = j;
            this.f6276c = i;
        }

        public long e() {
            return this.f6275b;
        }

        public int d() {
            return this.f6276c;
        }
    }

    public void d(int i) {
        this.l = i;
    }

    public int a() {
        return this.l;
    }

    private void f() {
        ReleaseLogUtil.d("Step_StandStepDtaMgr", "initDataManager enter...");
        l();
        if (this.g) {
            return;
        }
        dln dlnVar = new dln();
        this.m = dlnVar;
        this.j = dlnVar.c();
    }

    public int e() {
        return this.p;
    }

    public boolean h() {
        return !lsl.c(this.n, System.currentTimeMillis());
    }

    public int g() {
        return this.t;
    }

    public void e(long j, int i) {
        if (this.s == null) {
            return;
        }
        this.n = j;
        LogUtil.d("Step_StandStepDtaMgr", "mPreSteps = ", Integer.valueOf(this.l));
        if (!lsl.c(this.s.f6275b, j) || i < this.s.f6276c) {
            if (lsl.c(this.s.f6275b, j) && i < this.s.f6276c) {
                this.s.f6276c = i;
                int i2 = this.p - this.d;
                this.o = i2;
                this.t = i2;
                SharedPerferenceUtils.d(this.e, this.s.f6275b, this.s.f6276c, this.o);
                return;
            }
            if (c(j, i - a()) || this.s.f6275b == this.f6273b) {
                ipb.k();
                l();
                return;
            }
            return;
        }
        this.p = (i - this.s.f6276c) + this.o + this.d;
        this.t = (i - this.s.f6276c) + this.o + this.f6274c;
        long jA = LogUtil.a(2000, this.h);
        if (jA != -1) {
            LogUtil.a("Step_StandStepDtaMgr", "mTodaySteps = ", Integer.valueOf(this.p), " mTodayStepsThisDevice = ", Integer.valueOf(this.t));
            this.h = jA;
        }
    }

    public boolean c(int i) {
        boolean z;
        int iC = c();
        ipb.d(this.p, iC, i);
        int iMax = Math.max(i, iC);
        int i2 = this.p;
        if (iMax > i2) {
            int i3 = (iMax - i2) + this.d;
            this.d = i3;
            this.p = iMax;
            a(i3);
            z = true;
        } else {
            z = false;
        }
        ReleaseLogUtil.d("Step_StandStepDtaMgr", npt.d("syncWithHiHealth totalSteps = ", Integer.valueOf(iMax), " mDiffStepsFromDb = ", Integer.valueOf(this.d)));
        return z;
    }

    public void d(int i, int i2, int i3, int i4, int i5) {
        ReleaseLogUtil.d("Step_StandStepDtaMgr", "recordStepsBeforeShutdown mTodaySteps = ", Integer.valueOf(this.p));
        TotalDetailStepsCacheBean.Builder builder = new TotalDetailStepsCacheBean.Builder();
        builder.b(this.n);
        builder.c(this.p);
        builder.f(i);
        builder.b(i2);
        builder.a(i3);
        builder.e(SystemClock.elapsedRealtime());
        builder.d(i4);
        builder.e(i5);
        SharedPerferenceUtils.d(this.e, builder.e());
    }

    public long b() {
        return this.k;
    }

    public boolean c(long j, boolean z) {
        d dVar = this.s;
        if (dVar == null) {
            ReleaseLogUtil.a("Step_StandStepDtaMgr", "mTodayStandardBase is null");
            return false;
        }
        if (this.f) {
            dVar.f6275b = this.f6272a;
            this.f6272a = j;
        }
        if ((!z && this.s.f6275b == -1 && this.i == -1) || (!d(j, this.s.f6275b) && !d(j, this.i))) {
            return false;
        }
        c(z, this.e);
        ReleaseLogUtil.d("Step_StandStepDtaMgr", "theDayChanged ", Long.valueOf(this.s.f6275b), " timeStamp = ", Long.valueOf(j));
        this.k = this.s.f6275b;
        m();
        return true;
    }

    private void c(boolean z, Context context) {
        boolean zB;
        if (!ipa.a(context) && this.p <= 0 && ScreenOnStatisticsUtil.e(context, this.s.f6275b)) {
            if (!z) {
                boolean zC = ipb.c(this.s.f6276c, context);
                if (LogicalStepCounter.d(this.e).i()) {
                    zB = ipb.b(this.s.f6276c, LogicalStepCounter.d(this.e).a(), context);
                } else {
                    zB = false;
                }
                if (zC || zB) {
                    DaemonServiceSpUtils.n();
                    if (DaemonServiceSpUtils.j() && DaemonServiceSpUtils.i()) {
                        DaemonServiceSpUtils.e(true);
                        return;
                    }
                    return;
                }
                return;
            }
            ipb.h();
        }
    }

    private boolean d(long j, long j2) {
        return (j2 == -1 || lsl.c(j, j2)) ? false : true;
    }

    private void m() {
        LogUtil.a("Step_StandStepDtaMgr", "initEnvironment");
        d dVar = this.s;
        if (dVar != null) {
            dVar.f6275b = -1L;
            this.s.f6276c = -1;
        }
        this.p = 0;
        this.t = 0;
        this.o = 0;
        this.d = 0;
        this.l = 0;
        this.i = -1L;
        this.f6274c = 0;
        SharedPerferenceUtils.e(this.e, -1L);
    }

    private void l() {
        TotalDetailStepsCacheBean totalDetailStepsCacheBeanU = SharedPerferenceUtils.u(this.e);
        if (totalDetailStepsCacheBeanU != null) {
            if (lsl.c(System.currentTimeMillis(), totalDetailStepsCacheBeanU.h())) {
                this.p = totalDetailStepsCacheBeanU.f();
                ReleaseLogUtil.d("Step_StandStepDtaMgr", "totalDetailStepsCacheBean != null, SystemClock.elapsedRealtime() = ", Long.valueOf(SystemClock.elapsedRealtime()));
                if (SystemClock.elapsedRealtime() < totalDetailStepsCacheBeanU.b()) {
                    c(totalDetailStepsCacheBeanU);
                }
            }
        } else {
            String[] strArrX = SharedPerferenceUtils.x(this.e);
            if (strArrX != null) {
                try {
                    if (lsl.c(System.currentTimeMillis(), Long.parseLong(strArrX[0]))) {
                        this.p = Integer.parseInt(strArrX[1]);
                        LogUtil.a("Step_StandStepDtaMgr", "SystemClock.elapsedRealtime() = ", Long.valueOf(SystemClock.elapsedRealtime()));
                        if (SystemClock.elapsedRealtime() < Long.parseLong(strArrX[5])) {
                            b(strArrX);
                        }
                    }
                } catch (NumberFormatException e) {
                    LogUtil.j("Step_StandStepDtaMgr", "reloadBasicStepDataAndTotalSteps ", e.getMessage());
                }
            }
        }
        if (!o()) {
            this.s.f6275b = -1L;
            this.s.f6276c = -1;
            this.o = 0;
            this.d = 0;
            LogUtil.d("Step_StandStepDtaMgr", "reloadBasicStepDataAndTotalSteps no record...");
        }
        j();
        LogUtil.a("Step_StandStepDtaMgr", "reload : ", LogAnonymous.d(this.s.f6276c), " restar ", LogAnonymous.d(this.o));
    }

    private void b(String[] strArr) {
        b(CommonUtil.j(strArr[1]));
        TotalDetailStepsCacheBean.Builder builder = new TotalDetailStepsCacheBean.Builder();
        builder.b(CommonUtil.i(strArr[0]));
        builder.c(CommonUtil.j(strArr[1]));
        builder.f(CommonUtil.j(strArr[2]));
        builder.b(CommonUtil.j(strArr[3]));
        builder.a(CommonUtil.j(strArr[4]));
        builder.e(SystemClock.elapsedRealtime());
        SharedPerferenceUtils.b(this.e, builder.e());
    }

    private void c(TotalDetailStepsCacheBean totalDetailStepsCacheBean) {
        b(totalDetailStepsCacheBean.f());
        TotalDetailStepsCacheBean.Builder builder = new TotalDetailStepsCacheBean.Builder();
        builder.b(totalDetailStepsCacheBean.h());
        builder.c(totalDetailStepsCacheBean.f());
        builder.f(totalDetailStepsCacheBean.j());
        builder.b(totalDetailStepsCacheBean.c());
        builder.a(totalDetailStepsCacheBean.e());
        builder.e(totalDetailStepsCacheBean.b());
        builder.d(totalDetailStepsCacheBean.d());
        builder.e(totalDetailStepsCacheBean.a());
        SharedPerferenceUtils.d(this.e, builder.e());
    }

    private void b(int i) {
        int i2;
        ReleaseLogUtil.d("Step_StandStepDtaMgr", "updateBasicRestartStepsInfo restartStep = ", Integer.valueOf(i));
        String[] strArrY = SharedPerferenceUtils.y(this.e);
        if (strArrY != null) {
            try {
                if (lsl.c(System.currentTimeMillis(), Long.parseLong(strArrY[0]))) {
                    if (strArrY.length == 4) {
                        i2 = Integer.parseInt(strArrY[3]);
                        SharedPerferenceUtils.c(this.e, Long.parseLong(strArrY[0]), Integer.parseInt(strArrY[3]));
                    } else {
                        i2 = 0;
                    }
                    LogUtil.a("Step_StandStepDtaMgr", "updateBasicRestartStepsInfo restart but same day");
                    String[] strArrF = SharedPerferenceUtils.f(this.e);
                    if (strArrF != null && lsl.c(System.currentTimeMillis(), Long.parseLong(strArrF[0]))) {
                        i2 = Integer.parseInt(strArrF[1]);
                    }
                    SharedPerferenceUtils.d(this.e, System.currentTimeMillis(), 0, i - i2);
                    ipb.k();
                    this.p = i;
                }
            } catch (NumberFormatException e) {
                LogUtil.j("Step_StandStepDtaMgr", "updateBasicRestartStepsInfo ", e.getMessage());
            }
        }
    }

    private void a(int i) {
        LogUtil.a("Step_StandStepDtaMgr", "updateBasicDiffFromDBStepsInfo diffStepsFromDB = ", Integer.valueOf(i));
        SharedPerferenceUtils.c(this.e, System.currentTimeMillis(), i);
    }

    private boolean o() {
        String[] strArrY = SharedPerferenceUtils.y(this.e);
        if (strArrY != null) {
            try {
                if (lsl.c(Long.parseLong(strArrY[0]), System.currentTimeMillis())) {
                    if (strArrY.length == 4) {
                        this.d = Integer.parseInt(strArrY[3]);
                        SharedPerferenceUtils.c(this.e, Long.parseLong(strArrY[0]), Integer.parseInt(strArrY[3]));
                    }
                    d dVar = this.s;
                    if (dVar != null) {
                        dVar.f6275b = Long.parseLong(strArrY[0]);
                        this.s.f6276c = Integer.parseInt(strArrY[1]);
                        this.o = Integer.parseInt(strArrY[2]);
                        j();
                        ReleaseLogUtil.d("Step_StandStepDtaMgr", "tryToReloadTodayBasicSteps", Long.valueOf(this.s.f6275b), "|", Integer.valueOf(this.s.f6276c), "|", Integer.valueOf(this.o), "|", Integer.valueOf(this.d));
                        return true;
                    }
                }
            } catch (NumberFormatException e) {
                LogUtil.j("Step_StandStepDtaMgr", "tryToReloadTodayBasicSteps ", e.getMessage());
            }
        }
        return false;
    }

    private void j() {
        String[] strArrF = SharedPerferenceUtils.f(this.e);
        if (strArrF == null || !lsl.c(Long.parseLong(strArrF[0]), System.currentTimeMillis())) {
            return;
        }
        int i = Integer.parseInt(strArrF[1]);
        this.d = i;
        ReleaseLogUtil.d("Step_StandStepDtaMgr", npt.d("initDiffStepFormDb: ", Integer.valueOf(i)));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x006b A[Catch: NumberFormatException -> 0x006e, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x006e, blocks: (B:15:0x004e, B:17:0x0052, B:19:0x0062, B:20:0x006b), top: B:30:0x004e }] */
    private boolean c(long j, int i) {
        boolean z;
        String[] strArrY = SharedPerferenceUtils.y(this.e);
        if (strArrY != null) {
            try {
                if (i >= Integer.parseInt(strArrY[1].trim())) {
                    z = !lsl.c(Long.parseLong(strArrY[0]), j);
                } else {
                    z = true;
                }
            } catch (NumberFormatException e) {
                LogUtil.j("Step_StandStepDtaMgr", "tryToRecordAsBasicStepData", e.getMessage());
                z = false;
            }
        } else {
            z = true;
        }
        LogUtil.a("Step_StandStepDtaMgr", "tryToRecordAsBasicStepData isWrite = ", Boolean.valueOf(z));
        if (!z) {
            return false;
        }
        String[] strArrF = SharedPerferenceUtils.f(this.e);
        if (strArrF != null) {
            try {
                if (strArrF.length >= 2 && lsl.c(Long.parseLong(strArrF[0]), System.currentTimeMillis())) {
                    this.d = Integer.parseInt(strArrF[1]);
                } else {
                    this.d = 0;
                }
            } catch (NumberFormatException e2) {
                LogUtil.j("Step_StandStepDtaMgr", "tryToRecordAsBasicStepData ex = ", e2.getMessage());
            }
        } else {
            this.d = 0;
        }
        SharedPerferenceUtils.d(this.e, j, i, 0);
        SharedPerferenceUtils.c(this.e, System.currentTimeMillis(), this.d);
        return true;
    }

    public Map<String, Object> d() {
        HashMap map = new HashMap(4);
        map.put("standardBase", Integer.valueOf(this.s.f6276c));
        map.put("restartSteps", Integer.valueOf(this.o));
        map.put("otherSteps", Integer.valueOf(this.d));
        map.put("UIShowSteps", Integer.valueOf(this.p));
        return map;
    }

    public void d(long j) {
        if (lsl.c(this.i, j)) {
            return;
        }
        long jR = lsl.r(j);
        this.i = jR;
        SharedPerferenceUtils.e(this.e, jR);
    }

    public void e(int i) {
        int iMax = Math.max(i, c());
        int i2 = this.t;
        if (iMax > i2) {
            this.f6274c = (iMax - i2) + this.f6274c;
            this.t = iMax;
        }
        ReleaseLogUtil.d("Step_StandStepDtaMgr", npt.d("syncDiffDeviceStepFromDb totalDeviceSteps = ", Integer.valueOf(iMax), " mDiffDeviceStep = ", Integer.valueOf(this.f6274c)));
    }

    public d i() {
        return this.s;
    }

    public int c() {
        if (this.g) {
            return 0;
        }
        if (this.m == null) {
            dln dlnVar = new dln();
            this.m = dlnVar;
            this.j = dlnVar.c();
        }
        if (this.j) {
            return this.m.d();
        }
        return 0;
    }
}
