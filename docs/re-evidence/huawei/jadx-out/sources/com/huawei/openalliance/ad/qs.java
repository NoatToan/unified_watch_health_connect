package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.Monitor;
import com.huawei.openalliance.ad.beans.server.ThirdReportRsp;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.EncryptionField;
import com.huawei.openalliance.ad.db.bean.ThirdPartyEventRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class qs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Executor f20152a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.huawei.openalliance.ad.utils.p("ThirdMonitor-Event"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f20153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gc f20154c;
    private pk d;
    private gf e;
    private tf f;
    private List<a> g;

    public interface a {
        String a(String str);
    }

    public void a(List<a> list) {
        this.g = new ArrayList(list);
    }

    void a(final String str, final ContentRecord contentRecord) {
        final List<Monitor> listA = a(str, contentRecord, this.f20153b);
        if (com.huawei.openalliance.ad.utils.c.a(contentRecord) && com.huawei.openalliance.ad.utils.bm.a(listA) && fp.b(this.f20153b).aD().contains(str)) {
            hw.b("ThirdMonitorReporter", "onEventNotInThirdMonitor, eventType: %s", str);
            new com.huawei.openalliance.ad.analysis.c(this.f20153b).c(contentRecord, str);
        }
        if (com.huawei.openalliance.ad.utils.bm.a(listA)) {
            return;
        }
        if (hw.a()) {
            hw.a("ThirdMonitorReporter", "reportThirdMonitor, eventType: %s, monitors: %s", str, com.huawei.openalliance.ad.utils.ds.a(com.huawei.openalliance.ad.utils.bk.b(listA)));
        }
        com.huawei.openalliance.ad.utils.o.b(new Runnable() { // from class: com.huawei.openalliance.ad.qs.1
            @Override // java.lang.Runnable
            public void run() {
                qs.this.a((List<Monitor>) listA, str, contentRecord);
            }
        });
    }

    void a() {
        a(new Runnable() { // from class: com.huawei.openalliance.ad.qs.2
            @Override // java.lang.Runnable
            public void run() {
                qs.this.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        String str;
        List<ThirdPartyEventRecord> listB = this.f20154c.b(120000L, 3);
        hw.b("ThirdMonitorReporter", "uploadThirdPartyCacheEvents size: " + listB.size());
        if (com.huawei.openalliance.ad.utils.bm.a(listB)) {
            return;
        }
        this.f20154c.a(com.huawei.openalliance.ad.utils.as.c(), b(listB));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        byte[] bArrB = com.huawei.openalliance.ad.utils.cw.b(this.f20153b);
        for (ThirdPartyEventRecord thirdPartyEventRecord : listB) {
            EncryptionField<String> encryptionFieldB = thirdPartyEventRecord.b();
            if (encryptionFieldB == null) {
                str = "urlField is empty";
            } else {
                pk.a aVarA = this.d.a(encryptionFieldB.a(bArrB), thirdPartyEventRecord.d(), thirdPartyEventRecord.i());
                if (aVarA == null) {
                    str = "monitorUrl is empty";
                } else {
                    String strA = aVarA.a();
                    if (TextUtils.isEmpty(strA)) {
                        hw.c("ThirdMonitorReporter", "formatThirdPartyUrl is empty when format third party cache url ");
                        arrayList.add(thirdPartyEventRecord.a());
                    } else {
                        ContentRecord contentRecord = new ContentRecord();
                        contentRecord.b(thirdPartyEventRecord.c());
                        contentRecord.d(thirdPartyEventRecord.e());
                        contentRecord.e(thirdPartyEventRecord.f());
                        contentRecord.o(thirdPartyEventRecord.h());
                        contentRecord.h(thirdPartyEventRecord.i());
                        long jC = com.huawei.openalliance.ad.utils.as.c();
                        ThirdReportRsp thirdReportRspB = this.e.b(strA);
                        long jC2 = com.huawei.openalliance.ad.utils.as.c() - jC;
                        if (a(thirdReportRspB)) {
                            arrayList.add(thirdPartyEventRecord.a());
                            a(this.f20153b, thirdPartyEventRecord.g(), strA, aVarA.b(), contentRecord, jC2);
                        } else {
                            arrayList2.add(thirdPartyEventRecord.a());
                            this.f20154c.a(thirdPartyEventRecord.a(), aVarA.b());
                            a(this.f20153b, thirdPartyEventRecord.g(), strA, aVarA.b(), jC2, contentRecord, thirdReportRspB);
                        }
                    }
                }
            }
            hw.b("ThirdMonitorReporter", str);
            arrayList.add(thirdPartyEventRecord.a());
        }
        this.f20154c.b(com.huawei.openalliance.ad.utils.as.c(), arrayList2);
        this.f20154c.a(arrayList);
    }

    private static List<String> b(List<ThirdPartyEventRecord> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ThirdPartyEventRecord> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        return arrayList;
    }

    private static boolean a(ThirdReportRsp thirdReportRsp) {
        return thirdReportRsp != null && thirdReportRsp.responseCode == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<Monitor> list, String str, ContentRecord contentRecord) {
        byte[] bArr;
        Iterator<Monitor> it;
        if (list == null || list.isEmpty()) {
            hw.c("ThirdMonitorReporter", "fail to report to thirdParty event, thirdParty  is empty");
            return;
        }
        byte[] bArrB = com.huawei.openalliance.ad.utils.cw.b(this.f20153b);
        Iterator<Monitor> it2 = list.iterator();
        while (it2.hasNext()) {
            Monitor next = it2.next();
            List<String> listB = next.b();
            if (listB == null || listB.isEmpty()) {
                bArr = bArrB;
                it = it2;
                hw.c("ThirdMonitorReporter", "thirdParty monitor urls is empty ");
            } else {
                int iC = next.c();
                for (String str2 : listB) {
                    if (!com.huawei.openalliance.ad.utils.dg.b(str2)) {
                        hw.b("ThirdMonitorReporter", "report third party event，excute origin url, eventType:%s, originUrl:%s", str, com.huawei.openalliance.ad.utils.ds.a(str2));
                        if (jv.a(contentRecord.o()) || !jv.a(contentRecord.b(), str2)) {
                            String strA = a(str2);
                            pk.a aVarA = this.d.a(strA, contentRecord.aM());
                            if (aVarA != null) {
                                String strA2 = aVarA.a();
                                if (TextUtils.isEmpty(strA2)) {
                                    hw.c("ThirdMonitorReporter", "url is empty when format third party url ");
                                } else {
                                    hw.b("ThirdMonitorReporter", "report third party event, eventType:%s, url:%s", str, com.huawei.openalliance.ad.utils.ds.a(strA2));
                                    long jC = com.huawei.openalliance.ad.utils.as.c();
                                    ThirdReportRsp thirdReportRspB = this.e.b(strA2);
                                    long jC2 = com.huawei.openalliance.ad.utils.as.c() - jC;
                                    if (a(thirdReportRspB)) {
                                        a(this.f20153b, str, strA2, aVarA.b(), contentRecord, jC2);
                                    } else if (iC == 1) {
                                        ThirdPartyEventRecord thirdPartyEventRecord = new ThirdPartyEventRecord(this.f.a(), strA, aVarA.b());
                                        thirdPartyEventRecord.d(contentRecord.o());
                                        thirdPartyEventRecord.c(contentRecord.n());
                                        thirdPartyEventRecord.a(contentRecord.f());
                                        thirdPartyEventRecord.b(contentRecord.ao());
                                        thirdPartyEventRecord.a(bArrB);
                                        thirdPartyEventRecord.e(str);
                                        thirdPartyEventRecord.a(System.currentTimeMillis());
                                        thirdPartyEventRecord.b(contentRecord.aM());
                                        this.f20154c.a(thirdPartyEventRecord);
                                        a(this.f20153b, str, strA2, aVarA.b(), jC2, contentRecord, thirdReportRspB);
                                    }
                                    it2 = it2;
                                    bArrB = bArrB;
                                }
                            }
                        } else {
                            hw.b("ThirdMonitorReporter", "mz url had reported by ICustMonitor.");
                        }
                    }
                    it2 = it2;
                    bArrB = bArrB;
                }
                bArr = bArrB;
                it = it2;
            }
            it2 = it;
            bArrB = bArr;
        }
    }

    private void a(Runnable runnable) {
        f20152a.execute(new com.huawei.openalliance.ad.utils.dm(runnable));
    }

    private static void a(Context context, String str, String str2, String str3, ContentRecord contentRecord, long j) {
        if (contentRecord == null) {
            return;
        }
        new com.huawei.openalliance.ad.analysis.c(context).a(str, str2, str3, j, contentRecord);
    }

    private static void a(Context context, String str, String str2, String str3, long j, ContentRecord contentRecord, ThirdReportRsp thirdReportRsp) {
        String str4;
        if (contentRecord == null) {
            return;
        }
        com.huawei.openalliance.ad.analysis.c cVar = new com.huawei.openalliance.ad.analysis.c(context);
        StringBuilder sb = new StringBuilder();
        if (thirdReportRsp != null) {
            sb.append("httpCode:");
            sb.append(thirdReportRsp.a());
            if (!TextUtils.isEmpty(thirdReportRsp.errorReason)) {
                sb.append(", errorReason:");
                str4 = thirdReportRsp.errorReason;
            }
            cVar.a(str, str2, sb.toString(), str3, j, contentRecord);
        }
        str4 = "httpCode:-1";
        sb.append(str4);
        cVar.a(str, str2, sb.toString(), str3, j, contentRecord);
    }

    public static List<Monitor> a(String str, ContentRecord contentRecord, Context context) {
        EncryptionField<List<Monitor>> encryptionFieldM;
        List<Monitor> listA;
        if (contentRecord == null || (encryptionFieldM = contentRecord.M()) == null || (listA = encryptionFieldM.a(context)) == null || listA.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Monitor monitor : listA) {
            if (str.equals(monitor.a())) {
                arrayList.add(monitor);
            }
        }
        return arrayList;
    }

    private String a(String str) {
        if (!com.huawei.openalliance.ad.utils.bm.a(this.g) && !TextUtils.isEmpty(str)) {
            for (a aVar : this.g) {
                if (aVar != null) {
                    str = aVar.a(str);
                }
            }
        }
        return str;
    }

    qs(Context context, tf tfVar) {
        this.f20153b = context.getApplicationContext();
        this.f20154c = fb.a(context);
        this.d = pk.a(context);
        this.e = fi.a(context);
        this.f = tfVar;
    }
}
