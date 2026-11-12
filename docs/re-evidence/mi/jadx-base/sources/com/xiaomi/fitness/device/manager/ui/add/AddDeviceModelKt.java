package com.xiaomi.fitness.device.manager.ui.add;

import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import com.xiaomi.fitness.rn.export.bean.RNProduct;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toDeviceInfo", "Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "Lcom/xiaomi/fitness/rn/export/bean/RNProduct;", "device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AddDeviceModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceInfo toDeviceInfo(RNProduct rNProduct) {
        DeviceInfo deviceInfo = new DeviceInfo(0, null, null, null, null, null, 0, null, 0, null, null, false, false, false, false, false, false, 0, 0, 0, false, null, 4194303, null);
        deviceInfo.setBigIcon(rNProduct.getBigIcon());
        deviceInfo.setModel(rNProduct.getModel());
        String productName = rNProduct.getProductName();
        if (productName == null) {
            productName = "";
        }
        deviceInfo.setName(productName);
        deviceInfo.setProductId(rNProduct.getProductId());
        deviceInfo.setGroupId(rNProduct.getGroupId());
        deviceInfo.setAlias(rNProduct.getAlias());
        deviceInfo.setVersionSupport(AppUtil.getVersionCode() <= 0 || AppUtil.getVersionCode() >= ((long) rNProduct.getAppVersion()));
        deviceInfo.setBigPreview(rNProduct.getBigPreview());
        deviceInfo.setSmallIcon(rNProduct.getSmallIcon());
        return deviceInfo;
    }
}
