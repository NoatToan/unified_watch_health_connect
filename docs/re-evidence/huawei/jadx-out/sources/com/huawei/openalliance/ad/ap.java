package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.hms.ads.jsb.inner.data.AppDownloadInfo;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.download.app.AppStatusV1;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListener;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListenerV1;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ap extends ai {

    public static class b implements AppDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f18262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f18263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f18264c;
        private String d;
        private int e = 20;
        private Map<String, RemoteCallResultCallback<String>> f = Collections.synchronizedMap(new e(this.e));
        private Map<String, RemoteCallResultCallback<String>> g = Collections.synchronizedMap(new e(this.e));
        private Map<String, RemoteCallResultCallback<String>> h = Collections.synchronizedMap(new e(this.e));
        private Map<String, RemoteCallResultCallback<String>> i = Collections.synchronizedMap(new e(this.e));

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void onAppOpen(String str) {
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void onUserCancel(AppInfo appInfo) {
            Map<String, RemoteCallResultCallback<String>> map;
            if (appInfo == null || (map = this.i) == null || map.size() == 0) {
                return;
            }
            hw.b("JsbOnDownloadChange", "onUserCancel, app: %s", appInfo.getPackageName());
            for (RemoteCallResultCallback<String> remoteCallResultCallback : this.i.values()) {
                if (remoteCallResultCallback != null) {
                    j.a(remoteCallResultCallback, this.d, 1000, com.huawei.openalliance.ad.utils.bk.b(new AppDownloadInfo(appInfo, AppStatus.DOWNLOAD)), false);
                }
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void onStatusChanged(AppStatus appStatus, AppInfo appInfo) {
            RemoteCallResultCallback<String> value;
            Map<String, RemoteCallResultCallback<String>> map = this.f;
            if (map == null || map.size() <= 0) {
                hw.c("JsbOnDownloadChange", "status map is null");
                return;
            }
            for (Map.Entry<String, RemoteCallResultCallback<String>> entry : this.f.entrySet()) {
                if (entry != null && (value = entry.getValue()) != null) {
                    j.a(value, this.f18262a, 1000, com.huawei.openalliance.ad.utils.bk.b(new AppDownloadInfo(appInfo, appStatus)), false);
                }
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void onDownloadProgress(AppInfo appInfo, int i) {
            AppDownloadTask appDownloadTaskD = com.huawei.openalliance.ad.download.app.e.h().d(appInfo);
            if (appDownloadTaskD != null) {
                onStatusChanged(com.huawei.openalliance.ad.utils.l.a(appDownloadTaskD), appInfo);
            }
            Map<String, RemoteCallResultCallback<String>> map = this.g;
            if (map == null || map.size() <= 0) {
                return;
            }
            Iterator<RemoteCallResultCallback<String>> it = this.g.values().iterator();
            while (it.hasNext()) {
                j.a(it.next(), this.f18263b, 1000, com.huawei.openalliance.ad.utils.bk.b(new AppDownloadInfo(appInfo, i)), false);
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void onAppOpen(AppInfo appInfo) {
            Map<String, RemoteCallResultCallback<String>> map = this.h;
            if (map == null || map.size() <= 0) {
                return;
            }
            for (RemoteCallResultCallback<String> remoteCallResultCallback : this.h.values()) {
                if (remoteCallResultCallback != null) {
                    j.a(remoteCallResultCallback, this.f18264c, 1000, com.huawei.openalliance.ad.utils.bk.b(new AppDownloadInfo(appInfo, AppStatus.INSTALLED)), false);
                }
            }
        }

        public void d(RemoteCallResultCallback<String> remoteCallResultCallback, String str, String str2) {
            this.i.put(str2, remoteCallResultCallback);
            this.d = str;
        }

        public void c(RemoteCallResultCallback<String> remoteCallResultCallback, String str, String str2) {
            this.h.put(str2, remoteCallResultCallback);
            this.f18264c = str;
        }

        public void b(RemoteCallResultCallback<String> remoteCallResultCallback, String str, String str2) {
            hw.b("JsbOnDownloadChange", "add app progress cb %s", str2);
            this.g.put(str2, remoteCallResultCallback);
            this.f18263b = str;
        }

        public void a(String str) {
            if (str == null) {
                return;
            }
            hw.b("JsbOnDownloadChange", "remove app status cb %s", str);
            this.f.remove(str);
            this.g.remove(str);
            this.h.remove(str);
            this.i.remove(str);
        }

        public void a(RemoteCallResultCallback<String> remoteCallResultCallback, String str, String str2) {
            hw.b("JsbOnDownloadChange", "add app status cb %s", str2);
            this.f.put(str2, remoteCallResultCallback);
            this.f18262a = str;
        }

        public void a(int i) {
            this.e = i;
        }

        public b() {
            hw.a("JsbOnDownloadChange", "DownloadListener init");
        }
    }

    public static class d implements AppDownloadListenerV1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f18266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f18267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f18268c;
        private Map<String, RemoteCallResultCallback<String>> d = Collections.synchronizedMap(new e(5));
        private Map<String, RemoteCallResultCallback<String>> e = Collections.synchronizedMap(new e(5));
        private Map<String, RemoteCallResultCallback<String>> f = Collections.synchronizedMap(new e(5));

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListenerV1
        public void onNewAppOpen(String str) {
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListenerV1
        public void onNewStatusChanged(AppStatusV1 appStatusV1, int i, AppInfo appInfo) {
            RemoteCallResultCallback<String> value;
            Map<String, RemoteCallResultCallback<String>> map = this.d;
            if (map == null || map.size() <= 0) {
                return;
            }
            for (Map.Entry<String, RemoteCallResultCallback<String>> entry : this.d.entrySet()) {
                if (entry != null && (value = entry.getValue()) != null) {
                    j.a(value, this.f18266a, 1000, com.huawei.openalliance.ad.utils.bk.b(new AppDownloadInfo(appInfo, appStatusV1, i)), false);
                }
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListenerV1
        public void onNewDownloadProgress(AppInfo appInfo, int i) {
            Map<String, RemoteCallResultCallback<String>> map = this.e;
            if (map == null || map.size() <= 0) {
                return;
            }
            Iterator<RemoteCallResultCallback<String>> it = this.e.values().iterator();
            while (it.hasNext()) {
                j.a(it.next(), this.f18267b, 1000, com.huawei.openalliance.ad.utils.bk.b(new AppDownloadInfo(appInfo, i)), false);
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListenerV1
        public void onNewAppOpen(AppInfo appInfo) {
            Map<String, RemoteCallResultCallback<String>> map = this.f;
            if (map == null || map.size() <= 0) {
                return;
            }
            for (RemoteCallResultCallback<String> remoteCallResultCallback : this.f.values()) {
                if (remoteCallResultCallback != null) {
                    j.a(remoteCallResultCallback, this.f18268c, 1000, com.huawei.openalliance.ad.utils.bk.b(new AppDownloadInfo(appInfo, AppStatus.INSTALLED)), false);
                }
            }
        }

        public void a(RemoteCallResultCallback<String> remoteCallResultCallback, String str, String str2) {
            this.d.put(str2, remoteCallResultCallback);
            this.f18266a = str;
        }

        public d() {
            hw.a("JsbOnDownloadChange", "BrowserDownloadListener init");
        }
    }

    protected d c() {
        return a.f18261a;
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static d f18261a = new d();

        static {
            hw.a("JsbOnDownloadChange", "register global Jsb browser app download Listener.");
            com.huawei.openalliance.ad.download.app.d.a().b(f18261a);
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static b f18265a = new b();

        static {
            hw.a("JsbOnDownloadChange", "register global Jsb app download Listener.");
            com.huawei.openalliance.ad.download.app.d.a().d(f18265a);
        }
    }

    static class e<K, V> extends LinkedHashMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f18269a;

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<K, V> entry) {
            return size() > this.f18269a;
        }

        e(int i) {
            this.f18269a = i;
        }
    }

    protected b b(Context context) {
        c.f18265a.a(fp.b(context).r());
        return c.f18265a;
    }

    protected b b() {
        return c.f18265a;
    }

    public ap(String str) {
        super(str);
    }
}
