package com.huawei.ads.adsrec;

import android.text.TextUtils;
import android.util.LruCache;
import com.huawei.ads.adsrec.bean.RelationScore;
import com.huawei.ads.adsrec.db.table.AdCreativeContentRecord;
import com.huawei.ads.fund.util.ListUtil;
import com.huawei.ads.fund.util.StringUtils;
import defpackage.awz;
import defpackage.axh;
import defpackage.axi;
import defpackage.axm;
import defpackage.axs;
import defpackage.axv;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final LruCache<String, String> f4761a = new LruCache<>(50);

    public static int b() {
        int intOrDefault;
        IUtilCallback iUtilCallbackC = awz.c();
        if (iUtilCallbackC != null && (intOrDefault = StringUtils.parseIntOrDefault(iUtilCallbackC.getConfig("sampleSize"), 50)) >= 0) {
            return intOrDefault;
        }
        return 50;
    }

    private static byte[] a() {
        IUtilCallback iUtilCallbackC = awz.c();
        return iUtilCallbackC == null ? new byte[0] : iUtilCallbackC.getDeviceAiParamKey();
    }

    public static void a(axh axhVar, Map<String, RelationScore> map) {
        RelationScore relationScore;
        if (axv.d(map) || axhVar == null || (relationScore = map.get(axhVar.i())) == null) {
            return;
        }
        axhVar.c(relationScore.a());
        axhVar.b(relationScore.b());
        axhVar.d(relationScore.c());
        relationScore.a();
        relationScore.b();
        relationScore.c();
    }

    public static Map<String, List<String>> a(axi axiVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (axiVar != null && !ListUtil.isEmpty(axiVar.i())) {
            for (axm axmVar : axiVar.i()) {
                if (axmVar != null && !axmVar.h()) {
                    ArrayList arrayList = new ArrayList();
                    for (axh axhVar : axmVar.b()) {
                        if (axhVar != null) {
                            arrayList.add(axhVar.i());
                        }
                    }
                    String strJ = axmVar.j();
                    if (!StringUtils.isBlank(strJ)) {
                        linkedHashMap.put(strJ, arrayList);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static int a(axh axhVar, axh axhVar2, int i) {
        if (i != 0) {
            return i;
        }
        String strO = axhVar.o();
        String strO2 = axhVar2.o();
        if (strO.equals("1")) {
            return strO2.equals("1") ? 0 : -1;
        }
        return strO2.equals("1") ? 1 : 0;
    }

    public static int a(axh axhVar, axh axhVar2) {
        if (axhVar.w().booleanValue()) {
            return 1;
        }
        return !axhVar2.w().booleanValue() ? 0 : -1;
    }

    public static int a(double d, double d2) {
        if (Math.abs(d - d2) < 9.999999974752427E-7d) {
            return 0;
        }
        return Double.compare(d, d2);
    }

    public static double a(axh axhVar) {
        AdCreativeContentRecord adCreativeContentRecordD = axhVar.d();
        if (adCreativeContentRecordD == null) {
            return 0.0d;
        }
        String strB = adCreativeContentRecordD.b();
        if (TextUtils.isEmpty(strB)) {
            return 0.0d;
        }
        try {
            LruCache<String, String> lruCache = f4761a;
            String strC = lruCache.get(strB);
            if (strC == null) {
                strC = axs.c(strB, a());
                if (!TextUtils.isEmpty(strC)) {
                    lruCache.put(strB, strC);
                }
            }
            return Double.parseDouble(strC);
        } catch (Exception unused) {
            return 0.0d;
        }
    }
}
