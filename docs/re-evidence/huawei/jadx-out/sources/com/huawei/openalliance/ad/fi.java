package com.huawei.openalliance.ad;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.ads.adsrec.AdRecommendEngine;
import com.huawei.hms.ads.consent.inter.Consent;
import com.huawei.hms.ads.data.SearchInfo;
import com.huawei.hms.ads.dynamic.IObjectWrapper;
import com.huawei.openalliance.ad.beans.base.ReqBean;
import com.huawei.openalliance.ad.beans.inner.AdRequestParam;
import com.huawei.openalliance.ad.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.beans.inner.FenceData;
import com.huawei.openalliance.ad.beans.inner.LocationSwitches;
import com.huawei.openalliance.ad.beans.metadata.Ad30;
import com.huawei.openalliance.ad.beans.metadata.AdEvent;
import com.huawei.openalliance.ad.beans.metadata.AdEventResult;
import com.huawei.openalliance.ad.beans.metadata.AdEventResultV2;
import com.huawei.openalliance.ad.beans.metadata.AdSlot30;
import com.huawei.openalliance.ad.beans.metadata.AdTimeStatistics;
import com.huawei.openalliance.ad.beans.metadata.App;
import com.huawei.openalliance.ad.beans.metadata.AppCollection;
import com.huawei.openalliance.ad.beans.metadata.AppExt;
import com.huawei.openalliance.ad.beans.metadata.Device;
import com.huawei.openalliance.ad.beans.metadata.ExtraReqField;
import com.huawei.openalliance.ad.beans.metadata.ImpEX;
import com.huawei.openalliance.ad.beans.metadata.Location;
import com.huawei.openalliance.ad.beans.metadata.Options;
import com.huawei.openalliance.ad.beans.metadata.SdkExposureHistoryRecord;
import com.huawei.openalliance.ad.beans.metadata.v3.CachedContent;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.beans.parameter.BiddingParam;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.beans.parameter.UiEngineInfo;
import com.huawei.openalliance.ad.beans.server.AdContentReq;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.beans.server.AdPreReq;
import com.huawei.openalliance.ad.beans.server.AnalysisReportReq;
import com.huawei.openalliance.ad.beans.server.AppConfigReq;
import com.huawei.openalliance.ad.beans.server.AppConfigRsp;
import com.huawei.openalliance.ad.beans.server.AppDataCollectionReq;
import com.huawei.openalliance.ad.beans.server.AppDataCollectionRsp;
import com.huawei.openalliance.ad.beans.server.ConsentConfigReq;
import com.huawei.openalliance.ad.beans.server.ConsentConfigRsp;
import com.huawei.openalliance.ad.beans.server.EventReportReq;
import com.huawei.openalliance.ad.beans.server.EventReportRsp;
import com.huawei.openalliance.ad.beans.server.PermissionReq;
import com.huawei.openalliance.ad.beans.server.PermissionRsp;
import com.huawei.openalliance.ad.beans.server.ThirdReportRsp;
import com.huawei.openalliance.ad.beans.tags.TagCfgModel;
import com.huawei.openalliance.ad.constant.AiCoreSdkConstant;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.RTCMethods;
import com.huawei.openalliance.ad.constant.SpKeys;
import com.huawei.openalliance.ad.constant.TagConstants;
import com.huawei.openalliance.ad.constant.TagKey;
import com.huawei.openalliance.ad.constant.UiEngineMethodName;
import com.huawei.openalliance.ad.constant.UiEngineParam;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.data.SearchTerm;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.net.http.Response;
import com.iabtcf.decoder.DecoderOption;
import com.iabtcf.decoder.TCString;
import defpackage.ayc;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class fi implements gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Map<Integer, Integer> f18761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static gf f18762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f18763c = new byte[0];
    private Context d;
    private gk e;
    private gi f;
    private kc g;
    private ke h;
    private int i;
    private boolean j;
    private int k;
    private final byte[] l = new byte[0];
    private final byte[] m = new byte[0];
    private final byte[] n = new byte[0];
    private final byte[] o = new byte[0];
    private kd p;
    private go q;
    private boolean r;

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i) {
        return i >= 200 && i < 300 && i != 204;
    }

    @Override // com.huawei.openalliance.ad.gf
    public ThirdReportRsp b(String str) {
        String str2;
        if (com.huawei.openalliance.ad.utils.dg.b(str)) {
            hw.d("NetHandler", "fail to report to thirdParty event, thirdParty url is empty");
            return null;
        }
        try {
            Response<String> responseA = d().a(str, this.e.bC());
            ThirdReportRsp thirdReportRsp = new ThirdReportRsp();
            int iA = responseA.a();
            thirdReportRsp.a(iA);
            thirdReportRsp.responseCode = ((iA >= 200 && iA < 300) || iA == 302 || iA == 301) ? 0 : 1;
            thirdReportRsp.errorReason = responseA.d();
            return thirdReportRsp;
        } catch (IllegalArgumentException unused) {
            str2 = "reportThirdPartyEvent IllegalArgumentException";
            hw.c("NetHandler", str2);
            return null;
        } catch (Exception unused2) {
            str2 = "reportThirdPartyEvent exception";
            hw.c("NetHandler", str2);
            return null;
        }
    }

    @Override // com.huawei.openalliance.ad.gf
    public AppDataCollectionRsp b(List<AppCollection> list) {
        String str;
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            return null;
        }
        AppDataCollectionReq appDataCollectionReq = new AppDataCollectionReq();
        appDataCollectionReq.a(list);
        try {
            Response<AppDataCollectionRsp> responseA = k().a(true, appDataCollectionReq, b(appDataCollectionReq));
            if (responseA != null) {
                return responseA.b();
            }
        } catch (IllegalArgumentException unused) {
            str = "reportAppDataCollection IllegalArgumentException";
            hw.c("NetHandler", str);
        } catch (Exception unused2) {
            str = "reportAppDataCollection Exception";
            hw.c("NetHandler", str);
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.gf
    public AdContentReq b(AdRequestParam adRequestParam) {
        AdContentReq adContentReqC = c(adRequestParam);
        if (adContentReqC != null && adContentReqC.k().isEmpty()) {
            adContentReqC.a((List<AdSlot30>) null);
        }
        return adContentReqC;
    }

    public void a(String str, AdSlotParam adSlotParam, AdSlot30 adSlot30, int i) {
        if (com.huawei.openalliance.ad.utils.bj.a(i) && adSlotParam.A()) {
            adSlot30.a(com.huawei.openalliance.ad.utils.dg.d(adSlotParam.B()) ? adSlotParam.B() : e.a());
        }
    }

    @Override // com.huawei.openalliance.ad.gf
    public void a(AdPreReq adPreReq) {
        try {
            hw.b("NetHandler", "preRequestAdContent, result:" + c().a(adPreReq).a());
        } catch (Throwable th) {
            hw.c("NetHandler", "requestAdContent Exception: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.gf
    public Map<Integer, AdContentRsp> a(String str, long j, List<String> list) {
        HashMap map = new HashMap(4);
        Response responseC = c(str);
        responseC.b(1);
        AdContentRsp adContentRsp = (AdContentRsp) responseC.b();
        long jC = com.huawei.openalliance.ad.utils.as.c() - j;
        if (adContentRsp == null) {
            a(-1, "", -1, responseC.a(), responseC.d(), jC, false, responseC, null);
            return map;
        }
        adContentRsp.responseCode = responseC.a() == 200 ? 0 : 1;
        String strK = adContentRsp.k();
        this.e.h(adContentRsp.g());
        Map<Integer, AdContentRsp> mapA = a(map, adContentRsp, list, strK, responseC, jC);
        for (Map.Entry<Integer, AdContentRsp> entry : mapA.entrySet()) {
            Integer key = entry.getKey();
            if (key != null) {
                AdContentRsp adContentRspD = d(key.intValue(), list, entry.getValue());
                if (adContentRspD != null) {
                    mapA.put(key, adContentRspD);
                }
            }
        }
        return mapA;
    }

    @Override // com.huawei.openalliance.ad.gf
    public so a(final sn snVar) {
        so soVarA = new sl(this.d, snVar).a();
        if (soVarA == null && this.d != null && snVar != null && snVar.l() != null) {
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.fi.4
                @Override // java.lang.Runnable
                public void run() {
                    new com.huawei.openalliance.ad.analysis.c(fi.this.d).a(snVar);
                }
            });
        }
        return soVarA;
    }

    @Override // com.huawei.openalliance.ad.gf
    public Response<String> a(AdContentReq adContentReq) {
        return c().b(this.e.cd(), adContentReq, a((ReqBean) adContentReq));
    }

    @Override // com.huawei.openalliance.ad.gf
    public Response<AdContentRsp> a(AdRequestParam adRequestParam) {
        int iA = adRequestParam.a();
        AdSlotParam adSlotParamB = adRequestParam.b();
        AdTimeStatistics adTimeStatisticsI = adRequestParam.i();
        String strG = adRequestParam.g();
        long jH = adRequestParam.h();
        adTimeStatisticsI.d(jH);
        AdContentReq adContentReqC = c(adRequestParam);
        if (adContentReqC == null) {
            return new Response<>();
        }
        adTimeStatisticsI.c(System.currentTimeMillis());
        adContentReqC.b(strG);
        adContentReqC.b(adRequestParam.f());
        com.huawei.openalliance.ad.utils.dx.a(adSlotParamB);
        hw.b("NetHandler", "do ad req");
        return a(adContentReqC, adSlotParamB, iA, strG, jH, adTimeStatisticsI);
    }

    @Override // com.huawei.openalliance.ad.gf
    public PermissionRsp a(String str, String str2, String str3, int i, int i2) {
        String str4;
        try {
            PermissionReq permissionReq = new PermissionReq(str, str2, str3, i, i2);
            Response<PermissionRsp> responseA = c().a(permissionReq, a(permissionReq));
            if (responseA != null) {
                return responseA.b();
            }
            return null;
        } catch (IllegalArgumentException unused) {
            str4 = "requestPermission IllegalArgumentException";
            hw.c("NetHandler", str4);
            return null;
        } catch (Exception unused2) {
            str4 = "requestPermission Exception";
            hw.c("NetHandler", str4);
            return null;
        }
    }

    @Override // com.huawei.openalliance.ad.gf
    public EventReportRsp a(List<AdEvent> list) {
        EventReportRsp eventReportRsp;
        Exception e;
        IllegalArgumentException e2;
        EventReportRsp eventReportRsp2 = null;
        if (list == null || list.isEmpty()) {
            hw.c("NetHandler", "fail to upload cache events, events is empty");
            return null;
        }
        List<AdEvent> listG = g(list);
        EventReportRsp eventReportRspH = !listG.isEmpty() ? h(listG) : null;
        if (list.isEmpty()) {
            return eventReportRspH;
        }
        EventReportReq eventReportReq = new EventReportReq(list);
        try {
            Response<EventReportRsp> responseA = c().a(eventReportReq, a(eventReportReq));
            if (responseA == null) {
                return null;
            }
            eventReportRsp = responseA.b();
            try {
                String strD = responseA.d();
                if (strD == null) {
                    strD = String.valueOf(responseA.a());
                }
                if (eventReportRsp != null) {
                    eventReportRsp.responseCode = responseA.a() == 200 ? 0 : 1;
                    eventReportRsp.errorReason = strD;
                    eventReportRsp2 = eventReportRsp;
                } else {
                    EventReportRsp eventReportRsp3 = new EventReportRsp();
                    try {
                        eventReportRsp3.responseCode = 1;
                        eventReportRsp3.errorReason = strD;
                        eventReportRsp2 = eventReportRsp3;
                    } catch (IllegalArgumentException e3) {
                        e2 = e3;
                        eventReportRsp = eventReportRsp3;
                    } catch (Exception e4) {
                        e = e4;
                        eventReportRsp = eventReportRsp3;
                        hw.c("NetHandler", "uploadEvents Exception");
                        if (eventReportRsp == null) {
                            eventReportRsp = new EventReportRsp();
                            eventReportRsp.errorReason = e.getClass().getSimpleName();
                            eventReportRsp.responseCode = 1;
                            a(eventReportRspH, eventReportRsp);
                        }
                        return eventReportRsp;
                    }
                }
                a(eventReportRspH, eventReportRsp2);
                hw.b("NetHandler", "upload events: %s", Integer.valueOf(eventReportRsp2.responseCode));
                return eventReportRsp2;
            } catch (IllegalArgumentException e5) {
                e2 = e5;
            } catch (Exception e6) {
                e = e6;
            }
        } catch (IllegalArgumentException e7) {
            eventReportRsp = eventReportRsp2;
            e2 = e7;
        } catch (Exception e8) {
            eventReportRsp = eventReportRsp2;
            e = e8;
        }
        hw.c("NetHandler", "uploadEvents IllegalArgumentException");
        if (eventReportRsp == null) {
            eventReportRsp = new EventReportRsp();
            eventReportRsp.responseCode = 1;
            eventReportRsp.errorReason = e2.getClass().getSimpleName();
            a(eventReportRspH, eventReportRsp);
        }
        return eventReportRsp;
    }

    @Override // com.huawei.openalliance.ad.gf
    public ConsentConfigRsp a(String str, ConsentConfigReq consentConfigReq) {
        String str2;
        try {
            if (!"3.4.84.300".equals(consentConfigReq.d())) {
                hw.b("NetHandler", "consent sdk version not match, reset version.");
                consentConfigReq.a("3.4.84.300");
            }
            if (!TextUtils.isEmpty(consentConfigReq.d()) && consentConfigReq.d().startsWith("13.4.")) {
                hw.b("NetHandler", "replace inner consent sdk version.");
                consentConfigReq.a(consentConfigReq.d().replace("13.4.", "3.4."));
            }
            Response<ConsentConfigRsp> responseA = c().a(consentConfigReq, a(consentConfigReq));
            if (responseA == null) {
                return null;
            }
            ConsentConfigRsp consentConfigRspB = responseA.b();
            if (consentConfigRspB != null) {
                consentConfigRspB.responseCode = responseA.a() == 200 ? 0 : 1;
            }
            return consentConfigRspB;
        } catch (IllegalArgumentException unused) {
            str2 = "requestConsentConfig IllegalArgumentException";
            hw.c("NetHandler", str2);
            return null;
        } catch (Exception unused2) {
            str2 = "requestConsentConfig Exception";
            hw.c("NetHandler", str2);
            return null;
        }
    }

    @Override // com.huawei.openalliance.ad.gf
    public AppConfigRsp a(String str) {
        String str2;
        try {
            i();
            AppConfigReq appConfigReqE = e(str);
            Response<AppConfigRsp> responseA = c().a(this.e.ce(), appConfigReqE, a((ReqBean) appConfigReqE));
            if (responseA == null) {
                return null;
            }
            AppConfigRsp appConfigRspB = responseA.b();
            if (appConfigRspB != null) {
                d(appConfigRspB.N());
                this.e.g(appConfigRspB.m());
                appConfigRspB.responseCode = responseA.a() == 200 ? 0 : 1;
                hw.b("NetHandler", "request app config: %s", Integer.valueOf(appConfigRspB.responseCode));
            }
            return appConfigRspB;
        } catch (IllegalArgumentException unused) {
            str2 = "requestAppConfig IllegalArgumentException";
            hw.c("NetHandler", str2);
            return null;
        } catch (Exception unused2) {
            str2 = "requestAppConfig Exception";
            hw.c("NetHandler", str2);
            return null;
        }
    }

    private kd k() {
        kd kdVar;
        synchronized (this.n) {
            if (this.p == null || this.i != this.e.bA()) {
                this.i = this.e.bA();
                j();
            }
            kdVar = this.p;
        }
        return kdVar;
    }

    private void j() {
        hw.b("NetHandler", "createAdServerRequester lib switch: %d", Integer.valueOf(this.i));
        this.p = (kd) new com.huawei.openalliance.ad.net.http.e.a(this.d).c(this.i).a(new ka()).b(new kb()).a().a(kd.class);
    }

    private void i() {
        try {
            List<String> listA = com.huawei.openalliance.ad.utils.c.a();
            if (!com.huawei.openalliance.ad.utils.bm.a(listA)) {
                hw.b("NetHandler", "getAndSaveBlkTptIds: %s", com.huawei.openalliance.ad.utils.bm.a(listA, ", "));
                this.e.b(listA);
            } else {
                hw.b("NetHandler", "getAndSaveBlkTptIds,empty");
            }
        } catch (Exception unused) {
            hw.c("NetHandler", "getBlackTptIdList Exception");
        }
    }

    private Map<String, String> i(final AdContentReq adContentReq) {
        if (com.huawei.openalliance.ad.utils.ab.j(this.d)) {
            return null;
        }
        final com.huawei.openalliance.ad.utils.cn cnVarA = com.huawei.openalliance.ad.utils.cn.a(this.d);
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.fi.2
            @Override // java.lang.Runnable
            public void run() {
                Long lG;
                Long lH;
                HashMap map = new HashMap();
                try {
                    Device deviceI = adContentReq.i();
                    int iD = fi.this.e.D();
                    map.put(TagKey.HW_D001, com.huawei.openalliance.ad.utils.d.y(fi.this.d));
                    map.put(TagKey.HW_D002, com.huawei.openalliance.ad.utils.d.x(fi.this.d));
                    if (deviceI != null) {
                        lG = deviceI.H();
                        lH = deviceI.J();
                    } else {
                        lG = com.huawei.openalliance.ad.utils.ab.g(fi.this.d, iD);
                        lH = com.huawei.openalliance.ad.utils.ab.h(fi.this.d, iD);
                    }
                    if (lG != null) {
                        map.put(TagKey.HW_D003, Long.toString(lG.longValue()));
                    }
                    if (lH != null) {
                        map.put(TagKey.HW_D004, Long.toString(lH.longValue()));
                    }
                    Integer numO = com.huawei.openalliance.ad.utils.ab.o(fi.this.d, iD);
                    if (numO != null) {
                        map.put(TagKey.HW_D005, Integer.toString(numO.intValue()));
                    }
                    Integer numP = com.huawei.openalliance.ad.utils.ab.p(fi.this.d, iD);
                    if (numP != null) {
                        map.put(TagKey.HW_D006, Integer.toString(numP.intValue()));
                    }
                    map.put(TagKey.HW_D007, com.huawei.openalliance.ad.utils.ab.l(fi.this.d, iD));
                    String strT = com.huawei.openalliance.ad.utils.cn.a(fi.this.d).T();
                    if (!com.huawei.openalliance.ad.utils.dg.b(strT)) {
                        map.put(TagKey.HW_U001, strT);
                    }
                    map.put(TagKey.HW_U002, com.huawei.openalliance.ad.utils.ab.f(fi.this.d) ? "1" : "0");
                    map.put(TagKey.HW_M001, Integer.toString(com.huawei.openalliance.ad.utils.bo.a(fi.this.d).c()));
                } catch (Throwable th) {
                    hw.c("NetHandler", "config tag error:%s", th.getClass().getSimpleName());
                }
                cnVarA.a(map);
            }
        });
        return cnVarA.aa();
    }

    private boolean h() {
        return !cc.b(this.d) && Build.VERSION.SDK_INT < 28 && cc.a(this.d).a(this.d);
    }

    private void h(AdContentReq adContentReq) {
        App appH;
        if (adContentReq == null || (appH = adContentReq.h()) == null || !com.huawei.openalliance.ad.utils.dg.b(appH.d())) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ImpEX(Constants.AUTOCONTENT_CONTENT_AUTO, Constants.LINK));
        HashMap map = new HashMap();
        map.put("contentBundle", arrayList);
        appH.c(com.huawei.openalliance.ad.utils.bk.b(map));
    }

    private EventReportRsp h(List<AdEvent> list) {
        String str;
        if (list == null || list.isEmpty()) {
            hw.c("NetHandler", "fail to upload cache events, events is empty");
            return null;
        }
        AnalysisReportReq analysisReportReq = new AnalysisReportReq(list);
        try {
            Map<String, String> mapA = a(analysisReportReq);
            kg.a(mapA);
            Response<EventReportRsp> responseA = c().a(analysisReportReq, mapA);
            if (responseA != null) {
                EventReportRsp eventReportRspB = responseA.b();
                if (eventReportRspB != null) {
                    eventReportRspB.responseCode = responseA.a() == 200 ? 0 : 1;
                    hw.b("NetHandler", "upload analysis events: %s", Integer.valueOf(eventReportRspB.responseCode));
                }
                return eventReportRspB;
            }
        } catch (IllegalArgumentException unused) {
            str = "uploadEvents IllegalArgumentException";
            hw.c("NetHandler", str);
        } catch (Exception unused2) {
            str = "uploadEvents Exception";
            hw.c("NetHandler", str);
        }
        return null;
    }

    private void g(AdContentReq adContentReq) {
        int iK = this.e.k();
        boolean zI = this.e.i();
        boolean zJ = this.e.j();
        if (2 == iK) {
            return;
        }
        if (1 == iK) {
            a(adContentReq, zI, zJ);
            return;
        }
        String strP = adContentReq.i().p();
        if (com.huawei.openalliance.ad.utils.dg.b(strP) || Constants.NIL_UUID.equals(strP)) {
            a(adContentReq, zI, zJ);
        }
    }

    private void g(Device device) {
        ge geVarA = fe.a(this.d);
        if (geVarA.d(Constants.INS_APPS_RETURN_CODE) && 200 != geVarA.c()) {
            f(device);
            return;
        }
        List<String> listV = com.huawei.openalliance.ad.utils.d.v(this.d);
        device.a(listV);
        if (com.huawei.openalliance.ad.utils.bm.a(listV)) {
            return;
        }
        device.c(Integer.valueOf(com.huawei.openalliance.ad.utils.d.w(this.d)));
    }

    private List<AdEvent> g(List<AdEvent> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<AdEvent> it = list.iterator();
        while (it.hasNext()) {
            AdEvent next = it.next();
            if (EventType.ANALYSIS.value().equals(next.a())) {
                it.remove();
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private FenceData g() {
        if (!com.huawei.openalliance.ad.utils.bo.c(this.d)) {
            a(false, (FenceData) null);
            return null;
        }
        FenceData fenceData = (FenceData) com.huawei.openalliance.ad.utils.bk.b(this.d, fp.b(this.d).cN(), FenceData.class, new Class[0]);
        if (fenceData != null) {
            fenceData.a(com.huawei.openalliance.ad.utils.cn.a(this.d).I());
        }
        if (fenceData == null || fenceData.b()) {
            a(false, (FenceData) null);
            return null;
        }
        FenceData fenceDataA = fenceData.a(this.d);
        if (fenceDataA == null || fenceDataA.b()) {
            a(false, (FenceData) null);
            return null;
        }
        a(true, fenceDataA);
        return fenceDataA;
    }

    private void f(AdContentReq adContentReq) {
        fd fdVarA = fd.a(this.d);
        List<SdkExposureHistoryRecord> listB = fdVarA.b(this.d);
        if (com.huawei.openalliance.ad.utils.bm.a(listB)) {
            return;
        }
        adContentReq.f(listB);
        fdVarA.a((List<SdkExposureHistoryRecord>) null);
    }

    private void f(Device device) {
        device.a((List<String>) null);
        device.c((Integer) null);
    }

    private void f() {
        com.huawei.openalliance.ad.utils.o.h(new Runnable() { // from class: com.huawei.openalliance.ad.fi.9
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(fi.this.d).a(fi.this.d.getPackageName());
            }
        });
    }

    private List<String> f(List<CachedContent> list) {
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<CachedContent> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        return arrayList;
    }

    private void e(AdContentReq adContentReq) {
        ExtraReqField extraReqField = new ExtraReqField();
        FenceData fenceDataG = g();
        if (fenceDataG != null) {
            extraReqField.a(fenceDataG);
        }
        adContentReq.a(extraReqField);
    }

    private void e(Device device) {
        com.huawei.openalliance.ad.utils.ak.a aVarA;
        if (com.huawei.openalliance.ad.utils.ak.b(this.d) && this.e.bf() && (aVarA = com.huawei.openalliance.ad.utils.ak.a(this.d)) != null) {
            device.e(aVarA.a());
            device.f(aVarA.b() ? "0" : "1");
        }
    }

    private void e() {
        com.huawei.openalliance.ad.utils.o.h(new Runnable() { // from class: com.huawei.openalliance.ad.fi.8
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(fi.this.d).b(fi.this.d.getPackageName());
            }
        });
    }

    private Map<String, List<String>> e(List<CachedContent> list) {
        HashMap map = new HashMap();
        if (!com.huawei.openalliance.ad.utils.bm.a(list)) {
            for (CachedContent cachedContent : list) {
                if (cachedContent != null) {
                    map.put(cachedContent.a(), cachedContent.c());
                }
            }
        }
        return map;
    }

    private Integer e(RequestOptions requestOptions) {
        if (requestOptions != null) {
            return requestOptions.getIsQueryUseEnabled();
        }
        return null;
    }

    private AppConfigReq e(String str) {
        AppConfigReq appConfigReq = new AppConfigReq(str);
        Pair<String, Boolean> pairB = com.huawei.openalliance.ad.utils.d.b(this.d, true);
        if (pairB != null) {
            appConfigReq.b((String) pairB.first);
        }
        a(appConfigReq);
        appConfigReq.a(this.e.bj());
        appConfigReq.c(com.huawei.openalliance.ad.utils.d.g(this.d));
        appConfigReq.d(cc.a(this.d).o());
        appConfigReq.e(String.valueOf(30484300));
        App app = new App();
        app.b(this.d.getPackageName());
        app.f(com.huawei.openalliance.ad.utils.ab.a(this.d, app.c()));
        app.a(HiAd.a(this.d).j());
        appConfigReq.a(app);
        Device device = new Device();
        device.a(this.d);
        a(device);
        appConfigReq.a(device);
        fn fnVarA = fn.a(this.d);
        appConfigReq.g(fnVarA.a(this.d.getPackageName()));
        hw.a("NetHandler", "sha256 query from databases, sha256 is %s", fnVarA.a(this.d.getPackageName()));
        return appConfigReq;
    }

    private void d(String str) {
        if (this.f == null) {
            this.f = fm.a(this.d);
        }
        gi giVar = this.f;
        if (giVar != null) {
            giVar.b(str);
        }
    }

    private void d(AdContentReq adContentReq) {
        if (this.r) {
            this.r = false;
            adContentReq.a((Integer) 1);
            if (adContentReq.i() != null) {
                Device deviceI = adContentReq.i();
                deviceI.c((String) null);
                deviceI.e(null);
                adContentReq.a(deviceI);
            }
            adContentReq.a(true);
        }
    }

    private void d(Device device) {
        if (com.huawei.openalliance.ad.utils.dg.b(device.p())) {
            return;
        }
        device.a((String) null);
    }

    private List<String> d(List<AdSlot30> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<AdSlot30> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        return arrayList;
    }

    private Integer d(RequestOptions requestOptions) {
        Integer npaAccordingToServerConsent;
        Integer nonPersonalizedAd = requestOptions.getNonPersonalizedAd();
        if ((nonPersonalizedAd != null && !requestOptions.h()) || !com.huawei.openalliance.ad.utils.as.e() || (npaAccordingToServerConsent = Consent.getInstance(this.d).getNpaAccordingToServerConsent()) == null) {
            return nonPersonalizedAd;
        }
        hw.b("NetHandler", "got npa according to server consent: %s", npaAccordingToServerConsent);
        return npaAccordingToServerConsent;
    }

    private ke d() {
        ke keVar;
        synchronized (this.m) {
            if (this.h == null || this.k != this.e.bB()) {
                this.k = this.e.bB();
                a();
            }
            keVar = this.h;
        }
        return keVar;
    }

    private AdContentRsp d(int i, List<String> list, AdContentRsp adContentRsp) {
        AdContentRsp adContentRspA;
        if (com.huawei.openalliance.ad.utils.bm.a(list) || adContentRsp == null || !com.huawei.openalliance.ad.utils.cq.a(this.d, list, adContentRsp) || (adContentRspA = a(i, list, adContentRsp)) == null) {
            return adContentRsp;
        }
        adContentRspA.f(1);
        return adContentRspA;
    }

    private boolean c(List<String> list) {
        if (!cc.b(this.d)) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (1 == fo.a(this.d).b(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean c(Device device) {
        if (!TextUtils.equals("1", device.q()) || TextUtils.isEmpty(device.p())) {
            return !TextUtils.equals("1", device.A()) || TextUtils.isEmpty(device.z());
        }
        return false;
    }

    private Integer c(RequestOptions requestOptions) {
        Boolean boolG = requestOptions != null ? requestOptions.g() : null;
        int i = 0;
        int i2 = (com.huawei.openalliance.ad.utils.h.a(this.d) && cc.a(this.d).g()) ? 1 : 0;
        if (boolG == null) {
            return Integer.valueOf(i2);
        }
        if (boolG.booleanValue() && i2 != 0) {
            i = 1;
        }
        return Integer.valueOf(i);
    }

    private Response c(String str) {
        ByteArrayInputStream byteArrayInputStream;
        Response response = new Response();
        BufferedInputStream bufferedInputStream = null;
        try {
            lj ljVarA = lj.a.a(AdContentRsp.class);
            byteArrayInputStream = new ByteArrayInputStream((str == null ? "" : str).getBytes(Charset.defaultCharset()));
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(byteArrayInputStream);
                int i = str == null ? -1 : 200;
                try {
                    int iAvailable = bufferedInputStream2.available();
                    response.a(i);
                    response.a(ljVarA.a(i, bufferedInputStream2, iAvailable, new kb()));
                    com.huawei.openalliance.ad.utils.df.a((Closeable) byteArrayInputStream);
                    com.huawei.openalliance.ad.utils.df.a((Closeable) bufferedInputStream2);
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    try {
                        hw.c("NetHandler", "fillResponseData error");
                        response.a(th);
                        com.huawei.openalliance.ad.utils.df.a((Closeable) byteArrayInputStream);
                        com.huawei.openalliance.ad.utils.df.a((Closeable) bufferedInputStream);
                    } finally {
                        com.huawei.openalliance.ad.utils.df.a((Closeable) byteArrayInputStream);
                        com.huawei.openalliance.ad.utils.df.a((Closeable) bufferedInputStream);
                        hw.b("NetHandler", "end request");
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayInputStream = null;
        }
        return response;
    }

    private kc c() {
        kc kcVar;
        synchronized (this.l) {
            boolean zA = kf.a(this.d).a();
            if (this.g == null || zA != this.j || this.i != this.e.bA()) {
                this.i = this.e.bA();
                b();
            }
            kcVar = this.g;
        }
        return kcVar;
    }

    private AdContentRsp c(int i, List<String> list, final AdContentRsp adContentRsp) {
        try {
            hw.b("NetHandler", "api request ads from hms rec engine");
            na naVarA = na.a(this.d);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slotid", com.huawei.openalliance.ad.utils.bk.b(list));
            jSONObject.put(MapKeyNames.LOCAL_RECALL_MAX_COUNT, this.e.n());
            jSONObject.put(MapKeyNames.API_RSP, com.huawei.openalliance.ad.utils.bk.b(adContentRsp));
            jSONObject.put(MapKeyNames.ALLOWED_TRADE_MODES, com.huawei.openalliance.ad.utils.bk.b(Arrays.asList(com.huawei.openalliance.ad.utils.cq.a(this.d, String.valueOf(i)))));
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final Response response = new Response();
            naVarA.a(RTCMethods.RECALL_API_AD_BY_REC_ENGINE, jSONObject.toString(), new RemoteCallResultCallback<String>() { // from class: com.huawei.openalliance.ad.fi.7
                /* JADX WARN: Code duplicated, block: B:14:0x0054 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:4:0x0004, B:6:0x000c, B:9:0x001e, B:13:0x0049, B:15:0x005b, B:14:0x0054), top: B:20:0x0004 }] */
                @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                public void onRemoteCallResult(String str, CallResult<String> callResult) {
                    if (callResult != null) {
                        try {
                            if (callResult.getCode() == 200) {
                                hw.b("NetHandler", "recall api ads from hms success");
                                String data = callResult.getData();
                                if (com.huawei.openalliance.ad.utils.dg.b(data)) {
                                    return;
                                }
                                JSONObject jSONObject2 = new JSONObject(data);
                                AdContentRsp adContentRsp2 = (AdContentRsp) com.huawei.openalliance.ad.utils.bk.b(jSONObject2.optString(MapKeyNames.AD_RSP_STR), AdContentRsp.class, new Class[0]);
                                Response response2 = (Response) com.huawei.openalliance.ad.utils.bk.b(jSONObject2.optString(MapKeyNames.RSP_STR), Response.class, new Class[0]);
                                if (adContentRsp2 != null && response2 != null) {
                                    response.a(response2);
                                    response.a(adContentRsp2);
                                }
                                return;
                            }
                            response.a(adContentRsp);
                        } catch (Throwable th) {
                            hw.c("NetHandler", "parse ads from hms rec engine error: %s", th.getClass().getSimpleName());
                            return;
                        }
                    } else {
                        response.a(adContentRsp);
                    }
                    countDownLatch.countDown();
                }
            }, String.class);
            try {
                hw.a("NetHandler", "latch result: %s", Boolean.valueOf(countDownLatch.await(2L, TimeUnit.SECONDS)));
            } catch (Throwable th) {
                hw.c("NetHandler", "latch " + th.getClass().getSimpleName());
            }
            return (AdContentRsp) response.b();
        } catch (Throwable th2) {
            hw.c("NetHandler", "api request ads from hms rec engine: %s", th2.getClass().getSimpleName());
            return adContentRsp;
        }
    }

    private AdContentReq c(AdRequestParam adRequestParam) {
        Integer num;
        Map<String, Bundle> map;
        SearchInfo searchInfo;
        String str;
        String consent;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        String str2;
        List<String> list;
        boolean z;
        String str3;
        if (fp.b(this.d).aI()) {
            hw.b("NetHandler", "need block ad req.");
            e();
            return null;
        }
        hw.b("NetHandler", "prep req info");
        AdSlotParam adSlotParamB = adRequestParam.b();
        a(adSlotParamB);
        RequestOptions requestOptionsL = adSlotParamB.l();
        Options optionsB = b(requestOptionsL);
        boolean z2 = false;
        if (requestOptionsL != null) {
            if (requestOptionsL.getTagForUnderAgeOfPromise() != null && requestOptionsL.getTagForUnderAgeOfPromise().intValue() == 1) {
                z2 = true;
            }
            Integer numE = e(requestOptionsL);
            Integer numD = d(requestOptionsL);
            Integer numB = requestOptionsL.b();
            Integer numC = requestOptionsL.c();
            consent = requestOptionsL.getConsent();
            String appLang = requestOptionsL.getAppLang();
            String appCountry = requestOptionsL.getAppCountry();
            String searchTerm = requestOptionsL.getSearchTerm();
            Map<String, Bundle> extras = requestOptionsL.getExtras();
            SearchInfo searchInfoF = requestOptionsL.f();
            Integer tMax = requestOptionsL.getTMax();
            List<String> listE = requestOptionsL.e();
            if (TextUtils.isEmpty(consent)) {
                consent = this.e.aK();
            }
            num = tMax;
            list = listE;
            z = z2;
            str3 = appLang;
            num2 = numC;
            str = searchTerm;
            num4 = numD;
            map = extras;
            num5 = numE;
            num3 = numB;
            searchInfo = searchInfoF;
            str2 = appCountry;
        } else {
            num = null;
            map = null;
            searchInfo = null;
            str = null;
            consent = null;
            num2 = null;
            num3 = null;
            num4 = null;
            num5 = null;
            str2 = null;
            list = null;
            z = false;
            str3 = null;
        }
        if (!cc.g(this.d) && !a(consent, requestOptionsL)) {
            return null;
        }
        int iA = adRequestParam.a();
        boolean z3 = z;
        ArrayList arrayList = new ArrayList(4);
        a(iA, adSlotParamB, arrayList, map);
        int[] iArrB = jv.b();
        String strG = adRequestParam.g();
        List<String> listC = adRequestParam.c();
        List<String> listD = adRequestParam.d();
        List<String> listE2 = adRequestParam.e();
        String str4 = str3;
        SearchInfo searchInfo2 = searchInfo;
        String str5 = str;
        String str6 = consent;
        Integer num6 = num;
        Integer num7 = num2;
        Integer num8 = num3;
        Integer num9 = num4;
        Integer num10 = num5;
        AdContentReq adContentReq = new AdContentReq(this.d, arrayList, listC, listD, listE2, adSlotParamB, this.e.bf());
        adContentReq.a(adSlotParamB.G(), this.e.aJ());
        adContentReq.a(iArrB);
        if (optionsB.d()) {
            adContentReq.a(optionsB);
        }
        if (com.huawei.openalliance.ad.utils.bj.a(adSlotParamB) && !TextUtils.isEmpty(adSlotParamB.B())) {
            adContentReq.f(adSlotParamB.B());
        }
        a(adSlotParamB, adContentReq);
        if (!TextUtils.isEmpty(str5)) {
            adContentReq.a(new SearchTerm(str5));
        }
        if (searchInfo2 != null) {
            adContentReq.a(searchInfo2);
        }
        adContentReq.b(num10);
        adContentReq.a(num9);
        adContentReq.c(num8);
        adContentReq.d(num7);
        adContentReq.e(this.e.aM());
        adContentReq.d(this.e.aL());
        adContentReq.c(str6);
        adContentReq.h(num6);
        adContentReq.e(list);
        a(iA, adSlotParamB, str4, str2, adContentReq);
        a(adSlotParamB, num9, z3, adContentReq);
        adContentReq.b(!this.e.bg() ? 1 : 0);
        adContentReq.a(this.e.bk());
        adContentReq.a(adSlotParamB.j() ? 2 : 1);
        if (adSlotParamB.j()) {
            adContentReq.e((Integer) 1);
        }
        b(adSlotParamB, adContentReq);
        adContentReq.a(i(adContentReq));
        adContentReq.f(adSlotParamB.C());
        if (!com.huawei.openalliance.ad.utils.ab.j(this.d)) {
            f(adContentReq);
            g(adContentReq);
            a(adContentReq, strG);
        }
        if (adSlotParamB.C() != null) {
            adContentReq.f(adSlotParamB.C());
        }
        e(adContentReq);
        d(adContentReq);
        return adContentReq;
    }

    private int c(AdContentReq adContentReq) {
        if (!com.huawei.openalliance.ad.utils.cr.a("com.google.flatbuffers.FlatBufferBuilder")) {
            hw.b("NetHandler", "fb sdk not available.");
            return 0;
        }
        if (adContentReq != null && !com.huawei.openalliance.ad.utils.bm.a(adContentReq.k())) {
            boolean z = false;
            for (AdSlot30 adSlot30 : adContentReq.k()) {
                if (adSlot30 != null && !TextUtils.isEmpty(adSlot30.a())) {
                    int iD = fo.a(this.d).d(adSlot30.a());
                    if (1 == iD) {
                        return 1;
                    }
                    if (2 == iD) {
                        z = true;
                    }
                }
            }
            if (z) {
                return 2;
            }
        }
        return 0;
    }

    private void b(AdSlotParam adSlotParam, AdContentReq adContentReq) {
        if (adSlotParam.j()) {
            return;
        }
        adContentReq.g(com.huawei.openalliance.ad.utils.cq.b(this.d) ? AiCoreSdkConstant.SUPPORT_RELATION_RANK : AiCoreSdkConstant.NOT_SUPPORT_RELATION_RANK);
        hw.a("NetHandler", "support relate rank: %s .", adContentReq.L());
    }

    private void b() {
        hw.b("NetHandler", "createAdServerRequester lib switch: %d", Integer.valueOf(this.i));
        kf kfVarA = kf.a(this.d);
        boolean zA = kfVarA.a();
        boolean zB = kfVarA.b();
        hw.b("NetHandler", "isNetworkKitEnable: %s, isQuicEnable: %s", Boolean.valueOf(zA), Boolean.valueOf(zB));
        int i = zA ? 2 : this.i;
        this.j = zA;
        this.g = (kc) new com.huawei.openalliance.ad.net.http.e.a(this.d).c(i).a(new ka()).b(new kb()).c(zB).a().a(kc.class);
    }

    private Map<String, String> b(ReqBean reqBean) {
        kg kgVar = new kg(this.d);
        kgVar.b(reqBean);
        return kgVar.a();
    }

    private Response<AdContentRsp> b(AdContentReq adContentReq, List<String> list, int i, Integer num) {
        try {
            hw.b("NetHandler", "request ads from sdk rec engine");
            return eo.a(this.d, adContentReq, list, i, num);
        } catch (Throwable th) {
            hw.c("NetHandler", "recall ads from sdk error: %s", th.getClass().getSimpleName());
            hw.a(5, "NetHandler", "recall ads from sdk error", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Response<AdContentRsp> b(AdContentReq adContentReq) {
        int iC = c(adContentReq);
        hw.b("NetHandler", "request ad content from server, type: %s", Integer.valueOf(iC));
        if (2 != iC && 1 != iC) {
            return c().a(this.e.cd(), adContentReq, a((ReqBean) adContentReq));
        }
        adContentReq.h(Constants.ACD_REALM_FB);
        adContentReq.g(Constants.ACD_REQ_URI_FB);
        return c().a(iC, adContentReq, a((ReqBean) adContentReq));
    }

    private static gf b(Context context) {
        gf gfVar;
        synchronized (f18763c) {
            if (f18762b == null) {
                f18762b = new fi(context);
            }
            gfVar = f18762b;
        }
        return gfVar;
    }

    private AdContentRsp b(int i, List<String> list, AdContentRsp adContentRsp) {
        hw.b("NetHandler", "api request ads from sdk rec engine");
        int iN = fp.b(this.d).n();
        List<String> listAsList = Arrays.asList(com.huawei.openalliance.ad.utils.cq.a(this.d, String.valueOf(i)));
        ayc aycVar = new ayc(this.d.getPackageName(), adContentRsp.k(), list, null, i);
        aycVar.c(Integer.valueOf(iN));
        aycVar.c(listAsList);
        aycVar.d(this.d.getPackageName());
        JSONObject jSONObjectA = new AdRecommendEngine(this.d).a(aycVar, com.huawei.openalliance.ad.utils.bk.b(adContentRsp));
        hw.a("NetHandler", "api request recall result: %s", jSONObjectA);
        AdContentRsp adContentRsp2 = (AdContentRsp) com.huawei.openalliance.ad.utils.bk.a(this.d, jSONObjectA, AdContentRsp.class, new Class[0]);
        return adContentRsp2 == null ? adContentRsp : adContentRsp2;
    }

    private UiEngineInfo b(AdSlotParam adSlotParam) {
        final com.huawei.openalliance.ad.utils.cn cnVarA = com.huawei.openalliance.ad.utils.cn.a(this.d);
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.fi.12
            @Override // java.lang.Runnable
            public void run() {
                gr grVar = new gr(com.huawei.openalliance.ad.utils.c.a(UiEngineMethodName.QUERY_STYLE_PKG_VERSION, (Bundle) null, (IObjectWrapper) null));
                String strD = grVar.d(UiEngineParam.STYLE_PKG_VERSION);
                String strD2 = grVar.d(UiEngineParam.CACHED_DSL_ENGINE_VER);
                hw.b("NetHandler", "cache uiEngineInfo, dslVersion: %s, cachedDslEngineVer: %s", strD, strD2);
                cnVarA.K(strD);
                cnVarA.L(strD2);
            }
        });
        String strAi = cnVarA.ai();
        String strAj = cnVarA.aj();
        hw.b("NetHandler", "uiEngineInfo from propertiesCache, dslVersion: %s, cachedDslEngineVer: %s", strAi, strAj);
        UiEngineInfo.Builder builder = new UiEngineInfo.Builder();
        if (!TextUtils.isEmpty(strAi) && !TextUtils.isEmpty(strAj)) {
            builder.a(strAi).b(strAj);
        }
        if (com.huawei.openalliance.ad.utils.bj.a(adSlotParam) && !TextUtils.isEmpty(adSlotParam.B())) {
            builder.c(adSlotParam.B());
        }
        return builder.a();
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    private Options b(RequestOptions requestOptions) {
        Options options = new Options();
        int iP = com.huawei.openalliance.ad.utils.d.p(this.d);
        boolean zBooleanValue = com.huawei.openalliance.ad.utils.cn.a(this.d).af().booleanValue();
        Boolean boolAg = com.huawei.openalliance.ad.utils.cn.a(this.d).ag();
        boolean zBooleanValue2 = boolAg.booleanValue();
        ?? r5 = 1;
        r5 = 1;
        if (!zBooleanValue && iP != 1) {
            r5 = 0;
        }
        if (hw.a()) {
            hw.a("NetHandler", "actual coppa is %s, tfua is %s", Boolean.valueOf((boolean) r5), boolAg);
        }
        options.a(Integer.valueOf((int) r5));
        options.b(Integer.valueOf(zBooleanValue2 ? 1 : 0));
        if (requestOptions != null) {
            if (hw.a()) {
                hw.a("NetHandler", "media coppa is %s,tfua is %s", requestOptions.getTagForChildProtection(), requestOptions.getTagForUnderAgeOfPromise());
            }
            if (r5 == 0) {
                options.a(requestOptions.getTagForChildProtection());
            }
            if (!zBooleanValue2) {
                options.b(requestOptions.getTagForUnderAgeOfPromise());
            }
            options.a(requestOptions.a());
        }
        return options;
    }

    private int b(Device device) {
        if (!c(device)) {
            return 9;
        }
        if (this.e.af()) {
            return 1 == com.huawei.openalliance.ad.utils.d.p(this.d) ? 6 : 0;
        }
        return 7;
    }

    private boolean a(String str, RequestOptions requestOptions) {
        boolean z;
        boolean z2;
        hw.b("NetHandler", "start check tcf.");
        boolean z3 = false;
        try {
            if (com.huawei.openalliance.ad.utils.dg.b(str)) {
                hw.b("NetHandler", "no consent str.");
                boolean zA = a(requestOptions);
                if (!zA) {
                    a(false, -1, false, false, false);
                }
                return zA;
            }
            TCString tCStringDecode = TCString.decode(str, new DecoderOption[0]);
            int tcfPolicyVersion = tCStringDecode.getTcfPolicyVersion();
            boolean zContains = tCStringDecode.getDisclosedVendors().contains(Constants.CMP_PETAL_AD_ID);
            boolean zContains2 = tCStringDecode.getVendorConsent().contains(Constants.CMP_PETAL_AD_ID);
            boolean z4 = tCStringDecode.getPurposesConsent().contains(1) && tCStringDecode.getPurposesConsent().contains(2);
            boolean z5 = tCStringDecode.getPurposesConsent().contains(3) && tCStringDecode.getPurposesConsent().contains(4);
            hw.a("NetHandler", "tcf param: %s, %s, %s, %s, %s", Integer.valueOf(tcfPolicyVersion), Boolean.valueOf(zContains), Boolean.valueOf(zContains2), Boolean.valueOf(z4), Boolean.valueOf(z5));
            if (tcfPolicyVersion < 4) {
                hw.b("NetHandler", "cmp version not satisfy.");
                z = false;
            } else {
                z = true;
            }
            if (!zContains || !zContains2) {
                hw.b("NetHandler", "cmp not contain petal ad.");
                z = false;
            }
            if (z4) {
                z2 = z;
            } else {
                hw.b("NetHandler", "cmp user disagree petal ad.");
                z2 = false;
            }
            if (!z2) {
                a(!com.huawei.openalliance.ad.utils.dg.b(str), tcfPolicyVersion, zContains, zContains2, z4);
            }
            if (!z5 && z2) {
                this.r = true;
                f();
            }
            z3 = z2;
            hw.b("NetHandler", "end check tcf.");
            return z3;
        } catch (Throwable th) {
            hw.b("NetHandler", "check tcf err: %s", th.getClass().getSimpleName());
        }
    }

    private boolean a(Integer num, String str, Boolean bool, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (bool == null || !bool.booleanValue()) {
            return ((num != null && 1 == num.intValue()) || z || com.huawei.openalliance.ad.utils.d.p(this.d) == 1) ? false : true;
        }
        return false;
    }

    private boolean a(RequestOptions requestOptions) {
        String strAH = fp.b(this.d).aH();
        if (com.huawei.openalliance.ad.utils.dg.b(strAH)) {
            hw.b("NetHandler", "no dr3.");
            return true;
        }
        boolean zContains = !com.huawei.openalliance.ad.utils.dg.b(requestOptions.getAppCountry()) ? strAH.contains(requestOptions.getAppCountry()) : false;
        String strBQ = fp.b(this.d).bQ();
        if (!zContains && !com.huawei.openalliance.ad.utils.dg.b(strBQ)) {
            zContains = strAH.contains(strBQ);
        }
        CountryCodeBean countryCodeBean = new CountryCodeBean(this.d);
        String strA = countryCodeBean.a(this.d);
        String strB = countryCodeBean.b(this.d);
        hw.a("NetHandler", "dr3 is %s, sim is %s, locale is %s, app: %s, belong: %s", strAH, strA, strB, requestOptions.getAppCountry(), strBQ);
        return (zContains || strAH.contains(strA) || strAH.contains(strB)) ? false : true;
    }

    private boolean a(long j) {
        return j - this.e.cL() >= AiCoreSdkConstant.CHECK_SUPPORT_INTERVAL;
    }

    private void a(final boolean z, final FenceData fenceData) {
        com.huawei.openalliance.ad.utils.o.h(new Runnable() { // from class: com.huawei.openalliance.ad.fi.11
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(fi.this.d).a(z, fenceData);
            }
        });
    }

    private void a(final boolean z, final int i, final boolean z2, final boolean z3, final boolean z4) {
        com.huawei.openalliance.ad.utils.o.h(new Runnable() { // from class: com.huawei.openalliance.ad.fi.10
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(fi.this.d).a(fi.this.d.getPackageName(), z, i, z2, z3, z4);
            }
        });
    }

    private void a(final List<String> list, boolean z) {
        if (!z || com.huawei.openalliance.ad.utils.bm.a(list)) {
            return;
        }
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.fi.13
            @Override // java.lang.Runnable
            public void run() {
                dk.a(fi.this.d, "normal").a(list, true);
                dk.a(fi.this.d, "ar").a(list, true);
            }
        });
    }

    private void a(final List<String> list, final List<String> list2, final Map<String, String> map, final String str) {
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.fi.5
            @Override // java.lang.Runnable
            public void run() {
                if (com.huawei.openalliance.ad.utils.bm.a(list) || com.huawei.openalliance.ad.utils.bm.a(list2) || com.huawei.openalliance.ad.utils.br.a(map)) {
                    return;
                }
                new com.huawei.openalliance.ad.analysis.c(fi.this.d).a(fi.this.d.getPackageName(), list, list2, map, str);
            }
        });
    }

    private void a(String str, AdSlotParam adSlotParam, AdSlot30 adSlot30, int i, String str2) {
        if (i != 1) {
            Map<Integer, Integer> map = f18761a;
            if (!map.containsKey(Integer.valueOf(i)) || Integer.parseInt(str2) < map.get(Integer.valueOf(i)).intValue()) {
                return;
            }
            if ((3 == i || 9 == i) && !adSlotParam.A()) {
                return;
            }
            adSlot30.a(e.a());
            return;
        }
        adSlot30.a(e.a());
        List<CachedContent> listE = ex.b(this.d).e(str);
        if (!com.huawei.openalliance.ad.utils.d.c(this.d, str)) {
            hw.a("NetHandler", "assemble kit cached templates");
            Map<String, List<CachedContent>> mapF = df.f();
            if (!com.huawei.openalliance.ad.utils.br.a(mapF)) {
                listE = a(listE, mapF.get(str));
            }
        }
        if (com.huawei.openalliance.ad.utils.bm.a(listE)) {
            return;
        }
        List<String> listF = f(listE);
        a(listF, adSlotParam.j());
        if (com.huawei.openalliance.ad.utils.bm.a(adSlot30.u())) {
            adSlot30.c(listE);
            return;
        }
        for (CachedContent cachedContent : adSlot30.u()) {
            if (!listF.contains(cachedContent.a())) {
                listE.add(cachedContent);
            }
        }
        adSlot30.c(listE);
    }

    private void a(Integer num, Device device, String str, Boolean bool, boolean z) {
        int iQ = fp.b(this.d).Q();
        if (iQ == 0) {
            f(device);
            hw.a("NetHandler", "INSAPPS CLOSE");
            return;
        }
        if (iQ == 2) {
            hw.a("NetHandler", "INSAPPS OPEN");
            g(device);
        } else if (iQ == 1) {
            if (!a(num, str, bool, z) || "0".equals(device.A()) || "1".equals(fp.b(this.d).bZ())) {
                g(device);
                hw.a("NetHandler", "INSAPPS NON PERSONALIZED");
            } else {
                hw.a("NetHandler", "INSAPPS PERSONALIZED");
                f(device);
            }
        }
    }

    private void a(Integer num, Device device, String str) {
        if (this.e.cq() != 1 && num != null && 1 == num.intValue()) {
            device.c((String) null);
        } else {
            device.c(str);
            d(device);
        }
    }

    private void a(EventReportRsp eventReportRsp, EventReportRsp eventReportRsp2) {
        if (eventReportRsp != null) {
            if (eventReportRsp.responseCode == 0) {
                eventReportRsp2.responseCode = 0;
            }
            List<AdEventResultV2> listC = eventReportRsp2.c();
            if (listC == null) {
                listC = new ArrayList<>();
            }
            List<AdEventResult> listA = eventReportRsp2.a();
            if (listA == null) {
                listA = new ArrayList<>();
            }
            List<AdEventResult> listA2 = eventReportRsp.a();
            if (listA2 != null) {
                listA.addAll(listA2);
            }
            List<AdEventResultV2> listC2 = eventReportRsp.c();
            if (listC2 != null) {
                listC.addAll(listC2);
            }
            eventReportRsp2.a(listA);
            eventReportRsp2.b(listC);
        }
    }

    private void a(AppConfigReq appConfigReq) {
        com.huawei.openalliance.ad.utils.ak.a aVarA;
        if (com.huawei.openalliance.ad.utils.ak.b(this.d) && this.e.bf() && (aVarA = com.huawei.openalliance.ad.utils.ak.a(this.d)) != null) {
            appConfigReq.f(aVarA.a());
        }
    }

    private void a(AdContentReq adContentReq, boolean z, boolean z2) {
        if (z2) {
            List<String> listB = er.a(this.d).b();
            if (!com.huawei.openalliance.ad.utils.bm.a(listB)) {
                adContentReq.d(listB);
            }
        }
        if (z) {
            Map<String, String> mapE = adContentReq.E();
            Map<String, String> mapB = this.q.b();
            if (com.huawei.openalliance.ad.utils.br.a(mapB)) {
                return;
            }
            if (!com.huawei.openalliance.ad.utils.br.a(mapE)) {
                mapB.putAll(mapE);
            }
            adContentReq.a(mapB);
            h(adContentReq);
        }
    }

    private void a(AdContentReq adContentReq, String str) {
        List<TagCfgModel> listCF = this.e.cF();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        for (TagCfgModel tagCfgModel : listCF) {
            int i = Integer.parseInt(tagCfgModel.d());
            if (2 == i) {
                hw.a("NetHandler", "no need report , type : %s", tagCfgModel.a());
            } else if (1 == i) {
                a(adContentReq, tagCfgModel, arrayList, arrayList2, map);
                hw.a("NetHandler", "report anyway , type : %s", tagCfgModel.a());
            } else {
                String strP = adContentReq.i().p();
                if (com.huawei.openalliance.ad.utils.dg.b(strP) || Constants.NIL_UUID.equals(strP)) {
                    a(adContentReq, tagCfgModel, arrayList, arrayList2, map);
                    hw.a("NetHandler", "report nil oaid , type : %s", tagCfgModel.a());
                }
            }
        }
        a(arrayList, arrayList2, map, str);
    }

    private void a(AdContentReq adContentReq, TagCfgModel tagCfgModel, List<String> list, List<String> list2, Map<String, String> map) {
        String strA = tagCfgModel.a();
        hw.b("NetHandler", "do add tags: %s", strA);
        long j = Long.parseLong(tagCfgModel.b()) * 60000;
        long jD = this.q.d(strA);
        if (com.huawei.openalliance.ad.utils.as.c() - jD > j && !TagConstants.INTENT_SCENE_TYPE.equals(strA)) {
            hw.a("NetHandler", "tag %s expire, update time: %s, validTime is : %s", strA, Long.valueOf(jD), Long.valueOf(j));
            return;
        }
        Map<String, String> mapE = adContentReq.E();
        String strB = this.q.b(strA);
        if (com.huawei.openalliance.ad.utils.dg.b(strB)) {
            hw.a("NetHandler", "tagVal is empty, type is : %s", strA);
            return;
        }
        if (com.huawei.openalliance.ad.utils.br.a(mapE)) {
            mapE = new HashMap<>();
        }
        list.add(strA);
        list2.add(String.valueOf(this.q.c(strA)));
        map.put(strA, strB);
        if (TagConstants.INTENT_SCENE_TYPE.equals(strA)) {
            com.huawei.openalliance.ad.utils.bh.a(strB, mapE);
        } else {
            mapE.put(strA, strB);
        }
        adContentReq.a(mapE);
    }

    private void a(AdSlotParam adSlotParam, Integer num, boolean z, AdContentReq adContentReq) {
        Device deviceI = adContentReq.i();
        hw.b("NetHandler", "use ad slot oaid and limitedTracking");
        deviceI.h(com.huawei.openalliance.ad.utils.d.n(this.d));
        Boolean boolH = adSlotParam.h();
        if (boolH != null) {
            deviceI.d(boolH.booleanValue() ? "0" : "1");
        }
        a(num, deviceI, adSlotParam.g());
        e(deviceI);
        a(deviceI);
        LocationSwitches locationSwitchesU = adSlotParam.u();
        if (locationSwitchesU != null) {
            deviceI.a(Integer.valueOf(locationSwitchesU.b()));
            deviceI.b(Integer.valueOf(locationSwitchesU.a()));
        }
        a(num, deviceI, deviceI.p(), boolH, z);
        a(deviceI, adSlotParam);
    }

    private void a(AdSlotParam adSlotParam, AdContentReq adContentReq) {
        Location locationK = adSlotParam.k();
        if (locationK != null && locationK.m()) {
            locationK.a(System.currentTimeMillis());
            adContentReq.a(locationK);
        }
        String strA = eu.a().a(this.d);
        if (com.huawei.openalliance.ad.utils.dg.b(strA)) {
            hw.a("NetHandler", "get valid CA location is empty");
            return;
        }
        Location location = adContentReq.x() == null ? new Location() : adContentReq.x();
        location.a(strA);
        adContentReq.a(location);
        hw.a("NetHandler", "setLocation is %s", com.huawei.openalliance.ad.utils.bk.b(this.d, location));
    }

    private void a(AdSlotParam adSlotParam, AdSlot30 adSlot30, String str) {
        if (adSlotParam.l() == null || adSlotParam.l().getBiddingParam(str) == null) {
            return;
        }
        hw.a("NetHandler", "media request assembles biddingParam to AdSlot30");
        BiddingParam biddingParam = adSlotParam.l().getBiddingParam(str);
        if (biddingParam.getBidFloor() != null) {
            adSlot30.a(biddingParam.getBidFloor().floatValue());
        }
        if (biddingParam.getBidFloorCur() != null) {
            adSlot30.b(biddingParam.getBidFloorCur());
        }
        if (biddingParam.getBpkgName() != null && !biddingParam.getBpkgName().isEmpty()) {
            adSlot30.d(biddingParam.getBpkgName());
        }
        hw.a("NetHandler", "media request end assembles biddingParam to AdSlot30");
    }

    private void a(AdSlotParam adSlotParam) {
        if (h() || cc.a()) {
            adSlotParam.b((Integer) 0);
        }
    }

    private void a(Device device, AdSlotParam adSlotParam) {
        String str;
        int iB = b(device);
        if (iB == 0) {
            Pair<String, Integer> pairA = com.huawei.openalliance.ad.utils.am.a(this.d);
            str = (String) pairA.first;
            iB = ((Integer) pairA.second).intValue();
            if (!TextUtils.isEmpty(str)) {
                device.j(str);
                device.c((String) null);
                device.e(null);
                if (!this.e.ag()) {
                    device.a((String) null);
                    device.g(null);
                    device.b((String) null);
                    device.i(null);
                }
            }
        } else {
            str = "";
        }
        device.j(str);
        adSlotParam.e(iB);
    }

    private void a(Device device) {
        String strCI = this.e.cI();
        hw.a("NetHandler", "get the adid is : %s", com.huawei.openalliance.ad.utils.dg.i(strCI));
        device.k(strCI);
    }

    private void a(final int i, final String str, final int i2, final int i3, final String str2, final long j, final boolean z, final Response response, final AdTimeStatistics adTimeStatistics) {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.fi.3
            @Override // java.lang.Runnable
            public void run() {
                com.huawei.openalliance.ad.analysis.h hVar = new com.huawei.openalliance.ad.analysis.h(fi.this.d);
                String strB = com.huawei.openalliance.ad.utils.bk.b(adTimeStatistics);
                if (fi.this.a(i2)) {
                    hVar.a(str, i, i2, j, z, response, strB);
                } else {
                    hVar.a(str, i, i3, str2, i2, j, z, response);
                }
            }
        });
    }

    private void a(int i, AdSlotParam adSlotParam, List<AdSlot30> list, Map<String, Bundle> map) {
        List<String> listA = adSlotParam.a();
        Map<String, Integer> mapH = adSlotParam.H();
        if (listA == null || listA.size() <= 0) {
            return;
        }
        for (String str : listA) {
            AdSlot30 adSlot30A = a(i, adSlotParam, map, str);
            Integer num = mapH.get(str);
            if (num != null && 1 == num.intValue()) {
                adSlot30A.a(1);
            }
            list.add(adSlot30A);
        }
    }

    private void a(int i, AdSlotParam adSlotParam, String str, AdSlot30 adSlot30) {
        List<String> listA = ew.a(this.d).a(i, str);
        if (!com.huawei.openalliance.ad.utils.d.c(this.d, str)) {
            hw.a("NetHandler", "assemble Kit cached 2.0 contentIds");
            List<String> listE = df.e();
            if (!com.huawei.openalliance.ad.utils.bm.a(listE)) {
                if (listA == null) {
                    listA = new ArrayList<>();
                }
                for (String str2 : listE) {
                    if (!listA.contains(str2)) {
                        listA.add(str2);
                    }
                }
            }
        }
        a(listA, adSlotParam.j());
        if (com.huawei.openalliance.ad.utils.bm.a(listA)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new CachedContent(it.next(), 2, null));
        }
        adSlot30.c(arrayList);
    }

    private void a() {
        hw.b("NetHandler", "createThirdRequester lib switch: %d", Integer.valueOf(this.k));
        this.h = (ke) new com.huawei.openalliance.ad.net.http.e.a(this.d).c(this.k).b(new kb()).a(true).b(false).a().a(ke.class);
    }

    private Map<Integer, AdContentRsp> a(Map<Integer, AdContentRsp> map, AdContentRsp adContentRsp, List<String> list, String str, Response response, long j) {
        int iA = adContentRsp.a();
        if (200 != iA) {
            hw.b("NetHandler", "ad failed, retcode: %s, reason: %s, requestId: %s.", Integer.valueOf(iA), adContentRsp.b(), str);
        }
        List<Ad30> listC = adContentRsp.c();
        if (listC == null || listC.isEmpty()) {
            map.put(-1, adContentRsp);
            a(-1, str, iA, response.a(), response.d(), j, false, response, null);
            return map;
        }
        HashMap map2 = new HashMap();
        for (Ad30 ad30 : listC) {
            if (ad30 != null) {
                int iD = ad30.d();
                String strA = ad30.a();
                int iB = ad30.b();
                if (200 != iB) {
                    hw.b("NetHandler", "ad failed, retcode30: %s, slotId: %s.", Integer.valueOf(iB), list);
                }
                list.add(strA);
                if (!map2.containsKey(Integer.valueOf(iD))) {
                    map2.put(Integer.valueOf(iD), new ArrayList());
                }
                ((List) map2.get(Integer.valueOf(iD))).add(ad30);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            Integer num = (Integer) entry.getKey();
            num.intValue();
            List<Ad30> list2 = (List) entry.getValue();
            AdContentRsp adContentRspP = adContentRsp.p();
            adContentRspP.c(str);
            adContentRspP.a(list2);
            adContentRspP.f(1);
            map.put(num, adContentRspP);
        }
        return map;
    }

    private Map<String, String> a(ConsentConfigReq consentConfigReq) {
        kg kgVar = new kg(this.d);
        kgVar.a(consentConfigReq);
        return kgVar.a();
    }

    private Map<String, String> a(ReqBean reqBean) {
        kg kgVar = new kg(this.d);
        kgVar.a(this.e.bf());
        kgVar.a(reqBean);
        return kgVar.a();
    }

    private List<CachedContent> a(Map<String, List<String>> map) {
        if (com.huawei.openalliance.ad.utils.br.a(map)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry != null) {
                arrayList.add(new CachedContent(entry.getKey(), 3, entry.getValue()));
            }
        }
        return arrayList;
    }

    private List<CachedContent> a(List<CachedContent> list, List<CachedContent> list2) {
        if (!com.huawei.openalliance.ad.utils.bm.a(list2)) {
            Map<String, List<String>> mapE = e(list);
            Map<String, List<String>> mapE2 = e(list2);
            if (!com.huawei.openalliance.ad.utils.br.a(mapE2)) {
                for (Map.Entry<String, List<String>> entry : mapE2.entrySet()) {
                    if (entry != null) {
                        String key = entry.getKey();
                        List<String> value = entry.getValue();
                        if (mapE.containsKey(key)) {
                            List<String> arrayList = mapE.get(key);
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                            }
                            HashSet hashSet = new HashSet(arrayList);
                            hashSet.addAll(value);
                            value = new ArrayList<>(hashSet);
                        }
                        mapE.put(key, value);
                    }
                }
                return a(mapE);
            }
        }
        return list;
    }

    private List<ImpEX> a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : bundle.keySet()) {
                arrayList.add(new ImpEX(str, com.huawei.openalliance.ad.utils.dg.f(bundle.getString(str))));
            }
            return arrayList;
        } catch (Throwable th) {
            hw.c("NetHandler", "toImpEXs err: %s", th.getClass().getSimpleName());
            return arrayList;
        }
    }

    private Response<AdContentRsp> a(AdContentReq adContentReq, List<String> list, int i, Integer num) {
        if (c(list)) {
            eo.a(list, 1);
            return a(adContentReq, i);
        }
        if (!eo.a(this.d)) {
            return b(adContentReq);
        }
        eo.a(list, 0);
        return b(adContentReq, list, i, num);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x013c A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:7:0x001c, B:8:0x0020, B:12:0x002b, B:14:0x0036, B:16:0x0057, B:18:0x005f, B:24:0x008d, B:26:0x0093, B:28:0x00a6, B:29:0x00bc, B:33:0x00d0, B:35:0x00e7, B:56:0x0135, B:58:0x013c, B:59:0x0141, B:70:0x01aa, B:63:0x0172, B:65:0x0179, B:66:0x017e, B:40:0x00f9, B:41:0x0110), top: B:75:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0170  */
    /* JADX WARN: Code duplicated, block: B:65:0x0179 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:7:0x001c, B:8:0x0020, B:12:0x002b, B:14:0x0036, B:16:0x0057, B:18:0x005f, B:24:0x008d, B:26:0x0093, B:28:0x00a6, B:29:0x00bc, B:33:0x00d0, B:35:0x00e7, B:56:0x0135, B:58:0x013c, B:59:0x0141, B:70:0x01aa, B:63:0x0172, B:65:0x0179, B:66:0x017e, B:40:0x00f9, B:41:0x0110), top: B:75:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:68:0x019f A[PHI: r0 r1 r2
      0x019f: PHI (r0v12 java.lang.String) = (r0v8 java.lang.String), (r0v16 java.lang.String) binds: [B:61:0x0170, B:67:0x019d] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r1v10 ??) = (r1v24 ??), (r1v25 ??) binds: [B:61:0x0170, B:67:0x019d] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r2v6 long) = (r2v3 long), (r2v10 long) binds: [B:61:0x0170, B:67:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a5 A[PHI: r0 r1 r2
      0x01a5: PHI (r0v9 java.lang.String) = (r0v8 java.lang.String), (r0v16 java.lang.String) binds: [B:60:0x016e, B:67:0x019d] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r1v6 ??) = (r1v26 ??), (r1v27 ??) binds: [B:60:0x016e, B:67:0x019d] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r2v4 long) = (r2v3 long), (r2v10 long) binds: [B:60:0x016e, B:67:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.huawei.openalliance.ad.net.http.Response<com.huawei.openalliance.ad.beans.server.AdContentRsp>] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4, types: [long] */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v9, types: [com.huawei.openalliance.ad.net.http.Response<com.huawei.openalliance.ad.beans.server.AdContentRsp>] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.huawei.openalliance.ad.net.http.Response] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.huawei.openalliance.ad.net.http.Response] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r4v4, types: [long] */
    private Response<AdContentRsp> a(AdContentReq adContentReq, AdSlotParam adSlotParam, int i, String str, long j, AdTimeStatistics adTimeStatistics) {
        ?? response;
        String str2;
        long jC;
        ?? r1;
        String str3;
        ?? r0;
        long j2;
        boolean z;
        ?? r2;
        ?? response2;
        ?? D;
        int iM = adSlotParam.m();
        ?? r3 = 0;
        ?? r4 = 0;
        try {
            try {
                Response<AdContentRsp> responseA = a(i, iM > 0 ? Integer.valueOf(iM) : null, adContentReq);
                try {
                    boolean z2 = adContentReq.o() == 2;
                    long jC2 = com.huawei.openalliance.ad.utils.as.c();
                    long j3 = jC2 - j;
                    adTimeStatistics.e(jC2);
                    if (responseA != null) {
                        try {
                            long jC3 = adTimeStatistics.c();
                            D = adTimeStatistics.d();
                            responseA.c((long) (jC3 - D));
                            adTimeStatistics.f(responseA.p());
                            adTimeStatistics.g(responseA.q());
                            if (a(jC2) && cc.b(this.d)) {
                                hw.a("NetHandler", "update time to kit");
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(SpKeys.LAST_REQUEST_AD_TIME, jC2);
                                this.e.r(jC2);
                                na.a(this.d).a("updateRequestTime", jSONObject.toString(), null, String.class);
                            }
                        } catch (IllegalArgumentException e) {
                            e = e;
                            D = responseA;
                            r4 = D;
                            hw.c("NetHandler", "requestAdContent IllegalArgumentException");
                            response2 = r4;
                            if (r4 == 0) {
                                response2 = new Response();
                            }
                            response2.a(e);
                            str2 = "IllegalArgumentException:" + e.getMessage();
                            jC = com.huawei.openalliance.ad.utils.as.c() - j;
                            r2 = response2;
                            r1 = response2;
                            if (adContentReq.o() == 2) {
                                str3 = str2;
                                r0 = r2;
                                j2 = jC;
                                z = true;
                            } else {
                                str3 = str2;
                                r0 = r1;
                                j2 = jC;
                                z = false;
                            }
                            a(i, str, -1, -1, str3, j2, z, null, adTimeStatistics);
                            en.a(this.d).f();
                            return r0;
                        } catch (Exception e2) {
                            e = e2;
                            D = responseA;
                            r3 = D;
                            hw.c("NetHandler", "requestAdContent Exception");
                            response = r3;
                            if (r3 == 0) {
                                response = new Response();
                            }
                            response.a(e);
                            str2 = e.getClass().getSimpleName() + ":" + e.getMessage();
                            jC = com.huawei.openalliance.ad.utils.as.c() - j;
                            r1 = response;
                            if (adContentReq.o() == 2) {
                                r2 = response;
                                str3 = str2;
                                r0 = r2;
                                j2 = jC;
                                z = true;
                            } else {
                                str3 = str2;
                                r0 = r1;
                                j2 = jC;
                                z = false;
                            }
                            a(i, str, -1, -1, str3, j2, z, null, adTimeStatistics);
                            en.a(this.d).f();
                            return r0;
                        }
                    }
                    try {
                        if (responseA == null || responseA.b() == null) {
                            Response<AdContentRsp> response3 = responseA;
                            if (response3 != null) {
                                a(i, str, -1, response3.a(), response3.d(), j3, z2, response3, adTimeStatistics);
                                D = response3;
                            } else {
                                a(i, str, -1, -1, "unknown", j3, z2, null, adTimeStatistics);
                                D = response3;
                            }
                        } else {
                            AdContentRsp adContentRspB = responseA.b();
                            qv.a(this.d, adContentRspB);
                            int iA = adContentRspB.a();
                            if (200 != iA) {
                                hw.b("NetHandler", "ad failed, retcode: %s, reason: %s, requestId: %s.", Integer.valueOf(iA), adContentRspB.b(), str);
                            }
                            this.e.h(adContentRspB.g());
                            adContentRspB.responseCode = responseA.a() == 200 ? 0 : 1;
                            Response<AdContentRsp> response4 = responseA;
                            a(i, str, iA, responseA.a(), responseA.d(), j3, z2, response4, adTimeStatistics);
                            D = response4;
                        }
                        en.a(this.d).f();
                        return D;
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        r4 = D;
                        hw.c("NetHandler", "requestAdContent IllegalArgumentException");
                        response2 = r4;
                        if (r4 == 0) {
                            response2 = new Response();
                        }
                        response2.a(e);
                        str2 = "IllegalArgumentException:" + e.getMessage();
                        jC = com.huawei.openalliance.ad.utils.as.c() - j;
                        r2 = response2;
                        r1 = response2;
                        if (adContentReq.o() == 2) {
                            str3 = str2;
                            r0 = r2;
                            j2 = jC;
                            z = true;
                        } else {
                            str3 = str2;
                            r0 = r1;
                            j2 = jC;
                            z = false;
                        }
                        a(i, str, -1, -1, str3, j2, z, null, adTimeStatistics);
                        en.a(this.d).f();
                        return r0;
                    } catch (Exception e4) {
                        e = e4;
                        r3 = D;
                        hw.c("NetHandler", "requestAdContent Exception");
                        response = r3;
                        if (r3 == 0) {
                            response = new Response();
                        }
                        response.a(e);
                        str2 = e.getClass().getSimpleName() + ":" + e.getMessage();
                        jC = com.huawei.openalliance.ad.utils.as.c() - j;
                        r1 = response;
                        if (adContentReq.o() == 2) {
                            r2 = response;
                            str3 = str2;
                            r0 = r2;
                            j2 = jC;
                            z = true;
                        } else {
                            str3 = str2;
                            r0 = r1;
                            j2 = jC;
                            z = false;
                        }
                        a(i, str, -1, -1, str3, j2, z, null, adTimeStatistics);
                        en.a(this.d).f();
                        return r0;
                    }
                } catch (IllegalArgumentException e5) {
                    e = e5;
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Throwable th) {
                en.a(this.d).f();
                throw th;
            }
        } catch (IllegalArgumentException e7) {
            e = e7;
        } catch (Exception e8) {
            e = e8;
        }
    }

    private Response<AdContentRsp> a(final AdContentReq adContentReq, int i) {
        try {
            hw.b("NetHandler", "request ads from hms rec engine");
            long jC = com.huawei.openalliance.ad.utils.as.c();
            na naVarA = na.a(this.d);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MapKeyNames.REMOTE_REQ, com.huawei.openalliance.ad.utils.bk.b(adContentReq));
            jSONObject.put(MapKeyNames.ALLOWED_TRADE_MODES, com.huawei.openalliance.ad.utils.bk.b(Arrays.asList(com.huawei.openalliance.ad.utils.cq.a(this.d, String.valueOf(i)))));
            jSONObject.put(MapKeyNames.LOCAL_RECALL_MAX_COUNT, this.e.n());
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final Response<AdContentRsp> response = new Response<>();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            naVarA.a(RTCMethods.RECALL_AD_BY_REC_ENGINE, jSONObject.toString(), new RemoteCallResultCallback<String>() { // from class: com.huawei.openalliance.ad.fi.6
                @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                public void onRemoteCallResult(String str, CallResult<String> callResult) {
                    if (callResult != null) {
                        try {
                            if (callResult.getCode() == 200) {
                                hw.a("NetHandler", "recall ads from hms success");
                                String data = callResult.getData();
                                if (com.huawei.openalliance.ad.utils.dg.b(data)) {
                                    return;
                                }
                                JSONObject jSONObject2 = new JSONObject(data);
                                AdContentRsp adContentRsp = (AdContentRsp) com.huawei.openalliance.ad.utils.bk.b(jSONObject2.optString(MapKeyNames.AD_RSP_STR), AdContentRsp.class, new Class[0]);
                                Response response2 = (Response) com.huawei.openalliance.ad.utils.bk.b(jSONObject2.optString(MapKeyNames.RSP_STR), Response.class, new Class[0]);
                                if (adContentRsp != null && response2 != null) {
                                    response.a(response2);
                                    response.a(adContentRsp);
                                    response.e(response2.r());
                                    countDownLatch.countDown();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            hw.c("NetHandler", "parse ads from hms rec engine error: %s", th.getClass().getSimpleName());
                            return;
                        }
                    }
                    com.huawei.openalliance.ad.utils.o.b(new Runnable() { // from class: com.huawei.openalliance.ad.fi.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (atomicBoolean.get()) {
                                return;
                            }
                            Response responseB = fi.this.b(adContentReq);
                            if (responseB != null) {
                                synchronized (response) {
                                    response.a(responseB);
                                    response.a((AdContentRsp) responseB.b());
                                }
                            }
                            countDownLatch.countDown();
                        }
                    });
                }
            }, String.class);
            try {
                boolean zAwait = countDownLatch.await(2L, TimeUnit.SECONDS);
                hw.a("NetHandler", "latch result: %s", Boolean.valueOf(zAwait));
                if (!zAwait) {
                    hw.a("NetHandler", "request directly from the realtime again");
                    atomicBoolean.set(true);
                    Response<AdContentRsp> responseB = b(adContentReq);
                    if (responseB != null) {
                        synchronized (response) {
                            response.a(responseB);
                            response.a(responseB.b());
                        }
                    }
                }
                long jC2 = com.huawei.openalliance.ad.utils.as.c() - jC;
                hw.a("NetHandler", "recall ads from hms rec engine cost: %s", Long.valueOf(jC2));
                response.f(jC2);
                return response;
            } catch (Throwable th) {
                hw.c("NetHandler", "latch " + th.getClass().getSimpleName());
                return response;
            }
        } catch (Throwable th2) {
            hw.c("NetHandler", "request ads from hms rec engine error: %s", th2.getClass().getSimpleName());
            return null;
        }
    }

    private Response<AdContentRsp> a(int i, Integer num, AdContentReq adContentReq) {
        if (adContentReq == null) {
            return null;
        }
        hw.b("NetHandler", "requestAd, requestId: %s, reqPurpose: %s", adContentReq.r(), Integer.valueOf(adContentReq.o()));
        List<AdSlot30> listK = adContentReq.k();
        if (com.huawei.openalliance.ad.utils.bm.a(listK)) {
            hw.c("NetHandler", "slots is empty");
            return null;
        }
        List<String> listD = d(listK);
        if (com.huawei.openalliance.ad.utils.bm.a(listD)) {
            return null;
        }
        Integer numS = adContentReq.s();
        hw.a("NetHandler", "recallOrRequestAds getNonPersonalizedAd value %s", numS);
        return (numS != null && numS.intValue() == 0 && com.huawei.openalliance.ad.utils.cq.a(this.d, adContentReq.o(), listD)) ? a(adContentReq, listD, i, num) : b(adContentReq);
    }

    public static gf a(Context context) {
        return b(context);
    }

    private AdContentRsp a(int i, List<String> list, AdContentRsp adContentRsp) {
        if (c(list)) {
            return c(i, list, adContentRsp);
        }
        return eo.a(this.d) ? b(i, list, adContentRsp) : adContentRsp;
    }

    private App a(int i, AdSlotParam adSlotParam, String str, String str2, AdContentReq adContentReq) {
        App appI = adSlotParam.i();
        if (appI != null) {
            adContentReq.a(appI);
        }
        App appH = adContentReq.h();
        if (appH == null) {
            hw.c("NetHandler", "req.getApp__() is null and can't set lang or country");
            return appH;
        }
        if (!TextUtils.isEmpty(str)) {
            appH.d(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            appH.e(str2);
        }
        String strA = adSlotParam.a(this.d, i);
        if (com.huawei.openalliance.ad.utils.dg.b(appH.d())) {
            appH.c(strA);
        }
        LocationSwitches locationSwitchesU = adSlotParam.u();
        if (locationSwitchesU != null) {
            appH.b(Integer.valueOf(locationSwitchesU.c()));
        }
        RequestOptions requestOptionsL = adSlotParam.l();
        AppExt appExt = new AppExt();
        appExt.a(c(requestOptionsL));
        appH.a(appExt);
        appH.a(b(adSlotParam));
        return appH;
    }

    private AdSlot30 a(int i, AdSlotParam adSlotParam, Map<String, Bundle> map, String str) {
        AdSlot30 adSlot30 = new AdSlot30(str, adSlotParam.e(), adSlotParam.f(), i, adSlotParam.c());
        int iM = adSlotParam.m();
        if (iM > 0) {
            adSlot30.a(Integer.valueOf(iM));
        }
        int iN = adSlotParam.n();
        if (iN > 0) {
            adSlot30.d(Integer.valueOf(iN));
        }
        List<String> listV = adSlotParam.v();
        if (!com.huawei.openalliance.ad.utils.bm.a(listV)) {
            adSlot30.b(listV);
        }
        if (1 == i || 18 == i) {
            Integer numR = adSlotParam.r();
            if (numR != null) {
                adSlot30.f(numR);
            }
            Integer numQ = adSlotParam.q();
            if (numQ != null) {
                adSlot30.e(numQ);
            }
            int iB = adSlotParam.b();
            if (iB == 1 || iB == 0) {
                adSlot30.g(Integer.valueOf(iB));
            }
        }
        adSlot30.i(adSlotParam.x());
        adSlot30.j(adSlotParam.y());
        adSlot30.k(adSlotParam.z());
        adSlot30.b(adSlotParam.o());
        adSlot30.c(adSlotParam.p());
        if (!com.huawei.openalliance.ad.utils.br.a(map)) {
            adSlot30.a(a(map.get(str)));
        }
        adSlot30.h(adSlotParam.t());
        if (i == 1) {
            a(i, adSlotParam, str, adSlot30);
        }
        if (com.huawei.openalliance.ad.utils.bj.a(adSlotParam.C()) && 7 != i) {
            a(str, adSlotParam, adSlot30, i);
        } else if (!com.huawei.openalliance.ad.utils.dg.b(e.a())) {
            a(str, adSlotParam, adSlot30, i, e.a());
        }
        a(adSlotParam, adSlot30, str);
        return adSlot30;
    }

    private fi(Context context) {
        final Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.e = fp.b(context);
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.fi.1
            @Override // java.lang.Runnable
            public void run() {
                com.huawei.openalliance.ad.utils.cy.a(applicationContext);
            }
        });
        this.q = fv.a(context);
    }

    static {
        HashMap map = new HashMap();
        f18761a = map;
        map.put(3, Integer.valueOf(Constants.NATIVE_TEMPLATE_MIN_VER));
        map.put(9, Integer.valueOf(Constants.ICON_TEMPLATE_MIN_VER));
        map.put(7, Integer.valueOf(Constants.REWARD_TEMPLATE_MIN_VER));
        map.put(12, Integer.valueOf(Constants.INTERSTITIAL_TEMPLATE_MIN_VER));
    }
}
