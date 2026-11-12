package com.xiaomi.fitness.device.manager.extensions;

import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.remote.ProductManagerRemoteImpl;
import com.xiaomi.fitness.device.model.api.ProductManagerRemoteInternal;
import com.xiaomi.onetrack.api.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u0016\u0010\b\u001a\u0004\u0018\u00010\u0002*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u0018\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\n*\u00020\u0005H\u0000\u001a\u000e\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\u0002H\u0000\u001a\f\u0010\r\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\u0012\u0010\u001f\u001a\u00020\u0004*\u00020\u00022\u0006\u0010 \u001a\u00020\u0007\"\u0018\u0010\u000e\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0010\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000f\"\u0018\u0010\u0011\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f\"\u0018\u0010\u0012\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000f\"\u0018\u0010\u0013\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f\"\u0018\u0010\u0014\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000f\"\u0018\u0010\u0015\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000f\"\u0018\u0010\u0016\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000f\"\u0018\u0010\u0017\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000f\"\u0018\u0010\u0018\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000f\"\u0018\u0010\u0019\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000f\"\u0018\u0010\u001a\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000f\"\u0018\u0010\u001b\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000f\"\u0018\u0010\u001c\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000f\"\u0018\u0010\u001d\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000f\"\u0018\u0010\u001e\u001a\u00020\u0004*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000f¨\u0006!"}, d2 = {"toDeviceInfo", "Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "contains", "", "Lcom/xiaomi/fitness/device/model/api/ProductManagerRemoteInternal;", "model", "", "getProductDetail", "getProductDetails", "", "convertUuid", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo$PrivateUUID;", "isSupportDevice", "isWearOs", "(Lcom/xiaomi/fitness/device/manager/bean/Product;)Z", "isDualWatch", "isDualBand", "isDual", "isBle", "isHuaMi", "isBleWatch", "isEcg", "isBleBand", "isBand", "isWatch", "isWhitelist", "isInternal", "isRelease", "isVersionSupport", "isTreadmill", "isSupportFeature", b.n, "device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceExtKt {
    public static final boolean contains(@NotNull ProductManagerRemoteInternal productManagerRemoteInternal, @NotNull String model) {
        Intrinsics.checkNotNullParameter(productManagerRemoteInternal, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        return getProductDetails(productManagerRemoteInternal).containsKey(model);
    }

    @Nullable
    public static final DeviceInfo.PrivateUUID convertUuid(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        if (product.getPrivateUUID() == null) {
            return null;
        }
        DeviceInfo.PrivateUUID privateUUID = new DeviceInfo.PrivateUUID(null, null, null, null, null, null, null, null, 255, null);
        Product.PrivateUUID privateUUID2 = product.getPrivateUUID();
        Intrinsics.checkNotNull(privateUUID2);
        privateUUID.setFitness(privateUUID2.getFitness());
        Product.PrivateUUID privateUUID3 = product.getPrivateUUID();
        Intrinsics.checkNotNull(privateUUID3);
        privateUUID.setMass(privateUUID3.getMass());
        Product.PrivateUUID privateUUID4 = product.getPrivateUUID();
        Intrinsics.checkNotNull(privateUUID4);
        privateUUID.setOtaRX(privateUUID4.getOtaRX());
        Product.PrivateUUID privateUUID5 = product.getPrivateUUID();
        Intrinsics.checkNotNull(privateUUID5);
        privateUUID.setOtaTX(privateUUID5.getOtaTX());
        Product.PrivateUUID privateUUID6 = product.getPrivateUUID();
        Intrinsics.checkNotNull(privateUUID6);
        privateUUID.setProtoRX(privateUUID6.getProtoRX());
        Product.PrivateUUID privateUUID7 = product.getPrivateUUID();
        Intrinsics.checkNotNull(privateUUID7);
        privateUUID.setProtoTX(privateUUID7.getProtoTX());
        Product.PrivateUUID privateUUID8 = product.getPrivateUUID();
        Intrinsics.checkNotNull(privateUUID8);
        privateUUID.setService(privateUUID8.getService());
        Product.PrivateUUID privateUUID9 = product.getPrivateUUID();
        Intrinsics.checkNotNull(privateUUID9);
        privateUUID.setVoice(privateUUID9.getVoice());
        return privateUUID;
    }

    @Nullable
    public static final Product getProductDetail(@NotNull ProductManagerRemoteInternal productManagerRemoteInternal, @NotNull String model) {
        Intrinsics.checkNotNullParameter(productManagerRemoteInternal, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        return getProductDetails(productManagerRemoteInternal).get(model);
    }

    @NotNull
    public static final Map<String, Product> getProductDetails(@NotNull ProductManagerRemoteInternal productManagerRemoteInternal) {
        Intrinsics.checkNotNullParameter(productManagerRemoteInternal, "<this>");
        return ((ProductManagerRemoteImpl) productManagerRemoteInternal).getMProducts$device_manager_chinaProductRelease();
    }

    public static final boolean isBand(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return isBleBand(product) || isHuaMi(product) || isDualBand(product);
    }

    public static final boolean isBle(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return isBleBand(product) || isBleWatch(product) || isEcg(product);
    }

    public static final boolean isBleBand(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 3;
    }

    public static final boolean isBleWatch(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 2;
    }

    public static final boolean isDual(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return isDualBand(product) || isDualWatch(product);
    }

    public static final boolean isDualBand(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 7;
    }

    public static final boolean isDualWatch(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 6;
    }

    public static final boolean isEcg(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 4;
    }

    public static final boolean isHuaMi(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 5;
    }

    public static final boolean isInternal(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getStatus() == 2;
    }

    public static final boolean isRelease(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getStatus() == 3;
    }

    public static final boolean isSupportDevice(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return (product.getType() == 1 || product.getType() == 4) ? false : true;
    }

    public static final boolean isSupportFeature(@NotNull Product product, @NotNull String feature) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        Intrinsics.checkNotNullParameter(feature, "feature");
        List<String> features = product.getFeatures();
        if (features != null) {
            return features.contains(feature);
        }
        return false;
    }

    public static final boolean isTreadmill(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 8;
    }

    public static final boolean isVersionSupport(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        long versionCode = AppUtil.getVersionCode();
        return versionCode <= 0 || versionCode >= ((long) product.getAppVersion());
    }

    public static final boolean isWatch(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return isBleWatch(product) || isWearOs(product) || isDualWatch(product);
    }

    public static final boolean isWearOs(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 1;
    }

    public static final boolean isWhitelist(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getStatus() == 1;
    }

    @NotNull
    public static final com.xiaomi.fitness.device.manager.export.add.DeviceInfo toDeviceInfo(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        com.xiaomi.fitness.device.manager.export.add.DeviceInfo deviceInfo = new com.xiaomi.fitness.device.manager.export.add.DeviceInfo(0, null, null, null, null, null, 0, null, 0, null, null, false, false, false, false, false, false, 0, 0, 0, false, null, 4194303, null);
        deviceInfo.setModel(product.getModel());
        deviceInfo.setSmallIcon(product.getSmallIcon());
        String productName = product.getProductName();
        if (productName == null) {
            productName = "";
        }
        deviceInfo.setName(productName);
        deviceInfo.setAlias(product.getAlias());
        deviceInfo.setBigIcon(product.getBigIcon3() != null ? product.getBigIcon3() : product.getBigIcon());
        deviceInfo.setBigPreview(product.getBigPreview());
        String bltNamePrefix = product.getBltNamePrefix();
        deviceInfo.setBltNamePrefix(bltNamePrefix != null ? bltNamePrefix : "");
        deviceInfo.setProductId(product.getProductId());
        deviceInfo.setStatus(product.getStatus());
        deviceInfo.setWearOs(product.getType() == 1);
        deviceInfo.setWatch(product.getType() == 2 || product.getType() == 6 || deviceInfo.isWearOs());
        deviceInfo.setHuami(product.getType() == 5);
        deviceInfo.setBand(product.getType() == 3 || product.getType() == 7 || deviceInfo.isHuami());
        deviceInfo.setType(product.getType());
        deviceInfo.setGroupId(product.getGroupId());
        deviceInfo.setSportMachine(product.getAccessType() == 1);
        deviceInfo.setEarPhone(product.getType() == 14);
        deviceInfo.setVersionSupport(AppUtil.getVersionCode() <= 0 || AppUtil.getVersionCode() >= ((long) product.getAppVersion()));
        return deviceInfo;
    }
}
