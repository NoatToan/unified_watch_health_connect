package com.huami.wallet.ui.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.lib.util.ErrorCode;
import com.huami.wallet.ui.R;

/* JADX INFO: loaded from: classes16.dex */
public class ErrorMsgUtils {
    public static String filterErrorMsg(String str, boolean z) {
        return (z || str == null || str.contains("(01") || str.contains("(02")) ? str : "";
    }

    @NonNull
    public static String parseErrorMsg(boolean z, Context context, Resource resource, boolean z2) {
        String str;
        String str2;
        String string = context.getString(z ? R.string.wl_contact_xiaomi : R.string.wl_contact_huami);
        if (context == null || resource == null || (str2 = resource.code) == null) {
            return (resource == null || (str = resource.message) == null) ? "" : str;
        }
        str2.hashCode();
        switch (str2) {
            case "w10000":
                if (!z2) {
                    return context.getString(R.string.wl_loading_fail);
                }
                String str3 = resource.message;
                return str3 == null ? "" : str3;
            case "w10004":
            case "w10005":
            case "w10006":
            case "w10007":
                return String.format(context.getString(R.string.wl_date_error), string);
            case "w10008":
                return String.format(context.getString(R.string.wl_card_expired), string);
            case "w10009":
            case "w10010":
                return String.format(context.getString(R.string.wl_wallet_format_error), string);
            case "w10011":
                return context.getString(R.string.wl_not_ten_multiples);
            case "w10012":
                return context.getString(R.string.wl_format_exceed_card_max_balance, MoneyUtils.formatCentRMB(100000));
            case "w10013":
                return context.getString(R.string.wl_balance_cannot_be_negative);
            case "w10015":
                return context.getString(R.string.wl_network_not_connected);
            case "w10016":
                return context.getString(R.string.wl_card_is_in_black_list);
            case "w10017":
                return context.getString(R.string.wl_card_not_enable);
            default:
                return context.getString(R.string.wl_loading_fail);
        }
    }

    public static String parseOpenCardErrorMsg(Context context, Resource resource) {
        if (resource.status == Status.ERROR) {
            return ErrorCode.CARD_ERROR.equals(resource.code) ? context.getString(R.string.wl_format_open_card_fail, resource.message) : resource.message;
        }
        return null;
    }

    public static String parseRechargeErrorMsg(Context context, Resource resource) {
        if (resource.status == Status.ERROR) {
            return ErrorCode.CARD_ERROR.equals(resource.code) ? context.getString(R.string.wl_format_recharge_fail, resource.message) : resource.message;
        }
        return null;
    }
}
