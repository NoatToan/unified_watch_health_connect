package com.huawei.health.sportservice.impl;

import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;

/* JADX INFO: loaded from: classes31.dex */
@ApiDefine(uri = SportLifecycle.class)
@Singleton
public class SportLifeCircleImpl implements SportLifecycle {
    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        BaseSportManager.getInstance().onPreSport();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onCountDown() {
        BaseSportManager.getInstance().onCountDown();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        BaseSportManager.getInstance().onStartSport();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        BaseSportManager.getInstance().onResumeSport();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        BaseSportManager.getInstance().onPauseSport();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStopSport() {
        BaseSportManager.getInstance().onStopSport();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStopSport(String str) {
        BaseSportManager.getInstance().onStopSport(str);
    }
}
