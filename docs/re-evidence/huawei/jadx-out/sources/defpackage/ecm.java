package defpackage;

import health.compact.a.WhiteBoxManager;

/* JADX INFO: loaded from: classes7.dex */
public class ecm {
    public static byte[] b(byte[] bArr) {
        return WhiteBoxManager.b().a(bArr);
    }

    public static String e() {
        WhiteBoxManager whiteBoxManagerB = WhiteBoxManager.b();
        return whiteBoxManagerB.a(1, 22) + whiteBoxManagerB.a(1, 1022) + whiteBoxManagerB.a(1, 2022);
    }

    public static byte[] a(int i, byte[] bArr, byte[] bArr2) {
        try {
            if (i == 100) {
                return WhiteBoxManager.b().d(2, bArr, bArr2);
            }
            if (i == 101) {
                return WhiteBoxManager.b().d(1, bArr, bArr2);
            }
            if (i != 110) {
                return null;
            }
            return WhiteBoxManager.b().d(0, bArr, bArr2);
        } catch (UnsatisfiedLinkError e) {
            dyg.c(false, "WhiteBoxUtil", "whiteBoxEncrypt UnsatisfiedLinkError: ", e.getMessage());
            return null;
        }
    }
}
