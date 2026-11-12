package com.huawei.ads.adsrec;

import android.content.Context;
import com.huawei.ads.adsrec.db.table.AdIECImpRecord;
import com.huawei.ads.fund.util.JsonUtil;
import com.huawei.ads.fund.util.ListUtil;
import com.huawei.ads.fund.util.StringUtils;
import defpackage.awz;
import defpackage.axg;
import defpackage.axh;
import defpackage.axi;
import defpackage.axm;
import defpackage.ayc;
import defpackage.ayg;
import defpackage.ayl;
import defpackage.aym;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static void a(Map<String, Integer> map, Map<String, Integer> map2, Map<String, Integer> map3, Map<String, Integer> map4) {
        axg axgVar = new axg();
        axgVar.d("2500005");
        axgVar.e(JsonUtil.toJsonNoException(map));
        axgVar.a(JsonUtil.toJsonNoException(map2));
        axgVar.c(JsonUtil.toJsonNoException(map3));
        axgVar.b(JsonUtil.toJsonNoException(map4));
        new ayl().d(axgVar);
    }

    public static void a(ayc aycVar, List<String> list, ayg aygVar) {
        axg axgVar = new axg();
        axgVar.d("2500002");
        axgVar.e(w0.a(aycVar.b()));
        axgVar.a(list.toString());
        axgVar.c(String.valueOf(aygVar.c()));
        axgVar.b(aygVar.d());
        axgVar.g(String.valueOf(aygVar.e()));
        axgVar.f(aygVar.b());
        IDsRelationCallback iDsRelationCallbackA = awz.a();
        if (iDsRelationCallbackA != null) {
            axgVar.j(String.valueOf(iDsRelationCallbackA.isSupportRelateRank() ? 1 : 0));
        }
        axgVar.i(aycVar.b());
        axgVar.c(aycVar.g());
        axgVar.l(aycVar.e());
        axgVar.b(aycVar.n().intValue());
        new ayl().d(axgVar);
    }

    public static void a(Context context, axi axiVar, ayc aycVar, Map<String, List<String>> map) {
        if (aycVar == null) {
            return;
        }
        axg axgVar = new axg();
        axgVar.d("2500001");
        axgVar.e(a(aycVar.c()));
        axgVar.a(a(context, aycVar.c()));
        List<String> listA = a(axiVar);
        axgVar.c(listA.size() > 0 ? "1" : "0");
        axgVar.b(a(context, listA, aycVar));
        IUtilCallback iUtilCallbackC = awz.c();
        if (iUtilCallbackC != null) {
            axgVar.g(String.valueOf(iUtilCallbackC.isInHmsProcess() ? 1 : 0));
        }
        axgVar.f(a(map, o0.a(axiVar)));
        axgVar.j(aycVar.b());
        axgVar.i(aycVar.o());
        axgVar.h(String.valueOf(aycVar.j()));
        axgVar.c(aycVar.g());
        axgVar.l(aycVar.e());
        axgVar.b(aycVar.n().intValue());
        new ayl().d(axgVar);
    }

    public static void a(Context context, axi axiVar, ayc aycVar) {
        String strB = aycVar.b();
        String strA = w0.a(strB);
        HashMap map = new HashMap();
        int i = 0;
        if (axiVar.h()) {
            int iA = aym.b(context).a(aycVar.c().get(0));
            if (1 == iA || 2 == iA) {
                i = 1;
            }
        } else {
            int iR = -1;
            for (axm axmVar : axiVar.i()) {
                if (axmVar != null && !axmVar.h()) {
                    StringBuilder sb = new StringBuilder();
                    for (axh axhVar : axmVar.b()) {
                        sb.append(axhVar.i());
                        sb.append(",");
                        iR = axhVar.r();
                    }
                    String string = sb.toString();
                    if (!StringUtils.isBlank(string)) {
                        string = string.substring(0, string.length() - 1);
                    }
                    map.put(axmVar.j(), string);
                }
            }
            i = iR;
        }
        String jsonNoException = JsonUtil.toJsonNoException(map);
        axg axgVar = new axg();
        axgVar.d("2500004");
        axgVar.e(strA);
        axgVar.a(strB);
        axgVar.c(String.valueOf(i));
        axgVar.b(jsonNoException);
        axgVar.c(aycVar.g());
        axgVar.l(aycVar.e());
        axgVar.b(aycVar.n().intValue());
        new ayl().d(axgVar);
    }

    public static void a(int i, String str, String str2, String str3, String str4) {
        axg axgVar = new axg();
        axgVar.d("2500003");
        axgVar.e(String.valueOf(i));
        axgVar.a(str4);
        axgVar.c(str);
        axgVar.b(str2);
        axgVar.g(str3);
        new ayl().d(axgVar);
    }

    private static List<String> a(axi axiVar) {
        ArrayList arrayList = new ArrayList();
        if (axiVar != null && !ListUtil.isEmpty(axiVar.i())) {
            for (axm axmVar : axiVar.i()) {
                if (axmVar != null && !axmVar.h()) {
                    Iterator<axh> it = axmVar.b().iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().i());
                    }
                }
            }
        }
        return arrayList;
    }

    public static String a(Map<String, List<String>> map, Map<String, List<String>> map2) {
        StringBuilder sb = new StringBuilder();
        for (String str : map2.keySet()) {
            List<String> list = map.get(str);
            List<String> list2 = map2.get(str);
            if (list != null && list2 != null) {
                int i = 0;
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    if (i2 >= list.size() || !list2.get(i2).equals(list.get(i2))) {
                        i = i2 + 1;
                        break;
                    }
                }
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append(":");
                sb.append(i);
            }
        }
        return sb.toString();
    }

    private static String a(List<String> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(",");
        }
        String string = sb.toString();
        return !StringUtils.isBlank(string) ? string.substring(0, string.length() - 1) : string;
    }

    private static String a(Context context, List<String> list, ayc aycVar) {
        e eVar = new e(context);
        String strE = aycVar.e();
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            HashMap map = new HashMap();
            map.put(str, String.valueOf(0));
            for (AdIECImpRecord adIECImpRecord : eVar.query(AdIECImpRecord.class, null, "pkgName=? and contentId=?", new String[]{strE, str}, null, null)) {
                map.put(adIECImpRecord.c(), String.valueOf(adIECImpRecord.a()));
            }
            arrayList.add(map);
        }
        return JsonUtil.toJsonNoException(arrayList);
    }

    private static String a(Context context, List<String> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb.append(aym.b(context).g(it.next()));
            sb.append(",");
        }
        String string = sb.toString();
        return !StringUtils.isBlank(string) ? string.substring(0, string.length() - 1) : string;
    }
}
