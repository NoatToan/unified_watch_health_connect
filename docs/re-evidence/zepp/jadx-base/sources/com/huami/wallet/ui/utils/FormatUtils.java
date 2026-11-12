package com.huami.wallet.ui.utils;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes16.dex */
public class FormatUtils {
    private static final String a = "^[\\w\\-\\.]+@[\\w\\-]+(\\.\\w+)+$";

    public static boolean isEmailFormat(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile(a).matcher(str).matches();
    }
}
