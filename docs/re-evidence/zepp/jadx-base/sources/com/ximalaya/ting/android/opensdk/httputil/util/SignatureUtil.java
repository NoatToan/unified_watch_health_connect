package com.ximalaya.ting.android.opensdk.httputil.util;

import com.alipay.sdk.m.s.a;
import java.util.Map;
import java.util.TreeMap;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes22.dex */
public class SignatureUtil {
    public static String caculateSignature(String str, Map<String, String> map) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            stringBuffer.append(entry.getKey());
            stringBuffer.append(SearchCriteria.EQ);
            stringBuffer.append(entry.getValue());
            stringBuffer.append(a.l);
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        try {
            return CrypterUtil.hmacSHA1ToStr(BASE64Encoder.encode(stringBuffer.toString()), str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String generateSignature(String str, Map<String, String> map) {
        TreeMap treeMap = new TreeMap();
        treeMap.putAll(map);
        return caculateSignature(str, treeMap);
    }
}
