package com.huawei.wearengine.service;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Binder;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.wearengine.BinderService;
import com.huawei.wearengine.ClientToken;
import com.huawei.wearengine.IdentityStoreCallback;
import com.huawei.wearengine.connect.ServiceConnectCallback;
import com.huawei.wearengine.connect.ServiceConnectCallbackManager;
import com.huawei.wearengine.core.callback.ServiceConnectStateCallback;
import defpackage.yit;
import defpackage.yiv;
import defpackage.yjg;
import defpackage.ylo;
import defpackage.ymc;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes46.dex */
public class WearEngineService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f30785b;
    private final Map<ClientToken, a> d = new ConcurrentHashMap(16);
    private final List<c> e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<d> f30786c = new CopyOnWriteArrayList();
    private final ExecutorService i = new ThreadPoolExecutor(1, 1, 5, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.DiscardPolicy());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f30784a = new BinderServiceProxy();
    private final ymc g = new ymc("com.huawei.health", "com.huawei.wearengine.service.WearEngineExtendService");
    private final IBinder.DeathRecipient f = new IBinder.DeathRecipient() { // from class: com.huawei.wearengine.service.WearEngineService.1
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            yit.e("WearEngineService", "thirdApp binderDied enter");
            Iterator it = WearEngineService.this.d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                ClientToken clientToken = (ClientToken) entry.getKey();
                if (!clientToken.asBinder().pingBinder()) {
                    a aVar = (a) entry.getValue();
                    b(aVar);
                    d(aVar);
                    clientToken.asBinder().unlinkToDeath(WearEngineService.this.f, 0);
                    it.remove();
                    yit.a("WearEngineService", "mCachedRegisterTokenMaps.size = " + WearEngineService.this.d.size());
                }
            }
        }

        private void d(a aVar) {
            for (d dVar : WearEngineService.this.f30786c) {
                if (dVar != null && dVar.b() == aVar.b() && dVar.d() == aVar.d()) {
                    WearEngineService.this.f30786c.remove(dVar);
                }
            }
            yit.a("WearEngineService", "mCachedPermissionIdentityList.size = " + WearEngineService.this.f30786c.size());
        }

        private void b(a aVar) {
            for (c cVar : WearEngineService.this.e) {
                if (cVar != null && cVar.b() == aVar.b() && cVar.d() == aVar.d()) {
                    WearEngineService.this.e.remove(cVar);
                }
            }
            yit.a("WearEngineService", "mCachedSdkApiList.size = " + WearEngineService.this.e.size());
        }
    };
    private final IdentityStoreCallback j = new IdentityStoreCallback.Stub() { // from class: com.huawei.wearengine.service.WearEngineService.3
        @Override // com.huawei.wearengine.IdentityStoreCallback
        public void storePermissionIdentity(String str) {
        }
    };
    private final ServiceConnectStateCallback k = new ServiceConnectStateCallback() { // from class: com.huawei.wearengine.service.WearEngineService.2
        @Override // com.huawei.wearengine.core.callback.ServiceConnectStateCallback
        public void onConnectChanged(ComponentName componentName, IBinder iBinder, boolean z) {
            if (!z) {
                yit.e("WearEngineService", "WearEngineExtendServiceDied");
                WearEngineService.this.f30785b = true;
                yjg yjgVarE = yjg.e();
                yjgVarE.b();
                yjgVarE.d();
                return;
            }
            yit.e("WearEngineService", "onServiceConnectedCallback enter");
            if (!WearEngineService.this.f30785b) {
                yit.a("WearEngineService", "onServiceConnectedCallback isPhoneServiceDied false");
                return;
            }
            BinderService binderServiceAsInterface = BinderService.Stub.asInterface(iBinder);
            if (binderServiceAsInterface != null) {
                for (d dVar : WearEngineService.this.f30786c) {
                    try {
                        binderServiceAsInterface.checkPermissionIdentityProxy(dVar.b(), dVar.d(), dVar.e(), dVar.f30791a, WearEngineService.this.j);
                    } catch (RemoteException unused) {
                        yit.b("WearEngineService", "onServiceConnectedCallback checkPermissionIdentityProxy RemoteException");
                        return;
                    }
                }
                for (Map.Entry entry : WearEngineService.this.d.entrySet()) {
                    try {
                        ClientToken clientToken = (ClientToken) entry.getKey();
                        a aVar = (a) entry.getValue();
                        binderServiceAsInterface.registerTokenProxy(aVar.b(), aVar.d(), aVar.e(), clientToken);
                    } catch (RemoteException unused2) {
                        yit.b("WearEngineService", "onServiceConnectedCallback registerTokenProxy RemoteException");
                        return;
                    }
                }
                for (c cVar : WearEngineService.this.e) {
                    try {
                        binderServiceAsInterface.exchangeApiLevelProxy(cVar.b(), cVar.d(), cVar.f30790a);
                    } catch (RemoteException unused3) {
                        yit.b("WearEngineService", "onServiceConnectedCallback exchangeApiLevelProxy RemoteException");
                        return;
                    }
                }
                WearEngineService.this.f30785b = false;
                return;
            }
            yit.c("WearEngineService", "onServiceConnectedCallback binderService instance is null");
        }
    };
    private final IBinder h = new ServiceConnectCallbackManager.Stub() { // from class: com.huawei.wearengine.service.WearEngineService.5
        @Override // com.huawei.wearengine.connect.ServiceConnectCallbackManager
        public int registerConnectCallback(ServiceConnectCallback serviceConnectCallback) {
            if (!ylo.c()) {
                yit.b("WearEngineService", "registerConnectCallback is not InnerInvoke");
                return 12;
            }
            return yjg.e().a(serviceConnectCallback);
        }

        @Override // com.huawei.wearengine.connect.ServiceConnectCallbackManager
        public int unregisterConnectCallback(ServiceConnectCallback serviceConnectCallback) {
            if (!ylo.c()) {
                yit.b("WearEngineService", "unregisterConnectCallback is not InnerInvoke");
                return 12;
            }
            return yjg.e().b(serviceConnectCallback);
        }

        @Override // com.huawei.wearengine.connect.ServiceConnectCallbackManager
        public int registerOtaServiceConnectCallback(ServiceConnectCallback serviceConnectCallback) {
            if (!ylo.c()) {
                yit.b("WearEngineService", "registerOtaServiceConnectCallback is not InnerInvoke");
                return 12;
            }
            return yjg.e().d(serviceConnectCallback);
        }

        @Override // com.huawei.wearengine.connect.ServiceConnectCallbackManager
        public int unregisterOtaServiceConnectCallback(ServiceConnectCallback serviceConnectCallback) {
            if (!ylo.c()) {
                yit.b("WearEngineService", "unregisterOtaServiceConnectCallback is not InnerInvoke");
                return 12;
            }
            return yjg.e().e(serviceConnectCallback);
        }
    };

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    @Override // android.app.Service
    public void onCreate() {
        yit.e("WearEngineService", "onCreate!");
        yiv.c(getApplicationContext());
        ExecutorService executorService = this.i;
        if (executorService instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) executorService).allowCoreThreadTimeOut(true);
        }
        this.g.d(this.k);
        super.onCreate();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        yit.e("WearEngineService", "onBind!");
        if (intent != null && "com.huawei.wearengine.action.REGISTER_CALLBACK_MANAGER".equals(intent.getAction())) {
            yit.a("WearEngineService", "onBind return ServiceConnectionCallbackManager");
            return this.h;
        }
        return this.f30784a;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        yit.e("WearEngineService", "onUnbind!");
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public void onDestroy() {
        yit.e("WearEngineService", "onDestroy!");
        a();
        super.onDestroy();
    }

    private void a() {
        this.f30785b = false;
        this.e.clear();
        this.d.clear();
        this.f30786c.clear();
        c();
    }

    private void c() {
        this.i.execute(new Runnable() { // from class: com.huawei.wearengine.service.WearEngineService.4
            @Override // java.lang.Runnable
            public void run() {
                WearEngineService.this.g.b();
            }
        });
    }

    class BinderServiceProxy extends BinderService.Stub {
        @Override // com.huawei.wearengine.BinderService
        public void checkPermissionIdentityProxy(int i, int i2, String str, String str2, IdentityStoreCallback identityStoreCallback) {
        }

        @Override // com.huawei.wearengine.BinderService
        public int exchangeApiLevelProxy(int i, int i2, int i3) {
            return 0;
        }

        @Override // com.huawei.wearengine.BinderService
        public IBinder getBinderProxy(int i, int i2, int i3) {
            return null;
        }

        @Override // com.huawei.wearengine.BinderService
        public void registerTokenProxy(int i, int i2, String str, ClientToken clientToken) {
        }

        private BinderServiceProxy() {
        }

        @Override // com.huawei.wearengine.BinderService
        public IBinder getBinder(int i) throws RemoteException {
            yit.a("WearEngineService", "getBinder enter");
            try {
                return WearEngineService.this.e().getBinderProxy(yiv.e(), yiv.d(), i);
            } catch (DeadObjectException unused) {
                yit.b("WearEngineService", "getBinder has DeadObjectException");
                throw new IllegalStateException(String.valueOf(12));
            }
        }

        @Override // com.huawei.wearengine.BinderService
        public void registerToken(String str, ClientToken clientToken) throws RemoteException {
            yit.a("WearEngineService", "registerToken enter");
            if (clientToken != null) {
                for (Map.Entry entry : WearEngineService.this.d.entrySet()) {
                    ClientToken clientToken2 = (ClientToken) entry.getKey();
                    a aVar = (a) entry.getValue();
                    if (aVar.b() == yiv.e() && aVar.d() == yiv.d()) {
                        WearEngineService.this.d.remove(clientToken2);
                    }
                }
                WearEngineService.this.d.put(clientToken, new a(yiv.e(), yiv.d(), str));
                yit.a("WearEngineService", "mCachedRegisterTokenMaps.size = " + WearEngineService.this.d.size());
                clientToken.asBinder().linkToDeath(WearEngineService.this.f, 0);
                try {
                    WearEngineService.this.e().registerTokenProxy(yiv.e(), yiv.d(), str, clientToken);
                    return;
                } catch (DeadObjectException unused) {
                    yit.b("WearEngineService", str + ",registerToken has DeadObjectException");
                    return;
                } catch (IllegalStateException unused2) {
                    yit.b("WearEngineService", str + ",registerToken has an IllegalStateException");
                    return;
                }
            }
            yit.b("WearEngineService", "BinderService registerToken token is null");
        }

        @Override // com.huawei.wearengine.BinderService
        public void checkPermissionIdentity(String str, String str2, IdentityStoreCallback identityStoreCallback) throws RemoteException {
            yit.a("WearEngineService", "checkPermissionIdentity enter");
            if (checkPermission()) {
                d dVar = new d(yiv.e(), yiv.d(), str, str2);
                WearEngineService.this.f30786c.remove(dVar);
                WearEngineService.this.f30786c.add(dVar);
                yit.a("WearEngineService", "mCachedPermissionIdentityList.size = " + WearEngineService.this.f30786c.size());
                try {
                    WearEngineService.this.e().checkPermissionIdentityProxy(yiv.e(), yiv.d(), str, str2, identityStoreCallback);
                } catch (DeadObjectException unused) {
                    yit.b("WearEngineService", str + ",checkPermissionIdentity has DeadObjectException");
                } catch (IllegalStateException unused2) {
                    yit.b("WearEngineService", str + ",checkPermissionIdentity has an IllegalStateException");
                }
            }
        }

        @Override // com.huawei.wearengine.BinderService
        public int exchangeApiLevel(int i) throws RemoteException {
            yit.a("WearEngineService", "exchangeApiLevel enter");
            if (!checkPermission()) {
                return 0;
            }
            c cVar = new c(yiv.e(), yiv.d(), null, i);
            WearEngineService.this.e.remove(cVar);
            WearEngineService.this.e.add(cVar);
            yit.a("WearEngineService", "mCachedSdkApiList.size = " + WearEngineService.this.e.size());
            try {
                return WearEngineService.this.e().exchangeApiLevelProxy(yiv.e(), yiv.d(), i);
            } catch (DeadObjectException unused) {
                yit.b("WearEngineService", "exchangeApiLevel has DeadObjectException");
                return 0;
            } catch (IllegalStateException unused2) {
                yit.b("WearEngineService", "pid: " + yiv.d() + ",exchangeApiLevel has an IllegalStateException");
                return 0;
            }
        }

        private boolean checkPermission() {
            return Binder.getCallingUid() == getCallingUid();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BinderService e() {
        IBinder iBinderE = this.g.e();
        if (iBinderE == null) {
            yit.b("WearEngineService", " getServiceBinder serviceBinder is null");
            throw new IllegalStateException(String.valueOf(12));
        }
        return BinderService.Stub.asInterface(iBinderE);
    }

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f30788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f30789c;
        private final int e;

        private a(int i, int i2, String str) {
            this.e = i;
            this.f30788b = i2;
            this.f30789c = str;
        }

        public int b() {
            return this.e;
        }

        public int d() {
            return this.f30788b;
        }

        public String e() {
            return this.f30789c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.e == aVar.e && this.f30788b == aVar.f30788b;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.e), Integer.valueOf(this.f30788b));
        }
    }

    static class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30791a;

        private d(int i, int i2, String str, String str2) {
            super(i, i2, str);
            this.f30791a = str2;
        }

        @Override // com.huawei.wearengine.service.WearEngineService.a
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override // com.huawei.wearengine.service.WearEngineService.a
        public int hashCode() {
            return super.hashCode();
        }
    }

    static class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f30790a;

        private c(int i, int i2, String str, int i3) {
            super(i, i2, str);
            this.f30790a = i3;
        }

        @Override // com.huawei.wearengine.service.WearEngineService.a
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override // com.huawei.wearengine.service.WearEngineService.a
        public int hashCode() {
            return super.hashCode();
        }
    }
}
