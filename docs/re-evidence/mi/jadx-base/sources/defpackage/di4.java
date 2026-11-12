package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public interface di4 {
    static Uri b(di4 di4Var) {
        String strC = di4Var.c("exo_redir", null);
        if (strC == null) {
            return null;
        }
        return Uri.parse(strC);
    }

    static long d(di4 di4Var) {
        return di4Var.a("exo_len", -1L);
    }

    long a(String str, long j);

    String c(String str, String str2);
}
