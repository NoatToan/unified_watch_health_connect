package com.huawei.openalliance.ad;

import com.huawei.hms.ads.jsb.inner.data.WebInfo;
import com.huawei.openalliance.ad.inter.listeners.IPPSWebEventCallback;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class as extends j {

    public static class b implements IPPSWebEventCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f18271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, RemoteCallResultCallback<String>> f18272b = Collections.synchronizedMap(new a(5));

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<String, RemoteCallResultCallback<String>> f18273c = Collections.synchronizedMap(new a(5));
        private Map<String, RemoteCallResultCallback<String>> d = Collections.synchronizedMap(new a(5));

        @Override // com.huawei.openalliance.ad.inter.listeners.IPPSWebEventCallback
        public void onWebloadFinish() {
            a(this.d, new WebInfo());
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.IPPSWebEventCallback
        public void onWebOpen() {
            a(this.f18272b, new WebInfo());
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.IPPSWebEventCallback
        public void onWebClose(int i) {
            a(this.f18273c, new WebInfo(i));
        }

        public void c(RemoteCallResultCallback<String> remoteCallResultCallback, String str, String str2) {
            this.d.put(str2, remoteCallResultCallback);
            this.f18271a = str;
        }

        public void b(RemoteCallResultCallback<String> remoteCallResultCallback, String str, String str2) {
            this.f18273c.put(str2, remoteCallResultCallback);
            this.f18271a = str;
        }

        public void a(RemoteCallResultCallback<String> remoteCallResultCallback, String str, String str2) {
            this.f18272b.put(str2, remoteCallResultCallback);
            this.f18271a = str;
        }

        private void a(Map<String, RemoteCallResultCallback<String>> map, WebInfo webInfo) {
            RemoteCallResultCallback<String> value;
            if (map == null || map.size() <= 0) {
                return;
            }
            for (Map.Entry<String, RemoteCallResultCallback<String>> entry : map.entrySet()) {
                if (entry != null && (value = entry.getValue()) != null) {
                    j.a(value, this.f18271a, 1000, com.huawei.openalliance.ad.utils.bk.b(webInfo), false);
                }
            }
        }

        public b() {
            hw.a("JsbOnWebChange", "WebListener init");
        }
    }

    static class a<K, V> extends LinkedHashMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f18270a;

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<K, V> entry) {
            return size() > this.f18270a;
        }

        a(int i) {
            this.f18270a = i;
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static b f18274a = new b();

        static {
            hw.a("JsbOnWebChange", "register global Jsb Web Listener.");
            nt.a().b(f18274a);
        }
    }

    protected b b() {
        return c.f18274a;
    }

    public as(String str) {
        super(str);
    }
}
