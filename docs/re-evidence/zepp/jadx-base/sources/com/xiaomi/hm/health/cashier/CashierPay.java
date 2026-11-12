package com.xiaomi.hm.health.cashier;

import android.app.Activity;
import android.content.Context;
import com.huami.android.tools.pay.ali.AliPay;
import com.huami.android.tools.pay.ali.AliPayResponse;
import com.huami.android.tools.pay.wechat.WeChatPay;
import com.huami.android.tools.pay.wechat.WeChatResponse;
import com.xiaomi.hm.health.cashier.model.CashierPayResponse;

/* JADX INFO: loaded from: classes20.dex */
public class CashierPay {
    public static final int ERROR_COMM = -1;
    public static final int ERROR_DOUBLE_PAY = -104;
    public static final int ERROR_NETWORK = -102;
    public static final int ERROR_OK = 0;
    public static final int ERROR_ORDER_PAY = -103;
    public static final int ERROR_OTHER = -106;
    public static final int ERROR_PAY_TIMEOUT = -3;
    public static final int ERROR_UNINSTALL = -101;
    public static final int ERROR_UNKNOWN = -105;
    public static final int ERROR_USER_CANCEL = -2;

    private static int a(String resultStatus) {
        resultStatus.hashCode();
        switch (resultStatus) {
            case "4000":
                return -103;
            case "5000":
                return -104;
            case "6001":
                return -2;
            case "6002":
                return -102;
            case "8000":
                return -105;
            case "9000":
                return 0;
            default:
                return ERROR_OTHER;
        }
    }

    public static CashierPayResponse aliPay(final Activity activity, final String payInfo) {
        AliPayResponse aliPayResponsePay = new AliPay().pay(activity, payInfo);
        return new CashierPayResponse(aliPayResponsePay.isSuccessful(), a(aliPayResponsePay.getCode()));
    }

    private static int b(int resultStatus) {
        if (resultStatus == -2) {
            return -2;
        }
        if (resultStatus == -1) {
            return -1;
        }
        if (resultStatus != 0) {
            return resultStatus != 1048577 ? -105 : -101;
        }
        return 0;
    }

    public static String getMessage(final int code) {
        if (code == -3) {
            return "ERROR_PAY_TIMEOUT";
        }
        if (code == -2) {
            return "ERROR_USER_CANCEL";
        }
        if (code == -1) {
            return "ERROR_COMM";
        }
        switch (code) {
            case -105:
                return "ERROR_UNKNOWN";
            case -104:
                return "ERROR_DOUBLE_PAY";
            case -103:
                return "ERROR_ORDER_PAY";
            case -102:
                return "ERROR_NETWORK";
            case -101:
                return "ERROR_UNINSTALL";
            default:
                return "ERROR_OTHER";
        }
    }

    public static CashierPayResponse wechatPay(final Context context, final String payInfo) {
        WeChatResponse weChatResponsePay = WeChatPay.pay(context, payInfo);
        return new CashierPayResponse(weChatResponsePay.isSuccessful(), weChatResponsePay.getData() != null ? b(weChatResponsePay.getData().getErrCode()) : b(weChatResponsePay.getCode()));
    }
}
