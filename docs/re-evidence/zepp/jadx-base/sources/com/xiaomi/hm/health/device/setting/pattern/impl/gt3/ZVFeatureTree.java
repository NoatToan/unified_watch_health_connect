package com.xiaomi.hm.health.device.setting.pattern.impl.gt3;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/pattern/impl/gt3/ZVFeatureTree;", "Lcom/xiaomi/hm/health/device/setting/pattern/impl/gt3/GT3FeatureTree;", "", "setup", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ZVFeatureTree extends GT3FeatureTree {
    @Override // com.xiaomi.hm.health.device.setting.pattern.impl.gt3.GT3FeatureTree, com.xiaomi.hm.health.device.setting.pattern.FeatureTree
    public void setup() {
        super.setup();
        Iterator it2 = CollectionsKt__CollectionsKt.arrayListOf(SoftFeature.TELEPHONE, SoftFeature.MUSIC).iterator();
        while (it2.hasNext()) {
            removeAppItem((SoftFeature) it2.next());
        }
        if (findDeviceSource() == HMDeviceSource.MILI_ZURICH_W || findDeviceSource() == HMDeviceSource.MILI_VERONA_W) {
            for (SoftFeature softFeature : CollectionsKt__CollectionsKt.arrayListOf(SoftFeature.NFC_CARD)) {
                removeAppItem(softFeature);
                removeFeature(softFeature);
            }
        }
    }
}
