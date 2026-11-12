package ss2;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import java.security.SecureRandom;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f160776a = LoggerFactory.getLogger("GFDI#Auth");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC3036a[] f160777b = {EnumC3036a.XXTEA};

    /* JADX INFO: renamed from: ss2.a$a, reason: collision with other inner class name */
    public enum EnumC3036a {
        XXTEA(0),
        /* JADX INFO: Fake field, exist only in values array */
        AES_128(1);


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SparseArray<EnumC3036a> f160779c = new SparseArray<>(values().length);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f160781a;

        static {
            for (EnumC3036a enumC3036a : values()) {
                f160779c.put(enumC3036a.f160781a, enumC3036a);
            }
        }

        EnumC3036a(int i14) {
            this.f160781a = i14;
        }
    }

    public static byte[] a(String str, byte[] bArr, byte[] bArr2) {
        byte[] bArrC = c(bArr2, new byte[16]);
        byte[] bArrC2 = n.c(bArrC.length, false, bArrC, bArr);
        String[] strArrSplit = str.split("[:]");
        byte[] bArr3 = new byte[16];
        int i14 = 0;
        for (int i15 = 5; i15 >= 0; i15--) {
            bArr3[i14] = (byte) (Integer.parseInt(strArrSplit[i15], 16) & 255);
            i14++;
        }
        byte[] bArrC3 = c(c(bArrC2, bArr3), bArr2);
        return n.c(bArrC3.length, false, bArrC3, bArr);
    }

    @SuppressLint({"TrulyRandom"})
    public static byte[] b() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        StringBuilder sb3 = new StringBuilder("r=");
        StringBuffer stringBuffer = new StringBuffer("[ ");
        for (int i14 = 0; i14 < 16; i14++) {
            stringBuffer.append(String.format("%02X", Byte.valueOf(bArr[i14])));
            stringBuffer.append(StringUtils.SPACE);
        }
        stringBuffer.append("]");
        sb3.append(stringBuffer.toString());
        f160776a.trace(sb3.toString());
        return bArr;
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != bArr2.length) {
            return null;
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i14 = 0; i14 < bArr.length; i14++) {
            bArr3[i14] = (byte) (bArr[i14] ^ bArr2[i14]);
        }
        return bArr3;
    }
}
