package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class eet {
    public ees b(String str) throws eeu {
        return a(str, 0);
    }

    private ees a(String str, int i) throws eeu {
        ees eesVar = new ees();
        if (str == null) {
            LogUtil.j("TlvUtils", "hexString is null");
            return eesVar;
        }
        if (i > 50) {
            throw new eeu();
        }
        int iE = 0;
        while (iE != str.length()) {
            try {
                String strSubstring = str.substring(iE, iE + 2);
                d dVarC = c(str, iE + strSubstring.length());
                int iC = dVarC.c();
                iE = dVarC.e();
                if (iC == 0) {
                    eesVar.e().add(new eew(strSubstring, iC, ""));
                } else {
                    int i2 = (iC * 2) + iE;
                    if (i2 > str.length()) {
                        throw new eeu();
                    }
                    String strSubstring2 = str.substring(iE, i2);
                    iE += strSubstring2.length();
                    if ((lsk.a(strSubstring, 16) >>> 7) == 1) {
                        eesVar.b().add(a(strSubstring2, 1 + i));
                    } else {
                        eesVar.e().add(new eew(strSubstring, iC, strSubstring2));
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                LogUtil.e("TlvUtils", "builderTlvList Exception error,", ExceptionUtils.c(e));
                throw new eeu();
            }
        }
        return eesVar;
    }

    private d c(String str, int i) throws eeu {
        int i2;
        try {
            int i3 = i + 2;
            int iA = lsk.a(str.length() >= i3 ? str.substring(i, i3) : null, 16);
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (((iA >>> 7) & 1) == 1) {
                if (i4 >= 4) {
                    throw new eeu();
                }
                int i7 = i + 2;
                int i8 = iA & 127;
                if (i4 == 0) {
                    i5 = i8;
                } else if (i4 != 1) {
                    LogUtil.j("TlvUtils", "getLengthAndPosition default");
                } else {
                    i6 = i8;
                }
                iA = lsk.a(str.substring(i7, i + 4), 16);
                i4++;
                i = i7;
            }
            if (i4 != 2) {
                if (i4 == 1) {
                    i2 = i5 << 7;
                }
                return new d(iA, i + 2);
            }
            i2 = (i5 << 14) | (i6 << 7);
            iA |= i2;
            return new d(iA, i + 2);
        } catch (IndexOutOfBoundsException unused) {
            throw new eeu();
        }
    }

    static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f32856c;
        private int d;

        private d(int i, int i2) {
            this.f32856c = i;
            this.d = i2;
        }

        public int c() {
            return this.f32856c;
        }

        public int e() {
            return this.d;
        }
    }

    public static boolean e(byte[] bArr) {
        if (bArr == null || bArr.length <= 4 || bArr[2] != 127) {
            return false;
        }
        String strE = eeq.e(bArr);
        return lsk.a(strE.substring(8, strE.length()), 16) == 100009;
    }
}
