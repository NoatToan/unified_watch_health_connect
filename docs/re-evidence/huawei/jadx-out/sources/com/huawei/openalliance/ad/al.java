package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.hms.ads.jsb.inner.data.AppDownloadInfo;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class al extends ai {

    static class a implements com.huawei.openalliance.ad.download.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final byte[] f18219a = new byte[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static a f18220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f18221c;
        private Map<String, RemoteCallResultCallback<String>> d = Collections.synchronizedMap(new ap.e(5));

        @Override // com.huawei.openalliance.ad.download.k
        public void a(String str, int i) {
            Map<String, RemoteCallResultCallback<String>> map = this.d;
            if (map == null || map.size() <= 0) {
                return;
            }
            Iterator<RemoteCallResultCallback<String>> it = this.d.values().iterator();
            while (it.hasNext()) {
                j.a(it.next(), this.f18221c, 1000, com.huawei.openalliance.ad.utils.bk.b(new AppDownloadInfo(str, i)), false);
            }
        }

        public void a(RemoteCallResultCallback<String> remoteCallResultCallback, String str, String str2) {
            this.d.put(str2, remoteCallResultCallback);
            this.f18221c = str;
        }

        public static a a(Context context) {
            a aVar;
            synchronized (f18219a) {
                if (f18220b == null) {
                    f18220b = new a(context);
                }
                aVar = f18220b;
            }
            return aVar;
        }

        private a(Context context) {
            hw.b("JsbOnAgReserveStatusChange", "listener init");
            com.huawei.openalliance.ad.download.ag.e.a(context).a(this);
        }
    }

    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        a.a(context).a(remoteCallResultCallback, this.f19295a, this.f19297c);
    }

    public al() {
        super("pps.listener.appreservestatus");
    }
}
