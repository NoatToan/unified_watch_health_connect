package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class r1t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0t f32091a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Map<String, r1t> f32092a = new HashMap();
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f32093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f32094b;
        public String c;

        public b(String str, String str2, String str3) {
            this.f32093a = str;
            this.f32094b = str2;
            this.c = str3;
        }

        public static List<b> c(String str) {
            if (TextUtils.isEmpty(str)) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(d(jSONArray.getJSONObject(i)));
                }
                return arrayList;
            } catch (Throwable unused) {
                return new ArrayList();
            }
        }

        public static b d(JSONObject jSONObject) {
            try {
                return new b(jSONObject.optString("sdkVersion"), jSONObject.optString("cpuType"), jSONObject.optString(MiuiCursorConstants.CONTENT));
            } catch (Throwable unused) {
                return null;
            }
        }

        public static JSONArray e(List<b> list) {
            if (list == null) {
                return new JSONArray();
            }
            JSONArray jSONArray = new JSONArray();
            for (b bVar : list) {
                if (bVar != null && !TextUtils.isEmpty(bVar.c)) {
                    jSONArray.put(bVar.f());
                }
            }
            return jSONArray;
        }

        public final JSONObject f() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("sdkVersion", this.f32093a);
                jSONObject.put("cpuType", this.f32094b);
                jSONObject.put(MiuiCursorConstants.CONTENT, this.c);
                return jSONObject;
            } catch (Throwable unused) {
                return new JSONObject();
            }
        }

        public final boolean g(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                str = this.f32093a;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = this.f32094b;
            }
            return this.f32093a.equals(str) && this.f32094b.equals(str2);
        }
    }

    public r1t(o0t o0tVar) {
        this.f32091a = o0tVar;
    }

    public static String a(Context context, String str, String str2) {
        return e(context, "C7ADB20F22F238708BA5EE26D0401DB9" + m0t.d(str), "ik".concat(String.valueOf(str2)));
    }

    public static r1t c(o0t o0tVar) {
        if (o0tVar == null || TextUtils.isEmpty(o0tVar.a())) {
            return null;
        }
        if (a.f32092a.get(o0tVar.a()) == null) {
            a.f32092a.put(o0tVar.a(), new r1t(o0tVar));
        }
        return a.f32092a.get(o0tVar.a());
    }

    public static String e(Context context, String str, String str2) {
        return (context == null || TextUtils.isEmpty(str2)) ? "" : p0t.g(d0t.e(p0t.x(context.getSharedPreferences(str, 0).getString(str2, ""))));
    }

    public static void f(Context context, String str, String str2, String str3) {
        if (str3 == null || TextUtils.isEmpty(str)) {
            return;
        }
        g(context, "C7ADB20F22F238708BA5EE26D0401DB9" + m0t.d(str), "ik".concat(String.valueOf(str2)), str3);
    }

    public static void g(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return;
        }
        String strD = p0t.D(d0t.c(p0t.n(str3)));
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putString(str2, strD);
        editorEdit.commit();
    }

    public final String b(Context context, String str, String str2, String str3) {
        o0t o0tVar;
        if (context != null && (o0tVar = this.f32091a) != null && !TextUtils.isEmpty(o0tVar.a())) {
            List<b> listC = b.c(a(context, this.f32091a.a(), str3));
            if (listC.size() == 0) {
                return "";
            }
            for (int i = 0; i < listC.size(); i++) {
                b bVar = listC.get(i);
                if (bVar.g(str, str2)) {
                    return bVar.c;
                }
            }
        }
        return null;
    }

    public final void d(Context context, String str, String str2, String str3, String str4) {
        o0t o0tVar;
        if (context == null || (o0tVar = this.f32091a) == null || TextUtils.isEmpty(o0tVar.a())) {
            return;
        }
        List<b> listC = b.c(a(context, this.f32091a.a(), str3));
        for (int i = 0; i < listC.size(); i++) {
            b bVar = listC.get(i);
            if (bVar.g(str, str2)) {
                bVar.c = str4;
                f(context, this.f32091a.a(), str3, b.e(listC).toString());
                return;
            }
        }
        listC.add(new b(str, str2, str4));
        f(context, this.f32091a.a(), str3, b.e(listC).toString());
    }
}
