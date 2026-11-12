package com.xiaomi.hm.health.device.deviceconfig.configs;

import com.huami.devicex.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rR&\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MiliCraterWL;", "Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_COMO_WL;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getBtNames", "()Ljava/util/ArrayList;", "btNames", "", "getDeviceDesc", "()I", "deviceDesc", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MiliCraterWL extends MILI_COMO_WL {
    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.MILI_COMO_WL, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    @NotNull
    public ArrayList<String> getBtNames() {
        return CollectionsKt__CollectionsKt.arrayListOf("Crater WL", "Amazfit Bip 3");
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.MILI_COMO_WL, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDeviceDesc() {
        return R.string.mili_cater_wl;
    }
}
