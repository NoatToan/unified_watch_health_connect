package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class lf {
    public static void e(String str, String str2) {
        try {
            lj.a(str, str2);
        } catch (Throwable unused) {
        }
        if (lh.c()) {
            lh.a(".SystemConfig" + File.separator + str, str2);
        }
    }

    public static String c(String str) {
        String strE;
        try {
            strE = lj.e(str);
        } catch (Throwable unused) {
            strE = "";
        }
        if (!kj.c(strE)) {
            return strE;
        }
        return lh.e(".SystemConfig" + File.separator + str);
    }
}
