package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.beans.metadata.Ad30;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.metadata.Precontent;
import com.huawei.openalliance.ad.beans.metadata.v3.TemplateV3;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.IPlacementAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class po {
    public static List<ContentRecord> b(AdContentRsp adContentRsp, int i) {
        ArrayList arrayList = new ArrayList();
        if (adContentRsp != null) {
            List<Precontent> listF = adContentRsp.f();
            String strK = adContentRsp.k();
            if (!com.huawei.openalliance.ad.utils.bm.a(listF)) {
                for (Precontent precontent : listF) {
                    precontent.a(adContentRsp.h(), i);
                    ContentRecord contentRecordA = pn.a(precontent.a(), precontent, i);
                    if (contentRecordA != null) {
                        contentRecordA.y(strK);
                        contentRecordA.ad(adContentRsp.l());
                        contentRecordA.D(adContentRsp.q());
                        contentRecordA.E(adContentRsp.r());
                        List<TemplateV3> listM = precontent.m();
                        if (com.huawei.openalliance.ad.utils.bm.a(listM)) {
                            arrayList.add(contentRecordA);
                        } else {
                            for (TemplateV3 templateV3 : listM) {
                                contentRecordA.L(templateV3.a());
                                contentRecordA.a(templateV3.b());
                                contentRecordA.Q(templateV3.c());
                                contentRecordA.Z(templateV3.d());
                                contentRecordA.aa(templateV3.e());
                                contentRecordA.ab(templateV3.f());
                                arrayList.add(contentRecordA);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<ContentRecord> a(Map<String, List<IPlacementAd>> map) {
        ContentRecord contentRecordA;
        ArrayList arrayList = new ArrayList();
        if (!com.huawei.openalliance.ad.utils.br.a(map)) {
            Iterator<List<IPlacementAd>> it = map.values().iterator();
            while (it.hasNext()) {
                for (IPlacementAd iPlacementAd : it.next()) {
                    if ((iPlacementAd instanceof com.huawei.openalliance.ad.inter.data.h) && (contentRecordA = pq.a((com.huawei.openalliance.ad.inter.data.h) iPlacementAd)) != null) {
                        arrayList.add(contentRecordA);
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<ContentRecord> a(AdContentRsp adContentRsp, int i) {
        List<Ad30> listC = adContentRsp.c();
        ArrayList arrayList = new ArrayList();
        if (!com.huawei.openalliance.ad.utils.bm.a(listC)) {
            for (Ad30 ad30 : listC) {
                String strA = ad30.a();
                int iB = ad30.b();
                String strG = ad30.g();
                if (200 != iB) {
                    hw.b("NetElementGetter", "ad failed, retcode30: %s, slotId: %s.", Integer.valueOf(iB), strA);
                }
                ArrayList<Content> arrayList2 = new ArrayList();
                if (ad30.c() != null) {
                    arrayList2.addAll(ad30.c());
                }
                if (!com.huawei.openalliance.ad.utils.bm.a(arrayList2)) {
                    for (Content content : arrayList2) {
                        content.a(adContentRsp.h(), i);
                        ContentRecord contentRecordA = pn.a(strA, content, i, strG);
                        if (contentRecordA != null) {
                            contentRecordA.o(adContentRsp.o());
                            contentRecordA.y(adContentRsp.k());
                            contentRecordA.ad(adContentRsp.l());
                            contentRecordA.D(adContentRsp.q());
                            contentRecordA.E(adContentRsp.r());
                            contentRecordA.U(adContentRsp.v());
                            arrayList.add(contentRecordA);
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
