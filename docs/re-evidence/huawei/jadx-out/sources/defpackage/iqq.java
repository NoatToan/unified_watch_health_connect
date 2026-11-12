package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes9.dex */
public class iqq {
    public static void c(lmm lmmVar, String str, boolean z) {
        if (b(str)) {
            lmf.d().d(lmmVar);
        } else if (a(lmmVar.d(), lmmVar.b()) || z) {
            lmf.d().d(lmmVar);
        }
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "operationPushMsg".equals(str);
    }

    public static boolean a(String str, String str2) {
        return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) ? false : true;
    }

    public static lmm d(String str, String str2, String str3, String str4, Uri uri) {
        if ("operationPushMsg".equals(str)) {
            return new lmm.e().c(0).d(str2).e(str3).c(str4).a(uri.toString()).b(uri.getQueryParameter("pushName")).e();
        }
        return new lmm.e().c(1).c(str4).d(str2).a(uri.toString()).e(str3).b(uri.getQueryParameter("pushName")).e();
    }
}
