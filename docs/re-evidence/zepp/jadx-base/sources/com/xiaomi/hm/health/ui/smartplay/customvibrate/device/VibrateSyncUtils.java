package com.xiaomi.hm.health.ui.smartplay.customvibrate.device;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMVibrateInfo;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.device.VibrateSyncUtils;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.model.VibrateEntity;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.model.VibrateRepo;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.model.VibrateType;
import java.util.concurrent.Callable;
import rx.Observable;

/* JADX INFO: loaded from: classes22.dex */
public class VibrateSyncUtils {
    private static final String a = "VibrateSyncUtils";
    private static final long b = 1000;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean c(VibrateEntity vibrateEntity) throws Exception {
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (hMMiLiProDevice == null || !hMMiLiProDevice.isConnected()) {
            return Boolean.FALSE;
        }
        VibrateRepo vibrateRepo = VibrateRepo.getInstance();
        for (VibrateType vibrateType : VibrateType.values()) {
            if (vibrateEntity.id == vibrateRepo.getSelectedId(vibrateType)) {
                boolean vibrateSync = hMMiLiProDevice.setVibrateSync(HMVibrateInfo.getDefaultVibrate(vibrateType.ordinal()));
                HMLog.i(a, "delete, name: " + vibrateEntity.name + ", id: " + ((int) vibrateEntity.id) + ", type: " + vibrateType + ", ret: " + vibrateSync, new Object[0]);
                if (!vibrateSync) {
                    return Boolean.FALSE;
                }
            }
        }
        Thread.sleep(1000L);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean d(short[] sArr) throws Exception {
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (hMMiLiProDevice != null && hMMiLiProDevice.isConnected()) {
            return Boolean.valueOf(hMMiLiProDevice.setVibrateSync(HMVibrateInfo.getTestVibrate(sArr)));
        }
        Thread.sleep(1000L);
        return Boolean.FALSE;
    }

    public static Observable<Boolean> deleteVibrateToDevice(final VibrateEntity entity) {
        return Observable.fromCallable(new Callable() { // from class: s98
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return VibrateSyncUtils.c(entity);
            }
        });
    }

    public static void setCustomVibrateToDevice(VibrateType type, VibrateEntity entity, HMCallback callback) {
        try {
            HMVibrateInfo hMVibrateInfo = new HMVibrateInfo(entity.id, entity.times);
            hMVibrateInfo.test = false;
            hMVibrateInfo.useCustomVibrate = true;
            hMVibrateInfo.type = (short) type.ordinal();
            HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
            if (hMMiLiProDevice == null || !hMMiLiProDevice.isConnected()) {
                callback.onFinish(false);
            } else {
                hMMiLiProDevice.setVibrateWithTest(hMVibrateInfo, callback);
            }
        } catch (Exception e) {
            HMLog.i(a, "setCustomVibrateToDevice, exception: " + e, new Object[0]);
        }
    }

    public static void setDefaultVibrateToDevice(VibrateType type, HMCallback callback) {
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (hMMiLiProDevice == null || !hMMiLiProDevice.isConnected()) {
            callback.onFinish(false);
        } else {
            hMMiLiProDevice.setVibrateWithTest(HMVibrateInfo.getDefaultVibrate(type.ordinal()), callback);
        }
    }

    public static void setFadeInVibrateToDevice(VibrateType type, HMCallback callback) {
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (hMMiLiProDevice == null || !hMMiLiProDevice.isConnected()) {
            callback.onFinish(false);
        } else {
            hMMiLiProDevice.setVibrateWithTest(HMVibrateInfo.getFadeInVibrate(type.ordinal()), callback);
        }
    }

    public static Observable<Boolean> vibrateOnDevice(final short[] times) {
        return Observable.fromCallable(new Callable() { // from class: t98
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return VibrateSyncUtils.d(times);
            }
        });
    }
}
