package com.xiaomi.hm.health.device.setting.pattern.impl.gt2;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/pattern/impl/gt2/BonnFeatureTree;", "Lcom/xiaomi/hm/health/device/setting/pattern/impl/gt2/GT2FeatureTree;", "", "setup", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BonnFeatureTree extends GT2FeatureTree {
    @Override // com.xiaomi.hm.health.device.setting.pattern.impl.gt2.GT2FeatureTree, com.xiaomi.hm.health.device.setting.pattern.FeatureTree
    public void setup() {
        super.setup();
        for (SoftFeature softFeature : CollectionsKt__CollectionsKt.arrayListOf(SoftFeature.FLIGHT_BUTLER, SoftFeature.TIGER_STOCKS, SoftFeature.CASSETTE_PLAYER, SoftFeature.ALBUM, SoftFeature.SLEEP, SoftFeature.WORLD_CLOCK, SoftFeature.MUSIC, SoftFeature.TELEPHONE)) {
            removeAppItem(softFeature);
            removeFeature(softFeature);
        }
        if (findDeviceSource() == HMDeviceSource.MILI_BONN_W) {
            for (SoftFeature softFeature2 : CollectionsKt__CollectionsKt.arrayListOf(SoftFeature.NFC_CARD)) {
                removeAppItem(softFeature2);
                removeFeature(softFeature2);
            }
        }
    }
}
