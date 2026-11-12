package defpackage;

import com.fasterxml.jackson.core.Versioned;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes21.dex */
public class yj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f53407c = Pattern.compile("[-_./;:]");

    protected yj() {
    }

    public static wu e(Class<?> cls) {
        wu wuVarVersion;
        try {
            Class<?> cls2 = Class.forName(cls.getPackage().getName() + ".PackageVersion", true, cls.getClassLoader());
            try {
                wuVarVersion = ((Versioned) cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).version();
            } catch (Exception unused) {
                throw new IllegalArgumentException("Failed to get Versioned out of " + cls2);
            }
        } catch (Exception unused2) {
            wuVarVersion = null;
        }
        return wuVarVersion == null ? wu.d() : wuVarVersion;
    }

    public static wu a(String str, String str2, String str3) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.length() > 0) {
                String[] strArrSplit = f53407c.split(strTrim);
                return new wu(b(strArrSplit[0]), strArrSplit.length > 1 ? b(strArrSplit[1]) : 0, strArrSplit.length > 2 ? b(strArrSplit[2]) : 0, strArrSplit.length > 3 ? strArrSplit[3] : null, str2, str3);
            }
        }
        return wu.d();
    }

    protected static int b(String str) {
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

    public static final void d() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }
}
