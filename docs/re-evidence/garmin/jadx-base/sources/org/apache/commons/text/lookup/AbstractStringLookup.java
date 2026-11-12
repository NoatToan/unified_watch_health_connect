package org.apache.commons.text.lookup;

import i3.e5;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractStringLookup implements StringLookup {
    protected static final char SPLIT_CH = ':';
    protected static final String SPLIT_STR = String.valueOf(':');

    public static String toLookupKey(String str, String str2) {
        return toLookupKey(str, SPLIT_STR, str2);
    }

    @Deprecated
    public String substringAfter(String str, char c14) {
        return StringUtils.substringAfter(str, c14);
    }

    @Deprecated
    public String substringAfterLast(String str, char c14) {
        return StringUtils.substringAfterLast(str, c14);
    }

    @Deprecated
    public String substringAfter(String str, String str2) {
        return StringUtils.substringAfter(str, str2);
    }

    public static String toLookupKey(String str, String str2, String str3) {
        return e5.g(str, str2, str3);
    }
}
