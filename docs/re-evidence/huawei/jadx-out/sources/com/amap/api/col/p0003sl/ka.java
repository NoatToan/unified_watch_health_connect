package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, String> f2947a = new HashMap<>();

    public static void a(Context context, ix ixVar, String str, String str2) {
        if (ixVar == null || TextUtils.isEmpty(ixVar.a())) {
            return;
        }
        String str3 = str + ixVar.a();
        f2947a.put(ixVar.a() + str, str2);
        if (context == null || TextUtils.isEmpty(str3) || TextUtils.isEmpty("d7afbc6a38848a6801f6e449f3ec8e53") || TextUtils.isEmpty(str2)) {
            return;
        }
        String strG = iy.g(ij.a(iy.a(str2)));
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("d7afbc6a38848a6801f6e449f3ec8e53", 0).edit();
        editorEdit.putString(str3, strG);
        editorEdit.commit();
    }

    public static String a(Context context, ix ixVar, String str) {
        if (ixVar == null || TextUtils.isEmpty(ixVar.a())) {
            return null;
        }
        String str2 = f2947a.get(ixVar.a() + str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String str3 = str + ixVar.a();
        return (context == null || TextUtils.isEmpty(str3)) ? "" : iy.a(ij.b(iy.d(context.getSharedPreferences("d7afbc6a38848a6801f6e449f3ec8e53", 0).getString(str3, ""))));
    }
}
