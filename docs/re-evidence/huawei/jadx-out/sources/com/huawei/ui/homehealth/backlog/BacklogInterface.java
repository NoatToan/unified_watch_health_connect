package com.huawei.ui.homehealth.backlog;

import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import defpackage.dse;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes17.dex */
public interface BacklogInterface {
    CompletableFuture<List<dse>> requestBacklog(DeviceInfo deviceInfo);

    void updateDeleteStatus(DeviceInfo deviceInfo, String str, BackLogCallback<Boolean> backLogCallback);

    void updateVisitedStatus(DeviceInfo deviceInfo, String str, BackLogCallback<Boolean> backLogCallback);
}
