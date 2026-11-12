package com.huami.devicex.injection.basic;

import android.content.Context;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J$\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH&J\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\bH&¨\u0006\u0010"}, d2 = {"Lcom/huami/devicex/injection/basic/AccountWebExtApi;", "", "", "isForce", "", "updateProfile", "", "httpCode", "", AbstractJSONTokenResponse.RESPONSE, "url", "processResponse", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "xiaomiId", "goBindXiaomiAccountErrorActivity", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface AccountWebExtApi {
    void goBindXiaomiAccountErrorActivity(@Nullable Context context, @NotNull String xiaomiId);

    boolean processResponse(int httpCode, @Nullable String response, @Nullable String url);

    void updateProfile(boolean isForce);
}
