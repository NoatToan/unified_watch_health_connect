package com.huawei.ads.adsrec;

import android.content.Context;
import com.huawei.ads.adsrec.bean.SampleData;
import com.huawei.ads.adsrec.db.table.DsContentRelRecord;
import com.huawei.ads.fund.util.AsyncExec;
import com.huawei.ads.fund.util.JsonUtil;
import com.huawei.ads.fund.util.ListUtil;
import com.huawei.openplatform.abl.log.HiAdLog;
import defpackage.awz;
import defpackage.axv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public abstract class v0 {

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f4776a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f4777c;
        final /* synthetic */ Map d;
        final /* synthetic */ Map e;

        @Override // java.lang.Runnable
        public void run() {
            j.a((Map<String, Integer>) this.f4776a, (Map<String, Integer>) this.e, (Map<String, Integer>) this.d, (Map<String, Integer>) this.f4777c);
        }

        c(Map map, Map map2, Map map3, Map map4) {
            this.f4776a = map;
            this.e = map2;
            this.d = map3;
            this.f4777c = map4;
        }
    }

    private static List<SampleData> a(List<DsContentRelRecord> list, double d) {
        ArrayList arrayList = new ArrayList();
        Iterator<DsContentRelRecord> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new SampleData(it.next(), d));
        }
        return arrayList;
    }

    private static List<SampleData> a(Context context, Map<String, Double> map, long j, int i, Map<String, Integer> map2, Map<String, Integer> map3) {
        int iB = o0.b();
        e eVar = new e(context);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            List<DsContentRelRecord> listA = 1 == i ? eVar.a(key, j) : eVar.c(key, j);
            int size = listA.size();
            if (size > 0) {
                if (size > iB) {
                    map3.put(key, Integer.valueOf(size));
                } else {
                    arrayList.addAll(a(listA, value.doubleValue()));
                    map2.put(key, Integer.valueOf(size));
                }
            }
        }
        arrayList.size();
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    public static String a(Context context) {
        JSONObject jSONObject;
        HashMap map;
        int size;
        int i;
        IUtilCallback iUtilCallbackC = awz.c();
        if (iUtilCallbackC == null) {
            HiAdLog.w("SampleUtil", "utilCallBack is null");
            return null;
        }
        Map<String, Double> userCost = iUtilCallbackC.getUserCost(0);
        Map<String, Double> userCost2 = iUtilCallbackC.getUserCost(1);
        Long costEndTime = iUtilCallbackC.getCostEndTime(0);
        Long costEndTime2 = iUtilCallbackC.getCostEndTime(1);
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (axv.d(userCost) || costEndTime == null) {
                jSONObject = jSONObject2;
                size = 0;
            } else {
                jSONObject = jSONObject2;
                try {
                    List<SampleData> listA = a(context, userCost, costEndTime.longValue(), 0, map2, map3);
                    size = listA.size();
                    try {
                        if (!ListUtil.isEmpty(listA)) {
                            jSONObject.put("industryCost", JsonUtil.toJson(listA));
                        }
                    } catch (Throwable th) {
                        th = th;
                        map = map5;
                        i = 0;
                        HiAdLog.w("SampleUtil", "pack cost sample data error: %s", th.getClass().getSimpleName());
                        if (map2.size() + map3.size() + map4.size() + map.size() > 0) {
                            AsyncExec.submitIO(new c(map2, map3, map4, map));
                        }
                        if (i + size == 0) {
                            return null;
                        }
                        return jSONObject.toString();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    map = map5;
                    size = 0;
                    i = 0;
                    HiAdLog.w("SampleUtil", "pack cost sample data error: %s", th.getClass().getSimpleName());
                    if (map2.size() + map3.size() + map4.size() + map.size() > 0) {
                        AsyncExec.submitIO(new c(map2, map3, map4, map));
                    }
                    if (i + size == 0) {
                        return null;
                    }
                    return jSONObject.toString();
                }
            }
            if (axv.d(userCost2) || costEndTime2 == null) {
                map = map5;
                i = 0;
            } else {
                map = map5;
                try {
                    List<SampleData> listA2 = a(context, userCost2, costEndTime2.longValue(), 1, map4, map5);
                    int size2 = listA2.size();
                    try {
                        if (!ListUtil.isEmpty(listA2)) {
                            jSONObject.put("dspCost", JsonUtil.toJson(listA2));
                        }
                        i = size2;
                    } catch (Throwable th3) {
                        th = th3;
                        i = size2;
                        HiAdLog.w("SampleUtil", "pack cost sample data error: %s", th.getClass().getSimpleName());
                    }
                } catch (Throwable th4) {
                    th = th4;
                    i = 0;
                    HiAdLog.w("SampleUtil", "pack cost sample data error: %s", th.getClass().getSimpleName());
                    if (map2.size() + map3.size() + map4.size() + map.size() > 0) {
                        AsyncExec.submitIO(new c(map2, map3, map4, map));
                    }
                    if (i + size == 0) {
                        return null;
                    }
                    return jSONObject.toString();
                }
            }
        } catch (Throwable th5) {
            th = th5;
            jSONObject = jSONObject2;
        }
        if (map2.size() + map3.size() + map4.size() + map.size() > 0) {
            AsyncExec.submitIO(new c(map2, map3, map4, map));
        }
        if (i + size == 0) {
            return null;
        }
        return jSONObject.toString();
    }
}
