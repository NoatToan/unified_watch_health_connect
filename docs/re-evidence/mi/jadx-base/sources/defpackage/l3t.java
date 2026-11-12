package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class l3t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static HashMap<String, String> f24619a = new HashMap<>();

    public static String a(Context context, o0t o0tVar, String str) {
        if (o0tVar == null || TextUtils.isEmpty(o0tVar.a())) {
            return null;
        }
        String str2 = f24619a.get(o0tVar.a() + str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String str3 = str + o0tVar.a();
        return (context == null || TextUtils.isEmpty(str3)) ? "" : p0t.g(d0t.e(p0t.x(context.getSharedPreferences("d7afbc6a38848a6801f6e449f3ec8e53", 0).getString(str3, ""))));
    }

    public static void b(Context context, o0t o0tVar, String str, String str2) {
        if (o0tVar == null || TextUtils.isEmpty(o0tVar.a())) {
            return;
        }
        String str3 = str + o0tVar.a();
        f24619a.put(o0tVar.a() + str, str2);
        if (context == null || TextUtils.isEmpty(str3) || TextUtils.isEmpty("d7afbc6a38848a6801f6e449f3ec8e53") || TextUtils.isEmpty(str2)) {
            return;
        }
        String strD = p0t.D(d0t.c(p0t.n(str2)));
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("d7afbc6a38848a6801f6e449f3ec8e53", 0).edit();
        editorEdit.putString(str3, strD);
        editorEdit.commit();
    }
}
