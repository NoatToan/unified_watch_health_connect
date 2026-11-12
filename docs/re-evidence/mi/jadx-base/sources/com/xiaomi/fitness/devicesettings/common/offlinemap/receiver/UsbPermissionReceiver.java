package com.xiaomi.fitness.devicesettings.common.offlinemap.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapManagerActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/offlinemap/receiver/UsbPermissionReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUsbPermissionReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UsbPermissionReceiver.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/receiver/UsbPermissionReceiver\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,54:1\n216#2,2:55\n*S KotlinDebug\n*F\n+ 1 UsbPermissionReceiver.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/receiver/UsbPermissionReceiver\n*L\n34#1:55,2\n*E\n"})
public final class UsbPermissionReceiver extends BroadcastReceiver {

    @NotNull
    public static final String ACTION_USB_PERMISSION = "com.mi.health.USB_PERMISSION";

    @NotNull
    public static final String TAG = "UsbPermissionReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @Nullable Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        Logger.i(TAG, "permission onReceive action:" + action);
        if (Intrinsics.areEqual(ACTION_USB_PERMISSION, action)) {
            Logger.i(TAG, "usb权限广播接收");
            synchronized (this) {
                try {
                    Object systemService = context.getSystemService("usb");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.usb.UsbManager");
                    UsbManager usbManager = (UsbManager) systemService;
                    HashMap<String, UsbDevice> deviceList = usbManager.getDeviceList();
                    Intrinsics.checkNotNull(deviceList);
                    Iterator<Map.Entry<String, UsbDevice>> it = deviceList.entrySet().iterator();
                    UsbDevice value = null;
                    while (it.hasNext()) {
                        value = it.next().getValue();
                    }
                    UsbDevice usbDevice = value;
                    if (usbDevice == null) {
                        Logger.d(TAG, "permission denied for device == null");
                    } else if (usbManager.hasPermission(usbDevice)) {
                        context.startActivity(new Intent(context, (Class<?>) OfflineMapManagerActivity.class));
                    } else {
                        Logger.d(TAG, "permission denied for device " + usbDevice.getDeviceName());
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
