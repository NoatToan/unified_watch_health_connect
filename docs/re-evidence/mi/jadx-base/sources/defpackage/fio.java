package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class fio {
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    public static String a(String str, Object... objArr) {
        int i;
        if (tt3.F(str) || qj1.D(objArr)) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 50);
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length) {
            int iIndexOf = str.indexOf("{}", i3);
            if (iIndexOf == -1) {
                if (i3 == 0) {
                    return str;
                }
                sb.append((CharSequence) str, i3, length);
                return sb.toString();
            }
            if (iIndexOf > 0) {
                int i4 = iIndexOf - 1;
                if (str.charAt(i4) != '\\') {
                    sb.append((CharSequence) str, i3, iIndexOf);
                    sb.append(lio.J0(objArr[i2]));
                } else if (iIndexOf <= 1 || str.charAt(iIndexOf - 2) != '\\') {
                    i2--;
                    sb.append((CharSequence) str, i3, i4);
                    sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
                    i = iIndexOf + 1;
                } else {
                    sb.append((CharSequence) str, i3, i4);
                    sb.append(lio.J0(objArr[i2]));
                }
                i = iIndexOf + 2;
            } else {
                sb.append((CharSequence) str, i3, iIndexOf);
                sb.append(lio.J0(objArr[i2]));
                i = iIndexOf + 2;
            }
            i3 = i;
            i2++;
        }
        sb.append((CharSequence) str, i3, str.length());
        return sb.toString();
    }
}
