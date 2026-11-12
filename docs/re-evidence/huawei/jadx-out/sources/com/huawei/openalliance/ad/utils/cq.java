package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.ads.adsrec.IEventReportCallback;
import com.huawei.ads.adsrec.IUtilCallback;
import com.huawei.openalliance.ad.beans.metadata.Ad30;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.constant.AiCoreSdkConstant;
import com.huawei.openalliance.ad.constant.ConfigMapKeys;
import com.huawei.openalliance.ad.constant.SpDefaultValues;
import com.huawei.openalliance.ad.constant.TradeMode;
import com.huawei.openalliance.ad.fo;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.ft;
import com.huawei.openalliance.ad.hw;
import defpackage.awz;
import defpackage.axg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class cq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f20559a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f20560b = false;

    public static String[] c(Context context) {
        List<String> listM = fp.b(context).m();
        return bm.a(listM) ? new String[0] : (String[]) listM.toArray(new String[listM.size()]);
    }

    public static boolean b(final Context context) {
        if (as.c() - f20559a > AiCoreSdkConstant.CHECK_SUPPORT_INTERVAL) {
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.cq.1
                @Override // java.lang.Runnable
                public void run() {
                    hw.b("RecommendEngineUtil", "do check ds version");
                    int iA = dg.a(fp.b(context).b(ConfigMapKeys.SUPPORT_DS_ENGINE_VER, String.valueOf(SpDefaultValues.DEFAULT_DS_VER)), SpDefaultValues.DEFAULT_DS_VER);
                    int iF = k.f(context, AiCoreSdkConstant.DECISION_PKG_NAME);
                    hw.a("RecommendEngineUtil", "check ds, local ver: %s, cfg ver: %s", Integer.valueOf(iF), Integer.valueOf(iA));
                    boolean unused = cq.f20560b = iF >= iA;
                    long unused2 = cq.f20559a = as.c();
                }
            });
        }
        return f20560b;
    }

    public static int b(String str) {
        int iA;
        if (!dg.b(str) && (iA = dg.a(str, 3)) > 0) {
            return iA;
        }
        return 3;
    }

    public static String[] a(Context context, String str) {
        Map<String, String> mapA = bk.a(fp.b(context).b(ConfigMapKeys.TRADE_MODE_IN_AD_TYPE, (String) null));
        if (mapA == null || !mapA.containsKey(str)) {
            return c(context);
        }
        String str2 = mapA.get(str);
        return str2 == null ? new String[0] : str2.split(",");
    }

    static class b implements IUtilCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f20563a;

        @Override // com.huawei.ads.adsrec.IUtilCallback
        public String getConfig(String str) {
            return null;
        }

        @Override // com.huawei.ads.adsrec.IUtilCallback
        public List<String> getDailyIntentId(int i, int i2) {
            return null;
        }

        @Override // com.huawei.ads.adsrec.IUtilCallback
        public int getMediaType(String str) {
            return 0;
        }

        @Override // com.huawei.ads.adsrec.IUtilCallback
        public Map<String, Double> getUserCost(int i) {
            return null;
        }

        @Override // com.huawei.ads.adsrec.IUtilCallback
        public boolean isInHmsProcess() {
            return false;
        }

        @Override // com.huawei.ads.adsrec.IUtilCallback
        public byte[] getDeviceAiParamKey() {
            return new byte[0];
        }

        @Override // com.huawei.ads.adsrec.IUtilCallback
        public Long getCostEndTime(int i) {
            return 0L;
        }

        @Override // com.huawei.ads.adsrec.IUtilCallback
        public String[] getAllowCachedTradeModeList(String str, String str2) {
            return cq.a(this.f20563a, str2);
        }

        @Override // com.huawei.ads.adsrec.IUtilCallback
        public String[] getAllowCachedTradeModeList(String str) {
            return cq.c(this.f20563a);
        }

        @Override // com.huawei.ads.adsrec.IUtilCallback
        public String aes128Encrypt(String str) {
            return g.a(str, cw.b(this.f20563a));
        }

        @Override // com.huawei.ads.adsrec.IUtilCallback
        public String aes128Decrypt(String str) {
            return g.b(str, cw.b(this.f20563a));
        }

        b(Context context) {
            this.f20563a = context;
        }
    }

    public static boolean a(Context context, List<String> list, AdContentRsp adContentRsp) {
        if (adContentRsp == null) {
            return false;
        }
        if (bm.a(adContentRsp.f())) {
            return a(context, 1, list);
        }
        hw.a("RecommendEngineUtil", "preload request not use rec engine");
        return false;
    }

    private static boolean a(Context context, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (fo.a(context).a(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(Context context, int i, List<String> list) {
        if (a(context, list)) {
            hw.a("RecommendEngineUtil", "rec disabled");
            return false;
        }
        if (ab.j(context) || i == 2) {
            return false;
        }
        int iD = fp.b(context).D();
        if (ab.v(context, iD)) {
            hw.b("RecommendEngineUtil", "child mode, do not req from rec");
            return false;
        }
        if (!ab.u(context, iD) || fp.b(context).l()) {
            return true;
        }
        hw.a("RecommendEngineUtil", "hw user disabled");
        return false;
    }

    private static void a(Context context, Map<String, String> map) {
        int iA = dg.a(map.get("updateStyleFcFlag"), 0);
        if (ft.a(context).a() == 0 && iA == 1) {
            ft.a(context).a(1);
            hw.a("RecommendEngineUtil", "updateStyleFcFlag: %s", Integer.valueOf(ft.a(context).a()));
        }
    }

    public static void a(Context context, AdContentRsp adContentRsp) {
        String str;
        if (adContentRsp == null) {
            return;
        }
        List<Ad30> listC = adContentRsp.c();
        if (bm.a(listC)) {
            return;
        }
        ft.a(context).a(0);
        for (Ad30 ad30 : listC) {
            if (ad30 != null) {
                String strA = ad30.a();
                if (dg.b(strA)) {
                    str = "empty slot id";
                } else {
                    String strG = ad30.g();
                    if (dg.b(strG)) {
                        str = "empty config map";
                    } else {
                        Map<String, String> map = (Map) bk.b(strG, Map.class, new Class[0]);
                        if (!br.a(map)) {
                            fo.a(context).a(strA, map);
                            a(context, map);
                        }
                    }
                }
                hw.a("RecommendEngineUtil", str);
            }
        }
    }

    public static void a(Context context) {
        awz.d(new b(context));
        awz.e(new a(context));
    }

    static class a implements IEventReportCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f20562a;

        @Override // com.huawei.ads.adsrec.IEventReportCallback
        public void eventProcess(axg axgVar) {
            new com.huawei.openalliance.ad.analysis.c(this.f20562a).a(axgVar);
        }

        a(Context context) {
            this.f20562a = context;
        }
    }

    public static List<String> a(String str) {
        if (dg.b(str)) {
            return TradeMode.DEFAULT_VALUE;
        }
        String[] strArrSplit = str.split(",");
        if (bm.a(strArrSplit)) {
            return TradeMode.DEFAULT_VALUE;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (TradeMode.OPTIONAL_VALUE.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return bm.a(arrayList) ? TradeMode.DEFAULT_VALUE : arrayList;
    }
}
