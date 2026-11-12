package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.AppInfo;

/* JADX INFO: loaded from: classes12.dex */
public class tn extends com.huawei.openalliance.ad.uriaction.interfaces.a {
    private rc e;

    @Override // com.huawei.openalliance.ad.uriaction.interfaces.a
    public boolean a() {
        try {
            hw.b("HarmonyServiceAction", "handle harmony service action");
            AppInfo appInfoAg = this.f20324b.ag();
            if (appInfoAg == null || TextUtils.isEmpty(appInfoAg.getPackageName()) || TextUtils.isEmpty(appInfoAg.A())) {
                hw.b("HarmonyServiceAction", "parameters occur error");
            } else {
                String packageName = appInfoAg.getPackageName();
                if (com.huawei.openalliance.ad.utils.aq.a(this.f20323a, packageName, appInfoAg.A())) {
                    c(ClickDestination.HARMONY_SERVICE);
                    com.huawei.openalliance.ad.download.app.l.a(this.f20323a, this.f20324b.ag());
                    this.e.a(EventType.INTENTSUCCESS, (Integer) 1, (Integer) null);
                    return true;
                }
                this.e.a(EventType.INTENTFAIL, (Integer) 1, Integer.valueOf(com.huawei.openalliance.ad.utils.aq.a(this.f20323a, packageName) ? 2 : 1));
            }
        } catch (Throwable th) {
            hw.c("HarmonyServiceAction", "handle uri exception: %s", th.getClass().getSimpleName());
        }
        return b();
    }

    public tn(Context context, ContentRecord contentRecord) {
        super(context, contentRecord);
        pc pcVar = new pc(context, sw.a(context, contentRecord.f()));
        this.e = pcVar;
        pcVar.a(contentRecord);
    }
}
