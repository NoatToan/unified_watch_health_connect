package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.AppInfo;

/* JADX INFO: loaded from: classes12.dex */
public class ds extends dr {
    @Override // com.huawei.openalliance.ad.dr
    public void a(AppInfo appInfo, ContentRecord contentRecord, long j) {
        if (appInfo != null && contentRecord != null) {
            a(appInfo, contentRecord);
        } else {
            hw.b("ConfirmDownloadAlertStrategy", "appInfo or contentRecord is empty");
            b(appInfo);
        }
    }

    private void a(final AppInfo appInfo, final ContentRecord contentRecord) {
        hw.b("ConfirmDownloadAlertStrategy", "showConfirmDownloadAlert, context:" + a());
        new com.huawei.openalliance.ad.analysis.i(a()).a(contentRecord);
        com.huawei.openalliance.ad.download.app.c.a(a(), "11".equals(appInfo.z()), new com.huawei.openalliance.ad.utils.ac.a() { // from class: com.huawei.openalliance.ad.ds.1
            @Override // com.huawei.openalliance.ad.utils.ac.a
            public void a(boolean z) {
                new com.huawei.openalliance.ad.analysis.i(ds.this.a()).c(contentRecord);
                ds.this.b(appInfo);
            }

            @Override // com.huawei.openalliance.ad.utils.ac.a
            public void a() {
                new com.huawei.openalliance.ad.analysis.i(ds.this.a()).b(contentRecord);
                ds.this.a(appInfo);
            }
        });
    }

    public ds(Context context) {
        super(context);
    }
}
