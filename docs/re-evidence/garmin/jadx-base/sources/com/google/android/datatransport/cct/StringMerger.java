package com.google.android.datatransport.cct;

import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public final class StringMerger {
    public static String mergeStrings(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            h.s("Invalid input received");
            return null;
        }
        StringBuilder sb3 = new StringBuilder(str2.length() + str.length());
        for (int i14 = 0; i14 < str.length(); i14++) {
            sb3.append(str.charAt(i14));
            if (str2.length() > i14) {
                sb3.append(str2.charAt(i14));
            }
        }
        return sb3.toString();
    }
}
