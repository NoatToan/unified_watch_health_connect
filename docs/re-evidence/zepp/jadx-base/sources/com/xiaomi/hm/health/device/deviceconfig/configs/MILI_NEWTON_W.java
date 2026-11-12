package com.xiaomi.hm.health.device.deviceconfig.configs;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import java.util.BitSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_NEWTON_W;", "Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_NEWTON;", "", "m", LogUtil.I, "getDeviceDesc", "()I", "deviceDesc", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class MILI_NEWTON_W extends MILI_NEWTON {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int deviceDesc = R.string.newton_w;

    public MILI_NEWTON_W() {
        BitSet configBitSet = getConfigBitSet();
        ConfigHelperKt.set(configBitSet, Feature.NFC_BUS, false);
        ConfigHelperKt.set(configBitSet, Feature.NFC_DOOR, false);
        ConfigHelperKt.set(configBitSet, Feature.NFC_TAG, false);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_SCHEDULE, false);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_ATRIAL_FIB, false);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_RR_PEAK, false);
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.MILI_NEWTON, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDeviceDesc() {
        return this.deviceDesc;
    }
}
