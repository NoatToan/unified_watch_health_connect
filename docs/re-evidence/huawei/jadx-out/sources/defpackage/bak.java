package defpackage;

import android.text.TextUtils;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class bak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, baj> f894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f895b;
    private final String d;
    private final List<String> e;

    private bak(String str, String str2, Map<String, baj> map, List<String> list) {
        this.f895b = str;
        this.d = str2;
        this.f894a = map;
        this.e = list;
    }

    public String e() {
        return this.f895b;
    }

    String d() {
        return this.d;
    }

    public List<String> c() {
        return this.e;
    }

    Collection<baj> a() {
        return this.f894a.values();
    }

    baj b(String str) {
        return this.f894a.get(str);
    }

    public boolean b() {
        Iterator<baj> it = a().iterator();
        while (it.hasNext()) {
            if (!it.next().r()) {
                return false;
            }
        }
        return true;
    }

    static bak d(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("appBundleId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        String strOptString2 = jSONObject.optString("appVersionName");
        if (TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new bak(strOptString, strOptString2, d(strOptString2, jSONObject), e(jSONObject));
    }

    private static List<String> c(JSONObject jSONObject) throws JSONException {
        List<String> arrayList = Collections.EMPTY_LIST;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("abiFilters");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            arrayList = new ArrayList<>(jSONArrayOptJSONArray.length());
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                String string = jSONArrayOptJSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(string);
                }
            }
        }
        return arrayList;
    }

    private static List<String> e(JSONObject jSONObject) throws JSONException {
        List<String> arrayList = Collections.EMPTY_LIST;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("updateModules");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            arrayList = new ArrayList<>(jSONArrayOptJSONArray.length());
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                String string = jSONArrayOptJSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(string);
                }
            }
        }
        return arrayList;
    }

    private static Map<String, baj> d(String str, JSONObject jSONObject) throws JSONException {
        Map<String, baj> map = Collections.EMPTY_MAP;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("modules");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            List<String> listC = c(jSONObject);
            map = new HashMap<>(jSONArrayOptJSONArray.length());
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                String strOptString = jSONObject2.optString("moduleName");
                if (!TextUtils.isEmpty(strOptString)) {
                    baj bajVarB = baj.b(str, strOptString, listC, jSONObject2);
                    LogUtil.b("Bundle_ModuleDetails", bajVarB.toString());
                    map.put(strOptString, bajVarB);
                }
            }
        }
        return map;
    }
}
