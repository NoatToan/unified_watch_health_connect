package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public class kyf {
    public static String a(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str).append("_").append(str2).append("_").append(str3);
        return stringBuffer.toString();
    }

    public static void a(Context context) {
        kyn.d(context).a();
        kyj.c().b();
        kyk.e(context).d();
        kyh.d(context).c();
        kya.a().b();
        kwt.b().a();
    }
}
