package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.v3.CachedContent;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.RTCMethods;
import com.huawei.openalliance.ad.fl;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.mz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class bl {
    /* JADX INFO: Access modifiers changed from: private */
    public static List<String> c(Context context) {
        Map map = (Map) bk.b(fl.a(context).a(), Map.class, new Class[0]);
        if (br.a(map)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!dg.b(str) && !dg.b(str2) && 1 != Integer.parseInt(str2) && Integer.parseInt(str2) != 0) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static void a(final Context context) {
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.bl.1
            @Override // java.lang.Runnable
            public void run() {
                if (d.c(context, 1)) {
                    hw.a("KitDataUtil", "prepare cached contentId");
                    List listC = bl.c(context);
                    if (bm.a(listC)) {
                        hw.a("KitDataUtil", "no need prepare cached contentId");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(MapKeyNames.AD_IDS, bk.b(listC));
                        jSONObject.put("adType", 1);
                        CallResult callResultA = mz.a(context).a(RTCMethods.QUERY_CACHED_CONTENT, jSONObject.toString(), String.class);
                        if (callResultA != null && 200 == callResultA.getCode()) {
                            JSONObject jSONObject2 = new JSONObject((String) callResultA.getData());
                            String strOptString = jSONObject2.optString(MapKeyNames.CACHED_CONTENT_ID);
                            String strOptString2 = jSONObject2.optString(MapKeyNames.CACHED_TEMPLATE);
                            hw.b("KitDataUtil", "query kit cached content success: %s", Integer.valueOf(jSONObject2.optInt("resultCode")));
                            if (!dg.b(strOptString)) {
                                hw.a("KitDataUtil", "parse kit cached content id");
                                List list = (List) bk.b(strOptString, List.class, String.class);
                                if (!bm.a(list)) {
                                    com.huawei.openalliance.ad.df.a((List<String>) list);
                                }
                            }
                            if (!dg.b(strOptString2)) {
                                hw.a("KitDataUtil", "parse kit cached template");
                                Map map = (Map) bk.b(strOptString2, Map.class, new Class[0]);
                                HashMap map2 = new HashMap();
                                if (!br.a(map)) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        map2.put((String) entry.getKey(), (List) bk.b((String) entry.getValue(), List.class, CachedContent.class));
                                    }
                                }
                                if (!br.a(map2)) {
                                    com.huawei.openalliance.ad.df.a(map2);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        hw.c("KitDataUtil", "prepare cached contentId error: %s", th.getClass().getSimpleName());
                    }
                    com.huawei.openalliance.ad.inter.h.a(context);
                }
            }
        });
    }
}
