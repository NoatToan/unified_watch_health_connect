package com.huami.watch.companion.util;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes16.dex */
public final class RegexUtil {
    private static final String a = "^[\\w\\-\\.]+@[\\w\\-]+(\\.\\w+)+$";

    public static boolean isEmailValid(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        return Pattern.compile(a).matcher(str).matches();
    }
}
