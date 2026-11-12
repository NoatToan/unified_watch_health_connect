package com.huawei.openalliance.ad;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.inter.data.AppInfo;

/* JADX INFO: loaded from: classes12.dex */
public class ti extends com.huawei.openalliance.ad.uriaction.interfaces.a {
    private rc e;

    @Override // com.huawei.openalliance.ad.uriaction.interfaces.a
    public boolean a() {
        String str;
        hw.b("AppDeepLinkAction", "handle AppDeepLinkAction");
        try {
            if (this.f20324b != null && this.f20324b.ag() != null) {
                AppInfo appInfoAg = this.f20324b.ag();
                com.huawei.openalliance.ad.utils.dcservice.c.a aVar = new com.huawei.openalliance.ad.utils.dcservice.c.a();
                aVar.a(appInfoAg).a(this.f20324b, this.f20323a);
                Intent intentA = com.huawei.openalliance.ad.utils.k.a(this.f20323a, appInfoAg.t(), appInfoAg.u(), aVar.a(), true);
                if (intentA == null) {
                    hw.c("AppDeepLinkAction", "cannot find target activity");
                    d();
                    return b();
                }
                intentA.addFlags(268435456);
                com.huawei.openalliance.ad.utils.dcservice.c.a aVar2 = new com.huawei.openalliance.ad.utils.dcservice.c.a();
                aVar2.a(this.f20324b, this.f20323a).a(appInfoAg).a(intentA);
                com.huawei.openalliance.ad.utils.k.a(this.f20323a, intentA, aVar2.a());
                if (!TextUtils.isEmpty(appInfoAg.getPackageName())) {
                    AppDownloadTask appDownloadTaskA = new AppDownloadTask.a().a(appInfoAg).a(this.e).a();
                    appDownloadTaskA.d(System.currentTimeMillis());
                    com.huawei.openalliance.ad.download.app.k.a(this.f20323a).a(appInfoAg.getPackageName(), appDownloadTaskA);
                    com.huawei.openalliance.ad.download.app.k.a(this.f20323a).a();
                }
                c(ClickDestination.APPMARKET);
                this.e.a(EventType.INTENTSUCCESS, (Integer) 3, (Integer) null);
                return true;
            }
            hw.b("AppDeepLinkAction", "getAppInfo is null");
            return b();
        } catch (ActivityNotFoundException unused) {
            str = "activity not exist";
            hw.c("AppDeepLinkAction", str);
        } catch (Exception unused2) {
            str = "handle intent url fail";
            hw.c("AppDeepLinkAction", str);
        }
    }

    private void d() {
        this.e.a(EventType.INTENTFAIL, (Integer) 3, Integer.valueOf(com.huawei.openalliance.ad.utils.k.a(this.f20323a, this.f20324b.ag().u()) ? 2 : 1));
    }

    public ti(Context context, ContentRecord contentRecord) {
        super(context, contentRecord);
        pc pcVar = new pc(context, sw.a(context, contentRecord.f()));
        this.e = pcVar;
        pcVar.a(contentRecord);
    }
}
