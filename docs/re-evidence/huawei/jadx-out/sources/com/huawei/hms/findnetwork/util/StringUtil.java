package com.huawei.hms.findnetwork.util;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes33.dex */
public class StringUtil {
    public static String wrapQuotes(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            return str;
        }
        if (!str.startsWith("\"")) {
            str = "\"" + str;
        }
        if (str.endsWith("\"")) {
            return str;
        }
        return str + '\"';
    }
}
