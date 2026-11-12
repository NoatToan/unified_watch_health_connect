package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.SdkExposureHistoryRecord;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.EventRecord;

/* JADX INFO: loaded from: classes12.dex */
public class qt implements qu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20159a;

    @Override // com.huawei.openalliance.ad.qu
    public void a(final EventRecord eventRecord, final ContentRecord contentRecord) {
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.qt.1
            @Override // java.lang.Runnable
            public void run() {
                if (qt.this.f20159a == null || eventRecord == null || contentRecord == null) {
                    return;
                }
                fc fcVarA = fc.a(qt.this.f20159a);
                String strN = contentRecord.j() != null ? contentRecord.j().n() : null;
                hw.a("ExposureHistory", "addShowEventToHistory, slotId: %s, creativeId: %s, creativeUniqueId: %s, impTime: %s, callerPkg: %s, appId: %s", contentRecord.n(), contentRecord.o(), contentRecord.bu(), Long.valueOf(eventRecord.k()), qt.this.f20159a.getPackageName(), strN);
                SdkExposureHistoryRecord sdkExposureHistoryRecord = new SdkExposureHistoryRecord();
                sdkExposureHistoryRecord.d(contentRecord.n());
                sdkExposureHistoryRecord.b(contentRecord.o());
                sdkExposureHistoryRecord.c(contentRecord.bu());
                sdkExposureHistoryRecord.a(eventRecord.k());
                sdkExposureHistoryRecord.a(strN);
                sdkExposureHistoryRecord.e(qt.this.f20159a.getPackageName());
                fcVarA.a(qt.this.a(), sdkExposureHistoryRecord);
                fcVarA.a(qt.this.a(), 604800000L);
            }
        });
    }

    protected Class<? extends com.huawei.openalliance.ad.db.bean.a> a() {
        return SdkExposureHistoryRecord.class;
    }

    public qt(Context context) {
        this.f20159a = context.getApplicationContext();
    }
}
