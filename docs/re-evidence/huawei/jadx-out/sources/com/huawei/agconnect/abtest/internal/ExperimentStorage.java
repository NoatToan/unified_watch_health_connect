package com.huawei.agconnect.abtest.internal;

import com.huawei.agconnect.abtest.BuildConfig;
import com.huawei.agconnect.common.api.AgcCrypto;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class ExperimentStorage {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ExperimentStorage f4795b = new ExperimentStorage();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, List<ABTestExperimentInfo>> f4796a = new HashMap();

    static void c() {
        synchronized (ExperimentStorage.class) {
            JSONObject jSONObject = new JSONObject();
            for (String str : f4795b.f4796a.keySet()) {
                List<ABTestExperimentInfo> list = f4795b.f4796a.get(str);
                if (list != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < list.size(); i++) {
                        jSONArray.put(list.get(i).e());
                    }
                    try {
                        jSONObject.put(str, jSONArray);
                    } catch (JSONException e) {
                        Logger.e("ABTest", "json error", e);
                    }
                }
            }
            SharedPrefUtil.getInstance().put(BuildConfig.LIBRARY_PACKAGE_NAME, "experiments", String.class, jSONObject.toString(), AgcCrypto.class);
        }
    }

    static void b() {
        synchronized (ExperimentStorage.class) {
            String str = (String) SharedPrefUtil.getInstance().get(BuildConfig.LIBRARY_PACKAGE_NAME, "experiments", String.class, "", AgcCrypto.class);
            if (str != null && str.length() > 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONArray jSONArray = jSONObject.getJSONArray(next);
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            ABTestExperimentInfo aBTestExperimentInfoA = ABTestExperimentInfo.a((JSONObject) jSONArray.get(i));
                            if (aBTestExperimentInfoA != null) {
                                arrayList.add(aBTestExperimentInfoA);
                            }
                        }
                        f4795b.f4796a.put(next, arrayList);
                    }
                } catch (JSONException e) {
                    Logger.e("ABTest", "json error", e);
                }
            }
        }
    }

    static void a(ABTestExperimentInfo aBTestExperimentInfo, String str) {
        synchronized (ExperimentStorage.class) {
            List<ABTestExperimentInfo> arrayList = f4795b.f4796a.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                f4795b.f4796a.put(str, arrayList);
            }
            arrayList.add(aBTestExperimentInfo);
        }
    }

    static void a(ABTestExperimentInfo aBTestExperimentInfo) {
        synchronized (ExperimentStorage.class) {
            if (aBTestExperimentInfo == null) {
                return;
            }
            Iterator<String> it = f4795b.f4796a.keySet().iterator();
            while (it.hasNext()) {
                List<ABTestExperimentInfo> list = f4795b.f4796a.get(it.next());
                if (list != null) {
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).a().equals(aBTestExperimentInfo.a())) {
                            list.remove(i);
                            break;
                        }
                    }
                }
            }
        }
    }

    static Set<String> a() {
        Set<String> setKeySet;
        synchronized (ExperimentStorage.class) {
            setKeySet = f4795b.f4796a.keySet();
        }
        return setKeySet;
    }

    static List<ABTestExperimentInfo> a(String str) {
        ArrayList arrayList;
        synchronized (ExperimentStorage.class) {
            List<ABTestExperimentInfo> list = f4795b.f4796a.get(str);
            arrayList = list != null ? new ArrayList(list) : new ArrayList();
        }
        return arrayList;
    }

    ExperimentStorage() {
    }
}
