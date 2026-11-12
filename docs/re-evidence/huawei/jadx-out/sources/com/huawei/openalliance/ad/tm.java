package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.AppInfo;

/* JADX INFO: loaded from: classes12.dex */
public class tm extends com.huawei.openalliance.ad.uriaction.interfaces.a {
    private rc e;

    @Override // com.huawei.openalliance.ad.uriaction.interfaces.a
    public boolean a() {
        try {
            hw.b("HarmonyAppAction", "handle harmony app action");
            AppInfo appInfoAg = this.f20324b.ag();
            if (appInfoAg == null || TextUtils.isEmpty(appInfoAg.getPackageName())) {
                hw.b("HarmonyAppAction", "parameters occur error");
            } else {
                String packageName = appInfoAg.getPackageName();
                if (com.huawei.openalliance.ad.utils.aq.a(this.f20323a, appInfoAg, packageName, this.f20324b)) {
                    c(ClickDestination.HARMONY_APP);
                    com.huawei.openalliance.ad.download.app.l.a(this.f20323a, this.f20324b.ag());
                    this.e.a(EventType.INTENTSUCCESS, (Integer) 1, (Integer) null);
                    return true;
                }
                this.e.a(EventType.INTENTFAIL, (Integer) 1, Integer.valueOf(com.huawei.openalliance.ad.utils.aq.a(this.f20323a, packageName) ? 2 : 1));
                if (com.huawei.openalliance.ad.utils.aq.a(this.f20323a, packageName, this.f20324b)) {
                    c(ClickDestination.HARMONY_APP);
                    com.huawei.openalliance.ad.download.app.l.a(this.f20323a, this.f20324b.ag());
                    this.e.a((Integer) 1);
                    return true;
                }
            }
        } catch (Throwable th) {
            hw.c("HarmonyAppAction", "handle uri exception: %s", th.getClass().getSimpleName());
        }
        return b();
    }

    public tm(Context context, ContentRecord contentRecord) {
        super(context, contentRecord);
        pc pcVar = new pc(context, sw.a(context, contentRecord.f()));
        this.e = pcVar;
        pcVar.a(contentRecord);
    }
}
