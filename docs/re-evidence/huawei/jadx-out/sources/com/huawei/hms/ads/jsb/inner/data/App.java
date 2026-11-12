package com.huawei.hms.ads.jsb.inner.data;

import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.utils.dg;

/* JADX INFO: loaded from: classes10.dex */
public class App {
    private String afDlBtnText;
    private String appDesc;
    private String appName;
    private String dlBtnText;
    private String iconUrl;
    private String packageName;
    private String reservedPkgName;

    public App(AppInfo appInfo) {
        if (appInfo != null) {
            this.appName = dg.f(appInfo.getAppName());
            this.iconUrl = appInfo.getIconUrl();
            this.appDesc = dg.f(appInfo.getAppDesc());
            this.packageName = appInfo.getPackageName();
            this.dlBtnText = dg.f(appInfo.k());
            this.afDlBtnText = dg.f(appInfo.l());
            this.reservedPkgName = appInfo.J();
        }
    }
}
