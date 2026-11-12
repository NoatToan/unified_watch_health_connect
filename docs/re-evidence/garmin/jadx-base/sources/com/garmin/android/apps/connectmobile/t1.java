package com.garmin.android.apps.connectmobile;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class t1 {

    public interface a {
        boolean b(ArrayList arrayList, ArrayList arrayList2);
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f45035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f45036b;
    }

    public static class c extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public JSONArray f45037c;
    }

    public static class d extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public JSONObject f45038c;
    }

    public static void a(String[] strArr, String[] strArr2, JSONObject jSONObject, a aVar) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            for (String str : strArr) {
                if (jSONObject.has(str) && !jSONObject.isNull(str)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                    d dVar = new d();
                    dVar.f45035a = str;
                    s1.u(jSONObject2, "requestUrl");
                    jSONObject2.optInt("statusCode");
                    dVar.f45036b = jSONObject2.optBoolean("successful");
                    s1.u(jSONObject2, "errorMessage");
                    dVar.f45038c = jSONObject2.optJSONObject("payload");
                    arrayList.add(dVar);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (strArr2 != null) {
            for (String str2 : strArr2) {
                if (jSONObject.has(str2) && !jSONObject.isNull(str2)) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject(str2);
                    c cVar = new c();
                    cVar.f45035a = str2;
                    s1.u(jSONObject3, "requestUrl");
                    jSONObject3.optInt("statusCode");
                    cVar.f45036b = jSONObject3.optBoolean("successful");
                    s1.u(jSONObject3, "errorMessage");
                    cVar.f45037c = jSONObject3.optJSONArray("payload");
                    arrayList2.add(cVar);
                }
            }
        }
        if (!aVar.b(arrayList, arrayList2)) {
            throw new JSONException("Multi response JSON parsing failed");
        }
    }

    public static String b(JSONArray jSONArray) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("statusCode", 200);
            jSONObject.put("errorMessage", JSONObject.NULL);
            jSONObject.put("payload", jSONArray);
            jSONObject.put("successful", true);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("Groups", jSONObject);
            return jSONObject2.toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
