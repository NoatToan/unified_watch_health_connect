package defpackage;

import com.fasterxml.jackson.core.Version;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class jpq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f23008a = Pattern.compile("[-_./;:]");

    public static Version a(String str, String str2, String str3) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.length() > 0) {
                String[] strArrSplit = f23008a.split(strTrim);
                return new Version(b(strArrSplit[0]), strArrSplit.length > 1 ? b(strArrSplit[1]) : 0, strArrSplit.length > 2 ? b(strArrSplit[2]) : 0, strArrSplit.length > 3 ? strArrSplit[3] : null, str2, str3);
            }
        }
        return Version.unknownVersion();
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt > '9' || cCharAt < '0') {
                break;
            }
            i = (i * 10) + (cCharAt - '0');
        }
        return i;
    }

    public static final void c() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }
}
