package com.huami.android.tools.pay.ali;

import android.app.Activity;
import com.alipay.sdk.app.PayTask;
import com.alipay.sdk.m.u.l;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/huami/android/tools/pay/ali/AliPay;", "", "", "code", "a", "Landroid/app/Activity;", "activity", "orderInfo", "Lcom/huami/android/tools/pay/ali/AliPayResponse;", "pay", "<init>", "()V", "paycompat_release"}, k = 1, mv = {1, 5, 1})
public final class AliPay {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x005c A[ORIG_RETURN, RETURN] */
    private final String a(String code) {
        switch (code) {
            case "4000":
                return "订单支付失败";
            case "5000":
                return "重复请求";
            case "6001":
                return "用户中途取消";
            case "6002":
                return "网络连接出错";
            case "6004":
                return "支付结果未知（有可能已经支付成功），请查询商户订单列表中订单的支付状态";
            case "8000":
                return "正在处理中，支付结果未知（有可能已经支付成功），请查询商户订单列表中订单的支付状态";
            case "9000":
                return "订单支付成功";
            default:
                return "unknown, detail: https://docs.open.alipay.com/59/103671 or https://docs.open.alipay.com/204/105302";
        }
    }

    @NotNull
    public final AliPayResponse pay(@NotNull Activity activity, @NotNull String orderInfo) {
        String str = new PayTask(activity).payV2(orderInfo, true).get(l.a);
        if (str == null) {
            str = "unknown";
        }
        return new AliPayResponse(str, a(str));
    }
}
