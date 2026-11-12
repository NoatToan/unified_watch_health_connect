package com.xiaomi.fitness.eco.device.manager.extensions;

import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoAddDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.eco.device.manager.remote.EcoProductManagerRemoteImpl;
import com.xiaomi.fitness.eco.device.model.api.EcoProductManagerRemoteInternal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u0018\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\r*\u00020\tH\u0000\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0000\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\bH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006\u0013"}, d2 = {"isWearOs", "", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "(Lcom/xiaomi/fitness/device/manager/bean/Product;)Z", "isEcg", "toEcoAddDeviceInfo", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoAddDeviceInfo;", "getProductDetail", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerRemoteInternal;", "model", "", "getProductDetails", "", "resetOnRemoveDevice", "", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "convertUuid", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo$PrivateUUID;", "eco-device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoDeviceExtKt {
    @Nullable
    public static final DeviceInfo.PrivateUUID convertUuid(@NotNull EcoProduct ecoProduct) {
        Intrinsics.checkNotNullParameter(ecoProduct, "<this>");
        if (ecoProduct.getPrivateUUID() == null) {
            return null;
        }
        DeviceInfo.PrivateUUID privateUUID = new DeviceInfo.PrivateUUID(null, null, null, null, null, null, null, null, 255, null);
        Product.PrivateUUID privateUUID2 = ecoProduct.getPrivateUUID();
        Intrinsics.checkNotNull(privateUUID2);
        privateUUID.setFitness(privateUUID2.getFitness());
        Product.PrivateUUID privateUUID3 = ecoProduct.getPrivateUUID();
        Intrinsics.checkNotNull(privateUUID3);
        privateUUID.setMass(privateUUID3.getMass());
        Product.PrivateUUID privateUUID4 = ecoProduct.getPrivateUUID();
        Intrinsics.checkNotNull(privateUUID4);
        privateUUID.setOtaRX(privateUUID4.getOtaRX());
        Product.PrivateUUID privateUUID5 = ecoProduct.getPrivateUUID();
        Intrinsics.checkNotNull(privateUUID5);
        privateUUID.setOtaTX(privateUUID5.getOtaTX());
        Product.PrivateUUID privateUUID6 = ecoProduct.getPrivateUUID();
        Intrinsics.checkNotNull(privateUUID6);
        privateUUID.setProtoRX(privateUUID6.getProtoRX());
        Product.PrivateUUID privateUUID7 = ecoProduct.getPrivateUUID();
        Intrinsics.checkNotNull(privateUUID7);
        privateUUID.setProtoTX(privateUUID7.getProtoTX());
        Product.PrivateUUID privateUUID8 = ecoProduct.getPrivateUUID();
        Intrinsics.checkNotNull(privateUUID8);
        privateUUID.setService(privateUUID8.getService());
        Product.PrivateUUID privateUUID9 = ecoProduct.getPrivateUUID();
        Intrinsics.checkNotNull(privateUUID9);
        privateUUID.setVoice(privateUUID9.getVoice());
        return privateUUID;
    }

    @Nullable
    public static final EcoProduct getProductDetail(@NotNull EcoProductManagerRemoteInternal ecoProductManagerRemoteInternal, @NotNull String model) {
        Intrinsics.checkNotNullParameter(ecoProductManagerRemoteInternal, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        return getProductDetails(ecoProductManagerRemoteInternal).get(model);
    }

    @NotNull
    public static final Map<String, EcoProduct> getProductDetails(@NotNull EcoProductManagerRemoteInternal ecoProductManagerRemoteInternal) {
        Intrinsics.checkNotNullParameter(ecoProductManagerRemoteInternal, "<this>");
        return ((EcoProductManagerRemoteImpl) ecoProductManagerRemoteInternal).getMProducts$eco_device_manager_chinaProductRelease();
    }

    public static final boolean isEcg(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 4;
    }

    public static final boolean isWearOs(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return product.getType() == 1;
    }

    public static final void resetOnRemoveDevice(@NotNull EcoDeviceModel ecoDeviceModel) {
        Intrinsics.checkNotNullParameter(ecoDeviceModel, "<this>");
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).removeDid(ecoDeviceModel.getDid());
    }

    @NotNull
    public static final EcoAddDeviceInfo toEcoAddDeviceInfo(@NotNull Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        EcoAddDeviceInfo ecoAddDeviceInfo = new EcoAddDeviceInfo(0, null, null, null, null, null, 0, null, 0, null, null, false, false, false, false, false, 0, 0, 0, false, null, 2097151, null);
        ecoAddDeviceInfo.setModel(product.getModel());
        ecoAddDeviceInfo.setSmallIcon(product.getSmallIcon());
        String productName = product.getProductName();
        if (productName == null) {
            productName = "";
        }
        ecoAddDeviceInfo.setName(productName);
        ecoAddDeviceInfo.setAlias(product.getAlias());
        ecoAddDeviceInfo.setBigIcon(product.getBigIcon3() != null ? product.getBigIcon3() : product.getBigIcon());
        ecoAddDeviceInfo.setBigPreview(product.getBigPreview());
        String bltNamePrefix = product.getBltNamePrefix();
        ecoAddDeviceInfo.setBltNamePrefix(bltNamePrefix != null ? bltNamePrefix : "");
        ecoAddDeviceInfo.setProductId(product.getProductId());
        ecoAddDeviceInfo.setStatus(product.getStatus());
        ecoAddDeviceInfo.setWearOs(product.getType() == 1);
        ecoAddDeviceInfo.setWatch(product.getType() == 2 || product.getType() == 6 || ecoAddDeviceInfo.isWearOs());
        ecoAddDeviceInfo.setHuami(product.getType() == 5);
        ecoAddDeviceInfo.setBand(product.getType() == 3 || product.getType() == 7 || ecoAddDeviceInfo.isHuami());
        ecoAddDeviceInfo.setType(product.getType());
        ecoAddDeviceInfo.setGroupId(product.getGroupId());
        ecoAddDeviceInfo.setSportMachine(product.getAccessType() == 1);
        ecoAddDeviceInfo.setVersionSupport(AppUtil.getVersionCode() <= 0 || AppUtil.getVersionCode() >= ((long) product.getAppVersion()));
        return ecoAddDeviceInfo;
    }
}
