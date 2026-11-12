package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.PeriodicWorkRequest;
import com.huawei.openalliance.ad.beans.metadata.AdEventResult;
import com.huawei.openalliance.ad.beans.metadata.AdEventResultV2;
import com.huawei.openalliance.ad.beans.server.EventReportRsp;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.EventRecord;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes12.dex */
abstract class qm implements qp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f20132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gc f20133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private tf f20134c;
    private gf d;

    private static boolean a(int i) {
        return (200 == i || 601 == i || 611 == i) ? false : true;
    }

    protected abstract Class<? extends EventRecord> a();

    protected abstract void a(long j);

    protected abstract Executor b();

    protected abstract String c();

    protected abstract long d();

    @Override // com.huawei.openalliance.ad.qp
    public void g() {
        a(new Runnable() { // from class: com.huawei.openalliance.ad.qm.5
            @Override // java.lang.Runnable
            public void run() {
                new qs(qm.this.f20132a, qm.this.f20134c).a();
                qm.this.i();
            }
        });
    }

    public boolean f() {
        try {
            return fp.b(this.f20132a).aF().contains(this.f20132a.getPackageName());
        } catch (Exception e) {
            hw.d(c(), "isInReportStrategyWhiteList, Exception:" + e.getClass().getSimpleName());
            return false;
        }
    }

    @Override // com.huawei.openalliance.ad.qp
    public void e() {
        a(new Runnable() { // from class: com.huawei.openalliance.ad.qm.3
            @Override // java.lang.Runnable
            public void run() {
                qm.this.i();
            }
        });
    }

    @Override // com.huawei.openalliance.ad.qp
    public void c(String str, EventRecord eventRecord, boolean z, ContentRecord contentRecord) {
        if (eventRecord != null) {
            if ((z && a(str, contentRecord)) || a(str)) {
                return;
            }
            b(eventRecord, contentRecord);
        }
    }

    @Override // com.huawei.openalliance.ad.qp
    public void b(String str, final EventRecord eventRecord, boolean z, final ContentRecord contentRecord) {
        if (eventRecord != null) {
            if ((z && a(str, contentRecord)) || a(str)) {
                return;
            }
            com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.qm.4
                @Override // java.lang.Runnable
                public void run() {
                    qm.this.b(eventRecord, contentRecord);
                    if (qm.this.h()) {
                        qm.this.g();
                    }
                }
            });
            String strA = com.huawei.openalliance.ad.utils.ct.a(this.f20132a, contentRecord);
            if (f() || "1".equals(strA) || "2".equals(strA)) {
                a(eventRecord, contentRecord);
            } else {
                if (com.huawei.openalliance.ad.utils.bm.a(qs.a(eventRecord.j(), contentRecord, this.f20132a))) {
                    return;
                }
                new com.huawei.openalliance.ad.analysis.c(this.f20132a).a(contentRecord, eventRecord, strA);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.qp
    public void b(String str, EventRecord eventRecord, ContentRecord contentRecord) {
        b(str, eventRecord, true, contentRecord);
    }

    @Override // com.huawei.openalliance.ad.qp
    public void a(String str, final EventRecord eventRecord, boolean z, final ContentRecord contentRecord) {
        if (eventRecord != null) {
            if ((z && a(str, contentRecord)) || a(str)) {
                return;
            }
            com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.qm.1
                @Override // java.lang.Runnable
                public void run() {
                    ContentRecord contentRecord2;
                    if ((TextUtils.equals(eventRecord.j(), EventType.SHOW.value()) || TextUtils.equals(eventRecord.j(), EventType.SUPPLEMENTIMP.value())) && (contentRecord2 = contentRecord) != null && contentRecord2.ag() != null) {
                        String packageName = contentRecord.ag().getPackageName();
                        if (!TextUtils.isEmpty(packageName)) {
                            int i = com.huawei.openalliance.ad.utils.k.a(qm.this.f20132a, packageName) ? 10 : 11;
                            eventRecord.m(String.valueOf(i));
                            hw.b(qm.this.c(), "appStatus: " + i);
                        }
                    }
                    qm.this.b(eventRecord, contentRecord);
                    qm.this.a(System.currentTimeMillis());
                    qm.this.g();
                }
            });
            a(eventRecord, contentRecord);
        }
    }

    @Override // com.huawei.openalliance.ad.qp
    public void a(String str, EventRecord eventRecord, ContentRecord contentRecord) {
        a(str, eventRecord, true, contentRecord);
    }

    @Override // com.huawei.openalliance.ad.qp
    public void a(String str, EventRecord eventRecord) {
        if (eventRecord == null || a(str)) {
            return;
        }
        b(eventRecord, null);
    }

    @Override // com.huawei.openalliance.ad.qp
    public void a(final EventRecord eventRecord, final ContentRecord contentRecord) {
        a(new Runnable() { // from class: com.huawei.openalliance.ad.qm.2
            @Override // java.lang.Runnable
            public void run() {
                qs qsVar = new qs(qm.this.f20132a, qm.this.f20134c);
                qsVar.a(qm.b(eventRecord));
                qsVar.a(eventRecord.j(), contentRecord);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Map<String, EventRecord> mapA = this.f20133b.a(a(), Constants.HISUGGESTION_PKG_NAME.equals(this.f20132a.getPackageName()) ? fp.b(this.f20132a).s() : 50);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        EventReportRsp eventReportRspA = this.d.a(pn.a(mapA.values(), this.f20132a));
        hw.a(c(), "rsp is " + com.huawei.openalliance.ad.utils.bk.b(eventReportRspA));
        if (eventReportRspA == null) {
            return;
        }
        if (a(eventReportRspA)) {
            a(mapA, strValueOf, eventReportRspA);
        } else {
            a(strValueOf, eventReportRspA.errorReason != null ? eventReportRspA.errorReason : String.valueOf(eventReportRspA.responseCode), mapA.values());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - d() <= PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            return false;
        }
        a(jCurrentTimeMillis);
        return true;
    }

    private boolean c(String str) {
        return EventType.SHOW.value().equals(str) || EventType.CLICK.value().equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(EventRecord eventRecord, ContentRecord contentRecord) {
        if (eventRecord == null) {
            hw.d(c(), "fail to add event to cache");
            return;
        }
        String strC = c();
        StringBuilder sb = new StringBuilder("addEventToCache, event:");
        sb.append(eventRecord.j());
        sb.append(" showId:");
        sb.append(eventRecord.l());
        sb.append(" reqId:");
        sb.append(eventRecord.S());
        sb.append(" contentId:");
        sb.append(contentRecord == null ? null : contentRecord.o());
        sb.append(" requestType:");
        sb.append(eventRecord.Q());
        hw.b(strC, sb.toString());
        sw.a(this.f20132a);
        long jA = this.f20133b.a(a(), eventRecord);
        hw.a(c(), "eventRecord.getType() is %s ,rowId is %s", eventRecord.j(), Long.valueOf(jA));
        a(eventRecord, contentRecord, jA > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<qs.a> b(EventRecord eventRecord) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new sr(eventRecord));
        arrayList.add(new su(eventRecord));
        arrayList.add(new td(eventRecord));
        return arrayList;
    }

    private String b(String str) {
        if (com.huawei.openalliance.ad.utils.dg.b(str)) {
            return "";
        }
        String eventTypeIndex = EventType.getEventTypeIndex(str);
        return com.huawei.openalliance.ad.utils.dg.b(eventTypeIndex) ? str.substring(str.indexOf("_") + 1) : eventTypeIndex;
    }

    private boolean a(Map<String, EventRecord> map, String str, EventReportRsp eventReportRsp) {
        try {
            List<AdEventResult> listA = eventReportRsp.a();
            List<AdEventResultV2> listC = eventReportRsp.c();
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList<EventRecord> arrayList2 = new ArrayList<>();
            if (eventReportRsp.b() != null && eventReportRsp.b().intValue() == 0) {
                arrayList.addAll(map.keySet());
            } else {
                if (com.huawei.openalliance.ad.utils.bm.a(listA) && com.huawei.openalliance.ad.utils.bm.a(listC)) {
                    a(str, "no result", map.values());
                    return false;
                }
                if (com.huawei.openalliance.ad.utils.bm.a(listC)) {
                    for (AdEventResult adEventResult : listA) {
                        if (adEventResult != null) {
                            a(map, str, arrayList, arrayList2, adEventResult.a(), adEventResult.b());
                        }
                    }
                } else {
                    for (AdEventResultV2 adEventResultV2 : listC) {
                        if (adEventResultV2 != null) {
                            a(map, str, arrayList, arrayList2, adEventResultV2.a(), adEventResultV2.b());
                        }
                    }
                    a(new ArrayList<>(map.keySet()), arrayList, listC);
                }
            }
            hw.a("BaseEventReporter", "uploadedEventIds " + com.huawei.openalliance.ad.utils.bk.b(arrayList));
            a(arrayList);
            a(str, (String) null, arrayList2);
            return true;
        } catch (Throwable th) {
            hw.c("BaseEventReporter", "dealEventRsp err, %s", th.getClass().getSimpleName());
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051 A[EDGE_INSN: B:18:0x0051->B:19:0x0052 BREAK  A[LOOP:0: B:6:0x0010->B:30:0x0010]] */
    private boolean a(String str, ContentRecord contentRecord) {
        String strC;
        StringBuilder sb;
        boolean z;
        if (contentRecord == null) {
            z = false;
            break;
        }
        try {
            List<String> listZ = contentRecord.Z();
            if (!com.huawei.openalliance.ad.utils.bm.a(listZ)) {
                Iterator<String> it = listZ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    String next = it.next();
                    if (str != null && str.equalsIgnoreCase(next)) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
        } catch (RuntimeException e) {
            e = e;
            strC = c();
            sb = new StringBuilder("isDiscard, RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.d(strC, sb.toString());
        } catch (Exception e2) {
            e = e2;
            strC = c();
            sb = new StringBuilder("isDiscard, Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.d(strC, sb.toString());
        }
        String strC2 = c();
        StringBuilder sb2 = new StringBuilder("isDiscard:");
        sb2.append(z);
        sb2.append(", eventType:");
        sb2.append(str);
        sb2.append(", contentId:");
        sb2.append(contentRecord == null ? null : contentRecord.o());
        hw.b(strC2, sb2.toString());
        return z;
    }

    private boolean a(String str) {
        String strB = b(str);
        boolean z = false;
        if (com.huawei.openalliance.ad.utils.dg.b(strB)) {
            return false;
        }
        try {
            List<String> listP = fp.b(this.f20132a).p();
            if (!com.huawei.openalliance.ad.utils.bm.a(listP)) {
                Iterator<String> it = listP.iterator();
                while (it.hasNext()) {
                    if (strB.equals(it.next())) {
                        z = true;
                        break;
                    }
                }
            }
        } catch (Throwable th) {
            hw.d(c(), "isInBlackList, Exception:" + th.getClass().getSimpleName());
        }
        hw.a(c(), "isInBlackList, result: %s, eventType: %s", Boolean.valueOf(z), str);
        return z;
    }

    private static boolean a(EventReportRsp eventReportRsp) {
        return eventReportRsp != null && eventReportRsp.responseCode == 0;
    }

    private void a(Map<String, EventRecord> map, String str, ArrayList<String> arrayList, ArrayList<EventRecord> arrayList2, String str2, int i) {
        EventRecord eventRecord = map.get(str2);
        if (!a(i)) {
            arrayList.add(str2);
            a(eventRecord, true);
        } else if (eventRecord != null) {
            eventRecord.e(eventRecord.w() + 1);
            eventRecord.g(String.valueOf(i));
            eventRecord.f(str);
            arrayList2.add(eventRecord);
        }
    }

    private void a(List<String> list, ArrayList<String> arrayList, List<AdEventResultV2> list2) {
        if (com.huawei.openalliance.ad.utils.bm.a(list)) {
            return;
        }
        if (com.huawei.openalliance.ad.utils.bm.a(list2)) {
            arrayList.addAll(list);
            return;
        }
        ArrayList arrayList2 = new ArrayList(list);
        for (AdEventResultV2 adEventResultV2 : list2) {
            if (adEventResultV2 != null) {
                arrayList2.remove(adEventResultV2.a());
            }
        }
        arrayList.addAll(arrayList2);
    }

    private void a(List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f20133b.b(a(), list);
    }

    private void a(String str, String str2, Collection<EventRecord> collection) {
        if (com.huawei.openalliance.ad.utils.bm.a(collection)) {
            return;
        }
        for (EventRecord eventRecord : collection) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(eventRecord.i());
            this.f20133b.a(a(), str, str2 == null ? eventRecord.v() : str2, eventRecord.w() + 1, arrayList);
            a(eventRecord, false);
        }
    }

    private void a(Runnable runnable) {
        b().execute(new com.huawei.openalliance.ad.utils.dm(runnable));
    }

    private void a(EventRecord eventRecord, boolean z) {
        if (eventRecord == null || !c(eventRecord.j())) {
            return;
        }
        new com.huawei.openalliance.ad.analysis.c(this.f20132a).a(eventRecord.j(), eventRecord.m(), eventRecord.S(), eventRecord.l(), eventRecord.R(), z);
    }

    private void a(EventRecord eventRecord, ContentRecord contentRecord, boolean z) {
        if (eventRecord == null || !c(eventRecord.j())) {
            return;
        }
        new com.huawei.openalliance.ad.analysis.c(this.f20132a).a(eventRecord.j(), contentRecord, z);
    }

    qm(Context context, tf tfVar) {
        this.f20132a = context.getApplicationContext();
        this.f20133b = fb.a(context);
        this.f20134c = tfVar;
        this.d = fi.a(context);
    }
}
