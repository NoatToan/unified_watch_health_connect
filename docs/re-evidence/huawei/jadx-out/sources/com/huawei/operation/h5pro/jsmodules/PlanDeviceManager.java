package com.huawei.operation.h5pro.jsmodules;

import android.bluetooth.BluetoothAdapter;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.plan.model.trainingplan.SmartPlanTypeEnum;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.interfaces.ServiceApiCallback;
import com.huawei.unitedevice.manager.SampleEventCache;
import com.huawei.utils.RiskBiAnalytics;
import defpackage.btw;
import defpackage.ecu;
import defpackage.edc;
import defpackage.eec;
import defpackage.eee;
import defpackage.eeq;
import defpackage.eey;
import defpackage.gnd;
import defpackage.irz;
import defpackage.lsl;
import defpackage.qey;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(name = "PlanDeviceManager")
public class PlanDeviceManager extends JsBaseModule {
    private static final String INTELLIGENT_TRAINING_PLAN = "intelligentTrainingPlan";
    private static final String SMART_TRAIN_PLAN_SRC_PKG_NAME = "hw.unitedevice.trainplan";
    private static final String SMART_TRAIN_PLAN_WEAR_PKG_NAME = "hw.sport.trainplan.device";
    private static final long SYNC_SMART_TRAIN_PLAN = 800200002;
    private static final String TAG = "H5PRO_PlanDeviceManager";
    private static final int TIMEOUT_MS = 5000;
    private static final String WEIGHT_MANAGEMENT_PLAN = "weightManagementPlan";

    public enum PlanSampleEventResult {
        STOP_PLAN_SUCCESS(0, "Stop Plan successfully"),
        DEVICE_STATUS_UNCONNECTED(1, "Device is unconnected"),
        STOP_PLAN_FAIL(2, "Stop Plan failed"),
        SYNC_PLAN_SUCCESS(200, "Sync Plan successfully"),
        NOTIFICATION_SANDING(201, "Notification is sending"),
        SYNC_PLAN_FAIL(401, "Sync Plan failed"),
        WITHOUT_PLAN(500, "Smart train plan is null"),
        BLUETOOTH_STATUS_UNCONNECTED(503, "Bluetooth is unconnected"),
        DEVICE_UNSUPPORTED_SMART_TRAIN_PLAN(501, "Device unsupported smart train plan"),
        DEVICE_UNCONNECTED(TypedValues.PositionType.TYPE_DRAWPATH, "Device is unconnected"),
        PLAN_NOT_YET_START(504, "Plan has not yet start");

        private final int code;
        private final String msg;

        PlanSampleEventResult(int i, String str) {
            this.code = i;
            this.msg = str;
        }

        public int getCode() {
            return this.code;
        }

        public String getMsg() {
            return this.msg;
        }
    }

    @H5ProMethod(name = "stopPlanToDevice")
    public static void stopPlanToDevice(String str, ServiceApiCallback<JSONObject> serviceApiCallback) {
        SmartPlanTypeEnum smartPlanTypeEnum;
        gnd gndVar = (gnd) HiJsonUtil.d(str, gnd.class);
        ReleaseLogUtil.c(TAG, "sendSampleEvent to stop smart train plan ", gndVar);
        if (serviceApiCallback == null) {
            LogUtil.j(TAG, "stopPlanToDevice callback is null");
            return;
        }
        eee sampleEvent = setSampleEvent(SYNC_SMART_TRAIN_PLAN, SMART_TRAIN_PLAN_SRC_PKG_NAME, SMART_TRAIN_PLAN_WEAR_PKG_NAME, 1);
        if (gndVar.a() == 0 && gndVar.b() == 0) {
            smartPlanTypeEnum = SmartPlanTypeEnum.SMART_WEIGHT_PLAN;
        } else {
            smartPlanTypeEnum = SmartPlanTypeEnum.SMART_TRAINING_PLAN;
        }
        if (BluetoothAdapter.getDefaultAdapter() == null || !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            stopPlanForDisconnect(sampleEvent, null, gndVar.c(), smartPlanTypeEnum);
            sampleEventCallBack(serviceApiCallback, PlanSampleEventResult.BLUETOOTH_STATUS_UNCONNECTED);
            return;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j(TAG, "device info is null or disconnect");
            stopPlanForDisconnect(sampleEvent, deviceInfo, gndVar.c(), smartPlanTypeEnum);
            sampleEventCallBack(serviceApiCallback, PlanSampleEventResult.DEVICE_STATUS_UNCONNECTED);
        } else {
            if (isSupportAndTrainingPlan(smartPlanTypeEnum)) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                stopPlanDeviceCallBack(serviceApiCallback, SMART_TRAIN_PLAN_SRC_PKG_NAME, SMART_TRAIN_PLAN_WEAR_PKG_NAME, SYNC_SMART_TRAIN_PLAN, countDownLatch);
                LogUtil.a(TAG, "send SampleEvent: ", sampleEvent.toString());
                boolean zSendSampleEventCommand = edc.e().sendSampleEventCommand(deviceInfo, sampleEvent, TAG);
                ReleaseLogUtil.c(TAG, "SampleEvent result is ", Boolean.valueOf(zSendSampleEventCommand));
                if (!zSendSampleEventCommand) {
                    sampleEventCallBack(serviceApiCallback, PlanSampleEventResult.STOP_PLAN_FAIL);
                    countDownLatch.countDown();
                }
                deviceResponseTimeOut(countDownLatch, serviceApiCallback, SMART_TRAIN_PLAN_SRC_PKG_NAME, PlanSampleEventResult.STOP_PLAN_FAIL);
                return;
            }
            LogUtil.a(TAG, "stop plan not support smart train plan");
            stopPlanNotSupportEventDevice(gndVar.c(), smartPlanTypeEnum);
            sampleEventCallBack(serviceApiCallback, PlanSampleEventResult.STOP_PLAN_SUCCESS);
        }
    }

    private static void stopPlanForDisconnect(eee eeeVar, DeviceInfo deviceInfo, String str, SmartPlanTypeEnum smartPlanTypeEnum) {
        if (isSupportAndTrainingPlan(smartPlanTypeEnum)) {
            sendPlanEventForCache(eeeVar, deviceInfo, smartPlanTypeEnum);
        } else {
            stopPlanNotSupportEventDevice(str, smartPlanTypeEnum);
        }
    }

    private static void stopPlanNotSupportEventDevice(String str, SmartPlanTypeEnum smartPlanTypeEnum) {
        IntPlan.PlanType planType;
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            ReleaseLogUtil.d(TAG, "get plan api failed.");
            return;
        }
        int i = AnonymousClass4.$SwitchMap$com$huawei$health$plan$model$trainingplan$SmartPlanTypeEnum[smartPlanTypeEnum.ordinal()];
        if (i == 1) {
            planType = IntPlan.PlanType.AI_RUN_PLAN;
        } else if (i == 2) {
            planType = IntPlan.PlanType.AI_FITNESS_PLAN;
        } else {
            planType = IntPlan.PlanType.NA_PLAN;
        }
        planApi.setNeedFinishPlanType(planType.getType());
        planApi.setNeedSendFinishPlan(str);
    }

    /* JADX INFO: renamed from: com.huawei.operation.h5pro.jsmodules.PlanDeviceManager$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$huawei$health$plan$model$trainingplan$SmartPlanTypeEnum;

        static {
            int[] iArr = new int[SmartPlanTypeEnum.values().length];
            $SwitchMap$com$huawei$health$plan$model$trainingplan$SmartPlanTypeEnum = iArr;
            try {
                iArr[SmartPlanTypeEnum.SMART_TRAINING_PLAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$huawei$health$plan$model$trainingplan$SmartPlanTypeEnum[SmartPlanTypeEnum.SMART_WEIGHT_PLAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static void sendPlanEventForCache(eee eeeVar, DeviceInfo deviceInfo, SmartPlanTypeEnum smartPlanTypeEnum) {
        if (deviceInfo == null) {
            deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        }
        if (isSupportAndTrainingPlan(smartPlanTypeEnum)) {
            LogUtil.a(TAG, "send SampleEvent: ", eeeVar.toString());
            edc.e().sendSampleEventCommand(deviceInfo, eeeVar, new SampleEventCache.e(SampleEventCache.SampleEventCacheReason.DISCONNECT, 24), TAG);
        }
    }

    public static boolean isSupportAndTrainingPlan(SmartPlanTypeEnum smartPlanTypeEnum) {
        if (smartPlanTypeEnum != SmartPlanTypeEnum.SMART_TRAINING_PLAN) {
            return false;
        }
        return eey.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, TAG), 295);
    }

    public static boolean isSupportIntPlan() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        return eey.d(deviceInfo, 41) || eey.d(deviceInfo, 169);
    }

    @H5ProMethod(name = "syncPlanInfoToDevice")
    public static void syncPlanInfoToDevice(String str, ServiceApiCallback<JSONObject> serviceApiCallback) {
        SmartPlanTypeEnum smartPlanTypeEnum;
        ReleaseLogUtil.c(TAG, "sendSampleEvent to sync smart train plan ", str);
        if (serviceApiCallback == null) {
            LogUtil.j(TAG, "syncPlanInfoToDevice callback is null");
            return;
        }
        if (WEIGHT_MANAGEMENT_PLAN.equals(str)) {
            smartPlanTypeEnum = SmartPlanTypeEnum.SMART_WEIGHT_PLAN;
        } else {
            smartPlanTypeEnum = SmartPlanTypeEnum.SMART_TRAINING_PLAN;
        }
        if (!checkFunctionAuth(smartPlanTypeEnum)) {
            ReleaseLogUtil.c(TAG, "functionAuth is false");
            sampleEventCallBack(serviceApiCallback, PlanSampleEventResult.SYNC_PLAN_FAIL);
        } else if (smartPlanTypeEnum == SmartPlanTypeEnum.SMART_TRAINING_PLAN) {
            checkPlanStartAndSend(smartPlanTypeEnum, serviceApiCallback);
        } else {
            syncPlanInfoToDevice(smartPlanTypeEnum, serviceApiCallback);
        }
    }

    private static void checkPlanStartAndSend(final SmartPlanTypeEnum smartPlanTypeEnum, final ServiceApiCallback<JSONObject> serviceApiCallback) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j(TAG, "convertIntPlanSendToDevice intPlanApi is null.");
            sampleEventCallBack(serviceApiCallback, PlanSampleEventResult.SYNC_PLAN_FAIL);
        } else {
            planApi.getCurrentPlan(new UiCallback<qey>() { // from class: com.huawei.operation.h5pro.jsmodules.PlanDeviceManager.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.b(PlanDeviceManager.TAG, "getCurrentPlan fail errorCode ", Integer.valueOf(i), " errorInfo ", str);
                    PlanDeviceManager.sampleEventCallBack(serviceApiCallback, PlanSampleEventResult.SYNC_PLAN_FAIL);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onSuccess(qey qeyVar) {
                    if (qeyVar == null) {
                        LogUtil.e(PlanDeviceManager.TAG, "getCurrentPlan plan is null");
                        PlanDeviceManager.sampleEventCallBack(serviceApiCallback, PlanSampleEventResult.SYNC_PLAN_FAIL);
                    } else if (btw.b(qeyVar.i(), lsl.a(qeyVar.m()))) {
                        PlanDeviceManager.syncPlanInfoToDevice(smartPlanTypeEnum, (ServiceApiCallback<JSONObject>) serviceApiCallback);
                    } else {
                        ReleaseLogUtil.b(PlanDeviceManager.TAG, "plan not start");
                        PlanDeviceManager.sampleEventCallBack(serviceApiCallback, PlanSampleEventResult.PLAN_NOT_YET_START);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void syncPlanInfoToDevice(SmartPlanTypeEnum smartPlanTypeEnum, ServiceApiCallback<JSONObject> serviceApiCallback) {
        eee sampleEvent = setSampleEvent(SYNC_SMART_TRAIN_PLAN, SMART_TRAIN_PLAN_SRC_PKG_NAME, SMART_TRAIN_PLAN_WEAR_PKG_NAME, 0);
        if (BluetoothAdapter.getDefaultAdapter() == null || !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            sendPlanEventForCache(sampleEvent, null, smartPlanTypeEnum);
            sampleEventCallBack(serviceApiCallback, PlanSampleEventResult.BLUETOOTH_STATUS_UNCONNECTED);
            return;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j(TAG, "device info is null");
            sendPlanEventForCache(sampleEvent, deviceInfo, smartPlanTypeEnum);
            sampleEventCallBack(serviceApiCallback, PlanSampleEventResult.DEVICE_UNCONNECTED);
            return;
        }
        if (isSupportAndTrainingPlan(smartPlanTypeEnum)) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            syncPlanDeviceCallBack(serviceApiCallback, SMART_TRAIN_PLAN_SRC_PKG_NAME, SMART_TRAIN_PLAN_WEAR_PKG_NAME, SYNC_SMART_TRAIN_PLAN, countDownLatch);
            LogUtil.a(TAG, "send SampleEvent: ", sampleEvent.toString());
            boolean zSendSampleEventCommand = edc.e().sendSampleEventCommand(deviceInfo, sampleEvent, TAG);
            ReleaseLogUtil.c(TAG, "SampleEvent result is ", Boolean.valueOf(zSendSampleEventCommand));
            if (!zSendSampleEventCommand) {
                sampleEventCallBack(serviceApiCallback, PlanSampleEventResult.SYNC_PLAN_FAIL);
                countDownLatch.countDown();
            }
            deviceResponseTimeOut(countDownLatch, serviceApiCallback, SMART_TRAIN_PLAN_SRC_PKG_NAME, PlanSampleEventResult.SYNC_PLAN_FAIL);
            return;
        }
        if (isSupportIntPlan()) {
            ReleaseLogUtil.c(TAG, "sync plan not support smart train plan");
            PluginSuggestion.getInstance().startSendIntelligentPlan();
            sampleEventCallBack(serviceApiCallback, PlanSampleEventResult.SYNC_PLAN_SUCCESS);
        } else {
            ReleaseLogUtil.c(TAG, "sync plan not support smart plan");
            sampleEventCallBack(serviceApiCallback, PlanSampleEventResult.DEVICE_UNSUPPORTED_SMART_TRAIN_PLAN);
        }
    }

    private static boolean checkFunctionAuth(SmartPlanTypeEnum smartPlanTypeEnum) {
        int i = AnonymousClass4.$SwitchMap$com$huawei$health$plan$model$trainingplan$SmartPlanTypeEnum[smartPlanTypeEnum.ordinal()];
        if (i == 1) {
            return btw.d(false);
        }
        if (i != 2) {
            return false;
        }
        return irz.i();
    }

    private static eee setSampleEvent(long j, String str, String str2, int i) {
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName(str);
        eeeVar.setWearPkgName(str2);
        eeeVar.setCommandId(2);
        eeeVar.a(j);
        eeeVar.a(0);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eventTime", System.currentTimeMillis());
            jSONObject.put("type", 0);
            jSONObject.put("action", i);
        } catch (JSONException e) {
            LogUtil.e(TAG, "callbackConnectListener err: ", e.getMessage());
        }
        eeeVar.e(eeq.c(eeq.a(jSONObject.toString())));
        return eeeVar;
    }

    private static void stopPlanDeviceCallBack(final ServiceApiCallback<JSONObject> serviceApiCallback, final String str, final String str2, final long j, final CountDownLatch countDownLatch) {
        edc.e().registerDeviceSampleListener(str, new DataReceiveCallback() { // from class: com.huawei.operation.h5pro.jsmodules.PlanDeviceManager.2
            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
                ReleaseLogUtil.c(PlanDeviceManager.TAG, "Received device event with errorCode:", Integer.valueOf(i));
                if (!(eecVar instanceof eee)) {
                    ReleaseLogUtil.d(PlanDeviceManager.TAG, "Message is not an instance of SampleEvent.");
                    return;
                }
                eee eeeVar = (eee) eecVar;
                if (eeeVar.d() != j || !str2.equals(eeeVar.getSrcPkgName())) {
                    ReleaseLogUtil.d(PlanDeviceManager.TAG, "message commandId or pkgName not match.");
                    return;
                }
                ReleaseLogUtil.c(PlanDeviceManager.TAG, "message:", eeeVar);
                String strD = eeq.d(eeq.e(eeeVar.c()));
                ReleaseLogUtil.c(PlanDeviceManager.TAG, "eventData:", strD);
                try {
                    if (new JSONObject(strD).optInt("result") == 0) {
                        PlanDeviceManager.sampleEventCallBack(serviceApiCallback, PlanSampleEventResult.STOP_PLAN_SUCCESS);
                    } else {
                        PlanDeviceManager.sampleEventCallBack(serviceApiCallback, PlanSampleEventResult.STOP_PLAN_FAIL);
                        RiskBiAnalytics.a(SmartPlanTypeEnum.SMART_TRAINING_PLAN.getValue(), RiskBiAnalytics.SmartPlanRiskType.RISK_TYPE_SEND_STOP_PLAN, String.valueOf(i), "stop plan by event fail");
                    }
                    edc.e().unRegisterDeviceSampleListener(str);
                    countDownLatch.countDown();
                } catch (JSONException e) {
                    ReleaseLogUtil.b(PlanDeviceManager.TAG, "getSampleEventInfo exception ", ExceptionUtils.c(e));
                    PlanDeviceManager.sampleEventCallBack(serviceApiCallback, PlanSampleEventResult.STOP_PLAN_FAIL);
                }
            }
        });
    }

    private static void syncPlanDeviceCallBack(final ServiceApiCallback<JSONObject> serviceApiCallback, final String str, final String str2, final long j, final CountDownLatch countDownLatch) {
        edc.e().registerDeviceSampleListener(str, new DataReceiveCallback() { // from class: com.huawei.operation.h5pro.jsmodules.PlanDeviceManager.3
            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
                ReleaseLogUtil.c(PlanDeviceManager.TAG, "Received device event with errorCode:", Integer.valueOf(i));
                if (!(eecVar instanceof eee)) {
                    ReleaseLogUtil.d(PlanDeviceManager.TAG, "Message is not an instance of SampleEvent.");
                    return;
                }
                eee eeeVar = (eee) eecVar;
                if (eeeVar.d() != j || !str2.equals(eeeVar.getSrcPkgName())) {
                    ReleaseLogUtil.d(PlanDeviceManager.TAG, "message commandId or pkgName not match.");
                    return;
                }
                ReleaseLogUtil.c(PlanDeviceManager.TAG, "message:", eeeVar);
                String strD = eeq.d(eeq.e(eeeVar.c()));
                ReleaseLogUtil.c(PlanDeviceManager.TAG, "eventData:", strD);
                try {
                    if (new JSONObject(strD).optInt("result") == 0) {
                        PlanDeviceManager.sampleEventCallBack(serviceApiCallback, PlanSampleEventResult.SYNC_PLAN_SUCCESS);
                    } else {
                        PlanDeviceManager.sampleEventCallBack(serviceApiCallback, PlanSampleEventResult.SYNC_PLAN_FAIL);
                        RiskBiAnalytics.a(SmartPlanTypeEnum.SMART_TRAINING_PLAN.getValue(), RiskBiAnalytics.SmartPlanRiskType.RISK_TYPE_SYNC_PLAN, String.valueOf(i), "sync plan by event fail");
                    }
                    edc.e().unRegisterDeviceSampleListener(str);
                    countDownLatch.countDown();
                } catch (JSONException e) {
                    ReleaseLogUtil.b(PlanDeviceManager.TAG, "getSampleEventInfo exception ", ExceptionUtils.c(e));
                    PlanDeviceManager.sampleEventCallBack(serviceApiCallback, PlanSampleEventResult.SYNC_PLAN_FAIL);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sampleEventCallBack(ServiceApiCallback<JSONObject> serviceApiCallback, PlanSampleEventResult planSampleEventResult) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", planSampleEventResult.getCode());
            jSONObject.put("msg", planSampleEventResult.getMsg());
            serviceApiCallback.onSuccess(jSONObject);
        } catch (JSONException e) {
            LogUtil.e(TAG, "callbackConnectListener err: ", e.getMessage());
        }
    }

    private static void deviceResponseTimeOut(CountDownLatch countDownLatch, ServiceApiCallback<JSONObject> serviceApiCallback, String str, PlanSampleEventResult planSampleEventResult) {
        try {
            if (countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                return;
            }
        } catch (InterruptedException unused) {
            ReleaseLogUtil.d(TAG, "Thread interrupted while waiting for device response.");
        }
        ReleaseLogUtil.d(TAG, "Device response timeout");
        sampleEventCallBack(serviceApiCallback, planSampleEventResult);
        edc.e().unRegisterDeviceSampleListener(str);
    }
}
