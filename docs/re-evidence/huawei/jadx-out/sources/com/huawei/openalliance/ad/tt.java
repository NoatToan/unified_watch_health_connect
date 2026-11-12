package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.constant.AdShowExtras;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class tt extends com.huawei.openalliance.ad.uriaction.interfaces.a {
    private int e;
    private int f;

    @Override // com.huawei.openalliance.ad.uriaction.interfaces.a
    public boolean a() {
        hw.b("SpecifiedAgdDownloadAction", "handle SpecifiedAgdDownloadAction");
        if (this.f20324b == null || this.f20324b.ag() == null) {
            hw.b("SpecifiedAgdDownloadAction", "getAppInfo is null");
            return b();
        }
        AppInfo appInfoAg = this.f20324b.ag();
        if (appInfoAg != null && com.huawei.openalliance.ad.utils.k.a(this.f20323a, appInfoAg.getPackageName())) {
            hw.b("SpecifiedAgdDownloadAction", "app installed");
            return b();
        }
        AppDownloadTask appDownloadTaskA = a(appInfoAg);
        if (appDownloadTaskA == null) {
            hw.b("SpecifiedAgdDownloadAction", "downloadTask is null");
            return b();
        }
        appDownloadTaskA.a(Integer.valueOf(this.e));
        c(ClickDestination.APPMARKET);
        com.huawei.openalliance.ad.download.app.e.h().c(appDownloadTaskA);
        return true;
    }

    private AppDownloadTask a(AppInfo appInfo) {
        pc pcVar;
        AppDownloadTask appDownloadTaskD = com.huawei.openalliance.ad.download.app.e.h().d(appInfo);
        if (appDownloadTaskD == null) {
            if (this.f20324b != null) {
                pcVar = new pc(this.f20323a, sw.a(this.f20323a, this.f20324b.f()));
                pcVar.a(this.f20324b);
            } else {
                pcVar = null;
            }
            appDownloadTaskD = new AppDownloadTask.a().a(appInfo).a(pcVar).a();
            if (appDownloadTaskD != null) {
                appDownloadTaskD.a(Integer.valueOf(this.e));
                appDownloadTaskD.c(Integer.valueOf(this.f));
            }
        }
        if (appDownloadTaskD != null && this.f20324b != null) {
            appDownloadTaskD.k(this.f20324b.n());
            appDownloadTaskD.l(this.f20324b.aa());
            appDownloadTaskD.m(this.f20324b.o());
            appDownloadTaskD.n(this.f20324b.l());
        }
        return appDownloadTaskD;
    }

    public tt(Context context, ContentRecord contentRecord, Map<String, String> map) {
        super(context, contentRecord);
        this.e = 1;
        this.f = 1;
        if (map == null || com.huawei.openalliance.ad.utils.dg.b(map.get(AdShowExtras.DOWNLOAD_SOURCE))) {
            return;
        }
        this.e = Integer.parseInt(map.get(AdShowExtras.DOWNLOAD_SOURCE));
    }
}
