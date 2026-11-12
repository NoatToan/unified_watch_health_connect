package com.xiaomi.fit.device.extensions;

import android.os.Build;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.LocalDevice;
import com.xiaomi.fitness.device.manager.export.bean.WearableDevice;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.wearable.core.DeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0016\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\f\u001a\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0015\u0010\r\u001a\u00020\u000b*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"DEVICE_MODEL_TAG", "", "logi", "", "msg", "subTag", "logd", "loge", "throwable", "", "supportMIUIProxy", "", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableProduct;", "isAccessory", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "convert", "Lcom/xiaomi/wearable/core/DeviceInfo;", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceModelExtKt {

    @NotNull
    private static final String DEVICE_MODEL_TAG = "DeviceModel";

    /* JADX WARN: Code duplicated, block: B:29:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final DeviceInfo convert(@NotNull WearableDeviceInfo wearableDeviceInfo) {
        String mac;
        boolean z;
        String name;
        Device.Detail detail;
        String encryptKey;
        Device.Detail detail2;
        Device.Detail detail3;
        Device.Detail detail4;
        Device.Detail detail5;
        Intrinsics.checkNotNullParameter(wearableDeviceInfo, "<this>");
        DeviceInfo.PrivateUUID privateUUID = null;
        DeviceInfo deviceInfo = new DeviceInfo(null, 0 == true ? 1 : 0, (!wearableDeviceInfo.isWearOS() ? (mac = wearableDeviceInfo.getMac()) == null : (mac = wearableDeviceInfo.getNodeID()) == null) ? mac : "", null, 0, null, null, null, null, 0, null, false, null, null, null, null, false, false, false, false, 0, 2097147, null);
        Product product = wearableDeviceInfo.getProduct();
        Intrinsics.checkNotNull(product);
        deviceInfo.setType(product.getType());
        deviceInfo.setAccessType(product.getAccessType());
        deviceInfo.setDid(wearableDeviceInfo.getDid());
        deviceInfo.setModel(wearableDeviceInfo.getModel());
        deviceInfo.setProductName(product.getProductName());
        WearableDevice wearableDevice = (WearableDevice) wearableDeviceInfo.device;
        if (((wearableDevice == null || (detail5 = wearableDevice.getDetail()) == null) ? null : detail5.getPhoneId()) == null) {
            z = true;
        } else {
            WearableDevice wearableDevice2 = (WearableDevice) wearableDeviceInfo.device;
            if (Intrinsics.areEqual((wearableDevice2 == null || (detail4 = wearableDevice2.getDetail()) == null) ? null : detail4.getPhoneId(), DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getUniqueIdentify())) {
                z = true;
            } else {
                z = false;
            }
        }
        deviceInfo.setConnectActive(z);
        WearableDevice wearableDevice3 = (WearableDevice) wearableDeviceInfo.device;
        if (wearableDevice3 == null || (name = wearableDevice3.getName()) == null) {
            name = "";
        }
        deviceInfo.setDeviceName(name);
        deviceInfo.setRequestBond(ProductExtKt.isRequestBond(product));
        deviceInfo.setProductId(String.valueOf(wearableDeviceInfo.getProductId()));
        if (wearableDeviceInfo.isHuaMi()) {
            WearableDevice wearableDevice4 = (WearableDevice) wearableDeviceInfo.device;
            if (wearableDevice4 == null || (detail3 = wearableDevice4.getDetail()) == null) {
                encryptKey = null;
            } else {
                encryptKey = detail3.getAuthKey();
            }
        } else if (wearableDeviceInfo.isLocalDevice()) {
            WearableDevice wearableDevice5 = (WearableDevice) wearableDeviceInfo.device;
            if (wearableDevice5 == null || (detail2 = wearableDevice5.getDetail()) == null) {
                encryptKey = null;
            } else {
                encryptKey = detail2.getToken();
            }
        } else {
            WearableDevice wearableDevice6 = (WearableDevice) wearableDeviceInfo.device;
            if (wearableDevice6 == null || (detail = wearableDevice6.getDetail()) == null) {
                encryptKey = null;
            } else {
                encryptKey = detail.getEncryptKey();
            }
        }
        deviceInfo.setToken(encryptKey);
        T t = wearableDeviceInfo.device;
        if (t instanceof LocalDevice) {
            Intrinsics.checkNotNull(t, "null cannot be cast to non-null type com.xiaomi.fitness.device.manager.export.bean.LocalDevice");
            deviceInfo.setAppDeviceId(((LocalDevice) t).getAppDeviceId());
        }
        deviceInfo.setUserId(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
        deviceInfo.setRegion(RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry());
        deviceInfo.setCreateBondWithoutDialog(Build.VERSION.SDK_INT >= 34 ? ProductExtKt.createBondWithoutDialog(product) : false);
        Logger.i(DeviceInfoModule.NAME, "convert() called did " + wearableDeviceInfo.getDid() + ", proxyConnectionFirst " + (product instanceof WearableProduct ? supportMIUIProxy((WearableProduct) product) : false));
        deviceInfo.setProxyConnectionFirst(false);
        com.xiaomi.fitness.device.manager.bean.DeviceInfo.PrivateUUID privateUUID2 = wearableDeviceInfo.getPrivateUUID();
        if (privateUUID2 != null) {
            privateUUID = new DeviceInfo.PrivateUUID(null, null, null, null, null, null, null, null, 255, null);
            privateUUID.setFitness(privateUUID2.getFitness());
            privateUUID.setMass(privateUUID2.getMass());
            privateUUID.setOtaRX(privateUUID2.getOtaRX());
            privateUUID.setOtaTX(privateUUID2.getOtaTX());
            privateUUID.setProtoRX(privateUUID2.getProtoRX());
            privateUUID.setProtoTX(privateUUID2.getProtoTX());
            privateUUID.setService(privateUUID2.getService());
            privateUUID.setVoice(privateUUID2.getVoice());
        }
        deviceInfo.setPrivateUUID(privateUUID);
        return deviceInfo;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x0036 A[ORIG_RETURN, RETURN] */
    public static final boolean isAccessory(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        for (Object obj : DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getAccessoryDeviceModels()) {
            if (Intrinsics.areEqual(((WearableDeviceModel) obj).getDid(), wearableDeviceModel.getDid())) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    public static final void logd(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.d(DEVICE_MODEL_TAG, msg);
    }

    public static final void loge(@NotNull String msg, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Logger.e(DEVICE_MODEL_TAG, msg, throwable);
    }

    public static final void logi(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.i(DEVICE_MODEL_TAG, msg);
    }

    public static final boolean supportMIUIProxy(@NotNull WearableProduct wearableProduct) {
        Intrinsics.checkNotNullParameter(wearableProduct, "<this>");
        if (ProductExtKt.isDual(wearableProduct)) {
            return ProductExtKt.isSupportSppProxy(wearableProduct);
        }
        if (ProductExtKt.isBle(wearableProduct)) {
            return ProductExtKt.isSupportBleProxy(wearableProduct);
        }
        return false;
    }

    public static final void logd(@NotNull String subTag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(subTag, "subTag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.d(DEVICE_MODEL_TAG, subTag + " " + msg);
    }

    public static final void loge(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.e(DEVICE_MODEL_TAG, msg);
    }

    public static final void logi(@NotNull String subTag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(subTag, "subTag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.i(DEVICE_MODEL_TAG, subTag + " " + msg);
    }

    public static final void loge(@NotNull String subTag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(subTag, "subTag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.e(DEVICE_MODEL_TAG, subTag + " " + msg);
    }
}
