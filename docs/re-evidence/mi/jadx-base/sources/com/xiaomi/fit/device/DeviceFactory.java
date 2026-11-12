package com.xiaomi.fit.device;

import com.xiaomi.fit.device.bind.BloodSugarDeviceBinder;
import com.xiaomi.fit.device.bind.BluetoothDeviceBinder;
import com.xiaomi.fit.device.bind.HuaMiDeviceBinder;
import com.xiaomi.fit.device.bind.LocalDeviceBinder;
import com.xiaomi.fit.device.bind.WearOSDeviceBinder;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fit.device.extensions.ProductExtKt;
import com.xiaomi.fit.device.model.BloodSugarDeviceModel;
import com.xiaomi.fit.device.model.BluetoothDeviceModel;
import com.xiaomi.fit.device.model.DataLayerDeviceModel;
import com.xiaomi.fit.device.model.HuaMiDeviceModel;
import com.xiaomi.fit.device.model.LocalSportDeviceModel;
import com.xiaomi.fitness.blood_sugar.BloodSugarExtKt;
import com.xiaomi.fitness.blood_sugar.BloodSugarManager;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.model.api.DeviceBinder;
import defpackage.qa6;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/device/DeviceFactory;", "", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "deviceInfo", "Lqa6;", "createDeviceModel", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;)Lqa6;", "Lcom/xiaomi/fitness/device/model/api/DeviceBinder;", "getDeviceBinder", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;)Lcom/xiaomi/fitness/device/model/api/DeviceBinder;", "", "mac", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/model/api/DeviceBinder;", "removeDeviceBinder", "Ljava/util/HashMap;", "mDeviceBinders", "Ljava/util/HashMap;", "<init>", "()V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceFactory {

    @NotNull
    public static final DeviceFactory INSTANCE = new DeviceFactory();

    @NotNull
    private static final HashMap<String, DeviceBinder> mDeviceBinders = new HashMap<>();

    private DeviceFactory() {
    }

    @JvmStatic
    @NotNull
    public static final qa6 createDeviceModel(@NotNull WearableDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Product product = deviceInfo.getProduct();
        Intrinsics.checkNotNull(product);
        if (ProductExtKt.isWearOS(product)) {
            return new DataLayerDeviceModel(deviceInfo, DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).getDataHandler(deviceInfo.getDid()));
        }
        if (ProductExtKt.isHuaMi(product)) {
            return new HuaMiDeviceModel(deviceInfo);
        }
        if (ProductExtKt.isDual(product)) {
            return new BluetoothDeviceModel(deviceInfo, DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).getDataHandler(deviceInfo.getDid()));
        }
        if (ProductExtKt.isBloodSugar(product)) {
            return new BloodSugarDeviceModel(deviceInfo);
        }
        return (ProductExtKt.isLocalSportMachine(product) || ProductExtKt.isJumpScale(product)) ? new LocalSportDeviceModel(deviceInfo, DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).getDataHandler(deviceInfo.getDid())) : new BluetoothDeviceModel(deviceInfo, DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).getDataHandler(deviceInfo.getDid()));
    }

    @NotNull
    public final DeviceBinder getDeviceBinder(@NotNull WearableDeviceInfo deviceInfo) {
        DeviceBinder localDeviceBinder;
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        HashMap<String, DeviceBinder> map = mDeviceBinders;
        String mac = deviceInfo.getMac();
        Intrinsics.checkNotNull(mac);
        DeviceBinder deviceBinder = map.get(mac);
        if (deviceBinder != null) {
            return deviceBinder;
        }
        Product product = deviceInfo.getProduct();
        Intrinsics.checkNotNull(product);
        if (ProductExtKt.isWearOS(product)) {
            localDeviceBinder = new WearOSDeviceBinder(deviceInfo);
        } else if (ProductExtKt.isHuaMi(product)) {
            localDeviceBinder = new HuaMiDeviceBinder(deviceInfo);
        } else if (ProductExtKt.isLocalSportMachine(product) || ProductExtKt.isJumpScale(product)) {
            localDeviceBinder = new LocalDeviceBinder(deviceInfo);
        } else {
            localDeviceBinder = ProductExtKt.isBloodSugar(product) ? new BloodSugarDeviceBinder(deviceInfo, BloodSugarExtKt.getInstance(BloodSugarManager.INSTANCE)) : new BluetoothDeviceBinder(deviceInfo);
        }
        DeviceModelExtKt.logi("DeviceBinder is " + localDeviceBinder);
        String mac2 = deviceInfo.getMac();
        Intrinsics.checkNotNull(mac2);
        map.put(mac2, localDeviceBinder);
        return localDeviceBinder;
    }

    @Nullable
    public final DeviceBinder removeDeviceBinder(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        DeviceBinder deviceBinderRemove = mDeviceBinders.remove(mac);
        DeviceModelExtKt.logd("removeDeviceBinder() called with: mac = " + mac + ", result = " + deviceBinderRemove);
        return deviceBinderRemove;
    }

    @Nullable
    public final DeviceBinder getDeviceBinder(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        return mDeviceBinders.get(mac);
    }
}
