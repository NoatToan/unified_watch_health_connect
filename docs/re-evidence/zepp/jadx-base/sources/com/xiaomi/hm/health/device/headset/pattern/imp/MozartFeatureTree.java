package com.xiaomi.hm.health.device.headset.pattern.imp;

import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.device.headset.pattern.HeadsetFeatureTree;
import com.xiaomi.hm.health.device.headset.pattern.HeadsetSoftFeature;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/pattern/imp/MozartFeatureTree;", "Lcom/xiaomi/hm/health/device/headset/pattern/HeadsetFeatureTree;", "", Constants.JSON_FEATURE, "", "b", "", "setup", "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "c", "Lkotlin/jvm/functions/Function0;", "deviceFeature", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MozartFeatureTree extends HeadsetFeatureTree {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<Feature> deviceFeature;

    /* JADX WARN: Multi-variable type inference failed */
    public MozartFeatureTree(@NotNull Function0<? extends Feature> function0) {
        this.deviceFeature = function0;
    }

    private final boolean b(int feature) {
        Feature featureInvoke = this.deviceFeature.invoke();
        if (featureInvoke == null) {
            return false;
        }
        return featureInvoke.hasHeadset(feature);
    }

    @Override // com.xiaomi.hm.health.device.headset.pattern.HeadsetFeatureTree
    public void setup() {
        HeadsetSoftFeature headsetSoftFeature = HeadsetSoftFeature.WEAR_INDUCTION;
        putFeature(HeadsetSoftFeature.GESTURE_SETTINGS, HeadsetSoftFeature.MUSIC_EQUALIZER, headsetSoftFeature, HeadsetSoftFeature.SPORTS_SETTINGS);
        if (b(5)) {
            return;
        }
        removeFeature(headsetSoftFeature);
    }
}
