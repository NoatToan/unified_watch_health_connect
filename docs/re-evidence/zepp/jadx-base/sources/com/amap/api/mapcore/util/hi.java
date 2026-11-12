package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class hi {
    private gt a;

    public static class a {
        public static Map<String, hi> a = new HashMap();
    }

    public static class b {
        private String a;
        private String b;
        private String c;

        public b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                str = this.a;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = this.b;
            }
            return this.a.equals(str) && this.b.equals(str2);
        }

        private JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, this.a);
                jSONObject.put("cpuType", this.b);
                jSONObject.put("content", this.c);
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
                if (bVar != null) {
                    if (!TextUtils.isEmpty(bVar.c)) {
                        jSONArray.put(bVar.a());
                    }
                }
            }
            return jSONArray;
        }

        private static b a(JSONObject jSONObject) {
            try {
                return new b(jSONObject.optString(RemoteConfigConstants.RequestFieldKey.SDK_VERSION), jSONObject.optString("cpuType"), jSONObject.optString("content"));
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

    private hi(gt gtVar) {
        this.a = gtVar;
    }

    public static hi a(gt gtVar) {
        if (gtVar == null || TextUtils.isEmpty(gtVar.a())) {
            return null;
        }
        if (a.a.get(gtVar.a()) == null) {
            a.a.put(gtVar.a(), new hi(gtVar));
        }
        return a.a.get(gtVar.a());
    }

    private static void b(Context context, String str, String str2, String str3) {
        if (str3 == null || TextUtils.isEmpty(str)) {
            return;
        }
        c(context, "C7ADB20F22F238708BA5EE26D0401DB9" + gr.b(str), "ik".concat(String.valueOf(str2)), str3);
    }

    private static void c(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return;
        }
        String strG = gu.g(gh.a(gu.a(str3)));
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putString(str2, strG);
        editorEdit.commit();
    }

    private static String b(Context context, String str, String str2) {
        return (context == null || TextUtils.isEmpty(str2)) ? "" : gu.a(gh.b(gu.e(context.getSharedPreferences(str, 0).getString(str2, ""))));
    }

    public final String a(Context context, String str, String str2, String str3) {
        gt gtVar;
        if (context != null && (gtVar = this.a) != null && !TextUtils.isEmpty(gtVar.a())) {
            List<b> listA = b.a(a(context, this.a.a(), str3));
            if (listA.size() == 0) {
                return "";
            }
            for (int i = 0; i < listA.size(); i++) {
                b bVar = listA.get(i);
                if (bVar.a(str, str2)) {
                    return bVar.c;
                }
            }
        }
        return null;
    }

    public final void a(Context context, String str, String str2, String str3, String str4) {
        gt gtVar;
        if (context == null || (gtVar = this.a) == null || TextUtils.isEmpty(gtVar.a())) {
            return;
        }
        List<b> listA = b.a(a(context, this.a.a(), str3));
        for (int i = 0; i < listA.size(); i++) {
            b bVar = listA.get(i);
            if (bVar.a(str, str2)) {
                bVar.c = str4;
                b(context, this.a.a(), str3, b.a(listA).toString());
                return;
            }
        }
        listA.add(new b(str, str2, str4));
        b(context, this.a.a(), str3, b.a(listA).toString());
    }

    private static String a(Context context, String str, String str2) {
        return b(context, "C7ADB20F22F238708BA5EE26D0401DB9" + gr.b(str), "ik".concat(String.valueOf(str2)));
    }
}
