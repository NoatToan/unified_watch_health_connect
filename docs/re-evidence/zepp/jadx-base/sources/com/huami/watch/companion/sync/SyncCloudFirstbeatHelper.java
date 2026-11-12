package com.huami.watch.companion.sync;

import android.content.Context;
import com.huami.watch.dataflow.cloud.api.FirstbeatDataAPI;
import com.huami.watch.dataflow.model.firstbeat.SportLoadManager;
import com.huami.watch.dataflow.model.firstbeat.VO2maxManager;
import com.huami.watch.dataflow.model.firstbeat.bean.SportLoadDataItem;
import com.huami.watch.dataflow.model.firstbeat.bean.VO2maxDataItem;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class SyncCloudFirstbeatHelper extends BaseSyncHelper {
    private static final String e = "SyncCloud-Firstbeat";
    private static final String f = "2017-08-08";

    private void a() {
        List<SportLoadDataItem> list;
        SportLoadManager manager = SportLoadManager.getManager();
        SportLoadDataItem latest = manager.getLatest();
        FirstbeatDataAPI.SportLoadResult sportLoadHistory = FirstbeatDataAPI.getSportLoadHistory(this.mContext, latest != null ? latest.getDate() : f, TimeUtil.formatDateTime(System.currentTimeMillis(), "yyyy-MM-dd"));
        if (sportLoadHistory.success && (list = sportLoadHistory.sportLoadItems) != null && !list.isEmpty()) {
            Iterator<SportLoadDataItem> it2 = sportLoadHistory.sportLoadItems.iterator();
            while (it2.hasNext()) {
                SportLoadDataItem next = it2.next();
                SportLoadDataItem sportLoadDataItem = manager.get(next.getDate());
                if (sportLoadDataItem != null && sportLoadDataItem.getUpdateTime() > next.getUpdateTime()) {
                    it2.remove();
                }
            }
            if (sportLoadHistory.sportLoadItems.size() != 0) {
                manager.saveAll(sportLoadHistory.sportLoadItems);
            }
        }
        Log.d(e, "syncSportLoadHistory done", new Object[0]);
    }

    private void b() {
        List<VO2maxDataItem> list;
        VO2maxManager manager = VO2maxManager.getManager();
        VO2maxDataItem latest = manager.getLatest();
        FirstbeatDataAPI.VO2maxResult vO2maxHistory = FirstbeatDataAPI.getVO2maxHistory(this.mContext, latest != null ? latest.getDate() : f, TimeUtil.formatDateTime(System.currentTimeMillis(), "yyyy-MM-dd"));
        if (vO2maxHistory.success && (list = vO2maxHistory.vo2maxItems) != null && !list.isEmpty()) {
            Iterator<VO2maxDataItem> it2 = vO2maxHistory.vo2maxItems.iterator();
            while (it2.hasNext()) {
                VO2maxDataItem next = it2.next();
                VO2maxDataItem vO2maxDataItem = manager.get(next.getDate());
                if (vO2maxDataItem != null && vO2maxDataItem.getUpdateTime() > next.getUpdateTime()) {
                    it2.remove();
                }
            }
            if (vO2maxHistory.vo2maxItems.size() != 0) {
                manager.saveAll(vO2maxHistory.vo2maxItems);
            }
        }
        Log.d(e, "syncVO2maxHistory done", new Object[0]);
    }

    public static SyncCloudFirstbeatHelper getHelper(Context context) {
        return (SyncCloudFirstbeatHelper) BaseSyncHelper.getHelper(context, null, SyncCloudFirstbeatHelper.class);
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public boolean onStart() {
        b();
        a();
        return true;
    }
}
