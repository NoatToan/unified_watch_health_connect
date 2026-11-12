package com.xiaomi.hm.health.device.deviceconfig.configs;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014R,\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000f\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliAndesW;", "Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliViennaW;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", SOAP.XMLNS, "Ljava/util/ArrayList;", "getBtNames", "()Ljava/util/ArrayList;", "btNames", "", "t", LogUtil.I, "getDeviceDesc", "()I", "deviceDesc", "u", "getDeviceIcon", "deviceIcon", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class MiliAndesW extends MiliViennaW {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<String> btNames = CollectionsKt__CollectionsKt.arrayListOf("Andesw");

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final int deviceDesc = R.string.mili_andes_w;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final int deviceIcon = R.drawable.img_amazfitwatch;

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.MiliViennaW, com.xiaomi.hm.health.device.deviceconfig.configs.MiliVienna, com.xiaomi.hm.health.device.deviceconfig.configs.MILI_MADRID, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    @NotNull
    public ArrayList<String> getBtNames() {
        return this.btNames;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.MiliViennaW, com.xiaomi.hm.health.device.deviceconfig.configs.MiliVienna, com.xiaomi.hm.health.device.deviceconfig.configs.MILI_MADRID, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDeviceDesc() {
        return this.deviceDesc;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.MiliViennaW, com.xiaomi.hm.health.device.deviceconfig.configs.MiliVienna, com.xiaomi.hm.health.device.deviceconfig.configs.MILI_MADRID, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDeviceIcon() {
        return this.deviceIcon;
    }
}
