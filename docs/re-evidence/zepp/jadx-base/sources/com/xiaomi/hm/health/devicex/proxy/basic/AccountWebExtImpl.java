package com.xiaomi.hm.health.devicex.proxy.basic;

import android.content.Context;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.devicex.injection.basic.AccountWebExtApi;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.webapi.HMAccountWebExtAPI;
import com.xiaomi.hm.health.webapi.HMWebInit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J$\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\fH\u0016¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/basic/AccountWebExtImpl;", "Lcom/huami/devicex/injection/basic/AccountWebExtApi;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "xiaomiId", "", "goBindXiaomiAccountErrorActivity", "", "httpCode", AbstractJSONTokenResponse.RESPONSE, "url", "", "processResponse", "isForce", "updateProfile", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AccountWebExtImpl implements AccountWebExtApi {
    @Override // com.huami.devicex.injection.basic.AccountWebExtApi
    public void goBindXiaomiAccountErrorActivity(@Nullable Context context, @NotNull String xiaomiId) {
    }

    @Override // com.huami.devicex.injection.basic.AccountWebExtApi
    public boolean processResponse(int httpCode, @Nullable String response, @Nullable String url) {
        return HMWebInit.processResponse(httpCode, response, url);
    }

    @Override // com.huami.devicex.injection.basic.AccountWebExtApi
    public void updateProfile(boolean isForce) {
        HMAccountWebExtAPI.updateProfile(isForce);
    }
}
