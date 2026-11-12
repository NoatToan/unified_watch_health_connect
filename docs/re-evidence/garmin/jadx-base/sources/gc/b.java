package gc;

import fa.r;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f76777c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f76778d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f76779a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f76780b = new StringBuilder();

    public static String a(r rVar, StringBuilder sb3) {
        boolean z14 = false;
        sb3.setLength(0);
        int i14 = rVar.f70055b;
        int i15 = rVar.f70056c;
        while (i14 < i15 && !z14) {
            char c14 = (char) rVar.f70054a[i14];
            if ((c14 < 'A' || c14 > 'Z') && ((c14 < 'a' || c14 > 'z') && !((c14 >= '0' && c14 <= '9') || c14 == '#' || c14 == '-' || c14 == '.' || c14 == '_'))) {
                z14 = true;
            } else {
                i14++;
                sb3.append(c14);
            }
        }
        rVar.H(i14 - rVar.f70055b);
        return sb3.toString();
    }

    public static String b(r rVar, StringBuilder sb3) {
        c(rVar);
        if (rVar.a() == 0) {
            return null;
        }
        String strA = a(rVar, sb3);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) rVar.u());
    }

    public static void c(r rVar) {
        while (true) {
            for (boolean z14 = true; rVar.a() > 0 && z14; z14 = false) {
                int i14 = rVar.f70055b;
                byte[] bArr = rVar.f70054a;
                byte b14 = bArr[i14];
                char c14 = (char) b14;
                if (c14 == '\t' || c14 == '\n' || c14 == '\f' || c14 == '\r' || c14 == ' ') {
                    rVar.H(1);
                } else {
                    int i15 = rVar.f70056c;
                    int i16 = i14 + 2;
                    if (i16 <= i15) {
                        int i17 = i14 + 1;
                        if (b14 == 47 && bArr[i17] == 42) {
                            while (true) {
                                int i18 = i16 + 1;
                                if (i18 >= i15) {
                                    break;
                                }
                                if (((char) bArr[i16]) == '*' && ((char) bArr[i18]) == '/') {
                                    i16 += 2;
                                    i15 = i16;
                                } else {
                                    i16 = i18;
                                }
                            }
                            rVar.H(i15 - rVar.f70055b);
                        }
                    }
                }
            }
            return;
        }
    }
}
