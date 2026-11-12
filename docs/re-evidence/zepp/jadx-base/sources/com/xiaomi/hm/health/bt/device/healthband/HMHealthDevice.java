package com.xiaomi.hm.health.bt.device.healthband;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.Scopes;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.heathdevice.RemindType;
import com.huami.bluetooth.profile.hr.HealthDeviceHRCommand;
import com.huami.bluetooth.profile.hr.HeartRateControl;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMMiliProExtDevice;
import com.xiaomi.hm.health.bt.device.healthband.HMHealthDevice;
import com.xiaomi.hm.health.bt.model.HMLiftWristConfig;
import com.xiaomi.hm.health.bt.model.HMNBInfo;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.collect.DataCollect;
import com.xiaomi.hm.health.bt.profile.collect.HMSyncDataCollectTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.profile.gdsp.af.HMProSyncAfTimeStampTask;
import com.xiaomi.hm.health.bt.profile.gdsp.ecg.HMSyncECGTask;
import com.xiaomi.hm.health.bt.profile.gdsp.ecg.IHMECGDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.HMProSyncHeightLowHrTask;
import com.xiaomi.hm.health.bt.profile.gdsp.ppg.HMSyncPPGTask;
import com.xiaomi.hm.health.bt.profile.gdsp.ppg.IHMPPGDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.rr.HMProSyncRRDataTask;
import com.xiaomi.hm.health.bt.profile.gdsp.rr.RRData;
import com.xiaomi.hm.health.bt.profile.grsp.HMHealthBandSDControoler;
import com.xiaomi.hm.health.bt.profile.grsp.HMProSensorDataController;
import com.xiaomi.hm.health.bt.profile.healthdevice.HealthProfile;
import com.xiaomi.hm.health.bt.profile.healthdevice.remind.CommonRemindConfig;
import com.xiaomi.hm.health.bt.profile.healthdevice.remind.DrinkWaterConfig;
import com.xiaomi.hm.health.bt.profile.healthdevice.remind.HMMeasureRemind;
import com.xiaomi.hm.health.bt.profile.healthdevice.remind.HealthDeviceCmdHandler;
import com.xiaomi.hm.health.bt.profile.healthdevice.remind.MotorParam;
import com.xiaomi.hm.health.bt.profile.healthdevice.remind.ScreenLockConfig;
import com.xiaomi.hm.health.bt.profile.mili.model.MiLiHwConfig;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\bg\u0010hB\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010i\u001a\u00020$¢\u0006\u0004\bg\u0010jJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005H\u0002J\u001e\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0002J\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0002J\u0016\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016J\u001c\u0010\u0016\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0014J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014J\u0012\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010 \u001a\u00020\u0007H\u0014J\b\u0010\"\u001a\u0004\u0018\u00010!J\u0010\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\u001eJ\u001e\u0010&\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0016J\u001e\u0010'\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005H\u0016J\u0016\u0010)\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020(J\u0016\u0010+\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020*J\"\u0010.\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0\u0005J\"\u00101\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\u0005J(\u00102\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0/0\u0005J\u0018\u00106\u001a\u00020\u00072\u0006\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u00020\u001eJ\u001c\u00108\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u001e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005J\u0012\u0010:\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u000109H\u0014J\u001c\u0010;\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u001e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005J\"\u0010>\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u000f2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005J\u001c\u0010?\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u001e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005J\"\u0010B\u001a\u00020\u00072\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0/2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005J\u001c\u0010C\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020@2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005J\u0010\u0010D\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020@H\u0007J\u0018\u0010G\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020E2\u0006\u00107\u001a\u00020\u001eH\u0007J\u0010\u0010I\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020HH\u0007J\u0010\u0010K\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020JH\u0007J\u000e\u0010N\u001a\u00020\u001e2\u0006\u0010M\u001a\u00020LJ\u001c\u0010P\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020O2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005J\"\u0010S\u001a\u00020\u00072\f\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0/2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005J\u001e\u0010V\u001a\u00020\u00072\u0006\u0010U\u001a\u00020T2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0005J\u001e\u0010W\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u001e2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0005J\u001e\u0010X\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u001e2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0005J\u001e\u0010Z\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020\u001e2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0005J\u001e\u0010\\\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u001e2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0005R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R$\u0010c\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010f\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006k"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/healthband/HMHealthDevice;", "Lcom/xiaomi/hm/health/bt/device/HMMiliProExtDevice;", "Lcom/xiaomi/hm/health/bt/profile/healthdevice/HealthProfile;", "Lcom/xiaomi/hm/health/bt/profile/alert/HMAlertModeExt;", "mode", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "callback", "", "Q8", "Ljava/util/Calendar;", "time", "Lcom/xiaomi/hm/health/bt/profile/collect/DataCollect;", "P8", "N8", "Landroid/util/Pair;", "", "getCoeff", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/bluetooth/BluetoothDevice;", "device", "Lcom/xiaomi/hm/health/bt/profile/base/BaseProfile;", "createProfile", "newProfile", "Lcom/xiaomi/hm/health/bt/profile/milipro/MiLiProProfile;", Scopes.PROFILE, "Lcom/xiaomi/hm/health/bt/profile/grsp/HMProSensorDataController;", "newSensorDataController", "Lcom/xiaomi/hm/health/bt/profile/mili/model/MiLiHwConfig;", "config", "", "initSync", "onDeviceConnected", "Lcom/xiaomi/hm/health/bt/model/HMNBInfo;", "getNbInfo", "testSelf", "", "getImei", "getCollectData", "alert", "Lcom/xiaomi/hm/health/bt/profile/gdsp/ecg/IHMECGDataCallback;", "startSyncEcgData", "Lcom/xiaomi/hm/health/bt/profile/gdsp/ppg/IHMPPGDataCallback;", "startSyncHealthPPGData", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityDataFragment;", "", "startSyncAFTimeStamp", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/rr/RRData;", "startSyncRRData", "startSyncHeightLowHrData", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "task", "onOnlyThread", "putSyncTask", "enable", "enableAbnormalHeartWarning", "Lcom/xiaomi/hm/health/bt/model/HMLiftWristConfig;", "enableWristBrightSync", "enableGesturesBright", "high", "low", "setHRRange", "enableHRWarning", "Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/CommonRemindConfig;", "configs", "setUserReminds", "setUserRemind", "setUserRemindSync", "Lcom/huami/bluetooth/profile/heathdevice/RemindType;", "type", "enableRemindSync", "Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/DrinkWaterConfig;", "setDrinkWaterRemindSync", "Lcom/xiaomi/hm/health/bt/model/HMSedentaryConfig;", "setSedentaryRemindSync", "Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/HMMeasureRemind;", "remind", "setMeasureEcgRemindSync", "Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/ScreenLockConfig;", "setScreenLockConfig", "Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/MotorParam;", "params", "setMotorParam", "", "endTime", "setNBEndTime", "enableContinueSpo2Monitor", "enableFallDownNotify", "uploadSuccess", "syncFallDownEventUpload", "auth", "setUpEcgUserAuth", "Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/HealthDeviceCmdHandler;", "P", "Lcom/xiaomi/hm/health/bt/profile/healthdevice/remind/HealthDeviceCmdHandler;", "mHealthDeviceCmdHandler", "Q", "Landroid/util/Pair;", "coeff", "R", "Lcom/xiaomi/hm/health/bt/model/HMNBInfo;", "mNBInfo", "<init>", "(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)V", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "(Landroid/content/Context;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMHealthDevice extends HMMiliProExtDevice<HealthProfile> {

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @Nullable
    private HealthDeviceCmdHandler mHealthDeviceCmdHandler;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @Nullable
    private Pair<Integer, Integer> coeff;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    private HMNBInfo mNBInfo;

    public HMHealthDevice(@NotNull Context context, @NotNull BluetoothDevice bluetoothDevice) {
        super(context, bluetoothDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I8(HMHealthDevice hMHealthDevice, boolean z, HMCallback hMCallback) {
        Request.Command command;
        Debug.fi(HMBaseDevice.TAG, "start enableAbnormalHeartWarning setting");
        DeviceInfo deviceInfo = hMHealthDevice.getDeviceInfo();
        if (deviceInfo == null) {
            return;
        }
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        if (deviceSource == HMDeviceSource.MILI_JIUHUASHAN_PRO || deviceSource == HMDeviceSource.MILI_JIUHUASHAN) {
            command = ProfileUtils.compareVersion(deviceInfo.getFirmwareVersionStr(), "V1.0.7.86") >= 0 ? HealthDeviceHRCommand.SetAtrialFibV2.INSTANCE : HealthDeviceHRCommand.SetAtrialFibV1.INSTANCE;
        } else {
            command = HealthDeviceHRCommand.SetAtrialFibQinLing.INSTANCE;
        }
        Boolean boolEnableAbnormalHRWarning = hMHealthDevice.mHrController.enableAbnormalHRWarning(command, z ? HeartRateControl.Operation.Open.INSTANCE : HeartRateControl.Operation.Close.INSTANCE);
        Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("enableAbnormalHeartWarning result = ", boolEnableAbnormalHRWarning));
        hMCallback.sendFinishMessage(boolEnableAbnormalHRWarning.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J8(HMHealthDevice hMHealthDevice, boolean z, HMCallback hMCallback) {
        HealthDeviceCmdHandler healthDeviceCmdHandler = hMHealthDevice.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler != null) {
            healthDeviceCmdHandler.init();
        }
        HealthDeviceCmdHandler healthDeviceCmdHandler2 = hMHealthDevice.mHealthDeviceCmdHandler;
        boolean zEnableContinueSpo2Monitor = healthDeviceCmdHandler2 == null ? false : healthDeviceCmdHandler2.enableContinueSpo2Monitor(z);
        HealthDeviceCmdHandler healthDeviceCmdHandler3 = hMHealthDevice.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler3 != null) {
            healthDeviceCmdHandler3.deInit();
        }
        if (hMCallback == null) {
            return;
        }
        hMCallback.sendFinishMessage(zEnableContinueSpo2Monitor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K8(HMHealthDevice hMHealthDevice, boolean z, HMCallback hMCallback) {
        HealthDeviceCmdHandler healthDeviceCmdHandler = hMHealthDevice.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler != null) {
            healthDeviceCmdHandler.init();
        }
        HealthDeviceCmdHandler healthDeviceCmdHandler2 = hMHealthDevice.mHealthDeviceCmdHandler;
        boolean zEnableFallDownRemind = healthDeviceCmdHandler2 == null ? false : healthDeviceCmdHandler2.enableFallDownRemind(z);
        HealthDeviceCmdHandler healthDeviceCmdHandler3 = hMHealthDevice.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler3 != null) {
            healthDeviceCmdHandler3.deInit();
        }
        if (hMCallback == null) {
            return;
        }
        hMCallback.sendFinishMessage(zEnableFallDownRemind);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L8(HMCallback hMCallback, HMHealthDevice hMHealthDevice, boolean z) {
        hMCallback.sendOnStartMessage();
        Debug.fi(HMBaseDevice.TAG, "enableGesturesBright start");
        boolean zEnableWristBrightSync = hMHealthDevice.enableWristBrightSync(new HMLiftWristConfig(z));
        Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("enableGesturesBright enableWristBrightSync result = ", Boolean.valueOf(zEnableWristBrightSync)));
        if (zEnableWristBrightSync) {
            zEnableWristBrightSync = zEnableWristBrightSync && hMHealthDevice.miLiProProfile.enableWristFlip(z);
        }
        Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("enableGesturesBright result = ", Boolean.valueOf(zEnableWristBrightSync)));
        hMCallback.sendFinishMessage(zEnableWristBrightSync);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M8(HMCallback hMCallback, HMHealthDevice hMHealthDevice, boolean z) {
        hMCallback.sendOnStartMessage();
        HealthDeviceCmdHandler healthDeviceCmdHandler = hMHealthDevice.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler != null) {
            healthDeviceCmdHandler.init();
        }
        HealthDeviceCmdHandler healthDeviceCmdHandler2 = hMHealthDevice.mHealthDeviceCmdHandler;
        boolean hRRemind = healthDeviceCmdHandler2 == null ? false : healthDeviceCmdHandler2.setHRRemind(z);
        HealthDeviceCmdHandler healthDeviceCmdHandler3 = hMHealthDevice.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler3 != null) {
            healthDeviceCmdHandler3.deInit();
        }
        hMCallback.sendFinishMessage(hRRemind);
    }

    private final void N8(final Calendar time, final HMCallback<DataCollect> callback) {
        if (isConnected()) {
            runOnDeviceOnlyThread(new Runnable() { // from class: iz2
                @Override // java.lang.Runnable
                public final void run() {
                    HMHealthDevice.O8(callback, this, time);
                }
            });
        } else {
            callback.onStart();
            callback.onFinish((DataCollect) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O8(HMCallback hMCallback, HMHealthDevice hMHealthDevice, Calendar calendar) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(hMHealthDevice.isConnected() ? hMHealthDevice.getProfile().getCollectDataForOld(calendar) : null);
    }

    private final void P8(Calendar time, HMCallback<DataCollect> callback) {
        if (isConnected()) {
            runOnDeviceOnlyThread(new HMSyncDataCollectTask(this.miLiProProfile, time, callback));
        } else {
            callback.onStart();
            callback.onFinish((DataCollect) null);
        }
    }

    private final void Q8(final HMAlertModeExt mode, final HMCallback<?> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: mz2
            @Override // java.lang.Runnable
            public final void run() {
                HMHealthDevice.R8(callback, mode, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R8(HMCallback hMCallback, HMAlertModeExt hMAlertModeExt, HMHealthDevice hMHealthDevice) {
        if (hMCallback != null) {
            hMCallback.sendOnStartMessage();
        }
        if (hMAlertModeExt.getMode() == HMAlertMode.ALERT_LOVE) {
            hMAlertModeExt.setMode(HMAlertMode.ALERT_FIND);
        } else if (hMAlertModeExt.getMode() == HMAlertMode.ALERT_EMAIL) {
            hMAlertModeExt.setMode(HMAlertMode.ALERT_THIRD_APP);
        }
        boolean zAlert = hMHealthDevice.alertController.alert(hMAlertModeExt.getType() == 1 ? hMAlertModeExt.getMode() : HMAlertMode.ALERT_STOP);
        if (hMCallback == null) {
            return;
        }
        hMCallback.sendOnFinishMessage(zAlert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S8(HMCallback hMCallback, HMHealthDevice hMHealthDevice, int i, int i2) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(hMHealthDevice.userProfile.setHRRange(i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T8(HMHealthDevice hMHealthDevice, List list, HMCallback hMCallback) {
        HealthDeviceCmdHandler healthDeviceCmdHandler = hMHealthDevice.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler != null) {
            healthDeviceCmdHandler.init();
        }
        HealthDeviceCmdHandler healthDeviceCmdHandler2 = hMHealthDevice.mHealthDeviceCmdHandler;
        boolean motorParams = healthDeviceCmdHandler2 == null ? false : healthDeviceCmdHandler2.setMotorParams(list);
        HealthDeviceCmdHandler healthDeviceCmdHandler3 = hMHealthDevice.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler3 != null) {
            healthDeviceCmdHandler3.deInit();
        }
        hMCallback.sendFinishMessage(motorParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U8(HMHealthDevice hMHealthDevice, long j, HMCallback hMCallback) {
        HealthDeviceCmdHandler healthDeviceCmdHandler = hMHealthDevice.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler != null) {
            healthDeviceCmdHandler.init();
        }
        HealthDeviceCmdHandler healthDeviceCmdHandler2 = hMHealthDevice.mHealthDeviceCmdHandler;
        boolean nBEndTime = healthDeviceCmdHandler2 == null ? false : healthDeviceCmdHandler2.setNBEndTime(j);
        HealthDeviceCmdHandler healthDeviceCmdHandler3 = hMHealthDevice.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler3 != null) {
            healthDeviceCmdHandler3.deInit();
        }
        if (hMCallback == null) {
            return;
        }
        hMCallback.sendFinishMessage(nBEndTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V8(HMHealthDevice hMHealthDevice, ScreenLockConfig screenLockConfig, HMCallback hMCallback) {
        HealthDeviceCmdHandler healthDeviceCmdHandler = hMHealthDevice.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler != null) {
            healthDeviceCmdHandler.init();
        }
        HealthDeviceCmdHandler healthDeviceCmdHandler2 = hMHealthDevice.mHealthDeviceCmdHandler;
        boolean lockScreenConfig = healthDeviceCmdHandler2 == null ? false : healthDeviceCmdHandler2.setLockScreenConfig(screenLockConfig);
        HealthDeviceCmdHandler healthDeviceCmdHandler3 = hMHealthDevice.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler3 != null) {
            healthDeviceCmdHandler3.deInit();
        }
        hMCallback.sendFinishMessage(lockScreenConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W8(HMHealthDevice hMHealthDevice, boolean z, HMCallback hMCallback) {
        HealthDeviceCmdHandler healthDeviceCmdHandler = hMHealthDevice.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler != null) {
            healthDeviceCmdHandler.init();
        }
        HealthDeviceCmdHandler healthDeviceCmdHandler2 = hMHealthDevice.mHealthDeviceCmdHandler;
        boolean upEcgUserAuth = healthDeviceCmdHandler2 == null ? false : healthDeviceCmdHandler2.setUpEcgUserAuth(z);
        HealthDeviceCmdHandler healthDeviceCmdHandler3 = hMHealthDevice.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler3 != null) {
            healthDeviceCmdHandler3.deInit();
        }
        if (hMCallback == null) {
            return;
        }
        hMCallback.sendFinishMessage(upEcgUserAuth);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X8(HMCallback hMCallback, HMHealthDevice hMHealthDevice, CommonRemindConfig commonRemindConfig) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendFinishMessage(hMHealthDevice.setUserRemindSync(commonRemindConfig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y8(HMCallback hMCallback, HMHealthDevice hMHealthDevice, List list) {
        CommonRemindConfig commonRemindConfig;
        HealthDeviceCmdHandler healthDeviceCmdHandler;
        hMCallback.sendOnStartMessage();
        HealthDeviceCmdHandler healthDeviceCmdHandler2 = hMHealthDevice.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler2 != null) {
            healthDeviceCmdHandler2.init();
        }
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    z = true;
                    break;
                } else {
                    commonRemindConfig = (CommonRemindConfig) it2.next();
                    healthDeviceCmdHandler = hMHealthDevice.mHealthDeviceCmdHandler;
                }
            } while (healthDeviceCmdHandler == null ? false : healthDeviceCmdHandler.setRemind(hMHealthDevice.getDeviceInfo(), commonRemindConfig));
        } else {
            z = true;
            break;
        }
        HealthDeviceCmdHandler healthDeviceCmdHandler3 = hMHealthDevice.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler3 != null) {
            healthDeviceCmdHandler3.deInit();
        }
        hMCallback.sendFinishMessage(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z8(HMCallback hMCallback) {
        hMCallback.onStart();
        hMCallback.onFinish(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a9(HMHealthDevice hMHealthDevice, boolean z, HMCallback hMCallback) {
        HealthDeviceCmdHandler healthDeviceCmdHandler = hMHealthDevice.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler != null) {
            healthDeviceCmdHandler.init();
        }
        HealthDeviceCmdHandler healthDeviceCmdHandler2 = hMHealthDevice.mHealthDeviceCmdHandler;
        boolean zSyncFallDownEventUpload = healthDeviceCmdHandler2 == null ? false : healthDeviceCmdHandler2.syncFallDownEventUpload(z);
        HealthDeviceCmdHandler healthDeviceCmdHandler3 = hMHealthDevice.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler3 != null) {
            healthDeviceCmdHandler3.deInit();
        }
        if (hMCallback == null) {
            return;
        }
        hMCallback.sendFinishMessage(zSyncFallDownEventUpload);
    }

    public static /* synthetic */ void putSyncTask$default(HMHealthDevice hMHealthDevice, HMBaseTask hMBaseTask, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        hMHealthDevice.putSyncTask(hMBaseTask, z);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiProDevice, com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public void alert(@NotNull HMAlertModeExt mode, @Nullable HMCallback<?> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        if (TextUtils.isEmpty(mode.getMessage()) && TextUtils.isEmpty(mode.getTitle()) && mode.getMode() != HMAlertMode.ALERT_THIRD_APP) {
            Q8(mode, callback);
        } else {
            super.alert(mode, callback);
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiProDevice, com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    @NotNull
    public BaseProfile createProfile(@Nullable Context context, @Nullable BluetoothDevice device) {
        BaseProfile baseProfileCreateProfile = super.createProfile(context, device);
        this.mHealthDeviceCmdHandler = new HealthDeviceCmdHandler(baseProfileCreateProfile);
        return baseProfileCreateProfile;
    }

    public final void enableAbnormalHeartWarning(final boolean enable, @NotNull final HMCallback<Boolean> callback) {
        Debug.fi(HMBaseDevice.TAG, "start enableAbnormalHeartWarning");
        runOnDeviceMultiThread(new Runnable() { // from class: bz2
            @Override // java.lang.Runnable
            public final void run() {
                HMHealthDevice.I8(this.a, enable, callback);
            }
        });
    }

    public final void enableContinueSpo2Monitor(final boolean enable, @Nullable final HMCallback<Boolean> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: fz2
            @Override // java.lang.Runnable
            public final void run() {
                HMHealthDevice.J8(this.a, enable, callback);
            }
        });
    }

    public final void enableFallDownNotify(final boolean enable, @Nullable final HMCallback<Boolean> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: dz2
            @Override // java.lang.Runnable
            public final void run() {
                HMHealthDevice.K8(this.a, enable, callback);
            }
        });
    }

    public final void enableGesturesBright(final boolean enable, @NotNull final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            Debug.fi(HMBaseDevice.TAG, "enableGesturesBright failed because not connected");
        } else {
            runOnDeviceMultiThread(new Runnable() { // from class: lz2
                @Override // java.lang.Runnable
                public final void run() {
                    HMHealthDevice.L8(callback, this, enable);
                }
            });
        }
    }

    public final void enableHRWarning(final boolean enable, @NotNull final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: kz2
            @Override // java.lang.Runnable
            public final void run() {
                HMHealthDevice.M8(callback, this, enable);
            }
        });
    }

    @WorkerThread
    public final boolean enableRemindSync(@NotNull RemindType type, boolean enable) {
        HealthDeviceCmdHandler healthDeviceCmdHandler = this.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler != null) {
            healthDeviceCmdHandler.init();
        }
        HealthDeviceCmdHandler healthDeviceCmdHandler2 = this.mHealthDeviceCmdHandler;
        boolean zEnableRemind = healthDeviceCmdHandler2 == null ? false : healthDeviceCmdHandler2.enableRemind(type, enable);
        HealthDeviceCmdHandler healthDeviceCmdHandler3 = this.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler3 != null) {
            healthDeviceCmdHandler3.deInit();
        }
        return zEnableRemind;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiProDevice
    public boolean enableWristBrightSync(@Nullable HMLiftWristConfig config) {
        if (config == null) {
            return false;
        }
        boolean zEnableWristBright = this.miLiProProfile.enableWristBright(config.isEnable());
        Debug.fi(HMBaseDevice.TAG, "enableWristBrightSync config is " + config.isEnable() + " and result is " + zEnableWristBright);
        return zEnableWristBright;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    public Pair<Integer, Integer> getCoeff() {
        return this.coeff;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiProDevice
    public void getCollectData(@NotNull Calendar time, @NotNull HMCallback<DataCollect> callback) {
        if (!HMDeviceFeature.hasFeatureCollectData(getDeviceInfo())) {
            callback.onStart();
            callback.onFinish((DataCollect) null);
        } else if (HMDeviceFeature.hasQinLingFuture(getMDeviceSource())) {
            P8(time, callback);
        } else if (HMDeviceFeature.hasFeatureOldCollectData(getDeviceInfo())) {
            N8(time, callback);
        } else {
            super.getCollectData(time, callback);
        }
    }

    @Nullable
    public final String getImei(boolean testSelf) {
        HMNBInfo hMNBInfo = this.mNBInfo;
        if (hMNBInfo == null) {
            return null;
        }
        return hMNBInfo.getImei();
    }

    @Nullable
    /* JADX INFO: renamed from: getNbInfo, reason: from getter */
    public final HMNBInfo getMNBInfo() {
        return this.mNBInfo;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiProDevice, com.xiaomi.hm.health.bt.device.HMMiLiDevice
    public boolean initSync(@Nullable MiLiHwConfig config) {
        boolean z;
        if (config == null) {
            return true;
        }
        boolean goal = this.userProfile.setGoal(config.goals);
        Debug.fi(HMBaseDevice.TAG, "setGoal goals = " + config.goals + ", result =" + goal);
        boolean alarmSync = goal & setAlarmSync(config.alarms);
        Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("setAlarms ret = ", Boolean.valueOf(alarmSync)));
        boolean location = alarmSync & this.userProfile.setLocation(config.location);
        Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("set wear Location ret = ", Boolean.valueOf(location)));
        Debug.fi(HMBaseDevice.TAG, Intrinsics.stringPlus("bind wei xin result = ", Boolean.valueOf(bindWeixin(""))));
        if (config.nbIotEndTime >= 0) {
            HealthDeviceCmdHandler healthDeviceCmdHandler = this.mHealthDeviceCmdHandler;
            if (healthDeviceCmdHandler == null) {
                z = false;
            } else {
                healthDeviceCmdHandler.init();
                boolean nBEndTime = healthDeviceCmdHandler.setNBEndTime(config.nbIotEndTime);
                healthDeviceCmdHandler.deInit();
                z = nBEndTime;
            }
            Debug.fi(HMBaseDevice.TAG, getMDeviceSource() + " set nb iot end time: " + config.nbIotEndTime + " and result: " + z);
        }
        return location;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiProDevice
    @NotNull
    public HMProSensorDataController newSensorDataController(@NotNull MiLiProProfile profile) {
        return new HMHealthBandSDControoler(profile);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiProDevice, com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceConnected() {
        this.coeff = getProfile().getCoeff();
        this.mNBInfo = getProfile().getNBInfo(getDeviceInfo());
        super.onDeviceConnected();
    }

    public final void putSyncTask(@NotNull HMBaseTask task, boolean onOnlyThread) {
        if (onOnlyThread) {
            runOnDeviceOnlyThread(task);
        } else {
            runOnDeviceMultiThread(task);
        }
    }

    @WorkerThread
    public final boolean setDrinkWaterRemindSync(@NotNull DrinkWaterConfig config) {
        HealthDeviceCmdHandler healthDeviceCmdHandler = this.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler != null) {
            healthDeviceCmdHandler.init();
        }
        HealthDeviceCmdHandler healthDeviceCmdHandler2 = this.mHealthDeviceCmdHandler;
        boolean drinkWaterRemind = healthDeviceCmdHandler2 == null ? false : healthDeviceCmdHandler2.setDrinkWaterRemind(getDeviceInfo(), config);
        HealthDeviceCmdHandler healthDeviceCmdHandler3 = this.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler3 != null) {
            healthDeviceCmdHandler3.deInit();
        }
        return drinkWaterRemind;
    }

    public final void setHRRange(final int high, final int low, @NotNull final HMCallback<?> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: gz2
            @Override // java.lang.Runnable
            public final void run() {
                HMHealthDevice.S8(callback, this, high, low);
            }
        });
    }

    public final boolean setMeasureEcgRemindSync(@NotNull HMMeasureRemind remind) {
        HealthDeviceCmdHandler healthDeviceCmdHandler = this.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler != null) {
            healthDeviceCmdHandler.init();
        }
        HealthDeviceCmdHandler healthDeviceCmdHandler2 = this.mHealthDeviceCmdHandler;
        boolean measureECGRemind = healthDeviceCmdHandler2 == null ? false : healthDeviceCmdHandler2.setMeasureECGRemind(getDeviceInfo(), remind);
        HealthDeviceCmdHandler healthDeviceCmdHandler3 = this.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler3 != null) {
            healthDeviceCmdHandler3.deInit();
        }
        return measureECGRemind;
    }

    public final void setMotorParam(@NotNull final List<MotorParam> params, @NotNull final HMCallback<Boolean> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: az2
            @Override // java.lang.Runnable
            public final void run() {
                HMHealthDevice.T8(this.a, params, callback);
            }
        });
    }

    public final void setNBEndTime(final long endTime, @Nullable final HMCallback<Boolean> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: nz2
            @Override // java.lang.Runnable
            public final void run() {
                HMHealthDevice.U8(this.a, endTime, callback);
            }
        });
    }

    public final void setScreenLockConfig(@NotNull final ScreenLockConfig config, @NotNull final HMCallback<Boolean> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: oz2
            @Override // java.lang.Runnable
            public final void run() {
                HMHealthDevice.V8(this.a, config, callback);
            }
        });
    }

    @WorkerThread
    public final boolean setSedentaryRemindSync(@NotNull HMSedentaryConfig config) {
        if (!(getMDeviceSource() == HMDeviceSource.MILI_QINLING || getMDeviceSource() == HMDeviceSource.MILI_QINLING_1S)) {
            return getProfile().setSedentary(config);
        }
        HealthDeviceCmdHandler healthDeviceCmdHandler = this.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler != null) {
            healthDeviceCmdHandler.init();
        }
        HealthDeviceCmdHandler healthDeviceCmdHandler2 = this.mHealthDeviceCmdHandler;
        boolean sedentaryRemind = healthDeviceCmdHandler2 != null ? healthDeviceCmdHandler2.setSedentaryRemind(config) : false;
        HealthDeviceCmdHandler healthDeviceCmdHandler3 = this.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler3 == null) {
            return sedentaryRemind;
        }
        healthDeviceCmdHandler3.deInit();
        return sedentaryRemind;
    }

    public final void setUpEcgUserAuth(final boolean auth, @Nullable final HMCallback<Boolean> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: cz2
            @Override // java.lang.Runnable
            public final void run() {
                HMHealthDevice.W8(this.a, auth, callback);
            }
        });
    }

    public final void setUserRemind(@NotNull final CommonRemindConfig config, @NotNull final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: hz2
            @Override // java.lang.Runnable
            public final void run() {
                HMHealthDevice.X8(callback, this, config);
            }
        });
    }

    @WorkerThread
    public final boolean setUserRemindSync(@NotNull CommonRemindConfig config) {
        HealthDeviceCmdHandler healthDeviceCmdHandler = this.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler != null) {
            healthDeviceCmdHandler.init();
        }
        HealthDeviceCmdHandler healthDeviceCmdHandler2 = this.mHealthDeviceCmdHandler;
        boolean remind = healthDeviceCmdHandler2 == null ? false : healthDeviceCmdHandler2.setRemind(getDeviceInfo(), config);
        HealthDeviceCmdHandler healthDeviceCmdHandler3 = this.mHealthDeviceCmdHandler;
        if (healthDeviceCmdHandler3 != null) {
            healthDeviceCmdHandler3.deInit();
        }
        return remind;
    }

    public final void setUserReminds(@NotNull final List<CommonRemindConfig> configs, @NotNull final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: jz2
            @Override // java.lang.Runnable
            public final void run() {
                HMHealthDevice.Y8(callback, this, configs);
            }
        });
    }

    public final void startSyncAFTimeStamp(@NotNull Calendar time, @NotNull HMCallback<ActivityDataFragment<Byte>> callback) {
        if (isConnected()) {
            runOnDeviceOnlyThread(new HMProSyncAfTimeStampTask(this.miLiProProfile, time, callback));
        } else {
            callback.onStart();
            callback.onFinish((ActivityDataFragment<Byte>) null);
        }
    }

    public final void startSyncEcgData(@NotNull Calendar time, @NotNull IHMECGDataCallback callback) {
        if (isConnected()) {
            runOnDeviceOnlyThread(new HMSyncECGTask(this.miLiProProfile, time, callback, getDeviceInfo()));
        } else {
            callback.onStart();
            callback.onFinish(false);
        }
    }

    public final void startSyncHealthPPGData(@NotNull Calendar time, @NotNull IHMPPGDataCallback callback) {
        if (isConnected()) {
            runOnDeviceOnlyThread(new HMSyncPPGTask(this.miLiProProfile, time, callback, getDeviceInfo()));
        } else {
            callback.onStart();
            callback.onFinish(false);
        }
    }

    public final void startSyncHeightLowHrData(@NotNull Calendar time, @NotNull HMCallback<List<ActivityDataFragment<Byte>>> callback) {
        if (isConnected()) {
            runOnDeviceOnlyThread(new HMProSyncHeightLowHrTask(this.miLiProProfile, time, callback));
        } else {
            callback.onStart();
            callback.onFinish(false);
        }
    }

    public final void startSyncRRData(@NotNull Calendar time, @NotNull final HMCallback<List<RRData>> callback) {
        if (isConnected()) {
            runOnDeviceOnlyThread(new HMProSyncRRDataTask(this.miLiProProfile, time, callback));
        } else if (!callback.isOnUIThread()) {
            runOnDeviceOnlyThread(new Runnable() { // from class: zy2
                @Override // java.lang.Runnable
                public final void run() {
                    HMHealthDevice.Z8(callback);
                }
            });
        } else {
            callback.onStart();
            callback.onFinish(false);
        }
    }

    public final void syncFallDownEventUpload(final boolean uploadSuccess, @Nullable final HMCallback<Boolean> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: ez2
            @Override // java.lang.Runnable
            public final void run() {
                HMHealthDevice.a9(this.a, uploadSuccess, callback);
            }
        });
    }

    public HMHealthDevice(@NotNull Context context, @NotNull String str) {
        super(context, str);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiliProExtDevice, com.xiaomi.hm.health.bt.device.HMMiLiProDevice
    @NotNull
    public HealthProfile newProfile(@NotNull Context context, @NotNull BluetoothDevice device) {
        return new HealthProfile(context, device, this);
    }
}
