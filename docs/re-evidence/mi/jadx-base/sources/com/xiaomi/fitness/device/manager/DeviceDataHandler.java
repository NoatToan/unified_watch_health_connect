package com.xiaomi.fitness.device.manager;

import android.content.Intent;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.manager.DeviceDataHandler;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.s7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/device/manager/DeviceDataHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "model", "", "reportBindNew", "(Ljava/lang/String;)V", "sendBindNewBroadcast", "()V", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "NOTIFY_NEW_BIND_ACTION", "Ljava/lang/String;", "<init>", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceDataHandler extends DataHandlerWrapper {

    @NotNull
    public static final DeviceDataHandler INSTANCE = new DeviceDataHandler();

    @NotNull
    private static final String NOTIFY_NEW_BIND_ACTION = "com.mi.health.notify_new_bind";

    private DeviceDataHandler() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handlePacket$lambda$0(WearableDeviceModel wearableDeviceModel) {
        com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).disconnectDevice(wearableDeviceModel.getDid());
        INSTANCE.sendBindNewBroadcast();
    }

    private final void reportBindNew(String model) {
        try {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click", "56.125.0.1.43579"), "device_model", model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void sendBindNewBroadcast() {
        Intent intent = new Intent(NOTIFY_NEW_BIND_ACTION);
        intent.setPackage(ApplicationExtKt.getApplication().getPackageName());
        ApplicationExtKt.getApplication().sendBroadcast(intent);
    }

    @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
    public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (packet == null) {
            return false;
        }
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (!Intrinsics.areEqual(did, wearableDeviceModel != null ? wearableDeviceModel.getDid() : null) || packet.e != 2 || packet.f != 12) {
            return false;
        }
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("handlePacket in bind new mode");
        DevicePreference.INSTANCE.setIN_BIND_NEW_MODE(true);
        reportBindNew(DeviceModelExtKt.getModel(wearableDeviceModel));
        ExecutorHelper.postInMain(new Runnable() { // from class: z26
            @Override // java.lang.Runnable
            public final void run() {
                DeviceDataHandler.handlePacket$lambda$0(wearableDeviceModel);
            }
        }, 200L);
        return true;
    }
}
