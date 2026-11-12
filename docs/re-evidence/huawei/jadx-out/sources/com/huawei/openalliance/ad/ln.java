package com.huawei.openalliance.ad;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.huawei.openalliance.ad.activity.PPSNotificationActivity;
import com.huawei.openalliance.ad.constant.AdShowExtras;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.inter.data.AppInfo;

/* JADX INFO: loaded from: classes12.dex */
public class ln extends lr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AppDownloadTask f19498c;
    private AppInfo d;

    @Override // com.huawei.openalliance.ad.lr
    protected PendingIntent f() {
        return b("com.huawei.ads.notification.action.CLICK");
    }

    @Override // com.huawei.openalliance.ad.lr
    protected String e() {
        AppInfo appInfo = this.d;
        return appInfo != null ? com.huawei.openalliance.ad.utils.dg.e(appInfo.f()) : "";
    }

    @Override // com.huawei.openalliance.ad.lr
    protected String d() {
        return "AppInstalledNotification";
    }

    @Override // com.huawei.openalliance.ad.lr
    protected String c() {
        AppInfo appInfo = this.d;
        return appInfo != null ? appInfo.getAppName() : "";
    }

    @Override // com.huawei.openalliance.ad.lr
    public void b() {
        if (h()) {
            lt.a(this.f19499a).a(this.d.getPackageName());
            super.b();
            AppDownloadTask appDownloadTask = this.f19498c;
            if (appDownloadTask == null || appDownloadTask.C() == null || !com.huawei.openalliance.ad.utils.dk.x(this.f19499a)) {
                return;
            }
            new com.huawei.openalliance.ad.analysis.i(this.f19499a).c(this.f19498c.C().a(), "0");
        }
    }

    @Override // com.huawei.openalliance.ad.lr
    void a(Notification.Builder builder) {
        if (builder == null || !g()) {
            return;
        }
        b(builder);
        builder.setDeleteIntent(a("com.huawei.ads.notification.action.DELETE"));
    }

    @Override // com.huawei.openalliance.ad.lr
    int a() {
        if (g()) {
            return this.d.getPackageName().hashCode();
        }
        return 1;
    }

    private boolean h() {
        AppInfo appInfo = this.d;
        return (appInfo == null || appInfo.o() != 1 || TextUtils.isEmpty(this.d.f())) ? false : true;
    }

    private boolean g() {
        AppInfo appInfo = this.d;
        return (appInfo == null || TextUtils.isEmpty(appInfo.getPackageName())) ? false : true;
    }

    private void b(Notification.Builder builder) {
        PackageInfo packageInfoB;
        Drawable drawableLoadIcon;
        if (!g() || this.f19499a == null || (packageInfoB = com.huawei.openalliance.ad.utils.k.b(this.f19499a, this.d.getPackageName())) == null || packageInfoB.applicationInfo == null || (drawableLoadIcon = packageInfoB.applicationInfo.loadIcon(this.f19499a.getPackageManager())) == null) {
            return;
        }
        builder.setLargeIcon(com.huawei.openalliance.ad.utils.bd.a(drawableLoadIcon));
    }

    private PendingIntent b(String str) {
        if (!g()) {
            return null;
        }
        Intent intent = new Intent(this.f19499a, (Class<?>) PPSNotificationActivity.class);
        intent.setAction(str);
        intent.putExtra("type", 1);
        intent.putExtra("appInfo", this.d);
        AppDownloadTask appDownloadTask = this.f19498c;
        if (appDownloadTask != null) {
            intent.putExtra(AdShowExtras.DOWNLOAD_SOURCE, appDownloadTask.F());
            if (this.f19498c.C() != null) {
                intent.putExtra(MapKeyNames.CONTENT_RECORD, this.f19498c.C().a());
            }
        }
        return PendingIntent.getActivity(this.f19499a, a(), intent, 201326592);
    }

    private PendingIntent a(String str) {
        if (!g()) {
            return null;
        }
        Intent intent = new Intent();
        intent.setAction(str);
        intent.setPackage(this.f19499a.getPackageName());
        intent.putExtra("type", 1);
        intent.putExtra("appInfo", this.d);
        AppDownloadTask appDownloadTask = this.f19498c;
        if (appDownloadTask != null) {
            intent.putExtra(AdShowExtras.DOWNLOAD_SOURCE, appDownloadTask.F());
            if (this.f19498c.C() != null) {
                intent.putExtra(MapKeyNames.CONTENT_RECORD, this.f19498c.C().a());
            }
        }
        return PendingIntent.getBroadcast(this.f19499a, a(), intent, 201326592);
    }

    public ln(Context context, AppDownloadTask appDownloadTask) {
        super(context);
        this.f19498c = appDownloadTask;
        this.d = appDownloadTask.B();
    }
}
