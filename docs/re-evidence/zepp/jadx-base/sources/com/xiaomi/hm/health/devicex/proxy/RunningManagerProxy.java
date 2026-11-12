package com.xiaomi.hm.health.devicex.proxy;

import com.huami.devicex.injection.RunningManagerApi;
import com.xiaomi.hm.health.manager.RunningManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/RunningManagerProxy;", "Lcom/huami/devicex/injection/RunningManagerApi;", "", "setOrUpdateRunnerData", "syncGPSSport", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class RunningManagerProxy implements RunningManagerApi {
    @Override // com.huami.devicex.injection.RunningManagerApi
    public void setOrUpdateRunnerData() {
        RunningManager.setOrUpdateRunnerData();
    }

    @Override // com.huami.devicex.injection.RunningManagerApi
    public void syncGPSSport() {
        RunningManager.syncGPSSport();
    }
}
