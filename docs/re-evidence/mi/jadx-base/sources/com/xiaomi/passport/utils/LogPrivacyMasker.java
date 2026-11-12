package com.xiaomi.passport.utils;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public class LogPrivacyMasker {
    public static String mask(String str) {
        return TextUtils.isEmpty(str) ? "[empty]" : String.format("[%d]@%s", Integer.valueOf(str.length()), Integer.toHexString(str.hashCode()));
    }
}
