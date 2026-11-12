package com.huawei.ui.main.stories.nps.interactors.mode;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.ui.main.stories.nps.interactors.HwNpsManager;
import defpackage.eeq;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class DualDeviceParamProvider implements DeviceParamProvider {
    private static final int DEVICE_ID_TYPE_SN = 1;
    private DeviceInfo deviceInfo;

    public DualDeviceParamProvider(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    @Override // com.huawei.ui.main.stories.nps.interactors.mode.DeviceParamProvider
    public Map<String, String> getSpecificParams() {
        HashMap map = new HashMap();
        if (this.deviceInfo != null) {
            map.put("appVersion", "100101621");
            map.put("romVersion", this.deviceInfo.getSoftVersion());
            map.put("sn", eeq.d(this.deviceInfo.getUuid()));
            map.put("uniqueId", getUniqueIdBySHA256());
            map.put("model", this.deviceInfo.getDeviceModel());
        }
        return map;
    }

    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    private String getUniqueIdBySHA256() {
        return HwNpsManager.getInstance().getDeviceId(getNpsIdentify(this.deviceInfo));
    }

    private String getNpsIdentify(DeviceInfo deviceInfo) {
        String secretDeviceIdSha256;
        if (deviceInfo == null) {
            return "";
        }
        String udidFromDevice = deviceInfo.getUdidFromDevice();
        if (!TextUtils.isEmpty(udidFromDevice)) {
            return udidFromDevice;
        }
        if (Utils.o() || deviceInfo.getDeviceIdType() == 1) {
            secretDeviceIdSha256 = HwNpsManager.getInstance().getSecretDeviceIdSha256(deviceInfo.getSecurityDeviceId());
        } else {
            secretDeviceIdSha256 = deviceInfo.getDeviceIdentify();
        }
        String deviceUdid = deviceInfo.getDeviceUdid();
        return (deviceInfo.getProductType() < 34 || TextUtils.isEmpty(deviceUdid)) ? secretDeviceIdSha256 : deviceUdid;
    }
}
