package com.xiaomi.fitness.milink.export;

import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.milink.circulate.PhoneDeviceController;
import com.xiaomi.fitness.milink.util.MilinkHelper;
import defpackage.gdd;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/milink/export/MilinkManagerImpl;", "Lcom/xiaomi/fitness/milink/export/MilinkManager;", "<init>", "()V", "TAG", "", "isPhoneSupportMilink", "", "isDeviceSupportMilink", "requestMediaInfo", "", "onAivsControl", "", "state", "onAivsSetVolume", "volume", "getMilinkPlayState", "milink_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MilinkManagerImpl implements MilinkManager {

    @NotNull
    private final String TAG = "MilinkManagerImpl";

    private final int getMilinkPlayState() {
        PhoneDeviceController localDeviceController = MilinkHelper.INSTANCE.getLocalDeviceController();
        if (localDeviceController != null) {
            return localDeviceController.getPlayState();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.milink.export.MilinkManager
    public boolean isDeviceSupportMilink() {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return false;
        }
        int deviceCapability = DeviceManagerExtKt.getInstance(companion).getDeviceCapability(wearableDeviceModel.getDid());
        return DeviceModelExtKt.isBluetooth(wearableDeviceModel) && deviceCapability != -1 && (deviceCapability & 2) == 2;
    }

    @Override // com.xiaomi.fitness.milink.export.MilinkManager
    public boolean isPhoneSupportMilink() {
        return MilinkHelper.INSTANCE.isSupportMilink();
    }

    @Override // com.xiaomi.fitness.milink.export.MilinkManager
    public int onAivsControl(int state) {
        gdd gddVar = new gdd();
        gddVar.c = "local_device_id";
        gddVar.e = 0;
        gddVar.f = "";
        if (state == 0) {
            int milinkPlayState = getMilinkPlayState();
            if (milinkPlayState == 2) {
                return 4;
            }
            if (milinkPlayState == 3) {
                gddVar.d = 0;
                MilinkHelper.INSTANCE.handleAudioControl(gddVar);
                return 0;
            }
        } else if (state == 1 || state == 2) {
            int milinkPlayState2 = getMilinkPlayState();
            if (milinkPlayState2 == 2) {
                gddVar.d = 1;
                MilinkHelper.INSTANCE.handleAudioControl(gddVar);
                return 0;
            }
            if (milinkPlayState2 == 3) {
                return 5;
            }
        } else if (state == 3) {
            int milinkPlayState3 = getMilinkPlayState();
            if (milinkPlayState3 == 2 || milinkPlayState3 == 3) {
                gddVar.d = 4;
                MilinkHelper.INSTANCE.handleAudioControl(gddVar);
                return 0;
            }
        } else {
            if (state != 4) {
                return 0;
            }
            int milinkPlayState4 = getMilinkPlayState();
            if (milinkPlayState4 == 2 || milinkPlayState4 == 3) {
                gddVar.d = 5;
                MilinkHelper.INSTANCE.handleAudioControl(gddVar);
                return 0;
            }
        }
        return 3;
    }

    @Override // com.xiaomi.fitness.milink.export.MilinkManager
    public int onAivsSetVolume(int volume) {
        gdd gddVar = new gdd();
        gddVar.c = "local_device_id";
        gddVar.d = 3;
        gddVar.e = volume;
        gddVar.f = "";
        MilinkHelper.INSTANCE.handleAudioControl(gddVar);
        return 0;
    }

    @Override // com.xiaomi.fitness.milink.export.MilinkManager
    public void requestMediaInfo() {
    }
}
