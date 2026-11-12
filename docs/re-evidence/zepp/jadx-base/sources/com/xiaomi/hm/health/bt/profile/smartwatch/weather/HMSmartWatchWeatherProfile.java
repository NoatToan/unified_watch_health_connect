package com.xiaomi.hm.health.bt.profile.smartwatch.weather;

import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.weather.HMWeatherProfile;

/* JADX INFO: loaded from: classes18.dex */
public class HMSmartWatchWeatherProfile extends HMWeatherProfile {
    private static final String l = "HMSmartWatchWeatherProfile";
    private static final byte m = 32;

    public HMSmartWatchWeatherProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
    }

    public boolean setUnit(boolean z) {
        byte[] bArr = {32, z ? (byte) 1 : (byte) 0};
        Log.d(l, "Set Unit, Cmd: " + GattUtils.bytesToHexString(bArr), new Object[0]);
        return writeWeatherCommand(bArr);
    }
}
