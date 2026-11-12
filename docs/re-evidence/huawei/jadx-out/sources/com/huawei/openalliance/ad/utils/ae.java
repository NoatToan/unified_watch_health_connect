package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.openalliance.ad.beans.inner.AdContentData;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.IRewardAd;
import com.huawei.openalliance.ad.pf;
import com.huawei.openalliance.ad.pw;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ae {
    /* JADX INFO: Access modifiers changed from: private */
    public static List<AdContentData> f(Context context, Map<String, List<com.huawei.openalliance.ad.inter.data.b>> map) {
        if (br.a(map) || context == null) {
            hw.b("EngineCacheUtil", "getTptAds, adsMap or context is empty.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.huawei.openalliance.ad.inter.data.b> list : map.values()) {
            if (!bm.a(list)) {
                for (com.huawei.openalliance.ad.inter.data.b bVar : list) {
                    if ((bVar instanceof com.huawei.openalliance.ad.inter.data.d) && bVar.d_()) {
                        arrayList.add(AdContentData.a(context, pf.a((com.huawei.openalliance.ad.inter.data.d) bVar)));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<AdContentData> e(Context context, Map<String, List<IRewardAd>> map) {
        if (context == null || br.a(map)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<IRewardAd>> entry : map.entrySet()) {
            if (entry != null && !bm.a(entry.getValue())) {
                for (IRewardAd iRewardAd : entry.getValue()) {
                    if (iRewardAd instanceof com.huawei.openalliance.ad.inter.data.i) {
                        com.huawei.openalliance.ad.inter.data.i iVar = (com.huawei.openalliance.ad.inter.data.i) iRewardAd;
                        if (iVar.aq() != null && iVar.aq().intValue() == 3) {
                            hw.b("EngineCacheUtil", "add v3 rewardAd: %s", iVar.getContentId());
                            arrayList.add(AdContentData.a(context, pw.a(iVar)));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b() {
        return c.b() && com.huawei.openalliance.ad.e.b() != null;
    }

    public static void b(final Context context, final Map<String, List<com.huawei.openalliance.ad.inter.data.b>> map) {
        if (br.a(map) || context == null) {
            hw.b("EngineCacheUtil", "adsMap or context is empty.");
        } else {
            o.d(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ae.2
                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    if (ae.b()) {
                        List listF = ae.f(context, map);
                        if (!bm.a(listF)) {
                            try {
                                com.huawei.openalliance.ad.e.b().a(bk.b(listF), (Bundle) null);
                                return;
                            } catch (RemoteException unused) {
                                hw.c("EngineCacheUtil", "triggerEngineDown RemoteException.");
                                return;
                            } catch (Throwable th) {
                                hw.c("EngineCacheUtil", "triggerEngineDown err: %s.", th.getClass().getSimpleName());
                                return;
                            }
                        }
                        str = "template ads is empty.";
                    } else {
                        str = "uiengine is not loaded or can't support download.";
                    }
                    hw.b("EngineCacheUtil", str);
                }
            });
        }
    }

    public static void a(final Context context, final Map<String, List<IRewardAd>> map) {
        if (context == null || br.a(map)) {
            return;
        }
        o.d(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ae.1
            @Override // java.lang.Runnable
            public void run() {
                List listE = ae.e(context, map);
                if (bm.a(listE)) {
                    hw.b("EngineCacheUtil", "3.0 null");
                    return;
                }
                com.huawei.hms.ads.uiengine.e eVarB = com.huawei.openalliance.ad.e.b();
                if (c.a(eVarB)) {
                    hw.c("EngineCacheUtil", "not support engine down or engineUtil is null");
                    return;
                }
                hw.b("EngineCacheUtil", "trigger ui engine download.");
                try {
                    eVarB.a(bk.b(listE), (Bundle) null);
                } catch (Throwable th) {
                    hw.c("EngineCacheUtil", "trigger engine download ex: %s", th.getClass().getSimpleName());
                }
            }
        });
    }
}
