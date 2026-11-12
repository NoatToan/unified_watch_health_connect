package com.xiaomi.hm.health.bt.profile.milipro;

import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
public interface IMiLiProProfile {
    public static final UUID UUID_CHARACTERISTIC_SENSOR_DATA_CONTROL_POINT = GattUtils.uuid128(1);
    public static final UUID UUID_CHARACTERISTIC_SENSOR_DATA = GattUtils.uuid128(2);
    public static final UUID UUID_CHARACTERISTIC_CONTROL_POINT = GattUtils.uuid128(3);
    public static final UUID UUID_CHARACTERISTIC_ACTIVITY_DATA_CONTROL_POINT = GattUtils.uuid128(4);
    public static final UUID UUID_CHARACTERISTIC_ACTIVITY_DATA = GattUtils.uuid128(5);
    public static final UUID UUID_CHARACTERISTIC_BATTERY = GattUtils.uuid128(6);
    public static final UUID UUID_CHARACTERISTIC_REALTIME_STEPS = GattUtils.uuid128(7);
    public static final UUID UUID_CHARACTERISTIC_TEMPERATURE = GattUtils.uuid128(24);
}
