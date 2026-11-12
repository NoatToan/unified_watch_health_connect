package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.syncmgr.SyncStressDataApi;
import com.huawei.syncmgr.alarmdata.AlarmDataSyncApi;
import com.huawei.syncmgr.basicdata.BasicDataSyncApi;
import com.huawei.syncmgr.calendarsync.CalendarSyncApi;
import com.huawei.syncmgr.coresleep.CoreSleepSyncApi;
import com.huawei.syncmgr.menstrual.MenstrualSyncApi;
import com.huawei.syncmgr.periodrri.PeriodRriSyncApi;
import com.huawei.syncmgr.workout.WorkOutSyncApi;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes15.dex */
public final class qec {
    public static CoreSleepSyncApi e() {
        LogUtil.a("SyncApiManager", "getCoreSleepSyncApi");
        return (CoreSleepSyncApi) Services.d("SyncApiManager", CoreSleepSyncApi.class);
    }

    public static SyncStressDataApi f() {
        return (SyncStressDataApi) Services.d("SyncApiManager", SyncStressDataApi.class);
    }

    public static PeriodRriSyncApi g() {
        return (PeriodRriSyncApi) Services.d("SyncApiManager", PeriodRriSyncApi.class);
    }

    public static MenstrualSyncApi a() {
        LogUtil.a("SyncApiManager", "getMenstrualSyncApi");
        return (MenstrualSyncApi) Services.d("SyncApiManager", MenstrualSyncApi.class);
    }

    public static CalendarSyncApi b() {
        return (CalendarSyncApi) Services.d("SyncApiManager", CalendarSyncApi.class);
    }

    public static AlarmDataSyncApi d() {
        return (AlarmDataSyncApi) Services.d("SyncApiManager", AlarmDataSyncApi.class);
    }

    public static BasicDataSyncApi c() {
        return (BasicDataSyncApi) Services.d("SyncApiManager", BasicDataSyncApi.class);
    }

    public static WorkOutSyncApi h() {
        return (WorkOutSyncApi) Services.d("SyncApiManager", WorkOutSyncApi.class);
    }
}
