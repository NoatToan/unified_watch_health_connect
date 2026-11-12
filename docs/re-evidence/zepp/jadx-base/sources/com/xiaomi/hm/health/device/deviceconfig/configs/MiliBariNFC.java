package com.xiaomi.hm.health.device.deviceconfig.configs;

import com.xiaomi.hm.health.device.deviceconfig.Feature;
import java.util.BitSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliBariNFC;", "Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliBari;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class MiliBariNFC extends MiliBari {
    public MiliBariNFC() {
        BitSet configBitSet = getConfigBitSet();
        ConfigHelperKt.set(configBitSet, Feature.NFC_BUS, true);
        ConfigHelperKt.set(configBitSet, Feature.NFC_DOOR, true);
        ConfigHelperKt.set(configBitSet, Feature.NFC_TAG, true);
    }
}
