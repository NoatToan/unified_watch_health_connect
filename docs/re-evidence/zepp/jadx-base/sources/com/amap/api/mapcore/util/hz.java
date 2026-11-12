package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class hz {
    private static HashMap<String, String> a = new HashMap<>();

    public static void a(Context context, gt gtVar, String str, String str2) {
        if (gtVar == null || TextUtils.isEmpty(gtVar.a())) {
            return;
        }
        String str3 = str + gtVar.a();
        a.put(gtVar.a() + str, str2);
        if (context == null || TextUtils.isEmpty(str3) || TextUtils.isEmpty("d7afbc6a38848a6801f6e449f3ec8e53") || TextUtils.isEmpty(str2)) {
            return;
        }
        String strG = gu.g(gh.a(gu.a(str2)));
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("d7afbc6a38848a6801f6e449f3ec8e53", 0).edit();
        editorEdit.putString(str3, strG);
        editorEdit.commit();
    }

    public static String a(Context context, gt gtVar, String str) {
        if (gtVar == null || TextUtils.isEmpty(gtVar.a())) {
            return null;
        }
        String str2 = a.get(gtVar.a() + str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String str3 = str + gtVar.a();
        return (context == null || TextUtils.isEmpty(str3)) ? "" : gu.a(gh.b(gu.e(context.getSharedPreferences("d7afbc6a38848a6801f6e449f3ec8e53", 0).getString(str3, ""))));
    }
}
