package com.huawei.hmf.md.bootstrap;

import com.huawei.hmf.repository.Repository;
import com.huawei.hmf.services.ApiSet;
import com.huawei.hmf.services.ModuleProviderWrapper;
import defpackage.mht;
import defpackage.mhv;
import defpackage.mhx;
import defpackage.mhy;
import defpackage.mhz;
import defpackage.mia;
import defpackage.mib;
import defpackage.mic;
import defpackage.mid;

/* JADX INFO: loaded from: classes33.dex */
public final class SyncApiManagerModuleBootstrap {
    public static final void register(Repository repository) {
        ApiSet.Builder builder = ApiSet.builder();
        builder.add(mhx.class, "com.huawei.syncmgr.alarmdata.AlarmDataSyncApi");
        builder.add(mia.class, "com.huawei.syncmgr.SyncStressDataApi");
        builder.add(mht.class, "com.huawei.syncmgr.calendarsync.CalendarSyncApi");
        builder.add(mid.class, "com.huawei.syncmgr.workout.WorkOutSyncApi");
        builder.add(mhv.class, "com.huawei.syncmgr.coresleep.CoreSleepSyncApi");
        builder.add(mhz.class, "com.huawei.syncmgr.periodrri.PeriodRriSyncApi");
        builder.add(mic.class, "com.huawei.syncmgr.basicdata.BasicDataSyncApi");
        builder.add(mhy.class, "com.huawei.syncmgr.menstrual.MenstrualSyncApi");
        new ModuleProviderWrapper(new mib(), 1).bootstrap(repository, name(), builder.build());
    }

    public static final String name() {
        return "SyncApiManager";
    }
}
