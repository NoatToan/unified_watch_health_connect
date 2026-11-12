package com.huawei.wearengine.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import defpackage.yit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes46.dex */
public class AuthListenerManagerProxy implements AuthListenerManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f30750b;
    private WearEngineServiceClient f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExecutorService f30749a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f30751c = new Object();
    private IBinder.DeathRecipient d = new IBinder.DeathRecipient() { // from class: com.huawei.wearengine.auth.AuthListenerManagerProxy.2
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            yit.e("AuthListenerManagerProxy", "binderDied enter");
            if (AuthListenerManagerProxy.this.e != null) {
                AuthListenerManagerProxy.this.e.asBinder().unlinkToDeath(AuthListenerManagerProxy.this.d, 0);
            }
            AuthListenerManagerProxy.this.e = null;
        }
    };
    private AuthListenerManager e = null;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    public AuthListenerManagerProxy(Context context) {
        this.f30750b = context;
        this.f = new WearEngineServiceClient(this.f30750b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() throws RemoteException {
        synchronized (this.f30751c) {
            if (this.e == null) {
                this.f.d();
                AuthListenerManager authListenerManagerE = this.f.e();
                this.e = authListenerManagerE;
                authListenerManagerE.asBinder().linkToDeath(this.d, 0);
            }
        }
    }

    @Override // com.huawei.wearengine.auth.AuthListenerManager
    public void authListenerOnOk(final String str, final Permission[] permissionArr) throws RemoteException {
        this.f30749a.execute(new Runnable() { // from class: com.huawei.wearengine.auth.AuthListenerManagerProxy.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AuthListenerManagerProxy.this.d();
                    if (AuthListenerManagerProxy.this.e != null) {
                        AuthListenerManagerProxy.this.e.authListenerOnOk(str, permissionArr);
                    }
                    AuthListenerManagerProxy.this.c();
                } catch (Exception unused) {
                    yit.b("AuthListenerManagerProxy", "authListenerOnOk Exception");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        WearEngineServiceClient wearEngineServiceClient = this.f;
        if (wearEngineServiceClient != null) {
            wearEngineServiceClient.c();
        }
    }

    @Override // com.huawei.wearengine.auth.AuthListenerManager
    public void authListenerOnCancel(final String str) throws RemoteException {
        this.f30749a.execute(new Runnable() { // from class: com.huawei.wearengine.auth.AuthListenerManagerProxy.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AuthListenerManagerProxy.this.d();
                    if (AuthListenerManagerProxy.this.e != null) {
                        AuthListenerManagerProxy.this.e.authListenerOnCancel(str);
                    }
                    AuthListenerManagerProxy.this.c();
                } catch (Exception unused) {
                    yit.b("AuthListenerManagerProxy", "authListenerOnOk Exception");
                }
            }
        });
    }

    @Override // com.huawei.wearengine.auth.AuthListenerManager
    public List<String> getAllPackageName() throws RemoteException {
        Future futureSubmit = this.f30749a.submit(new Callable<List<String>>() { // from class: com.huawei.wearengine.auth.AuthListenerManagerProxy.4
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public List<String> call() throws Exception {
                List<String> arrayList = new ArrayList<>();
                try {
                    AuthListenerManagerProxy.this.d();
                    if (AuthListenerManagerProxy.this.e != null) {
                        arrayList = AuthListenerManagerProxy.this.e.getAllPackageName();
                    }
                    AuthListenerManagerProxy.this.c();
                    return arrayList;
                } catch (RemoteException unused) {
                    yit.a("AuthListenerManagerProxy", "getAllPackageName RemoteException");
                    return arrayList;
                }
            }
        });
        ArrayList arrayList = new ArrayList();
        try {
            return (List) futureSubmit.get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            yit.b("AuthListenerManagerProxy", "getAllPackageName InterruptedException");
            return arrayList;
        } catch (ExecutionException unused2) {
            yit.b("AuthListenerManagerProxy", "getAllPackageName ExecutionException");
            return arrayList;
        } catch (TimeoutException unused3) {
            yit.b("AuthListenerManagerProxy", "getAllPackageName TimeoutException");
            return arrayList;
        }
    }
}
