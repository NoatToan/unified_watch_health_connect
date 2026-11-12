package com.ximalaya.ting.paydecrypt;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.alipay.sdk.m.s.a;
import com.xiaomi.mipush.sdk.Constants;
import com.ximalaya.ting.android.opensdk.util.EncryptUtilForSDK;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes22.dex */
public class PayUtil {
    public static final String IS_CHARGE = "is_charge";
    private static final String a = "file_id";
    private static final String b = "ep";
    private static final String c = "sample_length";
    private static final String d = "api_version";
    private static final String e = "domain";
    private static final String f = "duration";
    private static final char[] g = "0123456789abcdef".toCharArray();
    private static String h;
    private static String i;
    private static String j;

    private static String a(Map<String, String> map) {
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

    private static String b(String str, Map<String, String> map) {
        byte[] bArrDecryptByKey2;
        String strTrim;
        if (map == null) {
            Log.e("getAntiLeechUrl", "getAntiLeechUrl specificParams == null(getAntiLeechUrl func)");
            return null;
        }
        String strRemove = map.remove("file_id");
        String strRemove2 = map.remove(b);
        map.remove(c);
        String strRemove3 = map.remove("duration");
        String strRemove4 = map.remove("api_version");
        if (TextUtils.isEmpty(strRemove)) {
            Log.e("getAntiLeechUrl", "getAntiLeechUrl specificParams fileId is null");
            return null;
        }
        try {
            bArrDecryptByKey2 = EncryptUtilForSDK.getInstance().decryptByKey2(Base64.decode(strRemove, 0), str);
        } catch (Exception e2) {
            e2.printStackTrace();
            bArrDecryptByKey2 = null;
        }
        if (bArrDecryptByKey2 == null) {
            return null;
        }
        try {
            strTrim = new String(bArrDecryptByKey2, "UTF-8").trim();
        } catch (UnsupportedEncodingException unused) {
            if (TextUtils.isEmpty(strRemove)) {
                Log.e("getAntiLeechUrl", "getAntiLeechUrl specificParams fileId decode fail");
                return null;
            }
            strTrim = "";
        }
        Log.e("getAntiLeechUrl", "encryptStr xxx result:" + strTrim);
        if (TextUtils.isEmpty(strRemove2)) {
            Log.e("getAntiLeechUrl", "getAntiLeechUrl specificParams no ep");
            return null;
        }
        String strDecryptRc4ByPublicKeyJava = EncryptUtilForSDK.getInstance().decryptRc4ByPublicKeyJava(strRemove2, str);
        if (TextUtils.isEmpty(strDecryptRc4ByPublicKeyJava)) {
            Log.e("getAntiLeechUrl", "getAntiLeechUrl specificParams ep decode fail");
            return null;
        }
        String strTrim2 = strDecryptRc4ByPublicKeyJava.trim();
        if (TextUtils.isEmpty(strTrim2)) {
            Log.e("getAntiLeechUrl", "getAntiLeechUrl specificParams ep decode fail");
            return null;
        }
        String[] strArrSplit = strTrim2.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (strArrSplit.length != 4) {
            Log.e("getAntiLeechUrl", "getAntiLeechUrl specificParams ep decode fail length error deEp:" + strTrim2);
            return null;
        }
        StringBuilder sb = new StringBuilder("http://");
        map.clear();
        sb.append("audio");
        map.put("sign", strArrSplit[1]);
        sb.append(".pay.");
        map.put("buy_key", strArrSplit[0]);
        sb.append("xmcdn.com/");
        map.put("token", strArrSplit[2]);
        sb.append("download/");
        map.put("timestamp", strArrSplit[3]);
        map.put("duration", strRemove3);
        String str2 = (sb.toString() + strRemove4 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + strTrim) + "?" + a(map);
        Log.e("getAntiLeechUrl", "encryptStr url:" + str2);
        return str2;
    }

    public static String getKey0(String str) {
        String name1;
        if (TextUtils.isEmpty(i) && (name1 = getName1(str)) != null) {
            i = name1.substring(0, name1.length() / 2) + "0";
        }
        Log.e("getAntiLeechUrl", "PayUtil.getKey0   " + i);
        return i;
    }

    public static String getKey1(String str) {
        String name1;
        if (TextUtils.isEmpty(j) && (name1 = getName1(str)) != null) {
            j = name1.substring(name1.length() / 2) + "1";
        }
        Log.e("getAntiLeechUrl", "PayUtil.getKey1   " + j);
        return j;
    }

    public static String getName1(String str) {
        if (TextUtils.isEmpty(h) && !TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            char[] charArray = str.toCharArray();
            for (int i2 = 0; i2 < charArray.length / 2; i2++) {
                sb.append(g[((char) (charArray[i2] ^ charArray[(charArray.length - 1) - i2])) % 16]);
            }
            h = sb.toString();
        }
        return h;
    }

    public static StringBuilder getUrl(String str, String str2, String str3, int i2, String str4, int i3) {
        HashMap map = new HashMap();
        map.put("file_id", str2);
        map.put(b, str3);
        map.put("duration", i2 + "");
        map.put("api_version", str4);
        String strB = b(str, map);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(strB);
        if (!TextUtils.isEmpty(strB) && i3 > 0 && strB.contains("preview")) {
            sb.append("&totalLength=");
            sb.append(i3);
        }
        sb.append(a.l);
        sb.append(IS_CHARGE);
        sb.append("=true");
        return sb;
    }
}
