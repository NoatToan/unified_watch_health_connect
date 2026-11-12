package com.huawei.openalliance.ad;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.constant.RewardKeys;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.EventRecord;

/* JADX INFO: loaded from: classes12.dex */
public class bs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f18289a;

    public void a(EventRecord eventRecord, ContentRecord contentRecord, boolean z, boolean z2, rc rcVar) {
        if (eventRecord == null || contentRecord == null || rcVar == null) {
            hw.b("EventRecordUitl", "params is null");
            return;
        }
        a(this.f18289a, eventRecord, contentRecord);
        hw.b("EventRecordUitl", "start report event, eventType: %s", eventRecord.j());
        rcVar.a(eventRecord, z, z2);
    }

    public void a(Bundle bundle, ContentRecord contentRecord, rc rcVar) {
        if (bundle == null || contentRecord == null || rcVar == null) {
            hw.b("EventRecordUitl", "param or ad is null");
            return;
        }
        gr grVar = new gr(bundle);
        String strD = grVar.d("eventType");
        if (TextUtils.isEmpty(strD)) {
            hw.b("EventRecordUitl", "eventType is null");
            return;
        }
        String strD2 = grVar.d(RewardKeys.EVENT_RECORD);
        boolean zA = grVar.a("is_report_now", false);
        boolean zA2 = grVar.a("is_check_discard", false);
        String strD3 = grVar.d("showId");
        if (!com.huawei.openalliance.ad.utils.dg.b(strD3)) {
            contentRecord.c(strD3);
        }
        EventRecord eventRecord = (EventRecord) com.huawei.openalliance.ad.utils.bk.b(strD2, EventRecord.class, new Class[0]);
        if (eventRecord == null) {
            hw.b("EventRecordUitl", "eventRecord is null");
        } else {
            eventRecord.c(strD);
            a(eventRecord, contentRecord, zA, zA2, rcVar);
        }
    }

    private void a(Context context, EventRecord eventRecord, ContentRecord contentRecord) {
        if (contentRecord == null || eventRecord == null) {
            return;
        }
        String strJ = eventRecord.j();
        eventRecord.d(contentRecord.f());
        eventRecord.a(contentRecord.H());
        eventRecord.d(com.huawei.openalliance.ad.utils.as.c());
        eventRecord.d(contentRecord.l());
        eventRecord.a(contentRecord.bw());
        eventRecord.i(contentRecord.ao());
        eventRecord.y(contentRecord.ai());
        eventRecord.x(contentRecord.o());
        eventRecord.f(contentRecord.aM());
        eventRecord.n(contentRecord.aZ());
        eventRecord.h(contentRecord.m());
        String strBi = contentRecord.bi();
        if (TextUtils.isEmpty(strBi)) {
            strBi = context.getPackageName();
        }
        eventRecord.H(strBi);
        if (EventType.SHOW.value().equals(strJ) || EventType.SUPPLEMENTIMP.value().equals(strJ)) {
            eventRecord.w(contentRecord.aq());
            eventRecord.q(contentRecord.aA());
        }
        if (EventType.VIDEOTIME.value().equals(strJ)) {
            eventRecord.g(contentRecord.bh());
        }
    }

    public bs(Context context) {
        this.f18289a = context;
    }
}
