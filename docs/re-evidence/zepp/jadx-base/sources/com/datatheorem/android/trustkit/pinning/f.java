package com.datatheorem.android.trustkit.pinning;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class f {
    private static final Pattern a = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static boolean a(String str) {
        return a.matcher(str).matches();
    }
}
