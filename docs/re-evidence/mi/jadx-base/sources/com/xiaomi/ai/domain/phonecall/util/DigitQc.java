package com.xiaomi.ai.domain.phonecall.util;

import com.xiaomi.ai.nlp.contact.common.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class DigitQc {
    private static final Map<String, String> PINYIN_DIGIT_MAP;

    static {
        HashMap map = new HashMap();
        PINYIN_DIGIT_MAP = map;
        map.put("ling", "零");
        map.put("dong", "零");
        map.put("yi", "一");
        map.put("yao", "一");
        map.put("eer", "二");
        map.put("sang", "三");
        map.put("san", "三");
        map.put("si", "四");
        map.put("wu", "五");
        map.put("liu", "六");
        map.put("qi", "七");
        map.put("ba", "八");
        map.put("jiu", "九");
    }

    public static String getQc(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 1;
            String strSubstring = str.substring(i, i2);
            Iterator<a.C0349a> it = a.b().e(strSubstring).iterator();
            while (it.hasNext()) {
                String strC = it.next().c();
                Map<String, String> map = PINYIN_DIGIT_MAP;
                if (map.containsKey(strC)) {
                    strSubstring = map.get(strC);
                    break;
                }
            }
            sb.append(strSubstring);
            i = i2;
        }
        return sb.toString();
    }
}
