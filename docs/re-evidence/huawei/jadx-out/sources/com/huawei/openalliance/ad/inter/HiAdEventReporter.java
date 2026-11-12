package com.huawei.openalliance.ad.inter;

import android.content.Context;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AdAssistEventRecord;
import com.huawei.openalliance.ad.inter.data.AdEventRecord;
import com.huawei.openalliance.ad.inter.data.AdEventType;
import com.huawei.openalliance.ad.pc;
import com.huawei.openalliance.ad.pl;
import com.huawei.openalliance.ad.sw;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.ct;
import com.huawei.openalliance.ad.utils.dg;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class HiAdEventReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HiAdEventReporter f19050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f19051b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f19052c;
    private com.huawei.openalliance.ad.analysis.c d;

    public void reportEvent(List<AdEventRecord> list) {
        List<AdEventRecord> listB = b(list);
        hw.b("HiAdEventReporter", "batch report events size:%s", Integer.valueOf(listB.size()));
        if (bm.a(listB)) {
            return;
        }
        c(listB);
        int i = 0;
        while (i < listB.size()) {
            AdEventRecord adEventRecord = listB.get(i);
            com.huawei.openalliance.ad.inter.data.e eVar = (com.huawei.openalliance.ad.inter.data.e) adEventRecord.a();
            ContentRecord contentRecordA = pl.a(eVar);
            if (contentRecordA != null) {
                String strD = listB.get(i).d();
                boolean z = i >= listB.size() - 1;
                Context context = this.f19052c;
                pc pcVar = new pc(context, sw.a(context, eVar.e()), contentRecordA);
                if (adEventRecord.e() != null && adEventRecord.e().longValue() != 0) {
                    pcVar.a(adEventRecord.e());
                }
                if ("imp".equalsIgnoreCase(strD)) {
                    a(contentRecordA, z, pcVar);
                    a(eVar, z, pcVar, adEventRecord.c() - adEventRecord.b());
                } else if (AdEventType.SHOW_START.equalsIgnoreCase(strD)) {
                    a(contentRecordA, z, pcVar);
                } else if ("click".equalsIgnoreCase(strD)) {
                    com.huawei.openalliance.ad.processor.eventbeans.b.a aVar = new com.huawei.openalliance.ad.processor.eventbeans.b.a();
                    aVar.b(ClickDestination.ADCONTENTINTERFACE).a((Integer) 12).b(z);
                    pcVar.a(aVar.a());
                } else if (AdEventType.INTENTSUCCESS.equalsIgnoreCase(strD)) {
                    pcVar.a(EventType.INTENTSUCCESS, (Integer) 1, (Integer) null, z);
                    if (contentRecordA.ag() != null && !dg.b(contentRecordA.ag().getPackageName())) {
                        com.huawei.openalliance.ad.utils.dcservice.c.a aVar2 = new com.huawei.openalliance.ad.utils.dcservice.c.a();
                        aVar2.a(contentRecordA, this.f19052c).c(contentRecordA.ag().getPackageName());
                        com.huawei.openalliance.ad.utils.dcservice.a.a(this.f19052c, aVar2.a());
                    }
                }
            }
            i++;
        }
    }

    public void reportAssistEvent(List<AdAssistEventRecord> list) {
        List<AdAssistEventRecord> listA = a(list);
        if (bm.a(listA)) {
            hw.c("HiAdEventReporter", "no validate events");
        } else {
            new pc(this.f19052c, null, null).a(listA);
        }
    }

    public static HiAdEventReporter getInstance(Context context) {
        return a(context);
    }

    private void c(List<AdEventRecord> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            String slotId = ((com.huawei.openalliance.ad.inter.data.e) list.get(i).a()).getSlotId();
            if (ct.a(this.f19052c, slotId)) {
                hashSet2.add(slotId);
            } else {
                hashSet.add(slotId);
            }
        }
        if (!bm.a(hashSet2)) {
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                HiAd.a(this.f19052c).b((String) it.next());
            }
        }
        if (bm.a(hashSet)) {
            return;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            HiAd.a(this.f19052c).c((String) it2.next());
        }
    }

    private List<AdEventRecord> b(List<AdEventRecord> list) {
        com.huawei.openalliance.ad.inter.data.e eVar;
        ArrayList arrayList = new ArrayList();
        if (!bm.a(list)) {
            for (int i = 0; i < list.size(); i++) {
                AdEventRecord adEventRecord = list.get(i);
                if (adEventRecord != null && (adEventRecord.a() instanceof com.huawei.openalliance.ad.inter.data.e) && (eVar = (com.huawei.openalliance.ad.inter.data.e) adEventRecord.a()) != null && eVar.isAdIdInWhiteList() && a(adEventRecord)) {
                    arrayList.add(adEventRecord);
                }
            }
        }
        return arrayList;
    }

    private boolean a(AdEventRecord adEventRecord) {
        if (!"imp".equalsIgnoreCase(adEventRecord.d())) {
            return true;
        }
        if (adEventRecord.f() != null && adEventRecord.f().booleanValue()) {
            return true;
        }
        com.huawei.openalliance.ad.inter.data.e eVar = (com.huawei.openalliance.ad.inter.data.e) adEventRecord.a();
        long jC = adEventRecord.c() - adEventRecord.b();
        if (eVar.getMaxEffectiveShowTime() == 0 || eVar.getMinEffectiveShowTime() >= eVar.getMaxEffectiveShowTime()) {
            if (jC >= eVar.getMinEffectiveShowTime()) {
                return true;
            }
        } else if (jC >= eVar.getMinEffectiveShowTime() && jC <= eVar.getMaxEffectiveShowTime()) {
            return true;
        }
        this.d.a(this.f19052c, eVar, jC);
        return false;
    }

    private void a(com.huawei.openalliance.ad.inter.data.e eVar, boolean z, pc pcVar, long j) {
        com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229a = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a();
        c0229a.a(Long.valueOf(j)).a(Integer.valueOf(eVar.getMinEffectiveShowRatio())).b(z).b((Integer) 7);
        pcVar.a(c0229a.a());
    }

    private void a(ContentRecord contentRecord, boolean z, pc pcVar) {
        if (contentRecord == null) {
            return;
        }
        contentRecord.c(String.valueOf(as.c()));
        pcVar.a(contentRecord);
        pcVar.a(z);
    }

    private List<AdAssistEventRecord> a(List<AdAssistEventRecord> list) {
        ArrayList arrayList = new ArrayList();
        if (bm.a(list)) {
            hw.c("HiAdEventReporter", "events is null");
            return arrayList;
        }
        hw.b("HiAdEventReporter", "Assist report events size:%s", Integer.valueOf(list.size()));
        for (AdAssistEventRecord adAssistEventRecord : list) {
            if (dg.b(adAssistEventRecord.f()) || dg.b(adAssistEventRecord.a()) || dg.b(adAssistEventRecord.b()) || dg.b(adAssistEventRecord.e()) || dg.b(adAssistEventRecord.d()) || dg.b(adAssistEventRecord.c())) {
                hw.c("HiAdEventReporter", "this event is invalidate");
            } else {
                arrayList.add(adAssistEventRecord);
            }
        }
        return arrayList;
    }

    private static HiAdEventReporter a(Context context) {
        HiAdEventReporter hiAdEventReporter;
        synchronized (f19051b) {
            if (f19050a == null) {
                f19050a = new HiAdEventReporter(context);
            }
            hiAdEventReporter = f19050a;
        }
        return hiAdEventReporter;
    }

    private HiAdEventReporter(Context context) {
        this.f19052c = context.getApplicationContext();
        this.d = new com.huawei.openalliance.ad.analysis.c(context);
    }
}
