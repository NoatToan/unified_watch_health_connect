package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.AppInfo;

/* JADX INFO: loaded from: classes12.dex */
public class dt extends dr {
    @Override // com.huawei.openalliance.ad.dr
    public void a(AppInfo appInfo, ContentRecord contentRecord, long j) {
        if (appInfo != null && contentRecord != null) {
            b(appInfo, contentRecord, j);
        } else {
            hw.b("TrafficReminder", "appInfo or contentRecord is empty");
            b(appInfo);
        }
    }

    private void b(final AppInfo appInfo, final ContentRecord contentRecord, long j) {
        new com.huawei.openalliance.ad.analysis.i(a()).a(contentRecord, "2");
        com.huawei.openalliance.ad.download.app.c.a(a(), j, new com.huawei.openalliance.ad.utils.ac.a() { // from class: com.huawei.openalliance.ad.dt.1
            @Override // com.huawei.openalliance.ad.utils.ac.a
            public void a(boolean z) {
                ContentRecord contentRecord2;
                String str;
                com.huawei.openalliance.ad.analysis.i iVar = new com.huawei.openalliance.ad.analysis.i(dt.this.a());
                if (z) {
                    dt.this.c(appInfo);
                    contentRecord2 = contentRecord;
                    str = "2";
                } else {
                    dt.this.b(appInfo);
                    contentRecord2 = contentRecord;
                    str = "3";
                }
                iVar.b(contentRecord2, str);
            }

            @Override // com.huawei.openalliance.ad.utils.ac.a
            public void a() {
                new com.huawei.openalliance.ad.analysis.i(dt.this.a()).b(contentRecord, "1");
                dt.this.a(appInfo);
            }
        });
    }

    public dt(Context context) {
        super(context);
    }
}
