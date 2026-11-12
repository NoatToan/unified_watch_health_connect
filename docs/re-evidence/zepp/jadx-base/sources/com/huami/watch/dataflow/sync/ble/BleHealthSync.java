package com.huami.watch.dataflow.sync.ble;

import android.content.Context;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.appevents.UserDataStore;
import com.google.gson.Gson;
import com.huami.sleep.daysleep.quotient.SleepQuotientProviderKt;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.dataflow.model.health.AnalysisUtils;
import com.huami.watch.dataflow.model.health.HRDataManager;
import com.huami.watch.dataflow.model.health.bean.HealthDataItem;
import com.huami.watch.dataflow.model.health.bean.HealthHRDataItem;
import com.huami.watch.dataflow.model.health.bean.HealthRawDataItem;
import com.huami.watch.dataflow.model.health.bean.HealthRawHRItem;
import com.huami.watch.dataflow.model.health.bean.HealthSummaryItem;
import com.huami.watch.dataflow.sync.HealthSync;
import com.huami.watch.dataflow.sync.bean.HealthData;
import com.huami.watch.dataflow.sync.bean.HealthRequestData;
import com.huami.watch.dataflow.util.HealthDataParser;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Box;
import com.huami.watch.util.BytesUtil;
import com.huami.watch.util.DoLooper;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;
import com.xiaomi.hm.health.bt.error.HMDeviceSyncDataError;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.HMHrData;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.IHMHrDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.smartwatch.health.BleHealthData;
import com.xiaomi.hm.health.bt.profile.smartwatch.health.BleHealthSummary;
import com.xiaomi.hm.health.bt.profile.smartwatch.health.IHMHealthDataCallback;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.StageSleep;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class BleHealthSync extends HealthSync {
    private static final String h = "DataFlow-BLE-Health";
    private HMSmartWatchDevice d;
    private String e;
    private int f;
    private boolean g;

    public class a implements IHMHealthDataCallback {
        public final /* synthetic */ DoLooper.Result a;

        public a(DoLooper.Result result) {
            this.a = result;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
        public void onSyncFinish(HMDeviceSyncDataError hMDeviceSyncDataError) {
            Log.d(BleHealthSync.h, "OnSync HealthData Finish, Err: " + hMDeviceSyncDataError, new Object[0]);
            DoLooper.Result result = this.a;
            result.finish = true;
            result.success = hMDeviceSyncDataError.getError() == 0;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
        public void onSyncProgress(Progress progress) {
            Log.v(BleHealthSync.h, "OnSync HealthData Progress: " + progress, new Object[0]);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
        public void onSyncStart() {
            Log.i(BleHealthSync.h, "OnSync HealthData Start...", new Object[0]);
        }

        @Override // com.xiaomi.hm.health.bt.profile.smartwatch.health.IHMHealthDataCallback
        public void onSyncStop(BleHealthData bleHealthData) {
            Log.d(BleHealthSync.h, "OnSync HealthData!!", new Object[0]);
            this.a.data = bleHealthData;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
        public void onSyncStop(List<ActivityDataFragment> list) {
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

    public class c implements IHMHrDataCallback {
        public final /* synthetic */ DoLooper.Result a;

        public c(DoLooper.Result result) {
            this.a = result;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.hr.IHMHrDataCallback
        public void onHrData(ArrayList<HMHrData> arrayList) {
            this.a.data = arrayList;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.hr.IHMHrDataCallback
        public void onHrStart() {
            Log.i(BleHealthSync.h, "OnSync HRData Start...", new Object[0]);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.hr.IHMHrDataCallback
        public void onHrStop(boolean z) {
            Log.i(BleHealthSync.h, "OnSync HRData Finish, Success: " + z, new Object[0]);
            DoLooper.Result result = this.a;
            result.finish = true;
            result.success = z;
        }
    }

    public class d implements DoLooper.Function<DoLooper.Result> {
        public final /* synthetic */ DoLooper.Result a;

        public d(DoLooper.Result result) {
            this.a = result;
        }

        @Override // com.huami.watch.util.DoLooper.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DoLooper.Result apply() {
            return this.a;
        }
    }

    public BleHealthSync(Context context, HMSmartWatchDevice hMSmartWatchDevice, String str, int i, boolean z) {
        super(context);
        this.d = hMSmartWatchDevice;
        this.e = str;
        this.f = i;
        this.g = z;
    }

    @NonNull
    private List<HealthRawHRItem> g(@NonNull List<HMHrData> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (HMHrData hMHrData : list) {
            HealthRawHRItem healthRawHRItem = new HealthRawHRItem();
            healthRawHRItem.setDeviceId(this.e);
            healthRawHRItem.setDeviceSource(this.f);
            healthRawHRItem.setGeneratedTime(hMHrData.getTime().getTimeInMillis() / 1000);
            healthRawHRItem.setHeartRateData(HealthDataParser.encodeHeartRate(hMHrData.getHr()));
            arrayList.add(healthRawHRItem);
        }
        Log.d(h, "Parse HRData: " + ArraysUtil.toString(arrayList), new Object[0]);
        return arrayList;
    }

    private List<HealthData.Item> h(@NonNull List<BleHealthSummary> list, @NonNull List<ActivityDataFragment> list2) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            HealthRawDataItem healthRawDataItem = new HealthRawDataItem();
            BleHealthSummary bleHealthSummary = list.get(i);
            HealthSummaryItem healthSummaryItemJ = j(bleHealthSummary);
            HealthRawDataItem.MetaData metaData = new HealthRawDataItem.MetaData();
            metaData.setDate(TimeUtil.formatDate(bleHealthSummary.timestamp));
            metaData.setSource(this.f);
            metaData.setSummary(new Gson().toJson(healthSummaryItemJ));
            if (i >= list2.size()) {
                healthRawDataItem.setMetadata(new HealthRawDataItem.MetaData[]{metaData});
                HealthData.Item item = new HealthData.Item();
                item.setDataItem(healthRawDataItem);
                item.setData(new Gson().toJson(healthRawDataItem));
                item.setLastSyncTime(healthRawDataItem.getLastSyncTime());
                arrayList.add(item);
            } else {
                ActivityDataFragment activityDataFragment = list2.get(i);
                if (activityDataFragment == null || activityDataFragment.isEnd()) {
                    Log.w(h, "Ble Detail is Empty: " + activityDataFragment, new Object[0]);
                } else {
                    metaData.setValues(new HealthRawDataItem.MetaDataValue[]{i(activityDataFragment)});
                    Calendar calendar = activityDataFragment.timestamp;
                    calendar.add(12, activityDataFragment.size() - 1);
                    healthRawDataItem.setLastSyncTime((int) (calendar.getTimeInMillis() / 1000));
                    healthRawDataItem.setDId(this.e);
                    healthRawDataItem.setMetadata(new HealthRawDataItem.MetaData[]{metaData});
                    HealthData.Item item2 = new HealthData.Item();
                    item2.setDataItem(healthRawDataItem);
                    item2.setData(new Gson().toJson(healthRawDataItem));
                    item2.setLastSyncTime(healthRawDataItem.getLastSyncTime());
                    arrayList.add(item2);
                }
            }
        }
        return arrayList;
    }

    private HealthRawDataItem.MetaDataValue i(@NonNull ActivityDataFragment<ActivityData> activityDataFragment) {
        byte[] bArr;
        HealthDataItem healthDataItem = new HealthDataItem();
        byte[] bArr2 = null;
        if (activityDataFragment.size() > 0) {
            bArr2 = new byte[activityDataFragment.size() * 3];
            bArr = new byte[activityDataFragment.size()];
            int i = 0;
            for (ActivityData activityData : activityDataFragment.data) {
                bArr[i / 3] = (byte) activityData.hr;
                int i2 = i + 1;
                bArr2[i] = (byte) activityData.category;
                int i3 = i2 + 1;
                bArr2[i2] = (byte) activityData.intensity;
                bArr2[i3] = (byte) activityData.steps;
                i = i3 + 1;
            }
            healthDataItem.setData(bArr2);
            healthDataItem.setHeartRateData(bArr);
        } else {
            bArr = null;
        }
        Log.d(h, "Parse HealthData, RawData: " + BytesUtil.log(bArr2), new Object[0]);
        Log.d(h, "Parse HealthData, HeartRateRawData: " + BytesUtil.log(bArr), new Object[0]);
        Calendar calendar = activityDataFragment.timestamp;
        HealthRawDataItem.MetaDataValue metaDataValue = new HealthRawDataItem.MetaDataValue();
        metaDataValue.setStart((calendar.get(11) * 60) + calendar.get(12));
        metaDataValue.setStop((metaDataValue.getStart() + activityDataFragment.size()) - 1);
        metaDataValue.setDId(this.e);
        metaDataValue.setTz(calendar.getTimeZone().getID());
        if (bArr2 != null) {
            metaDataValue.setValue(Base64.encodeToString(bArr2, 2));
        }
        if (bArr != null) {
            metaDataValue.setHeartRateData(Base64.encodeToString(bArr, 2));
        }
        Log.d(h, "Parse HealthData, Detail: " + metaDataValue, new Object[0]);
        return metaDataValue;
    }

    private HealthSummaryItem j(@NonNull BleHealthSummary bleHealthSummary) {
        int i;
        int i2;
        int i3;
        HealthSummaryItem healthSummaryItem = new HealthSummaryItem();
        healthSummaryItem.setVersion(1);
        healthSummaryItem.setActive(bleHealthSummary.activeMinutes);
        healthSummaryItem.setFloorCount(bleHealthSummary.floorCount);
        healthSummaryItem.setGoal(bleHealthSummary.stepGoal);
        healthSummaryItem.setCaloryGoal(bleHealthSummary.calorieGoal);
        HealthSummaryItem.Step step = new HealthSummaryItem.Step();
        ArrayList<HealthSummaryItem.StageStep> arrayList = new ArrayList<>();
        if (ArraysUtil.isEmpty(bleHealthSummary.perHours)) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            for (BleHealthSummary.PerHour perHour : bleHealthSummary.perHours) {
                i += perHour.step;
                i2 += perHour.calorie;
                i3 += perHour.distance;
                HealthSummaryItem.StageStep stageStep = new HealthSummaryItem.StageStep();
                stageStep.setTime(perHour.hourIndex);
                stageStep.setStep(perHour.step);
                stageStep.setCalories(perHour.calorie);
                stageStep.setDistance(perHour.distance);
                arrayList.add(stageStep);
            }
        }
        step.setTotal(i);
        step.setCalories(i2);
        step.setDis(i3);
        step.setStageList(arrayList);
        healthSummaryItem.setStep(step);
        Log.d(h, "Parse HealthData, Summary: " + healthSummaryItem, new Object[0]);
        return healthSummaryItem;
    }

    @Nullable
    private List<HealthRawHRItem> k() {
        HealthHRDataItem latest;
        Calendar calendar = Calendar.getInstance();
        long lastHealthSignleHRSyncTime = Box.getLastHealthSignleHRSyncTime();
        if (lastHealthSignleHRSyncTime == 0 && (latest = HRDataManager.getManager().getLatest()) != null) {
            lastHealthSignleHRSyncTime = latest.getTimestamp();
        }
        calendar.setTimeInMillis((lastHealthSignleHRSyncTime + 1) * 1000);
        Log.i(h, "Sync BleHRData Start... [" + TimeUtil.formatDateTime(calendar.getTimeInMillis()) + "]", new Object[0]);
        DoLooper.Result result = new DoLooper.Result();
        this.d.startSyncHrData(calendar, new c(result));
        DoLooper.doLoop(new d(result), 1000, 60);
        Log.i(h, "Sync BleHRData Finish: " + result, new Object[0]);
        if (!result.success) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Object obj = result.data;
        if (obj == null) {
            return arrayList;
        }
        List<HMHrData> list = (List) obj;
        Log.d(h, "BleHRData: " + ArraysUtil.toString(list), new Object[0]);
        return !ArraysUtil.isEmpty(list) ? g(list) : arrayList;
    }

    @Nullable
    private List<HealthData.Item> l() {
        HealthRequestData healthRequestDataPrepareRequestData = prepareRequestData();
        if (healthRequestDataPrepareRequestData == null) {
            return null;
        }
        long j = healthRequestDataPrepareRequestData.lastSyncTimeMillis;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Log.i(h, "Sync BleHealthData Start... [" + TimeUtil.formatDateTime(j) + "]", new Object[0]);
        DoLooper.Result result = new DoLooper.Result();
        this.d.startSyncHealthData(calendar, new a(result));
        DoLooper.doLoop(new b(result), 1000, 300);
        Log.i(h, "Sync BleHealthData Finish: " + result, new Object[0]);
        if (!result.success) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Object obj = result.data;
        if (obj == null) {
            return arrayList;
        }
        BleHealthData bleHealthData = (BleHealthData) obj;
        List<BleHealthSummary> list = bleHealthData.summaryList;
        List<ActivityDataFragment> list2 = bleHealthData.detailList;
        Log.d(h, "BleHealthSummary: " + ArraysUtil.toString(list) + "\nBleHealthDetail: " + ArraysUtil.toString(list2), new Object[0]);
        return (ArraysUtil.isEmpty(list) || ArraysUtil.isEmpty(list2)) ? arrayList : h(list, list2);
    }

    @Override // com.huami.watch.dataflow.sync.HealthSync, com.huami.watch.dataflow.sync.BaseDataSync
    public String tag() {
        return h;
    }

    @Override // com.huami.watch.dataflow.sync.HealthSync, com.huami.watch.dataflow.sync.BaseDataSync, com.huami.watch.dataflow.sync.a
    public HealthRequestData prepareRequestData() {
        HealthRequestData healthRequestData = (HealthRequestData) super.prepareRequestData();
        if (healthRequestData != null && healthRequestData.lastSyncTimeMillis == 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(0L);
            calendar.set(2000, 0, 1, 0, 0, 0);
            healthRequestData.lastSyncTimeMillis = calendar.getTimeInMillis();
        }
        return healthRequestData;
    }

    @Override // com.huami.watch.dataflow.sync.HealthSync, com.huami.watch.dataflow.sync.a
    public boolean saveToLocal(Context context, @NonNull HealthData healthData) {
        Iterator<HealthData.Item> it2;
        JSONObject jSONObject;
        DaySportData daySleepInfo;
        JSONObject jSONObject2;
        boolean zSaveToLocal = super.saveToLocal(context, healthData);
        Iterator<HealthData.Item> it3 = healthData.items.iterator();
        while (it3.hasNext()) {
            HealthData.Item next = it3.next();
            HealthRawDataItem healthRawDataItem = (HealthRawDataItem) new Gson().fromJson(next.getData(), HealthRawDataItem.class);
            HealthRawDataItem.MetaData[] metadata = healthRawDataItem.getMetadata();
            int length = metadata.length;
            int i = 0;
            while (i < length) {
                HealthRawDataItem.MetaData metaData = metadata[i];
                try {
                    String summary = metaData.getSummary();
                    if (summary != null) {
                        jSONObject2 = new JSONObject(summary);
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject == null || (daySleepInfo = AnalysisUtils.getDaySleepInfo(metaData.getDate())) == null) {
                        jSONObject = jSONObject2;
                        jSONObject = jSONObject2;
                        it2 = it3;
                    } else {
                        jSONObject = jSONObject2;
                        SleepInfo sleepInfo = daySleepInfo.getSleepInfo();
                        if (sleepInfo != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("rhr", sleepInfo.getRestHeartRate());
                            jSONObject3.put(UserDataStore.STATE, sleepInfo.getStartDate().getTime() / 1000);
                            jSONObject3.put("ed", sleepInfo.getStopDate().getTime() / 1000);
                            jSONObject3.put(Constant.PAI_KEY_DAILY_PAI, sleepInfo.getNonRemCount());
                            jSONObject3.put("lt", sleepInfo.getRemCount());
                            jSONObject3.put(StepsInfo.KEY_STEP_WALK_TIME, sleepInfo.getAwakeCount());
                            jSONObject3.put("wc", sleepInfo.getAwakeNum());
                            ArrayList<StageSleep> stageSleep = sleepInfo.getStageSleep();
                            if (stageSleep == null || stageSleep.isEmpty()) {
                                it2 = it3;
                            } else {
                                JSONArray jSONArray = new JSONArray();
                                int i2 = 0;
                                for (StageSleep stageSleep2 : stageSleep) {
                                    JSONObject jSONObject4 = new JSONObject();
                                    it2 = it3;
                                    try {
                                        jSONObject4.put("start", stageSleep2.start + SleepQuotientProviderKt.SLEEP_FALL_ASLEEP_MIN);
                                        jSONObject4.put(Command.STOP, stageSleep2.stop + SleepQuotientProviderKt.SLEEP_FALL_ASLEEP_MIN);
                                        jSONObject4.put("mode", stageSleep2.mode);
                                        jSONArray.put(i2, jSONObject4);
                                        i2++;
                                        it3 = it2;
                                    } catch (JSONException e) {
                                        e = e;
                                        e.printStackTrace();
                                        i++;
                                        it3 = it2;
                                    }
                                }
                                it2 = it3;
                                jSONObject3.put(StepsInfo.KEY_STAGE, jSONArray);
                            }
                            jSONObject.put("slp", jSONObject3);
                        } else {
                            it2 = it3;
                            jSONObject.put("rhr", 0);
                        }
                        String string = jSONObject.toString();
                        try {
                            Log.d(h, "To cloud summary : " + string, new Object[0]);
                            metaData.setSummary(string);
                        } catch (JSONException e2) {
                            e = e2;
                            e.printStackTrace();
                        }
                    }
                } catch (JSONException e3) {
                    e = e3;
                    it2 = it3;
                }
                i++;
                it3 = it2;
            }
            next.setData(new Gson().toJson(healthRawDataItem));
        }
        return zSaveToLocal;
    }

    @Override // com.huami.watch.dataflow.sync.BaseDataSync, com.huami.watch.dataflow.sync.a
    public HealthData syncWatchData() {
        if (this.d == null) {
            Log.w(h, "BleDevice is Null, Abort!!", new Object[0]);
            return null;
        }
        List<HealthData.Item> listL = l();
        Log.d(h, "Sync Single HR: " + this.g, new Object[0]);
        List<HealthRawHRItem> arrayList = new ArrayList<>();
        if (this.g) {
            arrayList = k();
        }
        if (listL == null || arrayList == null) {
            Log.w(h, "Sync HealthData Fail!!", new Object[0]);
            return null;
        }
        HealthData healthData = new HealthData();
        healthData.items = listL;
        healthData.hrItems = arrayList;
        return healthData;
    }
}
