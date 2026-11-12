package com.huawei.phoneservice.faq.base.util;

import android.text.TextUtils;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes13.dex */
public class k {
    public static boolean b(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence) || "\"\"".equals(charSequence) || Constants.NULL.equals(charSequence)) {
            return true;
        }
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                return false;
            }
        }
        return true;
    }
}
