package com.xiaomi.smarthome.cache;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class BleCacheManager {
    private static final String TAG = "BleCacheManager";
    private Map<String, BleDeviceState> map;

    public static final class Holder {
        static final BleCacheManager INSTANCE = new BleCacheManager();
    }

    public static BleCacheManager getInstance() {
        return Holder.INSTANCE;
    }

    public BleDeviceState getBleDeviceState(String str) {
        if (TextUtils.isEmpty(str)) {
            return new BleDeviceState();
        }
        String upperCase = str.toUpperCase();
        BleDeviceState bleDeviceState = this.map.get(upperCase);
        if (bleDeviceState != null) {
            return bleDeviceState;
        }
        BleDeviceState bleDeviceState2 = new BleDeviceState(upperCase);
        this.map.put(upperCase, bleDeviceState2);
        return bleDeviceState2;
    }

    private BleCacheManager() {
        this.map = new HashMap();
    }
}
