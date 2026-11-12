package com.huami.ad.entity;

import com.huami.ad.utils.LaunchEntityProbabilityUtils;
import com.xiaomi.hm.health.databases.model.LaunchEntity;

/* JADX INFO: loaded from: classes4.dex */
public class LaunchAd {
    private boolean a;
    private int b;
    public LaunchEntity mEntity;

    public LaunchAd(LaunchEntity launchEntity, boolean z) {
        this.mEntity = launchEntity;
        this.a = z;
        if (z) {
            this.b = 25;
        } else {
            this.b = LaunchEntityProbabilityUtils.getProbability(launchEntity);
        }
    }

    public int getProbability() {
        return this.b;
    }

    public boolean isAdNetEntity() {
        return this.a;
    }
}
