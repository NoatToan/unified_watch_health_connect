package com.huawei.ui.homehealth.quickentrycard;

import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.plan.model.trainingplan.SmartPlanTypeEnum;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.RepeatResourceBenefitInfo;
import com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesInfoManager;
import com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager;
import defpackage.irz;
import defpackage.iun;
import defpackage.lsl;
import defpackage.njy;
import defpackage.nkb;
import defpackage.ntx;
import defpackage.sno;
import defpackage.soc;
import defpackage.swj;
import defpackage.vgo;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes17.dex */
public class QuickEntryDataSourceManager {
    private static QuickEntryDataSourceManager d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f25722c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f25721b = {500005569, 500005374, 500005645, 500005289, 500005385, 500005657, 500005465, 500005363, 500005837, 500005762, 500005386, 500005925, 500005807, 500005537, 500005098, 500005293, 500005168, 500005158, 500005245, 500005254, 500005692};
    private static final String[] e = {"sleepScore", "wakeCount", "turnOverCount", "bedTime", "risingTime", "sleepEndReason", "sleepSymptoms", "effectiveSleepDuration", "noonSleepInfo", "effectiveSleepCycles", "latency", "wakeUpFeeling", "dailySleepProblem", "dailySleepInterpretParam", "dailySleepDegree", "dailyTargetProblem", "dailySleepTasks", "fallAsleepTime", "wakeupTime", "sleepRecordQuality", "prepareSleepTime"};

    public interface OnConditionQueryCallback {
        void onComplete(List<swj.a> list);
    }

    private QuickEntryDataSourceManager() {
    }

    public static QuickEntryDataSourceManager b() {
        QuickEntryDataSourceManager quickEntryDataSourceManager;
        synchronized (QuickEntryDataSourceManager.class) {
            if (d == null) {
                d = new QuickEntryDataSourceManager();
            }
            quickEntryDataSourceManager = d;
        }
        return quickEntryDataSourceManager;
    }

    public void e() {
        this.f25722c = true;
    }

    public void c() {
        this.f25722c = false;
    }

    public void d(final OnConditionQueryCallback onConditionQueryCallback) {
        LogUtil.a("QuickEntryDataSourceManager", "queryAllEntryConditions start");
        final ArrayList arrayList = new ArrayList();
        final AtomicInteger atomicInteger = new AtomicInteger(2);
        Runnable runnable = new Runnable() { // from class: svl
            @Override // java.lang.Runnable
            public final void run() {
                this.f48745a.d(arrayList, atomicInteger, onConditionQueryCallback);
            }
        };
        d(arrayList, runnable);
        e(arrayList, runnable);
    }

    public /* synthetic */ void d(List list, AtomicInteger atomicInteger, OnConditionQueryCallback onConditionQueryCallback) {
        synchronized (list) {
            LogUtil.a("QuickEntryDataSourceManager", "queryAllEntryConditions pendingQueries: " + atomicInteger.get() + ", results size: " + list.size());
            if (atomicInteger.decrementAndGet() > 0) {
                return;
            }
            if (this.f25722c) {
                LogUtil.a("QuickEntryDataSourceManager", "queryAllEntryConditions cancelled");
                this.f25722c = false;
                return;
            }
            LogUtil.a("QuickEntryDataSourceManager", "queryAllEntryConditions complete, result size: " + list.size());
            if (onConditionQueryCallback != null) {
                onConditionQueryCallback.onComplete(list);
            }
        }
    }

    private void d(final List<swj.a> list, final Runnable runnable) {
        LogUtil.a("QuickEntryDataSourceManager", "queryDataPlatformEntries start");
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        DataPlatformQueryManager.c().a(new DataPlatformQueryManager.OnQueryCallback() { // from class: com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.1
            @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.DataPlatformQueryManager.OnQueryCallback
            public void onFitnessCourseResult(boolean z, int i) {
                Runnable runnable2;
                synchronized (list) {
                    list.add(new swj.a("entryFitnessCourse", z, i, 3, "DataPlatform"));
                    if (atomicInteger.incrementAndGet() == 5 && (runnable2 = runnable) != null) {
                        runnable2.run();
                    }
                }
            }

            @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.DataPlatformQueryManager.OnQueryCallback
            public void onRunResult(boolean z, int i) {
                Runnable runnable2;
                synchronized (list) {
                    list.add(new swj.a("entryRun", z, i, 3, "DataPlatform"));
                    if (atomicInteger.incrementAndGet() == 5 && (runnable2 = runnable) != null) {
                        runnable2.run();
                    }
                }
            }

            @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.DataPlatformQueryManager.OnQueryCallback
            public void onWalkResult(boolean z, int i) {
                Runnable runnable2;
                synchronized (list) {
                    list.add(new swj.a("entryWalk", z, i, 3, "DataPlatform"));
                    if (atomicInteger.incrementAndGet() == 5 && (runnable2 = runnable) != null) {
                        runnable2.run();
                    }
                }
            }

            @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.DataPlatformQueryManager.OnQueryCallback
            public void onRideResult(boolean z, int i) {
                Runnable runnable2;
                synchronized (list) {
                    list.add(new swj.a("entryRide", z, i, 3, "DataPlatform"));
                    if (atomicInteger.incrementAndGet() == 5 && (runnable2 = runnable) != null) {
                        runnable2.run();
                    }
                }
            }

            @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.DataPlatformQueryManager.OnQueryCallback
            public void onMonitoringSleepResult(boolean z, int i) {
                Runnable runnable2;
                synchronized (list) {
                    list.add(new swj.a("entryMonitoringSleep", z, i, 3, "DataPlatform"));
                    if (atomicInteger.incrementAndGet() == 5 && (runnable2 = runnable) != null) {
                        runnable2.run();
                    }
                }
            }
        });
    }

    private void e(final List<swj.a> list, final Runnable runnable) {
        LogUtil.a("QuickEntryDataSourceManager", "queryCloudSideEntries start");
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        CloudSideQueryManager.b().d(new CloudSideQueryManager.OnQueryCallback() { // from class: com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.5
            @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.CloudSideQueryManager.OnQueryCallback
            public void onSmartFatLossResult(boolean z) {
                Runnable runnable2;
                synchronized (list) {
                    list.add(new swj.a("entrySmartFatLoss", z, 0, 2, "CloudSide"));
                    if (atomicInteger.incrementAndGet() == 7 && (runnable2 = runnable) != null) {
                        runnable2.run();
                    }
                }
            }

            @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.CloudSideQueryManager.OnQueryCallback
            public void onSmartTrainingResult(boolean z) {
                Runnable runnable2;
                synchronized (list) {
                    list.add(new swj.a("entrySmartTraining", z, 0, 2, "CloudSide"));
                    if (atomicInteger.incrementAndGet() == 7 && (runnable2 = runnable) != null) {
                        runnable2.run();
                    }
                }
            }

            @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.CloudSideQueryManager.OnQueryCallback
            public void onDietLogResult(boolean z, int i) {
                Runnable runnable2;
                synchronized (list) {
                    list.add(new swj.a("entryDietLog", z, i, 3, "CloudSide"));
                    if (atomicInteger.incrementAndGet() == 7 && (runnable2 = runnable) != null) {
                        runnable2.run();
                    }
                }
            }

            @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.CloudSideQueryManager.OnQueryCallback
            public void onDietaryAnalysisResult(boolean z, int i) {
                Runnable runnable2;
                synchronized (list) {
                    list.add(new swj.a("entryDietaryAnalysis", z, i, 3, "CloudSide"));
                    if (atomicInteger.incrementAndGet() == 7 && (runnable2 = runnable) != null) {
                        runnable2.run();
                    }
                }
            }

            @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.CloudSideQueryManager.OnQueryCallback
            public void onFamilyDoctorResult(boolean z) {
                Runnable runnable2;
                synchronized (list) {
                    list.add(new swj.a("entryFamilyDoctor", z, 0, 1, "CloudSide"));
                    if (atomicInteger.incrementAndGet() == 7 && (runnable2 = runnable) != null) {
                        runnable2.run();
                    }
                }
            }

            @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.CloudSideQueryManager.OnQueryCallback
            public void onSleepMusicResult(boolean z) {
                Runnable runnable2;
                synchronized (list) {
                    list.add(new swj.a("entrySleepMusic", z, 0, 3, "CloudSide"));
                    if (atomicInteger.incrementAndGet() == 7 && (runnable2 = runnable) != null) {
                        runnable2.run();
                    }
                }
            }

            @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.CloudSideQueryManager.OnQueryCallback
            public void onHealthHeadlineResult(boolean z) {
                Runnable runnable2;
                synchronized (list) {
                    list.add(new swj.a("entryHealthHeadline", z, 0, 3, "CloudSide"));
                    if (atomicInteger.incrementAndGet() == 7 && (runnable2 = runnable) != null) {
                        runnable2.run();
                    }
                }
            }
        });
    }

    public static class DataPlatformQueryManager {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static DataPlatformQueryManager f25732b;

        public interface OnQueryCallback {
            void onFitnessCourseResult(boolean z, int i);

            void onMonitoringSleepResult(boolean z, int i);

            void onRideResult(boolean z, int i);

            void onRunResult(boolean z, int i);

            void onWalkResult(boolean z, int i);
        }

        private DataPlatformQueryManager() {
        }

        public static DataPlatformQueryManager c() {
            DataPlatformQueryManager dataPlatformQueryManager;
            synchronized (DataPlatformQueryManager.class) {
                if (f25732b == null) {
                    f25732b = new DataPlatformQueryManager();
                }
                dataPlatformQueryManager = f25732b;
            }
            return dataPlatformQueryManager;
        }

        public void a(final OnQueryCallback onQueryCallback) {
            LogUtil.a("QuickEntryDataSourceManager", "DataPlatformQueryManager queryEntryConditions");
            HealthDataQueryManager.e().a(HealthDataQueryManager.QueryType.FITNESS_COURSE, new HealthDataQueryManager.OnQueryResultListener() { // from class: svv
                @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.HealthDataQueryManager.OnQueryResultListener
                public final void onResult(int i) {
                    QuickEntryDataSourceManager.DataPlatformQueryManager.d(onQueryCallback, i);
                }
            });
            HealthDataQueryManager.e().a(HealthDataQueryManager.QueryType.RUN, new HealthDataQueryManager.OnQueryResultListener() { // from class: svz
                @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.HealthDataQueryManager.OnQueryResultListener
                public final void onResult(int i) {
                    QuickEntryDataSourceManager.DataPlatformQueryManager.e(onQueryCallback, i);
                }
            });
            HealthDataQueryManager.e().a(HealthDataQueryManager.QueryType.WALK, new HealthDataQueryManager.OnQueryResultListener() { // from class: svx
                @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.HealthDataQueryManager.OnQueryResultListener
                public final void onResult(int i) {
                    QuickEntryDataSourceManager.DataPlatformQueryManager.c(onQueryCallback, i);
                }
            });
            HealthDataQueryManager.e().a(HealthDataQueryManager.QueryType.RIDE, new HealthDataQueryManager.OnQueryResultListener() { // from class: svw
                @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.HealthDataQueryManager.OnQueryResultListener
                public final void onResult(int i) {
                    QuickEntryDataSourceManager.DataPlatformQueryManager.b(onQueryCallback, i);
                }
            });
            HealthDataQueryManager.e().a(HealthDataQueryManager.QueryType.MONITORING_SLEEP, new HealthDataQueryManager.OnQueryResultListener() { // from class: svy
                @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.HealthDataQueryManager.OnQueryResultListener
                public final void onResult(int i) {
                    QuickEntryDataSourceManager.DataPlatformQueryManager.a(onQueryCallback, i);
                }
            });
        }

        public static /* synthetic */ void d(OnQueryCallback onQueryCallback, int i) {
            boolean z = i >= 2;
            LogUtil.a("QuickEntryDataSourceManager", "FitnessCourse query result: days=" + i + ", met=" + z);
            if (onQueryCallback != null) {
                onQueryCallback.onFitnessCourseResult(z, i);
            }
        }

        public static /* synthetic */ void e(OnQueryCallback onQueryCallback, int i) {
            boolean z = i >= 2;
            LogUtil.a("QuickEntryDataSourceManager", "Run query result: days=" + i + ", met=" + z);
            if (onQueryCallback != null) {
                onQueryCallback.onRunResult(z, i);
            }
        }

        public static /* synthetic */ void c(OnQueryCallback onQueryCallback, int i) {
            boolean z = i >= 2;
            LogUtil.a("QuickEntryDataSourceManager", "Walk query result: days=" + i + ", met=" + z);
            if (onQueryCallback != null) {
                onQueryCallback.onWalkResult(z, i);
            }
        }

        public static /* synthetic */ void b(OnQueryCallback onQueryCallback, int i) {
            boolean z = i >= 2;
            LogUtil.a("QuickEntryDataSourceManager", "Ride query result: days=" + i + ", met=" + z);
            if (onQueryCallback != null) {
                onQueryCallback.onRideResult(z, i);
            }
        }

        public static /* synthetic */ void a(OnQueryCallback onQueryCallback, int i) {
            boolean z = i >= 2;
            LogUtil.a("QuickEntryDataSourceManager", "MonitoringSleep query result: days=" + i + ", met=" + z);
            if (onQueryCallback != null) {
                onQueryCallback.onMonitoringSleepResult(z, i);
            }
        }
    }

    public static class CloudSideQueryManager {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static CloudSideQueryManager f25731a;

        public interface OnQueryCallback {
            void onDietLogResult(boolean z, int i);

            void onDietaryAnalysisResult(boolean z, int i);

            void onFamilyDoctorResult(boolean z);

            void onHealthHeadlineResult(boolean z);

            void onSleepMusicResult(boolean z);

            void onSmartFatLossResult(boolean z);

            void onSmartTrainingResult(boolean z);
        }

        private CloudSideQueryManager() {
        }

        public static CloudSideQueryManager b() {
            CloudSideQueryManager cloudSideQueryManager;
            synchronized (CloudSideQueryManager.class) {
                if (f25731a == null) {
                    f25731a = new CloudSideQueryManager();
                }
                cloudSideQueryManager = f25731a;
            }
            return cloudSideQueryManager;
        }

        public void d(final OnQueryCallback onQueryCallback) {
            LogUtil.a("QuickEntryDataSourceManager", "CloudSideQueryManager queryEntryConditions");
            CloudApiQueryManager.a().c(new CloudApiQueryManager.OnBooleanResultListener() { // from class: svo
                @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.CloudApiQueryManager.OnBooleanResultListener
                public final void onResult(boolean z) {
                    QuickEntryDataSourceManager.CloudSideQueryManager.d(onQueryCallback, z);
                }
            });
            CloudApiQueryManager.a().b(new CloudApiQueryManager.OnBooleanResultListener() { // from class: svn
                @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.CloudApiQueryManager.OnBooleanResultListener
                public final void onResult(boolean z) {
                    QuickEntryDataSourceManager.CloudSideQueryManager.b(onQueryCallback, z);
                }
            });
            HealthDataQueryManager.e().a(HealthDataQueryManager.QueryType.DIET_LOG, new HealthDataQueryManager.OnQueryResultListener() { // from class: svp
                @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.HealthDataQueryManager.OnQueryResultListener
                public final void onResult(int i) {
                    QuickEntryDataSourceManager.CloudSideQueryManager.c(onQueryCallback, i);
                }
            });
            HealthDataQueryManager.e().a(HealthDataQueryManager.QueryType.DIETARY_ANALYSIS, new HealthDataQueryManager.OnQueryResultListener() { // from class: svt
                @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.HealthDataQueryManager.OnQueryResultListener
                public final void onResult(int i) {
                    QuickEntryDataSourceManager.CloudSideQueryManager.e(onQueryCallback, i);
                }
            });
            CloudApiQueryManager.a().a(new CloudApiQueryManager.OnBooleanResultListener() { // from class: svr
                @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.CloudApiQueryManager.OnBooleanResultListener
                public final void onResult(boolean z) {
                    QuickEntryDataSourceManager.CloudSideQueryManager.e(onQueryCallback, z);
                }
            });
            CloudApiQueryManager.a().e(new CloudApiQueryManager.OnBooleanResultListener() { // from class: svq
                @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.CloudApiQueryManager.OnBooleanResultListener
                public final void onResult(boolean z) {
                    QuickEntryDataSourceManager.CloudSideQueryManager.a(onQueryCallback, z);
                }
            });
            CloudApiQueryManager.a().d(new CloudApiQueryManager.OnBooleanResultListener() { // from class: svu
                @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.CloudApiQueryManager.OnBooleanResultListener
                public final void onResult(boolean z) {
                    QuickEntryDataSourceManager.CloudSideQueryManager.c(onQueryCallback, z);
                }
            });
        }

        public static /* synthetic */ void d(OnQueryCallback onQueryCallback, boolean z) {
            LogUtil.a("QuickEntryDataSourceManager", "SmartFatLoss query result: hasPlan=" + z);
            if (onQueryCallback != null) {
                onQueryCallback.onSmartFatLossResult(z);
            }
        }

        public static /* synthetic */ void b(OnQueryCallback onQueryCallback, boolean z) {
            LogUtil.a("QuickEntryDataSourceManager", "SmartTraining query result: hasPlan=" + z);
            if (onQueryCallback != null) {
                onQueryCallback.onSmartTrainingResult(z);
            }
        }

        public static /* synthetic */ void c(OnQueryCallback onQueryCallback, int i) {
            boolean z = i >= 2;
            LogUtil.a("QuickEntryDataSourceManager", "DietLog query result: days=" + i + ", met=" + z);
            if (onQueryCallback != null) {
                onQueryCallback.onDietLogResult(z, i);
            }
        }

        public static /* synthetic */ void e(OnQueryCallback onQueryCallback, int i) {
            boolean z = i >= 2 && irz.i();
            LogUtil.a("QuickEntryDataSourceManager", "DietaryAnalysis query result: days=" + i + ", isVip=" + irz.i() + ", met=" + z);
            if (onQueryCallback != null) {
                onQueryCallback.onDietaryAnalysisResult(z, i);
            }
        }

        public static /* synthetic */ void e(OnQueryCallback onQueryCallback, boolean z) {
            LogUtil.a("QuickEntryDataSourceManager", "FamilyDoctor query result: isExclusive=" + z);
            if (onQueryCallback != null) {
                onQueryCallback.onFamilyDoctorResult(z);
            }
        }

        public static /* synthetic */ void a(OnQueryCallback onQueryCallback, boolean z) {
            LogUtil.a("QuickEntryDataSourceManager", "SleepMusic query result: met=" + z);
            if (onQueryCallback != null) {
                onQueryCallback.onSleepMusicResult(z);
            }
        }

        public static /* synthetic */ void c(OnQueryCallback onQueryCallback, boolean z) {
            LogUtil.a("QuickEntryDataSourceManager", "HealthHeadline query result: met=" + z);
            if (onQueryCallback != null) {
                onQueryCallback.onHealthHeadlineResult(z);
            }
        }
    }

    public static class HealthDataQueryManager {
        private static HealthDataQueryManager e;

        public interface OnQueryResultListener {
            void onResult(int i);
        }

        public enum QueryType {
            FITNESS_COURSE,
            RUN,
            WALK,
            RIDE,
            MONITORING_SLEEP,
            DIET_LOG,
            DIETARY_ANALYSIS
        }

        private HealthDataQueryManager() {
        }

        public static HealthDataQueryManager e() {
            HealthDataQueryManager healthDataQueryManager;
            synchronized (HealthDataQueryManager.class) {
                if (e == null) {
                    e = new HealthDataQueryManager();
                }
                healthDataQueryManager = e;
            }
            return healthDataQueryManager;
        }

        public void a(QueryType queryType, OnQueryResultListener onQueryResultListener) {
            LogUtil.a("QuickEntryDataSourceManager", "HealthDataQueryManager queryUsageDays type=" + queryType);
            long jC = lsl.c(System.currentTimeMillis());
            long jC2 = lsl.c(jC, -30);
            switch (queryType) {
                case FITNESS_COURSE:
                    c(jC2, jC, onQueryResultListener);
                    break;
                case RUN:
                    c(258, jC2, jC, onQueryResultListener);
                    break;
                case WALK:
                    c(257, jC2, jC, onQueryResultListener);
                    break;
                case RIDE:
                    c(259, jC2, jC, onQueryResultListener);
                    break;
                case MONITORING_SLEEP:
                    e(jC2, jC, onQueryResultListener);
                    break;
                case DIET_LOG:
                case DIETARY_ANALYSIS:
                    d(jC2, jC, onQueryResultListener);
                    break;
                default:
                    if (onQueryResultListener != null) {
                        onQueryResultListener.onResult(0);
                    }
                    break;
            }
        }

        private void c(final int i, long j, long j2, final OnQueryResultListener onQueryResultListener) {
            LogUtil.a("QuickEntryDataSourceManager", "querySportUsageDays sportType=" + i + ", startTime=" + j + ", endTime=" + j2);
            nkb.d().a(j, j2, 5, i, new IBaseResponseCallback() { // from class: swb
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.d.c(i, onQueryResultListener, i2, obj);
                }
            });
        }

        public /* synthetic */ void c(int i, OnQueryResultListener onQueryResultListener, int i2, Object obj) {
            LogUtil.a("QuickEntryDataSourceManager", "querySportUsageDays result: sportType=" + i + ", errorCode=" + i2 + ", objData=" + obj);
            int iE = e(obj);
            if (onQueryResultListener != null) {
                onQueryResultListener.onResult(iE);
            }
        }

        private int e(Object obj) {
            if (obj == null) {
                return 0;
            }
            try {
                if (obj instanceof List) {
                    HashSet hashSet = new HashSet();
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        hashSet.add(e(((HiHealthData) it.next()).getStartTime()));
                    }
                    return hashSet.size();
                }
            } catch (Exception e2) {
                LogUtil.e("QuickEntryDataSourceManager", "calculateSportUsageDays error: " + e2.getMessage());
            }
            return 0;
        }

        private String e(long j) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(j));
        }

        private void e(long j, long j2, final OnQueryResultListener onQueryResultListener) {
            LogUtil.a("QuickEntryDataSourceManager", "querySleepMonitoringUsageDays startTime=" + j + ", endTime=" + j2);
            CourseServiceManager.c().b(j, j2, new CourseServiceManager.OnUsageDaysListener() { // from class: com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.HealthDataQueryManager.2
                @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.CourseServiceManager.OnUsageDaysListener
                public void onResult(int i) {
                    LogUtil.a("QuickEntryDataSourceManager", "querySleepMonitoringUsageDays result: days=" + i);
                    OnQueryResultListener onQueryResultListener2 = onQueryResultListener;
                    if (onQueryResultListener2 != null) {
                        onQueryResultListener2.onResult(i);
                    }
                }
            });
        }

        private void c(long j, long j2, final OnQueryResultListener onQueryResultListener) {
            LogUtil.a("QuickEntryDataSourceManager", "queryFitnessCourseUsageDays startTime=" + j + ", endTime=" + j2);
            CourseServiceManager.c().c(j, j2, new CourseServiceManager.OnUsageDaysListener() { // from class: com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.HealthDataQueryManager.5
                @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.CourseServiceManager.OnUsageDaysListener
                public void onResult(int i) {
                    LogUtil.a("QuickEntryDataSourceManager", "queryFitnessCourseUsageDays result: days=" + i);
                    OnQueryResultListener onQueryResultListener2 = onQueryResultListener;
                    if (onQueryResultListener2 != null) {
                        onQueryResultListener2.onResult(i);
                    }
                }
            });
        }

        private void d(long j, long j2, final OnQueryResultListener onQueryResultListener) {
            LogUtil.a("QuickEntryDataSourceManager", "queryDietLogUsageDays startTime=" + j + ", endTime=" + j2);
            DietServiceManager.d().c(j, j2, new DietServiceManager.OnUsageDaysListener() { // from class: com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.HealthDataQueryManager.3
                @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.DietServiceManager.OnUsageDaysListener
                public void onResult(int i) {
                    LogUtil.a("QuickEntryDataSourceManager", "queryDietLogUsageDays result: days=" + i);
                    OnQueryResultListener onQueryResultListener2 = onQueryResultListener;
                    if (onQueryResultListener2 != null) {
                        onQueryResultListener2.onResult(i);
                    }
                }
            });
        }
    }

    public static class CourseServiceManager {
        private static CourseServiceManager e;

        public interface OnUsageDaysListener {
            void onResult(int i);
        }

        private CourseServiceManager() {
        }

        public static CourseServiceManager c() {
            CourseServiceManager courseServiceManager;
            synchronized (CourseServiceManager.class) {
                if (e == null) {
                    e = new CourseServiceManager();
                }
                courseServiceManager = e;
            }
            return courseServiceManager;
        }

        public void c(long j, long j2, final OnUsageDaysListener onUsageDaysListener) {
            LogUtil.a("QuickEntryDataSourceManager", "queryFitnessCourseUsageDays startTime=" + j + ", endTime=" + j2);
            RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
            if (recordApi == null) {
                LogUtil.j("QuickEntryDataSourceManager", "queryFitnessCourseUsageDays recordApi is null");
                if (onUsageDaysListener != null) {
                    onUsageDaysListener.onResult(0);
                    return;
                }
                return;
            }
            recordApi.acquireDetailFitnessRecords(new ntx.d().b(j).d(j2).a(0).a(), new IBaseResponseCallback() { // from class: svs
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    QuickEntryDataSourceManager.CourseServiceManager.d(onUsageDaysListener, i, obj);
                }
            });
        }

        public static /* synthetic */ void d(OnUsageDaysListener onUsageDaysListener, int i, Object obj) {
            int size;
            if (i == 0 && obj != null && njy.b(obj, WorkoutRecord.class)) {
                HashSet hashSet = new HashSet();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    hashSet.add(simpleDateFormat.format(new Date(((WorkoutRecord) it.next()).acquireExerciseTime())));
                }
                size = hashSet.size();
            } else {
                size = 0;
            }
            LogUtil.a("QuickEntryDataSourceManager", "queryFitnessCourseUsageDays result: days=" + size);
            if (onUsageDaysListener != null) {
                onUsageDaysListener.onResult(size);
            }
        }

        public void b(long j, long j2, final OnUsageDaysListener onUsageDaysListener) {
            LogUtil.a("QuickEntryDataSourceManager", "querySleepMonitoringUsageDays startTime=" + j + ", endTime=" + j2);
            HiHealthNativeApi.a(BaseApplication.getContext()).aggregateHiHealthDataPro(HiDataAggregateProOption.builder().c(e(j, j2)).e(), new HiAggregateListener() { // from class: com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.CourseServiceManager.3
                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResult(List<HiHealthData> list, int i, int i2) {
                    int size = (i != 0 || njy.e(list)) ? 0 : list.size();
                    LogUtil.a("QuickEntryDataSourceManager", "querySleepMonitoringUsageDays result: days=" + size);
                    OnUsageDaysListener onUsageDaysListener2 = onUsageDaysListener;
                    if (onUsageDaysListener2 != null) {
                        onUsageDaysListener2.onResult(size);
                    }
                }

                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                    LogUtil.a("QuickEntryDataSourceManager", "querySleepMonitoringUsageDays onResultIntent intentType=" + i);
                }
            });
        }

        private HiAggregateOption e(long j, long j2) {
            HiAggregateOption hiAggregateOption = new HiAggregateOption();
            hiAggregateOption.setType(QuickEntryDataSourceManager.f25721b);
            hiAggregateOption.setTimeInterval(j, j2);
            hiAggregateOption.setGroupUnitType(3);
            hiAggregateOption.setConstantsKey(QuickEntryDataSourceManager.e);
            hiAggregateOption.setAggregateType(1);
            hiAggregateOption.setReadType(1);
            return hiAggregateOption;
        }
    }

    public static class DietServiceManager {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static DietServiceManager f25733a;

        public interface OnUsageDaysListener {
            void onResult(int i);
        }

        private DietServiceManager() {
        }

        public static DietServiceManager d() {
            DietServiceManager dietServiceManager;
            synchronized (DietServiceManager.class) {
                if (f25733a == null) {
                    f25733a = new DietServiceManager();
                }
                dietServiceManager = f25733a;
            }
            return dietServiceManager;
        }

        public void c(long j, long j2, final OnUsageDaysListener onUsageDaysListener) {
            LogUtil.a("QuickEntryDataSourceManager", "queryDietLogUsageDays startTime=" + j + ", endTime=" + j2);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
            iun.a(Integer.parseInt(simpleDateFormat.format(new Date(j))), Integer.parseInt(simpleDateFormat.format(new Date(j2))), (ResponseCallback<List<vgo>>) new ResponseCallback() { // from class: swd
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    QuickEntryDataSourceManager.DietServiceManager.a(onUsageDaysListener, i, (List) obj);
                }
            });
        }

        public static /* synthetic */ void a(OnUsageDaysListener onUsageDaysListener, int i, List list) {
            LogUtil.a("QuickEntryDataSourceManager", "queryDietLogUsageDays result: errorCode=", Integer.valueOf(i));
            if (onUsageDaysListener == null) {
                return;
            }
            int i2 = 0;
            if (i != 0 || njy.e(list)) {
                onUsageDaysListener.onResult(0);
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vgo vgoVar = (vgo) it.next();
                if (vgoVar != null && njy.b(vgoVar.a())) {
                    i2++;
                }
            }
            LogUtil.a("QuickEntryDataSourceManager", "queryDietLogUsageDays result: days=" + i2);
            onUsageDaysListener.onResult(i2);
        }
    }

    public static class CloudApiQueryManager {
        private static CloudApiQueryManager d;

        public interface OnBooleanResultListener {
            void onResult(boolean z);
        }

        private CloudApiQueryManager() {
        }

        public static CloudApiQueryManager a() {
            CloudApiQueryManager cloudApiQueryManager;
            synchronized (CloudApiQueryManager.class) {
                if (d == null) {
                    d = new CloudApiQueryManager();
                }
                cloudApiQueryManager = d;
            }
            return cloudApiQueryManager;
        }

        public void c(OnBooleanResultListener onBooleanResultListener) {
            LogUtil.a("QuickEntryDataSourceManager", "hasActiveFatLossPlan");
            if (onBooleanResultListener == null) {
                ReleaseLogUtil.d("QuickEntryDataSourceManager", "hasActiveFatLossPlan listener == null");
                return;
            }
            PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
            if (planApi == null) {
                LogUtil.j("QuickEntryDataSourceManager", "hasActiveFatLossPlan, PlanApi is null.");
                onBooleanResultListener.onResult(false);
                return;
            }
            IntPlan currentAllPlan = planApi.getCurrentAllPlan();
            if (currentAllPlan == null) {
                LogUtil.j("QuickEntryDataSourceManager", "hasActiveFatLossPlan getCurrentIntPlan, data is null.");
                onBooleanResultListener.onResult(false);
            } else {
                onBooleanResultListener.onResult(currentAllPlan.getSmartPlanType() == SmartPlanTypeEnum.SMART_WEIGHT_PLAN.getValue());
            }
        }

        public void b(OnBooleanResultListener onBooleanResultListener) {
            LogUtil.a("QuickEntryDataSourceManager", "hasActiveSmartTrainingPlan");
            if (onBooleanResultListener == null) {
                ReleaseLogUtil.d("QuickEntryDataSourceManager", "hasActiveSmartTrainingPlan listener == null");
                return;
            }
            PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
            if (planApi == null) {
                ReleaseLogUtil.e("QuickEntryDataSourceManager", "hasActiveSmartTrainingPlan hasActiveFatLossPlan, PlanApi is null.");
                onBooleanResultListener.onResult(false);
                return;
            }
            IntPlan currentAllPlan = planApi.getCurrentAllPlan();
            if (currentAllPlan == null) {
                LogUtil.j("QuickEntryDataSourceManager", "hasActiveFatLossPlan getCurrentIntPlan, data is null.");
                onBooleanResultListener.onResult(false);
            } else {
                onBooleanResultListener.onResult(currentAllPlan.getSmartPlanType() == SmartPlanTypeEnum.SMART_TRAINING_PLAN.getValue());
            }
        }

        public void a(final OnBooleanResultListener onBooleanResultListener) {
            LogUtil.a("QuickEntryDataSourceManager", "isExclusiveUser");
            if (onBooleanResultListener == null) {
                ReleaseLogUtil.d("QuickEntryDataSourceManager", "isExclusiveUser listener == null");
                return;
            }
            PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
            if (payApi == null) {
                ReleaseLogUtil.e("QuickEntryDataSourceManager", "isExclusiveUser payApi is null");
                onBooleanResultListener.onResult(false);
            } else {
                payApi.queryBenefitInfo(9, "", new IBaseResponseCallback() { // from class: svm
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        QuickEntryDataSourceManager.CloudApiQueryManager.e(onBooleanResultListener, i, obj);
                    }
                });
            }
        }

        public static /* synthetic */ void e(OnBooleanResultListener onBooleanResultListener, int i, Object obj) {
            if (i != 0) {
                LogUtil.j("QuickEntryDataSourceManager", "isExclusiveUser queryBenefitInfo fail");
                onBooleanResultListener.onResult(false);
            } else {
                if (!(obj instanceof RepeatResourceBenefitInfo)) {
                    LogUtil.j("QuickEntryDataSourceManager", "queryBenefitInfo fail ：objectData is not RepeatResourceBenefitInfo");
                    onBooleanResultListener.onResult(false);
                    return;
                }
                LogUtil.a("QuickEntryDataSourceManager", "queryBenefitInfo objectData = ", HiJsonUtil.d(obj));
                RepeatResourceBenefitInfo repeatResourceBenefitInfo = (RepeatResourceBenefitInfo) obj;
                long nowTime = repeatResourceBenefitInfo.getNowTime() != 0 ? repeatResourceBenefitInfo.getNowTime() : System.currentTimeMillis();
                LogUtil.a("QuickEntryDataSourceManager", "queryBenefitInfo currentTime = ", Long.valueOf(nowTime));
                onBooleanResultListener.onResult(repeatResourceBenefitInfo.getExpireTime().longValue() >= nowTime);
            }
        }

        public void e(final OnBooleanResultListener onBooleanResultListener) {
            LogUtil.a("QuickEntryDataSourceManager", "querySleepMusicCondition");
            if (onBooleanResultListener == null) {
                ReleaseLogUtil.d("QuickEntryDataSourceManager", "querySleepMusicCondition listener == null");
            } else {
                HealthHeadLinesInfoManager.d().d(0L, lsl.c(System.currentTimeMillis()), new UiCallback<sno>() { // from class: com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.CloudApiQueryManager.1
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i, String str) {
                        LogUtil.e("QuickEntryDataSourceManager", "querySleepMusicCondition errorCode:", Integer.valueOf(i), " errorInfo:", str);
                        onBooleanResultListener.onResult(false);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(sno snoVar) {
                        onBooleanResultListener.onResult(CloudApiQueryManager.this.c(snoVar));
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c(sno snoVar) {
            boolean z = false;
            if (snoVar == null || snoVar.c() == null) {
                ReleaseLogUtil.e("QuickEntryDataSourceManager", "evaluateSleepMusicCondition result is empty!");
                return false;
            }
            int iB = snoVar.b();
            long jE = 0;
            for (sno.e eVar : snoVar.c()) {
                if (eVar != null && eVar.e() > jE) {
                    jE = eVar.e();
                }
            }
            long jD = lsl.d(System.currentTimeMillis(), -30);
            if (iB > 10 && 1000 * jE > jD) {
                z = true;
            }
            LogUtil.a("QuickEntryDataSourceManager", "evaluateSleepMusicCondition totalCount:", Integer.valueOf(iB), " lastListenTime:", Long.valueOf(jE), " sevenDaysAgo:", Long.valueOf(jD), " met:", Boolean.valueOf(z));
            return z;
        }

        public void d(final OnBooleanResultListener onBooleanResultListener) {
            LogUtil.a("QuickEntryDataSourceManager", "queryHealthHeadlineCondition");
            if (onBooleanResultListener == null) {
                ReleaseLogUtil.d("QuickEntryDataSourceManager", "queryHealthHeadlineCondition listener == null");
                return;
            }
            long jC = lsl.c(System.currentTimeMillis());
            HealthHeadLinesInfoManager.d().b(lsl.c(jC, -30), jC, new UiCallback<soc>() { // from class: com.huawei.ui.homehealth.quickentrycard.QuickEntryDataSourceManager.CloudApiQueryManager.2
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("QuickEntryDataSourceManager", "queryHealthHeadlineCondition errorCode:", Integer.valueOf(i), " errorInfo:", str);
                    onBooleanResultListener.onResult(false);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(soc socVar) {
                    if (socVar == null) {
                        ReleaseLogUtil.e("QuickEntryDataSourceManager", "queryHealthHeadlineCondition result is empty!");
                        onBooleanResultListener.onResult(false);
                    } else {
                        int iB = socVar.b();
                        boolean z = iB >= 2;
                        LogUtil.a("QuickEntryDataSourceManager", "queryHealthHeadlineCondition totalCount:", Integer.valueOf(iB), " met:", Boolean.valueOf(z));
                        onBooleanResultListener.onResult(z);
                    }
                }
            });
        }
    }
}
