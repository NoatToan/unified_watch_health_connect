package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.SdkExposureHistoryRecord;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class fc extends es implements gd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static fc f18745c;
    private static final byte[] d = new byte[0];

    @Override // com.huawei.openalliance.ad.gd
    public void a(Class<? extends com.huawei.openalliance.ad.db.bean.a> cls, SdkExposureHistoryRecord sdkExposureHistoryRecord) {
        hw.a("HistoricalExposureDao", "insertHistoricalExposure DB start");
        hw.a("HistoricalExposureDao", "insertHistoricalExposure DB success: %s", Long.valueOf(a(cls, sdkExposureHistoryRecord.d(this.f18718a))));
    }

    @Override // com.huawei.openalliance.ad.gd
    public void a(Class<? extends com.huawei.openalliance.ad.db.bean.a> cls, long j) {
        long jC = com.huawei.openalliance.ad.utils.as.c() - j;
        hw.a("HistoricalExposureDao", "deleteHistoricalExposure DB start, expired time: %s", Long.valueOf(jC));
        hw.a("HistoricalExposureDao", "deleteHistoricalExposure DB success: %s", Integer.valueOf(a(cls, fq.EXPOSURE_HISTORY_DELETE_EXPIRE_WHERE, new String[]{String.valueOf(jC)})));
    }

    public List<SdkExposureHistoryRecord> a(Class<? extends com.huawei.openalliance.ad.db.bean.a> cls, String str, int i) {
        hw.a("HistoricalExposureDao", "queryExposureHistoryData DB start, pkgname: %s, exposureHistoryCount: %s", str, Integer.valueOf(i));
        return a(cls, null, fq.QUERY_EXPOSURE_HISTORYS_WHERE, new String[]{str}, "impTime desc", String.valueOf(i));
    }

    public static fc a(Context context) {
        fc fcVar;
        synchronized (d) {
            if (f18745c == null) {
                f18745c = new fc(context);
            }
            fcVar = f18745c;
        }
        return fcVar;
    }

    protected fc(Context context) {
        super(context);
    }
}
