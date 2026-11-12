package sg;

import java.security.SecureRandom;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class a extends qg.a {
    public a(byte[] bArr) {
        super(bArr);
    }

    public static a a(String str, long j8, b bVar, short s8, f fVar) {
        SecureRandom secureRandom = qg.b.f144653a;
        char cCharAt = str.charAt(0);
        byte[] bArr = new byte[2];
        qg.b.a().nextBytes(bArr);
        bVar.a();
        byte[] bArr2 = new byte[2];
        qg.b.a().nextBytes(bArr2);
        fVar.getClass();
        byte[] bArr3 = (byte[]) new byte[0].clone();
        byte[] bArr4 = new byte[4];
        qg.b.a().nextBytes(bArr4);
        byte[][] bArr5 = {new byte[]{1}, new byte[]{(byte) (cCharAt & 255), (byte) (str.charAt(1) & 255)}, new byte[]{(byte) j8, (byte) (j8 >> 8), (byte) (j8 >> 16), (byte) (j8 >> 24), (byte) (j8 >> 32), (byte) (j8 >> 40), (byte) (j8 >> 48), (byte) (j8 >> 56)}, bArr, new byte[]{bVar.f159016a}, new byte[]{bVar.f159017b}, (byte[]) bVar.f159018c.clone(), new byte[]{(byte) s8, (byte) (s8 >> 8)}, bArr2, new byte[]{0}, bArr3, bArr4};
        int length = 0;
        for (int i14 = 0; i14 < 12; i14++) {
            length += bArr5[i14].length;
        }
        byte[] bArrCopyOf = null;
        int length2 = 0;
        for (int i15 = 0; i15 < 12; i15++) {
            byte[] bArr6 = bArr5[i15];
            if (bArrCopyOf == null) {
                bArrCopyOf = Arrays.copyOf(bArr6, length);
                length2 = bArr6.length;
            } else {
                System.arraycopy(bArr6, 0, bArrCopyOf, length2, bArr6.length);
                length2 += bArr6.length;
            }
        }
        return new a(bArrCopyOf);
    }
}
