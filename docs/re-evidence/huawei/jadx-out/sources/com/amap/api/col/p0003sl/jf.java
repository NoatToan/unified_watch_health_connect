package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class jf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ix f2872a;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Map<String, jf> f2873a = new HashMap();
    }

    public static jf a(ix ixVar) {
        if (ixVar == null || TextUtils.isEmpty(ixVar.a())) {
            return null;
        }
        if (a.f2873a.get(ixVar.a()) == null) {
            a.f2873a.put(ixVar.a(), new jf(ixVar));
        }
        return a.f2873a.get(ixVar.a());
    }

    private jf(ix ixVar) {
        this.f2872a = ixVar;
    }

    public final String a(Context context, String str, String str2, String str3) {
        ix ixVar;
        if (context == null || (ixVar = this.f2872a) == null || TextUtils.isEmpty(ixVar.a())) {
            return null;
        }
        List<b> listA = b.a(a(context, this.f2872a.a(), str3));
        if (listA.size() == 0) {
            return "";
        }
        for (int i = 0; i < listA.size(); i++) {
            b bVar = listA.get(i);
            if (bVar.a(str, str2)) {
                return bVar.f2876c;
            }
        }
        return null;
    }

    public final void a(Context context, String str, String str2, String str3, String str4) {
        ix ixVar;
        if (context == null || (ixVar = this.f2872a) == null || TextUtils.isEmpty(ixVar.a())) {
            return;
        }
        List<b> listA = b.a(a(context, this.f2872a.a(), str3));
        for (int i = 0; i < listA.size(); i++) {
            b bVar = listA.get(i);
            if (bVar.a(str, str2)) {
                bVar.f2876c = str4;
                b(context, this.f2872a.a(), str3, b.a(listA).toString());
                return;
            }
        }
        listA.add(new b(str, str2, str4));
        b(context, this.f2872a.a(), str3, b.a(listA).toString());
    }

    private static void b(Context context, String str, String str2, String str3) {
        if (str3 == null || TextUtils.isEmpty(str)) {
            return;
        }
        c(context, "C7ADB20F22F238708BA5EE26D0401DB9" + it.b(str), "ik".concat(String.valueOf(str2)), str3);
    }

    private static String a(Context context, String str, String str2) {
        return b(context, "C7ADB20F22F238708BA5EE26D0401DB9" + it.b(str), "ik".concat(String.valueOf(str2)));
    }

    private static void c(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return;
        }
        String strG = iy.g(ij.a(iy.a(str3)));
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putString(str2, strG);
        editorEdit.commit();
    }

    private static String b(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str2)) {
            return "";
        }
        return iy.a(ij.b(iy.d(context.getSharedPreferences(str, 0).getString(str2, ""))));
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f2874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f2875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f2876c;

        public b(String str, String str2, String str3) {
            this.f2874a = str;
            this.f2875b = str2;
            this.f2876c = str3;
        }

        public final boolean a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                str = this.f2874a;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = this.f2875b;
            }
            return this.f2874a.equals(str) && this.f2875b.equals(str2);
        }

        private JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("sdkVersion", this.f2874a);
                jSONObject.put("cpuType", this.f2875b);
                jSONObject.put("content", this.f2876c);
                return jSONObject;
            } catch (Throwable unused) {
                return new JSONObject();
            }
        }

        public static JSONArray a(List<b> list) {
            if (list == null) {
                return new JSONArray();
            }
            JSONArray jSONArray = new JSONArray();
            for (b bVar : list) {
                if (bVar != null && bVar != null && !TextUtils.isEmpty(bVar.f2876c)) {
                    jSONArray.put(bVar.a());
                }
            }
            return jSONArray;
        }

        private static b a(JSONObject jSONObject) {
            try {
                return new b(jSONObject.optString("sdkVersion"), jSONObject.optString("cpuType"), jSONObject.optString("content"));
            } catch (Throwable unused) {
                return null;
            }
        }

        public static List<b> a(String str) {
            if (TextUtils.isEmpty(str)) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(a(jSONArray.getJSONObject(i)));
                }
                return arrayList;
            } catch (Throwable unused) {
                return new ArrayList();
            }
        }
    }
}
