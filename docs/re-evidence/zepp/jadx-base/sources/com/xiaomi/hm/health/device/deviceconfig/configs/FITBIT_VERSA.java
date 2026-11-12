package com.xiaomi.hm.health.device.deviceconfig.configs;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HmVirtualDevice;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig;
import java.util.BitSet;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R&\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/FITBIT_VERSA;", "Lcom/xiaomi/hm/health/device/deviceconfig/HMBaseDeviceConfig;", "", "h", LogUtil.I, "getDeviceDesc", "()I", "deviceDesc", "i", "getDeviceIcon", "deviceIcon", "Ljava/lang/Class;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", z.j, "Ljava/lang/Class;", "getDeviceClass", "()Ljava/lang/Class;", "deviceClass", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class FITBIT_VERSA extends HMBaseDeviceConfig {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int deviceDesc = R.string.fitbit_versa;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int deviceIcon = R.drawable.img_amazfitwatch;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private final Class<? extends HMBaseDevice> deviceClass = HmVirtualDevice.class;

    public FITBIT_VERSA() {
        BitSet configBitSet = getConfigBitSet();
        ConfigHelperKt.set(configBitSet, Feature.IS_VIRTUAL_DEVICE, true);
        ConfigHelperKt.set(configBitSet, Feature.WATCH_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.PAI_SOURCE_S, true);
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    @Nullable
    public Class<? extends HMBaseDevice> getDeviceClass() {
        return this.deviceClass;
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
