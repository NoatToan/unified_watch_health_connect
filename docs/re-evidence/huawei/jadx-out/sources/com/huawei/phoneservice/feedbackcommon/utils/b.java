package com.huawei.phoneservice.feedbackcommon.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes13.dex */
public class b {
    private SortedMap<String, String> d = new TreeMap();

    public String toString() {
        StringBuilder sb = new StringBuilder(512);
        for (Map.Entry<String, String> entry : this.d.entrySet()) {
            String key = entry.getKey();
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(key);
            sb.append("=");
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    public String e(String str) throws UnsupportedEncodingException {
        String str2 = this.d.get(URLEncoder.encode(str, "UTF-8"));
        if (str2 == null) {
            return null;
        }
        return URLDecoder.decode(str2, "UTF-8");
    }

    public b(String str) {
        if (str == null) {
            return;
        }
        for (String str2 : str.split("&")) {
            int iIndexOf = str2.indexOf("=");
            this.d.put(str2.substring(0, iIndexOf), str2.substring(iIndexOf + 1));
        }
    }
}
