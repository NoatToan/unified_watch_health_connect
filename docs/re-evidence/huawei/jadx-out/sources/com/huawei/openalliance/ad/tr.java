package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.constant.AdShowExtras;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class tr extends com.huawei.openalliance.ad.uriaction.interfaces.a {
    private int e;
    private boolean f;
    private String g;

    public void b(String str) {
        this.g = str;
    }

    @Override // com.huawei.openalliance.ad.uriaction.interfaces.a
    public boolean a() {
        String str;
        hw.b("OpenMiniPageAction", "handle OpenMiniPageAction");
        if (this.f20324b == null || this.f20324b.ag() == null) {
            str = "getAppInfo is null";
        } else {
            AppInfo appInfoAg = this.f20324b.ag();
            if (appInfoAg == null || !com.huawei.openalliance.ad.utils.k.a(this.f20323a, appInfoAg.getPackageName())) {
                AppDownloadTask appDownloadTaskA = a(appInfoAg);
                if (appDownloadTaskA != null) {
                    appDownloadTaskA.a(Integer.valueOf(this.e));
                    appDownloadTaskA.c((Integer) 1);
                    c(ClickDestination.AGMINIMARKET);
                    com.huawei.openalliance.ad.download.app.e.h().c(appDownloadTaskA);
                    return true;
                }
                str = "downloadTask is null";
            } else {
                str = "app installed";
            }
        }
        hw.b("OpenMiniPageAction", str);
        a(str);
        return b();
    }

    public void a(String str) {
        try {
            new com.huawei.openalliance.ad.analysis.c(this.f20323a).d(this.f20324b, str);
        } catch (Exception e) {
            hw.d("OpenMiniPageAction", "reportActionFailed err: %s", e.getClass().getSimpleName());
        }
    }

    public void a(Boolean bool) {
        this.f = bool.booleanValue();
    }

    public void a(int i) {
        this.e = i;
    }

    private AppDownloadTask a(AppInfo appInfo) {
        pc pcVar;
        AppDownloadTask appDownloadTaskD = com.huawei.openalliance.ad.download.app.e.h().d(appInfo);
        if (appDownloadTaskD != null) {
            if (this.f20324b != null) {
                appDownloadTaskD.k(this.f20324b.n());
                appDownloadTaskD.l(this.f20324b.aa());
                appDownloadTaskD.m(this.f20324b.o());
                appDownloadTaskD.n(this.f20324b.l());
            }
            appDownloadTaskD.i(this.g);
            return appDownloadTaskD;
        }
        if (this.f20324b != null) {
            pcVar = new pc(this.f20323a, sw.a(this.f20323a, this.f20324b.f()));
            pcVar.a(this.f20324b);
        } else {
            pcVar = null;
        }
        AppDownloadTask appDownloadTaskA = new AppDownloadTask.a().a(appInfo).a(pcVar).a();
        if (appDownloadTaskA != null) {
            appDownloadTaskA.a(Integer.valueOf(this.e));
            appDownloadTaskA.f(this.f);
            appDownloadTaskA.i(this.g);
            if (this.f20324b != null) {
                appDownloadTaskA.l(this.f20324b.aa());
                appDownloadTaskA.k(this.f20324b.n());
                appDownloadTaskA.m(this.f20324b.o());
                appDownloadTaskA.n(this.f20324b.l());
            }
        }
        return appDownloadTaskA;
    }

    public tr(Context context, ContentRecord contentRecord, Map<String, String> map) {
        super(context, contentRecord);
        this.e = 1;
        this.f = false;
        if (map == null || com.huawei.openalliance.ad.utils.dg.b(map.get(AdShowExtras.DOWNLOAD_SOURCE))) {
            return;
        }
        this.e = Integer.parseInt(map.get(AdShowExtras.DOWNLOAD_SOURCE));
    }
}
