package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class cqe {
    public cqb a(String str) throws cpy {
        return b(str, 0);
    }

    private cqb b(String str, int i) throws cpy {
        cqb cqbVar = new cqb();
        if (str == null) {
            LogUtil.e("TlvUtils", "hexString is null");
            return cqbVar;
        }
        if (i > 50) {
            throw new cpy();
        }
        int iD = 0;
        while (iD != str.length()) {
            try {
                String strSubstring = str.substring(iD, iD + 2);
                d dVarD = d(str, iD + strSubstring.length());
                int iE = dVarD.e();
                iD = dVarD.d();
                if (iE == 0) {
                    cqbVar.b().add(new cqa(strSubstring, iE, ""));
                } else {
                    int i2 = (iE * 2) + iD;
                    if (i2 > str.length()) {
                        throw new cpy();
                    }
                    String strSubstring2 = str.substring(iD, i2);
                    iD += strSubstring2.length();
                    if ((cpe.c(strSubstring, 16) >>> 7) == 1) {
                        cqbVar.e().add(b(strSubstring2, 1 + i));
                    } else {
                        cqbVar.b().add(new cqa(strSubstring, iE, strSubstring2));
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                LogUtil.d("TlvUtils", "builderTlvList Exception error,", ExceptionUtils.c(e));
                throw new cpy();
            }
        }
        return cqbVar;
    }

    public cqg a(cqg cqgVar, String str, int i) throws cpy {
        if (cqgVar == null || str == null || i < 0) {
            return null;
        }
        int iD = 0;
        while (iD != str.length()) {
            try {
                String strSubstring = str.substring(iD, iD + 2);
                int i2 = (i + iD) / 2;
                d dVarD = d(str, iD + strSubstring.length());
                int iE = dVarD.e();
                iD = dVarD.d();
                if (iE == 0) {
                    c(strSubstring, i2, cqgVar);
                } else {
                    int i3 = (iE * 2) + iD;
                    if (i3 > str.length()) {
                        throw new cpy();
                    }
                    String strSubstring2 = str.substring(iD, i3);
                    int length = strSubstring2.length() + iD;
                    a(cqgVar, i2, i + iD, strSubstring, strSubstring2);
                    iD = length;
                }
            } catch (IndexOutOfBoundsException unused) {
                throw new cpy();
            }
        }
        return cqgVar;
    }

    private void c(String str, int i, cqg cqgVar) {
        String string = Integer.toString(cpe.c(str, 16));
        if (string.charAt(0) == '0') {
            string = string.substring(1, string.length());
        }
        cqgVar.d().add(new cqg(i, string, string));
    }

    private void a(cqg cqgVar, int i, int i2, String str, String str2) throws cpy {
        if ((cpe.c(str, 16) >>> 7) == 1) {
            String string = Integer.toString(cpe.c(str, 16) & 127);
            if (string.charAt(0) == '0') {
                string = string.substring(1, string.length());
            }
            cqgVar.d().add(new cqg(i, string, string));
            a(cqgVar, str2, i2);
            return;
        }
        String string2 = Integer.toString(cpe.c(str, 16));
        if (string2.charAt(0) == '0') {
            string2 = string2.substring(1, string2.length());
        }
        cqgVar.d().add(new cqg(i, string2, string2));
    }

    private d d(String str, int i) throws cpy {
        int i2;
        try {
            int i3 = i + 2;
            int iC = cpe.c(str.length() >= i3 ? str.substring(i, i3) : null, 16);
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (((iC >>> 7) & 1) == 1) {
                if (i4 >= 4) {
                    throw new cpy();
                }
                int i7 = i + 2;
                int i8 = iC & 127;
                if (i4 == 0) {
                    i5 = i8;
                } else if (i4 != 1) {
                    LogUtil.e("TlvUtils", "getLengthAndPosition default");
                } else {
                    i6 = i8;
                }
                iC = cpe.c(str.substring(i7, i + 4), 16);
                i4++;
                i = i7;
            }
            if (i4 != 2) {
                if (i4 == 1) {
                    i2 = i5 << 7;
                }
                return new d(iC, i + 2);
            }
            i2 = (i5 << 14) | (i6 << 7);
            iC |= i2;
            return new d(iC, i + 2);
        } catch (IndexOutOfBoundsException unused) {
            throw new cpy();
        }
    }

    static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f31249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f31250c;

        private d(int i, int i2) {
            this.f31249b = i;
            this.f31250c = i2;
        }

        public int e() {
            return this.f31249b;
        }

        public int d() {
            return this.f31250c;
        }
    }
}
