package com.xiaomi.account.auth;

import android.net.Uri;
import com.xiaomi.account.utils.Base64Coder;
import defpackage.gv5;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class AuthorizeHelper {
    private static final String HMAC_SHA1 = "HmacSHA1";
    private static final String UTF8 = "UTF-8";
    private static Random random = new Random();

    public static HashMap<String, String> buildMacRequestHead(String str, String str2, String str3) throws UnsupportedEncodingException {
        String str4 = String.format("MAC access_token=\"%s\", nonce=\"%s\",mac=\"%s\"", URLEncoder.encode(str, "UTF-8"), URLEncoder.encode(str2, "UTF-8"), URLEncoder.encode(str3, "UTF-8"));
        HashMap<String, String> map = new HashMap<>();
        map.put("Authorization", str4);
        return map;
    }

    public static String encodeSign(byte[] bArr) {
        return new String(Base64Coder.encode(bArr));
    }

    public static byte[] encryptHMACSha1(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, HMAC_SHA1);
        Mac mac = Mac.getInstance(HMAC_SHA1);
        mac.init(secretKeySpec);
        mac.update(bArr);
        return mac.doFinal();
    }

    public static String generateNonce() {
        return random.nextLong() + ":" + ((int) (System.currentTimeMillis() / 60000));
    }

    public static String generateUrl(String str, Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }

    public static String getMacAccessTokenSignatureString(String str, String str2, String str3, String str4, Map<String, String> map, String str5, String str6) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        if (!HMAC_SHA1.equalsIgnoreCase(str6)) {
            throw new NoSuchAlgorithmException("error mac algorithm : " + str6);
        }
        StringBuilder sb = new StringBuilder("");
        sb.append(str + "\n");
        sb.append(str2.toUpperCase() + "\n");
        sb.append(str3 + "\n");
        sb.append(str4 + "\n");
        if (map != null && map.size() > 0) {
            TreeMap treeMap = new TreeMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                treeMap.put(urlEncode(entry.getKey()), urlEncode(entry.getValue()));
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getQueryString(treeMap));
            sb.append(stringBuffer.toString() + "\n");
        }
        return encodeSign(encryptHMACSha1(sb.toString().getBytes("UTF-8"), str5.getBytes("UTF-8")));
    }

    public static String getQueryString(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strUrlEncode = urlEncode(entry.getKey());
            String value = entry.getValue();
            String strUrlEncode2 = value != null ? urlEncode(value) : "";
            if (sb.length() > 0) {
                sb.append(gv5.CONNECT_STR);
            }
            sb.append(strUrlEncode);
            sb.append("=");
            sb.append(strUrlEncode2);
        }
        return sb.toString();
    }

    private static String urlEncode(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
