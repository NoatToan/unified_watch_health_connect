package com.huami.watch.companion.weather.util;

import android.util.Base64;
import com.alipay.sdk.m.n.d;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;

/* JADX INFO: loaded from: classes16.dex */
public class RSACryptor {
    private static final String a = "65537";
    private static final String b = "91260911122270127234998794195592609888073958094373010756710379192625130836419604330763856136850049911413204124223615647519195442106322096484402456126786185173546280736241523122414918124588757446468517350617150284870882239165712536054685980495005286151635113622783814352878825904710689839570887752503335468013";
    private static final int c = 127;
    private static String d;

    public static String decode(String str) {
        try {
            if (d == null) {
                genRSAKey();
            }
            return decode(str, b, d);
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String encode(String str) {
        try {
            return encode(str, b, a);
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static void genRSAKey() throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(d.a);
        keyPairGenerator.initialize(1024);
        KeyPair keyPairGenKeyPair = keyPairGenerator.genKeyPair();
        d = ((RSAPrivateKey) keyPairGenKeyPair.getPrivate()).getPrivateExponent().toString();
    }

    public static void genRSAKeySafe() {
        try {
            genRSAKey();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static String encode(String str, String str2, String str3) throws UnsupportedEncodingException {
        if (str == null || str2 == null || str3 == null || str.getBytes("UTF-8").length > 127) {
            return null;
        }
        BigInteger bigInteger = new BigInteger(str2);
        return new String(Base64.encode(new BigInteger("0".concat(str).getBytes("UTF-8")).modPow(new BigInteger(str3), bigInteger).toByteArray(), 8), "UTF-8");
    }

    public static String decode(String str, String str2, String str3) throws UnsupportedEncodingException {
        if (str == null || str2 == null || str3 == null) {
            return null;
        }
        BigInteger bigInteger = new BigInteger(str2);
        byte[] byteArray = new BigInteger(str).modPow(new BigInteger(str3), bigInteger).toByteArray();
        return new String(byteArray, 1, byteArray.length - 1, "UTF-8");
    }
}
