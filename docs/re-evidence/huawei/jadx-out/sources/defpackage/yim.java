package defpackage;

import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.wearengine.WearEngineClientInner;
import com.huawei.wearengine.client.ServiceConnectionListener;
import com.huawei.wearengine.connect.ServiceConnectCallback;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes46.dex */
public class yim {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile yim f53390c;
    private volatile ServiceConnectionListener e;
    private volatile ServiceConnectCallback d = new ServiceConnectCallback.Stub() { // from class: yim.5
        @Override // com.huawei.wearengine.connect.ServiceConnectCallback
        public void onServiceDisconnect() {
            if (yim.this.e != null) {
                yim.this.e.onServiceDisconnect();
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private yil f53391b = new yil();

    private yim(ServiceConnectionListener serviceConnectionListener) {
        this.e = serviceConnectionListener;
    }

    public static yim c(ServiceConnectionListener serviceConnectionListener) {
        if (f53390c == null) {
            synchronized (yim.class) {
                if (f53390c == null) {
                    f53390c = new yim(serviceConnectionListener);
                }
            }
        }
        return f53390c;
    }

    public Task<Void> e() {
        WearEngineClientInner.c().d(this.e);
        return Tasks.callInBackground(new Callable<Void>() { // from class: yim.2
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Void call() {
                int iRegisterConnectCallback = yim.this.f53391b.registerConnectCallback(yim.this.d);
                if (iRegisterConnectCallback == 0) {
                    return null;
                }
                throw new yib(iRegisterConnectCallback);
            }
        });
    }

    public Task<Void> a() {
        WearEngineClientInner.c().d();
        return Tasks.callInBackground(new Callable<Void>() { // from class: yim.4
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Void call() {
                int iUnregisterConnectCallback = yim.this.f53391b.unregisterConnectCallback(yim.this.d);
                if (iUnregisterConnectCallback == 0) {
                    return null;
                }
                throw new yib(iUnregisterConnectCallback);
            }
        });
    }

    public Task<Void> b() {
        return Tasks.callInBackground(new Callable<Void>() { // from class: yim.3
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Void call() {
                int iReleaseConnection = yim.this.f53391b.releaseConnection();
                if (iReleaseConnection == 0) {
                    return null;
                }
                throw new yib(iReleaseConnection);
            }
        });
    }
}
