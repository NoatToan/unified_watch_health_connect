package com.xiaomi.hm.health.bt.profile.base;

import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public interface IBaseProfile {
    public static final UUID UUID_SERVICE_MILI_SERVICE = GattUtils.uuid16("FEE0");
    public static final UUID UUID_SERVICE_DEVICE_SERVICE = GattUtils.uuid16("180A");
    public static final UUID UUID_CHARACTERISTIC_DEVICE_SERIAL_NUMBER = GattUtils.uuid16("2A25");
    public static final UUID UUID_CHARACTERISTIC_DEVICE_HARDWARE_REVISION = GattUtils.uuid16("2A27");
    public static final UUID UUID_CHARACTERISTIC_DEVICE_SOFTWARE_REVISION = GattUtils.uuid16("2A28");
    public static final UUID UUID_CHARACTERISTIC_DEVICE_MANUFACTURER_NAME = GattUtils.uuid16("2A29");
    public static final UUID UUID_CHARACTERISTIC_DEVICE_SYSTEM_ID = GattUtils.uuid16("2A23");
    public static final UUID UUID_CHARACTERISTIC_DEVICE_MODEL_NUMBER = GattUtils.uuid16("2A24");
    public static final UUID UUID_CHARACTERISTIC_DEVICE_PNP_ID = GattUtils.uuid16("2A50");
    public static final UUID UUID_CHARACTERISTIC_DATE_TIME = GattUtils.uuid16("2A2B");
    public static final UUID UUID_CHARACTERISTIC_PPCP = GattUtils.uuid16("2A04");
}
