package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.common.MimeTypes;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class c extends a {
    /* JADX WARN: Code duplicated, block: B:42:0x010e A[Catch: JSONException -> 0x0121, TryCatch #0 {JSONException -> 0x0121, blocks: (B:3:0x000c, B:4:0x001e, B:6:0x0025, B:8:0x003b, B:10:0x0044, B:11:0x0059, B:13:0x005f, B:15:0x0070, B:21:0x0087, B:22:0x009d, B:24:0x00a3, B:26:0x00b7, B:28:0x00bd, B:31:0x00ce, B:16:0x0075, B:18:0x007b, B:19:0x0080, B:32:0x00e2, B:34:0x00ed, B:38:0x00fc, B:40:0x0107, B:42:0x010e, B:43:0x0115, B:35:0x00f2, B:37:0x00f8, B:39:0x0101), top: B:49:0x000c }] */
    @Override // com.huawei.hms.framework.network.grs.f.a
    public int g(String str) {
        JSONObject jSONObject;
        String string;
        String str2 = "countryGroup";
        String str3 = "countryOrAreaGroup";
        try {
            JSONObject jSONObject2 = new JSONObject(str).getJSONObject("services");
            Iterator<String> itKeys = jSONObject2.keys();
            while (true) {
                int i = 0;
                if (!itKeys.hasNext()) {
                    return 0;
                }
                String next = itKeys.next();
                com.huawei.hms.framework.network.grs.local.model.c cVar = new com.huawei.hms.framework.network.grs.local.model.c();
                cVar.b(next);
                if (!this.e.contains(next)) {
                    this.e.add(next);
                    if (this.d) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                        cVar.c(jSONObject3.getString("routeBy"));
                        JSONArray jSONArray = jSONObject3.getJSONArray("servings");
                        while (i < jSONArray.length()) {
                            JSONObject jSONObject4 = (JSONObject) jSONArray.get(i);
                            com.huawei.hms.framework.network.grs.local.model.d dVar = new com.huawei.hms.framework.network.grs.local.model.d();
                            if (jSONObject4.has(str3)) {
                                string = jSONObject4.getString(str3);
                            } else if (jSONObject4.has(str2)) {
                                string = jSONObject4.getString(str2);
                            } else {
                                Logger.v("LocalManagerV1", "maybe this service routeBy is unconditional.");
                                string = "no-country";
                            }
                            dVar.a(string);
                            JSONObject jSONObject5 = jSONObject4.getJSONObject("addresses");
                            String str4 = str2;
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
                            Iterator<String> itKeys2 = jSONObject5.keys();
                            while (itKeys2.hasNext()) {
                                Iterator<String> it = itKeys2;
                                String next2 = itKeys2.next();
                                String string2 = jSONObject5.getString(next2);
                                if (!TextUtils.isEmpty(next2) && !TextUtils.isEmpty(string2)) {
                                    concurrentHashMap.put(next2, jSONObject5.getString(next2));
                                }
                                itKeys2 = it;
                                str3 = str3;
                            }
                            dVar.a(concurrentHashMap);
                            cVar.a(dVar.b(), dVar);
                            i++;
                            str2 = str4;
                            str3 = str3;
                        }
                        String str5 = str2;
                        String str6 = str3;
                        List<com.huawei.hms.framework.network.grs.local.model.b> listA = null;
                        if (jSONObject3.has("countryOrAreaGroups")) {
                            jSONObject = jSONObject3.getJSONObject("countryOrAreaGroups");
                        } else {
                            if (jSONObject3.has("countryGroups")) {
                                jSONObject = jSONObject3.getJSONObject("countryGroups");
                            } else {
                                Logger.v("LocalManagerV1", "service use default countryOrAreaGroup");
                            }
                            cVar.a(listA);
                            if (this.f13292a == null) {
                                this.f13292a = new com.huawei.hms.framework.network.grs.local.model.a();
                            }
                            this.f13292a.a(next, cVar);
                            str2 = str5;
                            str3 = str6;
                        }
                        listA = a((JSONArray) null, jSONObject);
                        cVar.a(listA);
                        if (this.f13292a == null) {
                            this.f13292a = new com.huawei.hms.framework.network.grs.local.model.a();
                        }
                        this.f13292a.a(next, cVar);
                        str2 = str5;
                        str3 = str6;
                    }
                }
            }
        } catch (JSONException e) {
            Logger.w("LocalManagerV1", "parse 1.0 services failed maybe because of json style.please check! %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int c(String str) {
        JSONObject jSONObject;
        this.f13293b = new ArrayList(16);
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.has("countryOrAreaGroups")) {
                jSONObject = jSONObject2.getJSONObject("countryOrAreaGroups");
            } else if (jSONObject2.has("countryGroups")) {
                jSONObject = jSONObject2.getJSONObject("countryGroups");
            } else {
                Logger.e("LocalManagerV1", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONObject = null;
            }
            if (jSONObject == null) {
                return -1;
            }
            if (jSONObject.length() == 0) {
                return 0;
            }
            this.f13293b.addAll(a(jSONObject));
            return 0;
        } catch (JSONException e) {
            Logger.w("LocalManagerV1", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int b(String str) {
        this.f13292a = new com.huawei.hms.framework.network.grs.local.model.a();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(MimeTypes.BASE_TYPE_APPLICATION);
            String string = jSONObject.getString("name");
            long j = jSONObject.getLong("cacheControl");
            JSONArray jSONArray = jSONObject.getJSONArray("services");
            this.f13292a.b(string);
            this.f13292a.a(j);
            return (jSONArray == null || jSONArray.length() == 0) ? -1 : 0;
        } catch (JSONException e) {
            Logger.w("LocalManagerV1", "parse appbean failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    public List<com.huawei.hms.framework.network.grs.local.model.b> a(JSONArray jSONArray, JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0) ? new ArrayList() : a(jSONObject);
    }

    private List<com.huawei.hms.framework.network.grs.local.model.b> a(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            ArrayList arrayList = new ArrayList(16);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                com.huawei.hms.framework.network.grs.local.model.b bVar = new com.huawei.hms.framework.network.grs.local.model.b();
                bVar.b(next);
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                bVar.c(jSONObject2.getString("name"));
                bVar.a(jSONObject2.getString("description"));
                if (jSONObject2.has("countriesOrAreas")) {
                    jSONArray = jSONObject2.getJSONArray("countriesOrAreas");
                } else if (jSONObject2.has("countries")) {
                    jSONArray = jSONObject2.getJSONArray("countries");
                } else {
                    Logger.w("LocalManagerV1", "current country or area group has not config countries or areas.");
                    jSONArray = null;
                }
                HashSet hashSet = new HashSet(16);
                if (jSONArray != null && jSONArray.length() != 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        hashSet.add((String) jSONArray.get(i));
                    }
                    bVar.a(hashSet);
                    arrayList.add(bVar);
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e) {
            Logger.w("LocalManagerV1", "parse countryGroups failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return new ArrayList();
        }
    }

    public c(Context context, boolean z) {
        this.d = z;
        if (a("grs_sdk_global_route_config.json", context) == 0) {
            this.f13294c = true;
        }
    }
}
