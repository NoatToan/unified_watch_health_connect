package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.operation.utils.CloudParamKeys;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ix f2948a;

    public kb(String str) {
        this.f2948a = null;
        try {
            this.f2948a = new ix.a(str, "1.0", "1.0.0").a(new String[]{CloudParamKeys.INFO}).a();
        } catch (ik unused) {
        }
    }

    public final void a(Context context, ix ixVar) {
        JSONArray jSONArray;
        if (ixVar == null) {
            return;
        }
        ArrayList<ix> arrayList = new ArrayList();
        arrayList.add(ixVar);
        if (arrayList.size() == 0) {
            jSONArray = new JSONArray();
        } else {
            jSONArray = new JSONArray();
            for (ix ixVar2 : arrayList) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("a", ixVar2.a());
                    jSONObject.put("b", ixVar2.b());
                    jSONObject.put("c", ixVar2.c());
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = 0; ixVar2.f() != null && i < ixVar2.f().length; i++) {
                        jSONArray2.put(ixVar2.f()[i]);
                    }
                    jSONObject.put("d", jSONArray2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                jSONArray.put(jSONObject);
            }
        }
        String string = jSONArray.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        ka.a(context, this.f2948a, "rbck", string);
    }

    public final List<ix> a(Context context) {
        ix ixVarA;
        try {
            JSONArray jSONArray = new JSONArray(ka.a(context, this.f2948a, "rbck"));
            if (jSONArray.length() == 0) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    ixVarA = a(jSONArray.getJSONObject(i));
                } catch (JSONException unused) {
                    ixVarA = null;
                }
                if (ixVarA != null) {
                    arrayList.add(ixVarA);
                }
            }
            return arrayList;
        } catch (JSONException unused2) {
            return new ArrayList();
        }
    }

    private static ix a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String strOptString = jSONObject.optString("a");
            String strOptString2 = jSONObject.optString("b");
            String strOptString3 = jSONObject.optString("c");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("d");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i));
            }
            return new ix.a(strOptString, strOptString2, strOptString).a(strOptString3).a((String[]) arrayList.toArray(new String[0])).a();
        } catch (Throwable unused) {
            return null;
        }
    }
}
