package com.amap.api.mapcore.util;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class he {
    public static int a = 1;
    public static int b = 2;
    private String c;
    private int d;
    private long e = System.currentTimeMillis();
    private String f;

    private he(int i, String str, String str2) {
        this.c = str2;
        this.d = i;
        this.f = str;
    }

    public static he a(String str, String str2) {
        return new he(a, str, str2);
    }

    public static he b(String str, String str2) {
        return new he(b, str, str2);
    }

    public final String c() {
        return a(this.d);
    }

    public final int a() {
        return this.d;
    }

    public final String b() {
        new JSONObject();
        return this.c;
    }

    public static String a(int i) {
        return i == b ? "error" : "info";
    }

    public static boolean a(he heVar) {
        return (heVar == null || TextUtils.isEmpty(heVar.b())) ? false : true;
    }

    private static String b(he heVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("info", heVar.b());
            jSONObject.put(com.google.firebase.crashlytics.internal.settings.b.c, heVar.f);
            jSONObject.put("timestamp", heVar.e);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(List<he> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<he> it2 = list.iterator();
                    while (it2.hasNext()) {
                        String strB = b(it2.next());
                        if (!TextUtils.isEmpty(strB)) {
                            jSONArray.put(strB);
                        }
                    }
                    return jSONArray.toString();
                }
            } catch (Throwable unused) {
            }
        }
        return "";
    }
}
