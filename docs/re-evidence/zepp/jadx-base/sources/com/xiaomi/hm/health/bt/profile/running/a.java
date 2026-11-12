package com.xiaomi.hm.health.bt.profile.running;

import com.huami.watch.ota.UpdateUtils;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
interface a {
    public static final UUID e0 = GattUtils.uuid128(65248);
    public static final UUID f0 = GattUtils.uuid128(65281);
    public static final UUID g0 = GattUtils.uuid128(65282);
    public static final UUID h0 = GattUtils.uuid128(UpdateUtils.STATE_DOWNLOAD_SUCCESS);
    public static final UUID i0 = GattUtils.uuid128(UpdateUtils.STATE_FILE_TRANSING);
    public static final UUID j0 = GattUtils.uuid16("2A19");
    public static final UUID k0 = GattUtils.uuid16("2A04");
    public static final UUID l0 = GattUtils.uuid128(5424);
}
