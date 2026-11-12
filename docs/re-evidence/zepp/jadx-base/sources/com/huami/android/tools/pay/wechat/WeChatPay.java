package com.huami.android.tools.pay.wechat;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.notification.statistics.NotificationEvent;
import com.huami.tools.analytics.DbUtils;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/android/tools/pay/wechat/WeChatPay;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/tencent/mm/opensdk/modelpay/PayReq;", "request", "Lcom/huami/android/tools/pay/wechat/WeChatResponse;", "pay", "Lcom/tencent/mm/opensdk/modelbase/BaseResp;", "res", "", "handleWechatRes", "", "orderInfo", "c", "b", StatEvent.MINE_KINGKONG_C_ORDER_VALUE, "a", "", GoogleApiAvailabilityLight.a, "Lcom/huami/android/tools/pay/wechat/WeChatPayResult;", "Lcom/huami/android/tools/pay/wechat/WeChatPayResult;", "result", "Ljava/lang/Object;", "Ljava/lang/Object;", "mLock", "<init>", "()V", "paycompat_release"}, k = 1, mv = {1, 5, 1})
public final class WeChatPay {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static WeChatPayResult result;

    @NotNull
    public static final WeChatPay INSTANCE = new WeChatPay();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Object mLock = new Object();

    private WeChatPay() {
    }

    private final PayReq a(String order) {
        JSONObject jSONObject = new JSONObject(order);
        PayReq payReq = new PayReq();
        String strOptString = jSONObject.optString(NotificationEvent.KEY_PACKAGE);
        if (strOptString == null || m.isBlank(strOptString)) {
            strOptString = "Sign=WXPay";
        }
        payReq.appId = jSONObject.optString("appid");
        payReq.partnerId = jSONObject.optString("partnerid");
        payReq.prepayId = jSONObject.optString("prepayid");
        payReq.nonceStr = jSONObject.optString("noncestr");
        payReq.timeStamp = jSONObject.optString("timestamp");
        payReq.packageValue = strOptString;
        payReq.sign = jSONObject.optString("sign");
        payReq.extData = "app data";
        return payReq;
    }

    private final WeChatResponse b() {
        WeChatPayResult weChatPayResult = result;
        if (weChatPayResult == null) {
            return new WeChatResponse(WeChatResponse.CODE_REQUEST_FAIL, "not handle wechat response", null, 4, null);
        }
        if (weChatPayResult.getErrCode() == 0) {
            return new WeChatResponse(0, "wechat pay success", result);
        }
        return new WeChatResponse(result.getErrCode(), "wechat pay failed, errCode=" + result.getErrCode() + ", detail: https://pay.weixin.qq.com/wiki/doc/api/app/app.php?chapter=9_12", result);
    }

    private final WeChatResponse c(Context context, PayReq request) {
        Object obj = mLock;
        synchronized (obj) {
            IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(context, request.appId);
            if (!iwxapiCreateWXAPI.registerApp(request.appId)) {
                return new WeChatResponse(WeChatResponse.CODE_REGISTER_APP_FAIL, "registerApp 失败，可能是 Appid(" + ((Object) request.appId) + ") 传入有误", null, 4, null);
            }
            if (iwxapiCreateWXAPI.sendReq(request)) {
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return INSTANCE.b();
            }
            return new WeChatResponse(WeChatResponse.CODE_SEND_REQUEST_FAIL, "sendReq 失败，可能是传入参数有误（PayReq = " + request + (char) 65289, null, 4, null);
        }
    }

    private final boolean d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.tencent.mm", 0) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @JvmStatic
    public static final void handleWechatRes(@NotNull BaseResp res) {
        Object obj = mLock;
        synchronized (obj) {
            result = new WeChatPayResult(res.errCode, res.errStr, res.transaction, res.openId);
            obj.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    @NotNull
    public static final WeChatResponse pay(@NotNull Context context, @NotNull PayReq request) {
        WeChatPay weChatPay = INSTANCE;
        return !weChatPay.d(context) ? new WeChatResponse(WeChatResponse.CODE_NOT_INSTALL, "未安装微信", null, 4, null) : weChatPay.c(context, request);
    }

    @JvmStatic
    @NotNull
    public static final WeChatResponse pay(@NotNull Context context, @NotNull String orderInfo) {
        WeChatPay weChatPay = INSTANCE;
        if (!weChatPay.d(context)) {
            return new WeChatResponse(WeChatResponse.CODE_NOT_INSTALL, "未安装微信", null, 4, null);
        }
        return weChatPay.c(context, weChatPay.a(orderInfo));
    }
}
