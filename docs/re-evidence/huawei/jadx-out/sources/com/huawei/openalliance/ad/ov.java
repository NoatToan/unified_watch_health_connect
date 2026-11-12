package com.huawei.openalliance.ad;

import android.content.Context;
import android.util.Pair;
import com.huawei.openalliance.ad.beans.metadata.AppCollection;
import com.huawei.openalliance.ad.beans.server.AppDataCollectionRsp;
import com.huawei.openalliance.ad.beans.server.DelSyncedAppDataReq;
import com.huawei.openalliance.ad.beans.server.RetAndMsg;
import com.huawei.openalliance.ad.constant.ConfigMapKeys;
import com.huawei.openalliance.ad.constant.RTCMethods;
import com.huawei.openalliance.ad.db.bean.AppDataCollectionRecord;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class ov implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gf f19921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f19922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<AppDataCollectionRecord> f19923c = new ArrayList();
    private final List<String> d = new ArrayList();
    private final List<String> e = new ArrayList();
    private List<AppDataCollectionRecord> f;
    private List<AppCollection> g;
    private List<AppCollection> h;
    private final int i;

    public RetAndMsg c() {
        String string;
        RetAndMsg retAndMsg = new RetAndMsg();
        List<AppDataCollectionRecord> listA = ep.a(this.f19922b).a(com.huawei.openalliance.ad.utils.dg.a(fp.b(this.f19922b).b(ConfigMapKeys.MAX_UPLOAD_APP_DATA_SIZE, ""), 50));
        this.f = listA;
        if (com.huawei.openalliance.ad.utils.bm.a(listA)) {
            hw.b("AppDataCollectionProcessor", "report data empty");
            string = "data empty";
        } else {
            retAndMsg.a(this.f.size());
            hw.a("AppDataCollectionProcessor", "report data");
            AppDataCollectionRsp appDataCollectionRspB = this.f19921a.b(pn.b(this.f, this.f19922b));
            if (appDataCollectionRspB != null && 200 == appDataCollectionRspB.a()) {
                return retAndMsg;
            }
            hw.a("AppDataCollectionProcessor", "report app data collection failed");
            StringBuilder sb = new StringBuilder("report failed, code: ");
            sb.append(appDataCollectionRspB == null ? -2 : appDataCollectionRspB.a());
            string = sb.toString();
        }
        retAndMsg.a(string);
        retAndMsg.a(false);
        return retAndMsg;
    }

    @Override // com.huawei.openalliance.ad.qz
    public void b() {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.ov.1
            @Override // java.lang.Runnable
            public void run() {
                String str;
                try {
                    if (8 == ov.this.i || !cc.b(ov.this.f19922b)) {
                        str = "is TV or not inner device";
                    } else {
                        if (com.huawei.openalliance.ad.utils.di.a(ov.this.f19922b)) {
                            eq.a(ov.this.f19922b).b();
                            Pair<Integer, String> pairA = com.huawei.openalliance.ad.utils.cf.a(ov.this.f19922b, "/dd/sync", "");
                            if (pairA != null && ((Integer) pairA.first).intValue() == 200 && !com.huawei.openalliance.ad.utils.dg.b((String) pairA.second)) {
                                ov.this.a((String) pairA.second);
                                if (!com.huawei.openalliance.ad.utils.bm.a(ov.this.g) || !com.huawei.openalliance.ad.utils.bm.a(ov.this.h)) {
                                    ov ovVar = ov.this;
                                    ovVar.a(ovVar.g, ov.this.h);
                                    ov ovVar2 = ov.this;
                                    ovVar2.a(ovVar2.a());
                                } else {
                                    hw.a("AppDataCollectionProcessor", "empty list from kit");
                                }
                            } else {
                                hw.a("AppDataCollectionProcessor", "empty resp from kit");
                            }
                            ov.this.e();
                            return;
                        }
                        str = "no need to sync";
                    }
                    hw.a("AppDataCollectionProcessor", str);
                } catch (Exception e) {
                    hw.a(3, "AppDataCollectionProcessor", e);
                }
            }
        });
    }

    public RetAndMsg b(boolean z) {
        RetAndMsg retAndMsg = new RetAndMsg();
        if (!z) {
            retAndMsg.a(false);
            retAndMsg.a("report data error");
            hw.b("AppDataCollectionProcessor", "report app collection data error");
            return retAndMsg;
        }
        if (com.huawei.openalliance.ad.utils.bm.a(this.f)) {
            hw.b("AppDataCollectionProcessor", "no ids need del");
            retAndMsg.a(false);
            retAndMsg.a("upLoadRecords empty");
            return retAndMsg;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<AppDataCollectionRecord> it = this.f.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().b()));
        }
        int iB = ep.a(this.f19922b).b(arrayList);
        retAndMsg.a(iB);
        if (iB < 0) {
            retAndMsg.a(false);
            retAndMsg.a("del error");
        }
        return retAndMsg;
    }

    public boolean a() {
        long jA = ep.a(this.f19922b).a(this.f19923c);
        hw.a("AppDataCollectionProcessor", "insert appCollectionRecord : %s", Long.valueOf(jA));
        return jA > 0;
    }

    public void a(boolean z) {
        if (!z) {
            hw.b("AppDataCollectionProcessor", "insert error, no need del sync data");
            return;
        }
        DelSyncedAppDataReq delSyncedAppDataReq = new DelSyncedAppDataReq();
        delSyncedAppDataReq.a(this.f19922b.getPackageName());
        delSyncedAppDataReq.a(this.d);
        delSyncedAppDataReq.b(this.e);
        hw.b("AppDataCollectionProcessor", "rpt del sync data req is : %s", com.huawei.openalliance.ad.utils.bk.b(this.f19922b, delSyncedAppDataReq));
        na.a(this.f19922b).a(RTCMethods.DEL_SYNCED_APP_DATA, com.huawei.openalliance.ad.utils.bk.b(delSyncedAppDataReq), null, null);
    }

    public void a(List<AppCollection> list, List<AppCollection> list2) {
        if (!com.huawei.openalliance.ad.utils.bm.a(list)) {
            Collection<AppDataCollectionRecord> collectionA = pn.a(list, this.f19922b.getPackageName());
            if (!com.huawei.openalliance.ad.utils.bm.a(collectionA)) {
                this.f19923c.addAll(collectionA);
                Iterator<AppCollection> it = list.iterator();
                while (it.hasNext()) {
                    this.d.add(it.next().c());
                }
            }
        }
        if (com.huawei.openalliance.ad.utils.bm.a(list2)) {
            return;
        }
        Collection<AppDataCollectionRecord> collectionA2 = pn.a(list2, this.f19922b.getPackageName());
        if (com.huawei.openalliance.ad.utils.bm.a(collectionA2)) {
            return;
        }
        this.f19923c.addAll(collectionA2);
        Iterator<AppCollection> it2 = list2.iterator();
        while (it2.hasNext()) {
            this.e.add(it2.next().c());
        }
    }

    public void a(long j, long j2, String str, RetAndMsg retAndMsg, RetAndMsg retAndMsg2) {
        com.huawei.openalliance.ad.analysis.b bVar = new com.huawei.openalliance.ad.analysis.b();
        bVar.al(String.valueOf(j - j2));
        bVar.am(String.valueOf(j2));
        bVar.an(str);
        bVar.ao(String.valueOf(retAndMsg.a()));
        bVar.ap(retAndMsg.b());
        bVar.aq(String.valueOf(retAndMsg.c()));
        bVar.ar(String.valueOf(retAndMsg2.a()));
        bVar.as(retAndMsg2.b());
        bVar.at(String.valueOf(retAndMsg2.c()));
        hw.b("AppDataCollectionProcessor", "cache event beforeCount - afterCount = %s, afterCount = %s", bVar.aP(), bVar.aQ());
        new com.huawei.openalliance.ad.analysis.c(this.f19922b).a("AppDataCollectionRecord", bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        d();
        ep epVarA = ep.a(this.f19922b);
        long jC = epVarA.c();
        if (jC == 0) {
            hw.a("AppDataCollectionProcessor", "local data record num is 0, return");
            return;
        }
        RetAndMsg retAndMsgC = c();
        RetAndMsg retAndMsgB = b(retAndMsgC.a());
        long jC2 = epVarA.c();
        Map<String, Long> mapD = epVarA.d();
        StringBuilder sb = new StringBuilder();
        if (!com.huawei.openalliance.ad.utils.br.a(mapD)) {
            for (Map.Entry<String, Long> entry : mapD.entrySet()) {
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                sb.append(',');
            }
            com.huawei.openalliance.ad.utils.dg.a(sb, ',');
        }
        String string = sb.toString();
        hw.a("AppDataCollectionProcessor", "report remaining records: %s", string);
        a(jC, jC2, string, retAndMsgC, retAndMsgB);
    }

    private void d() {
        ep.a(this.f19922b).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("appCollections");
            String strOptString2 = jSONObject.optString("appInstallDatas");
            if (!com.huawei.openalliance.ad.utils.dg.b(strOptString)) {
                List<AppCollection> list = (List) com.huawei.openalliance.ad.utils.bk.a(strOptString, List.class, AppCollection.class);
                this.g = list;
                hw.b("AppDataCollectionProcessor", "convert collectionRecord size is : %s", Integer.valueOf(list.size()));
            }
            if (com.huawei.openalliance.ad.utils.dg.b(strOptString2)) {
                return;
            }
            List<AppCollection> list2 = (List) com.huawei.openalliance.ad.utils.bk.a(strOptString2, List.class, AppCollection.class);
            this.h = list2;
            hw.b("AppDataCollectionProcessor", "convert installDataRecords size is : %s", Integer.valueOf(list2.size()));
        } catch (JSONException unused) {
            hw.b("AppDataCollectionProcessor", "parse data error, json format error");
        }
    }

    public ov(Context context, int i) {
        this.f19922b = context;
        this.f19921a = fi.a(context);
        this.i = i;
    }
}
