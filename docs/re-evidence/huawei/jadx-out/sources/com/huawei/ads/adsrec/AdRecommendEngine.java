package com.huawei.ads.adsrec;

import android.content.Context;
import com.huawei.ads.adsrec.db.table.AdTraceRecord;
import com.huawei.ads.adsrec.recall.IAdRequestDelegate;
import com.huawei.ads.fund.util.AsyncExec;
import com.huawei.ads.fund.util.ListUtil;
import com.huawei.ads.fund.util.StringUtils;
import com.huawei.openplatform.abl.log.HiAdLog;
import defpackage.axb;
import defpackage.axi;
import defpackage.axj;
import defpackage.axl;
import defpackage.ayc;
import defpackage.ayt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class AdRecommendEngine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f4742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private axb f4743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e0 f4744c;
    private final com.huawei.ads.adsrec.e d;
    private q0 e;

    public JSONObject a(ayc aycVar, String str) {
        try {
            HiAdLog.i("AdRecEngine", "recallAds via api %s", aycVar);
            if (aycVar != null && str != null) {
                aycVar.b(1);
                return c(aycVar, this.f4743b.a(aycVar, new axi(aycVar.e(), new JSONObject(str))));
            }
            return null;
        } catch (Throwable th) {
            HiAdLog.w("AdRecEngine", "recall via api error: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    public JSONObject c(ayc aycVar, IAdRequestDelegate iAdRequestDelegate) {
        HiAdLog.i("AdRecEngine", "recallAds %s", aycVar);
        if (aycVar == null) {
            return null;
        }
        aycVar.b(0);
        return c(aycVar, this.f4743b.a(aycVar, iAdRequestDelegate));
    }

    public void e(axj axjVar) {
        AsyncExec.submitSeqIO(new c(axjVar));
    }

    private JSONObject c(ayc aycVar, axi axiVar) {
        Map<String, List<String>> mapA = null;
        if (axiVar == null) {
            b();
            return null;
        }
        try {
            if (!axiVar.h()) {
                axl.e(aycVar.g()).a(this.f4742a, aycVar, axiVar);
                mapA = o0.a(axiVar);
                axiVar = this.e.a(axiVar, aycVar);
                Set<String> setD = d(aycVar, axiVar);
                this.f4744c.a(axiVar.c(), setD);
                d(aycVar.b(), setD);
            }
            a(axiVar, aycVar, mapA);
            return axiVar.d();
        } finally {
            b();
        }
    }

    private void d(String str, Set<String> set) {
        AsyncExec.submitSeqIO(new b(set, str));
    }

    private void a(axi axiVar, ayc aycVar, Map<String, List<String>> map) {
        if (ListUtil.isEmpty(aycVar.c())) {
            return;
        }
        AsyncExec.submitSeqIO(new d(axiVar, aycVar, map));
    }

    private void b() {
        AsyncExec.submitSeqIO(new e());
    }

    class b implements Runnable {
        final /* synthetic */ Set d;
        final /* synthetic */ String e;

        @Override // java.lang.Runnable
        public void run() {
            if (ListUtil.isEmpty(this.d)) {
                return;
            }
            String strA = w0.a(this.e);
            if (StringUtils.isBlank(strA)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (AdTraceRecord adTraceRecord : AdRecommendEngine.this.d.query(AdTraceRecord.class, null, null, null, null, null)) {
                if (Objects.equals(strA, adTraceRecord.g()) && this.d.contains(adTraceRecord.a())) {
                    adTraceRecord.a(false);
                    arrayList.add(new ayt("AdTraceRecord", null, null, "uniqueId=? and contentId=?", new String[]{strA, adTraceRecord.a()}, adTraceRecord.toRecord()));
                }
            }
            AdRecommendEngine.this.d.insertOrUpdate(arrayList);
        }

        b(Set set, String str) {
            this.d = set;
            this.e = str;
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ axj f4746a;

        @Override // java.lang.Runnable
        public void run() {
            AdRecommendEngine.this.d.e(this.f4746a);
            AdRecommendEngine.this.d.clearExpiredData();
            new n(AdRecommendEngine.this.f4742a).c(false);
        }

        c(axj axjVar) {
            this.f4746a = axjVar;
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ayc f4748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f4749c;
        final /* synthetic */ axi d;

        @Override // java.lang.Runnable
        public void run() {
            j.a(AdRecommendEngine.this.f4742a, this.d, this.f4748b, (Map<String, List<String>>) this.f4749c);
            j.a(AdRecommendEngine.this.f4742a, this.d, this.f4748b);
        }

        d(axi axiVar, ayc aycVar, Map map) {
            this.d = axiVar;
            this.f4748b = aycVar;
            this.f4749c = map;
        }
    }

    class e implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            AdRecommendEngine.this.f4744c.a();
            AdRecommendEngine.this.d.clearExpiredData();
        }

        e() {
        }
    }

    private Set<String> d(ayc aycVar, axi axiVar) {
        if (axiVar == null) {
            return null;
        }
        return axiVar.b(aycVar.m(), aycVar.i(), aycVar);
    }

    public AdRecommendEngine(Context context) {
        this.f4742a = context.getApplicationContext();
        v vVar = new v(context);
        this.f4744c = vVar;
        this.f4743b = new axb(context, vVar);
        this.e = new q0(context);
        this.d = new com.huawei.ads.adsrec.e(this.f4742a);
    }
}
