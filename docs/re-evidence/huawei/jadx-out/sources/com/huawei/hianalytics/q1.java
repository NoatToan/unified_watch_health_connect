package com.huawei.hianalytics;

import android.text.TextUtils;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f11603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f11604b = new l1();

    public q1(m0 m0Var) {
        this.f11603a = m0Var;
    }

    public static int a(l1 l1Var, l1 l1Var2) {
        long j = l1Var.k;
        long j2 = l1Var2.k;
        if (j == j2) {
            return 0;
        }
        return j - j2 > 0 ? -1 : 1;
    }

    public static HashMap b(ArrayList arrayList) {
        List listQueryMcTag = j.a(EnvUtils.getAppContext()).queryMcTag("MC");
        HashMap map = new HashMap();
        if (listQueryMcTag != null && !listQueryMcTag.isEmpty()) {
            try {
                Iterator it = listQueryMcTag.iterator();
                while (it.hasNext()) {
                    m1 m1Var = new m1((String) it.next());
                    if (r1.a(m1Var.d)) {
                        arrayList.add(m1Var.f11582a);
                    } else {
                        map.put(m1Var.f11583b, m1Var);
                    }
                }
            } catch (JSONException unused) {
                HiLog.w("MPL", "HMTD JSONException");
            }
        }
        return map;
    }

    public final void a() {
        synchronized (this) {
            if (TextUtils.isEmpty(this.f11604b.f11578c) || TextUtils.isEmpty(this.f11604b.d)) {
                return;
            }
            try {
                HiLog.d("MPL", "cache");
                j.a(EnvUtils.getAppContext()).insertMcInfo(this.f11604b.a().toString());
            } catch (JSONException unused) {
                HiLog.w("MPL", "cache JSONException");
            }
        }
    }

    public static void a(List list, ArrayList arrayList, ArrayList arrayList2, HashMap map) {
        boolean z = arrayList2 != null;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l1 l1Var = (l1) it.next();
            if (z) {
                arrayList.add(l1Var.f11576a);
            }
            if (map.containsKey(l1Var.f11577b)) {
                m1 m1Var = (m1) map.get(l1Var.f11577b);
                if (m1Var != null) {
                    String str = m1Var.e;
                    if (!TextUtils.isEmpty(str)) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            r1.a(jSONObject, l1Var);
                            jSONObject.put("content_code", str);
                            r1.a("uuid_metric_info", jSONObject);
                        } catch (JSONException unused) {
                            HiLog.w("MRUtils", "BMID JSONException");
                        }
                        HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("ha_metric_mc");
                        if (instanceByTag == null) {
                            HiLog.w("MRUtils", "metric instance is null");
                        } else {
                            instanceByTag.onEventSync(0, "108", jSONObject);
                        }
                    }
                    String str2 = m1Var.f11584c;
                    if (!TextUtils.isEmpty(str2)) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            r1.a(jSONObject2, l1Var);
                            jSONObject2.put("metric_tag", str2);
                            r1.a("uuid_tag_info", jSONObject2);
                        } catch (JSONException unused2) {
                            HiLog.w("MRUtils", "BMID JSONException");
                        }
                        HiAnalyticsInstance instanceByTag2 = HiAnalyticsManager.getInstanceByTag("ha_metric_mc");
                        if (instanceByTag2 == null) {
                            HiLog.w("MRUtils", "metric instance is null");
                        } else {
                            instanceByTag2.onEventSync(0, "109", jSONObject2);
                        }
                    }
                }
            } else if (z) {
                arrayList2.add(l1Var);
            }
        }
    }

    public static boolean a(ArrayList arrayList, HashMap map) {
        ArrayList<String> arrayListA;
        ArrayList arrayList2 = new ArrayList();
        try {
            Iterator it = new HashSet(arrayList).iterator();
            while (it.hasNext()) {
                arrayList2.add(((l1) it.next()).a().toString());
            }
        } catch (JSONException unused) {
            HiLog.w("MPL", "DD JSONException");
        }
        if (arrayList2.isEmpty()) {
            r1.a(0, "mc_105");
            arrayListA = new ArrayList();
        } else {
            int iMin = Math.min(j1.a().f, 50);
            r1.a(arrayList2.size(), "mc_105");
            if (arrayList2.size() <= iMin) {
                arrayListA = z1.a(arrayList2);
            } else {
                int iCeil = (int) Math.ceil(((double) arrayList2.size()) / ((double) iMin));
                ArrayList arrayList3 = new ArrayList();
                for (int i = 0; i < iCeil; i++) {
                    int i2 = i * iMin;
                    arrayList3.addAll(z1.a(arrayList2.subList(i2, Math.min(i2 + iMin, arrayList2.size()))));
                }
                HiLog.d("MPL", "batchSize: " + iMin + ", batches: " + iCeil);
                arrayListA = arrayList3;
            }
        }
        if (arrayListA.isEmpty()) {
            r1.a(0, "mc_106");
            return false;
        }
        r1.a(arrayListA.size(), "mc_106");
        try {
            for (String str : arrayListA) {
                if (!TextUtils.isEmpty(str)) {
                    m1 m1Var = new m1(str);
                    map.put(m1Var.f11583b, m1Var);
                }
            }
        } catch (JSONException unused2) {
            HiLog.w("MPL", "MAR JSONException");
        }
        j.a(EnvUtils.getAppContext()).insertMcTagList(arrayListA);
        return true;
    }

    public static List a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        List<String> listQueryMcInfo = j.a(EnvUtils.getAppContext()).queryMcInfo();
        if (!listQueryMcInfo.isEmpty()) {
            r1.a(listQueryMcInfo.size(), "mc_104");
            try {
                for (String str : listQueryMcInfo) {
                    if (!TextUtils.isEmpty(str)) {
                        l1 l1Var = new l1(str);
                        if (r1.a(l1Var.k)) {
                            arrayList.add(l1Var.f11576a);
                        } else {
                            arrayList2.add(l1Var);
                        }
                    }
                }
            } catch (JSONException unused) {
                HiLog.w("MPL", "RAR JSONException");
            }
            if (arrayList2.size() > j1.a().e) {
                Collections.sort(arrayList2, new Comparator() { // from class: com.huawei.hianalytics.q1$$ExternalSyntheticLambda0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return q1.a((l1) obj, (l1) obj2);
                    }
                });
                return arrayList2.subList(0, j1.a().e);
            }
        }
        return arrayList2;
    }
}
