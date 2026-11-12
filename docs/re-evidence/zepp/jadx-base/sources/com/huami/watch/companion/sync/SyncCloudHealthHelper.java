package com.huami.watch.companion.sync;

import android.content.Context;
import androidx.annotation.NonNull;
import com.huami.watch.companion.dataflow.HealthData;
import com.huami.watch.dataflow.cloud.api.HealthDataAPI;
import com.huami.watch.dataflow.event.HealthDataUpdatedEvent;
import com.huami.watch.dataflow.model.health.HealthDataManager;
import com.huami.watch.dataflow.model.health.bean.HealthDataItem;
import com.huami.watch.dataflow.util.HealthDataParser;
import com.huami.watch.util.Box;
import com.huami.watch.util.BytesUtil;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import com.huami.watch.util.TimeUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class SyncCloudHealthHelper extends BaseSyncHelper {
    private static final String e = "SyncCloud-HealthData";

    private static boolean a(String str, int i) {
        if (i <= 0) {
            Log.d(e, "CloudSyncTime Invalid : " + i, new Object[0]);
            return false;
        }
        DateDay dateDayFrom = DateDay.from(str);
        if (dateDayFrom.after(DateDay.today())) {
            Log.d(e, SearchCriteria.LT + dateDayFrom + "> is after Today!!", new Object[0]);
            return false;
        }
        DateDay dateDayFrom2 = DateDay.from(HealthData.getStartDay());
        if (dateDayFrom.before(dateDayFrom2)) {
            Log.d(e, SearchCriteria.LT + dateDayFrom + "> is before StartDay<" + dateDayFrom2 + SearchCriteria.GT, new Object[0]);
            return false;
        }
        DateDay dateDayFrom3 = DateDay.from(i);
        if (dateDayFrom.after(dateDayFrom3)) {
            Log.d(e, SearchCriteria.LT + dateDayFrom + "> is after CloudSyncDay<" + dateDayFrom3 + SearchCriteria.GT, new Object[0]);
            return false;
        }
        int lastCloudHealthDataSyncTime = Box.getLastCloudHealthDataSyncTime();
        if (lastCloudHealthDataSyncTime <= 0) {
            return true;
        }
        Log.d(e, "LocalCloudSyncTime : " + TimeUtil.formatDateTime(lastCloudHealthDataSyncTime), new Object[0]);
        DateDay dateDayFrom4 = DateDay.from(lastCloudHealthDataSyncTime);
        if (!dateDayFrom.equals(dateDayFrom4) || i > lastCloudHealthDataSyncTime) {
            return true;
        }
        Log.d(e, SearchCriteria.LT + dateDayFrom + "> is equals LocalCloudSyncDay<" + dateDayFrom4 + SearchCriteria.GT, new Object[0]);
        return false;
    }

    private static boolean b(String str, HealthDataItem healthDataItem, int i) {
        return a(str, i) && checkIsNeedSyncFromDB(str, healthDataItem);
    }

    private static SyncResult c(Context context, String str, int i, int i2) {
        SyncResult syncResult = new SyncResult();
        if (i2 <= 0) {
            syncResult.success = true;
            return syncResult;
        }
        Log.i(e, "Start Details Sync : <" + str + SearchCriteria.GT, new Object[0]);
        DateDay dateDayFrom = DateDay.from(str);
        DateDay dateDayFrom2 = DateDay.from(i2);
        ArrayList arrayList = new ArrayList(i);
        for (int i3 = 0; i3 < i; i3++) {
            arrayList.add(dateDayFrom.add(-i3).str());
        }
        SyncResult syncResultJ = j(context, f(arrayList, i2), dateDayFrom2, i2);
        Box.putWatchHealthDataSyncTime(i2);
        Log.i(e, "End Details Sync : " + syncResultJ, new Object[0]);
        return syncResultJ;
    }

    public static boolean checkIsInitialed() {
        boolean initialCloudHealthDataSynced = Box.getInitialCloudHealthDataSynced();
        if (!initialCloudHealthDataSynced) {
            Log.w(e, "HealthDataSync not Initialled!!", new Object[0]);
        }
        return initialCloudHealthDataSynced;
    }

    public static boolean checkIsNeedSync(String str) {
        return a(str, Box.getLastCloudHealthDataSyncTime());
    }

    public static boolean checkIsNeedSyncFromDB(String str, HealthDataItem healthDataItem) {
        if (healthDataItem == null) {
            healthDataItem = HealthDataManager.getManager().getSyncState(str);
        }
        if (healthDataItem == null || (healthDataItem.getSynced() & 3072) != 3072) {
            return true;
        }
        Log.d(e, SearchCriteria.LT + str + "> is already synced with Cloud!!", new Object[0]);
        return false;
    }

    private static int d(String str, int i) {
        if (!DateDay.from(str).equals(DateDay.from(i))) {
            return 1439;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(((long) i) * 1000);
        return (calendar.get(11) * 60) + calendar.get(12);
    }

    private static boolean e(Context context) {
        Log.i(e, "Start Initial Sync!!", new Object[0]);
        boolean z = k(context, "2016-01-01", DateDay.today().str()).success;
        if (z) {
            HealthData.clearAllCache();
            Box.putWatchHealthDataSyncTime(-1);
            Box.putCloudHealthDataSyncTime(-1);
        }
        Log.i(e, "End Initial Sync : " + z, new Object[0]);
        return z;
    }

    @NonNull
    private static List<String> f(List<String> list, int i) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (DateDay.today().equals(str)) {
                int lastWatchHealthDataSyncTime = Box.getLastWatchHealthDataSyncTime();
                String dateTime = TimeUtil.formatDateTime(lastWatchHealthDataSyncTime);
                Log.d(e, "LastWatchSyncTime : " + dateTime, new Object[0]);
                if (i > lastWatchHealthDataSyncTime) {
                    arrayList.add(str);
                } else {
                    Log.d(e, SearchCriteria.LT + str + "> is before WatchSyncTime<" + dateTime + SearchCriteria.GT, new Object[0]);
                }
            } else if (b(str, null, i)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private static boolean g(HealthDataItem healthDataItem, String str, String str2) {
        if (DateDay.from(str).before(DateDay.from(str2))) {
            healthDataItem.setSynced(3072);
        }
        boolean zSave = false;
        try {
            zSave = HealthDataManager.getManager().save(healthDataItem);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (zSave) {
            HealthData.removeCache(str);
        }
        return zSave;
    }

    public static SyncCloudHealthHelper getHelper(Context context) {
        return (SyncCloudHealthHelper) BaseSyncHelper.getHelper(context, null, SyncCloudHealthHelper.class);
    }

    private static SyncResult h(Context context, int i) {
        SyncResult syncResult = new SyncResult();
        int lastCloudHealthDataSyncTime = Box.getLastCloudHealthDataSyncTime();
        Log.d(e, "LocalLastCloudSyncTime : " + TimeUtil.formatDateTime(lastCloudHealthDataSyncTime), new Object[0]);
        DateDay dateDayFrom = DateDay.from(i);
        DateDay dateDayFrom2 = DateDay.from(lastCloudHealthDataSyncTime);
        if (i <= 0 || lastCloudHealthDataSyncTime <= 0 || i <= lastCloudHealthDataSyncTime || dateDayFrom.offsetDay(dateDayFrom2) < 2) {
            syncResult.success = true;
        } else {
            syncResult = k(context, dateDayFrom2.str(), dateDayFrom.str());
            if (syncResult.synced) {
                HealthData.removeCaches(dateDayFrom2.str(), dateDayFrom.str());
            }
        }
        return syncResult;
    }

    private static SyncResult i(Context context, String str, String str2, int i) {
        Log.i(e, "Start Detail Sync : " + str + ", LastSyncTimeIndex : " + i, new Object[0]);
        SyncResult syncResult = new SyncResult();
        HealthDataAPI.HealthDataResult detail = HealthDataAPI.getDetail(context, str);
        if (detail.success) {
            HealthDataItem healthDataItem = HealthDataManager.getManager().get(str);
            if (healthDataItem == null) {
                healthDataItem = new HealthDataItem(str);
            }
            if (detail.dataItems.isEmpty()) {
                Log.d(e, "Cloud Data Empty : <" + str + SearchCriteria.GT, new Object[0]);
                syncResult.success = g(healthDataItem, str, str2);
                Log.i(e, "End Detail Sync : " + str + ", " + syncResult, new Object[0]);
                return syncResult;
            }
            HealthDataItem healthDataItem2 = detail.dataItems.get(0);
            Log.d(e, "CloudData : " + healthDataItem2 + ", " + BytesUtil.log(healthDataItem2.getData()) + ",\nHeartRate : " + BytesUtil.log(healthDataItem2.getHeartRateData()), new Object[0]);
            byte[] data = healthDataItem2.getData();
            if (data != null && data.length > 0) {
                byte[] bArrMergeRawData = HealthDataParser.mergeRawData(data, healthDataItem.getData(), 0, i);
                Log.d(e, "MergedRawData : <" + healthDataItem.getDate() + SearchCriteria.GT + BytesUtil.log(bArrMergeRawData), new Object[0]);
                StringBuilder sb = new StringBuilder();
                sb.append("IsEquals : ");
                sb.append(Arrays.equals(bArrMergeRawData, data));
                Log.d(e, sb.toString(), new Object[0]);
                healthDataItem.setData(bArrMergeRawData);
            }
            byte[] heartRateData = healthDataItem2.getHeartRateData();
            if (heartRateData != null && heartRateData.length > 0) {
                byte[] bArrMergeRawDataHeartRate = HealthDataParser.mergeRawDataHeartRate(heartRateData, healthDataItem.getHeartRateData(), 0, i);
                Log.d(e, "MergedHeartRateData : <" + healthDataItem.getDate() + SearchCriteria.GT + BytesUtil.log(bArrMergeRawDataHeartRate), new Object[0]);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("IsHeartRateEquals : ");
                sb2.append(Arrays.equals(bArrMergeRawDataHeartRate, heartRateData));
                Log.d(e, sb2.toString(), new Object[0]);
                healthDataItem.setHeartRateData(bArrMergeRawDataHeartRate);
            }
            healthDataItem.setSummary(healthDataItem2.getSummary());
            syncResult.success = g(healthDataItem, str, str2);
            syncResult.synced = true;
        }
        Log.i(e, "End Detail Sync : " + str + ", " + syncResult, new Object[0]);
        return syncResult;
    }

    private static SyncResult j(Context context, List<String> list, DateDay dateDay, int i) {
        SyncResult syncResult = new SyncResult();
        syncResult.success = true;
        for (String str : list) {
            if (!dateDay.before(DateDay.from(str))) {
                SyncResult syncResultI = i(context, str, dateDay.str(), d(str, i));
                syncResult.success &= syncResultI.success;
                syncResult.synced = syncResultI.synced | syncResult.synced;
            }
        }
        return syncResult;
    }

    private static SyncResult k(Context context, @NonNull String str, @NonNull String str2) {
        SyncResult syncResult = new SyncResult();
        HealthDataAPI.HealthDataResult summary = HealthDataAPI.getSummary(context, str, str2);
        if (summary.success) {
            if (summary.dataItems.isEmpty()) {
                syncResult.success = true;
            } else {
                ArrayList arrayList = new ArrayList(summary.dataItems.size());
                HealthDataManager healthDataManager = new HealthDataManager();
                for (HealthDataItem healthDataItem : summary.dataItems) {
                    HealthDataItem syncState = healthDataManager.getSyncState(healthDataItem.getDate());
                    if (syncState != null) {
                        syncState.setSummary(healthDataItem.getSummary());
                        healthDataItem = syncState;
                    }
                    healthDataItem.setSynced(1024);
                    arrayList.add(healthDataItem);
                }
                syncResult.success = healthDataManager.saveAll(arrayList);
                syncResult.synced = true;
            }
        }
        Log.d(e, "Sync Summary <" + str + Constants.WAVE_SEPARATOR + str2 + " : " + syncResult, new Object[0]);
        return syncResult;
    }

    public static boolean syncDaysDetail(Context context, @NonNull List<String> list) {
        if (!checkIsInitialed() || list.isEmpty()) {
            return false;
        }
        int lastCloudHealthDataSyncTime = Box.getLastCloudHealthDataSyncTime();
        Log.d(e, "LocalLastCloudSyncTime : " + TimeUtil.formatDateTime(lastCloudHealthDataSyncTime), new Object[0]);
        boolean z = lastCloudHealthDataSyncTime > 0 ? j(context, list, DateDay.from(lastCloudHealthDataSyncTime), lastCloudHealthDataSyncTime).synced : false;
        Log.d(e, "Sync Days : <" + Arrays.toString(list.toArray()) + ">, Synced : " + z, new Object[0]);
        return z;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public boolean onStart() {
        boolean zE;
        boolean z;
        boolean zCheckIsInitialed = checkIsInitialed();
        if (zCheckIsInitialed) {
            zE = false;
            z = false;
        } else {
            zE = e(this.mContext);
            if (!zE) {
                Log.w(e, "Initial Sync Fail!!", new Object[0]);
                return false;
            }
            z = true;
        }
        int lastSyncTimeSecs = HealthDataAPI.getLastSyncTimeSecs(this.mContext);
        if (lastSyncTimeSecs < 0) {
            Log.w(e, "Get Cloud LastSyncTime Err : " + lastSyncTimeSecs, new Object[0]);
            return false;
        }
        if (lastSyncTimeSecs == 0) {
            Log.i(e, "Get Cloud LastSyncTime : " + lastSyncTimeSecs + ", No Need Sync, Abort!!", new Object[0]);
            return true;
        }
        if (!z) {
            SyncResult syncResultH = h(this.mContext, lastSyncTimeSecs);
            zE = syncResultH.success;
            z = syncResultH.synced;
        }
        if (!zE) {
            Log.w(e, "Summary Sync Fail!!", new Object[0]);
            return false;
        }
        DateDay dateDay = DateDay.today();
        Log.d(e, "Today : " + dateDay, new Object[0]);
        SyncResult syncResultC = c(this.mContext, dateDay.str(), 3, lastSyncTimeSecs);
        boolean z2 = syncResultC.success;
        boolean z3 = syncResultC.synced | z;
        if (z2) {
            if (!zCheckIsInitialed) {
                Box.putInitialCloudHealthDataSynced();
            }
            Log.d(e, "Save CloudHealthData SyncTime : " + TimeUtil.formatDateTime(lastSyncTimeSecs), new Object[0]);
            Box.putCloudHealthDataSyncTime(lastSyncTimeSecs);
        } else {
            Log.w(e, "Sync CloudHealthData Fail!!", new Object[0]);
        }
        if (z3) {
            RxBus.get().postMainThread(new HealthDataUpdatedEvent(dateDay.str()));
        }
        return z2;
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public String tag() {
        return e;
    }
}
