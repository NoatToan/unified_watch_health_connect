package com.xiaomi.hm.health.device.deviceconfig.configs;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.devicex.R;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.LullabyDevice;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.BitSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R&\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R&\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/HeadsetLullaby;", "Lcom/xiaomi/hm/health/device/deviceconfig/configs/HeadsetHaydn;", "", "o", LogUtil.I, "getDeviceIcon", "()I", "deviceIcon", b.r, "getDeviceDesc", "deviceDesc", "Ljava/lang/Class;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", DTransferConstants.SEARCH_KEY, "Ljava/lang/Class;", "getDeviceClass", "()Ljava/lang/Class;", "deviceClass", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getBtNames", "()Ljava/util/ArrayList;", "btNames", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HeadsetLullaby extends HeadsetHaydn {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int deviceIcon = R.drawable.private_haydn_open_placeholder_img;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int deviceDesc = R.string.headset_lullaby;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private final Class<? extends HMBaseDevice> deviceClass = LullabyDevice.class;

    public HeadsetLullaby() {
        BitSet configBitSet = getConfigBitSet();
        ConfigHelperKt.set(configBitSet, Feature.NOT_SUPPORT_LF_EVENT_SOURCES, false);
        ConfigHelperKt.set(configBitSet, Feature.LOG_SOURCE_S, true);
        ConfigHelperKt.set(configBitSet, Feature.BTSTATUS_RETRY_UI, true);
        ConfigHelperKt.set(configBitSet, Feature.IS_SUPPORT_SINGLE_EAR_UPGRADE, false);
        ConfigHelperKt.set(configBitSet, Feature.BOUND_REFUSE_RETRY, true);
        ConfigHelperKt.set(configBitSet, Feature.CLASSIC_BLUETOOTH_CYCLE_SCAN, true);
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.HeadsetHaydn, com.xiaomi.hm.health.device.deviceconfig.configs.HEADSET_MOZART, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    @NotNull
    public ArrayList<String> getBtNames() {
        return CollectionsKt__CollectionsKt.arrayListOf("Lullaby", "^LULLABY_.*");
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.HeadsetHaydn, com.xiaomi.hm.health.device.deviceconfig.configs.HEADSET_MOZART, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    @Nullable
    public Class<? extends HMBaseDevice> getDeviceClass() {
        return this.deviceClass;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.HeadsetHaydn, com.xiaomi.hm.health.device.deviceconfig.configs.HEADSET_MOZART, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDeviceDesc() {
        return this.deviceDesc;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.HeadsetHaydn, com.xiaomi.hm.health.device.deviceconfig.configs.HEADSET_MOZART, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDeviceIcon() {
        return this.deviceIcon;
    }
}
