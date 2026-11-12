package com.xiaomi.hm.health.wxapi;

import android.content.Context;
import android.widget.Toast;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.util.ThirdPartUtil;
import com.huami.watch.hmwatchmanager.R;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\bR\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/wxapi/WeChatAPI;", "Lcom/xiaomi/hm/health/wxapi/IWeChatAPI;", "Landroid/content/Context;", "getContext", "", "target", "", "launchMiniProgram", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "getWXAPI", "appId", "userName", "path", "", "miniProgramType", "Lcom/xiaomi/hm/health/wxapi/WeChatAPIParams;", "weChatAPIParams", "wxApi", "", "checkLoadWeChat", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public class WeChatAPI implements IWeChatAPI {

    @NotNull
    public static final String WECHAT_EMERGENCY_PATH = "pages/project/medical-id/index/index";

    @NotNull
    public static final String WECHAT_EMERGENCY_USERNAME = "gh_0941d3c980de";

    @NotNull
    private static final String b = "WeChatAPI";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "launchMiniProgram exception";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, int i) {
            super(0);
            this.a = str;
            this.b = str2;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "launchMiniProgram userName：" + this.a + ",path:" + this.b + ",miniProgramType:" + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ WeChatAPIParams a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(WeChatAPIParams weChatAPIParams) {
            super(0);
            this.a = weChatAPIParams;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            WeChatAPIParams weChatAPIParams = this.a;
            return "launchMiniProgram userName：" + weChatAPIParams + ".userName,path:" + weChatAPIParams + ".path,miniProgramType:" + weChatAPIParams + ".miniprogramType";
        }
    }

    public WeChatAPI(@NotNull Context context) {
        this.context = context;
    }

    public final boolean checkLoadWeChat(@NotNull IWXAPI wxApi) {
        if (!wxApi.isWXAppInstalled()) {
            Toast.makeText(this.context.getApplicationContext(), this.context.getString(R.string.install_weixin_tips), 0).show();
            return false;
        }
        if (wxApi.openWXApp()) {
            return true;
        }
        Toast.makeText(this.context.getApplicationContext(), this.context.getString(R.string.bind_weixin_failed), 0).show();
        return false;
    }

    @Override // com.xiaomi.hm.health.wxapi.IWeChatAPI
    @NotNull
    public Context getContext() {
        return this.context;
    }

    @Override // com.xiaomi.hm.health.wxapi.IWeChatAPI
    @NotNull
    public IWXAPI getWXAPI() {
        return WXAPIFactory.createWXAPI(this.context.getApplicationContext(), ThirdPartUtil.getWeixinId());
    }

    @Override // com.xiaomi.hm.health.wxapi.IWeChatAPI
    public void launchMiniProgram(@NotNull String target) {
        try {
            JSONObject jSONObject = new JSONObject(target);
            String strOptString = jSONObject.optString("userName");
            launchMiniProgram(new WeChatAPIParams.Builder().appid(ThirdPartUtil.getWeixinId()).userName(strOptString).path(jSONObject.optString("path")).miniprogramType(jSONObject.optInt("miniprogramType")).build());
        } catch (Exception e) {
            HMLog.error$default(b, null, e, a.a, 2, null);
        }
    }

    @Override // com.xiaomi.hm.health.wxapi.IWeChatAPI
    public void launchMiniProgram(@NotNull String appId, @NotNull String userName, @NotNull String path, int miniProgramType) {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this.context.getApplicationContext(), appId);
        if (checkLoadWeChat(iwxapiCreateWXAPI)) {
            WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
            req.userName = userName;
            req.path = path;
            req.miniprogramType = miniProgramType;
            iwxapiCreateWXAPI.sendReq(req);
            HMLog.info(b, new b(userName, path, miniProgramType));
        }
    }

    @Override // com.xiaomi.hm.health.wxapi.IWeChatAPI
    public void launchMiniProgram(@NotNull WeChatAPIParams weChatAPIParams) {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this.context.getApplicationContext(), weChatAPIParams.getAppid());
        if (checkLoadWeChat(iwxapiCreateWXAPI)) {
            WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
            req.userName = weChatAPIParams.getUserName();
            req.path = weChatAPIParams.getPath();
            req.miniprogramType = weChatAPIParams.getMiniprogramType();
            iwxapiCreateWXAPI.sendReq(req);
            HMLog.info(b, new c(weChatAPIParams));
        }
    }
}
