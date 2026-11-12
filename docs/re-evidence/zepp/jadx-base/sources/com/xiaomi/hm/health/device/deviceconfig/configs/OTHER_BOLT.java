package com.xiaomi.hm.health.device.deviceconfig.configs;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMBoltClassicDevice;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig;
import java.util.ArrayList;
import java.util.BitSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dR,\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000f\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0013R&\u0010\u001b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0016\u0018\u00010\u00158\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/OTHER_BOLT;", "Lcom/xiaomi/hm/health/device/deviceconfig/HMBaseDeviceConfig;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "h", "Ljava/util/ArrayList;", "getBtNames", "()Ljava/util/ArrayList;", "btNames", "", "i", LogUtil.I, "getDeviceIcon", "()I", "deviceIcon", z.j, "getDeviceDesc", "setDeviceDesc", "(I)V", "deviceDesc", "Ljava/lang/Class;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", hl.k, "Ljava/lang/Class;", "getDeviceClass", "()Ljava/lang/Class;", "deviceClass", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class OTHER_BOLT extends HMBaseDeviceConfig {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<String> btNames = CollectionsKt__CollectionsKt.arrayListOf("Bolt", "Amazfit AirRun Speaker");

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int deviceIcon = R.drawable.treadmill_search;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int deviceDesc = R.string.other_bolt_offical;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private final Class<? extends HMBaseDevice> deviceClass = HMBoltClassicDevice.class;

    public OTHER_BOLT() {
        BitSet configBitSet = getConfigBitSet();
        ConfigHelperKt.set(configBitSet, Feature.NOT_SUPPORT_LF_EVENT_SOURCES, true);
        ConfigHelperKt.set(configBitSet, Feature.AUTH_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.BOLT_SERIES, true);
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    @NotNull
    public ArrayList<String> getBtNames() {
        return this.btNames;
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

    public void setDeviceDesc(int i) {
        this.deviceDesc = i;
    }
}
