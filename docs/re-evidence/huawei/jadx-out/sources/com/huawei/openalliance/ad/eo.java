package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.ads.adsrec.AdRecommendEngine;
import com.huawei.ads.adsrec.recall.IAdRequestDelegate;
import com.huawei.ads.fund.util.AsyncExec;
import com.huawei.openalliance.ad.beans.inner.UserIntent;
import com.huawei.openalliance.ad.beans.metadata.AdSlot30;
import com.huawei.openalliance.ad.beans.metadata.App;
import com.huawei.openalliance.ad.beans.metadata.PostBackEvent;
import com.huawei.openalliance.ad.beans.server.AdContentReq;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.constant.AdRecommendEvent;
import com.huawei.openalliance.ad.net.http.Response;
import defpackage.axj;
import defpackage.ayc;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class eo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f18706a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, Integer> f18707b = new ConcurrentHashMap();

    private static String c(AdContentReq adContentReq) {
        List<UserIntent> listB = b(adContentReq);
        if (com.huawei.openalliance.ad.utils.bm.a(listB)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < listB.size(); i++) {
            UserIntent userIntent = listB.get(i);
            if (userIntent != null) {
                String strB = userIntent.b();
                if (!com.huawei.openalliance.ad.utils.dg.b(strB) && strB.length() >= 8) {
                    sb.append(strB.substring(0, 8));
                    sb.append(":");
                    sb.append(userIntent.a());
                    sb.append(",");
                }
            }
        }
        com.huawei.openalliance.ad.utils.dg.a(sb, ',');
        return sb.toString();
    }

    private static void b(Context context) {
        synchronized (eo.class) {
            if (!f18706a) {
                com.huawei.openalliance.ad.utils.v.a(context);
                a();
                f18706a = true;
                hw.b("AdRecommendEngineCaller", "common lib inited");
                com.huawei.openalliance.ad.utils.cq.a(context);
            }
        }
    }

    private static List<UserIntent> b(AdContentReq adContentReq) {
        Map<String, String> mapE = adContentReq.E();
        if (com.huawei.openalliance.ad.utils.br.a(mapE)) {
            return null;
        }
        String str = mapE.get("intents");
        if (com.huawei.openalliance.ad.utils.dg.b(str)) {
            return null;
        }
        List<UserIntent> list = (List) com.huawei.openalliance.ad.utils.bk.b(str, List.class, UserIntent.class);
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            return null;
        }
        return list;
    }

    private static ayc b(Context context, AdContentReq adContentReq, List<String> list, int i, Integer num) {
        AdSlot30 adSlot30;
        String str;
        App appH = adContentReq.h();
        if (appH == null) {
            str = "compose param - app is null";
        } else {
            String strC = appH.c();
            if (!com.huawei.openalliance.ad.utils.bm.a(list)) {
                ayc aycVar = new ayc(strC, adContentReq.r(), list, num, i);
                aycVar.c(Arrays.asList(com.huawei.openalliance.ad.utils.cq.a(context, String.valueOf(i))));
                aycVar.c(Integer.valueOf(fp.b(context).n()));
                aycVar.d(context.getPackageName());
                aycVar.b(a(adContentReq));
                aycVar.e(c(adContentReq));
                aycVar.a(adContentReq.K());
                List<AdSlot30> listK = adContentReq.k();
                if (listK != null && (adSlot30 = listK.get(0)) != null) {
                    aycVar.b(adSlot30.m());
                }
                return aycVar;
            }
            str = "slots is empty";
        }
        hw.c("AdRecommendEngineCaller", str);
        return null;
    }

    public static boolean a(String str) {
        Integer num = f18707b.get(str);
        return num != null && num.intValue() == 1;
    }

    public static boolean a(Context context) {
        try {
            b(context);
            return true;
        } catch (Throwable th) {
            hw.d("AdRecommendEngineCaller", "check ad rec engine error:%s", th.getClass().getSimpleName());
            return false;
        }
    }

    public static void a(List<String> list, int i) {
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            f18707b.put(it.next(), Integer.valueOf(i));
        }
    }

    public static void a(Context context, PostBackEvent postBackEvent) {
        String strG = postBackEvent.g();
        if (!AdRecommendEvent.eventTypeList.contains(strG)) {
            hw.a("AdRecommendEngineCaller", "no need report to rec engine");
            return;
        }
        hw.a("AdRecommendEngineCaller", "post ad affair to rec engine: %s", strG);
        AdRecommendEngine adRecommendEngine = new AdRecommendEngine(context);
        axj.d dVar = new axj.d();
        String strA = postBackEvent.a();
        if (TextUtils.isEmpty(strA)) {
            strA = context.getPackageName();
        }
        dVar.e(strA).j(postBackEvent.b()).b(postBackEvent.c()).c(postBackEvent.d()).a(Long.valueOf(postBackEvent.e())).a(Integer.valueOf(postBackEvent.f())).a(strG).c(Long.valueOf(postBackEvent.h())).d(postBackEvent.i());
        adRecommendEngine.e(dVar.d());
    }

    private static void a() {
        AsyncExec.setExecutorFactory(new AsyncExec.d());
    }

    private static JSONObject a(final Context context, final AdContentReq adContentReq, ayc aycVar, final Response response) {
        return new AdRecommendEngine(context).c(aycVar, new IAdRequestDelegate() { // from class: com.huawei.openalliance.ad.eo.1
            @Override // com.huawei.ads.adsrec.recall.IAdRequestDelegate
            public String requestAd() {
                hw.a("AdRecommendEngineCaller", "do ad request");
                Response<String> responseA = fi.a(context).a(adContentReq);
                response.a((Response) responseA);
                return responseA.b();
            }
        });
    }

    private static String a(AdContentReq adContentReq) {
        List<UserIntent> listB = b(adContentReq);
        if (com.huawei.openalliance.ad.utils.bm.a(listB)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < listB.size(); i++) {
            UserIntent userIntent = listB.get(i);
            if (userIntent != null) {
                String strB = userIntent.b();
                if (!com.huawei.openalliance.ad.utils.dg.b(strB) && strB.length() >= 4) {
                    sb.append(strB.substring(0, 4));
                    sb.append(",");
                }
            }
        }
        com.huawei.openalliance.ad.utils.dg.a(sb, ',');
        return sb.toString();
    }

    public static Response<AdContentRsp> a(Context context, AdContentReq adContentReq, List<String> list, int i, Integer num) {
        long jC = com.huawei.openalliance.ad.utils.as.c();
        ayc aycVarB = b(context, adContentReq, list, i, num);
        if (aycVarB == null) {
            hw.c("AdRecommendEngineCaller", "request ads param is null");
            return null;
        }
        Response<AdContentRsp> response = new Response<>();
        response.a(200);
        JSONObject jSONObjectA = a(context, adContentReq, aycVarB, response);
        hw.a("AdRecommendEngineCaller", "recall result: %s", jSONObjectA);
        if (jSONObjectA == null) {
            response.a(-1);
        }
        AdContentRsp adContentRsp = (AdContentRsp) com.huawei.openalliance.ad.utils.bk.a(context, jSONObjectA, AdContentRsp.class, new Class[0]);
        response.a(adContentRsp);
        if (adContentRsp != null) {
            response.b(adContentRsp.toString());
        } else {
            response.a(-1);
        }
        response.e(com.huawei.openalliance.ad.utils.as.c() - jC);
        return response;
    }
}
