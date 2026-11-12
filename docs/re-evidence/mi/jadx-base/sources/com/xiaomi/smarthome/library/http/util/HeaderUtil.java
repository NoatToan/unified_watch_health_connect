package com.xiaomi.smarthome.library.http.util;

import java.util.Map;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes2.dex */
public class HeaderUtil {
    public static void checkName(String str) throws Exception {
        if (str == null) {
            throw new IllegalArgumentException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127) {
                throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
            }
        }
    }

    public static void checkValue(String str) throws Exception {
        if (str == null) {
            throw new IllegalArgumentException("value == null");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127) {
                throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
            }
        }
    }

    public static Headers getHeaders(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return Headers.of(map);
    }
}
