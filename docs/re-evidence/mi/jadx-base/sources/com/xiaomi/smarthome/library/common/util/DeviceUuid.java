package com.xiaomi.smarthome.library.common.util;

import android.content.Context;
import com.xiaomi.smarthome.library.deviceId.DeviceIdCompat;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceUuid {
    private static final String DEVICE_UUID_PREFS_FILE = "device_uuid.xml";
    private static final String PREFS_DEVICE_UUID_KEY = "device_uuid";

    public static String getUuid(Context context) {
        return DeviceIdCompat.getDeviceId(context);
    }
}
