package com.xiaomi.hm.health.device.deviceconfig.configs;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eR,\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000f\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0015\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR&\u0010\u001c\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0017\u0018\u00010\u00168\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliLeidenW;", "Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliLeiden;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "v", "Ljava/util/ArrayList;", "getBtNames", "()Ljava/util/ArrayList;", "btNames", "", "w", LogUtil.I, "getDeviceDesc", "()I", "deviceDesc", "x", "getDevicePageBg", "devicePageBg", "y", "getDeviceIcon", "deviceIcon", "Ljava/lang/Class;", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "z", "Ljava/lang/Class;", "getDeviceClass", "()Ljava/lang/Class;", "deviceClass", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class MiliLeidenW extends MiliLeiden {

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<String> btNames = CollectionsKt__CollectionsKt.arrayListOf("Leiden");

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int deviceDesc = R.string.mili_leiden_w;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final int devicePageBg = R.drawable.img_bg_pyh;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final int deviceIcon = R.drawable.img_amazfitwatch;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private final Class<? extends HMBaseBleDevice> deviceClass = HMMiLiProDevice.class;

    public MiliLeidenW() {
        ConfigHelperKt.set(getConfigBitSet(), Feature.OVERSEA, true);
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.MiliLeiden, com.xiaomi.hm.health.device.deviceconfig.configs.MILI_BLED_PRO, com.xiaomi.hm.health.device.deviceconfig.configs.MILI_MADRID, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    @NotNull
    public ArrayList<String> getBtNames() {
        return this.btNames;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.MiliLeiden, com.xiaomi.hm.health.device.deviceconfig.configs.MILI_MADRID, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    @Nullable
    public Class<? extends HMBaseBleDevice> getDeviceClass() {
        return this.deviceClass;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.MiliLeiden, com.xiaomi.hm.health.device.deviceconfig.configs.MILI_BLED_PRO, com.xiaomi.hm.health.device.deviceconfig.configs.MILI_MADRID, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDeviceDesc() {
        return this.deviceDesc;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.MiliLeiden, com.xiaomi.hm.health.device.deviceconfig.configs.MILI_BLED_PRO, com.xiaomi.hm.health.device.deviceconfig.configs.MILI_MADRID, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDeviceIcon() {
        return this.deviceIcon;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.MiliLeiden, com.xiaomi.hm.health.device.deviceconfig.configs.MILI_BLED_PRO, com.xiaomi.hm.health.device.deviceconfig.configs.MILI_MADRID, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDevicePageBg() {
        return this.devicePageBg;
    }
}
