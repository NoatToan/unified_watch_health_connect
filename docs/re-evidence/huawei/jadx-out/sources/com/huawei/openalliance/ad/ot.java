package com.huawei.openalliance.ad;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.openalliance.ad.beans.inner.AdRequestParam;
import com.huawei.openalliance.ad.beans.inner.ApiReqParam;
import com.huawei.openalliance.ad.beans.metadata.AdTimeStatistics;
import com.huawei.openalliance.ad.beans.metadata.App;
import com.huawei.openalliance.ad.beans.metadata.CheckResult;
import com.huawei.openalliance.ad.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.beans.metadata.Location;
import com.huawei.openalliance.ad.beans.metadata.v3.TemplateData;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.beans.server.AdContentReq;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.constant.AdConfigMapKey;
import com.huawei.openalliance.ad.constant.AnalyticsEventType;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.IntervalMethods;
import com.huawei.openalliance.ad.constant.RTCMethods;
import com.huawei.openalliance.ad.constant.SpKeys;
import com.huawei.openalliance.ad.constant.TagKey;
import com.huawei.openalliance.ad.constant.WhiteListPkgList;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.HiAdSplash;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.net.http.Response;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class ot implements qx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f19856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private fz f19857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gl f19858c;
    private gg d;
    private gf e;
    private gk f;
    private DelayInfo g;

    public AdContentRsp c(AdSlotParam adSlotParam, String str) {
        b(adSlotParam);
        if (adSlotParam != null) {
            adSlotParam.a();
        }
        App appA = a(this.f19856a.getPackageName(), adSlotParam);
        if (com.huawei.openalliance.ad.utils.dg.d(str)) {
            if (appA == null) {
                appA = new App(this.f19856a);
            }
            appA.c(str);
        }
        adSlotParam.a(appA);
        return a(12, adSlotParam, (List<String>) null, (List<String>) null, (List<String>) null);
    }

    public AdContentRsp b(AdSlotParam adSlotParam, String str) {
        b(adSlotParam);
        App appA = a(this.f19856a.getPackageName(), adSlotParam);
        if (com.huawei.openalliance.ad.utils.dg.d(str)) {
            if (appA == null) {
                appA = new App(this.f19856a);
            }
            appA.c(str);
        }
        adSlotParam.a(appA);
        return a(7, adSlotParam, (List<String>) null, (List<String>) null, (List<String>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [com.huawei.openalliance.ad.db.bean.ContentRecord] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.huawei.openalliance.ad.ot] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.huawei.openalliance.ad.qw] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.huawei.openalliance.ad.db.bean.ContentRecord] */
    @Override // com.huawei.openalliance.ad.qx
    public void a(AdContentRsp adContentRsp, AdSlotParam adSlotParam, ri riVar, final qw qwVar, long j, int i) {
        long jC;
        String str;
        ?? r14;
        String str2 = null;
        if (adContentRsp == null) {
            hw.c("AdReqProcessor", "dealResponse adContentRsp is null");
            a().b((Integer) (-1));
            if (qwVar != 0) {
                qwVar.a(null);
                return;
            }
            return;
        }
        hw.b("AdReqProcessor", "dealResponse");
        a().u().h(com.huawei.openalliance.ad.utils.as.c());
        List<ContentRecord> listB = riVar.b(adContentRsp);
        a().u().i(com.huawei.openalliance.ad.utils.as.c());
        int iB = adSlotParam.b();
        List<String> listA = adSlotParam.a();
        String str3 = (listA == null || listA.size() <= 0) ? null : listA.get(0);
        final pv pvVar = new pv(this.f19856a, listB, false, adSlotParam.D());
        pvVar.a(adContentRsp.d());
        pvVar.b(adContentRsp.e());
        pvVar.a(Integer.valueOf(iB));
        if (qwVar != 0) {
            a(pvVar, iB, adContentRsp.k(), str3, a(), adSlotParam.D());
        }
        long jC2 = com.huawei.openalliance.ad.utils.as.c();
        ContentRecord contentRecordA = pvVar.a(j, iB, i);
        a().e(com.huawei.openalliance.ad.utils.as.c() - jC2);
        if (qwVar != 0) {
            a(pvVar, j, iB, adContentRsp.k(), i);
        }
        if (contentRecordA != 0) {
            jC = com.huawei.openalliance.ad.utils.as.c();
            TemplateData templateDataAV = contentRecordA.aV();
            ContentRecord contentRecordA2 = pvVar.a(contentRecordA, iB, jC);
            hw.b("AdReqProcessor", "query content record: " + com.huawei.openalliance.ad.utils.dg.b(contentRecordA2));
            if (contentRecordA2 != null) {
                contentRecordA2.y(adContentRsp.k());
                contentRecordA2.ad(adContentRsp.l());
                contentRecordA2.U(adContentRsp.v());
                String strO = contentRecordA2.o();
                if (contentRecordA2.aQ() == -1 || 2 == contentRecordA2.aQ()) {
                    contentRecordA2.a(templateDataAV);
                }
                str2 = strO;
            }
            r14 = contentRecordA2;
            str = str2;
        } else {
            jC = 0;
            str = str2;
            r14 = str;
        }
        a(j, pvVar, r14);
        a(r14);
        a(adContentRsp, listB, iB, str, r14, jC);
        if (qwVar != 0) {
            qwVar.a(r14);
        }
        pvVar.c();
        new pv(this.f19856a, riVar.a(adContentRsp), true, adSlotParam.D()).a(j, iB, i);
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.ot.3
            @Override // java.lang.Runnable
            public void run() {
                com.huawei.openalliance.ad.utils.bu.a(new Runnable() { // from class: com.huawei.openalliance.ad.ot.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            hw.a("AdReqProcessor", "deleteInvalidContents");
                            pvVar.a();
                        } catch (Throwable th) {
                            hw.c("AdReqProcessor", "deleteInvalidContents err: %s", th.getClass().getSimpleName());
                        }
                    }
                }, ot.this.f.ah());
                pvVar.b();
                if (qwVar == null) {
                    pvVar.d();
                }
            }
        }, com.huawei.openalliance.ad.utils.o.a.DISK_CACHE, false);
    }

    @Override // com.huawei.openalliance.ad.qx
    public void a(DelayInfo delayInfo) {
        this.g = delayInfo;
    }

    public String a(String str, int i, AdSlotParam adSlotParam, ApiReqParam apiReqParam) {
        b(adSlotParam);
        adSlotParam.a(a(this.f19856a.getPackageName(), adSlotParam));
        AdContentReq adContentReqB = this.e.b(new AdRequestParam.Builder().a(str).a(i).a(adSlotParam).a());
        if (adContentReqB == null) {
            return "";
        }
        adContentReqB.b(str);
        a(i, apiReqParam, adContentReqB);
        try {
            return la.a.a(this.f19856a, adContentReqB.getClass()).a(adContentReqB, new ka());
        } catch (Exception unused) {
            hw.c("AdReqProcessor", "getAdContentReq error");
            return "";
        } finally {
            en.a(this.f19856a).f();
        }
    }

    public String a(App app, String str) {
        if (app == null || !com.huawei.openalliance.ad.utils.dg.d(app.n())) {
            return (app == null || TextUtils.isEmpty(app.c())) ? str : app.c();
        }
        hw.b("AdReqProcessor", "realAppPkgName is HostPkgName: %s", app.n());
        return app.n();
    }

    @Override // com.huawei.openalliance.ad.qx
    public AdContentRsp a(AdSlotParam adSlotParam, List<String> list, List<String> list2) {
        if (adSlotParam == null) {
            return null;
        }
        b(adSlotParam);
        return a(new AdRequestParam.Builder().a(2).a(adSlotParam).a(list).d(list2).a());
    }

    public AdContentRsp a(AdSlotParam adSlotParam, String str) {
        b(adSlotParam);
        List<String> listA = this.d.a();
        App appA = a(this.f19856a.getPackageName(), adSlotParam);
        if (appA == null) {
            appA = new App(this.f19856a);
        }
        appA.c(str);
        adSlotParam.a(appA);
        AdContentRsp adContentRspA = a(60, adSlotParam, listA, (List<String>) null, (List<String>) null);
        c(adContentRspA);
        return adContentRspA;
    }

    public AdContentRsp a(Context context, AdSlotParam adSlotParam, String str, int i, List<String> list) {
        b(adSlotParam);
        List<String> listA = this.f19858c.a();
        App appA = a(context.getPackageName(), adSlotParam);
        if (appA == null) {
            appA = new App(context);
        }
        appA.c(str);
        adSlotParam.a(appA);
        return a(i, adSlotParam, list, (List<String>) null, listA);
    }

    @Override // com.huawei.openalliance.ad.qx
    public AdContentRsp a(Context context, AdSlotParam adSlotParam, int i) {
        App appA;
        if (adSlotParam == null) {
            return null;
        }
        try {
            b(adSlotParam);
            int allowMobileTraffic = -1;
            if (context != null) {
                allowMobileTraffic = HiAdSplash.getInstance(context).getAllowMobileTraffic();
                appA = a(context.getPackageName(), adSlotParam);
            } else {
                appA = null;
            }
            adSlotParam.a(allowMobileTraffic);
            adSlotParam.a(appA);
            AdContentRsp adContentRspA = a(i, adSlotParam, (List<String>) null, (List<String>) null, (List<String>) null);
            a(i, adContentRspA, adSlotParam.j());
            return adContentRspA;
        } catch (Throwable th) {
            hw.c("AdReqProcessor", "request splash ad error: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    public DelayInfo a() {
        if (this.g == null) {
            this.g = new DelayInfo();
        }
        return this.g;
    }

    public Pair<String, Map<Integer, AdContentRsp>> a(String str, long j, Set<Integer> set, boolean z) {
        hw.a("AdReqProcessor", "requestAdViaApi");
        ArrayList arrayList = new ArrayList();
        Map<Integer, AdContentRsp> mapA = this.e.a(str, j, arrayList);
        long jC = com.huawei.openalliance.ad.utils.as.c();
        Response response = new Response();
        response.b(1);
        String strK = "";
        if (mapA.isEmpty()) {
            a("", -1, jC - j, (AdSlotParam) null, response, (List<String>) null);
            return new Pair<>("", mapA);
        }
        a("", mapA, response);
        for (Map.Entry<Integer, AdContentRsp> entry : mapA.entrySet()) {
            Integer key = entry.getKey();
            int iIntValue = key.intValue();
            AdContentRsp value = entry.getValue();
            strK = value.k();
            com.huawei.openalliance.ad.utils.cn.a(this.f19856a).J(value.l());
            hw.a("AdReqProcessor", "response return from content trackVersion is : %s", value.l());
            if (iIntValue == 60) {
                c(value);
            }
            if (!set.contains(key)) {
                hw.b("AdReqProcessor", "adContentRsp is discard, adType: %s ", key);
                value = null;
            }
            qd.a(this.f19856a, value, iIntValue);
            response.a(value);
            a(iIntValue, value);
        }
        if (z && !com.huawei.openalliance.ad.utils.bm.a(arrayList)) {
            HiAd.a(this.f19856a).a((String) arrayList.get(0));
        }
        return new Pair<>(strK, mapA);
    }

    private void k() {
        if (this.f.b(IntervalMethods.NOTIFY_KIT_AD_REQ)) {
            hw.a("AdReqProcessor", "within time interval, skip: %s", IntervalMethods.NOTIFY_KIT_AD_REQ);
        } else {
            this.f.s(IntervalMethods.NOTIFY_KIT_AD_REQ);
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.ot.13
                @Override // java.lang.Runnable
                public void run() {
                    if (cc.b(ot.this.f19856a)) {
                        if (Constants.HW_INTELLIEGNT_PACKAGE.equalsIgnoreCase(ot.this.f19856a.getPackageName()) || !fp.b(ot.this.f19856a).bN()) {
                            na.a(ot.this.f19856a).a(RTCMethods.REPORT_CONSENT, null, null, null);
                        } else {
                            na.a(ot.this.f19856a).i();
                        }
                        long jBM = ot.this.f.bM();
                        long jC = com.huawei.openalliance.ad.utils.as.c();
                        if (jC - jBM > 3600000) {
                            ot.this.f.f(jC);
                            HiAd.a(ot.this.f19856a).a(ot.this.f.bf());
                        }
                    }
                }
            });
        }
    }

    private List<String> j() {
        try {
            return e.b().a((Bundle) null);
        } catch (Throwable th) {
            hw.b("AdReqProcessor", "get blkTptList err: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    private void i() {
        com.huawei.openalliance.ad.utils.cn cnVarA = com.huawei.openalliance.ad.utils.cn.a(this.f19856a);
        cnVarA.b(new ArrayList());
        Map<String, String> mapAa = cnVarA.aa();
        if (!com.huawei.openalliance.ad.utils.br.a(mapAa)) {
            mapAa.put(TagKey.HW_U001, "");
        }
        cnVarA.a(mapAa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (com.huawei.openalliance.ad.utils.ab.j(this.f19856a)) {
            hw.a("AdReqProcessor", "no need to query ins app on tv");
        } else if (cc.b(this.f19856a)) {
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.ot.19
                @Override // java.lang.Runnable
                public void run() {
                    ge geVarA = fe.a(ot.this.f19856a);
                    if (com.huawei.openalliance.ad.utils.as.e(ot.this.f19856a)) {
                        if (ot.this.g()) {
                            hw.b("AdReqProcessor", "do query ins app");
                            Pair<Integer, String> pairA = com.huawei.openalliance.ad.utils.cf.a(ot.this.f19856a, "/insapp/query", "");
                            ot.this.f.s(SpKeys.METHOD_QUERY_INSTALL_LIST);
                            if (pairA == null) {
                                hw.b("AdReqProcessor", "query ins app failed");
                                return;
                            }
                            hw.b("AdReqProcessor", "query ins app return code: %s", pairA.first);
                            hw.a("AdReqProcessor", "query ins app return result: %s", pairA.second);
                            geVarA.a(((Integer) pairA.first).intValue());
                            ot.this.a(geVarA, pairA);
                            return;
                        }
                        return;
                    }
                    ot.this.a(geVarA);
                }
            });
        } else {
            hw.a("AdReqProcessor", "only query ins app on hw device");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        if (-1 == this.f.o()) {
            hw.b("AdReqProcessor", "query ins app disabled");
            return false;
        }
        if (!this.f.b(SpKeys.METHOD_QUERY_INSTALL_LIST, 180)) {
            return true;
        }
        hw.a("AdReqProcessor", "query ins app later");
        return false;
    }

    private void f() {
        hw.a("AdReqProcessor", "query install app list");
        if (g()) {
            long jNextInt = new SecureRandom().nextInt(60000);
            hw.a("AdReqProcessor", "query ins app random : %s", Long.valueOf(jNextInt));
            com.huawei.openalliance.ad.utils.bu.a(new Runnable() { // from class: com.huawei.openalliance.ad.ot.18
                @Override // java.lang.Runnable
                public void run() {
                    ot.this.h();
                }
            }, jNextInt);
        }
    }

    private void e() {
        com.huawei.openalliance.ad.utils.o.h(new Runnable() { // from class: com.huawei.openalliance.ad.ot.16
            @Override // java.lang.Runnable
            public void run() {
                new di(ot.this.f19856a).a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (fp.b(this.f19856a).j()) {
            final fx fxVarA = er.a(this.f19856a);
            if (com.huawei.openalliance.ad.utils.as.c() - fxVarA.a() <= 43200000) {
                return;
            }
            hw.a("AdReqProcessor", "sync query aud id");
            fxVarA.a(com.huawei.openalliance.ad.utils.as.c());
            try {
                na.a(this.f19856a).a(RTCMethods.QUERY_AUD_ID, null, new RemoteCallResultCallback<String>() { // from class: com.huawei.openalliance.ad.ot.15
                    @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                    public void onRemoteCallResult(String str, CallResult<String> callResult) {
                        if (callResult == null || callResult.getCode() != 200) {
                            return;
                        }
                        hw.a("AdReqProcessor", "sync query aud id success");
                        fxVarA.a(callResult.getData());
                    }
                }, String.class);
            } catch (Throwable th) {
                hw.c("AdReqProcessor", "sync query aud id failed: %s", th.getClass().getSimpleName());
            }
        }
    }

    private void c(final AdContentRsp adContentRsp) {
        if (adContentRsp == null) {
            return;
        }
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.ot.14
            @Override // java.lang.Runnable
            public void run() {
                ot.this.f.g(adContentRsp.j());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (fp.b(this.f19856a).i()) {
            final go goVarA = fv.a(this.f19856a);
            if (com.huawei.openalliance.ad.utils.as.c() - goVarA.a() <= 43200000) {
                return;
            }
            hw.a("AdReqProcessor", "sync query user tag");
            goVarA.a(com.huawei.openalliance.ad.utils.as.c());
            try {
                na.a(this.f19856a).a(RTCMethods.QUERY_USER_TAG, null, new RemoteCallResultCallback<String>() { // from class: com.huawei.openalliance.ad.ot.12
                    @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                    public void onRemoteCallResult(String str, CallResult<String> callResult) {
                        if (callResult == null || callResult.getCode() != 200) {
                            return;
                        }
                        hw.a("AdReqProcessor", "sync query user tag success");
                        goVarA.a(callResult.getData());
                    }
                }, String.class);
            } catch (Throwable th) {
                hw.c("AdReqProcessor", "sync query user tag failed: %s", th.getClass().getSimpleName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, int i, long j, AdSlotParam adSlotParam, Response response, List<String> list) {
        new com.huawei.openalliance.ad.analysis.h(this.f19856a).a(str, i, j, adSlotParam, response, com.huawei.openalliance.ad.utils.bk.b(a().u()), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AdContentRsp adContentRsp, int i) {
        List<ContentRecord> listA = po.a(adContentRsp, i);
        byte[] bArrB = com.huawei.openalliance.ad.utils.cw.b(this.f19856a);
        ArrayList arrayList = new ArrayList();
        for (ContentRecord contentRecord : listA) {
            if (contentRecord != null) {
                contentRecord.a(bArrB);
                Context context = this.f19856a;
                pc pcVar = new pc(context, sw.a(context, contentRecord.f()));
                pcVar.a(contentRecord);
                pcVar.n();
                AppInfo appInfoAg = contentRecord.ag();
                if (appInfoAg != null && appInfoAg.c() == 1) {
                    com.huawei.openalliance.ad.analysis.e eVar = new com.huawei.openalliance.ad.analysis.e(1);
                    eVar.a(appInfoAg);
                    eVar.a(contentRecord);
                    new com.huawei.openalliance.ad.analysis.c(this.f19856a).a(eVar);
                }
                if (contentRecord.aZ() == 1) {
                    arrayList.add(contentRecord);
                }
            }
        }
        new com.huawei.openalliance.ad.analysis.c(this.f19856a).a(arrayList);
    }

    private void b(AdContentRsp adContentRsp) {
        DelayInfo delayInfoA = a();
        if (adContentRsp == null) {
            delayInfoA.b(-1);
            return;
        }
        delayInfoA.c(adContentRsp.u());
        delayInfoA.b(adContentRsp.a());
        delayInfoA.c(adContentRsp.s());
    }

    private void b(AdSlotParam adSlotParam) {
        a(adSlotParam);
        k();
        RequestOptions requestOptionsA = com.huawei.openalliance.ad.utils.cu.a(this.f19856a, adSlotParam.l());
        Location locationA = com.huawei.openalliance.ad.utils.bo.a(this.f19856a, requestOptionsA, adSlotParam.k() != null ? adSlotParam.k().a() : null);
        adSlotParam.a(locationA);
        adSlotParam.a(locationA.f());
        adSlotParam.a(requestOptionsA);
        if (com.huawei.openalliance.ad.utils.ab.j(this.f19856a)) {
            return;
        }
        com.huawei.openalliance.ad.utils.bo.b(this.f19856a);
        fd.a(this.f19856a).c(this.f19856a);
        b();
        com.huawei.openalliance.ad.utils.dl.a(this.f19856a);
        com.huawei.openalliance.ad.utils.bg.b(this.f19856a);
        com.huawei.openalliance.ad.utils.t.a(this.f19856a, 2);
    }

    private void b() {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.ot.1
            @Override // java.lang.Runnable
            public void run() {
                ot.this.c();
                ot.this.d();
            }
        });
    }

    private boolean a(ApiReqParam apiReqParam) {
        return apiReqParam != null && apiReqParam.a();
    }

    private void a(final boolean z, final List<String> list) {
        com.huawei.openalliance.ad.utils.o.h(new Runnable() { // from class: com.huawei.openalliance.ad.ot.7
            @Override // java.lang.Runnable
            public void run() {
                ot.this.a((List<String>) list, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<String> list, boolean z) {
        if (list == null || list.size() == 0) {
            hw.d("AdReqProcessor", "slotIds is empty");
            return;
        }
        String packageName = this.f19856a.getPackageName();
        int i = z ? 2 : 1;
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            com.huawei.openalliance.ad.utils.j.a(this.f19856a, packageName, AnalyticsEventType.AD_REQ, String.valueOf(i), it.next(), "");
        }
    }

    private void a(final String str, final Map<Integer, AdContentRsp> map, final Response response) {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.ot.21
            @Override // java.lang.Runnable
            public void run() {
                int i;
                int i2 = -1;
                for (Map.Entry entry : map.entrySet()) {
                    int iIntValue = ((Integer) entry.getKey()).intValue();
                    AdContentRsp adContentRsp = (AdContentRsp) entry.getValue();
                    if (iIntValue != -1 && adContentRsp != null) {
                        i = iIntValue;
                        ot.this.b(str, i, -1L, null, response, null);
                    }
                    i2 = iIntValue;
                }
                i = i2;
                ot.this.b(str, i, -1L, null, response, null);
            }
        });
    }

    private void a(final String str, final int i, final AdSlotParam adSlotParam) {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.ot.10
            @Override // java.lang.Runnable
            public void run() {
                com.huawei.openalliance.ad.analysis.h hVar = new com.huawei.openalliance.ad.analysis.h(ot.this.f19856a);
                List<String> listA = adSlotParam.a();
                int size = com.huawei.openalliance.ad.utils.bm.a(listA) ? 0 : listA.size();
                Integer numValueOf = adSlotParam.m() > 0 ? Integer.valueOf(adSlotParam.m()) : null;
                boolean zJ = adSlotParam.j();
                AdTimeStatistics adTimeStatistics = new AdTimeStatistics();
                adTimeStatistics.a(ot.this.a().u().a());
                adTimeStatistics.d(ot.this.a().u().d());
                adTimeStatistics.c(ot.this.a().u().c());
                hVar.a(str, i, size, numValueOf, zJ, adTimeStatistics);
            }
        });
    }

    private void a(final String str, final int i, final long j, final AdSlotParam adSlotParam, final Response response, final List<String> list) {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.ot.9
            @Override // java.lang.Runnable
            public void run() {
                ot.this.b(str, i, j, adSlotParam, response, list);
            }
        });
    }

    private void a(final rf rfVar, final long j, final int i, final String str, final int i2) {
        com.huawei.openalliance.ad.utils.o.d(new Runnable() { // from class: com.huawei.openalliance.ad.ot.6
            @Override // java.lang.Runnable
            public void run() {
                ContentRecord contentRecordG = df.g();
                if (contentRecordG != null) {
                    ContentRecord contentRecordA = rfVar.a(contentRecordG, i, j, com.huawei.openalliance.ad.utils.cw.b(ot.this.f19856a), i2);
                    if (contentRecordA == null) {
                        df.a((ContentRecord) null);
                        return;
                    }
                    ContentRecord contentRecordA2 = rfVar.a(contentRecordA, i, com.huawei.openalliance.ad.utils.as.c());
                    hw.a("AdReqProcessor", "normal ad downloaded: %s", Boolean.valueOf(contentRecordA2 != null));
                    if (contentRecordA2 != null) {
                        contentRecordA2.y(str);
                    }
                    df.a(contentRecordA2);
                }
            }
        });
    }

    private void a(final rf rfVar, final int i, final String str, final String str2, final DelayInfo delayInfo, final int i2) {
        hw.b("AdReqProcessor", "recordSpareAd");
        com.huawei.openalliance.ad.utils.o.d(new Runnable() { // from class: com.huawei.openalliance.ad.ot.5
            @Override // java.lang.Runnable
            public void run() {
                String strC;
                ContentRecord contentRecordH = df.h();
                com.huawei.openalliance.ad.analysis.c cVar = new com.huawei.openalliance.ad.analysis.c(ot.this.f19856a);
                String strB = null;
                if (contentRecordH == null) {
                    cVar.a(new com.huawei.openalliance.ad.analysis.a(str, str2, i2), 101, (String) null, (String) null);
                    return;
                }
                String strN = contentRecordH.n();
                String strO = contentRecordH.o();
                delayInfo.e(contentRecordH.o());
                hw.a("AdReqProcessor", "check spare ad exist");
                CheckResult checkResultA = rfVar.a(contentRecordH);
                com.huawei.openalliance.ad.analysis.a aVar = new com.huawei.openalliance.ad.analysis.a(str, strN, i2);
                aVar.a(strO);
                if (checkResultA == null || !checkResultA.a()) {
                    df.b((ContentRecord) null);
                    if (checkResultA != null) {
                        strB = checkResultA.b();
                        strC = checkResultA.c();
                    } else {
                        strC = null;
                    }
                    cVar.a(aVar, 104, strB, strC);
                    return;
                }
                contentRecordH.i(checkResultA.b());
                contentRecordH.j(checkResultA.c());
                contentRecordH.q(checkResultA.d());
                rfVar.a(contentRecordH, contentRecordH.o());
                ContentRecord contentRecordA = rfVar.a(contentRecordH, i, com.huawei.openalliance.ad.utils.as.c());
                df.b(contentRecordA);
                hw.a("AdReqProcessor", "spare ad downloaded: %s", Boolean.valueOf(contentRecordA != null));
                if (contentRecordA == null) {
                    df.b((ContentRecord) null);
                    cVar.a(aVar, 103, (String) null, (String) null);
                } else {
                    contentRecordA.y(str);
                    contentRecordA.c(true);
                    delayInfo.b(true);
                    cVar.a(aVar, 200, (String) null, (String) null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ge geVar, Pair<Integer, String> pair) {
        if (200 != ((Integer) pair.first).intValue()) {
            a(geVar);
            return;
        }
        String str = (String) pair.second;
        if (com.huawei.openalliance.ad.utils.dg.b(str)) {
            hw.b("AdReqProcessor", "query ins app result blank");
        } else {
            com.huawei.openalliance.ad.utils.be.a(this.f19856a, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ge geVar) {
        hw.a("AdReqProcessor", "clear ins app info");
        geVar.c(Constants.INS_APPS_ENCODED);
        geVar.c(Constants.ENCODING_MODE);
        geVar.c(Constants.LABEL_GEN_TIME);
        i();
    }

    private void a(ContentRecord contentRecord) {
        if (contentRecord == null || contentRecord.j() == null || contentRecord.j().L() == null) {
            return;
        }
        com.huawei.openalliance.ad.utils.e.a(this.f19856a, contentRecord.j().L());
    }

    private void a(AdContentRsp adContentRsp, List<ContentRecord> list, int i, String str, ContentRecord contentRecord, long j) {
        ContentRecord contentRecord2;
        DelayInfo delayInfoA = a();
        delayInfoA.b(Integer.valueOf(com.huawei.openalliance.ad.analysis.d.a(adContentRsp, contentRecord, str, i, j, list)));
        if (com.huawei.openalliance.ad.utils.bm.a(list) || (contentRecord2 = list.get(0)) == null) {
            return;
        }
        delayInfoA.a(Integer.valueOf(contentRecord2.F()));
        delayInfoA.b(Collections.singletonList(contentRecord2.o()));
    }

    private void a(final AdContentRsp adContentRsp, final int i) {
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.ot.11
            @Override // java.lang.Runnable
            public void run() {
                ot.this.b(adContentRsp, i);
            }
        });
    }

    private void a(final AdContentRsp adContentRsp) {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.ot.17
            @Override // java.lang.Runnable
            public void run() {
                com.huawei.openalliance.ad.utils.cq.a(ot.this.f19856a, adContentRsp);
                py.a(ot.this.f19856a).a();
            }
        });
    }

    private void a(AdContentReq adContentReq) {
        hw.b("AdReqProcessor", "configBasicTemplateParam");
        adContentReq.f(e.a());
        adContentReq.c(j());
        adContentReq.a((Boolean) true);
    }

    private void a(AdSlotParam adSlotParam, Response<AdContentRsp> response, AdContentRsp adContentRsp) {
        Integer numC = adSlotParam.C();
        if (numC != null) {
            if (response != null) {
                response.b(numC.intValue());
            }
            if (adContentRsp != null) {
                adContentRsp.f(numC.intValue());
            }
        }
    }

    private void a(AdSlotParam adSlotParam) {
        String str;
        try {
            HiAd.a(this.f19856a).a(adSlotParam.a().get(0));
        } catch (RuntimeException unused) {
            str = "refreshConfig RuntimeException";
            hw.c("AdReqProcessor", str);
        } catch (Exception unused2) {
            str = "refreshConfig Exception";
            hw.c("AdReqProcessor", str);
        }
    }

    private void a(final Context context, final String str, final List<String> list, final int i, final Response<AdContentRsp> response) {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.ot.8
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.h(context).a(str, list, i, response);
            }
        });
    }

    private void a(final long j, final rf rfVar, final ContentRecord contentRecord) {
        com.huawei.openalliance.ad.utils.o.d(new Runnable() { // from class: com.huawei.openalliance.ad.ot.4
            @Override // java.lang.Runnable
            public void run() {
                ContentRecord contentRecord2 = contentRecord;
                if (contentRecord2 == null || contentRecord2.j() == null || com.huawei.openalliance.ad.utils.bm.a(contentRecord.j().g())) {
                    return;
                }
                rfVar.a(contentRecord.j().g().get(0), contentRecord, j);
            }
        });
    }

    private void a(final int i, final AdContentRsp adContentRsp, final boolean z) {
        if (adContentRsp == null) {
            return;
        }
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.ot.20
            @Override // java.lang.Runnable
            public void run() {
                if (1 == i) {
                    Map<String, String> mapB = z ? com.huawei.openalliance.ad.utils.cm.b(adContentRsp) : com.huawei.openalliance.ad.utils.cm.a(adContentRsp);
                    if (com.huawei.openalliance.ad.utils.br.a(mapB)) {
                        return;
                    }
                    fl.a(ot.this.f19856a).a(mapB);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(AdConfigMapKey.SPLASH_PRELOAD_MODE, com.huawei.openalliance.ad.utils.bk.b(mapB));
                        na.a(ot.this.f19856a).a(RTCMethods.UPDATE_MEDIA_CONFIG, jSONObject.toString(), new RemoteCallResultCallback<String>() { // from class: com.huawei.openalliance.ad.ot.20.1
                            @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                            public void onRemoteCallResult(String str, CallResult<String> callResult) {
                                if (callResult == null || callResult.getCode() != 200) {
                                    return;
                                }
                                hw.a("AdReqProcessor", "update media config success");
                                String data = callResult.getData();
                                if (com.huawei.openalliance.ad.utils.dg.b(data)) {
                                    return;
                                }
                                fl.a(ot.this.f19856a).a((Map<String, String>) com.huawei.openalliance.ad.utils.bk.b(data, Map.class, new Class[0]));
                            }
                        }, String.class);
                    } catch (Throwable th) {
                        hw.c("AdReqProcessor", "update media config to kit error:%s", th.getClass().getSimpleName());
                    }
                }
            }
        });
    }

    private void a(final int i, final AdContentRsp adContentRsp) {
        com.huawei.openalliance.ad.utils.o.b(new Runnable() { // from class: com.huawei.openalliance.ad.ot.2
            @Override // java.lang.Runnable
            public void run() {
                AdContentRsp adContentRsp2 = adContentRsp;
                if (adContentRsp2 != null) {
                    ot.this.b(adContentRsp2, i);
                }
                com.huawei.openalliance.ad.utils.cq.a(ot.this.f19856a, adContentRsp);
                py.a(ot.this.f19856a).a();
            }
        });
    }

    private void a(int i, ApiReqParam apiReqParam, AdContentReq adContentReq) {
        if (adContentReq.K() != null && adContentReq.K().intValue() == 3) {
            adContentReq.f((Integer) null);
        }
        if (com.huawei.openalliance.ad.utils.as.g()) {
            if (7 == i || 12 == i) {
                a(adContentReq);
            }
            if (a(apiReqParam)) {
                a(adContentReq);
                adContentReq.b(apiReqParam.b());
            }
        }
    }

    private AdContentRsp a(AdRequestParam adRequestParam) {
        int iA = adRequestParam.a();
        AdSlotParam adSlotParamB = adRequestParam.b();
        List<String> listC = adRequestParam.c();
        adSlotParamB.d(iA);
        if (!qv.a(this.f19856a, adSlotParamB)) {
            hw.b("AdReqProcessor", "request discard");
            return null;
        }
        String strS = adSlotParamB.s();
        if (com.huawei.openalliance.ad.utils.dg.b(strS) || adSlotParamB.j()) {
            strS = com.huawei.openalliance.ad.utils.as.a();
        }
        String str = strS;
        long jC = com.huawei.openalliance.ad.utils.as.c();
        adRequestParam.a(str);
        adRequestParam.a(jC);
        adRequestParam.a(a().u());
        Response<AdContentRsp> responseA = this.e.a(adRequestParam);
        AdContentRsp adContentRspB = responseA != null ? responseA.b() : null;
        long jC2 = com.huawei.openalliance.ad.utils.as.c();
        a(adSlotParamB, responseA, adContentRspB);
        AdContentRsp adContentRspA = qd.a(this.f19856a, adContentRspB, iA);
        b(adContentRspA);
        if (responseA != null) {
            a().h(responseA.r());
            a().i(responseA.s());
        }
        if (adContentRspA != null) {
            adContentRspA.h(a(adSlotParamB.i(), this.f19856a.getPackageName()));
            adContentRspA.c(str);
            adContentRspA.a(adSlotParamB);
            com.huawei.openalliance.ad.utils.cn.a(this.f19856a).J(adContentRspA.l());
            hw.a("AdReqProcessor", "response return from content trackVersion is : %s", adContentRspA.l());
            a(adContentRspA, iA);
        } else {
            a(this.f19856a, str, adSlotParamB.a(), iA, responseA);
        }
        a(str, iA, adSlotParamB);
        a(str, iA, jC2 - jC, adSlotParamB, responseA, listC);
        a(adSlotParamB.j(), adSlotParamB.a());
        e();
        a(adContentRspA);
        f();
        qz qzVarA = cb.a(this.f19856a).a(1, adSlotParamB.d());
        if (qzVarA != null) {
            qzVarA.b();
        }
        return adContentRspA;
    }

    private AdContentRsp a(int i, AdSlotParam adSlotParam, List<String> list, List<String> list2, List<String> list3) {
        return a(new AdRequestParam.Builder().a(i).a(adSlotParam).a(list).b(list2).c(list3).a());
    }

    private App a(String str, AdSlotParam adSlotParam) {
        RequestOptions requestOptionsL;
        if (WhiteListPkgList.inWhiteList(str, com.huawei.openalliance.ad.utils.k.e(this.f19856a, str))) {
            App appI = adSlotParam.i();
            return (appI != null || (requestOptionsL = adSlotParam.l()) == null || requestOptionsL.getApp() == null) ? appI : new App(this.f19856a, requestOptionsL.getApp());
        }
        hw.c("AdReqProcessor", "can not set app info:" + str);
        return null;
    }

    public ot(Context context) {
        this.f19856a = context.getApplicationContext();
        this.f19857b = ew.a(context);
        this.f19858c = fs.a(context);
        this.d = fj.a(context);
        this.e = fi.a(context);
        this.f = fp.b(context);
    }
}
