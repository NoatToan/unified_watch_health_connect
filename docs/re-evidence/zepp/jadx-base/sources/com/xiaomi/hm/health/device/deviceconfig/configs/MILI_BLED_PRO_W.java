package com.xiaomi.hm.health.device.deviceconfig.configs;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import java.util.ArrayList;
import java.util.BitSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017R,\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000f\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0015\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_BLED_PRO_W;", "Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_MADRID;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "m", "Ljava/util/ArrayList;", "getBtNames", "()Ljava/util/ArrayList;", "btNames", "", GoogleApiAvailabilityLight.b, LogUtil.I, "getDeviceDesc", "()I", "deviceDesc", "o", "getDevicePageBg", "devicePageBg", b.r, "getDeviceIcon", "deviceIcon", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MILI_BLED_PRO_W extends MILI_MADRID {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<String> btNames = CollectionsKt__CollectionsKt.arrayListOf("Bled");

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int deviceDesc = R.string.mili_bled_pro_w;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int devicePageBg = R.drawable.img_bg_pyh;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int deviceIcon = R.drawable.img_midong_watch_lite;

    public MILI_BLED_PRO_W() {
        BitSet configBitSet = getConfigBitSet();
        ConfigHelperKt.set(configBitSet, Feature.ROUND_WATCH_S, false);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_VOICE, false);
        ConfigHelperKt.set(configBitSet, Feature.SQUARE_WATCH_S, true);
        ConfigHelperKt.set(configBitSet, Feature.NFC_BUS, false);
        ConfigHelperKt.set(configBitSet, Feature.NFC_DOOR, false);
        ConfigHelperKt.set(configBitSet, Feature.NFC_TAG, false);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_SCHEDULE, false);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_ATRIAL_FIB, false);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_RR_PEAK, false);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_LANGUAGE_CHANGE_BY_APP_DEVICE, true);
        ConfigHelperKt.set(configBitSet, Feature.OVERSEA, true);
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.MILI_MADRID, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    @NotNull
    public ArrayList<String> getBtNames() {
        return this.btNames;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.MILI_MADRID, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDeviceDesc() {
        return this.deviceDesc;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.MILI_MADRID, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDeviceIcon() {
        return this.deviceIcon;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.MILI_MADRID, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDevicePageBg() {
        return this.devicePageBg;
    }
}
