package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class ut5 implements v43 {
    public static String b(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 10);
        String[] strArrSplit = str.split(xvo.f39517a);
        int length = strArrSplit.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(xvo.f39517a);
            }
            String str2 = strArrSplit[i];
            sb.append((char) 9553);
            sb.append(str2);
        }
        return sb.toString();
    }

    @Override // defpackage.e1a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        String[] strArr2 = new String[strArr.length];
        int i = 0;
        for (String str : strArr) {
            if (str != null) {
                strArr2[i] = str;
                i++;
            }
        }
        if (i == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("╔═══════════════════════════════════════════════════════════════════════════════════════════════════");
        sb.append(xvo.f39517a);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(b(strArr2[i2]));
            if (i2 != i - 1) {
                sb.append(xvo.f39517a);
                sb.append("╟───────────────────────────────────────────────────────────────────────────────────────────────────");
                sb.append(xvo.f39517a);
            } else {
                sb.append(xvo.f39517a);
                sb.append("╚═══════════════════════════════════════════════════════════════════════════════════════════════════");
            }
        }
        return sb.toString();
    }
}
