package defpackage;

import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes7.dex */
public class cw6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f14796a = {"java.lang.OutOfMemoryError", "No space left on device"};

    public static String a(String str) {
        String[] strArrSplit = str.replaceAll("\\t", "").split("\\n");
        StringBuilder sb = new StringBuilder();
        int iMin = Math.min(strArrSplit.length, 20);
        for (int i = 0; i < iMin; i++) {
            strArrSplit[i] = strArrSplit[i].replaceAll("((java:)|(length=)|(index=)|(Index:)|(Size:))\\d+", "$1XX").replaceAll("\\$[0-9a-fA-F]{1,10}@[0-9a-fA-F]{1,10}|@[0-9a-fA-F]{1,10}|0x[0-9a-fA-F]{1,10}", "XX").replaceAll("\\d+[B,KB,MB]*", "");
        }
        for (int i2 = 0; i2 < iMin && (!strArrSplit[i2].contains("...") || !strArrSplit[i2].contains("more")); i2++) {
            sb.append(strArrSplit[i2]);
            sb.append('\n');
        }
        return b(sb.toString());
    }

    public static String b(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(Coder.KEY_MD5).digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b2 : bArrDigest) {
                int i = b2 & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UnsupportedEncodingException", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("NoSuchAlgorithmException", e2);
        }
    }
}
