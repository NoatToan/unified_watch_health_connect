package com.xiaomi.fitness.device.manager.internal.extetions;

import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.bean.Product;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"convertUuid", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo$PrivateUUID;", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "device-manager_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProductExtKt {
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
}
