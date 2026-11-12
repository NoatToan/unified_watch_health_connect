package com.xiaomi.hm.health.wxapi;

import android.content.Context;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J(\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH&¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/wxapi/IWeChatAPI;", "", "Landroid/content/Context;", "getContext", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "getWXAPI", "", "target", "", "launchMiniProgram", "appId", "userName", "path", "", "miniProgramType", "Lcom/xiaomi/hm/health/wxapi/WeChatAPIParams;", "weChatAPIParams", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface IWeChatAPI {
    @NotNull
    Context getContext();

    @NotNull
    IWXAPI getWXAPI();

    void launchMiniProgram(@NotNull WeChatAPIParams weChatAPIParams);

    void launchMiniProgram(@NotNull String target);

    void launchMiniProgram(@NotNull String appId, @NotNull String userName, @NotNull String path, int miniProgramType);
}
