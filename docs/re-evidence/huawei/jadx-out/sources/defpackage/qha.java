package defpackage;

import android.content.Intent;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.api.phoneprocess.SamplePointAfterProcess;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.time.Instant;
import java.time.zone.ZoneOffsetTransition;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes15.dex */
public class qha implements SamplePointAfterProcess {
    @Override // com.huawei.health.devicemgr.api.phoneprocess.SamplePointAfterProcess
    public HiHealthData onSamplePointAfterProcess(final HiHealthData hiHealthData, String str) {
        if (hiHealthData == null) {
            LogUtil.j("SCUI_ThreeCirclePointAfterProcess", "hiHealthData == null");
            return null;
        }
        long startTime = hiHealthData.getStartTime();
        long endTime = hiHealthData.getEndTime();
        a(hiHealthData, startTime);
        final HashMap<Integer, Integer> map = (HashMap) HiJsonUtil.d(hiHealthData.getFieldsValue(), new TypeToken<HashMap<Integer, Integer>>() { // from class: com.huawei.threecircle.ThreeCirclePointAfterProcess$1
        }.getType());
        c(map, hiHealthData, startTime);
        if (lsl.aa(startTime)) {
            LogUtil.a("SCUI_ThreeCirclePointAfterProcess", "isCurrentDay return startTime is", Long.valueOf(startTime));
            return hiHealthData;
        }
        if (map == null) {
            LogUtil.j("SCUI_ThreeCirclePointAfterProcess", "values is null");
            return hiHealthData;
        }
        final int iD = d(map, DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_VALUE.value());
        final int iD2 = d(map, DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_VALUE.value());
        final int iD3 = d(map, DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_VALUE.value());
        final int iD4 = d(map, DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_VALUE.value());
        LogUtil.a("SCUI_ThreeCirclePointAfterProcess", "onSamplePointAfterProcess startTime ", Long.valueOf(startTime), " syncStepTarget ", Integer.valueOf(iD), " syncIntensityTarget ", Integer.valueOf(iD2), "  syncCalorieTarget ", Integer.valueOf(iD3), " syncActiveHourTarget ", Integer.valueOf(iD4));
        b(lsl.r(startTime), lsl.c(endTime), new ResponseCallback<List<HiHealthData>>() { // from class: qha.5
            @Override // com.huawei.hwbasemgr.ResponseCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i, List<HiHealthData> list) {
                if (njy.e(list)) {
                    LogUtil.j("SCUI_ThreeCirclePointAfterProcess", "onSamplePointAfterProcess data is null ");
                    return;
                }
                HiHealthData hiHealthData2 = list.get(0);
                int i2 = hiHealthData2.getInt("stepGoalValue");
                int i3 = hiHealthData2.getInt("durationGoalValue");
                int i4 = hiHealthData2.getInt("activeGoalValue");
                int i5 = hiHealthData2.getInt("calorieGoalValue");
                LogUtil.a("SCUI_ThreeCirclePointAfterProcess", "onSamplePointAfterProcess stepTarget ", Integer.valueOf(i2), " intensityTarget ", Integer.valueOf(i3), "  calorieTarget ", Integer.valueOf(i5), " standTarget ", Integer.valueOf(i4));
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_VALUE.value()), Integer.valueOf(qha.this.d(i2, iD)));
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_VALUE.value()), Integer.valueOf(qha.this.d(i3, iD2)));
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_VALUE.value()), Integer.valueOf(qha.this.d(i5, iD3)));
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_VALUE.value()), Integer.valueOf(qha.this.d(i4, iD4)));
                hiHealthData.setFieldsValue(HiJsonUtil.d(map));
            }
        });
        try {
            Thread.sleep(50L);
            return hiHealthData;
        } catch (InterruptedException unused) {
            LogUtil.e("SCUI_ThreeCirclePointAfterProcess", "InterruptedException");
            return hiHealthData;
        }
    }

    private void a(HiHealthData hiHealthData, long j) {
        if (c(j) && !b()) {
            long jD = DateFormatUtil.d(DateFormatUtil.a(j, lsl.a(lsl.q(System.currentTimeMillis()))));
            long jC = lsl.c(jD);
            hiHealthData.setStartTime(jD);
            hiHealthData.setEndTime(jC);
            ReleaseLogUtil.d("SCUI_ThreeCirclePointAfterProcess", "Transition with start: ", Long.valueOf(jD), " end: ", Long.valueOf(jC));
            return;
        }
        hiHealthData.setStartTime(lsl.r(j));
        hiHealthData.setEndTime(lsl.c(hiHealthData.getEndTime()));
    }

    private boolean b() {
        return eey.d(d(), 282);
    }

    private boolean c(long j) {
        ZoneOffsetTransition zoneOffsetTransitionPreviousTransition = TimeZone.getDefault().toZoneId().getRules().previousTransition(Instant.now());
        if (zoneOffsetTransitionPreviousTransition == null) {
            return false;
        }
        long epochSecond = zoneOffsetTransitionPreviousTransition.toEpochSecond() * 1000;
        return epochSecond > 1388534400000L && j < epochSecond;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(int i, int i2) {
        return i != 0 ? Math.min(i, i2) : i2;
    }

    private void b(long j, long j2, ResponseCallback<List<HiHealthData>> responseCallback) {
        qhb.c().c(j, j2, responseCallback);
    }

    private void c(HashMap<Integer, Integer> map, final HiHealthData hiHealthData, long j) {
        if (map == null) {
            LogUtil.j("SCUI_ThreeCirclePointAfterProcess", "saveStatisticsData values is null.");
            return;
        }
        int iD = d(map, DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_USER_VALUE.value());
        int iD2 = d(map, DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_USER_VALUE.value());
        if (lsl.ab(j)) {
            a(j, iD, iD2);
        }
        int iD3 = d(map, DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_USER_VALUE.value());
        int iD4 = d(map, DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CLIMB_USER_VALUE.value());
        int iD5 = d(map, DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DISTANCE_USER_VALUE.value());
        int iD6 = d(map, DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_PUSHES_VAL.value());
        int iD7 = d(map, DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_MICRO_WORKOUT.value());
        ReleaseLogUtil.d("SCUI_ThreeCirclePointAfterProcess", "time: ", Long.valueOf(j), "saveStatisticsData syncTotalStep ", LogAnonymous.d(iD), " syncTotalCalorie ", LogAnonymous.d(iD2), " syncTotalIntensity ", LogAnonymous.d(iD3), " syncTotalClimb ", LogAnonymous.d(iD4), " syncTotalDistance ", LogAnonymous.d(iD5), " syncTotalPush ", LogAnonymous.d(iD6), " syncTotalMicroWorkoutTimes ", LogAnonymous.d(iD7));
        if (iD == 0 && iD2 == 0 && iD3 == 0 && iD4 == 0 && iD5 == 0) {
            LogUtil.j("SCUI_ThreeCirclePointAfterProcess", "All zero data");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(d(40002, hiHealthData, iD));
        arrayList.add(d(40003, hiHealthData, iD2));
        arrayList.add(d(47101, hiHealthData, iD3));
        arrayList.add(d(SmartMsgConstant.MSG_TYPE_RIDE_USER, hiHealthData, iD4));
        arrayList.add(d(40004, hiHealthData, iD5));
        arrayList.add(d(40008, hiHealthData, iD6));
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(arrayList);
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: qha.1
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a("SCUI_ThreeCirclePointAfterProcess", "onSamplePointAfterProcess errorCode:", Integer.valueOf(i));
                if (ltb.ac(new Date(hiHealthData.getStartTime()))) {
                    qha.this.c();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        BroadcastManagerUtil.e(BaseApplication.getContext(), new Intent("com.huawei.health.SYNC_DB_FOR_DEVICE_CHANGE"));
    }

    private HiHealthData d(int i, HiHealthData hiHealthData, int i2) {
        HiHealthData hiHealthData2 = new HiHealthData();
        hiHealthData2.setType(i);
        hiHealthData2.setDeviceUuid(hiHealthData.getDeviceUuid());
        hiHealthData2.setTimeInterval(hiHealthData.getStartTime(), hiHealthData.getEndTime());
        hiHealthData2.setValue(i2);
        return hiHealthData2;
    }

    private int d(HashMap<Integer, Integer> map, int i) {
        if (!map.containsKey(Integer.valueOf(i)) || map.get(Integer.valueOf(i)) == null) {
            return 0;
        }
        return map.get(Integer.valueOf(i)).intValue();
    }

    private void a(final long j, final int i, final int i2) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: qgz
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b(j, i, i2);
            }
        });
    }

    /* synthetic */ void b(long j, int i, int i2) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(5);
        linkedHashMap.put(OpAnalyticsConstants.RESULT_DESCRIBE, "saveFutureError" + j);
        DeviceInfo deviceInfoD = d();
        if (deviceInfoD != null) {
            linkedHashMap.put("deviceVersion", deviceInfoD.getSoftVersion());
            linkedHashMap.put("deviceName", deviceInfoD.getDeviceName());
        }
        linkedHashMap.put("syncTotalStep", String.valueOf(i));
        linkedHashMap.put("syncTotalCalorie", String.valueOf(i2));
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_STEP_COUNT_85070014.value(), linkedHashMap);
        ReleaseLogUtil.a("SCUI_ThreeCirclePointAfterProcess", "Future error：", Long.valueOf(j), " cl:' ", Integer.valueOf(i2));
        LogUtil.b("SCUI_ThreeCirclePointAfterProcess", "ErrorType: Insert Future Data, biKey:" + OperationKey.HEALTH_APP_HEALTH_EXCEPTION_2129027.value());
    }

    private DeviceInfo d() {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = edb.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "SCUI_ThreeCirclePointAfterProcess");
        if (njy.e(deviceList)) {
            return null;
        }
        for (DeviceInfo deviceInfo2 : deviceList) {
            if (deviceInfo2 != null && !eel.d(deviceInfo2.getProductType())) {
                deviceInfo = deviceInfo2;
                break;
            }
        }
        LogUtil.a("SCUI_ThreeCirclePointAfterProcess", "getConnectDeviceInfo() deviceInfo ", deviceInfo);
        return deviceInfo;
    }
}
