package defpackage;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.huawei.wearengine.connect.ServiceConnectCallback;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes46.dex */
public class yjg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExecutorService f53497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RemoteCallbackList<ServiceConnectCallback> f53498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RemoteCallbackList<ServiceConnectCallback> f53499c;

    private yjg() {
        this.f53497a = Executors.newSingleThreadExecutor();
        this.f53498b = new RemoteCallbackList<>();
        this.f53499c = new RemoteCallbackList<>();
    }

    static class c {
        private static final yjg d = new yjg();
    }

    public static yjg e() {
        return c.d;
    }

    public int d(ServiceConnectCallback serviceConnectCallback) {
        if (serviceConnectCallback == null) {
            yit.b("ServiceConnectionCallbackManager", "registerOtaServiceConnectCallback connectCallback is null");
            return 5;
        }
        if (!this.f53498b.register(serviceConnectCallback)) {
            yit.b("ServiceConnectionCallbackManager", "registerOtaServiceConnectCallback register failed");
            return 12;
        }
        yit.e("ServiceConnectionCallbackManager", "after registerOtaServiceConnectCallback, size:" + this.f53498b.getRegisteredCallbackCount());
        return 0;
    }

    public int a(ServiceConnectCallback serviceConnectCallback) {
        if (serviceConnectCallback == null) {
            yit.b("ServiceConnectionCallbackManager", "registerConnectCallback connectCallback is null");
            return 5;
        }
        if (!this.f53499c.register(serviceConnectCallback)) {
            yit.b("ServiceConnectionCallbackManager", "registerConnectCallback register failed");
            return 12;
        }
        yit.e("ServiceConnectionCallbackManager", "after registerConnectCallback, size:" + this.f53499c.getRegisteredCallbackCount());
        return 0;
    }

    public int e(ServiceConnectCallback serviceConnectCallback) {
        if (serviceConnectCallback == null) {
            yit.b("ServiceConnectionCallbackManager", "unregisterOtaServiceConnectCallback connectCallback is null");
            return 5;
        }
        if (!this.f53498b.unregister(serviceConnectCallback)) {
            yit.e("ServiceConnectionCallbackManager", "unregisterOtaServiceConnectCallback connectCallback is not registered, still success");
        }
        yit.e("ServiceConnectionCallbackManager", "after unregisterOtaServiceConnectCallback, size:" + this.f53498b.getRegisteredCallbackCount());
        return 0;
    }

    public int b(ServiceConnectCallback serviceConnectCallback) {
        if (serviceConnectCallback == null) {
            yit.b("ServiceConnectionCallbackManager", "unregisterConnectCallback connectCallback is null");
            return 5;
        }
        if (!this.f53499c.unregister(serviceConnectCallback)) {
            yit.e("ServiceConnectionCallbackManager", "unregisterConnectCallback connectCallback is not registered, still success");
        }
        yit.e("ServiceConnectionCallbackManager", "after unregisterConnectCallback, size:" + this.f53499c.getRegisteredCallbackCount());
        return 0;
    }

    public void d() {
        c("executeOtaServiceConnectCallback", this.f53498b);
    }

    public void b() {
        c("executePhoneServiceConnectCallback", this.f53499c);
    }

    private void c(final String str, final RemoteCallbackList<ServiceConnectCallback> remoteCallbackList) {
        this.f53497a.submit(new Runnable() { // from class: yjg.5
            @Override // java.lang.Runnable
            public void run() {
                yjg.this.a(str, remoteCallbackList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, RemoteCallbackList<ServiceConnectCallback> remoteCallbackList) {
        StringBuilder sb;
        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
        yit.e("ServiceConnectionCallbackManager", str + " callbackNum:" + iBeginBroadcast);
        for (int i = 0; i < iBeginBroadcast; i++) {
            try {
                try {
                    ServiceConnectCallback serviceConnectCallback = (ServiceConnectCallback) remoteCallbackList.getBroadcastItem(i);
                    if (serviceConnectCallback == null) {
                        yit.b("ServiceConnectionCallbackManager", str + " callback is null, index:" + i);
                    } else {
                        serviceConnectCallback.onServiceDisconnect();
                        yit.e("ServiceConnectionCallbackManager", str + " callback ok");
                    }
                } catch (RemoteException unused) {
                    yit.b("ServiceConnectionCallbackManager", str + " RemoteException");
                    try {
                        remoteCallbackList.finishBroadcast();
                        return;
                    } catch (IllegalStateException unused2) {
                        sb = new StringBuilder();
                        sb.append(str);
                        sb.append(" finishBroadcast IllegalStateException");
                        yit.b("ServiceConnectionCallbackManager", sb.toString());
                    }
                }
            } catch (Throwable th) {
                try {
                    remoteCallbackList.finishBroadcast();
                } catch (IllegalStateException unused3) {
                    yit.b("ServiceConnectionCallbackManager", str + " finishBroadcast IllegalStateException");
                }
                throw th;
            }
        }
        try {
            remoteCallbackList.finishBroadcast();
        } catch (IllegalStateException unused4) {
            sb = new StringBuilder();
            sb.append(str);
            sb.append(" finishBroadcast IllegalStateException");
            yit.b("ServiceConnectionCallbackManager", sb.toString());
        }
    }
}
