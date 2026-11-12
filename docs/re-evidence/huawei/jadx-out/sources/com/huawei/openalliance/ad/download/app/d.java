package com.huawei.openalliance.ad.download.app;

import com.huawei.openalliance.ad.download.app.interfaces.AutoOpenListener;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListener;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListenerV1;
import com.huawei.openalliance.ad.utils.dj;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes12.dex */
public class d implements AutoOpenListener, AppDownloadListener, AppDownloadListenerV1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, AppDownloadListener> f18520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, AppDownloadListenerV1> f18521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, AutoOpenListener> f18522c;
    private final CopyOnWriteArraySet<AppDownloadListener> d;

    @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
    public void onUserCancel(AppInfo appInfo) {
        for (AppDownloadListener appDownloadListener : this.f18520a.values()) {
            if (appDownloadListener != null) {
                appDownloadListener.onUserCancel(appInfo);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
    public void onStatusChanged(AppStatus appStatus, AppInfo appInfo) {
        for (AppDownloadListener appDownloadListener : this.f18520a.values()) {
            if (appDownloadListener != null) {
                appDownloadListener.onStatusChanged(appStatus, appInfo);
            }
        }
        for (AppDownloadListener appDownloadListener2 : this.d) {
            if (appDownloadListener2 != null) {
                appDownloadListener2.onStatusChanged(appStatus, appInfo);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListenerV1
    public void onNewStatusChanged(AppStatusV1 appStatusV1, int i, AppInfo appInfo) {
        for (AppDownloadListenerV1 appDownloadListenerV1 : this.f18521b.values()) {
            if (appDownloadListenerV1 != null) {
                appDownloadListenerV1.onNewStatusChanged(appStatusV1, i, appInfo);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListenerV1
    public void onNewDownloadProgress(AppInfo appInfo, int i) {
        for (AppDownloadListenerV1 appDownloadListenerV1 : this.f18521b.values()) {
            if (appDownloadListenerV1 != null) {
                appDownloadListenerV1.onNewDownloadProgress(appInfo, i);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListenerV1
    public void onNewAppOpen(String str) {
        for (AppDownloadListenerV1 appDownloadListenerV1 : this.f18521b.values()) {
            if (appDownloadListenerV1 != null) {
                appDownloadListenerV1.onNewAppOpen(str);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListenerV1
    public void onNewAppOpen(AppInfo appInfo) {
        for (AppDownloadListenerV1 appDownloadListenerV1 : this.f18521b.values()) {
            if (appDownloadListenerV1 != null) {
                appDownloadListenerV1.onNewAppOpen(appInfo);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
    public void onDownloadProgress(AppInfo appInfo, int i) {
        for (AppDownloadListener appDownloadListener : this.f18520a.values()) {
            if (appDownloadListener != null) {
                appDownloadListener.onDownloadProgress(appInfo, i);
            }
        }
        onNewDownloadProgress(appInfo, i);
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
    public void onAppOpen(String str) {
        for (AppDownloadListener appDownloadListener : this.f18520a.values()) {
            if (appDownloadListener != null) {
                appDownloadListener.onAppOpen(str);
            }
        }
        for (AppDownloadListener appDownloadListener2 : this.d) {
            if (appDownloadListener2 != null) {
                appDownloadListener2.onAppOpen(str);
            }
        }
        onNewAppOpen(str);
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
    public void onAppOpen(AppInfo appInfo) {
        for (AppDownloadListener appDownloadListener : this.f18520a.values()) {
            if (appDownloadListener != null) {
                appDownloadListener.onAppOpen(appInfo);
            }
        }
        for (AppDownloadListener appDownloadListener2 : this.d) {
            if (appDownloadListener2 != null) {
                appDownloadListener2.onAppOpen(appInfo);
            }
        }
        onNewAppOpen(appInfo);
    }

    @Override // com.huawei.openalliance.ad.download.app.interfaces.AutoOpenListener
    public boolean isNeedAutoOpen(final AppInfo appInfo) {
        try {
            return ((Boolean) dj.a(new Callable<Boolean>() { // from class: com.huawei.openalliance.ad.download.app.d.1
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Boolean call() {
                    boolean z;
                    for (AutoOpenListener autoOpenListener : d.this.f18522c.values()) {
                        if (autoOpenListener != null && !autoOpenListener.isNeedAutoOpen(appInfo)) {
                            z = false;
                            return Boolean.valueOf(z);
                        }
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }
            }, 100L, true)).booleanValue();
        } catch (Throwable th) {
            hw.c("AppDownloadListenerRegister", "AutoOpen err: " + th.getClass().getSimpleName());
            return true;
        }
    }

    public void d(AppDownloadListener appDownloadListener) {
        if (appDownloadListener == null) {
            this.f18520a.remove("jsb_listener_key");
        } else {
            this.f18520a.put("jsb_listener_key", appDownloadListener);
        }
    }

    public void c(AppDownloadListener appDownloadListener) {
        if (appDownloadListener == null) {
            return;
        }
        this.d.remove(appDownloadListener);
    }

    public void b(AppDownloadListenerV1 appDownloadListenerV1) {
        if (appDownloadListenerV1 == null) {
            this.f18521b.remove("jsb_listener_key");
        } else {
            this.f18521b.put("jsb_listener_key", appDownloadListenerV1);
        }
    }

    public void b(AppDownloadListener appDownloadListener) {
        if (appDownloadListener == null) {
            return;
        }
        this.d.add(appDownloadListener);
    }

    public Map<String, AutoOpenListener> b() {
        return this.f18522c;
    }

    public void a(AppDownloadListenerV1 appDownloadListenerV1) {
        if (appDownloadListenerV1 == null) {
            this.f18521b.remove("outer_listener_key");
        } else {
            this.f18521b.put("outer_listener_key", appDownloadListenerV1);
        }
    }

    public void a(AppDownloadListener appDownloadListener) {
        if (appDownloadListener == null) {
            this.f18520a.remove("outer_listener_key");
        } else {
            this.f18520a.put("outer_listener_key", appDownloadListener);
        }
    }

    public void a(AutoOpenListener autoOpenListener) {
        if (autoOpenListener == null) {
            this.f18522c.remove("outer_listener_key");
        } else {
            this.f18522c.put("outer_listener_key", autoOpenListener);
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f18525a = new d();
    }

    public static d a() {
        return a.f18525a;
    }

    private d() {
        this.f18520a = new ConcurrentHashMap();
        this.f18521b = new ConcurrentHashMap();
        this.f18522c = new ConcurrentHashMap();
        this.d = new CopyOnWriteArraySet<>();
        e.h().a((AppDownloadListener) this);
        e.h().a((AppDownloadListenerV1) this);
        e.h().a((AutoOpenListener) this);
    }
}
