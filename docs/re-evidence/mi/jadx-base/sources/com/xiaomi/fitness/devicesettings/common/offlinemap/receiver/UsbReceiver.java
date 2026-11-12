package com.xiaomi.fitness.devicesettings.common.offlinemap.receiver;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapDownloadManager;
import com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapManagerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/offlinemap/receiver/UsbReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UsbReceiver extends BroadcastReceiver {

    @NotNull
    private static final String ACTION_USB_PERMISSION = "com.mi.health.USB_PERMISSION";

    @NotNull
    public static final String TAG = "UsbReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            if (Intrinsics.areEqual(action, "android.hardware.usb.action.USB_DEVICE_ATTACHED")) {
                UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
                FitnessLogUtils.i(TAG, "usb connect devices name:" + (usbDevice != null ? usbDevice.getDeviceName() : null));
                return;
            }
            if (Intrinsics.areEqual(action, "android.hardware.usb.action.USB_DEVICE_DETACHED")) {
                UsbDevice usbDevice2 = (UsbDevice) intent.getParcelableExtra("device");
                FitnessLogUtils.i(TAG, "usb disconnect devices name:" + (usbDevice2 != null ? usbDevice2.getDeviceName() : null));
                Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
                if (currentActivity instanceof OfflineMapManagerActivity) {
                    ((OfflineMapManagerActivity) currentActivity).finish();
                    OfflineMapDownloadManager.INSTANCE.release();
                    ToastUtil.showToast("设备连接已断开");
                }
            }
        }
    }
}
