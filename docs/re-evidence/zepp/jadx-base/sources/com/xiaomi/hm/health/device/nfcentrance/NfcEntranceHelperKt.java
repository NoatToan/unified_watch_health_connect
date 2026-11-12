package com.xiaomi.hm.health.device.nfcentrance;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.kongmingentrance.KongmingEntranceHelperKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0002"}, d2 = {"", "hasMiUnionpayFeature", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class NfcEntranceHelperKt {
    public static final boolean hasMiUnionpayFeature() {
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
        if (HMDeviceSource.VDEVICE == boundDeviceSource) {
            return false;
        }
        if (HMDeviceSource.MILI_PANGU == boundDeviceSource) {
            return true;
        }
        return KongmingEntranceHelperKt.isKongmingMainland(boundDeviceSource);
    }
}
