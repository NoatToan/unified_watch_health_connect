package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.SdkExposureHistoryRecord;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f18746a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static fd f18747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gk f18748c;
    private List<SdkExposureHistoryRecord> d;

    public void c(final Context context) {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.fd.1
            @Override // java.lang.Runnable
            public void run() {
                hw.b("ExposureHistoryHandler", "sync exposure history record start");
                fd.this.d(context);
            }
        });
    }

    public List<SdkExposureHistoryRecord> b(Context context) {
        if (!com.huawei.openalliance.ad.utils.bm.a(a())) {
            hw.a("ExposureHistoryHandler", "sdk history exposure data from cache");
        }
        return a();
    }

    public void a(List<SdkExposureHistoryRecord> list) {
        this.d = list;
    }

    public List<SdkExposureHistoryRecord> a() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<SdkExposureHistoryRecord> d(Context context) {
        if (context == null || com.huawei.openalliance.ad.utils.dg.b(context.getPackageName())) {
            hw.a("ExposureHistoryHandler", "assemble exposure history caller app isNull");
            return Collections.EMPTY_LIST;
        }
        int iAt = this.f18748c.at();
        if (iAt <= 0) {
            hw.a("ExposureHistoryHandler", "historyCount less than or equal to 0, historyCount %s", Integer.valueOf(iAt));
            return Collections.EMPTY_LIST;
        }
        List<SdkExposureHistoryRecord> listA = fc.a(context).a(SdkExposureHistoryRecord.class, context.getPackageName(), Math.min(iAt, 10));
        hw.a("ExposureHistoryHandler", "sdk history exposure data is: %s .", com.huawei.openalliance.ad.utils.bk.b(listA));
        a(listA);
        return listA;
    }

    public static fd a(Context context) {
        synchronized (f18746a) {
            if (f18747b == null) {
                f18747b = new fd(context);
            }
        }
        return f18747b;
    }

    private fd(Context context) {
        this.f18748c = fp.b(context);
    }
}
