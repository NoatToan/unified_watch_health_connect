package com.xiaomi.fitness.devicesettings.huami.callback;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.alarm.HuamiAlarmConsoleHelper;
import com.xiaomi.fitness.devicesettings.export.FindPhoneHelper;
import com.xiaomi.fitness.devicesettings.export.FindPhoneHelperExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/callback/DeviceProgressCallBack;", "Lcom/xiaomi/fitness/device/manager/export/LFEventCallbackWrapper;", "<init>", "()V", "phoneMuteState", "", "onFindPhone", "isStart", "", "onAlarmDelay", "onAlarmCancel", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceProgressCallBack extends LFEventCallbackWrapper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String sTag = "DeviceProgressCallBack";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/callback/DeviceProgressCallBack$Companion;", "", "<init>", "()V", "sTag", "", "getSTag", "()Ljava/lang/String;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getSTag() {
            return DeviceProgressCallBack.sTag;
        }
    }

    @Override // com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper, com.xiaomi.wearable.hm.s
    public void onAlarmCancel() {
        Logger.i(sTag, "onAlarmCancel");
        HuamiAlarmConsoleHelper.INSTANCE.onHMAlarmCancel();
    }

    @Override // com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper, com.xiaomi.wearable.hm.s
    public void onAlarmDelay() {
        Logger.i(sTag, "onAlarmDelay");
        HuamiAlarmConsoleHelper.INSTANCE.onMHAlarmDelay();
    }

    @Override // com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper, com.xiaomi.wearable.hm.s
    public void onFindPhone(boolean isStart) {
        String str = sTag;
        Logger.i(str, "onFindPhone on device: " + isStart);
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            Logger.i(str, "onFindPhone cur device model == null");
            return;
        }
        if (isStart) {
            FindPhoneHelperExtKt.getInstance(FindPhoneHelper.INSTANCE).start(wearableDeviceModel.getDid());
        } else {
            FindPhoneHelperExtKt.getInstance(FindPhoneHelper.INSTANCE).stop(wearableDeviceModel.getDid());
        }
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
        Logger.i(str, "onFindPhone: ret = " + (huaMiApiCaller != null ? Boolean.valueOf(huaMiApiCaller.updateFindPhoneStatus(isStart)) : null));
    }

    @Override // com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper, com.xiaomi.wearable.hm.s
    public void phoneMuteState() {
    }
}
