package defpackage;

import android.content.Context;
import android.content.pm.Signature;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes5.dex */
public class cmq {
    public static void a(byte b2, StringBuffer stringBuffer) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        stringBuffer.append(cArr[(b2 & 240) >> 4]);
        stringBuffer.append(cArr[b2 & 15]);
    }

    public static String b(Context context, String str) {
        try {
            Signature signature = context.getPackageManager().getPackageInfo(str, 64).signatures[0];
            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
            messageDigest.update(signature.toByteArray());
            return c(messageDigest.digest());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String c(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            a(bArr[i], stringBuffer);
            if (i < length - 1) {
                stringBuffer.append(":");
            }
        }
        return stringBuffer.toString();
    }
}
