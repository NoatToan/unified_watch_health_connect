package com.xiaomi.hm.health.bt.profile.earbud;

import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public interface IEarbudProfile {
    public static final UUID UUID_CHARACTERISTIC_BATTERY = GattUtils.uuid128(6);
    public static final UUID UUID_CHARACTERISTIC_CONTROL_POINT = GattUtils.uuid128(3);
}
