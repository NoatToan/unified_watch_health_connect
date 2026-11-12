package com.xiaomi.hm.health.device.setting.pattern.impl.gt3;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/pattern/impl/gt3/ViennaFeatureTree;", "Lcom/xiaomi/hm/health/device/setting/pattern/impl/gt3/GT3FeatureTree;", "", "setup", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ViennaFeatureTree extends GT3FeatureTree {
    @Override // com.xiaomi.hm.health.device.setting.pattern.impl.gt3.GT3FeatureTree, com.xiaomi.hm.health.device.setting.pattern.FeatureTree
    public void setup() {
        super.setup();
        List<SoftFeature> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(SoftFeature.TELEPHONE);
        if (CollectionsKt__CollectionsKt.mutableListOf(HMDeviceSource.MILI_TEIDE, HMDeviceSource.MILI_TEIDE_W).contains(findDeviceSource())) {
            listMutableListOf.add(SoftFeature.MUSIC);
        }
        for (SoftFeature softFeature : listMutableListOf) {
            removeAppItem(softFeature);
            removeFeature(softFeature);
        }
        putFeature(SoftFeature.JS_APP_STORE);
        putFeature(SoftFeature.JS_APP_SETTING);
    }
}
