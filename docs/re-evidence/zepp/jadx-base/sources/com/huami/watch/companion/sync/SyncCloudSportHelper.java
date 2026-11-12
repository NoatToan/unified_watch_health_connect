package com.huami.watch.companion.sync;

import android.content.Context;
import android.text.TextUtils;
import com.huami.watch.dataflow.cloud.api.SportDataAPI;
import com.huami.watch.dataflow.event.SportHistoryUpdatedEvent;
import com.huami.watch.dataflow.model.sport.SportDetailManager;
import com.huami.watch.dataflow.model.sport.SportSummaryManager;
import com.huami.watch.dataflow.model.sport.bean.SportDetail;
import com.huami.watch.dataflow.model.sport.bean.SportSummary;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class SyncCloudSportHelper extends BaseSyncHelper {
    private static final String e = "DataFlow-Sport-SyncCloud";

    /* JADX WARN: Code duplicated, block: B:41:0x00f5  */
    private boolean a(Context context) {
        boolean zPostSummary;
        boolean z;
        boolean zPostDetail;
        Log.d(e, "Sync Running History...", new Object[0]);
        SportSummaryManager manager = SportSummaryManager.getManager();
        boolean initCloudSportSynced = Box.getInitCloudSportSynced();
        long trackid = 1451577600;
        if (initCloudSportSynced) {
            SportSummary latest = manager.getLatest();
            if (latest != null) {
                trackid = latest.getTrackid() - 1296000;
                if (trackid < 0) {
                    trackid = 0;
                }
            }
        } else {
            Log.i(e, "Init Sync Start...", new Object[0]);
        }
        SportDataAPI.SportHistoryResult history = SportDataAPI.getHistory(context, trackid);
        if (history.success) {
            if (history.summaryItems.isEmpty()) {
                z = false;
            } else {
                z = false;
                for (SportSummary sportSummary : history.summaryItems) {
                    sportSummary.setSynced(sportSummary.getSynced() | 3072);
                    if (!z && !manager.has(sportSummary.getTrackid(), sportSummary.getSource(), sportSummary.getType())) {
                        z = true;
                    }
                }
                manager.saveAll(history.summaryItems);
                if (!initCloudSportSynced) {
                    Log.i(e, "Init Synced!!", new Object[0]);
                    Box.putInitCloudSportSynced();
                }
            }
            zPostSummary = true;
        } else {
            zPostSummary = false;
            z = false;
        }
        if (zPostSummary) {
            List<SportSummary> allUnSynced = manager.getAllUnSynced();
            if (!ArraysUtil.isEmpty(allUnSynced)) {
                SportDetailManager manager2 = SportDetailManager.getManager();
                for (SportSummary sportSummary2 : allUnSynced) {
                    SportDetail syncState = manager2.getSyncState(sportSummary2.getTrackid(), sportSummary2.getSource());
                    if (syncState == null || syncState.getSynced() != 3) {
                        zPostDetail = true;
                    } else {
                        Log.d(e, "Sync SportDetail To Cloud: " + syncState.getTrackid(), new Object[0]);
                        String rawData = manager2.getRawData(context, sportSummary2.getTrackid(), sportSummary2.getSource());
                        if (TextUtils.isEmpty(rawData)) {
                            zPostDetail = true;
                        } else {
                            zPostDetail = SportDataAPI.postDetail(context, rawData);
                            zPostSummary &= zPostDetail;
                        }
                    }
                    if (zPostDetail) {
                        Log.d(e, "Sync SportSummary To Cloud: " + sportSummary2.getTrackid(), new Object[0]);
                        String rawData2 = manager.getRawData(context, sportSummary2.getTrackid(), sportSummary2.getSource());
                        if (!TextUtils.isEmpty(rawData2)) {
                            zPostSummary &= SportDataAPI.postSummary(context, rawData2);
                        }
                    }
                }
            }
        }
        if (z) {
            SportHistoryUpdatedEvent sportHistoryUpdatedEvent = new SportHistoryUpdatedEvent();
            sportHistoryUpdatedEvent.hasNewData = true;
            RxBus.get().postMainThread(sportHistoryUpdatedEvent);
        }
        Log.d(e, "Sync Running History, Success : " + zPostSummary + ", Has New Data : " + z, new Object[0]);
        return z;
    }

    private boolean b(Context context) {
        Log.i(e, "Sync Statistics...", new Object[0]);
        SportDataAPI.SportStatisticsResult statistics = SportDataAPI.getStatistics(context);
        Log.d(e, "Sync Statistics : " + statistics, new Object[0]);
        return statistics.success;
    }

    public static SyncCloudSportHelper getHelper(Context context) {
        return (SyncCloudSportHelper) BaseSyncHelper.getHelper(context, null, SyncCloudSportHelper.class);
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public boolean onStart() {
        a(this.mContext);
        return true;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public String tag() {
        return e;
    }
}
