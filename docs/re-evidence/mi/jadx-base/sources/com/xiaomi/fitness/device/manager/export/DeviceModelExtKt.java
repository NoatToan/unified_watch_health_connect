package com.xiaomi.fitness.device.manager.export;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.homeroom.model.Home;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b\u001a\u0010\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u001bH\u0007\u001a\u000e\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0003\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\"\u0015\u0010\n\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\t\"\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\"\u0015\u0010\r\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\t\"\u0015\u0010\u000e\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\t\"\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t\"\u0015\u0010\u0010\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\t\"\u0015\u0010\u0011\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\t\"\u0015\u0010\u0012\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\t\"\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\t\"\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\t\"\u0015\u0010\u0015\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\t\"\u0015\u0010\u0016\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\t\"\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0003\"\u0015\u0010\u0018\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0003\"\u0015\u0010\u001c\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\t\"\u0015\u0010\u001d\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\t\"\u0015\u0010\u001e\u001a\u00020\u001f*\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0015\u0010\"\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\t\"\u0015\u0010#\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\t\"\u0015\u0010$\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\t¨\u0006)"}, d2 = {"isEcg", "", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "isTreadmill", "isEarPhone", "isDual", "isPanGu", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "(Lcom/xiaomi/fitness/device/manager/bean/Product;)Z", "isKongMing", "isHuami", "isSupportAgreementLocalDevice", "isMuLan", "isZiLong", "isBloodSugar", "isL66", "isL67", "isLibai", "isWearOS", "isM66", "isM61", "isLocalDevice", "isPhone", "isWatch", "isVersionSupport", b.n, "", "isM62A", "isM62S", "deviceScreenShapeType", "", "getDeviceScreenShapeType", "(Lcom/xiaomi/fitness/device/manager/bean/Product;)I", "isRectangularScreen", "isRoundScreen", "isRunwayScreen", "isBondedDevice", Home.JSON_KEY_ADDRESS, "needBackgroundConnect", "deviceModel", "device-manager-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceModelExtKt {
    public static final int getDeviceScreenShapeType(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        Product.Size size = product.getSize();
        Integer numValueOf = size != null ? Integer.valueOf(size.getWidth()) : null;
        Product.Size size2 = product.getSize();
        Integer numValueOf2 = size2 != null ? Integer.valueOf(size2.getHeight()) : null;
        Product.Size size3 = product.getSize();
        Integer numValueOf3 = size3 != null ? Integer.valueOf(size3.getRadius()) : null;
        StringBuilder sb = new StringBuilder();
        sb.append("deviceScreenShapeType width:");
        sb.append(numValueOf);
        sb.append(" height:");
        sb.append(numValueOf2);
        sb.append(" radius:");
        sb.append(numValueOf3);
        if (numValueOf == null || numValueOf.intValue() == 0 || numValueOf2 == null || numValueOf2.intValue() == 0 || numValueOf3 == null || numValueOf3.intValue() == 0) {
            return 0;
        }
        if (numValueOf.intValue() != numValueOf3.intValue() * 2) {
            return 2;
        }
        return !Intrinsics.areEqual(numValueOf, numValueOf2) ? 3 : 1;
    }

    public static final boolean isBloodSugar(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 12;
    }

    @SuppressLint({"MissingPermission"})
    public static final boolean isBondedDevice(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.getRemoteDevice(address).getBondState() == 12;
    }

    public static final boolean isDual(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return wearableDeviceModel.getProduct().getType() == 6 || wearableDeviceModel.getProduct().getType() == 7;
    }

    public static final boolean isEarPhone(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return wearableDeviceModel.getProduct().getType() == 14;
    }

    public static final boolean isEcg(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return wearableDeviceModel.getProduct().getType() == 4;
    }

    public static final boolean isHuami(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 5;
    }

    public static final boolean isKongMing(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        if (StringsKt__StringsJVMKt.equals(Product.KONG_MING_NAME, product.getBltNamePrefix(), true)) {
            return true;
        }
        String bltNamePrefix = product.getBltNamePrefix();
        return bltNamePrefix != null && StringsKt__StringsJVMKt.startsWith$default(bltNamePrefix, Product.KONG_MING_NAME_2, false, 2, null);
    }

    public static final boolean isL66(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        String bltNamePrefix = product.getBltNamePrefix();
        return (bltNamePrefix == null || !StringsKt__StringsJVMKt.startsWith$default(bltNamePrefix, Product.HUAMI_BAND_7, false, 2, null) || Intrinsics.areEqual(product.getBltNamePrefix(), Product.HUAMI_BAND_7_PRO)) ? false : true;
    }

    public static final boolean isL67(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getProductId() == 6885;
    }

    public static final boolean isLibai(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return Intrinsics.areEqual(product.getModel(), "xiaomi.watch.mars");
    }

    public static final boolean isLocalDevice(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getAccessType() == 1;
    }

    public static final boolean isM61(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return StringsKt__StringsJVMKt.startsWith$default(product.getModel(), Product.M61, false, 2, null);
    }

    public static final boolean isM62A(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return Intrinsics.areEqual(product.getModel(), Product.M62A_MODEL);
    }

    public static final boolean isM62S(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return Intrinsics.areEqual(product.getModel(), Product.M62S_MODEL);
    }

    public static final boolean isM66(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return StringsKt__StringsJVMKt.startsWith$default(product.getModel(), Product.M66, false, 2, null);
    }

    public static final boolean isMuLan(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return Intrinsics.areEqual(product.getModel(), Product.MULAN_MODEL);
    }

    public static final boolean isPanGu(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return StringsKt__StringsJVMKt.equals(Product.PAN_GU_NAME, product.getBltNamePrefix(), true) || StringsKt__StringsJVMKt.equals(Product.PAN_GU_NAME_2, product.getBltNamePrefix(), true);
    }

    public static final boolean isPhone(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return wearableDeviceModel.getDeviceInfo().isPhone();
    }

    public static final boolean isRectangularScreen(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return getDeviceScreenShapeType(product) == 2;
    }

    public static final boolean isRoundScreen(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return getDeviceScreenShapeType(product) == 1;
    }

    public static final boolean isRunwayScreen(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return getDeviceScreenShapeType(product) == 3;
    }

    public static final boolean isSupportAgreementLocalDevice(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return Intrinsics.areEqual(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getModel(wearableDeviceModel), "ksmb.treadmill.m2");
    }

    public static final boolean isTreadmill(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return wearableDeviceModel.getProduct().getType() == 8;
    }

    public static final boolean isVersionSupport(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull String feature) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(feature, "feature");
        return DeviceManagerExtKt.getInstance(DeviceTool.INSTANCE).isVersionSupport(wearableDeviceModel, feature);
    }

    public static final boolean isWatch(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return wearableDeviceModel.getDeviceInfo().isWatch();
    }

    public static final boolean isWearOS(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 1;
    }

    public static final boolean isZiLong(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return Intrinsics.areEqual(product.getModel(), Product.ZILONG_MODEL);
    }

    public static final boolean needBackgroundConnect(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        if (deviceModel.getIsDeviceConnected() || !deviceModel.getIsConnectActive()) {
            return false;
        }
        try {
            return !isDual(deviceModel) || isBondedDevice(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(deviceModel));
        } catch (Exception unused) {
            return false;
        }
    }
}
