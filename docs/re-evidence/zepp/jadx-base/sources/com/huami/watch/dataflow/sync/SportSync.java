package com.huami.watch.dataflow.sync;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.watch.companion.config.Config;
import com.huami.watch.dataflow.cloud.api.SportDataAPI;
import com.huami.watch.dataflow.event.SportHistoryUpdatedEvent;
import com.huami.watch.dataflow.model.sport.SportDetailManager;
import com.huami.watch.dataflow.model.sport.SportSummaryManager;
import com.huami.watch.dataflow.model.sport.bean.SportDetail;
import com.huami.watch.dataflow.model.sport.bean.SportSummary;
import com.huami.watch.dataflow.sync.bean.BaseSportData;
import com.huami.watch.dataflow.sync.bean.ComplexSportData;
import com.huami.watch.dataflow.sync.bean.DataType;
import com.huami.watch.dataflow.sync.bean.SingleSportData;
import com.huami.watch.dataflow.sync.bean.SportData;
import com.huami.watch.dataflow.sync.bean.SyncResult;
import com.huami.watch.dataflow.sync.sport.WatchSportDataTransmitter;
import com.huami.watch.dataflow.sync.util.SyncParser;
import com.huami.watch.dataflow.util.SportDataParser;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class SportSync extends BaseDataSync<SportData> {
    private static final String c = "DataFlow-Sync-Sport";
    private long b;

    public SportSync(long j) {
        super(DataType.SPORT);
        this.b = j;
    }

    private boolean a(Context context, String str, String str2) {
        SportSummary summaryItem;
        if (Config.isUserKR(context)) {
            Map<String, String> mapFormToNameValues = SportDataParser.formToNameValues(str, false);
            if (mapFormToNameValues.containsKey("longitude_latitude")) {
                mapFormToNameValues.put("longitude_latitude", "");
            }
            str = SportDataParser.toCloudData(mapFormToNameValues);
        }
        boolean z = SportDataAPI.postDetail(context, str) && SportDataAPI.postSummary(context, str2);
        if (z && (summaryItem = SportDataParser.toSummaryItem(str2)) != null) {
            WatchSportDataTransmitter.getInstance().addSportIdAndSource(summaryItem.getTrackid(), summaryItem.getSource());
        }
        Log.d(c, "Post SportData Item, Success : " + z, new Object[0]);
        return z;
    }

    private boolean b(Context context, String str, String str2) {
        boolean zC = c(context, str2) & d(context, str);
        WatchSportDataTransmitter.getInstance().transWatchSportData(str, str2);
        return zC;
    }

    private boolean c(Context context, String str) {
        SportDetail detailItem = SportDataParser.toDetailItem(str);
        if (detailItem != null && detailItem.getTrackid() > 0 && !TextUtils.isEmpty(detailItem.getSource())) {
            SportDetailManager manager = SportDetailManager.getManager();
            manager.deleteRecord(detailItem.getTrackid(), detailItem.getSource());
            if (manager.get(detailItem.getTrackid(), detailItem.getSource()) == null) {
                boolean zSaveRawData = manager.saveRawData(context, detailItem.getTrackid(), detailItem.getSource(), str);
                if (!zSaveRawData) {
                    return zSaveRawData;
                }
                detailItem.setSynced(3);
                return manager.save(detailItem);
            }
        }
        return true;
    }

    private boolean d(Context context, String str) {
        SportSummary summaryItem = SportDataParser.toSummaryItem(str);
        if (summaryItem == null || summaryItem.getTrackid() <= 0 || TextUtils.isEmpty(summaryItem.getSource()) || summaryItem.getType() <= 0) {
            return true;
        }
        SportSummaryManager manager = SportSummaryManager.getManager();
        manager.deleteRecord(summaryItem.getTrackid(), summaryItem.getSource(), summaryItem.getType());
        if (manager.get(summaryItem.getTrackid(), summaryItem.getSource(), summaryItem.getType()) != null) {
            return true;
        }
        boolean zSaveRawData = manager.saveRawData(context, summaryItem.getTrackid(), summaryItem.getSource(), str);
        if (zSaveRawData) {
            summaryItem.setSynced(3);
            zSaveRawData = manager.save(summaryItem);
        }
        if (zSaveRawData) {
            long sportSyncSessionId = Box.getSportSyncSessionId();
            long j = this.b;
            if (j != sportSyncSessionId) {
                Box.putSportSyncSessionId(j);
                Box.putSportSyncFirstTrackId(summaryItem.getTrackid());
            }
            SportHistoryUpdatedEvent sportHistoryUpdatedEvent = new SportHistoryUpdatedEvent();
            sportHistoryUpdatedEvent.hasNewData = true;
            sportHistoryUpdatedEvent.source = 1;
            RxBus.get().postMainThread(sportHistoryUpdatedEvent);
        }
        return zSaveRawData;
    }

    @Override // com.huami.watch.dataflow.sync.BaseDataSync
    public String tag() {
        return c;
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean isSyncDataEmpty(@NonNull SportData sportData) {
        if (sportData.items.isEmpty()) {
            return true;
        }
        BaseSportData baseSportData = sportData.items.get(0);
        if (baseSportData.isSingle()) {
            SingleSportData singleSportData = (SingleSportData) baseSportData;
            if (singleSportData.getSummary() == null || singleSportData.getDetail() == null) {
                return true;
            }
        } else {
            ComplexSportData complexSportData = (ComplexSportData) baseSportData;
            if (complexSportData.getParent().getSummary() == null || complexSportData.getParent().getDetail() == null || complexSportData.getChildren().size() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huami.watch.dataflow.sync.a
    public SportData parseSyncData(@NonNull String str) {
        return SyncParser.toSportData(str);
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean postToCloud(Context context, @NonNull SportData sportData) {
        boolean zA = true;
        for (BaseSportData baseSportData : sportData.items) {
            try {
                if (baseSportData.isSingle()) {
                    SingleSportData singleSportData = (SingleSportData) baseSportData;
                    zA = a(context, singleSportData.getDetail(), singleSportData.getSummary());
                    if (!zA) {
                        return zA;
                    }
                } else {
                    ComplexSportData complexSportData = (ComplexSportData) baseSportData;
                    boolean zA2 = a(context, complexSportData.getParent().getDetail(), complexSportData.getParent().getSummary());
                    if (!zA2) {
                        return zA2;
                    }
                    for (SingleSportData singleSportData2 : complexSportData.getChildren()) {
                        zA2 = a(context, singleSportData2.getDetail(), singleSportData2.getSummary());
                        if (!zA2) {
                            break;
                        }
                    }
                    zA = zA2;
                }
            } catch (Exception e) {
                Log.e(tag(), "PostSportDataToCloudErr", e, new Object[0]);
                zA = false;
            }
        }
        return zA;
    }

    @Override // com.huami.watch.dataflow.sync.a
    @NonNull
    public SyncResult processResult(Context context, @NonNull SportData sportData) {
        SyncResult syncResult = new SyncResult();
        syncResult.needContinue = true;
        if (!sportData.items.isEmpty()) {
            syncResult.data = sportData.items.get(0);
        }
        return syncResult;
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean saveToLocal(Context context, @NonNull SportData sportData) {
        boolean zB = true;
        for (BaseSportData baseSportData : sportData.items) {
            if (baseSportData.isSingle()) {
                SingleSportData singleSportData = (SingleSportData) baseSportData;
                zB &= b(context, singleSportData.getSummary(), singleSportData.getDetail());
            } else {
                ComplexSportData complexSportData = (ComplexSportData) baseSportData;
                zB &= b(context, complexSportData.getParent().getSummary(), complexSportData.getParent().getDetail());
                for (SingleSportData singleSportData2 : complexSportData.getChildren()) {
                    zB &= b(context, singleSportData2.getSummary(), singleSportData2.getDetail());
                }
            }
        }
        return zB;
    }
}
