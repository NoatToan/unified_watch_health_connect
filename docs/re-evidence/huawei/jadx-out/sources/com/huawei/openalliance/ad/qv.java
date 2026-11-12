package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.Ad30;
import com.huawei.openalliance.ad.beans.metadata.FlowControl;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class qv {
    public static boolean a(Context context, AdSlotParam adSlotParam) {
        String str;
        HashMap map = new HashMap();
        if (adSlotParam == null) {
            str = "adSlotParam is null";
        } else {
            List<String> listA = adSlotParam.a();
            if (com.huawei.openalliance.ad.utils.bm.a(listA) || context == null) {
                str = "adIds is empty";
            } else {
                ArrayList arrayList = new ArrayList(listA);
                try {
                    if (fp.b(context).cC() == 0) {
                        adSlotParam.a(a(listA));
                        return true;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    for (String str2 : listA) {
                        FlowControl flowControlU = fp.b(context).u(str2);
                        if (flowControlU != null) {
                            a(context, map, arrayList, secureRandom, str2, flowControlU, adSlotParam.D());
                        } else {
                            map.put(str2, 0);
                        }
                    }
                    if (!com.huawei.openalliance.ad.utils.bm.a(arrayList)) {
                        adSlotParam.a(map);
                        adSlotParam.a(arrayList);
                        return true;
                    }
                    str = "adIdTmp is empty";
                } catch (Throwable th) {
                    hw.c("FlowControlManager", "filter err, %s", th.getClass().getSimpleName());
                }
            }
        }
        a(context, str);
        return false;
    }

    private static void a(Context context, Map<String, Integer> map, List<String> list, SecureRandom secureRandom, String str, FlowControl flowControl, int i) {
        if (System.currentTimeMillis() > flowControl.b()) {
            a(context, str, i);
            map.put(str, 0);
            return;
        }
        int iA = flowControl.a();
        if (iA <= 0 || iA > 100) {
            map.put(str, 0);
        } else {
            if (secureRandom.nextInt(101) > iA) {
                map.put(str, 1);
                return;
            }
            hw.b("FlowControlManager", "discard slot %s", str);
            fp.b(context).v(str);
            list.remove(str);
        }
    }

    private static void a(final Context context, final String str, final int i) {
        com.huawei.openalliance.ad.utils.o.h(new Runnable() { // from class: com.huawei.openalliance.ad.qv.1
            @Override // java.lang.Runnable
            public void run() {
                Context context2 = context;
                if (context2 == null) {
                    return;
                }
                gk gkVarB = fp.b(context2);
                int iW = gkVarB.w(str);
                hw.a("FlowControlManager", "fc counts: %d", Integer.valueOf(iW));
                if (iW <= 0) {
                    hw.b("FlowControlManager", "no need report");
                } else {
                    new com.huawei.openalliance.ad.analysis.h(context).a(str, iW, i);
                    gkVarB.x(str);
                }
            }
        });
    }

    public static void a(Context context, String str) {
        try {
            if (context == null) {
                hw.c("FlowControlManager", "reportRequestDiscard err: context == null");
            } else {
                new com.huawei.openalliance.ad.analysis.c(context).c(str);
            }
        } catch (Exception e) {
            hw.d("FlowControlManager", "reportRequestDiscard err: %s", e.getClass().getSimpleName());
        }
    }

    public static void a(Context context, AdContentRsp adContentRsp) {
        try {
            if (context == null || adContentRsp == null) {
                hw.b("FlowControlManager", "para is empty");
                return;
            }
            List<Ad30> listC = adContentRsp.c();
            if (com.huawei.openalliance.ad.utils.bm.a(listC)) {
                return;
            }
            for (Ad30 ad30 : listC) {
                if (ad30 != null && ad30.i() != null) {
                    fp.b(context).a(ad30.a(), ad30.i());
                }
            }
        } catch (Throwable th) {
            hw.c("FlowControlManager", "save fc err, %s", th.getClass().getSimpleName());
        }
    }

    private static Map<String, Integer> a(List<String> list) {
        HashMap map = new HashMap();
        if (!com.huawei.openalliance.ad.utils.bm.a(list)) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                map.put(it.next(), 0);
            }
        }
        return map;
    }
}
