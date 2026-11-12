package com.huami.passport.net;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class HttpConfig {
    public static final String HEADER_X_REQUEST_ID = "X-Request-Id";
    private static final Map<String, String> mHeaders = new HashMap();

    public static void addHeaders(String str, String str2) {
        mHeaders.put(str, str2);
    }

    public static void appendRequestId(@Nullable Map<String, String> map) {
        if (map == null || map.containsKey("X-Request-Id")) {
            return;
        }
        map.put("X-Request-Id", UUID.randomUUID().toString());
    }

    public static Map<String, String> getHeaders() {
        return mHeaders;
    }
}
