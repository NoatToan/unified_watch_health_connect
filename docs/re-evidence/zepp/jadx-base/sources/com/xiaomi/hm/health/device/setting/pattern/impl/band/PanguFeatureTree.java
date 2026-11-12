package com.xiaomi.hm.health.device.setting.pattern.impl.band;

import com.xiaomi.hm.health.device.NfcDeviceConfigKt;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/pattern/impl/band/PanguFeatureTree;", "Lcom/xiaomi/hm/health/device/setting/pattern/impl/band/BandFeatureTree;", "", "setup", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class PanguFeatureTree extends BandFeatureTree {
    @Override // com.xiaomi.hm.health.device.setting.pattern.impl.band.BandFeatureTree, com.xiaomi.hm.health.device.setting.pattern.FeatureTree
    public void setup() {
        super.setup();
        if (NfcDeviceConfigKt.hasFeatureNfc()) {
            return;
        }
        removeAppItem(SoftFeature.NFC_CARD);
    }
}
