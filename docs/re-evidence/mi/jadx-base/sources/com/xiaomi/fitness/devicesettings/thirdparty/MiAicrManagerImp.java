package com.xiaomi.fitness.devicesettings.thirdparty;

import android.os.Bundle;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.aicr.constant.ResultCode;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.sleepai.MiAicrManager;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import defpackage.bed;
import defpackage.ced;
import defpackage.s34;
import defpackage.s7r;
import defpackage.u34;
import defpackage.udd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001\u001d\u0018\u0000 !2\u00020\u0001:\u0001!B\t\b\u0007¢\u0006\u0004\b \u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ!\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/devicesettings/thirdparty/MiAicrManagerImp;", "Lcom/xiaomi/fitness/devicesettings/export/sleepai/MiAicrManager;", "", "bindMIAIPhoneStateService", "()V", "", "bindMIAIPhoneStateServiceSuc", "()Z", "isSupportMIAIPhoneStateListen", "", "startMIAIPhoneStateListen", "()I", "stopMIAIPhoneStateListen", "event", "sendSceneMessage", "(I)I", "startDeviceTrace", "stopDeviceTrace", "listenMode", "", "data", "interval", "sendPhoneState", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "isServiceConnected", "Z", "Ls34;", "mCognitionManager", "Ls34;", "com/xiaomi/fitness/devicesettings/thirdparty/MiAicrManagerImp$mCognitionServiceConnection$1", "mCognitionServiceConnection", "Lcom/xiaomi/fitness/devicesettings/thirdparty/MiAicrManagerImp$mCognitionServiceConnection$1;", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMiAicrManagerImp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiAicrManagerImp.kt\ncom/xiaomi/fitness/devicesettings/thirdparty/MiAicrManagerImp\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,241:1\n29#2:242\n*S KotlinDebug\n*F\n+ 1 MiAicrManagerImp.kt\ncom/xiaomi/fitness/devicesettings/thirdparty/MiAicrManagerImp\n*L\n179#1:242\n*E\n"})
public final class MiAicrManagerImp implements MiAicrManager {
    public static final int LISTEN_MODE_OFF = 1;
    public static final int LISTEN_MODE_ON = 0;

    @NotNull
    public static final String MIAI_TAG = "MIAICR";
    private boolean isServiceConnected;

    @Nullable
    private s34 mCognitionManager;

    @NotNull
    private final MiAicrManagerImp$mCognitionServiceConnection$1 mCognitionServiceConnection = new u34() { // from class: com.xiaomi.fitness.devicesettings.thirdparty.MiAicrManagerImp$mCognitionServiceConnection$1
        @Override // defpackage.u34
        public /* bridge */ /* synthetic */ void onError(int i) {
            super.onError(i);
        }

        @Override // defpackage.u34
        public void onServiceConnected(int connectStatus) {
            if (connectStatus != ResultCode.RESULT_OK.getCode()) {
                this.this$0.isServiceConnected = false;
                Logger.i(MiAicrManagerImp.MIAI_TAG, "CognitionServiceConnection connect failed");
            } else {
                this.this$0.isServiceConnected = true;
                Logger.i(MiAicrManagerImp.MIAI_TAG, "CognitionServiceConnection connect success");
                this.this$0.startMIAIPhoneStateListen();
            }
        }

        @Override // defpackage.u34
        public void onServiceDisconnected() {
            this.this$0.isServiceConnected = false;
            Logger.i(MiAicrManagerImp.MIAI_TAG, "CognitionServiceConnection disconnect");
        }
    };

    @Override // com.xiaomi.fitness.devicesettings.export.sleepai.MiAicrManager
    public void bindMIAIPhoneStateService() {
        DeviceSettingsPreference.INSTANCE.setDEVICE_MICR_PHONE_STATE_CHANGE_MODE(0);
        try {
            this.mCognitionManager = new s34(ApplicationExtKt.getApplication(), this.mCognitionServiceConnection, new int[]{2003});
        } catch (Exception unused) {
            Logger.e(MIAI_TAG, "bindMIAIPhoneStateService exception");
        }
    }

    @Override // com.xiaomi.fitness.devicesettings.export.sleepai.MiAicrManager
    /* JADX INFO: renamed from: bindMIAIPhoneStateServiceSuc, reason: from getter */
    public boolean getIsServiceConnected() {
        return this.isServiceConnected;
    }

    @Override // com.xiaomi.fitness.devicesettings.export.sleepai.MiAicrManager
    public boolean isSupportMIAIPhoneStateListen() {
        return s34.u5(ApplicationExtKt.getApplication(), new int[]{2003});
    }

    @Override // com.xiaomi.fitness.devicesettings.export.sleepai.MiAicrManager
    public int listenMode() {
        return DeviceSettingsPreference.INSTANCE.getDEVICE_MICR_PHONE_STATE_CHANGE_MODE();
    }

    @Override // com.xiaomi.fitness.devicesettings.export.sleepai.MiAicrManager
    public void sendPhoneState(@NotNull String data, @Nullable final Boolean interval) {
        Intrinsics.checkNotNullParameter(data, "data");
        PhoneStateData phoneStateData = (PhoneStateData) new Gson().fromJson(data, new TypeToken<PhoneStateData>() { // from class: com.xiaomi.fitness.devicesettings.thirdparty.MiAicrManagerImp$sendPhoneState$$inlined$fromJson$1
        }.getType());
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Logger.i(MIAI_TAG, "phoneStateData = " + phoneStateData + " interval = " + interval + " isDeviceConnected = " + (wearableDeviceModel != null ? Boolean.valueOf(wearableDeviceModel.isDeviceConnected()) : null));
        if (wearableDeviceModel == null || !wearableDeviceModel.isDeviceConnected()) {
            return;
        }
        int device_micr_phone_state_change_mode = DeviceSettingsPreference.INSTANCE.getDEVICE_MICR_PHONE_STATE_CHANGE_MODE();
        if (device_micr_phone_state_change_mode != 0) {
            if (device_micr_phone_state_change_mode != 1) {
                return;
            }
            Logger.i(MIAI_TAG, "sendPhoneState LISTEN_MODE_UN");
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 23;
        udd uddVar = new udd();
        if (Intrinsics.areEqual(interval, Boolean.TRUE)) {
            s7rVar.f = 22;
            bed bedVar = new bed();
            bedVar.g = phoneStateData.getLight() < 65536 ? phoneStateData.getLight() : 65536;
            bedVar.f = phoneStateData.getOri_mean();
            bedVar.d = phoneStateData.getOri_count();
            bedVar.e = phoneStateData.getOri_std();
            bedVar.c = phoneStateData.getOri_cur();
            uddVar.x(bedVar);
        } else {
            s7rVar.f = 19;
            ced cedVar = new ced();
            cedVar.d = phoneStateData.getScreen();
            cedVar.c = phoneStateData.getHold() == 1;
            cedVar.e = phoneStateData.getTop_app();
            uddVar.y(cedVar);
        }
        s7rVar.U(uddVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), wearableDeviceModel.getDid(), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.thirdparty.MiAicrManagerImp.sendPhoneState.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(MiAicrManagerImp.MIAI_TAG, "sendPhoneState onError");
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(MiAicrManagerImp.MIAI_TAG, "sendPhoneState is_Interval " + interval + " onSuccess = " + (result != null ? Integer.valueOf(result.getCode()) : null));
            }
        }, 0, 16, (Object) null);
    }

    @Override // com.xiaomi.fitness.devicesettings.export.sleepai.MiAicrManager
    public int sendSceneMessage(int event) {
        int iY3;
        if (this.mCognitionManager == null) {
            bindMIAIPhoneStateService();
        }
        try {
            s34 s34Var = this.mCognitionManager;
            Intrinsics.checkNotNull(s34Var);
            iY3 = s34Var.y3(event, 3, 2003, new Bundle());
        } catch (Exception unused) {
            Logger.e(MIAI_TAG, "mCognitionManager setSceneMessage CRS_DOMAIN_DEVICE exception");
            iY3 = -1;
        }
        Logger.i(MIAI_TAG, "sendSceneMessage result = " + iY3 + ",event = " + event);
        return iY3;
    }

    @Override // com.xiaomi.fitness.devicesettings.export.sleepai.MiAicrManager
    public int startDeviceTrace() {
        int iY3;
        if (this.mCognitionManager == null) {
            bindMIAIPhoneStateService();
        }
        try {
            s34 s34Var = this.mCognitionManager;
            Intrinsics.checkNotNull(s34Var);
            iY3 = s34Var.y3(2004, 3, 2003, new Bundle());
        } catch (Exception unused) {
            Logger.e(MIAI_TAG, "mCognitionManager setSceneMessage EVENT_START_GET_DEVICE_STATUS exception");
            iY3 = -1;
        }
        Logger.i(MIAI_TAG, "sendSceneMessage result = " + iY3 + ",event = 2004");
        return iY3;
    }

    @Override // com.xiaomi.fitness.devicesettings.export.sleepai.MiAicrManager
    public int startMIAIPhoneStateListen() {
        if (this.mCognitionManager == null) {
            bindMIAIPhoneStateService();
        }
        int iU3 = -1;
        try {
            s34 s34Var = this.mCognitionManager;
            Intrinsics.checkNotNull(s34Var);
            iU3 = s34Var.U3(3, new int[]{2003}, PhoneStateBroadcastReceiver.class.getName(), null);
            if (iU3 != ResultCode.RESULT_OK.getCode()) {
                s34 s34Var2 = this.mCognitionManager;
                Intrinsics.checkNotNull(s34Var2);
                iU3 = s34Var2.U3(3, new int[]{2003}, PhoneStateBroadcastReceiver.class.getName(), null);
            }
        } catch (Exception unused) {
            Logger.e(MIAI_TAG, "mCognitionManager listen exception");
        }
        Logger.i(MIAI_TAG, "startMIAIPhoneStateListen = " + iU3);
        return iU3;
    }

    @Override // com.xiaomi.fitness.devicesettings.export.sleepai.MiAicrManager
    public int stopDeviceTrace() {
        int iY3;
        if (this.mCognitionManager == null) {
            bindMIAIPhoneStateService();
        }
        try {
            s34 s34Var = this.mCognitionManager;
            Intrinsics.checkNotNull(s34Var);
            iY3 = s34Var.y3(CommonConstants.Mgc.RECHARGE_NOT_EXIST, 3, 2003, new Bundle());
        } catch (Exception unused) {
            Logger.e(MIAI_TAG, "mCognitionManager setSceneMessage EVENT_STOP_GET_DEVICE_STATUS exception");
            iY3 = -1;
        }
        Logger.i(MIAI_TAG, "sendSceneMessage result = " + iY3 + ",event = 2005");
        return iY3;
    }

    @Override // com.xiaomi.fitness.devicesettings.export.sleepai.MiAicrManager
    public int stopMIAIPhoneStateListen() {
        int iN;
        DeviceSettingsPreference.INSTANCE.setDEVICE_MICR_PHONE_STATE_CHANGE_MODE(1);
        s34 s34Var = this.mCognitionManager;
        if (s34Var == null) {
            return 0;
        }
        try {
            Intrinsics.checkNotNull(s34Var);
            iN = s34Var.N(3, new int[]{2003}, PhoneStateBroadcastReceiver.class.getName(), null);
        } catch (Exception unused) {
            Logger.e(MIAI_TAG, "mCognitionManager unListen exception");
            iN = -1;
        }
        Logger.i(MIAI_TAG, "stopMIAIPhoneStateListen = " + iN);
        return iN;
    }
}
