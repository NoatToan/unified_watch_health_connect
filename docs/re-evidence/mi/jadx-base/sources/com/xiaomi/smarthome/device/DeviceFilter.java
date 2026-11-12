package com.xiaomi.smarthome.device;

import android.text.TextUtils;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.device.DeviceFilter;
import com.xiaomi.smarthome.newui.utils.DeviceUtils;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
public interface DeviceFilter {
    public static final DeviceFilter FILTER_SPLITMAIN = new DeviceFilter() { // from class: g56
        @Override // com.xiaomi.smarthome.device.DeviceFilter
        public final Device filter(Device device) {
            return DeviceFilter.lambda$static$0(device);
        }
    };
    public static final DeviceFilter FILTER_SPLITSUB = new DeviceFilter() { // from class: h56
        @Override // com.xiaomi.smarthome.device.DeviceFilter
        public final Device filter(Device device) {
            return DeviceFilter.lambda$static$1(device);
        }
    };
    public static final DeviceFilter FILTER_NONE = new DeviceFilter() { // from class: i56
        @Override // com.xiaomi.smarthome.device.DeviceFilter
        public final Device filter(Device device) {
            return DeviceFilter.lambda$static$2(device);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Device lambda$static$0(Device device) {
        if (device == null) {
            return null;
        }
        JSONArray subDids = DeviceUtils.getSubDids(device);
        if ((subDids == null || subDids.length() == 0) && (device.comFlag & 16) != 16) {
            return device;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Device lambda$static$1(Device device) {
        if (device == null || (device.comFlag & 16) == 16 || !TextUtils.isEmpty(DeviceUtils.getParentId(device))) {
            return null;
        }
        return device;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Device lambda$static$2(Device device) {
        return device;
    }

    Device filter(Device device);
}
