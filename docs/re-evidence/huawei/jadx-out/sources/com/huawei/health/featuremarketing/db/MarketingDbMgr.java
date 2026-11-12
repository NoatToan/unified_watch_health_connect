package com.huawei.health.featuremarketing.db;

import android.content.Context;
import com.huawei.hwbasemgr.HwBaseManager;

/* JADX INFO: loaded from: classes28.dex */
public class MarketingDbMgr extends HwBaseManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile MarketingDbMgr f6687c;

    public MarketingDbMgr(Context context) {
        super(context);
        c();
    }

    public static MarketingDbMgr c(Context context) {
        if (f6687c == null) {
            synchronized (MarketingEventDbMgr.class) {
                if (f6687c == null) {
                    f6687c = new MarketingEventDbMgr(context);
                }
            }
        }
        return f6687c;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 10100;
    }

    private void c() {
        createStorageDataTable("marketing_data", 1, "id integer primary key autoincrement, positionId text not null,data text not null,latestModifyTime text not null");
        createStorageDataTable("marketing_trigger_event", 1, "id integer primary key autoincrement, huid text not null,positionId text not null,typeId text not null,resourceId text not null,triggerTime text not null,value text not null,reservedField text");
    }
}
