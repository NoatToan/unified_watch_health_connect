package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
final class zzf {
    private static final Pattern zza = Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    public static String zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = zza.matcher(str);
        StringBuilder sb3 = null;
        int iEnd = 0;
        while (matcher.find()) {
            if (sb3 == null) {
                sb3 = new StringBuilder();
            }
            int iStart = matcher.start();
            int i14 = iStart;
            while (i14 >= 0 && str.charAt(i14) == '\\') {
                i14--;
            }
            if ((iStart - i14) % 2 != 0) {
                int i15 = Integer.parseInt(matcher.group().substring(2), 16);
                sb3.append((CharSequence) str, iEnd, matcher.start());
                if (i15 == 92) {
                    sb3.append("\\\\");
                } else {
                    sb3.append(Character.toChars(i15));
                }
                iEnd = matcher.end();
            }
        }
        if (sb3 == null) {
            return str;
        }
        if (iEnd < matcher.regionEnd()) {
            sb3.append((CharSequence) str, iEnd, matcher.regionEnd());
        }
        return sb3.toString();
    }
}
