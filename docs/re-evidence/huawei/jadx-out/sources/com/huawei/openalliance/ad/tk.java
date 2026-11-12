package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.fastengine.fastview.FastSDKEngine;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.AppInfo;

/* JADX INFO: loaded from: classes12.dex */
public class tk extends com.huawei.openalliance.ad.uriaction.interfaces.a {
    private rc e;

    @Override // com.huawei.openalliance.ad.uriaction.interfaces.a
    public boolean a() {
        hw.b("FastAppSdkOpenAction", "handle fast app sdk action.");
        if (!d()) {
            return b();
        }
        AppInfo appInfoAg = this.f20324b.ag();
        c(com.huawei.openalliance.ad.utils.l.a(appInfoAg == null ? null : appInfoAg.getPackageName(), appInfoAg));
        return true;
    }

    public void a(String str) {
        try {
            new com.huawei.openalliance.ad.analysis.c(this.f20323a).a("2100093", this.f20324b, str, Constants.FAST_APP_PKG, (String) null);
        } catch (Exception e) {
            hw.c("FastAppSdkOpenAction", "reportActionFail. ex: %s", e.getClass().getSimpleName());
        }
    }

    private boolean d() {
        if (!com.huawei.openalliance.ad.utils.cr.a("com.huawei.fastengine.fastview.FastSDKEngine")) {
            hw.c("FastAppSdkOpenAction", "fast sdk not available.");
            a("fast sdk not available.");
            return false;
        }
        if (this.f20323a == null || this.f20324b == null) {
            hw.c("FastAppSdkOpenAction", "open fast app param error");
            a("open fast app param error");
            return false;
        }
        String strE = com.huawei.openalliance.ad.utils.dg.e(this.f20324b.I());
        if (TextUtils.isEmpty(strE)) {
            hw.c("FastAppSdkOpenAction", "intentUri empty");
            a("intentUri empty");
            return false;
        }
        FastSDKEngine.LaunchOption launchOption = new FastSDKEngine.LaunchOption();
        launchOption.setShortCutStrategy(0);
        int iLaunchFastAppByDeeplink = FastSDKEngine.launchFastAppByDeeplink(this.f20323a, strE, launchOption);
        hw.b("FastAppSdkOpenAction", "launch ret: %s", Integer.valueOf(iLaunchFastAppByDeeplink));
        com.huawei.openalliance.ad.utils.dcservice.c.a aVar = new com.huawei.openalliance.ad.utils.dcservice.c.a();
        aVar.a(this.f20324b, this.f20323a).c(Constants.FAST_APP_PKG);
        if (iLaunchFastAppByDeeplink == 0) {
            com.huawei.openalliance.ad.utils.dcservice.a.a(this.f20323a, aVar.a());
            this.e.a(EventType.INTENTSUCCESS, (Integer) 2, (Integer) null);
            return true;
        }
        hw.c("FastAppSdkOpenAction", "launchFastAppByDeeplink error");
        a("launchFastAppByDeeplink error" + iLaunchFastAppByDeeplink);
        new com.huawei.openalliance.ad.analysis.c(this.f20323a).a(aVar.a(), String.valueOf(iLaunchFastAppByDeeplink));
        return false;
    }

    public tk(Context context, ContentRecord contentRecord) {
        super(context, contentRecord);
        pc pcVar = new pc(context, sw.a(context, contentRecord.f()));
        this.e = pcVar;
        pcVar.a(contentRecord);
    }
}
