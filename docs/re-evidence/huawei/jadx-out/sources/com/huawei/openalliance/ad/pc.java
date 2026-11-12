package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.appgallery.agd.api.AgdConstant;
import com.huawei.openalliance.ad.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.beans.inner.DownloadBlockInfo;
import com.huawei.openalliance.ad.beans.metadata.AdEventResult;
import com.huawei.openalliance.ad.beans.metadata.AdEventResultV2;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.ParamFromServer;
import com.huawei.openalliance.ad.beans.metadata.PostBackEvent;
import com.huawei.openalliance.ad.beans.server.EventReportRsp;
import com.huawei.openalliance.ad.constant.AnalyticsEventType;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.constant.InterstitialMethods;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.RTCMethods;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.EncryptionField;
import com.huawei.openalliance.ad.db.bean.EventRecord;
import com.huawei.openalliance.ad.db.bean.IntentDataRecord;
import com.huawei.openalliance.ad.download.DownloadTask;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.inter.data.AdAssistEventRecord;
import com.huawei.openalliance.ad.inter.data.FeedbackInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class pc implements rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private tf f19964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ContentRecord f19965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gk f19966c;
    private Context d;
    private jk e;
    private gf f;
    private gi g;
    private int h;
    private Long i;

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(int i) {
        return i == 2 || i == 1;
    }

    private boolean c(int i) {
        return i == 0 || i == 1 || i == 3 || i == 6;
    }

    @Override // com.huawei.openalliance.ad.rc
    public void u() {
        c(EventType.VASTPLAYCOMPLETE);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void t() {
        c(EventType.VASTPLAYSTART);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void s() {
        c(EventType.VASTTHIRDQUART);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void r() {
        c(EventType.VASTMIDPOINT);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void q() {
        c(EventType.VASTFIRSTQURAT);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void p() {
        final EventRecord eventRecordB = b(EventType.SERVE);
        if (b(eventRecordB, EventType.SERVE)) {
            return;
        }
        final ContentRecord contentRecord = this.f19965b;
        com.huawei.openalliance.ad.utils.o.h(new Runnable() { // from class: com.huawei.openalliance.ad.pc.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.huawei.openalliance.ad.utils.bm.a(qs.a(eventRecordB.j(), contentRecord, pc.this.d))) {
                    hw.a("EventProcessor", "serve monitor is empty, cancel report ad serve event.");
                    return;
                }
                int iJ = pa.j(pc.this.f19965b.X());
                pc pcVar = pc.this;
                String strA = pcVar.a(pcVar.f19965b, eventRecordB.j(), iJ);
                hw.b("EventProcessor", "onAdServe key: " + strA);
                if (pc.this.e.a(pc.this.f19965b.f(), strA)) {
                    hw.b("EventProcessor", "onAdServe second + time serve: don't report event");
                } else {
                    hw.b("EventProcessor", "onAdServe first time serve: report  event");
                    qo.a(pc.this.d, pc.this.f19964a, EventType.SERVE).a(EventType.SERVE.value(), eventRecordB, true, pc.this.f19965b);
                }
            }
        });
    }

    @Override // com.huawei.openalliance.ad.rc
    public void o() {
        EventRecord eventRecordB = b(EventType.ADLOADED);
        if (b(eventRecordB, EventType.ADLOADED)) {
            return;
        }
        eventRecordB.d((String) null);
        qo.a(this.d, this.f19964a, EventType.ADLOADED).b(EventType.ADLOADED.value(), eventRecordB, this.f19965b);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void n() {
        EventRecord eventRecordB = b(EventType.RESPONSE);
        if (b(eventRecordB, EventType.RESPONSE)) {
            return;
        }
        eventRecordB.d((String) null);
        c(eventRecordB);
        b(eventRecordB);
        qo.a(this.d, this.f19964a, EventType.RESPONSE).b(EventType.RESPONSE.value(), eventRecordB, this.f19965b);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void m() {
        qo.a(this.d, this.f19964a, EventType.SHOWEND).b(EventType.SHOWEND.value(), b(EventType.SHOWEND), this.f19965b);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void l() {
        qo.a(this.d, this.f19964a, EventType.FAVORITE).b(EventType.FAVORITE.value(), b(EventType.FAVORITE), this.f19965b);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void k() {
        qo.a(this.d, this.f19964a, EventType.SHARE).b(EventType.SHARE.value(), b(EventType.SHARE), this.f19965b);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void j() {
        qo.a(this.d, this.f19964a, EventType.REMOVE).b(EventType.REMOVE.value(), b(EventType.REMOVE), this.f19965b);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void i() {
        qo.a(this.d, this.f19964a, EventType.SWIPEUP).b(EventType.SWIPEUP.value(), b(EventType.SWIPEUP), this.f19965b);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void h() {
        qo.a(this.d, this.f19964a, EventType.WEBLOADFINISH).b(EventType.WEBLOADFINISH.value(), b(EventType.WEBLOADFINISH), this.f19965b);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void g() {
        qo.a(this.d, this.f19964a, EventType.WEBOPEN).b(EventType.WEBOPEN.value(), b(EventType.WEBOPEN), this.f19965b);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void f() {
        a(EventType.VIDEOPLAYRESUME, -111111L, -111111L, -111111, -111111, (String) null);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void e() {
        a(EventType.REPLAY, -111111L, -111111L, -111111, -111111, (String) null);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void d(long j, long j2, int i, int i2) {
        a(EventType.EASTEREGGEND, j, j2, i, i2, (String) null);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void d() {
        a(EventType.PLAYBTNSTART, -111111L, -111111L, -111111, -111111, (String) null);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void c(List<FeedbackInfo> list) {
        EventRecord eventRecordB = b(EventType.CLOSE);
        if (b(eventRecordB, EventType.CLOSE)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!com.huawei.openalliance.ad.utils.bm.a(list)) {
            for (FeedbackInfo feedbackInfo : list) {
                if (feedbackInfo != null && (1 == feedbackInfo.getType() || 3 == feedbackInfo.getType())) {
                    arrayList.add(feedbackInfo.getLabel());
                    arrayList2.add(String.valueOf(feedbackInfo.a()));
                }
            }
        }
        if (!com.huawei.openalliance.ad.utils.bm.a(arrayList)) {
            hw.a("EventProcessor", "onAdClose, selectedKeyWords: %s", arrayList.toString());
        }
        if (!com.huawei.openalliance.ad.utils.bm.a(arrayList2)) {
            hw.a("EventProcessor", "onAdClose, selectedKeyWordsType: %s", arrayList2.toString());
        }
        eventRecordB.e(0);
        eventRecordB.f(0);
        eventRecordB.a(arrayList);
        eventRecordB.b(arrayList2);
        qo.a(this.d, this.f19964a, EventType.CLOSE).a(EventType.CLOSE.value(), eventRecordB, false, this.f19965b);
        this.f19964a.d();
        d(eventRecordB);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void c(Integer num, Integer num2, String str, String str2, String str3) {
        a(EventType.APPINSTALLFAIL, num, num2, true, true, str, str2, str3);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void c(com.huawei.openalliance.ad.processor.eventbeans.a aVar) {
        a(EventType.INTERACTSHOW, aVar, (pb) null);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void c(long j, long j2, int i, int i2) {
        a(EventType.VIDEOPLAYEND, j, j2, i, i2, (String) null);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void c() {
        a(EventType.VIDEOPLAYSTART, -111111L, -111111L, -111111, -111111, (String) null);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void b(boolean z) {
        EventType eventType = z ? EventType.SOUNDCLICKOFF : EventType.SOUNDCLICKON;
        EventRecord eventRecordB = b(eventType);
        if (b(eventRecordB, eventType)) {
            return;
        }
        qp qpVarA = qo.a(this.d, this.f19964a, eventType);
        qpVarA.b(eventType.value(), eventRecordB, this.f19965b);
        qpVarA.a(eventRecordB, this.f19965b);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void b(List<FeedbackInfo> list) {
        EventRecord eventRecordB = b(EventType.POSITIVEFEEDBACK);
        if (b(eventRecordB, EventType.POSITIVEFEEDBACK)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!com.huawei.openalliance.ad.utils.bm.a(list)) {
            for (FeedbackInfo feedbackInfo : list) {
                if (feedbackInfo != null && feedbackInfo.getType() == 2) {
                    arrayList.add(feedbackInfo.getLabel());
                    arrayList2.add(String.valueOf(feedbackInfo.a()));
                }
            }
        }
        if (!com.huawei.openalliance.ad.utils.bm.a(arrayList)) {
            hw.a("EventProcessor", "onAdPositiveFeedback, selectedKeyWords: %s", arrayList.toString());
        }
        if (!com.huawei.openalliance.ad.utils.bm.a(arrayList2)) {
            hw.a("EventProcessor", "onAdPositiveFeedback, selectedKeyWordsType: %s", arrayList2.toString());
        }
        eventRecordB.e(0);
        eventRecordB.f(0);
        eventRecordB.a(arrayList);
        eventRecordB.b(arrayList2);
        qo.a(this.d, this.f19964a, EventType.POSITIVEFEEDBACK).a(EventType.POSITIVEFEEDBACK.value(), eventRecordB, false, this.f19965b);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void b(Integer num, String str, DownloadBlockInfo downloadBlockInfo, int i, String str2, String str3, String str4) {
        a(EventType.APPDOWNLOAD, num, str, true, false, null, downloadBlockInfo, Integer.valueOf(i), str2, str3, str4);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void b(Integer num, String str, int i, String str2, String str3, String str4) {
        a(EventType.APPDOWNLOADRESUME, num, str, false, true, null, null, Integer.valueOf(i), str2, str3, str4);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void b(Integer num, Integer num2, String str, String str2, String str3) {
        a(EventType.APPINSTALLSTART, num, num2, false, true, str, str2, str3);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void b(com.huawei.openalliance.ad.processor.eventbeans.a aVar) {
        a(EventType.EASTEREGGSHOW, aVar, (pb) null);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void b(final com.huawei.openalliance.ad.analysis.b bVar, final boolean z, final boolean z2) {
        final ContentRecord contentRecord = this.f19965b;
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.pc.16
            @Override // java.lang.Runnable
            public void run() {
                try {
                    EventRecord eventRecordA = pc.this.a(EventType.ANALYSIS, bVar);
                    if (pc.b(eventRecordA, EventType.ANALYSIS)) {
                        return;
                    }
                    qp qpVarA = qo.a(pc.this.d, pc.this.f19964a, EventType.ANALYSIS);
                    String str = eventRecordA.j() + "_" + bVar.aN();
                    if (z) {
                        qpVarA.a(str, eventRecordA, z2, contentRecord);
                    } else {
                        qpVarA.b(str, eventRecordA, z2, contentRecord);
                    }
                } catch (Throwable th) {
                    hw.d("EventProcessor", "onAnalysis.addEventToCache exception");
                    hw.a(5, th);
                }
            }
        });
    }

    @Override // com.huawei.openalliance.ad.rc
    public void b(long j, long j2, int i, int i2) {
        a(EventType.VIDEOPLAYPAUSE, j, j2, i, i2, (String) null);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void b(int i, int i2) {
        EventType eventType = EventType.SKIP;
        EventRecord eventRecordB = b(eventType);
        if (b(eventRecordB, eventType)) {
            return;
        }
        eventRecordB.e(i);
        eventRecordB.f(i2);
        ContentRecord contentRecord = this.f19965b;
        if (contentRecord == null || !contentRecord.ar()) {
            qo.a(this.d, this.f19964a, eventType).a(eventType.value(), eventRecordB, false, this.f19965b);
            this.f19964a.d();
        } else {
            hw.a("EventProcessor", "report exsplash close event");
            AdEventReport adEventReportD = d(this.f19965b);
            adEventReportD.b(i);
            adEventReportD.c(i2);
            na.a(this.d).a(MapKeyNames.REPORT_CLOSE_EVENT, com.huawei.openalliance.ad.utils.bk.b(adEventReportD), null, null);
        }
        d(eventRecordB);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void b() {
        a(true);
    }

    public void a(boolean z) {
        if (x()) {
            return;
        }
        EventRecord eventRecordB = b(EventType.SHOWSTART);
        if (b(eventRecordB, EventType.SHOWSTART)) {
            return;
        }
        qp qpVarA = qo.a(this.d, this.f19964a, EventType.SHOWSTART);
        if (z) {
            qpVarA.a(EventType.SHOWSTART.value(), eventRecordB, false, this.f19965b);
        } else {
            qpVarA.b(EventType.SHOWSTART.value(), eventRecordB, false, this.f19965b);
        }
        w();
    }

    public void a(final List<AdAssistEventRecord> list) {
        hw.b("EventProcessor", "events is " + com.huawei.openalliance.ad.utils.bk.b(list));
        final ContentRecord contentRecord = this.f19965b;
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.pc.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    qp qpVarA = qo.a(pc.this.d, pc.this.f19964a, EventType.ASSISTCLICK.value());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        EventRecord eventRecordA = pc.this.a((AdAssistEventRecord) it.next());
                        if (pc.b(eventRecordA, EventType.ASSISTCLICK)) {
                            hw.c("EventProcessor", "eventRecord is empty");
                            return;
                        }
                        qpVarA.a(EventType.ASSISTCLICK.value(), eventRecordA, false, contentRecord);
                    }
                } catch (Throwable th) {
                    hw.d("EventProcessor", "onAnalysis.addEventToCache exception");
                    hw.a(5, th);
                }
            }
        });
    }

    public void a(String str, final List<com.huawei.openalliance.ad.analysis.b> list, final rk rkVar) {
        com.huawei.openalliance.ad.utils.o.b(new Runnable() { // from class: com.huawei.openalliance.ad.pc.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        EventRecord eventRecordA = pc.this.a(EventType.ANALYSIS, (com.huawei.openalliance.ad.analysis.b) it.next());
                        if (pc.b(eventRecordA, EventType.ANALYSIS)) {
                            return;
                        } else {
                            arrayList.add(eventRecordA);
                        }
                    }
                    EventReportRsp eventReportRspA = pc.this.f.a(pn.a(arrayList, pc.this.d));
                    if (pc.c(eventReportRspA) && pc.this.b(eventReportRspA)) {
                        rkVar.a();
                    }
                } catch (Throwable th) {
                    hw.d("EventProcessor", "onRealTimeAnalysis exception");
                    hw.a(5, th);
                }
            }
        });
    }

    public void a(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            hw.c("EventProcessor", "param is null");
            return;
        }
        EventRecord eventRecordE = e(str);
        if (eventRecordE == null) {
            return;
        }
        eventRecordE.e(str2);
        qp qpVarA = qo.a(this.d, this.f19964a, str);
        if (z) {
            qpVarA.a(str, eventRecordE, this.f19965b);
        } else {
            qpVarA.b(str, eventRecordE, this.f19965b);
        }
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(String str, String str2, String str3) {
        EventRecord eventRecordB = b(EventType.ADREWARDED);
        if (b(eventRecordB, EventType.ADREWARDED)) {
            return;
        }
        eventRecordB.u(str);
        eventRecordB.v(str2);
        qo.a(this.d, this.f19964a, EventType.ADREWARDED).a(EventType.ADREWARDED.value(), eventRecordB, false, this.f19965b);
        f(str3);
    }

    public void a(String str) {
        if (x()) {
            return;
        }
        EventRecord eventRecordB = b(EventType.SHOWSTART);
        if (b(eventRecordB, EventType.SHOWSTART)) {
            return;
        }
        eventRecordB.u(str);
        qo.a(this.d, this.f19964a, EventType.SHOWSTART).a(EventType.SHOWSTART.value(), eventRecordB, false, this.f19965b);
        w();
    }

    public void a(Long l) {
        this.i = l;
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(Integer num, String str, DownloadBlockInfo downloadBlockInfo, int i, String str2, String str3, String str4) {
        a(EventType.APPDOWNLOADCANCEL, num, str, false, true, null, downloadBlockInfo, Integer.valueOf(i), str2, str3, str4);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(Integer num, String str, int i, String str2, String str3, String str4) {
        a(EventType.APPDOWNLOADSTART, num, str, true, true, null, null, Integer.valueOf(i), str2, str3, str4);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(Integer num, String str, int i, DownloadBlockInfo downloadBlockInfo, int i2, String str2, String str3, String str4) {
        a(EventType.APPDOWNLOADFAIL, num, str, false, true, Integer.valueOf(i), downloadBlockInfo, Integer.valueOf(i2), str2, str3, str4);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(Integer num, Integer num2, String str, String str2, String str3) {
        a(EventType.APPINSTALL, num, num2, true, false, str, str2, str3);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(Integer num) {
        a(EventType.APPOPEN, num, true, true, (Integer) null, (DownloadBlockInfo) null);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(com.huawei.openalliance.ad.processor.eventbeans.b bVar) {
        hw.a("EventProcessor", "onAdClick()");
        if (bVar == null) {
            return;
        }
        if (j(bVar)) {
            k(bVar);
        } else {
            h(bVar);
        }
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(com.huawei.openalliance.ad.processor.eventbeans.a aVar) {
        if (x()) {
            return;
        }
        a(d(aVar) ? EventType.SUPPLEMENTIMP : EventType.SHOW, aVar, (pb) null);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(MaterialClickInfo materialClickInfo, boolean z) {
        if (x() || materialClickInfo == null) {
            hw.d("EventProcessor", "onClickLandingpage has been intercepted");
            return;
        }
        EventRecord eventRecordB = b(EventType.CLICKLANDINGPAGE);
        if (b(eventRecordB, EventType.CLICKLANDINGPAGE)) {
            hw.d("EventProcessor", "onClickLandingpage create eventRecord failed");
            return;
        }
        a(materialClickInfo, eventRecordB);
        qp qpVarA = qo.a(this.d, this.f19964a, EventType.CLICKLANDINGPAGE);
        if (z) {
            qpVarA.a(EventType.CLICKLANDINGPAGE.value(), eventRecordB, false, this.f19965b);
        } else {
            qpVarA.b(EventType.CLICKLANDINGPAGE.value(), eventRecordB, false, this.f19965b);
        }
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(AppDownloadTask appDownloadTask) {
        a(EventType.APPDOWNLOADPAUSE, appDownloadTask, false, true);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(final EventRecord eventRecord, final boolean z, final boolean z2) {
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.pc.8
            @Override // java.lang.Runnable
            public void run() {
                String str;
                try {
                    EventRecord eventRecord2 = eventRecord;
                    if (eventRecord2 == null) {
                        str = "eventRecord is null";
                    } else {
                        String strJ = eventRecord2.j();
                        if (pc.this.A()) {
                            qp qpVarA = qo.a(pc.this.d, pc.this.f19964a, strJ);
                            if (z) {
                                qpVarA.a(strJ, eventRecord, z2, pc.this.f19965b);
                                return;
                            } else {
                                qpVarA.b(strJ, eventRecord, z2, pc.this.f19965b);
                                return;
                            }
                        }
                        str = "enableUserInfo is closed";
                    }
                    hw.b("EventProcessor", str);
                } catch (Throwable unused) {
                    hw.d("EventProcessor", "onCommonReport exception");
                }
            }
        });
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(ContentRecord contentRecord) {
        if (contentRecord != null) {
            this.f19965b = contentRecord;
        }
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(EventType eventType, Integer num, Integer num2, boolean z) {
        if (eventType == null) {
            return;
        }
        EventRecord eventRecordB = b(eventType);
        if (b(eventRecordB, eventType)) {
            return;
        }
        if (num != null) {
            eventRecordB.i(num.toString());
        }
        if (num2 != null) {
            eventRecordB.j(num2.toString());
        }
        qp qpVarA = qo.a(this.d, this.f19964a, eventType);
        if (EventType.INTENTSUCCESS != eventType) {
            qpVarA.b(eventType.value(), eventRecordB, this.f19965b);
            return;
        }
        a(EventType.INTENTSUCCESS, eventRecordB);
        String strValue = eventType.value();
        if (z) {
            qpVarA.a(strValue, eventRecordB, false, this.f19965b);
        } else {
            qpVarA.b(strValue, eventRecordB, false, this.f19965b);
        }
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(EventType eventType, Integer num, Integer num2) {
        a(eventType, num, num2, true);
    }

    public void a(final com.huawei.openalliance.ad.analysis.b bVar, final boolean z, final boolean z2) {
        final ContentRecord contentRecord = this.f19965b;
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.pc.15
            @Override // java.lang.Runnable
            public void run() {
                try {
                    EventRecord eventRecordA = pc.this.a(EventType.ANALYSIS, bVar);
                    if (pc.b(eventRecordA, EventType.ANALYSIS)) {
                        return;
                    }
                    qp qpVarA = qo.a(pc.this.d, pc.this.f19964a, EventType.ANALYSIS);
                    qpVarA.c(eventRecordA.j() + "_" + bVar.aN(), eventRecordA, z2, contentRecord);
                    if (z) {
                        qpVarA.e();
                    }
                } catch (Throwable th) {
                    hw.d("EventProcessor", "onThirdPartException onAnalysis.addEventToCache exception");
                    hw.a(5, th);
                }
            }
        });
    }

    public void a(final com.huawei.openalliance.ad.analysis.b bVar) {
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.pc.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    EventRecord eventRecordA = pc.this.a(EventType.ANALYSIS, bVar);
                    if (pc.b(eventRecordA, EventType.ANALYSIS)) {
                        return;
                    }
                    qo.a(pc.this.d, pc.this.f19964a, EventType.ANALYSIS).a(eventRecordA.j() + "_" + bVar.aN(), eventRecordA);
                } catch (Throwable th) {
                    hw.d("EventProcessor", "onAnalysis.onAppDataCollectionAnalysis exception");
                    hw.a(5, th);
                }
            }
        });
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(Context context, ContentRecord contentRecord) {
        a(EventType.LINKEDCONTINUEPLAY, -111111L, -111111L, -111111, -111111, (String) null);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(long j, long j2, int i, int i2, String str) {
        a(EventType.INTERACTEND, j, j2, i, i2, str);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(long j, long j2, int i, int i2) {
        a(EventType.PLAYBTNPAUSE, j, j2, i, i2, (String) null);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(long j, int i, pb pbVar) {
        if (x()) {
            return;
        }
        com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229a = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a();
        c0229a.a(Long.valueOf(j)).a(Integer.valueOf(i));
        a(EventType.PHYIMP, c0229a.a(), pbVar);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(long j, int i) {
        if (x()) {
            return;
        }
        com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229a = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a();
        c0229a.a(Long.valueOf(j)).a(Integer.valueOf(i));
        a(EventType.PHYIMP, c0229a.a(), (pb) null);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(long j) {
        ContentRecord contentRecord = this.f19965b;
        if (contentRecord != null) {
            contentRecord.j(j);
        }
        d(EventType.VIDEOTIME);
        hw.b("EventProcessor", " reportVideoPlayTime, event： %s , videoTime %s", EventType.VIDEOTIME.value(), Long.valueOf(j));
    }

    public void a(int i, String str) {
        EventRecord eventRecordB = b(EventType.ADPRECHECK);
        if (b(eventRecordB, EventType.ADPRECHECK)) {
            return;
        }
        if (hw.a()) {
            hw.a("EventProcessor", "onPreCheckResult result: %d contentid: %s", Integer.valueOf(i), this.f19965b.o());
        }
        if (!TextUtils.isEmpty(str)) {
            eventRecordB.o(str);
        }
        eventRecordB.m(String.valueOf(i));
        qo.a(this.d, this.f19964a, EventType.ADPRECHECK).a(EventType.ADPRECHECK.value(), eventRecordB, this.f19965b);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(int i, long j) {
        EventRecord eventRecordB = b(EventType.WEBCLOSE);
        if (b(eventRecordB, EventType.WEBCLOSE)) {
            return;
        }
        eventRecordB.g(i);
        eventRecordB.a(j);
        qo.a(this.d, this.f19964a, EventType.WEBCLOSE).a(EventType.WEBCLOSE.value(), eventRecordB, this.f19965b);
        long j2 = j / 1000;
        if (j2 <= 0) {
            hw.a("EventProcessor", "duration: %s", Long.valueOf(j));
            return;
        }
        List<String> listA = com.huawei.openalliance.ad.utils.f.a(this.f19965b);
        if (listA.isEmpty()) {
            return;
        }
        IntentDataRecord intentDataRecordD = d("landingPageView");
        intentDataRecordD.a(listA);
        intentDataRecordD.b(j2);
        ff.a(this.d).a(intentDataRecordD);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(int i, int i2, List<String> list) {
        a(i, i2, list, EventType.CLOSE);
    }

    @Override // com.huawei.openalliance.ad.rc
    public void a(int i, int i2) {
        a(i, i2, (List<String>) null, EventType.EASTEREGGCLOSE);
    }

    public void a(int i) {
        this.h = i;
    }

    @Override // com.huawei.openalliance.ad.rc
    public ContentRecord a() {
        return this.f19965b;
    }

    private int z() {
        int iA = this.g.a();
        int iB = this.g.b();
        if (iA < 0 || iB <= 0 || iA >= iB) {
            iA = 0;
            iB = 2000;
        }
        int iA2 = com.huawei.openalliance.ad.utils.cp.a(iB, iA);
        hw.b("EventProcessor", "clk millis: %s", Integer.valueOf(iA2));
        return iA2;
    }

    private boolean y() {
        ContentRecord contentRecord = this.f19965b;
        if (contentRecord != null) {
            return 3 == contentRecord.aQ() || 99 == this.f19965b.F();
        }
        return false;
    }

    private boolean x() {
        ContentRecord contentRecord = this.f19965b;
        if (contentRecord == null) {
            return false;
        }
        boolean zA = jv.a(contentRecord.o());
        hw.a("EventProcessor", "sdkMonitor is %s, cr sdkMonitor is %s, isDoNothing is %s", Integer.valueOf(this.h), Integer.valueOf(this.f19965b.b()), Boolean.valueOf(zA));
        return (this.h == this.f19965b.b() || !jv.a(this.f19965b.b()) || zA) ? false : true;
    }

    private void w() {
        pu puVar = new pu(this.d);
        puVar.a(this.f19965b);
        puVar.a();
        puVar.b();
    }

    private boolean v() {
        ContentRecord contentRecord = this.f19965b;
        return com.huawei.openalliance.ad.utils.c.a(contentRecord == null ? null : contentRecord.bc());
    }

    private void k(final com.huawei.openalliance.ad.processor.eventbeans.b bVar) {
        com.huawei.openalliance.ad.utils.bu.a(new Runnable() { // from class: com.huawei.openalliance.ad.pc.12
            @Override // java.lang.Runnable
            public void run() {
                pc.this.h(bVar);
            }
        }, z());
    }

    private boolean j(com.huawei.openalliance.ad.processor.eventbeans.b bVar) {
        if (v() && bVar != null && bVar.c()) {
            Integer numG = bVar.g();
            if (numG == null) {
                return true;
            }
            if (numG.intValue() != 12 && numG.intValue() != 13) {
                hw.a("EventProcessor", "is need delay");
                return true;
            }
        }
        return false;
    }

    private void i(com.huawei.openalliance.ad.processor.eventbeans.b bVar) {
        Integer numG = bVar.h().g();
        if (numG == null) {
            return;
        }
        hw.a("EventProcessor", "adaptOldVersionSld orgSld is %s", numG);
        if (numG.intValue() == 3 && e(bVar) && !com.huawei.openalliance.ad.utils.as.i() && !b(bVar.g())) {
            bVar.h().e(5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h(String str) {
        return cc.b(this.d) && 1 == fo.a(this.d).b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(com.huawei.openalliance.ad.processor.eventbeans.b bVar) {
        if (this.f19965b == null) {
            return;
        }
        EventType eventTypeM = bVar.m();
        EventRecord eventRecordB = b(eventTypeM);
        if (b(eventRecordB, eventTypeM)) {
            return;
        }
        if (bVar.h() != null) {
            i(bVar);
            a(bVar.h());
            a(bVar.h(), eventRecordB);
        }
        eventRecordB.u(bVar.i());
        eventRecordB.A(bVar.l());
        if (b(bVar)) {
            a(pa.j(this.f19965b.X()), eventRecordB, bVar);
        } else {
            hw.a("EventProcessor", "is not a valid click");
            g(bVar);
        }
    }

    private void g(String str) {
        ContentRecord contentRecord = this.f19965b;
        if (contentRecord != null) {
            int iAZ = contentRecord.aZ();
            hw.a("EventProcessor", "onAdRecallReport, eventType:%s, recallSource:%s", str, Integer.valueOf(iAZ));
            if (iAZ == 1) {
                new com.huawei.openalliance.ad.analysis.c(this.d).b(this.f19965b, str);
            }
        }
    }

    private void g(com.huawei.openalliance.ad.processor.eventbeans.b bVar) {
        new com.huawei.openalliance.ad.analysis.c(this.d).a(bVar, this.f19965b);
    }

    private boolean f(com.huawei.openalliance.ad.processor.eventbeans.b bVar) {
        return !com.huawei.openalliance.ad.utils.dg.b(bVar.a());
    }

    private void f(final String str) {
        com.huawei.openalliance.ad.utils.o.h(new Runnable() { // from class: com.huawei.openalliance.ad.pc.4
            @Override // java.lang.Runnable
            public void run() {
                if (pc.this.f19965b == null) {
                    hw.d("EventProcessor", "contentRecord is null, can't report HA show event");
                } else {
                    com.huawei.openalliance.ad.utils.j.a(pc.this.d, pc.this.d.getPackageName(), AnalyticsEventType.AD_REWARD, pc.this.f19965b.n(), str);
                }
            }
        });
    }

    private boolean e(com.huawei.openalliance.ad.processor.eventbeans.b bVar) {
        return y() && !f(bVar);
    }

    private EventRecord e(String str) {
        if (this.f19965b == null || !A()) {
            hw.d("EventProcessor", "fail to create %s event record", str);
            return null;
        }
        EventRecord eventRecord = new EventRecord();
        eventRecord.c(str);
        eventRecord.d(this.f19964a.a());
        eventRecord.a(this.f19965b.H());
        eventRecord.d(com.huawei.openalliance.ad.utils.as.c());
        Long l = this.i;
        if (l != null && l.longValue() != 0) {
            eventRecord.d(this.i.longValue());
        }
        eventRecord.d(this.f19965b.l());
        eventRecord.a(this.f19965b.bw());
        eventRecord.i(this.f19965b.ao());
        eventRecord.y(this.f19965b.ai());
        eventRecord.x(this.f19965b.o());
        eventRecord.f(this.f19965b.aM());
        eventRecord.n(this.f19965b.aZ());
        String strBi = this.f19965b.bi();
        if (TextUtils.isEmpty(strBi)) {
            strBi = this.d.getPackageName();
        }
        eventRecord.H(strBi);
        if (EventType.SHOW.value().equals(str) || EventType.SUPPLEMENTIMP.value().equals(str)) {
            eventRecord.w(this.f19965b.aq());
        }
        if (EventType.VIDEOTIME.value().equals(str)) {
            eventRecord.g(this.f19965b.bh());
        }
        if (hw.a()) {
            hw.a("EventProcessor", "create event, type is : %s, rt : %d", str, Integer.valueOf(this.f19965b.ao()));
        }
        return eventRecord;
    }

    private PostBackEvent e(EventRecord eventRecord) {
        if (eventRecord == null) {
            return null;
        }
        PostBackEvent postBackEvent = new PostBackEvent();
        postBackEvent.a(eventRecord.am());
        postBackEvent.b(eventRecord.m());
        ContentRecord contentRecord = this.f19965b;
        postBackEvent.b(contentRecord != null ? contentRecord.n() : "");
        postBackEvent.e(eventRecord.j());
        postBackEvent.c(eventRecord.R());
        postBackEvent.d(eventRecord.l());
        postBackEvent.a(eventRecord.h());
        postBackEvent.a(eventRecord.b());
        postBackEvent.b(eventRecord.k());
        postBackEvent.f(eventRecord.S());
        return postBackEvent;
    }

    private boolean d(com.huawei.openalliance.ad.processor.eventbeans.b bVar) {
        if (!fo.a(this.d).c(this.f19965b.n())) {
            hw.a("EventProcessor", "notNeedCheckClick");
            return true;
        }
        String strA = com.huawei.openalliance.ad.utils.aa.a(this.d).a();
        if ((!"0".equals(strA) && !"1".equals(strA)) || this.f19965b.f() == 1) {
            return true;
        }
        if (e(bVar) && !com.huawei.openalliance.ad.utils.as.h() && !b(bVar.g())) {
            hw.a("EventProcessor", "It is a template ad & UiEngineVersion is old");
            return true;
        }
        if (!f(bVar) || j.i(bVar.a())) {
            return false;
        }
        hw.a("EventProcessor", "It is a js ad & jsVersion is old %s", bVar.a());
        return true;
    }

    private boolean d(com.huawei.openalliance.ad.processor.eventbeans.a aVar) {
        if (!v() || aVar == null || !aVar.b() || aVar.l()) {
            return false;
        }
        hw.a("EventProcessor", "isSupplementImp(), adShowInfo.impSource= %s", aVar.e());
        return (com.huawei.openalliance.ad.utils.c.a(aVar.e()) || com.huawei.openalliance.ad.utils.c.b(aVar.e())) ? false : true;
    }

    private void d(EventRecord eventRecord) {
        final PostBackEvent postBackEventE = e(eventRecord);
        if (postBackEventE == null || com.huawei.openalliance.ad.utils.ab.j(this.d)) {
            return;
        }
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.pc.6
            @Override // java.lang.Runnable
            public void run() {
                String strB = postBackEventE.b();
                boolean zA = eo.a(strB);
                boolean zH = pc.this.h(strB);
                if (zA && zH) {
                    pc.this.b(postBackEventE);
                } else if (!zA && !zH) {
                    pc.this.a(postBackEventE);
                } else {
                    pc.this.b(postBackEventE);
                    pc.this.a(postBackEventE);
                }
            }
        });
    }

    private void d(EventType eventType) {
        EventRecord eventRecordB = b(eventType);
        if (eventRecordB == null) {
            return;
        }
        qo.a(this.d, this.f19964a, eventType).a(eventRecordB, this.f19965b);
    }

    private IntentDataRecord d(String str) {
        IntentDataRecord intentDataRecord = new IntentDataRecord();
        intentDataRecord.a(str);
        intentDataRecord.a(com.huawei.openalliance.ad.utils.as.c());
        intentDataRecord.a(2);
        return intentDataRecord;
    }

    private AdEventReport d(ContentRecord contentRecord) {
        AdEventReport adEventReport = new AdEventReport();
        if (contentRecord != null) {
            adEventReport.a(contentRecord.f());
            adEventReport.a(contentRecord.o());
            adEventReport.b(contentRecord.l());
            adEventReport.c(contentRecord.ai());
            adEventReport.e(contentRecord.aq());
        }
        return adEventReport;
    }

    private boolean c(com.huawei.openalliance.ad.processor.eventbeans.b bVar) {
        String str;
        if (bVar.m() == null) {
            return false;
        }
        if (bVar.m().getCategory() != 2 && !EventType.REPEATEDCLICK.value().equals(bVar.m().value())) {
            return true;
        }
        int[] iArrAq = fp.b(this.d).aq();
        bVar.a(iArrAq[0] + Constants.LINK + iArrAq[1]);
        MaterialClickInfo materialClickInfoH = bVar.h();
        if (materialClickInfoH == null) {
            hw.a("EventProcessor", "clickInfo is null");
            return false;
        }
        if (materialClickInfoH.g() != null && materialClickInfoH.g().intValue() != 0) {
            str = "sld is not click";
        } else {
            if (materialClickInfoH.m() == null || materialClickInfoH.m().intValue() != 1) {
                if (materialClickInfoH.l() != null && materialClickInfoH.k() != null) {
                    long jLongValue = materialClickInfoH.k().longValue() - materialClickInfoH.l().longValue();
                    if (jLongValue >= iArrAq[0] && jLongValue <= iArrAq[1]) {
                        return true;
                    }
                }
                return false;
            }
            str = "marked";
        }
        hw.a("EventProcessor", str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(EventReportRsp eventReportRsp) {
        return eventReportRsp != null && eventReportRsp.responseCode == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final String str) {
        com.huawei.openalliance.ad.utils.o.h(new Runnable() { // from class: com.huawei.openalliance.ad.pc.13
            @Override // java.lang.Runnable
            public void run() {
                if (pc.this.f19965b == null) {
                    hw.d("EventProcessor", "contentRecord is null, can't report HA show event");
                    return;
                }
                String packageName = pc.this.d.getPackageName();
                if (Constants.REWARD_ACTIVITY_NAME.equals(str) || Constants.INTERSTITIAL_ACTIVITY_NAME.equals(str)) {
                    com.huawei.openalliance.ad.utils.j.a(pc.this.d, packageName, AnalyticsEventType.AD_CLICK, pc.this.f19965b.n(), "");
                } else {
                    com.huawei.openalliance.ad.utils.j.a(pc.this.d, packageName, AnalyticsEventType.AD_CLICK, pc.this.f19965b.n(), str);
                }
            }
        });
    }

    private void c(MaterialClickInfo materialClickInfo) {
        Integer numB = materialClickInfo.b();
        Integer numValueOf = Integer.valueOf(Constants.COORDINATE_FAIL_DEF);
        if (numB == null || materialClickInfo.b().intValue() == -111111) {
            materialClickInfo.a(numValueOf);
        }
        if (materialClickInfo.c() == null || materialClickInfo.c().intValue() == -111111) {
            materialClickInfo.b(numValueOf);
        }
        if (materialClickInfo.h() == null || materialClickInfo.h().intValue() == -111111) {
            materialClickInfo.f(numValueOf);
        }
        if (materialClickInfo.i() == null || materialClickInfo.i().intValue() == -111111) {
            materialClickInfo.g(numValueOf);
        }
    }

    private void c(EventRecord eventRecord) {
        ContentRecord contentRecord = this.f19965b;
        if (contentRecord != null) {
            eventRecord.q(contentRecord.aA());
        }
    }

    private void c(EventType eventType) {
        ContentRecord contentRecord = this.f19965b;
        if (contentRecord == null || eventType == null) {
            return;
        }
        String strA = a(this.f19965b, eventType.value(), pa.j(contentRecord.X()));
        hw.b("EventProcessor", "vastMonitor, key: %s", strA);
        if (!this.e.a(this.f19965b.f(), strA)) {
            d(eventType);
        } else if (hw.a()) {
            hw.a("EventProcessor", "event %s has reported", eventType.value());
        }
    }

    private static String c(Integer num) {
        if (num == null || com.huawei.openalliance.ad.utils.dg.b(String.valueOf(num))) {
            return AgdConstant.INSTALL_TYPE_DEFAULT;
        }
        if (String.valueOf(num).length() == 1) {
            return "000" + num;
        }
        if (String.valueOf(num).length() == 2) {
            return "00" + num;
        }
        if (String.valueOf(num).length() == 3) {
            return "0" + num;
        }
        int length = String.valueOf(num).length();
        String strValueOf = String.valueOf(num);
        return length == 4 ? strValueOf : strValueOf.substring(strValueOf.length() - 4, strValueOf.length() - 1);
    }

    private String c(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return "";
        }
        String strC = (contentRecord.H() == null || TextUtils.isEmpty(contentRecord.H().a())) ? contentRecord.c(this.d) : contentRecord.H().a();
        return !TextUtils.isEmpty(strC) ? com.huawei.openalliance.ad.utils.db.a(strC) : contentRecord.ai();
    }

    private boolean b(Integer num) {
        return num != null && num.intValue() == 2;
    }

    private boolean b(com.huawei.openalliance.ad.processor.eventbeans.b bVar) {
        hw.a("EventProcessor", "check if it is a valid click");
        if (d(bVar)) {
            return true;
        }
        return c(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(EventRecord eventRecord, EventType eventType) {
        if (eventRecord != null) {
            return false;
        }
        hw.d("EventProcessor", "fail to create %s event record", eventType.value());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(EventReportRsp eventReportRsp) {
        if (eventReportRsp.b() != null && eventReportRsp.b().intValue() == 0) {
            return true;
        }
        List<AdEventResult> listA = eventReportRsp.a();
        List<AdEventResultV2> listC = eventReportRsp.c();
        if (com.huawei.openalliance.ad.utils.bm.a(listA) && com.huawei.openalliance.ad.utils.bm.a(listC)) {
            hw.d("EventProcessor", "real time report failed");
            return false;
        }
        if (!com.huawei.openalliance.ad.utils.bm.a(listC)) {
            return false;
        }
        for (AdEventResult adEventResult : listA) {
            if (adEventResult != null && 200 != adEventResult.b()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final String str) {
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.pc.9
            @Override // java.lang.Runnable
            public void run() {
                if (pc.this.f19965b == null) {
                    hw.d("EventProcessor", "contentRecord is null, can't report HA show event");
                } else {
                    com.huawei.openalliance.ad.utils.j.a(pc.this.d, pc.this.d.getPackageName(), AnalyticsEventType.AD_IMP, pc.this.f19965b.n(), str);
                }
            }
        });
    }

    private static void b(MaterialClickInfo materialClickInfo, EventRecord eventRecord) {
        Integer numValueOf;
        Integer numValueOf2;
        if (!com.huawei.openalliance.ad.utils.dg.b(materialClickInfo.u())) {
            eventRecord.B(materialClickInfo.u());
        }
        if (b(materialClickInfo).booleanValue()) {
            if (!"ad_download_btn_dynamic".equals(materialClickInfo.u()) || materialClickInfo.d() == null || materialClickInfo.e() == null) {
                numValueOf = Integer.valueOf(materialClickInfo.b().intValue() + materialClickInfo.z().intValue());
                numValueOf2 = Integer.valueOf(materialClickInfo.c().intValue() + materialClickInfo.A().intValue());
            } else {
                numValueOf = materialClickInfo.d();
                numValueOf2 = materialClickInfo.e();
            }
            eventRecord.C(c(numValueOf) + "," + c(numValueOf2) + "," + c(materialClickInfo.D()) + "," + c(materialClickInfo.E()) + "#" + c(materialClickInfo.z()) + "," + c(materialClickInfo.A()) + "," + c(materialClickInfo.B()) + "," + c(materialClickInfo.C()) + "#" + c(materialClickInfo.v()) + "," + c(materialClickInfo.w()) + "," + c(materialClickInfo.x()) + "," + c(materialClickInfo.y()));
        }
    }

    private void b(EventRecord eventRecord) {
        ApkInfo apkInfoS;
        ContentRecord contentRecord = this.f19965b;
        if (contentRecord == null || contentRecord.j() == null || (apkInfoS = this.f19965b.j().s()) == null) {
            return;
        }
        String str = apkInfoS.l() + "#" + apkInfoS.O();
        hw.a("EventProcessor", "install ways:%s", str);
        eventRecord.u(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final ContentRecord contentRecord) {
        if (contentRecord != null) {
            if ((contentRecord.f() == 1 || contentRecord.f() == 18) && !TextUtils.isEmpty(contentRecord.o())) {
                com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.pc.11
                    @Override // java.lang.Runnable
                    public void run() {
                        ey.a(pc.this.d).d(contentRecord.o());
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(PostBackEvent postBackEvent) {
        if (postBackEvent == null) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(postBackEvent.b());
            if (!com.huawei.openalliance.ad.utils.cq.a(this.d, 1, arrayList)) {
                hw.a("EventProcessor", "%s not support recommend engine", postBackEvent.b());
                return;
            }
            if (com.huawei.openalliance.ad.utils.dg.b(postBackEvent.a())) {
                postBackEvent.a(this.d.getPackageName());
            }
            na.a(this.d).a(RTCMethods.REPORT_TO_REC_ENGINE, com.huawei.openalliance.ad.utils.bk.b(postBackEvent), null, null);
        } catch (Throwable th) {
            hw.c("EventProcessor", "report to hms recommend engine: %s", th.getClass().getSimpleName());
        }
    }

    private static Boolean b(MaterialClickInfo materialClickInfo) {
        return Boolean.valueOf((materialClickInfo.b() == null || materialClickInfo.c() == null || materialClickInfo.D() == null || materialClickInfo.E() == null || materialClickInfo.z() == null || materialClickInfo.A() == null || materialClickInfo.B() == null || materialClickInfo.C() == null || materialClickInfo.v() == null || materialClickInfo.w() == null || materialClickInfo.x() == null || materialClickInfo.y() == null) ? false : true);
    }

    private EventRecord b(EventType eventType) {
        if (eventType != null) {
            return e(eventType.value());
        }
        hw.d("EventProcessor", "event is null");
        return null;
    }

    private static boolean a(EventType eventType) {
        return EventType.APPDOWNLOAD.equals(eventType) || EventType.APPOPEN.equals(eventType) || EventType.INTENTSUCCESS.equals(eventType);
    }

    private void a(List<String> list, List<String> list2, List<String> list3, Map<String, String> map, List<String> list4) {
        ContentRecord contentRecord = this.f19965b;
        if (contentRecord != null) {
            list2 = contentRecord.K();
            list3 = this.f19965b.L();
            List<FeedbackInfo> listAN = this.f19965b.aN();
            if (!com.huawei.openalliance.ad.utils.bm.a(listAN)) {
                if (list2 == null) {
                    list2 = new ArrayList<>();
                }
                if (list3 == null) {
                    list3 = new ArrayList<>();
                }
                for (FeedbackInfo feedbackInfo : listAN) {
                    if (feedbackInfo != null && (com.huawei.openalliance.ad.utils.bm.a(list3) || !list3.contains(String.valueOf(feedbackInfo.a())))) {
                        list2.add(feedbackInfo.getLabel());
                        list3.add(String.valueOf(feedbackInfo.a()));
                    }
                }
            }
            if (!com.huawei.openalliance.ad.utils.bm.a(list2)) {
                hw.a("EventProcessor", "onAdClose, fullDoseKeyWords: %s", list2.toString());
            }
            if (!com.huawei.openalliance.ad.utils.bm.a(list3)) {
                hw.a("EventProcessor", "onAdClose, fullDoseKeyWordsType: %s", list3.toString());
            }
        }
        if (!com.huawei.openalliance.ad.utils.bm.a(list2) && !com.huawei.openalliance.ad.utils.bm.a(list3) && list2.size() == list3.size()) {
            for (int i = 0; i < list2.size(); i++) {
                map.put(list2.get(i), list3.get(i));
            }
        }
        if (map.isEmpty() || com.huawei.openalliance.ad.utils.bm.a(list)) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            list4.add(map.get(it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i, String str2, boolean z) {
        new com.huawei.openalliance.ad.analysis.c(this.d).a(str, Integer.valueOf(i), str2, this.f19965b, z);
    }

    private static void a(MaterialClickInfo materialClickInfo, EventRecord eventRecord) {
        if (materialClickInfo == null || eventRecord == null) {
            return;
        }
        if (materialClickInfo.b() != null) {
            eventRecord.a(materialClickInfo.b());
        }
        if (materialClickInfo.c() != null) {
            eventRecord.b(materialClickInfo.c());
        }
        if (materialClickInfo.f() != null) {
            eventRecord.D(materialClickInfo.f());
        }
        if (materialClickInfo.j() != null) {
            eventRecord.a(materialClickInfo.j().floatValue());
        }
        if (materialClickInfo.g() != null) {
            eventRecord.k(materialClickInfo.g().intValue());
        }
        if (materialClickInfo.h() != null) {
            eventRecord.l(materialClickInfo.h().intValue());
        }
        if (materialClickInfo.i() != null) {
            eventRecord.m(materialClickInfo.i().intValue());
        }
        if (materialClickInfo.l() != null) {
            eventRecord.h(materialClickInfo.l().longValue());
        }
        if (materialClickInfo.k() != null) {
            eventRecord.i(materialClickInfo.k().longValue());
        }
        if (!com.huawei.openalliance.ad.utils.dg.b(materialClickInfo.n())) {
            eventRecord.I(materialClickInfo.n());
        }
        if (materialClickInfo.o() != null) {
            eventRecord.b(materialClickInfo.o().floatValue());
        }
        if (materialClickInfo.p() != null) {
            eventRecord.c(materialClickInfo.p().floatValue());
        }
        if (materialClickInfo.q() != null) {
            eventRecord.d(materialClickInfo.q().floatValue());
        }
        if (materialClickInfo.r() != null) {
            eventRecord.e(materialClickInfo.r().floatValue());
        }
        if (materialClickInfo.s() != null) {
            eventRecord.o(materialClickInfo.s().intValue());
        }
        if (materialClickInfo.t() != null) {
            eventRecord.p(materialClickInfo.t().intValue());
        }
        b(materialClickInfo, eventRecord);
    }

    private void a(MaterialClickInfo materialClickInfo) {
        if (materialClickInfo.g() == null) {
            return;
        }
        if (c(materialClickInfo.g().intValue())) {
            c(materialClickInfo);
            return;
        }
        materialClickInfo.a((Integer) null);
        materialClickInfo.b((Integer) null);
        materialClickInfo.f(null);
        materialClickInfo.g(null);
    }

    private void a(AdAssistEventRecord adAssistEventRecord, EventRecord eventRecord) {
        eventRecord.e(adAssistEventRecord.a() + "|" + adAssistEventRecord.b() + "|" + adAssistEventRecord.c() + "|" + adAssistEventRecord.e() + "|" + adAssistEventRecord.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(EventRecord eventRecord, EventType eventType, com.huawei.openalliance.ad.processor.eventbeans.b bVar) {
        eventRecord.e(bVar.d());
        eventRecord.f(bVar.e());
        eventRecord.b(bVar.f());
        if (bVar.g() != null) {
            eventRecord.k(bVar.g().toString());
        }
        hw.a(InterstitialMethods.ON_AD_CLICK, "cacheAndReportEvent, clickSource: %s, sld: %s", bVar.g(), Integer.valueOf(eventRecord.af()));
        qp qpVarA = qo.a(this.d, this.f19964a, eventType);
        if (bVar.k()) {
            qpVarA.a(eventType.value(), eventRecord, eventType != EventType.CLICK, this.f19965b);
        } else {
            qpVarA.b(eventType.value(), eventRecord, eventType != EventType.CLICK, this.f19965b);
        }
        if (EventType.CLICK == eventType || EventType.REPEATEDCLICK == eventType) {
            g(eventType.value());
        }
        d(eventRecord);
        if (EventType.CLICK.equals(eventType)) {
            List<String> listA = com.huawei.openalliance.ad.utils.f.a(this.f19965b);
            if (listA.isEmpty()) {
                return;
            }
            IntentDataRecord intentDataRecordD = d(EventType.CLICK.value());
            intentDataRecordD.a(listA);
            ff.a(this.d).a(intentDataRecordD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(EventRecord eventRecord, EventType eventType, com.huawei.openalliance.ad.processor.eventbeans.a aVar, pb pbVar) {
        a(eventRecord, eventType, aVar);
        if (pbVar != null) {
            hw.b("EventProcessor", "add eventExtInfo data");
            Integer numB = pbVar.b();
            if (numB != null && numB.intValue() >= 0) {
                eventRecord.j(numB.intValue());
            }
            Integer numA = pbVar.a();
            if (numA != null && numA.intValue() >= 0) {
                eventRecord.F(String.valueOf(numA));
            }
        }
        ContentRecord contentRecord = this.f19965b;
        if (contentRecord != null) {
            eventRecord.h(contentRecord.m());
        }
        ContentRecord contentRecord2 = this.f19965b;
        if (contentRecord2 != null) {
            eventRecord.f(contentRecord2.aM());
        }
        if (eventType == EventType.SHOW || eventType == EventType.SUPPLEMENTIMP) {
            c(eventRecord);
        }
        qp qpVarA = qo.a(this.d, this.f19964a, eventType);
        if (aVar.h()) {
            qpVarA.a(eventType.value(), eventRecord, eventType != EventType.SHOW, this.f19965b);
            if (eventType == EventType.REPEATEDIMP) {
                B();
            }
        } else {
            qpVarA.b(eventType.value(), eventRecord, eventType != EventType.SHOW, this.f19965b);
        }
        if (EventType.SHOW.equals(eventType)) {
            this.f19964a.c();
            List<String> listA = com.huawei.openalliance.ad.utils.f.a(this.f19965b);
            if (listA.isEmpty()) {
                return;
            }
            IntentDataRecord intentDataRecordD = d(EventType.SHOW.value());
            intentDataRecordD.a(listA);
            ff.a(this.d).a(intentDataRecordD);
        }
        if (eventType.equals(EventType.SHOW) || eventType.equals(EventType.REPEATEDIMP)) {
            g(eventType.value());
        }
        d(eventRecord);
        if (eventType.equals(EventType.SHOW) || EventType.SUPPLEMENTIMP.equals(eventType)) {
            new qt(this.d).a(eventRecord, this.f19965b);
        }
    }

    private void a(EventRecord eventRecord, EventType eventType, com.huawei.openalliance.ad.processor.eventbeans.a aVar) {
        if (eventRecord == null || aVar == null) {
            return;
        }
        eventRecord.u(aVar.g());
        eventRecord.A(aVar.j());
        eventRecord.G(aVar.k());
        if (hw.a()) {
            Long lC = aVar.c();
            Integer numD = aVar.d();
            ContentRecord contentRecord = this.f19965b;
            hw.a("EventProcessor", "onAdImpEvent type: %s duration: %s ratio: %s showId: %s source: %s creativeSize: %s", eventType, lC, numD, contentRecord == null ? "" : contentRecord.l(), aVar.e(), aVar.a());
        }
        ContentRecord contentRecord2 = this.f19965b;
        if (contentRecord2 != null && (contentRecord2.f() == 1 || this.f19965b.f() == 18)) {
            eventRecord.h(this.f19965b.V());
        }
        if (aVar.c() != null) {
            eventRecord.a(aVar.c().longValue());
        }
        if (aVar.d() != null) {
            eventRecord.c(aVar.d().intValue());
        }
        if (aVar.e() != null) {
            eventRecord.n(String.valueOf(aVar.e()));
        }
        if (aVar.a() != null) {
            eventRecord.D(aVar.a());
        }
    }

    private void a(EventRecord eventRecord) {
        byte[] bArrB = com.huawei.openalliance.ad.utils.cw.b(this.d);
        EncryptionField<String> encryptionField = new EncryptionField<>(String.class);
        ParamFromServer paramFromServer = new ParamFromServer();
        long jCurrentTimeMillis = System.currentTimeMillis();
        paramFromServer.b(String.valueOf(jCurrentTimeMillis));
        paramFromServer.a(String.valueOf(jCurrentTimeMillis));
        paramFromServer.c(String.valueOf(jCurrentTimeMillis));
        encryptionField.a(com.huawei.openalliance.ad.utils.g.a(com.huawei.openalliance.ad.utils.bk.b(paramFromServer), bArrB));
        eventRecord.a(encryptionField);
    }

    private void a(EventType eventType, Integer num, boolean z, boolean z2, Integer num2, DownloadBlockInfo downloadBlockInfo) {
        if (eventType == null || num == null) {
            return;
        }
        EventRecord eventRecordB = b(eventType);
        if (b(eventRecordB, eventType)) {
            return;
        }
        hw.a("EventProcessor", "reportDownloadOrOpenEvent type: %s source: %s reason: %s blockInfo: %s", eventType.value(), num, num2, downloadBlockInfo);
        eventRecordB.k(num.toString());
        if (num2 != null) {
            eventRecordB.p(String.valueOf(num2));
        }
        if (downloadBlockInfo != null) {
            eventRecordB.q(String.valueOf(downloadBlockInfo.a()));
            eventRecordB.r(String.valueOf(downloadBlockInfo.b()));
            eventRecordB.t(String.valueOf(downloadBlockInfo.c() ? 1 : 0));
        }
        a(eventType, eventRecordB);
        qp qpVarA = qo.a(this.d, this.f19964a, eventType);
        String strValue = eventType.value();
        if (z) {
            qpVarA.a(strValue, eventRecordB, z2, this.f19965b);
        } else {
            qpVarA.b(strValue, eventRecordB, z2, this.f19965b);
        }
    }

    private void a(EventType eventType, Integer num, String str, boolean z, boolean z2, Integer num2, DownloadBlockInfo downloadBlockInfo, Integer num3, String str2, String str3, String str4) {
        if (eventType == null || num == null) {
            return;
        }
        EventRecord eventRecordB = b(eventType);
        if (b(eventRecordB, eventType)) {
            return;
        }
        if (hw.a()) {
            hw.a("EventProcessor", "reportDownloadOrOpenEvent type: %s source: %s reason: %s blockInfo: %s agVerifyCode: %s installType: %s", eventType.value(), num, num2, downloadBlockInfo, str2, str3);
        }
        eventRecordB.k(num.toString());
        eventRecordB.l(str);
        if (num2 != null) {
            eventRecordB.p(String.valueOf(num2));
        }
        if (num3 != null) {
            eventRecordB.s(String.valueOf(num3));
        }
        if (downloadBlockInfo != null) {
            eventRecordB.q(String.valueOf(downloadBlockInfo.a()));
            eventRecordB.r(String.valueOf(downloadBlockInfo.b()));
            eventRecordB.t(String.valueOf(downloadBlockInfo.c() ? 1 : 0));
        }
        if (str2 != null) {
            eventRecordB.z(str2);
        }
        if (str3 != null) {
            eventRecordB.A(str3);
        }
        eventRecordB.E(com.huawei.openalliance.ad.utils.dg.o(str4));
        a(eventType, eventRecordB);
        qp qpVarA = qo.a(this.d, this.f19964a, eventType);
        String strValue = eventType.value();
        ContentRecord contentRecord = this.f19965b;
        if (z) {
            qpVarA.a(strValue, eventRecordB, z2, contentRecord);
        } else {
            qpVarA.b(strValue, eventRecordB, z2, contentRecord);
        }
    }

    private void a(EventType eventType, Integer num, Integer num2, boolean z, boolean z2, String str, String str2, String str3) {
        if (eventType == null || num == null) {
            return;
        }
        EventRecord eventRecordB = b(eventType);
        if (b(eventRecordB, eventType)) {
            return;
        }
        if (hw.a()) {
            hw.a("EventProcessor", "reportInstallEvent type: %s source: %s agVerifyCode: %s installType: %s", eventType.value(), num, str, str2);
        }
        eventRecordB.l(num.toString());
        if (num2 != null) {
            eventRecordB.k(num2.toString());
        }
        if (str != null) {
            eventRecordB.z(str);
        }
        if (str2 != null) {
            eventRecordB.A(str2);
        }
        eventRecordB.E(com.huawei.openalliance.ad.utils.dg.o(str3));
        qp qpVarA = qo.a(this.d, this.f19964a, eventType);
        String strValue = eventType.value();
        ContentRecord contentRecord = this.f19965b;
        if (z) {
            qpVarA.a(strValue, eventRecordB, z2, contentRecord);
        } else {
            qpVarA.b(strValue, eventRecordB, z2, contentRecord);
        }
    }

    private void a(EventType eventType, com.huawei.openalliance.ad.processor.eventbeans.a aVar, pb pbVar) {
        int iIntValue;
        if (aVar.i() == null) {
            ContentRecord contentRecord = this.f19965b;
            if (contentRecord == null) {
                return;
            } else {
                iIntValue = pa.j(contentRecord.X());
            }
        } else {
            iIntValue = aVar.i().intValue();
        }
        if (eventType == null) {
            return;
        }
        if ("2".equals(com.huawei.openalliance.ad.utils.ct.a(this.d, this.f19965b))) {
            iIntValue = 1;
        }
        a(iIntValue, eventType, aVar, pbVar);
    }

    private void a(EventType eventType, AppDownloadTask appDownloadTask, boolean z, boolean z2) {
        Integer numValueOf;
        if (eventType == null || appDownloadTask == null) {
            return;
        }
        Integer numF = appDownloadTask.F();
        String strE = appDownloadTask.E();
        if (EventType.APPDOWNLOADPAUSE.value().equalsIgnoreCase(eventType.value())) {
            numValueOf = Integer.valueOf((appDownloadTask.p() != null ? appDownloadTask.p() : DownloadTask.c.NONE).a());
        } else {
            numValueOf = null;
        }
        DownloadBlockInfo downloadBlockInfoX = appDownloadTask.x();
        String strP = appDownloadTask.P();
        String strQ = appDownloadTask.Q();
        String strG = appDownloadTask.G();
        Integer numValueOf2 = appDownloadTask.h() != null ? Integer.valueOf(appDownloadTask.h().a()) : null;
        int iT = appDownloadTask.T();
        if (numF == null) {
            return;
        }
        EventRecord eventRecordB = b(eventType);
        if (b(eventRecordB, eventType)) {
            return;
        }
        if (hw.a()) {
            hw.a("EventProcessor", "reportDownloadOrOpenEvent type: %s source: %s reason: %s blockInfo: %s agVerifyCode: %s installType: %s", eventType.value(), numF, numValueOf, downloadBlockInfoX, strP, strQ);
        }
        eventRecordB.k(numF.toString());
        eventRecordB.l(strE);
        if (numValueOf != null) {
            eventRecordB.p(String.valueOf(numValueOf));
        }
        if (numValueOf2 != null) {
            eventRecordB.s(String.valueOf(numValueOf2));
        }
        if (downloadBlockInfoX != null) {
            eventRecordB.q(String.valueOf(downloadBlockInfoX.a()));
            eventRecordB.r(String.valueOf(downloadBlockInfoX.b()));
            eventRecordB.t(String.valueOf(downloadBlockInfoX.c() ? 1 : 0));
        }
        if (strP != null) {
            eventRecordB.z(strP);
        }
        if (strQ != null) {
            eventRecordB.A(strQ);
        }
        eventRecordB.E(com.huawei.openalliance.ad.utils.dg.o(strG));
        a(eventType, eventRecordB);
        if (EventType.APPDOWNLOADPAUSE.value().equalsIgnoreCase(eventType.value())) {
            eventRecordB.a(String.valueOf(iT));
        }
        qp qpVarA = qo.a(this.d, this.f19964a, eventType);
        String strValue = eventType.value();
        ContentRecord contentRecord = this.f19965b;
        if (z) {
            qpVarA.a(strValue, eventRecordB, z2, contentRecord);
        } else {
            qpVarA.b(strValue, eventRecordB, z2, contentRecord);
        }
    }

    private void a(EventType eventType, EventRecord eventRecord) {
        ContentRecord contentRecord;
        if (!a(eventType) || eventRecord == null || (contentRecord = this.f19965b) == null) {
            return;
        }
        eventRecord.u(contentRecord.aC());
        eventRecord.v(this.f19965b.aD());
    }

    private void a(EventType eventType, long j, long j2, int i, int i2, String str) {
        hw.b("EventProcessor", "reportVideoPlayState eventType: %s startTime: %d, endtime: %d startProgress: %d endProgress: %d", eventType, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Integer.valueOf(i2));
        EventRecord eventRecordB = b(eventType);
        if (b(eventRecordB, eventType)) {
            return;
        }
        eventRecordB.b(j);
        eventRecordB.c(j2);
        eventRecordB.a(i);
        eventRecordB.b(i2);
        eventRecordB.u(str);
        c(eventRecordB);
        qo.a(this.d, this.f19964a, eventType).a(eventType.value(), eventRecordB, false, this.f19965b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(PostBackEvent postBackEvent) {
        if (postBackEvent != null && eo.a(this.d)) {
            eo.a(this.d, postBackEvent);
        }
    }

    private void a(final int i, final EventRecord eventRecord, final com.huawei.openalliance.ad.processor.eventbeans.b bVar) {
        if (bVar == null) {
            return;
        }
        com.huawei.openalliance.ad.utils.o.h(new Runnable() { // from class: com.huawei.openalliance.ad.pc.14
            @Override // java.lang.Runnable
            public void run() {
                String strA;
                boolean z = false;
                if (!pc.this.b(i)) {
                    pc.this.a(eventRecord, EventType.CLICK, bVar);
                    pc.this.c(bVar.j());
                    strA = "";
                } else {
                    if (pc.this.f19965b == null) {
                        return;
                    }
                    pc pcVar = pc.this;
                    strA = pcVar.a(pcVar.f19965b, eventRecord.j(), i);
                    hw.b("EventProcessor", "onAdClick key: " + strA);
                    if (pc.this.e.a(pc.this.f19965b.f(), strA)) {
                        hw.b("EventProcessor", "onAdClick repeated event");
                        if (pc.this.f19966c.E()) {
                            eventRecord.c(EventType.REPEATEDCLICK.value());
                            pc.this.a(eventRecord, EventType.REPEATEDCLICK, bVar);
                        }
                        z = true;
                    } else {
                        hw.b("EventProcessor", "onAdClick report event");
                        pc.this.a(eventRecord, EventType.CLICK, bVar);
                        pc.this.c(bVar.j());
                        jv.b(pc.this.f19965b.o()).a();
                    }
                }
                pc.this.a(EventType.CLICK.value(), i, strA, z);
            }
        });
    }

    private void a(final int i, final EventType eventType, final com.huawei.openalliance.ad.processor.eventbeans.a aVar, final pb pbVar) {
        final EventRecord eventRecordB = b(eventType);
        if (b(eventRecordB, eventType)) {
            return;
        }
        com.huawei.openalliance.ad.utils.o.h(new Runnable() { // from class: com.huawei.openalliance.ad.pc.10
            @Override // java.lang.Runnable
            public void run() {
                String strA;
                boolean z = false;
                if (!eventType.equals(EventType.SHOW) || !pc.this.b(i)) {
                    if (eventType.equals(EventType.SHOW)) {
                        pc.this.a(eventRecordB, eventType, aVar, pbVar);
                        pc.this.b(aVar.f());
                    } else {
                        pc.this.a(eventRecordB, eventType, aVar, pbVar);
                    }
                    strA = "";
                } else {
                    if (pc.this.f19965b == null) {
                        return;
                    }
                    pc pcVar = pc.this;
                    strA = pcVar.a(pcVar.f19965b, eventType.value(), i);
                    hw.b("EventProcessor", "onAdImp key: " + strA);
                    if (pc.this.e.a(pc.this.f19965b.f(), strA)) {
                        hw.b("EventProcessor", "onAdImp repeated event");
                        if (!pc.this.f19966c.E()) {
                            pc.this.B();
                        } else {
                            eventRecordB.c(EventType.REPEATEDIMP.value());
                            pc.this.a(eventRecordB, EventType.REPEATEDIMP, aVar, pbVar);
                        }
                        z = true;
                    } else {
                        hw.b("EventProcessor", "onAdImp report event");
                        pc.this.a(eventRecordB, eventType, aVar, pbVar);
                        pc.this.b(aVar.f());
                        pc pcVar2 = pc.this;
                        pcVar2.b(pcVar2.f19965b);
                    }
                }
                if (eventType.equals(EventType.SHOW)) {
                    pc.this.a(eventType.value(), i, strA, z);
                }
            }
        });
    }

    private void a(int i, int i2, List<String> list, EventType eventType) {
        EventRecord eventRecordB = b(eventType);
        if (b(eventRecordB, eventType)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        a(list, arrayList, arrayList2, map, arrayList3);
        if (!com.huawei.openalliance.ad.utils.bm.a(list)) {
            hw.a("onAdClose", "selectedKeyWords: %s", list.toString());
        }
        if (!com.huawei.openalliance.ad.utils.bm.a(arrayList3)) {
            hw.a("onAdClose", "selectedKeyWordsType: %s", arrayList3.toString());
        }
        eventRecordB.e(i);
        eventRecordB.f(i2);
        eventRecordB.a(list);
        eventRecordB.b(arrayList3);
        ContentRecord contentRecord = this.f19965b;
        if (contentRecord == null || !contentRecord.ar()) {
            qo.a(this.d, this.f19964a, eventType).a(eventType.value(), eventRecordB, false, this.f19965b);
            if (!EventType.EASTEREGGCLOSE.equals(eventType)) {
                this.f19964a.d();
            }
        } else {
            hw.a("EventProcessor", "report exsplash close event");
            AdEventReport adEventReportD = d(this.f19965b);
            adEventReportD.b(i);
            adEventReportD.c(i2);
            adEventReportD.a(list);
            na.a(this.d).a(MapKeyNames.REPORT_CLOSE_EVENT, com.huawei.openalliance.ad.utils.bk.b(adEventReportD), null, null);
        }
        d(eventRecordB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(ContentRecord contentRecord, String str, int i) {
        StringBuilder sb = new StringBuilder();
        if (contentRecord == null) {
            return sb.toString();
        }
        sb.append(contentRecord.f());
        sb.append("_");
        sb.append(contentRecord.o());
        sb.append("_");
        String strC = c(contentRecord);
        if (!TextUtils.isEmpty(strC)) {
            sb.append(strC);
            sb.append("_");
        }
        if (i == 2 || (i == 1 && TextUtils.isEmpty(strC))) {
            sb.append(contentRecord.l());
            sb.append("_");
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EventRecord a(AdAssistEventRecord adAssistEventRecord) {
        try {
            EventRecord eventRecord = new EventRecord();
            eventRecord.d(Long.parseLong(adAssistEventRecord.b()));
            eventRecord.c(EventType.ASSISTCLICK.value());
            a(eventRecord);
            a(adAssistEventRecord, eventRecord);
            return eventRecord;
        } catch (Exception e) {
            hw.d("EventProcessor", "createAssistClickEvent error" + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x002d A[Catch: Exception -> 0x00d3, RuntimeException -> 0x00d6, TryCatch #2 {RuntimeException -> 0x00d6, Exception -> 0x00d3, blocks: (B:3:0x0003, B:6:0x000a, B:12:0x0024, B:13:0x0027, B:15:0x002d, B:17:0x0037, B:19:0x005c, B:20:0x006d, B:23:0x0078, B:25:0x00a9, B:9:0x001c, B:11:0x0020), top: B:31:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:19:0x005c A[Catch: Exception -> 0x00d3, RuntimeException -> 0x00d6, TryCatch #2 {RuntimeException -> 0x00d6, Exception -> 0x00d3, blocks: (B:3:0x0003, B:6:0x000a, B:12:0x0024, B:13:0x0027, B:15:0x002d, B:17:0x0037, B:19:0x005c, B:20:0x006d, B:23:0x0078, B:25:0x00a9, B:9:0x001c, B:11:0x0020), top: B:31:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0078 A[Catch: Exception -> 0x00d3, RuntimeException -> 0x00d6, TRY_ENTER, TryCatch #2 {RuntimeException -> 0x00d6, Exception -> 0x00d3, blocks: (B:3:0x0003, B:6:0x000a, B:12:0x0024, B:13:0x0027, B:15:0x002d, B:17:0x0037, B:19:0x005c, B:20:0x006d, B:23:0x0078, B:25:0x00a9, B:9:0x001c, B:11:0x0020), top: B:31:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9 A[Catch: Exception -> 0x00d3, RuntimeException -> 0x00d6, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00d6, Exception -> 0x00d3, blocks: (B:3:0x0003, B:6:0x000a, B:12:0x0024, B:13:0x0027, B:15:0x002d, B:17:0x0037, B:19:0x005c, B:20:0x006d, B:23:0x0078, B:25:0x00a9, B:9:0x001c, B:11:0x0020), top: B:31:0x0003 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0078, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x00a9, please report this as an issue */
    public EventRecord a(EventType eventType, com.huawei.openalliance.ad.analysis.b bVar) {
        String str;
        int iIntValue;
        try {
            if (!A()) {
                return null;
            }
            EventRecord eventRecord = new EventRecord();
            String strAb = com.huawei.openalliance.ad.utils.cn.a(this.d).ab();
            if (strAb == null) {
                ContentRecord contentRecord = this.f19965b;
                if (contentRecord != null) {
                    strAb = contentRecord.bs();
                }
                if (bVar.t() != null) {
                    iIntValue = bVar.t().intValue();
                } else {
                    iIntValue = -1;
                }
                eventRecord.d(iIntValue);
                eventRecord.c(eventType.value());
                eventRecord.d(com.huawei.openalliance.ad.utils.as.c());
                eventRecord.e(bVar.aJ());
                eventRecord.i(bVar.N());
                if (hw.a()) {
                    hw.a("EventProcessor", "ExceptionType is %s, TrackVersion is %s", bVar.aN(), bVar.aI());
                }
                if (bVar.aM()) {
                    hw.b("EventProcessor", "create event, type is : %s, rt : %d, %s", eventType + " " + bVar.toString(), Integer.valueOf(bVar.N()), bVar.aL());
                    return eventRecord;
                }
                hw.b("EventProcessor", "create event, type is : %s, rt : %d", eventType + " " + bVar.toString(), Integer.valueOf(bVar.N()));
                return eventRecord;
            }
            bVar.aj(strAb);
            if (bVar.t() != null) {
                iIntValue = bVar.t().intValue();
            } else {
                iIntValue = -1;
            }
            eventRecord.d(iIntValue);
            eventRecord.c(eventType.value());
            eventRecord.d(com.huawei.openalliance.ad.utils.as.c());
            eventRecord.e(bVar.aJ());
            eventRecord.i(bVar.N());
            if (hw.a()) {
                hw.a("EventProcessor", "ExceptionType is %s, TrackVersion is %s", bVar.aN(), bVar.aI());
            }
            if (bVar.aM()) {
                hw.b("EventProcessor", "create event, type is : %s, rt : %d, %s", eventType + " " + bVar.toString(), Integer.valueOf(bVar.N()), bVar.aL());
                return eventRecord;
            }
            hw.b("EventProcessor", "create event, type is : %s, rt : %d", eventType + " " + bVar.toString(), Integer.valueOf(bVar.N()));
            return eventRecord;
        } catch (RuntimeException unused) {
            str = "createAnalysisEvent RuntimeException";
            hw.d("EventProcessor", str);
            return null;
        } catch (Exception unused2) {
            str = "createAnalysisEvent error";
            hw.d("EventProcessor", str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        com.huawei.openalliance.ad.utils.bu.a(new Runnable() { // from class: com.huawei.openalliance.ad.pc.5
            @Override // java.lang.Runnable
            public void run() {
                qo.a(pc.this.d, pc.this.f19964a, EventType.SHOW).e();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A() {
        return this.f19966c.bf();
    }

    public pc(Context context, tf tfVar, ContentRecord contentRecord) {
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.f19964a = tfVar;
        this.f19966c = fp.b(applicationContext);
        this.f = fi.a(this.d);
        this.f19965b = contentRecord;
        this.e = jk.a(this.d);
        this.g = fm.a(this.d);
    }

    public pc(Context context, tf tfVar) {
        this(context, tfVar, null);
    }
}
