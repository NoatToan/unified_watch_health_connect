package com.xiaomi.hm.health.device.agps;

import com.huami.account.HMLoginManager;
import com.huami.account.api.model.HMWebAccess;
import com.huami.device.core.agps.api.DownloadResourceType;
import com.huami.device.core.agps.api.bean.AppInfo;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.server.HMServerDef;
import kotlin.Metadata;
import kotlin.collections.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/agps/MifitAppInfoFactory;", "", "Lcom/huami/device/core/agps/api/bean/AppInfo;", "createInfo", "Lcom/huami/device/core/agps/api/DownloadResourceType;", "type", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MifitAppInfoFactory {
    @NotNull
    public final AppInfo createInfo() {
        return new AppInfo(HMServerDef.getHost(), HMAppConfig.getPackageName(), DownloadResourceType.AGPS, HMWebAccess.getToken(), r.emptyMap(), String.valueOf(HMLoginManager.getValidUid()));
    }

    @NotNull
    public final AppInfo createInfo(@NotNull DownloadResourceType type) {
        return AppInfo.copy$default(createInfo(), null, null, type, null, null, null, 59, null);
    }
}
