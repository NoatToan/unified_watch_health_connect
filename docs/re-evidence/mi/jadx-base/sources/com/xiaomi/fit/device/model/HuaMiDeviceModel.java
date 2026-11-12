package com.xiaomi.fit.device.model;

import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fit.device.huami.HuaMiDeviceTool;
import com.xiaomi.fit.device.huami.HuaMiInternalApiCaller;
import com.xiaomi.fit.device.model.HuaMiDeviceModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.bean.WatchInfo;
import com.xiaomi.fitness.device.manager.export.bean.WearableDevice;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.hm.health.bt.sdk.DeviceInfoExt;
import com.xiaomi.wearable.HuamiApiClient;
import com.xiaomi.wearable.HuamiApiExtKt;
import com.xiaomi.wearable.core.client.IMiWearCoreClient;
import com.xiaomi.wearable.wear.api.IDeviceApiCall;
import defpackage.eu6;
import defpackage.s33;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b(\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00042\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/xiaomi/fit/device/model/HuaMiDeviceModel;", "Lcom/xiaomi/fit/device/model/BaseDeviceModel;", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "device", "", "initHuaMiDevice", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;)V", "", "mac", "changeInValidMac", "(Ljava/lang/String;)V", "onUpdate", "", "isRemoved", "destroy", "(Z)V", "isCurrent", "setCurrentStatus", "Leu6;", "Lcom/xiaomi/fitness/device/manager/export/bean/WatchInfo;", "callback", "readWatchInfo", "(Leu6;)V", "", "state", "onCoreServiceState", "(I)V", "Lcom/xiaomi/fit/device/huami/HuaMiInternalApiCaller;", "huamiDevice", "Lcom/xiaomi/fit/device/huami/HuaMiInternalApiCaller;", "Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;", "huamiApiCall$delegate", "Lkotlin/Lazy;", "getHuamiApiCall", "()Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;", "huamiApiCall", "getAlias", "()Ljava/lang/String;", "alias", "deviceInfo", "<init>", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HuaMiDeviceModel extends BaseDeviceModel {

    @NotNull
    private static final String TAG = "[DeviceHuaMi]";

    /* JADX INFO: renamed from: huamiApiCall$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy huamiApiCall;

    @Nullable
    private HuaMiInternalApiCaller huamiDevice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HuaMiDeviceModel(@NotNull final WearableDeviceInfo deviceInfo) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.huamiApiCall = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: iic
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HuaMiDeviceModel.huamiApiCall_delegate$lambda$0(deviceInfo);
            }
        });
    }

    private final void changeInValidMac(String mac) {
        if (StringsKt__StringsKt.contains$default((CharSequence) mac, (CharSequence) ":", false, 2, (Object) null)) {
            return;
        }
        T t = getDeviceInfo().device;
        Intrinsics.checkNotNull(t);
        ((WearableDevice) t).setMac(HuaMiDeviceTool.INSTANCE.getInstance().changeInValidMac(mac));
    }

    private final IDeviceApiCall getHuamiApiCall() {
        return (IDeviceApiCall) this.huamiApiCall.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IDeviceApiCall huamiApiCall_delegate$lambda$0(WearableDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        return HuamiApiExtKt.getInstance(HuamiApiClient.INSTANCE).getHuamiDeviceCall(DeviceModelExtKt.convert(deviceInfo));
    }

    private final void initHuaMiDevice(WearableDeviceInfo device) {
        try {
            changeInValidMac(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(this));
        } catch (Exception e) {
            e.printStackTrace();
        }
        String mac = device.getMac();
        if (mac == null || StringsKt__StringsKt.isBlank(mac)) {
            Logger.i(TAG, "initHuaMiDevice() called with: device = " + device);
            return;
        }
        HuaMiDeviceTool.Companion companion = HuaMiDeviceTool.INSTANCE;
        HuaMiDeviceTool companion2 = companion.getInstance();
        String mac2 = device.getMac();
        Intrinsics.checkNotNull(mac2);
        HuaMiInternalApiCaller huaMiDevice = companion2.getHuaMiDevice(mac2);
        this.huamiDevice = huaMiDevice;
        Logger.i(TAG, "initHuaMiDevice, huamiDevice=" + huaMiDevice + ", " + device.getMac());
        if (this.huamiDevice == null) {
            HuaMiDeviceTool companion3 = companion.getInstance();
            String mac3 = device.getMac();
            Intrinsics.checkNotNull(mac3);
            this.huamiDevice = companion3.getOrInit(mac3, getDid());
        }
        HuaMiInternalApiCaller huaMiInternalApiCaller = this.huamiDevice;
        if (huaMiInternalApiCaller != null) {
            huaMiInternalApiCaller.updateDid(getDid());
        }
    }

    @Override // com.xiaomi.fit.device.model.BaseDeviceModel, com.xiaomi.fitness.device.manager.DeviceModel
    public void destroy(boolean isRemoved) {
        super.destroy(isRemoved);
        HuaMiDeviceTool.INSTANCE.getInstance().removeHuaMiDevice(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(this));
        HuamiApiExtKt.getInstance(HuamiApiClient.INSTANCE).removeHuamiDeviceCall(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(this));
        if (isRemoved) {
            s33.g(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(this));
        }
    }

    @Override // com.xiaomi.fit.device.model.BaseDeviceModel, com.xiaomi.fitness.device.manager.DeviceModel
    @Nullable
    public String getAlias() {
        return super.getAlias() == null ? "kongming" : super.getAlias();
    }

    @Override // com.xiaomi.wearable.core.client.ServiceStateListener
    public void onCoreServiceState(int state) {
        if (state == 1) {
            IMiWearCoreClient.INSTANCE.getInstance().addThirdDeviceInfo(DeviceModelExtKt.convert(getDeviceInfo()), getHuamiApiCall());
        }
    }

    @Override // com.xiaomi.fit.device.model.BaseDeviceModel
    public void onUpdate(@NotNull WearableDeviceInfo device) {
        Intrinsics.checkNotNullParameter(device, "device");
        super.onUpdate(device);
        if (getIsReAdded()) {
            com.xiaomi.fitness.device.manager.extensions.DeviceModelExtKt.resetOnRemoveDevice(this);
        }
        String mac = getDeviceInfo().getMac();
        if (mac != null) {
            HuaMiDeviceTool.INSTANCE.getInstance().removeHuaMiDevice(mac);
            HuamiApiExtKt.getInstance(HuamiApiClient.INSTANCE).removeHuamiDeviceCall(mac);
        }
        initHuaMiDevice(device);
        IMiWearCoreClient.INSTANCE.getInstance().addThirdDeviceInfo(DeviceModelExtKt.convert(device), getHuamiApiCall());
    }

    @Override // com.xiaomi.fit.device.model.BaseDeviceModel, com.xiaomi.fitness.device.manager.export.WearableDeviceModel
    public void readWatchInfo(@Nullable eu6<WatchInfo> callback) {
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(this));
        DeviceInfoExt deviceInfo = huaMiApiCaller != null ? huaMiApiCaller.getDeviceInfo() : null;
        if (deviceInfo == null) {
            if (callback != null) {
                callback.onResult(null);
                return;
            }
            return;
        }
        String did = getDid();
        String model = com.xiaomi.fitness.device.manager.DeviceModelExtKt.getModel(this);
        String firmwareVersion = deviceInfo.getFirmwareVersion();
        String sn = deviceInfo.getSn();
        Intrinsics.checkNotNullExpressionValue(sn, "getSn(...)");
        WatchInfo watchInfo = new WatchInfo(did, model, firmwareVersion, sn);
        if (callback != null) {
            callback.onResult(watchInfo);
        }
    }

    @Override // com.xiaomi.fit.device.model.BaseDeviceModel, com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void setCurrentStatus(boolean isCurrent) {
        super.setCurrentStatus(isCurrent);
        if (isCurrent) {
            return;
        }
        IMiWearCoreClient.INSTANCE.getInstance().disconnect(getDid());
        HuaMiInternalApiCaller huaMiInternalApiCallerRecreateHuaMiDevice = HuaMiDeviceTool.INSTANCE.getInstance().recreateHuaMiDevice(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(this), getDid(), null);
        this.huamiDevice = huaMiInternalApiCallerRecreateHuaMiDevice;
        Logger.i("[DeviceHuaMi]reCreate huaMiDevice,result:" + (huaMiInternalApiCallerRecreateHuaMiDevice != null), new Object[0]);
    }
}
