package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes12.dex */
class odb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f44173b = "GBAUtils";
    private static Map<String, String> d = new HashMap();

    odb() {
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        byte[] f44174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        byte[] f44175b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        byte[] f44176c;
        byte[] d;
        byte[] e;

        d() {
        }
    }

    static byte[] b(d dVar, String str, String str2, ocv ocvVar) {
        if (dVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || ocvVar == null) {
            return null;
        }
        try {
            return d(dVar.f44175b, c(dVar.e, String.format("%1$s@ims.mnc%2$s.mcc%3$s.3gppnetwork.org", str, oco.a(str), oco.b(str)).getBytes("utf-8"), e(str2.getBytes("utf-8"), new byte[]{1, 0, 1, (byte) (ocvVar.f44162c >> 8), (byte) (ocvVar.f44162c & 255)})));
        } catch (UnsupportedEncodingException unused) {
            ocq.e(f44173b, "calculateKsNaf -> UnsupportedEncodingException");
            return null;
        }
    }

    static String c(String str, String str2) {
        if (ocq.f44154c.booleanValue()) {
            ocq.e(f44173b, "secret:data = " + str + ":" + str2);
        }
        String strC = c(str + ":" + str2);
        if (ocq.f44154c.booleanValue()) {
            ocq.e(f44173b, "response = " + strC + " resopnse length = " + strC.length());
        }
        return strC;
    }

    static String b(String str, String str2, String str3, String str4) {
        String string;
        String strC;
        StringBuilder sb = new StringBuilder();
        if (str4.equals("GET")) {
            if (ocq.f44154c.booleanValue()) {
                ocq.e(f44173b, "GET password = " + str3);
            }
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            sb.append(":");
            string = sb.toString();
            strC = b(string, e(str3));
        } else if (str4.equals("POST")) {
            String strEncodeToString = Base64.encodeToString(e(str3), 2);
            if (ocq.f44154c.booleanValue()) {
                ocq.e(f44173b, "POST password = " + strEncodeToString);
            }
            string = str + ":" + str2 + ":" + strEncodeToString;
            strC = c(string);
        } else {
            string = null;
            strC = null;
        }
        if (ocq.f44154c.booleanValue()) {
            ocq.e(f44173b, "Secret->H(A1) = " + strC + ", A1(username:realm:password) = " + string);
        }
        return strC;
    }

    static String d(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        String strC = c(str4);
        sb.append(str);
        sb.append(":00000001:");
        sb.append(str2);
        sb.append(":");
        sb.append(str3);
        sb.append(":");
        sb.append(strC);
        String string = sb.toString();
        if (ocq.f44154c.booleanValue()) {
            ocq.e(f44173b, "Data(nonce:nc:cnonce:qop:H(A2)) = " + string);
        }
        return string;
    }

    static String b() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("MD5").digest(Long.toString(System.currentTimeMillis()).getBytes()), 0).trim();
        } catch (NoSuchAlgorithmException unused) {
            ocq.e(f44173b, "Can't find MD5 enter algorithm exception");
            return null;
        }
    }

    static d d(Context context, String str, int i) {
        if (str == null || context == null) {
            ocq.e(f44173b, " data == null || context == null");
            return null;
        }
        int i2 = 0;
        byte[] bArrDecode = Base64.decode(str, 0);
        if (bArrDecode.length >= 32) {
            byte[] bArr = new byte[17];
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[17];
            bArr[0] = 16;
            bArr3[0] = 16;
            while (i2 < 16) {
                int i3 = i2 + 1;
                byte b2 = bArrDecode[i2];
                bArr[i3] = b2;
                bArr2[i2] = b2;
                bArr3[i3] = bArrDecode[i2 + 16];
                i2 = i3;
            }
            if (ocq.f44154c.booleanValue()) {
                ocq.e(f44173b, "RAND =" + a(bArr) + ", AUTN =" + a(bArr3));
            }
            d dVarD = d(a(context, i, Base64.encodeToString(e(bArr, bArr3), 2)));
            if (dVarD != null) {
                dVarD.e = bArr2;
            }
            return dVarD;
        }
        ocq.e(f44173b, "auth failed,data == null or wrong dataLength");
        return null;
    }

    private static String a(Context context, int i, String str) {
        int iE = Build.VERSION.SDK_INT >= 29 ? oco.e(context, i) : i;
        String str2 = f44173b;
        ocq.e(str2, "calculateAuthRespChallenge slotId = " + i + ",subId = " + iE);
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(TelephonyManager.class);
        String iccAuthentication = "";
        if (telephonyManager == null) {
            ocq.c(str2, "getSimAuthResult telephonyManagerClass is null");
            return "";
        }
        TelephonyManager telephonyManagerCreateForSubscriptionId = telephonyManager.createForSubscriptionId(iE);
        if (telephonyManagerCreateForSubscriptionId != null) {
            ocq.e(str2, "telephonyManager telephonyManager = " + telephonyManagerCreateForSubscriptionId + ", subID = " + iE);
            iccAuthentication = telephonyManagerCreateForSubscriptionId.getIccAuthentication(2, 129, str);
            ocq.e(str2, "getIccAuthentication result = " + iccAuthentication + ",subID = " + iE);
        }
        if (ocq.f44154c.booleanValue()) {
            ocq.e(str2, "getIccAuthentication result = " + iccAuthentication + ",subID = " + iE);
        }
        return iccAuthentication;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static d d(String str) {
        d dVar = null;
        if (TextUtils.isEmpty(str)) {
            ocq.e(f44173b, "hexAuthResponse is null ,return");
            return null;
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        if (bArrDecode[0] == -37) {
            dVar = new d();
            String str2 = f44173b;
            Log.v(str2, "successful 3G authentication ");
            int i = bArrDecode[1];
            dVar.d = new byte[i];
            System.arraycopy(bArrDecode, 2, dVar.d, 0, i);
            int i2 = bArrDecode[i + 2];
            dVar.f44176c = new byte[i2];
            System.arraycopy(bArrDecode, i + 3, dVar.f44176c, 0, i2);
            int i3 = i + i2;
            int i4 = bArrDecode[i3 + 3];
            dVar.f44174a = new byte[i4];
            System.arraycopy(bArrDecode, i3 + 4, dVar.f44174a, 0, i4);
            dVar.f44175b = c(dVar.f44176c, dVar.f44174a);
            if (ocq.f44154c.booleanValue()) {
                ocq.e(str2, "ik:" + a(dVar.f44174a) + " ck:" + a(dVar.f44176c) + " res:" + a(dVar.d) + " ks:" + a(dVar.f44175b));
            }
        }
        return dVar;
    }

    private static byte[] c(byte[] bArr, byte[] bArr2) {
        if (ocq.f44154c.booleanValue()) {
            ocq.e(f44173b, "enter generateKs ck=" + a(bArr) + ", ik=" + a(bArr2));
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        if (ocq.f44154c.booleanValue()) {
            ocq.e(f44173b, "leave generateKs, ks=" + a(bArr3));
        }
        return bArr3;
    }

    private static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length + bArr2.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        if (ocq.f44154c.booleanValue()) {
            ocq.e(f44173b, "byte_3=" + Arrays.toString(bArr3) + ", length=" + length);
        }
        return bArr3;
    }

    static String a(String str) {
        if (str == null) {
            ocq.e(f44173b, "Parameter name may not be null");
            return null;
        }
        Map<String, String> map = d;
        if (map == null) {
            ocq.e(f44173b, "mParams is null");
            return null;
        }
        return map.get(str.toLowerCase());
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        byte[] bArrDoFinal = null;
        try {
            if (ocq.f44154c.booleanValue()) {
                ocq.e(f44173b, "enter hmacSha256 key=" + a(bArr) + ", data=" + a(bArr2));
            }
            Mac mac = Mac.getInstance("HMAC-SHA256");
            mac.init(new SecretKeySpec(bArr, "HMAC-SHA256"));
            bArrDoFinal = mac.doFinal(bArr2);
            if (ocq.f44154c.booleanValue()) {
                ocq.e(f44173b, "leave hmacSha256, ret=" + Base64.encodeToString(bArrDoFinal, 2));
            }
            return bArrDoFinal;
        } catch (Exception unused) {
            ocq.e(f44173b, "hmacSha256 Exception");
            return bArrDoFinal;
        }
    }

    private static byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (ocq.f44154c.booleanValue()) {
            ocq.e(f44173b, "enter generateS rand=" + Base64.encodeToString(bArr, 2) + ", impi=" + Base64.encodeToString(bArr2, 2) + ", nafId=" + Base64.encodeToString(bArr3, 2));
        }
        byte[] bArrE = e((short) bArr.length);
        byte[] bArrE2 = e((short) bArr2.length);
        byte[] bArrE3 = e((short) bArr3.length);
        int length = bArr.length + 9 + bArrE.length + bArr2.length + bArrE2.length + bArr3.length + bArrE3.length;
        byte[] bArr4 = new byte[length];
        System.arraycopy(new byte[]{1}, 0, bArr4, 0, 1);
        System.arraycopy(new byte[]{103, 98, 97, 45, 109, 101}, 0, bArr4, 1, 6);
        System.arraycopy(new byte[]{0, 6}, 0, bArr4, 7, 2);
        System.arraycopy(bArr, 0, bArr4, 9, bArr.length);
        int length2 = bArr.length + 9;
        System.arraycopy(bArrE, 0, bArr4, length2, bArrE.length);
        int length3 = length2 + bArrE.length;
        System.arraycopy(bArr2, 0, bArr4, length3, bArr2.length);
        int length4 = length3 + bArr2.length;
        System.arraycopy(bArrE2, 0, bArr4, length4, bArrE2.length);
        int length5 = length4 + bArrE2.length;
        System.arraycopy(bArr3, 0, bArr4, length5, bArr3.length);
        System.arraycopy(bArrE3, 0, bArr4, length5 + bArr3.length, bArrE3.length);
        if (ocq.f44154c.booleanValue()) {
            ocq.e(f44173b, "leave generateS, len=" + length + ", s=" + a(bArr4));
        }
        return bArr4;
    }

    private static byte[] e(short s) {
        return new byte[]{(byte) ((s >> 8) & 255), (byte) (s & 255)};
    }

    static void b(String str) {
        if (str == null) {
            ocq.e(f44173b, "challengeStr is null");
            return;
        }
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1 && ocq.f44154c.booleanValue()) {
            ocq.e(f44173b, "Invalid challenge: " + str);
        }
        d.clear();
        List listC = new ocx().c(str.substring(iIndexOf + 1, str.length()), ',');
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            ocz oczVar = (ocz) listC.get(i);
            d.put(oczVar.e().toLowerCase(), oczVar.d());
        }
    }

    private static String c(String str) {
        try {
            if (ocq.f44154c.booleanValue()) {
                ocq.e(f44173b, "encoderByMd5 str =" + str);
            }
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes("US-ASCII"));
            return a(messageDigest.digest());
        } catch (Exception unused) {
            return "";
        }
    }

    private static String b(String str, byte[] bArr) {
        try {
            byte[] bytes = str.getBytes();
            int length = bytes.length;
            int length2 = bArr.length + length;
            byte[] bArr2 = new byte[length2];
            for (int i = 0; i < length2; i++) {
                if (i < length) {
                    bArr2[i] = bytes[i];
                } else {
                    bArr2[i] = bArr[i - length];
                }
            }
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr2);
            return a(messageDigest.digest());
        } catch (Exception unused) {
            return "";
        }
    }

    static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    private static byte[] e(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (a(charArray[i2 + 1]) | (a(charArray[i2]) << 4));
        }
        return bArr;
    }

    private static byte a(char c2) {
        return (byte) "0123456789ABCDEF".indexOf(c2);
    }
}
