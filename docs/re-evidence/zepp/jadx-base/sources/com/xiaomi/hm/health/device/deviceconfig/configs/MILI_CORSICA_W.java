package com.xiaomi.hm.health.device.deviceconfig.configs;

import com.xiaomi.hm.health.device.deviceconfig.Feature;
import java.util.BitSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_CORSICA_W;", "Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_CORSICA;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MILI_CORSICA_W extends MILI_CORSICA {
    public MILI_CORSICA_W() {
        BitSet configBitSet = getConfigBitSet();
        ConfigHelperKt.set(configBitSet, Feature.NFC_BUS, false);
        ConfigHelperKt.set(configBitSet, Feature.NFC_DOOR, false);
        ConfigHelperKt.set(configBitSet, Feature.NFC_TAG, false);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_ATRIAL_FIB, false);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_RR_PEAK, false);
    }
}
