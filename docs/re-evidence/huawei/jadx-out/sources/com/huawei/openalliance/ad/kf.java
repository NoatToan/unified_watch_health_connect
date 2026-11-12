package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.hquic.HQUICManager;
import com.huawei.hms.network.NetworkKit;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public class kf {
    private static kf f;
    private static final byte[] h = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f19437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f19438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f19439c;
    private volatile boolean d;
    private final byte[] e = new byte[0];
    private gk g;

    public void c() {
        synchronized (this.e) {
            try {
                Log.i("QuicNetworkKit", "setUp");
                final int iT = this.g.T();
                Log.i("QuicNetworkKit", "networkkit configure:" + iT);
                if (com.huawei.openalliance.ad.utils.cb.a() && (iT == 1 || iT == 2)) {
                    if (this.f19438b) {
                        if (iT == 2) {
                            d();
                        } else {
                            hw.b("QuicNetworkKit", "if quic open, can not close quic until app restart.");
                        }
                        hw.b("QuicNetworkKit", "network kit has been init");
                    } else {
                        if (iT == 2 && com.huawei.openalliance.ad.utils.cb.b()) {
                            this.f19439c = true;
                            HQUICManager.asyncInit(this.f19437a.getApplicationContext(), com.huawei.hms.network.embedded.k.c.f14969a, new a());
                        }
                        hw.b("QuicNetworkKit", "init network kit");
                        NetworkKit.init(this.f19437a, new NetworkKit.Callback() { // from class: com.huawei.openalliance.ad.kf.1
                            @Override // com.huawei.hms.network.NetworkKit.Callback
                            public void onResult(boolean z) {
                                Log.i("QuicNetworkKit", "network kit init result:" + z);
                                hw.b("QuicNetworkKit", "network kit init result:" + z);
                                kf.this.f19438b = z;
                                if (kf.this.f19438b && iT == 2) {
                                    kf.this.d();
                                }
                            }
                        });
                    }
                    return;
                }
                this.f19438b = false;
                hw.b("QuicNetworkKit", "not support network kit");
            } catch (Throwable th) {
                hw.c("QuicNetworkKit", "setUp network kit err, %s", th.getClass().getSimpleName());
            }
        }
    }

    public boolean b() {
        return this.f19439c;
    }

    public boolean a() {
        return this.f19438b;
    }

    private void e() {
        new com.huawei.openalliance.ad.net.http.k(this.f19437a).a(new com.huawei.openalliance.ad.net.http.e.a(this.f19437a).c(2).c(this.f19439c).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (!this.f19438b) {
            hw.b("QuicNetworkKit", "configureQuicHint isNetworkKitEnable:" + this.f19438b);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("adxServer");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String strA = this.g.a(this.f19437a, (String) it.next());
            if (!TextUtils.isEmpty(strA)) {
                arrayList2.add(strA);
                hw.a("QuicNetworkKit", "get quic url: %s", strA);
            }
        }
        if (arrayList2.size() <= 0 || this.d) {
            hw.b("QuicNetworkKit", "add quic url, quicUrlList is empty or hasAddQuicHint: %s", Boolean.valueOf(this.d));
        } else {
            NetworkKit.getInstance().addQuicHint(true, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            this.d = true;
            hw.b("QuicNetworkKit", "add quic success.");
        }
        e();
    }

    static class a implements HQUICManager.HQUICInitCallback {
        public void onSuccess() {
            Log.i("QuicNetworkKit", "HQUICManager.asyncInit success");
            hw.b("QuicNetworkKit", "HQUICManager.asyncInit success");
        }

        public void onFail(Exception exc) {
            Log.i("QuicNetworkKit", "HQUICManager.asyncInit failed.");
            hw.b("QuicNetworkKit", "HQUICManager.asyncInit failed.");
        }

        private a() {
        }
    }

    public static kf a(Context context) {
        kf kfVar;
        synchronized (h) {
            if (f == null) {
                f = new kf(context);
            }
            kfVar = f;
        }
        return kfVar;
    }

    private kf(Context context) {
        this.f19437a = context.getApplicationContext();
        this.g = fp.b(context);
    }
}
