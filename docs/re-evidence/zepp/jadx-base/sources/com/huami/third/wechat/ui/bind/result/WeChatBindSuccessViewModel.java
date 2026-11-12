package com.huami.third.wechat.ui.bind.result;

import android.content.Context;
import androidx.p008lifecycle.ViewModel;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.huami.third.wechat.ui.AnalyzeUtilsKt;
import com.huami.tools.analytics.DbUtils;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Lcom/huami/third/wechat/ui/bind/result/WeChatBindSuccessViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "sdkDeviceID", SDKConstants.PARAM_APP_ID, "", "unBindWeChatDevice", "result", "", "checkBindSuccess", "<init>", "()V", "wechat-ui_release"}, k = 1, mv = {1, 5, 1})
public final class WeChatBindSuccessViewModel extends ViewModel {
    public final boolean checkBindSuccess(@NotNull String result) {
        JsonArray asJsonArray = new JsonParser().parse(result).getAsJsonObject().getAsJsonArray("failList");
        return asJsonArray == null || asJsonArray.size() == 0;
    }

    public final void unBindWeChatDevice(@NotNull Context context, @NotNull String sdkDeviceID, @NotNull String appID) {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(context, appID);
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(sdkDeviceID);
        WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
        req.userName = WeChatBindSuccessFragment.WECHAT_USER_NAME;
        req.path = WeChatBindSuccessFragment.WECHAT_DELETE_DEVICE_PATH_PREFIX + jsonArray;
        req.miniprogramType = 0;
        iwxapiCreateWXAPI.sendReq(req);
        AnalyzeUtilsKt.analytics$default(AnalyzeUtilsKt.EVENT_ENTER_WECHAT_SPORT_DELETE, null, 2, null);
    }
}
