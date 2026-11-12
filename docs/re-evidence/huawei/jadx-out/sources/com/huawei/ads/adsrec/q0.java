package com.huawei.ads.adsrec;

import android.content.Context;
import com.huawei.ads.adsrec.bean.RelationScore;
import com.huawei.ads.adsrec.db.table.AdCreativeContentRecord;
import com.huawei.ads.adsrec.db.table.AdTraceRecord;
import com.huawei.ads.adsrec.db.table.DsContentRelRecord;
import com.huawei.ads.adsrec.db.table.MaterialSummaryRecord;
import com.huawei.ads.fund.util.AsyncExec;
import com.huawei.ads.fund.util.JsonUtil;
import com.huawei.ads.fund.util.ListUtil;
import com.huawei.ads.fund.util.StringUtils;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.TagConstants;
import com.huawei.openplatform.abl.log.HiAdLog;
import defpackage.awz;
import defpackage.axh;
import defpackage.axi;
import defpackage.axm;
import defpackage.axo;
import defpackage.axt;
import defpackage.axv;
import defpackage.axy;
import defpackage.ayc;
import defpackage.aye;
import defpackage.ayg;
import defpackage.aym;
import defpackage.ayt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ayg f4763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4764c = false;
    private IUtilCallback d;
    protected Map<String, String> e;

    public axi a(axi axiVar, ayc aycVar) {
        if (axiVar == null) {
            return null;
        }
        IDsRelationCallback iDsRelationCallbackA = awz.a();
        if (iDsRelationCallbackA != null) {
            this.f4764c = iDsRelationCallbackA.isSupportRelateRank();
            try {
                List<axm> listI = axiVar.i();
                if (!ListUtil.isEmpty(listI)) {
                    List<axm> listA = a(listI);
                    IUtilCallback iUtilCallback = this.d;
                    if (iUtilCallback == null || StringUtils.parseIntOrDefault(iUtilCallback.getConfig("joinDeviceRank"), 0) != 1) {
                        d(listA, aycVar, iDsRelationCallbackA);
                        return axiVar;
                    }
                    b(listA, aycVar, iDsRelationCallbackA);
                    return axiVar;
                }
            } catch (Throwable th) {
                HiAdLog.w("RankTask", "rank error: %s", th.getClass().getSimpleName());
                return axiVar;
            }
        }
        return axiVar;
    }

    private void b(List<axm> list, ayc aycVar, IDsRelationCallback iDsRelationCallback) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, RelationScore> mapC = c(list, aycVar, iDsRelationCallback);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (!axv.d(mapC)) {
            mapC.size();
        }
        c(list, mapC);
        StringBuilder sb = new StringBuilder();
        c(list, aycVar, sb);
        AsyncExec.submitSeqIO(new d(b(list), aycVar, jCurrentTimeMillis2, jCurrentTimeMillis, sb, System.currentTimeMillis(), mapC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<axm> list, ayc aycVar) {
        if (ListUtil.isEmpty(list)) {
            return;
        }
        if (StringUtils.isBlank(aycVar.b())) {
            HiAdLog.e("RankTask", "requestId is blank");
            return;
        }
        e eVar = new e(this.f4762a);
        d(eVar, list, aycVar);
        b(eVar, list, aycVar);
    }

    private void b(e eVar, List<axm> list, ayc aycVar) {
        HiAdLog.i("RankTask", "recordDsContentRelRecord start!");
        ArrayList arrayList = new ArrayList();
        Iterator<axm> it = list.iterator();
        while (it.hasNext()) {
            for (axh axhVar : it.next().b()) {
                try {
                    if (axhVar.w().booleanValue()) {
                        String strI = axhVar.i();
                        DsContentRelRecord dsContentRelRecord = new DsContentRelRecord();
                        dsContentRelRecord.c(strI);
                        dsContentRelRecord.a(aycVar.b());
                        dsContentRelRecord.e(System.currentTimeMillis());
                        IUtilCallback iUtilCallbackC = awz.c();
                        if (iUtilCallbackC != null) {
                            dsContentRelRecord.e(iUtilCallbackC.aes128Encrypt(String.valueOf(axhVar.k())));
                            dsContentRelRecord.j(String.valueOf(iUtilCallbackC.getMediaType(aycVar.f())));
                            dsContentRelRecord.b(StringUtils.listToString(iUtilCallbackC.getDailyIntentId(0, 5), ","));
                            dsContentRelRecord.d(StringUtils.listToString(iUtilCallbackC.getDailyIntentId(1, 5), ","));
                        }
                        dsContentRelRecord.b(axhVar.g());
                        dsContentRelRecord.a(axhVar.b());
                        dsContentRelRecord.d(axhVar.j());
                        dsContentRelRecord.f(axhVar.o());
                        try {
                            dsContentRelRecord.b(Integer.parseInt(axhVar.q()));
                        } catch (Throwable th) {
                            HiAdLog.w("RankTask", "interactionType error: %s", th.getClass().getSimpleName());
                        }
                        dsContentRelRecord.h(aycVar.f());
                        dsContentRelRecord.d(aycVar.g());
                        dsContentRelRecord.g(axhVar.l());
                        dsContentRelRecord.i(axhVar.n());
                        dsContentRelRecord.m(aycVar.h());
                        dsContentRelRecord.l(aycVar.l());
                        dsContentRelRecord.g();
                        dsContentRelRecord.f();
                        axhVar.k();
                        dsContentRelRecord.n();
                        dsContentRelRecord.h();
                        dsContentRelRecord.j();
                        dsContentRelRecord.e();
                        dsContentRelRecord.b();
                        dsContentRelRecord.a();
                        dsContentRelRecord.i();
                        dsContentRelRecord.m();
                        dsContentRelRecord.o();
                        dsContentRelRecord.l();
                        dsContentRelRecord.k();
                        dsContentRelRecord.r();
                        dsContentRelRecord.p();
                        axhVar.s();
                        aycVar.e();
                        arrayList.add(new ayt("DsContentRelRecord", null, null, "clientRequestId=? and contentId=?", new String[]{aycVar.b(), strI}, dsContentRelRecord.toRecord()));
                    }
                } catch (Exception e) {
                    HiAdLog.e("RankTask", "sv at record error");
                    HiAdLog.printSafeStackTrace(3, e);
                }
            }
        }
        eVar.insertOrUpdate(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, RelationScore> c(List<axm> list, ayc aycVar, IDsRelationCallback iDsRelationCallback) {
        HashMap map = new HashMap();
        if (!this.f4764c) {
            HiAdLog.i("RankTask", "ds version is too low,not support relate rank.");
            return map;
        }
        System.currentTimeMillis();
        JSONObject jSONObjectC = c(list, aycVar);
        System.currentTimeMillis();
        if (jSONObjectC != null) {
            List<RelationScore> relationScore = iDsRelationCallback.getRelationScore(jSONObjectC);
            if (!ListUtil.isEmpty(relationScore)) {
                relationScore.size();
                for (RelationScore relationScore2 : relationScore) {
                    if (relationScore2 != null) {
                        map.put(relationScore2.d(), relationScore2);
                    }
                }
            }
        }
        return map;
    }

    private List<axm> a(List<axm> list) {
        ArrayList arrayList = new ArrayList();
        for (axm axmVar : list) {
            if (!ListUtil.isEmpty(axmVar.b())) {
                int iE = aym.b(this.f4762a).e(axmVar.j());
                HiAdLog.i("RankTask", "oldRankCfg: %s", Integer.valueOf(iE));
                if (iE == 1) {
                    arrayList.add(axmVar);
                }
            }
        }
        return arrayList;
    }

    private boolean e(axh axhVar, String str) {
        if (axhVar.w() != null) {
            return axhVar.w().booleanValue();
        }
        axhVar.a(false);
        AdCreativeContentRecord adCreativeContentRecordD = axhVar.d();
        if (adCreativeContentRecordD == null || !axo.e(adCreativeContentRecordD.f(), str, this.e)) {
            return false;
        }
        axhVar.a(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, RelationScore> map, ayc aycVar) {
        try {
            ArrayList arrayList = new ArrayList();
            if (!axv.d(map)) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<RelationScore> it = map.values().iterator();
                while (it.hasNext()) {
                    arrayList2.add(new RelationScore(it.next()));
                }
                Collections.sort(arrayList2, new a());
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((RelationScore) it2.next()).d());
                }
            }
            j.a(aycVar, arrayList, this.f4763b);
        } catch (Exception e) {
            HiAdLog.printSafeStackTrace(3, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<axm> list, Map<String, RelationScore> map) {
        for (axm axmVar : list) {
            for (axh axhVar : axmVar.b()) {
                if (axhVar != null) {
                    e(axhVar, axmVar.c());
                    axhVar.e(o0.a(axhVar));
                    o0.a(axhVar, map);
                    axhVar.i();
                    axhVar.k();
                    axhVar.w();
                }
            }
        }
    }

    private void c(List<axm> list, ayc aycVar, StringBuilder sb) {
        boolean z = true;
        for (axm axmVar : list) {
            if (axmVar != null) {
                String strJ = axmVar.j();
                int iB = aym.b(this.f4762a).b(strJ);
                HiAdLog.i("RankTask", "rank rankStrategy: %s", Integer.valueOf(iB));
                if (!z) {
                    sb.append(";");
                }
                sb.append(strJ);
                sb.append(",");
                sb.append(iB);
                long jCurrentTimeMillis = System.currentTimeMillis();
                List<axh> listB = axmVar.b();
                if (ListUtil.isEmpty(listB)) {
                    return;
                }
                sb.append(",");
                sb.append(listB.size());
                if (iB != 0) {
                    new aye(axmVar.c(), listB, aycVar).a(iB);
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                sb.append(",");
                sb.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
                if (HiAdLog.isDebugEnable()) {
                    Iterator<axh> it = listB.iterator();
                    while (it.hasNext()) {
                        it.next().i();
                    }
                }
                z = false;
            }
        }
    }

    private void d(List<axm> list, ayc aycVar, IDsRelationCallback iDsRelationCallback) {
        if (ListUtil.isEmpty(list)) {
            return;
        }
        AsyncExec.submitSeqIO(new c(b(list), aycVar, iDsRelationCallback));
    }

    private void d(e eVar, List<axm> list, ayc aycVar) {
        Iterator<axm> it;
        if (this.f4764c && axy.a()) {
            String strA = w0.a(aycVar.b());
            ArrayList arrayList = new ArrayList();
            Iterator<axm> it2 = list.iterator();
            while (it2.hasNext()) {
                axm next = it2.next();
                List<axh> listB = next.b();
                String strJ = next.j();
                for (axh axhVar : listB) {
                    try {
                        if (axhVar.w().booleanValue()) {
                            String strI = axhVar.i();
                            it = it2;
                            try {
                                if (!ListUtil.isEmpty(eVar.query(AdTraceRecord.class, null, "uniqueId=? and contentId=?", new String[]{strA, strI}, null, "1"))) {
                                    HiAdLog.w("RankTask", "records exists, continue");
                                } else {
                                    AdTraceRecord adTraceRecord = new AdTraceRecord();
                                    adTraceRecord.f(strA);
                                    adTraceRecord.a(strI);
                                    adTraceRecord.c(System.currentTimeMillis());
                                    try {
                                        adTraceRecord.e(b(eVar, strI, aycVar, strJ));
                                        adTraceRecord.a(true);
                                        adTraceRecord.d(axhVar.d().f());
                                        arrayList.add(new ayt("AdTraceRecord", null, null, "uniqueId=? and contentId=?", new String[]{strA, strI}, adTraceRecord.toRecord()));
                                    } catch (Exception e) {
                                        e = e;
                                        HiAdLog.e("RankTask", "sv at record error");
                                        HiAdLog.printSafeStackTrace(3, e);
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                            it2 = it;
                        } else {
                            HiAdLog.w("RankTask", "%s is not rank supported!", axhVar.i());
                        }
                    } catch (Exception e3) {
                        e = e3;
                        it = it2;
                    }
                }
            }
            eVar.insertOrUpdate(arrayList);
        }
    }

    private JSONObject c(List<axm> list, ayc aycVar) {
        if (ListUtil.isEmpty(list)) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (axm axmVar : list) {
            for (axh axhVar : axmVar.b()) {
                if (e(axhVar, axmVar.c())) {
                    AdCreativeContentRecord adCreativeContentRecordD = axhVar.d();
                    if (adCreativeContentRecordD == null) {
                        axhVar.i();
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        axt.a(jSONObject, "contentId", axhVar.i());
                        axt.a(jSONObject, TagConstants.TAG_LIST_KEY, StringUtils.unicodeDecode(adCreativeContentRecordD.a()));
                        axt.a(jSONObject, "targets", adCreativeContentRecordD.d());
                        axt.a(jSONObject, "interactionType", axhVar.q());
                        axt.a(jSONObject, "adTitle", axhVar.h());
                        axt.a(jSONObject, "adDescription", axhVar.e());
                        axt.a(jSONObject, "adBrandInfo", axhVar.c());
                        axt.a(jSONObject, "adType", axmVar.c());
                        axt.a(jSONObject, "dspId", axhVar.o());
                        axt.a(jSONObject, "mediaPackageName", axhVar.p());
                        axt.a(jSONObject, "slotId", axmVar.j());
                        axt.a(jSONObject, Constants.RELATION_COL_A_KEY, null);
                        axt.a(jSONObject, "priceRange", null);
                        jSONArray.put(jSONObject);
                    }
                }
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        axt.e(jSONObject2, "services", jSONArray);
        axt.e(jSONObject2, "traceId", w0.a(aycVar.b()));
        jSONObject2.toString();
        return jSONObject2;
    }

    private List<axm> b(List<axm> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<axm> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        return arrayList;
    }

    private String b(e eVar, String str, ayc aycVar, String str2) {
        List listQuery = eVar.query(MaterialSummaryRecord.class, null, "contentId=? and pkgName=? and slotId=?", new String[]{str, aycVar.e(), str2}, null, "1");
        if (ListUtil.isEmpty(listQuery) || listQuery.get(0) == null) {
            return "";
        }
        ((MaterialSummaryRecord) listQuery.get(0)).j();
        return ((MaterialSummaryRecord) listQuery.get(0)).j();
    }

    class a implements Comparator<RelationScore> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compare(RelationScore relationScore, RelationScore relationScore2) {
            double dA = relationScore.a();
            double dA2 = relationScore2.a();
            if (Math.abs(dA - dA2) < 9.99999993922529E-9d) {
                return 0;
            }
            return dA < dA2 ? 1 : -1;
        }

        a() {
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IDsRelationCallback f4766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f4767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ayc f4768c;

        @Override // java.lang.Runnable
        public void run() {
            HiAdLog.i("RankTask", "joinDeviceRank :0, adslots.size:%s", Integer.valueOf(this.f4767b.size()));
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map mapC = q0.this.c((List<axm>) this.f4767b, this.f4768c, this.f4766a);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            q0.this.c((List<axm>) this.f4767b, (Map<String, RelationScore>) mapC);
            q0.this.a((List<axm>) this.f4767b, this.f4768c);
            q0.this.f4763b = new ayg();
            long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
            q0.this.f4763b.e(j);
            q0.this.f4763b.e("");
            q0.this.f4763b.b(j);
            q0.this.b(mapC, this.f4768c);
        }

        c(List list, ayc aycVar, IDsRelationCallback iDsRelationCallback) {
            this.f4767b = list;
            this.f4768c = aycVar;
            this.f4766a = iDsRelationCallback;
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f4769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ayc f4770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f4771c;
        final /* synthetic */ long d;
        final /* synthetic */ StringBuilder e;
        final /* synthetic */ long g;
        final /* synthetic */ Map h;

        @Override // java.lang.Runnable
        public void run() {
            q0.this.a((List<axm>) this.f4771c, this.f4770b);
            q0.this.f4763b = new ayg(this.f4771c);
            q0.this.f4763b.e(this.f4769a - this.d);
            q0.this.f4763b.e(this.e.toString());
            q0.this.f4763b.b(this.g - this.d);
            q0.this.b(this.h, this.f4770b);
        }

        d(List list, ayc aycVar, long j, long j2, StringBuilder sb, long j3, Map map) {
            this.f4771c = list;
            this.f4770b = aycVar;
            this.f4769a = j;
            this.d = j2;
            this.e = sb;
            this.g = j3;
            this.h = map;
        }
    }

    public q0(Context context) {
        this.f4762a = context.getApplicationContext();
        IUtilCallback iUtilCallbackC = awz.c();
        this.d = iUtilCallbackC;
        if (iUtilCallbackC != null) {
            String config = iUtilCallbackC.getConfig("tradeModeSupportRank");
            if (StringUtils.isBlank(config)) {
                return;
            }
            this.e = JsonUtil.jsonToMap(config);
        }
    }
}
