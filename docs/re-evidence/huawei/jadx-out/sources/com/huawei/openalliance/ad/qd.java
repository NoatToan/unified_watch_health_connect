package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.Ad30;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.metadata.ContentExt;
import com.huawei.openalliance.ad.beans.metadata.ImpEX;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.inter.data.IPreCheckInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class qd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Integer> f20124a;

    private static void b(List<IPreCheckInfo> list, Ad30 ad30, qk qkVar) {
        List<Content> listC = ad30.c();
        if (com.huawei.openalliance.ad.utils.bm.a(listC)) {
            return;
        }
        for (Content content : listC) {
            if (content != null) {
                list.add(a(ad30, false, qkVar, content));
            }
        }
    }

    private static void a(List<IPreCheckInfo> list, Ad30 ad30, qk qkVar) {
        List<Content> listH = ad30.h();
        if (com.huawei.openalliance.ad.utils.bm.a(listH)) {
            return;
        }
        for (Content content : listH) {
            if (content != null) {
                list.add(a(ad30, true, qkVar, content));
            }
        }
    }

    private static void a(int i) {
        if (i != -1) {
            String strA = com.huawei.openalliance.ad.utils.dg.a(Integer.valueOf(i));
            if (!f20124a.containsKey(strA)) {
                f20124a.put(strA, 1);
            } else {
                f20124a.put(strA, Integer.valueOf(f20124a.get(strA).intValue() + 1));
            }
        }
    }

    private static Map<String, String> a(Content content) {
        HashMap map = new HashMap();
        List<ContentExt> listQ = content.Q();
        if (!com.huawei.openalliance.ad.utils.bm.a(listQ)) {
            for (ContentExt contentExt : listQ) {
                if (contentExt != null) {
                    map.put(contentExt.a(), com.huawei.openalliance.ad.utils.dg.e(contentExt.b()));
                }
            }
        }
        List<ImpEX> listP = content.P();
        if (!com.huawei.openalliance.ad.utils.bm.a(listP)) {
            for (ImpEX impEX : listP) {
                if (impEX != null) {
                    map.put(impEX.a(), com.huawei.openalliance.ad.utils.dg.e(impEX.b()));
                }
            }
        }
        return map;
    }

    private static List<ImpEX> a(List<ImpEX> list, List<ImpEX> list2) {
        ArrayList arrayList = new ArrayList();
        if (!com.huawei.openalliance.ad.utils.bm.a(list2)) {
            arrayList.addAll(list2);
        }
        if (!com.huawei.openalliance.ad.utils.bm.a(list)) {
            arrayList.addAll(list);
        }
        if (com.huawei.openalliance.ad.utils.bm.a(arrayList)) {
            return null;
        }
        return arrayList;
    }

    private static List<qj> a(Context context, List<Integer> list) {
        qj qeVar;
        if (list == null || context == null) {
            if (list == null) {
                hw.c("AdFilterManager", "createFilters filterList is null");
            }
            if (context != null) {
                return null;
            }
            hw.c("AdFilterManager", "createFilters context is null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num != null) {
                int iIntValue = num.intValue();
                if (iIntValue == 1) {
                    qeVar = new qe(context);
                } else if (iIntValue == 2) {
                    qeVar = new qf(context);
                } else if (iIntValue == 3) {
                    qeVar = new qk(context);
                } else if (iIntValue == 4) {
                    qeVar = new qg(context);
                } else if (iIntValue == 99) {
                    qeVar = new qi(context);
                }
                arrayList.add(qeVar);
            }
        }
        return arrayList;
    }

    public static List<IPreCheckInfo> a(Context context, AdContentRsp adContentRsp) {
        ArrayList arrayList = new ArrayList();
        if (context != null && adContentRsp != null) {
            List<Ad30> listC = adContentRsp.c();
            if (!com.huawei.openalliance.ad.utils.bm.a(adContentRsp.c())) {
                for (Ad30 ad30 : listC) {
                    if (ad30 != null) {
                        qk qkVar = new qk(context);
                        b(arrayList, ad30, qkVar);
                        a(arrayList, ad30, qkVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private static com.huawei.openalliance.ad.inter.data.f a(Ad30 ad30, boolean z, qk qkVar, Content content) {
        com.huawei.openalliance.ad.inter.data.f fVar = new com.huawei.openalliance.ad.inter.data.f();
        fVar.b(content.g());
        fVar.a(ad30.a());
        fVar.a(z);
        fVar.a(a(content));
        fVar.a(qkVar.a(content.c()));
        return fVar;
    }

    public static AdContentRsp a(Context context, AdContentRsp adContentRsp, int i) {
        long jC = com.huawei.openalliance.ad.utils.as.c();
        f20124a = new HashMap();
        if (adContentRsp == null) {
            return null;
        }
        List<Ad30> listC = adContentRsp.c();
        if (!com.huawei.openalliance.ad.utils.bm.a(listC)) {
            for (Ad30 ad30 : listC) {
                List<Content> listC2 = ad30.c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                List<ImpEX> listF = ad30.f();
                if (!com.huawei.openalliance.ad.utils.bm.a(listC2)) {
                    for (Content content : listC2) {
                        if (content != null) {
                            content.a(adContentRsp.h(), i);
                            content.f(adContentRsp.o());
                            content.g(a(listF, content.P()));
                            int iA = a(ad30.a(), a(context, content.y()), content, i, adContentRsp.o());
                            if (iA == -1) {
                                arrayList.add(content);
                            } else {
                                a(iA);
                                arrayList2.add(content);
                            }
                        }
                    }
                }
                ad30.a(arrayList);
                ad30.c(arrayList2);
            }
            if (!com.huawei.openalliance.ad.utils.br.a(f20124a)) {
                adContentRsp.a(f20124a);
            }
            long jC2 = com.huawei.openalliance.ad.utils.as.c() - jC;
            adContentRsp.a(jC2);
            if (hw.a()) {
                hw.a("AdFilterManager", "filter ad contents, duration: %s ms", Long.valueOf(jC2));
            }
        }
        return adContentRsp;
    }

    private static int a(String str, List<qj> list, Content content, int i, int i2) {
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            return -1;
        }
        boolean zA = false;
        int iB = -1;
        for (qj qjVar : list) {
            zA |= qjVar.a(str, i, i2, content);
            if (zA && iB == -1) {
                iB = qjVar.b();
            }
        }
        return iB;
    }
}
