package o63;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f129852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f129853b;

    static {
        String[] strArr = new String[93];
        for (int i14 = 0; i14 < 32; i14++) {
            strArr[i14] = "\\u" + b(i14 >> 12) + b(i14 >> 8) + b(i14 >> 4) + b(i14);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f129852a = strArr;
        byte[] bArr = new byte[93];
        for (int i15 = 0; i15 < 32; i15++) {
            bArr[i15] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f129853b = bArr;
    }

    public static final void a(String str, StringBuilder sb3) {
        str.getClass();
        sb3.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        int length = str.length();
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = str.charAt(i15);
            String[] strArr = f129852a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb3.append((CharSequence) str, i14, i15);
                sb3.append(strArr[cCharAt]);
                i14 = i15 + 1;
            }
        }
        if (i14 != 0) {
            sb3.append((CharSequence) str, i14, str.length());
        } else {
            sb3.append(str);
        }
        sb3.append(CoreConstants.DOUBLE_QUOTE_CHAR);
    }

    public static final char b(int i14) {
        int i15 = i14 & 15;
        return (char) (i15 < 10 ? i15 + 48 : i15 + 87);
    }
}
