package com.xiaomi.ai.domain.mobileapp.util;

import defpackage.mlo;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class Tool {
    public static double calculateStringSimilarity(String str, String str2) {
        return 1.0d - ((((double) mlo.b(str, str2)) * 1.0d) / ((double) Math.max(1, Math.max(str.length(), str2.length()))));
    }

    public static String getOrDefault(Map<String, String> map, String str, String str2) {
        return (map == null || !map.containsKey(str)) ? str2 : map.get(str);
    }
}
