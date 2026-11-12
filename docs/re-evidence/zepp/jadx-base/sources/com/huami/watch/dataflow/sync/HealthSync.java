package com.huami.watch.dataflow.sync;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huami.watch.dataflow.cloud.api.HealthDataAPI;
import com.huami.watch.dataflow.event.HealthDataUpdatedEvent;
import com.huami.watch.dataflow.model.health.HRDataManager;
import com.huami.watch.dataflow.model.health.HealthDataManager;
import com.huami.watch.dataflow.model.health.bean.HealthDataItem;
import com.huami.watch.dataflow.model.health.bean.HealthHRDataItem;
import com.huami.watch.dataflow.model.health.bean.HealthRawDataItem;
import com.huami.watch.dataflow.model.health.bean.HealthRawHRItem;
import com.huami.watch.dataflow.sync.bean.DataType;
import com.huami.watch.dataflow.sync.bean.HealthData;
import com.huami.watch.dataflow.sync.bean.HealthRequestData;
import com.huami.watch.dataflow.sync.bean.SyncResult;
import com.huami.watch.dataflow.sync.stepstage.CompanionStepStageProcessor;
import com.huami.watch.dataflow.sync.util.SyncParser;
import com.huami.watch.dataflow.util.HealthDataParser;
import com.huami.watch.dataflow.util.HealthDataUtil;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Box;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import com.huami.watch.util.TimeUtil;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HealthSync extends BaseDataSync<HealthData> {
    private static final String c = "DataFlow-Sync-Health";
    private Context b;

    public class a implements Comparator<HealthRawHRItem> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(HealthRawHRItem healthRawHRItem, HealthRawHRItem healthRawHRItem2) {
            return (int) (healthRawHRItem.getGeneratedTime() - healthRawHRItem2.getGeneratedTime());
        }
    }

    public HealthSync(Context context) {
        super(DataType.HEALTH);
        this.b = context;
    }

    private boolean a(List<HealthData.Item> list) {
        Iterator<HealthData.Item> it2 = list.iterator();
        while (it2.hasNext()) {
            if (DateDay.from(it2.next().getLastSyncTime() * 1000).equals(DateDay.today())) {
                return true;
            }
        }
        return false;
    }

    private boolean b(Context context, List<HealthRawHRItem> list) {
        if (ArraysUtil.isEmpty(list)) {
            return true;
        }
        Collections.sort(list, new a());
        Log.d(c, "HRData Sorted Items: " + ArraysUtil.toString(list), new Object[0]);
        long generatedTime = list.get(list.size() - 1).getGeneratedTime();
        Box.putHealthSingleHRSyncTime(generatedTime);
        Log.d(c, "HRData Save LastSyncTime: " + generatedTime, new Object[0]);
        String json = new Gson().toJson(list);
        boolean zPostHeartRate = HealthDataAPI.postHeartRate(context, json);
        Log.d(c, "Post HRData: " + json + ", Success: " + zPostHeartRate, new Object[0]);
        return zPostHeartRate;
    }

    private boolean c(Context context, List<HealthData.Item> list) {
        boolean z = true;
        for (HealthData.Item item : list) {
            boolean zPostData = HealthDataAPI.postData(context, item.getData());
            Log.d(c, "Post HealthData Item: " + item + ", Success: " + zPostData, new Object[0]);
            if (!zPostData) {
                return zPostData;
            }
            z = zPostData;
        }
        return z;
    }

    private boolean d(Context context, List<HealthData.Item> list) {
        boolean zPostPaiData = true;
        for (HealthData.Item item : list) {
            if (!TextUtils.isEmpty(item.paiData)) {
                zPostPaiData = HealthDataAPI.postPaiData(context, item.paiData);
                Log.d(c, "Post PaiData Item: " + item.paiData + ", Success: " + zPostPaiData, new Object[0]);
                if (!zPostPaiData) {
                    break;
                }
            }
        }
        return zPostPaiData;
    }

    private boolean e(@NonNull List<HealthRawHRItem> list) {
        boolean z = true;
        if (list.size() > 0) {
            HRDataManager manager = HRDataManager.getManager();
            boolean zSave = true;
            for (HealthRawHRItem healthRawHRItem : list) {
                if (manager.get(healthRawHRItem.getGeneratedTime()) == null) {
                    HealthHRDataItem healthHRDataItem = new HealthHRDataItem();
                    healthHRDataItem.setHeartRate(HealthDataParser.toHeartRate(healthRawHRItem.getHeartRateData()));
                    healthHRDataItem.setTimestamp(healthRawHRItem.getGeneratedTime());
                    healthHRDataItem.setTimezone(healthRawHRItem.getTimeZone());
                    healthHRDataItem.setDId(healthRawHRItem.getDeviceId());
                    healthHRDataItem.setDeviceSource(healthRawHRItem.getDeviceSource());
                    zSave &= manager.save(healthHRDataItem);
                }
            }
            if (zSave) {
                HealthDataUpdatedEvent healthDataUpdatedEvent = new HealthDataUpdatedEvent();
                healthDataUpdatedEvent.onlyUpdateHR = true;
                Log.d(c, "Post HRDataUpdated!!", new Object[0]);
                RxBus.get().postMainThread(healthDataUpdatedEvent);
            }
            z = zSave;
        }
        Log.d(c, "Save HRData, Success: " + z, new Object[0]);
        return z;
    }

    private boolean f(@NonNull List<HealthData.Item> list) {
        boolean zSave = true;
        for (HealthData.Item item : list) {
            Log.d(c, "HealthData Item : " + item, new Object[0]);
            HealthRawDataItem dataItem = item.getDataItem();
            if (dataItem == null) {
                try {
                    dataItem = (HealthRawDataItem) new Gson().fromJson(item.getData(), HealthRawDataItem.class);
                } catch (JsonSyntaxException e) {
                    e.printStackTrace();
                    Log.e(c, "To HealthRawData Item Fail!!", e, new Object[0]);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("RawData Item : ");
            sb.append(dataItem);
            sb.append(", LastSyncTime : ");
            sb.append(dataItem != null ? TimeUtil.formatDateTime(dataItem.getLastSyncTime()) : "");
            Log.d(c, sb.toString(), new Object[0]);
            if (dataItem != null) {
                List<HealthDataItem> listMergeWithLocalByDate = HealthDataUtil.mergeWithLocalByDate(dataItem);
                if (!ArraysUtil.isEmpty(listMergeWithLocalByDate)) {
                    for (HealthDataItem healthDataItem : listMergeWithLocalByDate) {
                        healthDataItem.setSynced(healthDataItem.getSynced() | 3);
                        try {
                            zSave &= HealthDataManager.getManager().save(healthDataItem);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        if (zSave) {
                            HealthDataUpdatedEvent healthDataUpdatedEvent = new HealthDataUpdatedEvent(healthDataItem.getDate());
                            Log.d(c, "Post HealthDataUpdated: " + healthDataUpdatedEvent.date, new Object[0]);
                            RxBus.get().postMainThread(healthDataUpdatedEvent);
                            CompanionStepStageProcessor.get().process(healthDataItem.getDate());
                        }
                    }
                }
            }
        }
        Log.d(c, "Save HealthData, Success: " + zSave, new Object[0]);
        return zSave;
    }

    @Override // com.huami.watch.dataflow.sync.BaseDataSync, com.huami.watch.dataflow.sync.a
    public Object prepareRequestData() {
        int lastSyncTimeSecs = HealthDataAPI.getLastSyncTimeSecs(this.b);
        if (lastSyncTimeSecs < 0) {
            Log.w(c, "Get Cloud LastSyncTime Err : " + lastSyncTimeSecs, new Object[0]);
            return null;
        }
        HealthRequestData healthRequestData = new HealthRequestData();
        if (lastSyncTimeSecs > 0) {
            healthRequestData.lastSyncTimeMillis = ((long) lastSyncTimeSecs) * 1000;
            healthRequestData.lastSyncTime = String.valueOf(lastSyncTimeSecs);
        }
        return healthRequestData;
    }

    @Override // com.huami.watch.dataflow.sync.BaseDataSync
    public String tag() {
        return c;
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean isSyncDataEmpty(@NonNull HealthData healthData) {
        return ArraysUtil.isEmpty(healthData.items) && ArraysUtil.isEmpty(healthData.hrItems);
    }

    @Override // com.huami.watch.dataflow.sync.a
    public HealthData parseSyncData(@NonNull String str) {
        return SyncParser.toHealthData(this.b, str);
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean postToCloud(Context context, @NonNull HealthData healthData) {
        return b(context, healthData.hrItems) & c(context, healthData.items) & d(context, healthData.items);
    }

    @Override // com.huami.watch.dataflow.sync.a
    @NonNull
    public SyncResult processResult(Context context, @NonNull HealthData healthData) {
        SyncResult syncResult = new SyncResult();
        if (a(healthData.items)) {
            Log.d(c, "Today Data Synced, No Need Continue!!", new Object[0]);
            syncResult.needContinue = false;
        } else {
            syncResult.needContinue = true;
        }
        syncResult.data = healthData;
        return syncResult;
    }

    @Override // com.huami.watch.dataflow.sync.a
    public boolean saveToLocal(Context context, @NonNull HealthData healthData) {
        return f(healthData.items) & e(healthData.hrItems);
    }
}
