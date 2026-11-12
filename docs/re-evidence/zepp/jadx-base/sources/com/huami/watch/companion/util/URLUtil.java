package com.huami.watch.companion.util;

import android.text.TextUtils;
import com.alipay.sdk.m.s.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class URLUtil {
    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.trim().toLowerCase().split("[?]");
        if (strArrSplit.length <= 1 || strArrSplit[1] == null) {
            return null;
        }
        return strArrSplit[1];
    }

    public static String appendParams(LinkedHashMap<String, String> linkedHashMap) {
        if (linkedHashMap == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, String> next = it2.next();
            sb.append(next.getKey());
            sb.append(SearchCriteria.EQ);
            sb.append(next.getValue());
            if (it2.hasNext()) {
                sb.append(a.l);
            }
        }
        return sb.toString();
    }

    public static Map<String, String> getRequestParamMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strA = a(str);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str2 : strA.split("[&]")) {
            String[] strArrSplit = str2.split("[=]");
            if (strArrSplit.length > 1) {
                if (TextUtils.isEmpty(strArrSplit[1])) {
                    map.put(strArrSplit[0], "");
                } else {
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
        return map;
    }
}
