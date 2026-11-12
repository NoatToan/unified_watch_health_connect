package com.xiaomi.fit.device.bind;

import com.xiaomi.fit.device.DeviceFactory;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.LocalDevice;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import defpackage.qa6;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u000e\u0010\u0012\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/device/bind/LocalDeviceBinder;", "Lcom/xiaomi/fit/device/bind/BluetoothDeviceBinder;", "deviceInfo", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;)V", "onLocalBindSuccess", "", "model", "", "did", "mac", "sn", "appDeviceId", "appToken", "", "createLocalDeviceName", "name", "unbind", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "revokeAuthorization", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLocalDeviceBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalDeviceBinder.kt\ncom/xiaomi/fit/device/bind/LocalDeviceBinder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n1863#2,2:90\n*S KotlinDebug\n*F\n+ 1 LocalDeviceBinder.kt\ncom/xiaomi/fit/device/bind/LocalDeviceBinder\n*L\n66#1:90,2\n*E\n"})
public final class LocalDeviceBinder extends BluetoothDeviceBinder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalDeviceBinder(@NotNull WearableDeviceInfo deviceInfo) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
    }

    private final String createLocalDeviceName(String mac, String model, String name) {
        int i = 0;
        for (WearableDeviceModel wearableDeviceModel : DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getLocalDeviceModels()) {
            String mac2 = DeviceModelExtKt.getMac(wearableDeviceModel);
            Locale locale = Locale.ROOT;
            String upperCase = mac2.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            String upperCase2 = mac.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            if (!Intrinsics.areEqual(upperCase, upperCase2) && Intrinsics.areEqual(DeviceModelExtKt.getModel(wearableDeviceModel), model)) {
                i++;
            }
        }
        Logger.i(getTAG(), "createLocalDeviceName() called with: model = " + model + ", name = " + name + ", size = " + i);
        if (i == 0) {
            return name;
        }
        return name + " (" + (i + 1) + ")";
    }

    @Override // com.xiaomi.fit.device.bind.BluetoothDeviceBinder, com.xiaomi.fit.device.bind.BaseDeviceBinder, defpackage.zd4
    public /* bridge */ /* synthetic */ void onDisconnect() {
        super.onDisconnect();
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, defpackage.vie
    public void onLocalBindSuccess(@NotNull String model, @NotNull String did, @NotNull String mac, @Nullable String sn, @NotNull String appDeviceId, @NotNull byte[] appToken) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(appDeviceId, "appDeviceId");
        Intrinsics.checkNotNullParameter(appToken, "appToken");
        super.onLocalBindSuccess(model, did, mac, sn, appDeviceId, appToken);
        Logger.i(getTAG(), "onLocalBindSuccess() called with: model = " + model + ", did = " + did + ", mac = " + mac + ", sn = " + sn + ", appDeviceId = " + appDeviceId + ", appToken = " + ByteUtil.byteToString(appToken));
        LocalDevice localDevice = new LocalDevice(appDeviceId, null, null, null, null, 0, null, null, null, null, 1022, null);
        localDevice.setDid(did);
        localDevice.setModel(model);
        localDevice.setProductId(getMDeviceInfo().getProductId());
        localDevice.setName(createLocalDeviceName(mac, model, getMDeviceInfo().getName()));
        localDevice.setStatus(1);
        localDevice.setSn(sn);
        localDevice.setMac(mac);
        localDevice.setAppToken(ByteUtil.byteToString(appToken));
        Device.Detail detail = new Device.Detail(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        detail.setToken(ByteUtil.byteToString(appToken));
        detail.setSn(sn);
        detail.setMac(mac);
        localDevice.setDetail(detail);
        getMDeviceInfo().device = localDevice;
        getMDeviceManager().addDeviceLocal(getMDeviceInfo());
        Locale locale = Locale.ROOT;
        String upperCase = mac.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        qa6 deviceModelByMac = getDeviceModelByMac(upperCase);
        DeviceFactory deviceFactory = DeviceFactory.INSTANCE;
        String upperCase2 = mac.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        deviceFactory.removeDeviceBinder(upperCase2);
        if (deviceModelByMac != null) {
            deviceModelByMac.onBindSuccess(false);
        }
    }

    @Override // com.xiaomi.fit.device.bind.BluetoothDeviceBinder, com.xiaomi.fit.device.bind.BaseDeviceBinder, defpackage.o43
    public /* bridge */ /* synthetic */ void onRemoveFailure(int i) {
        super.onRemoveFailure(i);
    }

    @Override // com.xiaomi.fit.device.bind.BluetoothDeviceBinder, com.xiaomi.fit.device.bind.BaseDeviceBinder, defpackage.o43
    public /* bridge */ /* synthetic */ void onRemoveSuccess() {
        super.onRemoveSuccess();
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, com.xiaomi.fitness.device.model.api.DeviceBinder
    @Nullable
    public Object revokeAuthorization(@NotNull Continuation<? super Integer> continuation) {
        getMDeviceManager().removeLocalDevice(getMDeviceInfo().getDid());
        return Boxing.boxInt(-2);
    }

    @Override // com.xiaomi.fit.device.bind.BaseDeviceBinder, com.xiaomi.fitness.device.model.api.DeviceBinder
    @Nullable
    public Object unbind(@NotNull Continuation<? super Integer> continuation) {
        getMDeviceManager().removeLocalDevice(getMDeviceInfo().getDid());
        return Boxing.boxInt(-2);
    }
}
