package com.huawei.openalliance.ad.analysis;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.inner.ApiStatisticsReq;
import com.huawei.openalliance.ad.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.constant.ApiNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.df;
import com.huawei.openalliance.ad.dn;
import com.huawei.openalliance.ad.fl;
import com.huawei.openalliance.ad.inter.data.IAd;
import com.huawei.openalliance.ad.utils.ai;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.br;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class d {
    private static boolean a(int i) {
        return i >= 200 && i < 300 && i != 204;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (dg.l(str)) {
            str = dn.d(str);
        }
        return ai.c(context, str, "normal");
    }

    public static void b(final Context context, final ContentRecord contentRecord) {
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.analysis.d.6
            @Override // java.lang.Runnable
            public void run() {
                new c(context).c(contentRecord);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(DelayInfo delayInfo, String str) {
        int i;
        int iQ = delayInfo.q();
        if (iQ == 494) {
            Integer numW = delayInfo.w();
            iQ = numW != null ? numW.intValue() : delayInfo.r() + 20000;
        } else if (iQ == -2) {
            if ("1".equals(str)) {
                i = 10001;
            } else if ("2".equals(str)) {
                i = 10002;
            } else {
                i = "3".equals(str) ? 10003 : 10000;
            }
            iQ = delayInfo.s() + i;
        }
        delayInfo.a(iQ);
        return iQ;
    }

    public static void a(Context context, String str, String str2, int i, int i2, long j, long j2, int i3) {
        if (context == null || j == 0 || j >= j2) {
            return;
        }
        ApiStatisticsReq apiStatisticsReqA = a(str, str2, i2, i3);
        apiStatisticsReqA.b(j2 - j);
        apiStatisticsReqA.d(i);
        a(context, apiStatisticsReqA);
    }

    public static void a(final Context context, final String str, final DelayInfo delayInfo, final String str2, final ContentRecord contentRecord, final int i) {
        if (context == null || delayInfo == null || delayInfo.a() <= 0) {
            return;
        }
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.analysis.d.3
            @Override // java.lang.Runnable
            public void run() {
                ContentRecord contentRecordH;
                delayInfo.a(str);
                c cVar = new c(context);
                ContentRecord contentRecord2 = contentRecord;
                if (contentRecord2 != null) {
                    delayInfo.b(contentRecord2.V());
                    delayInfo.b(Collections.singletonList(contentRecord.o()));
                    delayInfo.a(contentRecord.au());
                    delayInfo.a(Integer.valueOf(contentRecord.F()));
                    MetaData metaDataJ = contentRecord.j();
                    if (metaDataJ != null) {
                        delayInfo.d(metaDataJ.u());
                    }
                    String strN = contentRecord.n();
                    if (!dg.b(strN)) {
                        delayInfo.f(String.valueOf(fl.a(context).a(strN)));
                    }
                }
                if (!delayInfo.t() && (contentRecordH = df.h()) != null) {
                    delayInfo.e(contentRecordH.o());
                    delayInfo.b(d.b(context, contentRecordH.A()));
                }
                DelayInfo delayInfo2 = delayInfo;
                ContentRecord contentRecord3 = contentRecord;
                cVar.a(ApiNames.LOAD_AD, str2, delayInfo, i, d.b(delayInfo2, contentRecord3 != null ? contentRecord3.V() : null));
            }
        });
    }

    public static void a(final Context context, final ContentRecord contentRecord, final int i, final int i2) {
        if (context == null) {
            return;
        }
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.analysis.d.4
            @Override // java.lang.Runnable
            public void run() {
                new c(context).a(contentRecord, i, i2);
            }
        });
    }

    public static void a(final Context context, final ContentRecord contentRecord) {
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.analysis.d.5
            @Override // java.lang.Runnable
            public void run() {
                new c(context).b(contentRecord);
            }
        });
    }

    private static void a(final Context context, final ApiStatisticsReq apiStatisticsReq) {
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.analysis.d.1
            @Override // java.lang.Runnable
            public void run() {
                new c(context).a(apiStatisticsReq);
            }
        });
    }

    public static <T extends IAd> void a(final Context context, final int i, final String str, final int i2, final Map<String, List<T>> map, final DelayInfo delayInfo) {
        if (context == null || delayInfo == null || delayInfo.a() <= 0) {
            return;
        }
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.analysis.d.2
            @Override // java.lang.Runnable
            public void run() {
                c cVar = new c(context);
                if (!br.a(map)) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList.add((String) entry.getKey());
                        List<IAd> list = (List) entry.getValue();
                        if (!bm.a(list)) {
                            for (IAd iAd : list) {
                                if (iAd != null) {
                                    arrayList2.add(iAd.getContentId());
                                }
                            }
                        }
                    }
                    delayInfo.a(arrayList);
                    delayInfo.b(arrayList2);
                }
                cVar.a(ApiNames.LOAD_AD, str, delayInfo, i2, i);
            }
        });
    }

    private static ApiStatisticsReq a(String str, String str2, int i, int i2) {
        ApiStatisticsReq apiStatisticsReq = new ApiStatisticsReq();
        apiStatisticsReq.b(str);
        apiStatisticsReq.d(str2);
        apiStatisticsReq.c(i);
        apiStatisticsReq.b(i2);
        return apiStatisticsReq;
    }

    private static int a(String str, int i, long j, List<ContentRecord> list) {
        ContentRecord next;
        if (TextUtils.isEmpty(str)) {
            return 4;
        }
        if (!bm.a(list)) {
            Iterator<ContentRecord> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next != null && str.equals(next.o())) {
                    break;
                }
            }
        } else {
            next = null;
            break;
        }
        if (next == null) {
            return 6;
        }
        int iV = next.v();
        int iU = next.u();
        if (i == 0 && (next.F() == 12 || iU <= iV)) {
            return 2;
        }
        if (i == 1 && next.F() != 12 && iU > iV) {
            return 3;
        }
        if (j < next.t() || j > next.s()) {
            return 1;
        }
        return next.k() == 0 ? 5 : 7;
    }

    public static int a(AdContentRsp adContentRsp, ContentRecord contentRecord, String str, int i, long j, List<ContentRecord> list) {
        if (adContentRsp == null) {
            return -1;
        }
        if (!a(adContentRsp.a())) {
            return adContentRsp.a() + 20000;
        }
        if (contentRecord == null) {
            return a(str, i, j, list) + 30000;
        }
        return 200;
    }
}
