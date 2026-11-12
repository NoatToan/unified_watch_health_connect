package com.xiaomi.smarthome.core.server.internal.util;

import android.text.TextUtils;
import com.xiaomi.smarthome.core.entity.net.KeyValuePair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes10.dex */
public class KeyValuePairUtil {
    private static final String NAME_VALUE_SEPARATOR = "=";
    private static final String PARAMETER_SEPARATOR = "&";

    private static String encode(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static String format(List<? extends KeyValuePair> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (KeyValuePair keyValuePair : list) {
            String strEncode = encode(keyValuePair.getKey(), str);
            String value = keyValuePair.getValue();
            String strEncode2 = value != null ? encode(value, str) : "";
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(strEncode);
            sb.append(NAME_VALUE_SEPARATOR);
            sb.append(strEncode2);
        }
        return sb.toString();
    }

    public static Headers getHeaders(List<KeyValuePair> list) {
        if (list == null) {
            return null;
        }
        Headers.Builder builder = new Headers.Builder();
        for (KeyValuePair keyValuePair : list) {
            builder.add(keyValuePair.getKey(), keyValuePair.getValue());
        }
        return builder.build();
    }

    public static String getQueryString(List<KeyValuePair> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            for (KeyValuePair keyValuePair : list) {
                String key = keyValuePair.getKey();
                String value = keyValuePair.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    stringBuffer.append("&" + URLEncoder.encode(key, "UTF-8") + NAME_VALUE_SEPARATOR + URLEncoder.encode(value, "UTF-8"));
                }
            }
            String string = stringBuffer.toString();
            if (!TextUtils.isEmpty(string)) {
                string = string.replaceFirst("&", "?");
            }
            return string;
        } catch (Exception unused) {
            return null;
        }
    }

    public static RequestBody getRequestBody(List<KeyValuePair> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        FormBody.Builder builder = new FormBody.Builder();
        for (KeyValuePair keyValuePair : list) {
            String key = keyValuePair.getKey();
            String value = keyValuePair.getValue();
            if (!TextUtils.isEmpty(key) && value != null) {
                builder.add(key, value);
            }
        }
        return builder.build();
    }

    public static String getUrlWithQueryString(String str, List<KeyValuePair> list) {
        if (list == null || list.isEmpty()) {
            return str;
        }
        String str2 = format(list, "UTF-8");
        if (str.contains("?")) {
            return str + "&" + str2;
        }
        return str + "?" + str2;
    }
}
