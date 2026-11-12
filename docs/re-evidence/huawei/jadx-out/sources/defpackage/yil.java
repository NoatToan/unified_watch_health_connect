package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.wearengine.WearEngineBinderClient;
import com.huawei.wearengine.WearEngineClientInner;
import com.huawei.wearengine.WearEngineManager;
import com.huawei.wearengine.connect.ServiceConnectCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes46.dex */
public class yil implements WearEngineManager, WearEngineBinderClient {
    private boolean e = false;
    private final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBinder.DeathRecipient f53388b = new IBinder.DeathRecipient() { // from class: yil.2
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            yis.b("WearEngineProxy", "binderDied enter");
            if (yil.this.f53389c != null) {
                yil.this.f53389c.asBinder().unlinkToDeath(yil.this.f53388b, 0);
                yil.this.f53389c = null;
            }
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile WearEngineManager f53389c = null;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    public yil() {
        b();
    }

    private void b(String str) throws RemoteException {
        synchronized (this.d) {
            if (this.f53389c == null) {
                if (TextUtils.isEmpty(str)) {
                    WearEngineClientInner.c().e();
                } else {
                    WearEngineClientInner.c().e(str);
                }
                d();
            }
        }
    }

    private void d() throws RemoteException {
        IBinder iBinderB = WearEngineClientInner.c().b(6);
        if (iBinderB == null) {
            throw new yib(2);
        }
        this.f53389c = WearEngineManager.Stub.asInterface(iBinderB);
        this.f53389c.asBinder().linkToDeath(this.f53388b, 0);
    }

    @Override // com.huawei.wearengine.WearEngineManager
    public int registerConnectCallback(ServiceConnectCallback serviceConnectCallback) {
        try {
            b("getAllBondedDevices");
            if (this.f53389c != null) {
                int iRegisterConnectCallback = this.f53389c.registerConnectCallback(serviceConnectCallback);
                if (iRegisterConnectCallback == 0) {
                    this.e = true;
                }
                return iRegisterConnectCallback;
            }
            throw new yib(6);
        } catch (RemoteException unused) {
            yis.c("WearEngineProxy", "registerConnectCallback RemoteException");
            throw new yib(12);
        } catch (IllegalStateException e) {
            throw yib.d(e);
        }
    }

    @Override // com.huawei.wearengine.WearEngineManager
    public int unregisterConnectCallback(ServiceConnectCallback serviceConnectCallback) {
        try {
            yir.d(serviceConnectCallback, "serviceConnectCallback is null");
            if (!this.e || this.f53389c == null) {
                yis.a("WearEngineProxy", "unregisterConnectCallback not by remote");
                return 0;
            }
            int iUnregisterConnectCallback = this.f53389c.unregisterConnectCallback(serviceConnectCallback);
            if (iUnregisterConnectCallback == 0) {
                this.e = false;
            }
            return iUnregisterConnectCallback;
        } catch (RemoteException unused) {
            yis.c("WearEngineProxy", "unregisterConnectCallback RemoteException");
            throw new yib(12);
        } catch (IllegalStateException e) {
            throw yib.d(e);
        }
    }

    @Override // com.huawei.wearengine.WearEngineBinderClient
    public void clearBinderProxy() {
        this.f53389c = null;
        yis.b("WearEngineProxy", "clearBinderProxy");
    }

    @Override // com.huawei.wearengine.WearEngineManager
    public int releaseConnection() {
        String str;
        try {
            try {
                try {
                    b((String) null);
                    if (this.f53389c != null) {
                        int iReleaseConnection = this.f53389c.releaseConnection();
                        if (iReleaseConnection != 0) {
                            yis.c("WearEngineProxy", "releaseConnection failed, ret: " + iReleaseConnection);
                            str = "releaseConnection, result: " + WearEngineClientInner.c().a();
                        } else {
                            iReleaseConnection = WearEngineClientInner.c().a();
                            str = "releaseConnection, result: " + iReleaseConnection;
                        }
                        yis.a("WearEngineProxy", str);
                        return iReleaseConnection;
                    }
                    throw new yib(6);
                } catch (IllegalStateException e) {
                    throw yib.d(e);
                }
            } catch (RemoteException unused) {
                yis.c("WearEngineProxy", "releaseConnection RemoteException");
                throw new yib(12);
            }
        } catch (Throwable th) {
            yis.a("WearEngineProxy", "releaseConnection, result: " + WearEngineClientInner.c().a());
            throw th;
        }
    }

    private void b() {
        WearEngineClientInner.c().a(new yhv(new WeakReference(this)));
    }
}
