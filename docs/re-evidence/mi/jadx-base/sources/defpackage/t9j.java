package defpackage;

import android.util.Base64;
import com.miuipub.internal.hybrid.SignUtils;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes6.dex */
public class t9j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f34477a = "#PART#".getBytes();

    public static byte[] a(byte[] bArr, byte[] bArr2) throws Exception {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(SignUtils.KEY_RSA).generatePublic(new X509EncodedKeySpec(bArr2));
        Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA256AndMGF1Padding");
        cipher.init(1, publicKeyGeneratePublic);
        return cipher.doFinal(bArr);
    }

    public static String b(String str, String str2) throws Exception {
        byte[] bArrC = al5.c(str);
        int i = 0;
        byte[] bArrDecode = Base64.decode(str2, 0);
        int length = bArrC.length;
        if (length <= 245) {
            return al5.a(a(bArrC, bArrDecode));
        }
        ArrayList arrayList = new ArrayList(2048);
        byte[] bArr = new byte[245];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            bArr[i3] = bArrC[i2];
            i3++;
            if (i3 == 245 || i2 == length - 1) {
                i4++;
                if (i4 != 1) {
                    for (byte b2 : f34477a) {
                        arrayList.add(Byte.valueOf(b2));
                    }
                }
                for (byte b3 : a(bArr, bArrDecode)) {
                    arrayList.add(Byte.valueOf(b3));
                }
                bArr = i2 == length + (-1) ? null : new byte[Math.min(245, (length - i2) - 1)];
                i3 = 0;
            }
            i2++;
        }
        byte[] bArr2 = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bArr2[i] = ((Byte) it.next()).byteValue();
            i++;
        }
        return al5.a(bArr2);
    }
}
