package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes41.dex */
public class oqo {
    public oqp d(String str) throws oqr {
        oqp oqpVar = new oqp();
        if (!TextUtils.isEmpty(str)) {
            int iB = 0;
            while (iB != str.length()) {
                try {
                    String strSubstring = str.substring(iB, iB + 2);
                    d dVarA = a(str, iB + strSubstring.length());
                    int iE = dVarA.e();
                    iB = dVarA.b();
                    if (iE == 0) {
                        oqpVar.e().add(new oqs(strSubstring, iE, ""));
                    } else {
                        int i = (iE * 2) + iB;
                        if (i > str.length()) {
                            throw new oqr();
                        }
                        String strSubstring2 = str.substring(iB, i);
                        iB += strSubstring2.length();
                        if ((Integer.parseInt(strSubstring, 16) >>> 7) == 1) {
                            oqpVar.c().add(d(strSubstring2));
                        } else {
                            oqpVar.e().add(new oqs(strSubstring, iE, strSubstring2));
                        }
                    }
                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                    throw new oqr();
                }
            }
        }
        return oqpVar;
    }

    private d a(String str, int i) throws oqr {
        int i2;
        try {
            int i3 = Integer.parseInt(str.substring(i, i + 2), 16);
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (((i3 >>> 7) & 1) == 1) {
                if (i4 >= 4) {
                    throw new oqr();
                }
                int i7 = i + 2;
                int i8 = i3 & 127;
                if (i4 == 0) {
                    i5 = i8;
                } else if (i4 == 1) {
                    i6 = i8;
                }
                i3 = Integer.parseInt(str.substring(i7, i + 4), 16);
                i4++;
                i = i7;
            }
            if (i4 != 2) {
                if (i4 == 1) {
                    i2 = i5 * 128;
                }
                return new d(i3, i + 2);
            }
            i2 = (i5 * 16384) + (i6 * 128);
            i3 += i2;
            return new d(i3, i + 2);
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            throw new oqr();
        }
    }

    static class d {
        private int d;
        private int e;

        private d(int i, int i2) {
            this.d = i;
            this.e = i2;
        }

        public int e() {
            return this.d;
        }

        public int b() {
            return this.e;
        }
    }
}
