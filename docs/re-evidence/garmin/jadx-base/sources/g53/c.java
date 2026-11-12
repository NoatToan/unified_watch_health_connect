package g53;

import d53.f;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
public class c {
    public static final void a(long j8, int i14, byte[] bArr, int i15, int i16) {
        int i17 = 7 - i15;
        int i18 = 8 - i16;
        if (i18 > i17) {
            return;
        }
        while (true) {
            int i19 = f.f57681a[(int) ((j8 >> (i17 << 3)) & 255)];
            int i24 = i14 + 1;
            bArr[i14] = (byte) (i19 >> 8);
            i14 += 2;
            bArr[i24] = (byte) i19;
            if (i17 == i18) {
                return;
            } else {
                i17--;
            }
        }
    }

    public static final long b(int i14, byte[] bArr) {
        return (((long) bArr[i14 + 7]) & 255) | ((((long) bArr[i14]) & 255) << 56) | ((((long) bArr[i14 + 1]) & 255) << 48) | ((((long) bArr[i14 + 2]) & 255) << 40) | ((((long) bArr[i14 + 3]) & 255) << 32) | ((((long) bArr[i14 + 4]) & 255) << 24) | ((((long) bArr[i14 + 5]) & 255) << 16) | ((((long) bArr[i14 + 6]) & 255) << 8);
    }
}
