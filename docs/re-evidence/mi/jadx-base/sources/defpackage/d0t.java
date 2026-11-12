package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class d0t {
    public static byte[] a() {
        try {
            return b("16,99,86,77,511,98,86,97,511,99,86,77,511,18,48,97,511,99,86,77,511,58,601,77,511,58,48,77,511,58,86,87,511,18,48,97,511,58,86,87,511,18,48,97,511,98,48,87,511,98,48,97,511,99,86,77,511,58,221,77,511,98,601,87");
        } catch (Throwable th) {
            m2t.r(th, "AMU", "grk");
            return null;
        }
    }

    public static byte[] b(String str) {
        try {
            String[] strArrSplit = new StringBuffer(str).reverse().toString().split(",");
            int length = strArrSplit.length;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr[i] = Byte.parseByte(strArrSplit[i]);
            }
            String[] strArrSplit2 = new StringBuffer(new String(x1t.c(new String(bArr)), "UTF-8")).reverse().toString().split(",");
            byte[] bArr2 = new byte[strArrSplit2.length];
            for (int i2 = 0; i2 < strArrSplit2.length; i2++) {
                bArr2[i2] = Byte.parseByte(strArrSplit2[i2]);
            }
            return bArr2;
        } catch (Throwable th) {
            m2t.r(th, "AMU", "rcs");
            return null;
        }
    }

    public static byte[] c(byte[] bArr) {
        try {
            return j0t.h(a(), bArr, d());
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    public static byte[] d() {
        try {
            return b("16,18,86,97,511,18,48,97,511,18,86,97,511,58,86,77,511,18,86,97,511,58,48,77,511,18,86,97,511,58,601,77,511,18,86,97,511,58,221,77,511,18,86,97,511,58,86,87,511,18,86,97,511,58,48,87,511,18,86,97,511,58,601,87");
        } catch (Throwable th) {
            m2t.r(th, "AMU", "giv");
            return null;
        }
    }

    public static byte[] e(byte[] bArr) {
        try {
            return j0t.e(a(), bArr, d());
        } catch (Exception unused) {
            return new byte[0];
        }
    }
}
