package defpackage;

import com.miot.rn.plugin.utils.DeviceStatUtil;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.smarthome.core.modelconfig.PluginDeviceManager;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.rn.core.bean.RnPluginDeviceInfo;

/* JADX INFO: loaded from: classes5.dex */
public class r1i {
    public static DeviceStat a(Device device) {
        return DeviceStatUtil.newDeviceStat(device);
    }

    public static RnPluginDeviceInfo b(String str) {
        RnPluginDeviceInfo rnPluginDeviceInfo = new RnPluginDeviceInfo();
        rnPluginDeviceInfo.mModel = str;
        PluginDeviceInfo pluginInfo = PluginDeviceManager.getInstance().getPluginInfo(str);
        rnPluginDeviceInfo.mPrivacyVer = pluginInfo != null ? pluginInfo.E : null;
        rnPluginDeviceInfo.mProductId = pluginInfo != null ? pluginInfo.f10608b : 0;
        return rnPluginDeviceInfo;
    }
}
