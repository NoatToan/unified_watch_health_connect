package com.xiaomi.hm.health.device.deviceconfig.configs;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig;
import java.util.BitSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/WATCH_EVEREST;", "Lcom/xiaomi/hm/health/device/deviceconfig/HMBaseDeviceConfig;", "", "h", LogUtil.I, "getDeviceDesc", "()I", "deviceDesc", "i", "getDeviceIcon", "deviceIcon", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WATCH_EVEREST extends HMBaseDeviceConfig {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int deviceDesc = R.string.amazfit_everest;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int deviceIcon = R.drawable.img_bind_everest;

    public WATCH_EVEREST() {
        BitSet configBitSet = getConfigBitSet();
        ConfigHelperKt.set(configBitSet, Feature.HR_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.FULL_HR_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.EVEREST_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.HEART_RATE_REGION_S, true);
        ConfigHelperKt.set(configBitSet, Feature.CLASSIC_BT_GPS_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.CLASSIC_BT_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.NPS_QUESTION, true);
        ConfigHelperKt.set(configBitSet, Feature.ROUND_WATCH_S, true);
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDeviceDesc() {
        return this.deviceDesc;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDeviceIcon() {
        return this.deviceIcon;
    }
}
