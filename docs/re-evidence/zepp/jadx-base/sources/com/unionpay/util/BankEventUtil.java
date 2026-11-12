package com.unionpay.util;

import android.text.TextUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public class BankEventUtil {
    public static final String BANK_DETAIL_OPERATION_FAQ = "FAQ";
    public static final String UNIONPAY_DELETE_FAIL = "NFC_Union_DeleteCard_Failure";
    public static final String UNIONPAY_DELETE_SUCCESS = "NFC_Union_DeleteCard_Success";
    public static final String UNIONPAY_DETAIL_OPERATION_ADD = "Add";
    public static final String UNIONPAY_DETAIL_OPERATION_DELETE = "Delete";
    public static final String UNIONPAY_DETAIL_OUT = "NFC_UnionDetail_Out";
    public static final String UNIONPAY_ENTER = "NFC_Union_ViewNum";
    public static final String UNIONPAY_ISSUE_FAIL = "NFC_Union_AddCard_Failure";
    public static final String UNIONPAY_ISSUE_SUCCESS = "NFC_Union_AddCard_Success";
    private static final String a = "Bank_Detail_Operation";
    private static final String b = "DeviceSource";

    public static void recordBankEvent(String str, String str2) {
        recordBankEvent(str, str2, null);
    }

    public static void recordBankEvent(String str, String str2, String str3) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(str);
        HashMap map = new HashMap(2);
        map.put("DeviceSource", str2);
        if (!TextUtils.isEmpty(str3)) {
            map.put(a, str3);
        }
        countEventBuilder.putExtras(map);
        Analytics.recordEvent(countEventBuilder);
    }
}
