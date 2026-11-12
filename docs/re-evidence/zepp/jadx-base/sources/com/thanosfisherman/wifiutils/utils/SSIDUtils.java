package com.thanosfisherman.wifiutils.utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
public class SSIDUtils {
    @NonNull
    public static String convertToQuotedString(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length() - 1;
        if (length < 0) {
            return str;
        }
        if (str.charAt(0) == '\"' && str.charAt(length) == '\"') {
            return str;
        }
        return "\"" + str + "\"";
    }
}
