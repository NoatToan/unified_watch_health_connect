package com.xiaomi.fit.eco.device.extensions;

import com.xiaomi.eco.api.bean.EcoConnectDeviceInfo;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"convertEcoConnectDevice", "Lcom/xiaomi/eco/api/bean/EcoConnectDeviceInfo;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "eco-device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoDeviceInfoExtKt {
    @NotNull
    public static final EcoConnectDeviceInfo convertEcoConnectDevice(@NotNull EcoDeviceInfo ecoDeviceInfo) {
        EcoConnectDeviceInfo.PrivateUUID privateUUID;
        Intrinsics.checkNotNullParameter(ecoDeviceInfo, "<this>");
        EcoConnectDeviceInfo ecoConnectDeviceInfo = new EcoConnectDeviceInfo(null, null, 0, null, null, 0, null, false, 255, null);
        Product product = ecoDeviceInfo.getProduct();
        Intrinsics.checkNotNull(product);
        ecoConnectDeviceInfo.setType(product.getType());
        ecoConnectDeviceInfo.setAccessType(product.getAccessType());
        ecoConnectDeviceInfo.setDid(ecoDeviceInfo.getDid());
        ecoConnectDeviceInfo.setMac(ecoDeviceInfo.getMac());
        ecoConnectDeviceInfo.setMode(product.getModel());
        ecoConnectDeviceInfo.setProductName(product.getProductName());
        ecoConnectDeviceInfo.setRequestBond(EcoProductExtKt.isRequestBond(product));
        DeviceInfo.PrivateUUID privateUUID2 = ecoDeviceInfo.getPrivateUUID();
        if (privateUUID2 != null) {
            privateUUID = new EcoConnectDeviceInfo.PrivateUUID(null, null, null, null, null, null, null, null, 255, null);
            privateUUID.setFitness(privateUUID2.getFitness());
            privateUUID.setMass(privateUUID2.getMass());
            privateUUID.setOtaRX(privateUUID2.getOtaRX());
            privateUUID.setOtaTX(privateUUID2.getOtaTX());
            privateUUID.setProtoRX(privateUUID2.getProtoRX());
            privateUUID.setProtoTX(privateUUID2.getProtoTX());
            privateUUID.setService(privateUUID2.getService());
            privateUUID.setVoice(privateUUID2.getVoice());
        } else {
            privateUUID = null;
        }
        ecoConnectDeviceInfo.setPrivateUUID(privateUUID);
        return ecoConnectDeviceInfo;
    }
}
