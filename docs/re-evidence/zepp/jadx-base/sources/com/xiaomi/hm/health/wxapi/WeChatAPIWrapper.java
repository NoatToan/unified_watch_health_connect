package com.xiaomi.hm.health.wxapi;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0016\u0010\u0011\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/wxapi/WeChatAPIWrapper;", "Lcom/xiaomi/hm/health/wxapi/IWeChatAPI;", "Landroid/content/Context;", "getContext", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "getWXAPI", "", "target", "", "launchMiniProgram", "appId", "userName", "path", "", "miniProgramType", "a", "Lcom/xiaomi/hm/health/wxapi/IWeChatAPI;", "weChatImpl", DbUtils.Const.Table.CONTEXT, "<init>", "(Lcom/xiaomi/hm/health/wxapi/IWeChatAPI;Landroid/content/Context;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public abstract class WeChatAPIWrapper implements IWeChatAPI {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IWeChatAPI weChatImpl;

    public WeChatAPIWrapper(@NotNull IWeChatAPI iWeChatAPI, @NotNull Context context) {
        this.weChatImpl = iWeChatAPI;
    }

    @Override // com.xiaomi.hm.health.wxapi.IWeChatAPI
    @NotNull
    public Context getContext() {
        return this.weChatImpl.getContext();
    }

    @Override // com.xiaomi.hm.health.wxapi.IWeChatAPI
    @NotNull
    public IWXAPI getWXAPI() {
        return this.weChatImpl.getWXAPI();
    }

    @Override // com.xiaomi.hm.health.wxapi.IWeChatAPI
    public void launchMiniProgram(@NotNull String target) {
        this.weChatImpl.launchMiniProgram(target);
    }

    @Override // com.xiaomi.hm.health.wxapi.IWeChatAPI
    public void launchMiniProgram(@NotNull String appId, @NotNull String userName, @NotNull String path, int miniProgramType) {
        this.weChatImpl.launchMiniProgram(appId, userName, path, miniProgramType);
    }
}
