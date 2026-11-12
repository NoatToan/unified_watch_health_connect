package com.ximalaya.ting.android.opensdk.httputil.util;

import android.text.TextUtils;
import com.alipay.sdk.m.s.a;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class Util {
    public static String ConvertMap2HttpParams(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        TreeMap treeMap = new TreeMap();
        treeMap.putAll(map);
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getValue();
            if (str != null) {
                sb.append((String) entry.getKey());
                sb.append(SearchCriteria.EQ);
                sb.append(str);
                sb.append(a.l);
            } else if (entry.getKey() != null) {
                map.remove(entry.getKey());
            }
        }
        if (!map.isEmpty() && sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static JSONObject HttpParameters2Json(Map<String, Object> map) {
        return new JSONObject(map);
    }

    public static Map<String, String> cType(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            map2.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map2;
    }

    public static Map<String, String> encoderName(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.equals(DTransferConstants.SEARCH_KEY) || key.equals(DTransferConstants.TAG_NAME)) {
                String strEncode = null;
                try {
                    strEncode = URLEncoder.encode(entry.getValue(), "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                map.put(key, strEncode);
                break;
            }
        }
        return map;
    }

    public static boolean isEmpty(String str) {
        return (TextUtils.isEmpty(str) || "null".equals(str)) ? false : true;
    }

    public static String readInputStream(InputStream inputStream) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return stringBuffer.toString();
            }
            stringBuffer.append(line.trim());
        }
    }
}
