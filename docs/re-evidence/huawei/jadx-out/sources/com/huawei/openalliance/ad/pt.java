package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.db.bean.ContentRecord;

/* JADX INFO: loaded from: classes12.dex */
public class pt {
    public static AdEventReport a(ContentRecord contentRecord) {
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
}
