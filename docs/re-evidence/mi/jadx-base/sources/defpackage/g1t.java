package defpackage;

import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class g1t {
    public static int e = 1;
    public static int f = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18481b;
    public long c = System.currentTimeMillis();
    public String d;

    public g1t(int i, String str, String str2) {
        this.f18480a = str2;
        this.f18481b = i;
        this.d = str;
    }

    public static String b(int i) {
        return i == f ? "error" : "info";
    }

    public static String c(List<g1t> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<g1t> it = list.iterator();
                    while (it.hasNext()) {
                        String strG = g(it.next());
                        if (!TextUtils.isEmpty(strG)) {
                            jSONArray.put(strG);
                        }
                    }
                    return jSONArray.toString();
                }
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    public static g1t d(String str, String str2) {
        return new g1t(e, str, str2);
    }

    public static boolean e(g1t g1tVar) {
        return (g1tVar == null || TextUtils.isEmpty(g1tVar.f())) ? false : true;
    }

    public static String g(g1t g1tVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("info", g1tVar.f());
            jSONObject.put(CommonConstants.KEY_SESSION, g1tVar.j());
            jSONObject.put("timestamp", g1tVar.c);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static g1t h(String str, String str2) {
        return new g1t(f, str, str2);
    }

    public final int a() {
        return this.f18481b;
    }

    public final String f() {
        new JSONObject();
        return this.f18480a;
    }

    public final String i() {
        return b(this.f18481b);
    }

    public final String j() {
        return this.d;
    }
}
