package com.xiaomi.hm.health.companion;

import com.huami.watch.companion.config.CloudConfigCallback;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.hm.health.httpkit.RequestConfigKt;
import com.xiaomi.hm.health.webapi.HMWebInit;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/companion/CompanionCloudConfigCallback;", "Lcom/huami/watch/companion/config/CloudConfigCallback;", "", "getUserAgent", "", "Lokhttp3/Interceptor;", "getNetworkInterceptors", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CompanionCloudConfigCallback extends CloudConfigCallback {
    @Override // com.huami.watch.companion.cloud.Cloud.ConfigCallBack
    @NotNull
    public List<Interceptor> getNetworkInterceptors() {
        return RequestConfigKt.getGlobalOkHttpNetworkInterceptors(AIApiConstants.NFC.NAME);
    }

    @Override // com.huami.watch.companion.config.CloudConfigCallback, com.huami.watch.companion.cloud.Cloud.ConfigCallBack
    @NotNull
    public String getUserAgent() {
        return HMWebInit.userAgentInfo();
    }
}
