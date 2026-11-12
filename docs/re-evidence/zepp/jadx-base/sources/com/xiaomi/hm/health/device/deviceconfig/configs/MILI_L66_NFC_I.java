package com.xiaomi.hm.health.device.deviceconfig.configs;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.BitSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_L66_NFC_I;", "Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_L66_NFC;", "", b.r, LogUtil.I, "getDeviceDesc", "()I", "deviceDesc", DTransferConstants.SEARCH_KEY, "getDevicePageBg", "devicePageBg", "r", "getDeviceIcon", "deviceIcon", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MILI_L66_NFC_I extends MILI_L66_NFC {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int deviceDesc = R.string.mili_l66_nfc;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int devicePageBg = R.drawable.img_bg_l66;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int deviceIcon = R.drawable.img_miband;

    public MILI_L66_NFC_I() {
        BitSet configBitSet = getConfigBitSet();
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_ATRIAL_FIB, false);
        ConfigHelperKt.set(configBitSet, Feature.SUPPORT_RR_PEAK, false);
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.MILI_L66_NFC, com.xiaomi.hm.health.device.deviceconfig.configs.MILI_L66, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDeviceDesc() {
        return this.deviceDesc;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.MILI_L66_NFC, com.xiaomi.hm.health.device.deviceconfig.configs.MILI_L66, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDeviceIcon() {
        return this.deviceIcon;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.MILI_L66_NFC, com.xiaomi.hm.health.device.deviceconfig.configs.MILI_L66, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDevicePageBg() {
        return this.devicePageBg;
    }
}
