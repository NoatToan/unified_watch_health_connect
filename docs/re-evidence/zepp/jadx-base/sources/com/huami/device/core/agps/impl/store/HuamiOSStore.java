package com.huami.device.core.agps.impl.store;

import com.huami.device.core.agps.api.AgpsHttpClient;
import com.huami.device.core.agps.api.bean.AppInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/huami/device/core/agps/impl/store/HuamiOSStore;", "Lcom/huami/device/core/agps/impl/store/HmGpsStore;", "Lcom/huami/device/core/agps/api/AgpsHttpClient;", "httpClient", "Lcom/huami/device/core/agps/api/bean/AppInfo;", "appInfo", "", "saveFilePath", "<init>", "(Lcom/huami/device/core/agps/api/AgpsHttpClient;Lcom/huami/device/core/agps/api/bean/AppInfo;Ljava/lang/String;)V", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final class HuamiOSStore extends HmGpsStore {
    public HuamiOSStore(@NotNull AgpsHttpClient agpsHttpClient, @NotNull AppInfo appInfo, @NotNull String str) {
        super(agpsHttpClient, appInfo, str);
    }
}
