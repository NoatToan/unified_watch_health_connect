package com.xiaomi.hm.health.webapi;

import com.huami.network.base.model.HMHttpResponseData;
import com.huami.pai.web.HttpInteraction;
import com.huami.pai.web.Response;
import com.xiaomi.hm.health.healthdata.api.WebUtils;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/webapi/PaiHttpInteraction;", "Lcom/huami/pai/web/HttpInteraction;", "", "url", "", "params", "Lcom/huami/pai/web/Response;", "get", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PaiHttpInteraction implements HttpInteraction {
    @Override // com.huami.pai.web.HttpInteraction
    @NotNull
    public Response get(@NotNull String url, @NotNull Map<String, String> params) {
        HMHttpResponseData hMHttpResponseData = WebUtils.INSTANCE.get(url, params);
        return new Response(hMHttpResponseData.getStatusCode(), hMHttpResponseData.getResponseString(), hMHttpResponseData.getError());
    }
}
