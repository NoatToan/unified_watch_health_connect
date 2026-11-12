package com.xiaomi.fitness.feedback.bugreport;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.feedback.util.FeedbackFileUtils;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import defpackage.dah;
import defpackage.im9;
import defpackage.lm9;
import defpackage.oxo;
import defpackage.s7r;
import defpackage.txo;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010!R\"\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010!¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/GetDeviceLog;", "", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "", "uploadUrl", "", "sendUploadUrlToWatch", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/lang/String;)V", "Ldah;", "onSyncDeviceCallBack", "", "syncDeviceLog", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ldah;)Z", "device", "Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;", "callback", "syncLogFromBleDevice", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;)V", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "", "DEVICE_LOG_FILE_SIZE", "I", "getDEVICE_LOG_FILE_SIZE", "()I", "setDEVICE_LOG_FILE_SIZE", "(I)V", "HM_DEVICE_LOG_FILE", "getHM_DEVICE_LOG_FILE", "setHM_DEVICE_LOG_FILE", "(Ljava/lang/String;)V", "HM_DEVICE_BACKUP_LOG_FILE", "getHM_DEVICE_BACKUP_LOG_FILE", "setHM_DEVICE_BACKUP_LOG_FILE", "BLE_DEVICE_BACKUP_LOG_FILE", "getBLE_DEVICE_BACKUP_LOG_FILE", "setBLE_DEVICE_BACKUP_LOG_FILE", "<init>", "()V", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GetDeviceLog {

    @NotNull
    public static final GetDeviceLog INSTANCE = new GetDeviceLog();

    @NotNull
    private static final String TAG = "GetDeviceLog";
    private static int DEVICE_LOG_FILE_SIZE = 5242880;

    @NotNull
    private static String HM_DEVICE_LOG_FILE = "hmDeviceLog.log";

    @NotNull
    private static String HM_DEVICE_BACKUP_LOG_FILE = "hmDeviceLogBP.log";

    @NotNull
    private static String BLE_DEVICE_BACKUP_LOG_FILE = "devicelogbak";

    private GetDeviceLog() {
    }

    public static /* synthetic */ void syncLogFromBleDevice$default(GetDeviceLog getDeviceLog, WearableDeviceModel wearableDeviceModel, OnSyncCallback onSyncCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            onSyncCallback = null;
        }
        getDeviceLog.syncLogFromBleDevice(wearableDeviceModel, onSyncCallback);
    }

    @NotNull
    public final String getBLE_DEVICE_BACKUP_LOG_FILE() {
        return BLE_DEVICE_BACKUP_LOG_FILE;
    }

    public final int getDEVICE_LOG_FILE_SIZE() {
        return DEVICE_LOG_FILE_SIZE;
    }

    @NotNull
    public final String getHM_DEVICE_BACKUP_LOG_FILE() {
        return HM_DEVICE_BACKUP_LOG_FILE;
    }

    @NotNull
    public final String getHM_DEVICE_LOG_FILE() {
        return HM_DEVICE_LOG_FILE;
    }

    @NotNull
    public final String getTAG() {
        return TAG;
    }

    public final void sendUploadUrlToWatch(@NotNull WearableDeviceModel deviceModel, @Nullable String uploadUrl) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 80;
        txo txoVar = new txo();
        oxo oxoVar = new oxo();
        oxoVar.d = uploadUrl;
        oxoVar.c = 1;
        txoVar.i0(oxoVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), deviceModel.getDeviceInfo().getDid(), s7rVar, false, (OnSyncCallback) null, 0, 28, (Object) null);
    }

    public final void setBLE_DEVICE_BACKUP_LOG_FILE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        BLE_DEVICE_BACKUP_LOG_FILE = str;
    }

    public final void setDEVICE_LOG_FILE_SIZE(int i) {
        DEVICE_LOG_FILE_SIZE = i;
    }

    public final void setHM_DEVICE_BACKUP_LOG_FILE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        HM_DEVICE_BACKUP_LOG_FILE = str;
    }

    public final void setHM_DEVICE_LOG_FILE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        HM_DEVICE_LOG_FILE = str;
    }

    public final boolean syncDeviceLog(@NotNull WearableDeviceModel deviceModel, @Nullable final dah onSyncDeviceCallBack) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        if (!DeviceModelExtKt.isHuaMi(deviceModel) || !deviceModel.getIsDeviceConnected()) {
            return false;
        }
        if (onSyncDeviceCallBack == null) {
            return true;
        }
        Logger.d(TAG, "sync log from huami device");
        FeedbackFileUtils feedbackFileUtils = FeedbackFileUtils.INSTANCE;
        File file = new File(feedbackFileUtils.getLogDirPath(), HM_DEVICE_LOG_FILE);
        if (file.exists() && file.length() > DEVICE_LOG_FILE_SIZE) {
            File file2 = new File(feedbackFileUtils.getLogDirPath(), HM_DEVICE_BACKUP_LOG_FILE);
            if (file2.exists()) {
                file2.delete();
            }
            file.renameTo(file2);
        }
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
        if (huaMiApiCaller != null) {
            huaMiApiCaller.getDeviceLog(file, new IHMDataCallback<File>() { // from class: com.xiaomi.fitness.feedback.bugreport.GetDeviceLog.syncDeviceLog.1
                @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
                public void onProgress(Progress progress) {
                    Intrinsics.checkNotNullParameter(progress, "progress");
                    Logger.i(GetDeviceLog.INSTANCE.getTAG(), "onProgress  progress:" + progress);
                    onSyncDeviceCallBack.onProgress(progress.progress / progress.total);
                }

                @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
                public void onStart() {
                    Logger.i(GetDeviceLog.INSTANCE.getTAG(), "after syncAction and sync log from device start");
                    onSyncDeviceCallBack.onStart();
                }

                @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
                public void onStop(File file3, HMDeviceError hmDeviceError) {
                    Logger.i(GetDeviceLog.INSTANCE.getTAG(), "after syncAction and sync log from device stop");
                    onSyncDeviceCallBack.onStop();
                }
            });
        }
        return true;
    }

    public final void syncLogFromBleDevice(@NotNull WearableDeviceModel device, @Nullable OnSyncCallback callback) {
        Intrinsics.checkNotNullParameter(device, "device");
        if (!device.getIsDeviceConnected()) {
            ToastUtil.showToast("请连接设备");
            return;
        }
        FeedbackFileUtils feedbackFileUtils = FeedbackFileUtils.INSTANCE;
        File file = new File(feedbackFileUtils.getDebiceLogDirPath());
        long jE = lm9.e(new File(feedbackFileUtils.getDebiceLogDirPath()));
        String str = TAG;
        Logger.i(str, "bleDeviceLogFile is " + file + " bleDeviceLogFile.length() is " + file.length() + " size is " + jE);
        if (file.exists() && jE > DEVICE_LOG_FILE_SIZE) {
            File file2 = new File(feedbackFileUtils.getLogDirPath(), BLE_DEVICE_BACKUP_LOG_FILE);
            Logger.d(str, "bleDeviceLogFile backupFile.exists() is " + file2.exists() + " backupFile.isDirectory is " + file2.isDirectory() + " backupFile is " + file2);
            if (file2.exists() && file2.isDirectory()) {
                Logger.d(str, "bleDeviceLogFile is delete");
                Logger.i(str, "bleDeviceLogFile deleteflag is " + im9.z(file2));
            }
            Logger.d(str, "bleDeviceLogFile renameTo");
            file.renameTo(file2);
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 80;
        txo txoVar = new txo();
        oxo oxoVar = new oxo();
        oxoVar.c = 1;
        txoVar.i0(oxoVar);
        s7rVar.c0(txoVar);
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        WearableDeviceInfo deviceInfo = device.getDeviceInfo();
        DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, deviceInfo != null ? deviceInfo.getDid() : null, s7rVar, false, callback, 0, 16, (Object) null);
    }
}
