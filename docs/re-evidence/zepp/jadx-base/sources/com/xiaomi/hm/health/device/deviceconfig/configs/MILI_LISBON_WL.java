package com.xiaomi.hm.health.device.deviceconfig.configs;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R,\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000f\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_LISBON_WL;", "Lcom/xiaomi/hm/health/device/deviceconfig/configs/MILI_LISBON_W;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", GoogleApiAvailabilityLight.b, "Ljava/util/ArrayList;", "getBtNames", "()Ljava/util/ArrayList;", "btNames", "", "o", LogUtil.I, "getDeviceDesc", "()I", "deviceDesc", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MILI_LISBON_WL extends MILI_LISBON_W {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<String> btNames = CollectionsKt__CollectionsKt.arrayListOf("lisbon", "Amazfit GTR 2L");

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int deviceDesc = R.string.lisbon_w;

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.MILI_LISBON, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    @NotNull
    public ArrayList<String> getBtNames() {
        return this.btNames;
    }

    @Override // com.xiaomi.hm.health.device.deviceconfig.configs.MILI_LISBON_W, com.xiaomi.hm.health.device.deviceconfig.configs.MILI_LISBON, com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig
    public int getDeviceDesc() {
        return this.deviceDesc;
    }
}
