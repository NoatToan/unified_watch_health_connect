package com.google.zxing.client.android;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.zxing.DecodeHintType;
import io.netty.util.internal.StringUtil;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class DecodeHintManager {
    private static final String a = "DecodeHintManager";
    private static final Pattern b = Pattern.compile(",");

    private DecodeHintManager() {
    }

    public static Map<DecodeHintType, ?> a(Uri uri) {
        String strSubstring;
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null || encodedQuery.isEmpty()) {
            return null;
        }
        Map<String, String> mapB = b(encodedQuery);
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        for (DecodeHintType decodeHintType : DecodeHintType.values()) {
            if (decodeHintType != DecodeHintType.CHARACTER_SET && decodeHintType != DecodeHintType.NEED_RESULT_POINT_CALLBACK && decodeHintType != DecodeHintType.POSSIBLE_FORMATS && (strSubstring = mapB.get(decodeHintType.name())) != null) {
                if (decodeHintType.getValueType().equals(Object.class)) {
                    enumMap.put(decodeHintType, strSubstring);
                } else if (decodeHintType.getValueType().equals(Void.class)) {
                    enumMap.put(decodeHintType, Boolean.TRUE);
                } else if (decodeHintType.getValueType().equals(String.class)) {
                    enumMap.put(decodeHintType, strSubstring);
                } else if (decodeHintType.getValueType().equals(Boolean.class)) {
                    if (strSubstring.isEmpty()) {
                        enumMap.put(decodeHintType, Boolean.TRUE);
                    } else if ("0".equals(strSubstring) || "false".equalsIgnoreCase(strSubstring) || "no".equalsIgnoreCase(strSubstring)) {
                        enumMap.put(decodeHintType, Boolean.FALSE);
                    } else {
                        enumMap.put(decodeHintType, Boolean.TRUE);
                    }
                } else if (decodeHintType.getValueType().equals(int[].class)) {
                    if (!strSubstring.isEmpty() && strSubstring.charAt(strSubstring.length() - 1) == ',') {
                        strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                    }
                    String[] strArrSplit = b.split(strSubstring);
                    int[] iArr = new int[strArrSplit.length];
                    for (int i = 0; i < strArrSplit.length; i++) {
                        try {
                            iArr[i] = Integer.parseInt(strArrSplit[i]);
                        } catch (NumberFormatException unused) {
                            Log.w(a, "Skipping array of integers hint " + decodeHintType + " due to invalid numeric value: '" + strArrSplit[i] + '\'');
                            iArr = null;
                        }
                    }
                    if (iArr != null) {
                        enumMap.put(decodeHintType, iArr);
                    }
                } else {
                    Log.w(a, "Unsupported hint type '" + decodeHintType + "' of type " + decodeHintType.getValueType());
                }
            }
        }
        Log.i(a, "Hints from the URI: " + enumMap);
        return enumMap;
    }

    private static Map<String, String> b(String str) {
        String strDecode;
        HashMap map = new HashMap();
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '&') {
                i++;
            } else {
                int iIndexOf = str.indexOf(38, i);
                int iIndexOf2 = str.indexOf(61, i);
                String strDecode2 = "";
                if (iIndexOf < 0) {
                    if (iIndexOf2 < 0) {
                        strDecode = Uri.decode(str.substring(i).replace('+', StringUtil.SPACE));
                    } else {
                        String strDecode3 = Uri.decode(str.substring(i, iIndexOf2).replace('+', StringUtil.SPACE));
                        strDecode2 = Uri.decode(str.substring(iIndexOf2 + 1).replace('+', StringUtil.SPACE));
                        strDecode = strDecode3;
                    }
                    if (!map.containsKey(strDecode)) {
                        map.put(strDecode, strDecode2);
                        break;
                    }
                    break;
                }
                if (iIndexOf2 < 0 || iIndexOf2 > iIndexOf) {
                    String strDecode4 = Uri.decode(str.substring(i, iIndexOf).replace('+', StringUtil.SPACE));
                    if (!map.containsKey(strDecode4)) {
                        map.put(strDecode4, "");
                    }
                } else {
                    String strDecode5 = Uri.decode(str.substring(i, iIndexOf2).replace('+', StringUtil.SPACE));
                    String strDecode6 = Uri.decode(str.substring(iIndexOf2 + 1, iIndexOf).replace('+', StringUtil.SPACE));
                    if (!map.containsKey(strDecode5)) {
                        map.put(strDecode5, strDecode6);
                    }
                }
                i = iIndexOf + 1;
            }
        }
        return map;
    }

    public static Map<DecodeHintType, Object> parseDecodeHints(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        for (DecodeHintType decodeHintType : DecodeHintType.values()) {
            if (decodeHintType != DecodeHintType.CHARACTER_SET && decodeHintType != DecodeHintType.NEED_RESULT_POINT_CALLBACK && decodeHintType != DecodeHintType.POSSIBLE_FORMATS) {
                String strName = decodeHintType.name();
                if (extras.containsKey(strName)) {
                    if (decodeHintType.getValueType().equals(Void.class)) {
                        enumMap.put(decodeHintType, Boolean.TRUE);
                    } else {
                        Object obj = extras.get(strName);
                        if (decodeHintType.getValueType().isInstance(obj)) {
                            enumMap.put(decodeHintType, obj);
                        } else {
                            Log.w(a, "Ignoring hint " + decodeHintType + " because it is not assignable from " + obj);
                        }
                    }
                }
            }
        }
        Log.i(a, "Hints from the Intent: " + enumMap);
        return enumMap;
    }
}
