package com.xiaomi.hm.health.device.headset.pattern.imp;

import com.xiaomi.hm.health.device.headset.pattern.HeadsetFeatureTree;
import com.xiaomi.hm.health.device.headset.pattern.HeadsetSoftFeature;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/pattern/imp/HaydnFeatureTree;", "Lcom/xiaomi/hm/health/device/headset/pattern/HeadsetFeatureTree;", "", "setup", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HaydnFeatureTree extends HeadsetFeatureTree {
    @Override // com.xiaomi.hm.health.device.headset.pattern.HeadsetFeatureTree
    public void setup() {
        putFeature(HeadsetSoftFeature.HEARING_HEALTH, HeadsetSoftFeature.GESTURE_SETTINGS, HeadsetSoftFeature.MUSIC_EQUALIZER, HeadsetSoftFeature.WEAR_INDUCTION, HeadsetSoftFeature.NOISE_REDUCTION, HeadsetSoftFeature.CERVICAL_PROTECTION, HeadsetSoftFeature.SPORT_RUNNING_RECOGNITION, HeadsetSoftFeature.SPORT_HIGH_HEART_RATE_REMINDER, HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT, HeadsetSoftFeature.SPORT_PERCUSSION_BROADCAST, HeadsetSoftFeature.HEART_RATE_BROADCAST);
    }
}
