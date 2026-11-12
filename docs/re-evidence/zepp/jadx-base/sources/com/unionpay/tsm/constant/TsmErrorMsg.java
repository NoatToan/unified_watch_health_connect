package com.unionpay.tsm.constant;

import android.text.TextUtils;
import com.huami.watch.companion.nfc.unionpay.R;

/* JADX INFO: loaded from: classes18.dex */
public enum TsmErrorMsg {
    NEED_NET_WORK(R.string.wl_need_net_work),
    NEED_CONNECT_DEVICE(R.string.wl_need_device),
    CARD_BIN_ERROR(R.string.wl_bank_card_bin_error),
    CARD_NOT_SUPPORT(R.string.wl_bank_card_not_support),
    CARD_ALREADY_ADD(R.string.wl_bank_card_repeat_add),
    CARD_OVER_LIMIT(R.string.wl_bank_card_over_limit),
    CARD_DOWNLOAD_ERROR(R.string.wl_bank_card_download_error),
    CARD_DOWNLOAD_ERROR_WITH_DELETE(R.string.wl_bank_card_download_error_with_delete);

    public int msg;

    TsmErrorMsg(int i) {
        this.msg = i;
    }

    public static TsmErrorMsg codeOf(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals(String.valueOf(-100))) {
            return NEED_NET_WORK;
        }
        if (str.equals(String.valueOf(-101))) {
            return NEED_CONNECT_DEVICE;
        }
        if (str.endsWith(String.valueOf(TsmResultCode.ERROR_CHECK_CARD_BIN_FAIL))) {
            return CARD_BIN_ERROR;
        }
        if (str.endsWith(String.valueOf(TsmResultCode.ERROR_CARD_NOT_SUPPORT))) {
            return CARD_NOT_SUPPORT;
        }
        if (str.endsWith(String.valueOf(TsmResultCode.ERROR_CARD_REPEAT_ADD))) {
            return CARD_ALREADY_ADD;
        }
        if (str.endsWith(String.valueOf(TsmResultCode.ERROR_CARD_OVER_LIMIT))) {
            return CARD_OVER_LIMIT;
        }
        if (str.equals(String.valueOf(-102))) {
            return CARD_DOWNLOAD_ERROR_WITH_DELETE;
        }
        if (str.startsWith(String.valueOf(TsmResultCode.ERROR_CARD_DOWNLOAD_FAIL))) {
            return CARD_DOWNLOAD_ERROR;
        }
        if (str.equals(String.valueOf(TsmResultCode.ERROR_CARD_NUM_INCORRECT))) {
            return CARD_BIN_ERROR;
        }
        return null;
    }
}
