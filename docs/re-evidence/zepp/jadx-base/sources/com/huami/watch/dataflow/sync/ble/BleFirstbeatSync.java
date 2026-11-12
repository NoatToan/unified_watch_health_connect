package com.huami.watch.dataflow.sync.ble;

import androidx.annotation.NonNull;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.watch.dataflow.model.firstbeat.FirstbeatParams;
import com.huami.watch.dataflow.sync.FirstbeatSync;
import com.huami.watch.dataflow.sync.bean.FirstbeatData;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Box;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.DoLooper;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.BleFirstbeat;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.BleFirstbeatData;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.IHMFirstbeatDataCallback;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.UShort;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class BleFirstbeatSync extends FirstbeatSync {
    private static final String d = "DataFlow-BLE-Firstbeat";
    private HMSmartWatchDevice c;

    public class a implements IHMFirstbeatDataCallback {
        public final /* synthetic */ DoLooper.Result a;

        public a(DoLooper.Result result) {
            this.a = result;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
        public void onData(List<GpsRecord> list) {
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
        public void onFinish(boolean z) {
            Log.d(BleFirstbeatSync.d, "OnSync Firstbeat Finish, Success: " + z, new Object[0]);
            DoLooper.Result result = this.a;
            result.finish = true;
            result.success = z;
        }

        @Override // com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.IHMFirstbeatDataCallback
        public void onFirstbeatData(BleFirstbeatData bleFirstbeatData) {
            Log.d(BleFirstbeatSync.d, "OnSync Firstbeat!!", new Object[0]);
            this.a.data = bleFirstbeatData;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
        public void onProgress(Progress progress) {
            Log.v(BleFirstbeatSync.d, "OnSync Firstbeat Progress: " + progress, new Object[0]);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
        public void onStart() {
            Log.d(BleFirstbeatSync.d, "OnSync Firstbeat Start...", new Object[0]);
        }
    }

    public class b implements DoLooper.Function<DoLooper.Result> {
        public final /* synthetic */ DoLooper.Result a;

        public b(DoLooper.Result result) {
            this.a = result;
        }

        @Override // com.huami.watch.util.DoLooper.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DoLooper.Result apply() {
            return this.a;
        }
    }

    public BleFirstbeatSync(HMSmartWatchDevice hMSmartWatchDevice) {
        this.c = hMSmartWatchDevice;
    }

    private static String d(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(0L);
        calendar.set(1970, 0, 1, 0, 0, 0);
        calendar.add(6, i);
        return DateDay.from(calendar).str();
    }

    public static FirstbeatData parseFirstbeatData(BleFirstbeatData bleFirstbeatData) {
        int i;
        Log.d(d, "Parse BleFirstbeat Data...", new Object[0]);
        FirstbeatData firstbeatData = new FirstbeatData();
        try {
            BleFirstbeat.Config config = bleFirstbeatData.firstbeatConfig;
            if (config != null && !ArraysUtil.isEmpty(bleFirstbeatData.firstbeatList)) {
                JSONObject jSONObject = new JSONObject();
                short s = config.currentRunVO2Max;
                short s2 = UShort.MAX_VALUE;
                jSONObject.put("currnet_run_vo2max", ((double) (s & UShort.MAX_VALUE)) / 100.0d);
                jSONObject.put("current_walking_vo2max", ((double) (config.currentWalkingVO2Max & UShort.MAX_VALUE)) / 100.0d);
                jSONObject.put("last_run_vo2max", ((double) (config.lastWalkingVO2Max & UShort.MAX_VALUE)) / 100.0d);
                jSONObject.put("last_walking_vo2max", ((double) (config.lastWalkingVO2Max & UShort.MAX_VALUE)) / 100.0d);
                jSONObject.put("recovery_time", config.recoveryTime);
                jSONObject.put("sport_finish_time", config.sportFinishTime);
                firstbeatData.firstbeatconfig = jSONObject.toString();
                List<BleFirstbeat> list = bleFirstbeatData.firstbeatList;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i2 = 0;
                for (BleFirstbeat bleFirstbeat : list) {
                    String strD = d(bleFirstbeat.dayId);
                    FirstbeatData.Item item = new FirstbeatData.Item();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(FirstbeatParams.PARAM_DAY_ID, strD);
                    jSONObject2.put(FirstbeatParams.PARAM_TL_WEEKLY_SUM, bleFirstbeat.weeklyTLSum & s2);
                    jSONObject2.put(FirstbeatParams.PARAM_TL_WEEKLY_SUM_OPTIMAL_MAX, bleFirstbeat.weeklyTLSumOptimalMax & s2);
                    jSONObject2.put(FirstbeatParams.PARAM_TL_WEEKLY_SUM_OPTIMAL_MIN, bleFirstbeat.weeklyTLSumOptimalMin & s2);
                    jSONObject2.put(FirstbeatParams.PARAM_TL_WEEKLY_SUM_OVERREACHING, bleFirstbeat.weeklyTLSumOverreaching & s2);
                    long j = ((long) bleFirstbeat.updateTime) * 1000;
                    jSONObject2.put(EcgData.TIMESTAMP_SERVER_UPDATED, j);
                    jSONObject2.put(FirstbeatParams.PARAM_TL_DAILY, (int) bleFirstbeat.currentDayTL);
                    item.setDayId(strD);
                    item.setData(jSONObject2.toString());
                    arrayList2.add(item);
                    FirstbeatData.Item item2 = new FirstbeatData.Item();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(FirstbeatParams.PARAM_DAY_ID, strD);
                    jSONObject3.put("vo2_max_run", ((double) (bleFirstbeat.sportVO2Max & s2)) / 100.0d);
                    jSONObject3.put(FirstbeatParams.PARAM_VO2_MAX_WALK, ((double) (bleFirstbeat.walkVO2Max & UShort.MAX_VALUE)) / 100.0d);
                    jSONObject3.put(FirstbeatParams.PARAM_UPDATE_TIME, j);
                    item2.setDayId(strD);
                    item2.setData(jSONObject3.toString());
                    arrayList.add(item2);
                    int i3 = bleFirstbeat.updateTime;
                    if (i2 < i3) {
                        i2 = i3;
                    }
                    s2 = UShort.MAX_VALUE;
                }
                firstbeatData.setUpdateTime(i2);
                firstbeatData.setSportThaInfo(arrayList2);
                firstbeatData.setVo2max(arrayList);
                return firstbeatData;
            }
            i = 0;
            try {
                Log.d(d, "No Config Data, Abort!!", new Object[0]);
                return firstbeatData;
            } catch (JSONException e) {
                e = e;
                Log.e(d, "ParseFirstbeatDataErr", e, new Object[i]);
                return null;
            }
        } catch (JSONException e2) {
            e = e2;
            i = 0;
        }
    }

    @Override // com.huami.watch.dataflow.sync.FirstbeatSync, com.huami.watch.dataflow.sync.BaseDataSync
    public String tag() {
        return d;
    }

    @Override // com.huami.watch.dataflow.sync.BaseDataSync, com.huami.watch.dataflow.sync.a
    @NonNull
    public Long prepareRequestData() {
        long firstbeatUpdateTime = Box.getFirstbeatUpdateTime();
        Log.d(d, "Last BleFirstbeat UpdateTime: " + firstbeatUpdateTime, new Object[0]);
        if (firstbeatUpdateTime < 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(2019, 5, 1, 0, 0, 0);
            firstbeatUpdateTime = calendar.getTimeInMillis();
        }
        return Long.valueOf(firstbeatUpdateTime);
    }

    @Override // com.huami.watch.dataflow.sync.BaseDataSync, com.huami.watch.dataflow.sync.a
    public FirstbeatData syncWatchData() {
        if (this.c == null) {
            Log.w(d, "BleDevice is Null, Abort!!", new Object[0]);
            return null;
        }
        long jLongValue = prepareRequestData().longValue();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jLongValue);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        DoLooper.Result result = new DoLooper.Result();
        Log.i(d, "Sync BleFirstbeat Start... [" + TimeUtil.formatDateTime(jLongValue) + "]", new Object[0]);
        this.c.startSyncFirstbeatData(calendar, calendar2, new a(result));
        DoLooper.doLoop(new b(result), 1000, 600);
        Log.i(d, "Sync BleFirstbeat [" + TimeUtil.formatDateTime(jLongValue) + "]: " + result, new Object[0]);
        if (!result.success) {
            return null;
        }
        FirstbeatData firstbeatData = new FirstbeatData();
        Object obj = result.data;
        if (obj == null) {
            return firstbeatData;
        }
        BleFirstbeatData bleFirstbeatData = (BleFirstbeatData) obj;
        Log.d(d, ArraysUtil.toString(bleFirstbeatData.firstbeatList) + "\nConfig: " + bleFirstbeatData.firstbeatConfig, new Object[0]);
        return parseFirstbeatData(bleFirstbeatData);
    }
}
