package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.openalliance.ad.beans.inner.ContentFilterParam;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class cs {
    public static void a(Context context, String str, com.huawei.openalliance.ad.utils.dcservice.c cVar, String str2, ContentRecord contentRecord) {
        try {
            com.huawei.openalliance.ad.analysis.c cVar2 = new com.huawei.openalliance.ad.analysis.c(context.getApplicationContext());
            if (cVar != null) {
                cVar2.a(str, contentRecord, str2, cVar.f(), cVar.g());
            } else {
                cVar2.a(str, contentRecord, str2, (String) null, (String) null);
            }
        } catch (Exception e) {
            hw.c("ReportEventUtil", "reportActionFail, ex: %s", e.getClass().getSimpleName());
        }
    }

    public static void a(final Context context, final com.huawei.openalliance.ad.utils.dcservice.c cVar, final String str, final String str2) {
        if (context == null || cVar == null) {
            return;
        }
        o.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.cs.3
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(context.getApplicationContext()).a(context, cVar, str, str2);
            }
        });
    }

    public static void a(final Context context, final com.huawei.openalliance.ad.utils.dcservice.c cVar, final String str) {
        if (cVar == null) {
            return;
        }
        o.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.cs.1
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(context.getApplicationContext()).a(cVar, str);
            }
        });
    }

    public static void a(final Context context, final ContentFilterParam contentFilterParam) {
        if (contentFilterParam == null || contentFilterParam.c() == 3) {
            hw.a("ReportEventUtil", "is preCheck filter return");
        } else {
            o.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.cs.2
                @Override // java.lang.Runnable
                public void run() {
                    new com.huawei.openalliance.ad.analysis.c(context.getApplicationContext()).a(contentFilterParam);
                }
            });
        }
    }
}
