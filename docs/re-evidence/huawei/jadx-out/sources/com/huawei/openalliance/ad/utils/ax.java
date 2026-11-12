package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AppInfo;

/* JADX INFO: loaded from: classes12.dex */
public class ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20438a = "com.huawei.openalliance.ad.utils.ax";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f20439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AppInfo f20440c;

    @JavascriptInterface
    public void showPageDetail(int i) {
        hw.b(f20438a, "show page details type:" + i);
        if (i == 1) {
            a();
        } else {
            if (i != 2) {
                return;
            }
            b();
        }
    }

    private void b() {
        String str = f20438a;
        hw.b(str, "load permissionUrl start.");
        AppInfo appInfo = this.f20440c;
        if (appInfo == null || TextUtils.isEmpty(appInfo.getPermissionUrl())) {
            hw.b(str, "load permission url is empty.");
        } else {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ax.2
                @Override // java.lang.Runnable
                public void run() {
                    as.a(ax.this.f20439b, ax.this.f20440c.getPermissionUrl());
                }
            });
        }
    }

    private void a() {
        String str = f20438a;
        hw.b(str, "load privacyUrl start.");
        AppInfo appInfo = this.f20440c;
        if (appInfo == null || TextUtils.isEmpty(appInfo.getPrivacyLink())) {
            hw.b(str, "load privacy url is empty.");
        } else {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ax.1
                @Override // java.lang.Runnable
                public void run() {
                    as.a(ax.this.f20439b, ax.this.f20440c.getPrivacyLink());
                }
            });
        }
    }

    public ax(Context context, AppInfo appInfo) {
        this.f20439b = context;
        this.f20440c = appInfo;
    }
}
