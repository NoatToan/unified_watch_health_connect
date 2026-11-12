package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class js {
    private gt a;

    public js(String str) {
        this.a = null;
        try {
            this.a = new gt.a(str, "1.0", "1.0.0").a(new String[]{"info"}).a();
        } catch (gi unused) {
        }
    }

    public final void a(Context context, gt gtVar) {
        if (gtVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(gtVar);
        String string = a(arrayList).toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        hz.a(context, this.a, "rbck", string);
    }

    public final List<gt> a(Context context) {
        try {
            return a(new JSONArray(hz.a(context, this.a, "rbck")));
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    private static JSONArray a(List<gt> list) {
        if (list.size() == 0) {
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<gt> it2 = list.iterator();
        while (it2.hasNext()) {
            jSONArray.put(a(it2.next()));
        }
        return jSONArray;
    }

    private static JSONObject a(gt gtVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("a", gtVar.a());
            jSONObject.put("b", gtVar.b());
            jSONObject.put("c", gtVar.c());
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; gtVar.g() != null && i < gtVar.g().length; i++) {
                jSONArray.put(gtVar.g()[i]);
            }
            jSONObject.put(GoogleApiAvailabilityLight.a, jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private static gt a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String strOptString = jSONObject.optString("a");
            String strOptString2 = jSONObject.optString("b");
            String strOptString3 = jSONObject.optString("c");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(GoogleApiAvailabilityLight.a);
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i));
            }
            return new gt.a(strOptString, strOptString2, strOptString).a(strOptString3).a((String[]) arrayList.toArray(new String[0])).a();
        } catch (Throwable unused) {
            return null;
        }
    }

    private static List<gt> a(JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            gt gtVarA = null;
            try {
                gtVarA = a(jSONArray.getJSONObject(i));
            } catch (JSONException unused) {
            }
            if (gtVarA != null) {
                arrayList.add(gtVarA);
            }
        }
        return arrayList;
    }
}
