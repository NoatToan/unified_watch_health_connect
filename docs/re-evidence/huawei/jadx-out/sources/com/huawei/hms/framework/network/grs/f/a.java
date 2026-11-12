package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.huawei.hms.framework.network.grs.local.model.a f13292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected List<com.huawei.hms.framework.network.grs.local.model.b> f13293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f13294c = false;
    protected boolean d = false;
    protected Set<String> e = new HashSet(16);

    public abstract int b(String str);

    public abstract int c(String str);

    public abstract int g(String str);

    public int f(String str) {
        try {
            b(new JSONObject(str).getJSONArray("services"));
            return 0;
        } catch (JSONException e) {
            Logger.w("AbstractLocalManager", "parse 2.0 services failed maybe because of json style.please check! %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    public int e(String str) {
        JSONArray jSONArray;
        this.f13293b = new ArrayList(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("countryOrAreaGroups")) {
                jSONArray = jSONObject.getJSONArray("countryOrAreaGroups");
            } else if (jSONObject.has("countryGroups")) {
                jSONArray = jSONObject.getJSONArray("countryGroups");
            } else {
                Logger.e("AbstractLocalManager", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONArray = null;
            }
            if (jSONArray == null) {
                return -1;
            }
            this.f13293b.addAll(a(jSONArray));
            return 0;
        } catch (JSONException e) {
            Logger.w("AbstractLocalManager", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    public boolean d(String str) {
        String str2;
        try {
            this.f13292a = new com.huawei.hms.framework.network.grs.local.model.a();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("name")) {
                this.f13292a.b(jSONObject.getString("name"));
            }
            if (jSONObject.has("cacheControl")) {
                this.f13292a.a(jSONObject.getLong("cacheControl"));
            }
            if (jSONObject.has("services")) {
                b(jSONObject.getJSONArray("services"));
            }
            if (jSONObject.has("countryGroups")) {
                JSONArray jSONArray = jSONObject.getJSONArray("countryGroups");
                ArrayList arrayList = new ArrayList(16);
                this.f13293b = arrayList;
                arrayList.addAll(a(jSONArray));
            }
            Logger.i("AbstractLocalManager", "parse from sp services size : %d, countryGroups size: %d:", Integer.valueOf(this.e.size()), Integer.valueOf(this.f13293b.size()));
            return true;
        } catch (JSONException unused) {
            str2 = "Parse local config from sp failed, JSONException";
            Logger.w("AbstractLocalManager", str2);
            return false;
        } catch (Throwable th) {
            str2 = "Parse local config from sp failed, Throwable:" + StringUtils.anonymizeMessage(th.getMessage());
            Logger.w("AbstractLocalManager", str2);
            return false;
        }
    }

    public boolean d() {
        return this.f13294c;
    }

    public Set<String> c() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006b A[PHI: r10
      0x006b: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v4 java.lang.String) binds: [B:17:0x0060, B:20:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1 A[PHI: r5
      0x00d1: PHI (r5v9 java.lang.String) = (r5v8 java.lang.String), (r5v10 java.lang.String) binds: [B:33:0x00c6, B:36:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    protected void b(JSONArray jSONArray) throws JSONException {
        List<com.huawei.hms.framework.network.grs.local.model.b> listA;
        String string;
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            com.huawei.hms.framework.network.grs.local.model.c cVar = new com.huawei.hms.framework.network.grs.local.model.c();
            String string2 = jSONObject.getString("name");
            cVar.b(string2);
            if (!this.e.contains(string2)) {
                this.e.add(string2);
                if (this.d) {
                    cVar.c(jSONObject.getString("routeBy"));
                    JSONArray jSONArray2 = jSONObject.getJSONArray("servings");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        JSONObject jSONObject2 = (JSONObject) jSONArray2.get(i2);
                        com.huawei.hms.framework.network.grs.local.model.d dVar = new com.huawei.hms.framework.network.grs.local.model.d();
                        String str = "countryOrAreaGroup";
                        if (jSONObject2.has("countryOrAreaGroup")) {
                            string = jSONObject2.getString(str);
                        } else {
                            str = "countryGroup";
                            if (jSONObject2.has("countryGroup")) {
                                string = jSONObject2.getString(str);
                            } else {
                                Logger.v("AbstractLocalManager", "maybe this service{%s} routeBy is unconditional.", string2);
                                string = "no-country";
                            }
                        }
                        dVar.a(string);
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("addresses");
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
                        Iterator<String> itKeys = jSONObject3.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            String string3 = jSONObject3.getString(next);
                            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string3)) {
                                concurrentHashMap.put(next, jSONObject3.getString(next));
                            }
                        }
                        dVar.a(concurrentHashMap);
                        cVar.a(dVar.b(), dVar);
                    }
                    String str2 = "countryOrAreaGroups";
                    if (jSONObject.has("countryOrAreaGroups")) {
                        listA = a(jSONObject.getJSONArray(str2));
                    } else {
                        str2 = "countryGroups";
                        if (jSONObject.has("countryGroups")) {
                            listA = a(jSONObject.getJSONArray(str2));
                        } else {
                            Logger.i("AbstractLocalManager", "service use default countryOrAreaGroup");
                            listA = null;
                        }
                    }
                    cVar.a(listA);
                    if (this.f13292a == null) {
                        this.f13292a = new com.huawei.hms.framework.network.grs.local.model.a();
                    }
                    this.f13292a.a(string2, cVar);
                }
            }
        }
    }

    public com.huawei.hms.framework.network.grs.local.model.a b() {
        return this.f13292a;
    }

    public void a(Context context, List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (String str : list) {
            Logger.d("AbstractLocalManager", "getBatchLoadSdkSuccessFlag file:" + str);
            if (TextUtils.isEmpty(str) || !Pattern.matches("^grs_sdk_global_route_config_[a-zA-Z]+\\.json$", str)) {
                Logger.d("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, skipped.", str);
            } else {
                Object[] objArr = {str};
                if (i(com.huawei.hms.framework.network.grs.h.c.a(GrsApp.getInstance().getBrand("/") + str, context)) == 0) {
                    Logger.d("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, sucess.", objArr);
                } else {
                    Logger.w("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, failure.", objArr);
                }
            }
        }
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObjectB = this.f13292a.b();
        if (this.f13293b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<com.huawei.hms.framework.network.grs.local.model.b> it = this.f13293b.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().c());
            }
            jSONObjectB.put("countryGroups", jSONArray);
        }
        return jSONObjectB;
    }

    public Map<String, String> a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, boolean z) {
        com.huawei.hms.framework.network.grs.local.model.a aVar2 = this.f13292a;
        if (aVar2 == null) {
            Logger.w("AbstractLocalManager", "application data is null.");
            return null;
        }
        com.huawei.hms.framework.network.grs.local.model.c cVarA = aVar2.a(str);
        if (cVarA == null) {
            Logger.w("AbstractLocalManager", "service not found in local config{%s}", str);
            return null;
        }
        String strB = e.b(context, aVar, cVarA.b(), grsBaseInfo, z);
        if (strB == null) {
            Logger.w("AbstractLocalManager", "country not found by routeby in local config{%s}", cVarA.b());
            return null;
        }
        List<com.huawei.hms.framework.network.grs.local.model.b> listA = cVarA.a();
        com.huawei.hms.framework.network.grs.local.model.d dVarA = cVarA.a((listA == null || listA.size() == 0) ? a(strB) : a(listA, grsBaseInfo, strB).get(strB));
        if (dVarA == null) {
            return null;
        }
        return dVarA.a();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004e A[PHI: r6
      0x004e: PHI (r6v7 java.lang.String) = (r6v6 java.lang.String), (r6v9 java.lang.String) binds: [B:10:0x0043, B:13:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    public List<com.huawei.hms.framework.network.grs.local.model.b> a(JSONArray jSONArray) throws JSONException {
        JSONArray jSONArray2;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            com.huawei.hms.framework.network.grs.local.model.b bVar = new com.huawei.hms.framework.network.grs.local.model.b();
            bVar.b(jSONObject.getString("id"));
            bVar.c(jSONObject.getString("name"));
            bVar.a(jSONObject.getString("description"));
            String str = "countriesOrAreas";
            if (jSONObject.has("countriesOrAreas")) {
                jSONArray2 = jSONObject.getJSONArray(str);
            } else {
                str = "countries";
                if (jSONObject.has("countries")) {
                    jSONArray2 = jSONObject.getJSONArray(str);
                } else {
                    Logger.w("AbstractLocalManager", "current country or area group has not config countries or areas.");
                    jSONArray2 = null;
                }
            }
            HashSet hashSet = new HashSet(16);
            if (jSONArray2 == null || jSONArray2.length() == 0) {
                return new ArrayList();
            }
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                hashSet.add((String) jSONArray2.get(i2));
            }
            bVar.a(hashSet);
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if ("no_route_country".equals(str)) {
            return "no-country";
        }
        List<com.huawei.hms.framework.network.grs.local.model.b> list = this.f13293b;
        if (list != null && !list.isEmpty()) {
            for (com.huawei.hms.framework.network.grs.local.model.b bVar : this.f13293b) {
                if (bVar.a().contains(str)) {
                    return bVar.b();
                }
            }
        }
        return null;
    }

    public String a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z) {
        Map<String, String> mapA = a(context, aVar, grsBaseInfo, str, z);
        if (mapA != null) {
            return mapA.get(str2);
        }
        Logger.w("AbstractLocalManager", "addresses not found by routeby in local config{%s}", str);
        return null;
    }

    int a(String str, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(GrsApp.getInstance().getBrand("/"));
        sb.append(str);
        return b(sb.toString(), context) != 0 ? -1 : 0;
    }

    private int i(String str) {
        List<com.huawei.hms.framework.network.grs.local.model.b> list;
        int iE;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return (!this.d || !((list = this.f13293b) == null || list.isEmpty()) || (iE = e(str)) == 0) ? f(str) : iE;
    }

    private int h(String str) {
        int iC;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (this.d && (iC = c(str)) != 0) {
            return iC;
        }
        int iB = b(str);
        return iB != 0 ? iB : g(str);
    }

    private int b(String str, Context context) {
        if (h(com.huawei.hms.framework.network.grs.h.c.a(str, context)) != 0) {
            return -1;
        }
        Logger.i("AbstractLocalManager", "load APP_CONFIG_FILE success{%s}.", str);
        return 0;
    }

    private Map<String, String> a(List<com.huawei.hms.framework.network.grs.local.model.b> list, GrsBaseInfo grsBaseInfo, String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        concurrentHashMap.put("no_route_country", "no-country");
        for (com.huawei.hms.framework.network.grs.local.model.b bVar : list) {
            if (bVar.a().contains(grsBaseInfo.getIssueCountry())) {
                concurrentHashMap.put(grsBaseInfo.getIssueCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getRegCountry())) {
                concurrentHashMap.put(grsBaseInfo.getRegCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getSerCountry())) {
                concurrentHashMap.put(grsBaseInfo.getSerCountry(), bVar.b());
            }
            if (bVar.a().contains(str)) {
                Logger.v("AbstractLocalManager", "get countryGroupID from geoIp");
                concurrentHashMap.put(str, bVar.b());
            }
        }
        return concurrentHashMap;
    }
}
