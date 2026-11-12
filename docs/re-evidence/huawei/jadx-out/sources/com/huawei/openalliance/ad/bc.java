package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.hms.ads.jsb.inner.data.H5Ad;
import com.huawei.openalliance.ad.db.bean.ContentRecord;

/* JADX INFO: loaded from: classes12.dex */
public abstract class bc extends j {
    protected abstract String b();

    protected rc d(Context context, String str) {
        H5Ad h5Ad = (H5Ad) com.huawei.openalliance.ad.utils.bk.a(str, H5Ad.class, new Class[0]);
        ContentRecord contentRecordB = b(context, str);
        if (contentRecordB == null) {
            hw.c("JsbBaseReportEvent", "%s: content is null", b());
            return null;
        }
        pc pcVar = new pc(context, sw.a(context, h5Ad.a()));
        pcVar.a(contentRecordB);
        return pcVar;
    }

    protected com.huawei.openalliance.ad.analysis.c b(Context context) {
        return new com.huawei.openalliance.ad.analysis.c(context);
    }

    public bc(String str) {
        super(str);
    }
}
