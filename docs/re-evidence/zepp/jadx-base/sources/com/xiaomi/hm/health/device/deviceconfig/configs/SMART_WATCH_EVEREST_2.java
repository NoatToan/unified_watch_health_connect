package com.xiaomi.hm.health.device.deviceconfig.configs;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig;
import java.util.ArrayList;
import java.util.BitSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bR,\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000f\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR&\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u00108\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/SMART_WATCH_EVEREST_2;", "Lcom/xiaomi/hm/health/device/deviceconfig/HMBaseDeviceConfig;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "h", "Ljava/util/ArrayList;", "getBtNames", "()Ljava/util/ArrayList;", "btNames", "", "i", LogUtil.I, "getDeviceDesc", "()I", "deviceDesc", "Ljava/lang/Class;", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", z.j, "Ljava/lang/Class;", "getDeviceClass", "()Ljava/lang/Class;", "deviceClass", hl.k, "getDeviceIcon", "deviceIcon", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SMART_WATCH_EVEREST_2 extends HMBaseDeviceConfig {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<String> btNames = CollectionsKt__CollectionsKt.arrayListOf("Amazfit Everest 2", "Amazfit Stratos 3");

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int deviceDesc = R.string.amazfit_everest;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private final Class<? extends HMBaseBleDevice> deviceClass = HMSmartWatchDevice.class;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int deviceIcon = R.drawable.img_amazfitwatch;

    public SMART_WATCH_EVEREST_2() {
        BitSet configBitSet = getConfigBitSet();
        ConfigHelperKt.set(configBitSet, Feature.HR_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.FULL_HR_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.EVEREST_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.HEART_RATE_REGION_S, true);
        ConfigHelperKt.set(configBitSet, Feature.CLASSIC_BT_GPS_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.CLASSIC_BT_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.NFC_BUS, true);
        ConfigHelperKt.set(configBitSet, Feature.NFC_DOOR, true);
        ConfigHelperKt.set(configBitSet, Feature.NFC_TAG, true);
        ConfigHelperKt.set(configBitSet, Feature.EVEREST_2_SERIES, true);
        ConfigHelperKt.set(configBitSet, Feature.NPS_QUESTION, true);
        ConfigHelperKt.set(configBitSet, Feature.ROUND_WATCH_S, true);
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    @NotNull
    public ArrayList<String> getBtNames() {
        return this.btNames;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    @Nullable
    public Class<? extends HMBaseBleDevice> getDeviceClass() {
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
