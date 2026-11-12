package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.ads.jsb.inner.data.H5Ad;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.ContentTemplateRecord;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class w extends i {

    public static class a extends f implements pg.a {
        @Override // com.huawei.openalliance.ad.pg.a
        public void a(Map<String, List<com.huawei.openalliance.ad.inter.data.b>> map) {
            if (map == null || map.size() == 0) {
                hw.b("JsbReqInterstitialAd", " ads map is empty.");
                j.a(this.g, this.f18742c, 1005, null, true);
                return;
            }
            List<com.huawei.openalliance.ad.inter.data.b> listA = a(map, this.f18740a);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<H5Ad> listA2 = a(arrayList, arrayList2, listA, com.huawei.openalliance.ad.utils.cw.b(this.f18741b));
            this.d.a(arrayList);
            this.e.a(arrayList2);
            String strB = this.h ? com.huawei.openalliance.ad.utils.bk.b(new Pair(12, b(map))) : com.huawei.openalliance.ad.utils.bk.b(listA2);
            if (listA2.size() > 0) {
                j.a(this.g, this.f18742c, 1000, strB, true);
            } else {
                hw.b("JsbReqInterstitialAd", " ads map is empty.");
                j.a(this.g, this.f18742c, 1005, null, true);
            }
        }

        @Override // com.huawei.openalliance.ad.pg.a
        public void a(int i) {
            j.a(this.g, this.f18742c, bp.a(i), null, true);
        }

        private Map<String, List<H5Ad>> b(Map<String, List<com.huawei.openalliance.ad.inter.data.b>> map) {
            if (com.huawei.openalliance.ad.utils.br.a(map)) {
                return null;
            }
            HashMap map2 = new HashMap();
            for (Map.Entry<String, List<com.huawei.openalliance.ad.inter.data.b>> entry : map.entrySet()) {
                if (!com.huawei.openalliance.ad.utils.bm.a(entry.getValue())) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<com.huawei.openalliance.ad.inter.data.b> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        arrayList.add(new H5Ad((com.huawei.openalliance.ad.inter.data.d) it.next()));
                    }
                    map2.put(entry.getKey(), arrayList);
                }
            }
            return map2;
        }

        private List<com.huawei.openalliance.ad.inter.data.b> a(Map<String, List<com.huawei.openalliance.ad.inter.data.b>> map, String str) {
            if (com.huawei.openalliance.ad.utils.br.a(map)) {
                return null;
            }
            if (!TextUtils.isEmpty(str)) {
                return map.get(str);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, List<com.huawei.openalliance.ad.inter.data.b>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().getValue());
            }
            return arrayList;
        }

        private List<H5Ad> a(List<ContentRecord> list, List<ContentRecord> list2, List<com.huawei.openalliance.ad.inter.data.b> list3, byte[] bArr) {
            ArrayList arrayList = new ArrayList(4);
            if (list3 != null && list3.size() > 0) {
                for (com.huawei.openalliance.ad.inter.data.b bVar : list3) {
                    if (bVar != null && !bVar.isExpired() && bVar.c_()) {
                        com.huawei.openalliance.ad.inter.data.d dVar = (com.huawei.openalliance.ad.inter.data.d) bVar;
                        arrayList.add(new H5Ad(dVar));
                        ContentRecord contentRecordA = pf.a(dVar);
                        contentRecordA.a(bArr);
                        contentRecordA.g(com.huawei.openalliance.ad.utils.as.c());
                        if (3 != contentRecordA.aQ()) {
                            list.add(contentRecordA);
                        } else if (!TextUtils.isEmpty(contentRecordA.aP()) && !Constants.NULL_TEMPLATE_ID.equals(contentRecordA.aP())) {
                            ContentTemplateRecord contentTemplateRecord = new ContentTemplateRecord(contentRecordA.o(), contentRecordA.aP(), contentRecordA.aY(), contentRecordA.aV(), contentRecordA.br());
                            if (!TextUtils.isEmpty(contentRecordA.ba())) {
                                contentTemplateRecord.a(contentRecordA.ba());
                            }
                            this.f.a(contentTemplateRecord);
                            list2.add(contentRecordA);
                        }
                    }
                }
            }
            return arrayList;
        }

        a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback, String str2) {
            super(context, str, remoteCallResultCallback, str2);
        }

        a(Context context, RemoteCallResultCallback<String> remoteCallResultCallback, String str) {
            super(context, remoteCallResultCallback, str);
        }
    }

    @Override // com.huawei.openalliance.ad.i
    protected void b(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("slotId");
        String strOptString2 = jSONObject.optString(JsbMapKeyNames.H5_MEDIA_CONTENT);
        int iOptInt = jSONObject.optInt("deviceType");
        RequestOptions requestOptionsC = c(context, str);
        com.huawei.openalliance.ad.inter.g gVar = new com.huawei.openalliance.ad.inter.g(context);
        gVar.a(strOptString);
        gVar.a((Integer) 3);
        gVar.b(c(strOptString2));
        gVar.a(g(str));
        gVar.a(new a(context, strOptString, remoteCallResultCallback, this.f19295a));
        gVar.a(requestOptionsC, iOptInt);
    }

    public w() {
        super("pps.interstitial.request");
    }
}
