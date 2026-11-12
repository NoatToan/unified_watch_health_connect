package com.huawei.wearengine;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.wearengine.client.ServiceConnectionListener;
import defpackage.yib;
import defpackage.yis;
import defpackage.ylk;
import defpackage.ylx;
import defpackage.ymg;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes20.dex */
public class WearEngineClientInner {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f30738b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f30739c = new Object();
    private static volatile WearEngineClientInner e;
    private volatile ServiceConnectionListener f;
    private volatile ServiceConnectionListener l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BinderService f30740a = null;
    private List<ReleaseConnectionCallback> j = new CopyOnWriteArrayList();
    private AtomicBoolean h = new AtomicBoolean(false);
    private ExecutorService i = Executors.newSingleThreadExecutor();
    private boolean d = false;
    private ServiceConnection g = new ServiceConnection() { // from class: com.huawei.wearengine.WearEngineClientInner.3
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            yis.b("WearEngineClientInner", "onServiceConnected success!");
            WearEngineClientInner.this.f30740a = BinderService.Stub.asInterface(iBinder);
            WearEngineClientInner.this.h.getAndSet(true);
            WearEngineClientInner.this.n();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            yis.b("WearEngineClientInner", "onServiceDisconnected success!");
            WearEngineClientInner.this.f30740a = null;
            WearEngineClientInner.this.h.getAndSet(false);
            synchronized (WearEngineClientInner.f30739c) {
                WearEngineClientInner.this.d = true;
                yis.b("WearEngineClientInner", "onServiceDisconnected BINDER_LOCK notifyAll");
                WearEngineClientInner.f30739c.notifyAll();
            }
            WearEngineClientInner.this.m();
        }
    };

    public interface ReleaseConnectionCallback {
        void onReleaseConnection();
    }

    private WearEngineClientInner() {
    }

    public static WearEngineClientInner c() {
        if (e == null) {
            synchronized (WearEngineClientInner.class) {
                if (e == null) {
                    e = new WearEngineClientInner();
                }
            }
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.i.submit(new Runnable() { // from class: com.huawei.wearengine.WearEngineClientInner.2
            @Override // java.lang.Runnable
            public void run() {
                WearEngineClientInner.this.g();
                WearEngineClientInner.this.r();
                WearEngineClientInner.this.j();
                synchronized (WearEngineClientInner.f30739c) {
                    WearEngineClientInner.this.d = true;
                    yis.b("WearEngineClientInner", "onServiceConnected BINDER_LOCK notifyAll");
                    WearEngineClientInner.f30739c.notifyAll();
                }
                WearEngineClientInner.this.o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.i.submit(new Runnable() { // from class: com.huawei.wearengine.WearEngineClientInner.4
            @Override // java.lang.Runnable
            public void run() {
                WearEngineClientInner.this.l();
            }
        });
    }

    public void e() {
        synchronized (f30738b) {
            if (h()) {
                return;
            }
            yis.b("WearEngineClientInner", "Start to bind service.");
            i();
        }
    }

    public void e(String str) {
        synchronized (f30738b) {
            if (h()) {
                return;
            }
            if (c(str)) {
                yis.b("WearEngineClientInner", "Start to bind service.");
                i();
            }
        }
    }

    private boolean h() {
        if (this.f30740a == null) {
            return false;
        }
        yis.b("WearEngineClientInner", "Already binder the Wear Engine Service.");
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008b A[PHI: r3
      0x008b: PHI (r3v4 android.content.ContentProviderClient) = (r3v3 android.content.ContentProviderClient), (r3v8 android.content.ContentProviderClient) binds: [B:30:0x0089, B:22:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Multi-variable type inference failed */
    private boolean c(String str) throws Throwable {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        String string;
        Cursor cursor = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            try {
                f();
                Uri uri = Uri.parse("content://com.huawei.healthcloud.health.provider/wear_device_state/wearEngine");
                a(uri);
                contentProviderClientAcquireUnstableContentProviderClient = ylx.e().getContentResolver().acquireUnstableContentProviderClient(uri);
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        yis.c("WearEngineClientInner", "isAllowBindService contentProviderClient is null");
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                        return true;
                    }
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, str, null, null);
                    if (cursorQuery == null || !cursorQuery.moveToNext()) {
                        yis.c("WearEngineClientInner", "isAllowedBindService cursor is null or no result");
                    } else {
                        int columnIndex = cursorQuery.getColumnIndex("isAllowBindService");
                        if (columnIndex == -1) {
                            yis.d("WearEngineClientInner", "isAllowBindService columnIndex = -1");
                            string = Boolean.FALSE.toString();
                        } else {
                            string = cursorQuery.getString(columnIndex);
                        }
                        yis.a("WearEngineClientInner", "isAllowBindService = " + string);
                        a(str, string);
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    return true;
                } catch (SQLException | RemoteException | IllegalArgumentException | SecurityException unused) {
                    yis.c("WearEngineClientInner", "isAllowedBindService query exception");
                    if (0 != 0) {
                        (objArr2 == true ? 1 : 0).close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursor.close();
                }
                if (0 != 0) {
                    (objArr == true ? 1 : 0).close();
                }
                throw th;
            }
        } catch (SQLException | RemoteException | IllegalArgumentException | SecurityException unused2) {
            contentProviderClientAcquireUnstableContentProviderClient = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                cursor.close();
            }
            if (0 != 0) {
                (objArr == true ? 1 : 0).close();
            }
            throw th;
        }
    }

    private void a(Uri uri) {
        PackageManager packageManager = ylx.e().getPackageManager();
        if (packageManager == null) {
            yis.c("WearEngineClientInner", "verifyAppIdentity packageManager is null");
            throw new yib(12);
        }
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(uri.getAuthority(), 0);
        if (providerInfoResolveContentProvider == null) {
            yis.c("WearEngineClientInner", "verifyAppIdentity providerInfo is null");
            return;
        }
        ApplicationInfo applicationInfo = providerInfoResolveContentProvider.applicationInfo;
        if (applicationInfo == null) {
            yis.c("WearEngineClientInner", "verifyAppIdentity packageManager is null");
            throw new yib(12);
        }
        String str = applicationInfo.packageName;
        yis.a("WearEngineClientInner", "verifyAppIdentity provider service's package name is : " + str);
        if (str == null) {
            throw new yib(12);
        }
        if (!ylx.a(str)) {
            throw new yib(2);
        }
    }

    private void a(String str, String str2) {
        if (Boolean.TRUE.toString().equals(str2)) {
            return;
        }
        if (str.equals("getBondedDevices") || str.equals("getAllBondedDevices") || str.equals("getCommonDevice")) {
            throw new yib(4);
        }
        if (str.equals("hasAvailableDevices")) {
            throw new yib(16);
        }
    }

    private void f() {
        if (ylx.e() != null) {
            return;
        }
        yis.c("WearEngineClientInner", "context is null");
        throw new yib(12);
    }

    public IBinder b(int i) {
        if (this.f30740a != null) {
            yis.b("WearEngineClientInner", "queryBinder " + i);
            try {
                return this.f30740a.getBinder(i);
            } catch (RemoteException unused) {
                yis.d("WearEngineClientInner", "queryBinder query failed");
                this.h.getAndSet(false);
            }
        }
        yis.d("WearEngineClientInner", "queryBinder failed something happened");
        return null;
    }

    public void d(ServiceConnectionListener serviceConnectionListener) {
        this.l = serviceConnectionListener;
    }

    public void d() {
        this.l = null;
    }

    public void a(ReleaseConnectionCallback releaseConnectionCallback) {
        this.j.add(releaseConnectionCallback);
    }

    public int a() {
        return q();
    }

    private int q() {
        synchronized (f30738b) {
            if (this.h.get()) {
                yis.a("WearEngineClientInner", "begin unbind WearEngineService");
                try {
                    ylx.e().unbindService(this.g);
                    this.h.getAndSet(false);
                    this.f30740a = null;
                    k();
                } catch (IllegalArgumentException unused) {
                    yis.c("WearEngineClientInner", "unBindService catch IllegalArgumentException");
                    return 12;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        yis.b("WearEngineClientInner", "setClientToken enter");
        if (this.f30740a != null) {
            ClientToken.Stub stub = new ClientToken.Stub() { // from class: com.huawei.wearengine.WearEngineClientInner.5
            };
            try {
                this.f30740a.registerToken(ylx.e().getPackageName(), stub);
            } catch (RemoteException unused) {
                yis.d("WearEngineClientInner", "setClientToken failed");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        yis.b("WearEngineClientInner", "checkPermissionIdentity enter");
        if (this.f30740a == null) {
            yis.d("WearEngineClientInner", "checkPermissionIdentity mBinderService is null.");
            return;
        }
        IdentityStoreCallback.Stub stub = new IdentityStoreCallback.Stub() { // from class: com.huawei.wearengine.WearEngineClientInner.1
            @Override // com.huawei.wearengine.IdentityStoreCallback
            public void storePermissionIdentity(String str) throws RemoteException {
                if (TextUtils.isEmpty(str)) {
                    yis.d("WearEngineClientInner", "storePermissionIdentity permissionIdentity isEmpty");
                } else {
                    ymg.c(ylx.e(), str);
                }
            }
        };
        String strA = ymg.a(ylx.e());
        try {
            this.f30740a.checkPermissionIdentity(ylx.e().getPackageName(), strA, stub);
        } catch (RemoteException unused) {
            yis.c("WearEngineClientInner", "clearPermissionData failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        yis.a("WearEngineClientInner", "exchangeApiLevel enter");
        if (this.f30740a != null) {
            try {
                int iExchangeApiLevel = this.f30740a.exchangeApiLevel(ylk.d());
                yis.a("WearEngineClientInner", "exchangeApiLevel serviceApiLevel:" + iExchangeApiLevel);
                ylk.b(iExchangeApiLevel);
                return;
            } catch (RemoteException unused) {
                yis.d("WearEngineClientInner", "exchangeApiLevel failed");
                return;
            }
        }
        yis.d("WearEngineClientInner", "exchangeApiLevel mBinderService is null");
    }

    private void i() {
        synchronized (f30738b) {
            yis.b("WearEngineClientInner", "begin bindToService");
            Intent intentC = c("com.huawei.health", "com.huawei.wearengine.service.WearEngineExtendService");
            if (intentC == null) {
                yis.b("WearEngineClientInner", "bindService WearEngineService");
                intentC = c("com.huawei.health", "com.huawei.wearengine.service.WearEngineService");
                if (intentC == null) {
                    throw new yib(2);
                }
            }
            synchronized (f30739c) {
                yis.b("WearEngineClientInner", "bindService locked");
                this.d = false;
                if (!ylx.e().bindService(intentC, this.g, Build.VERSION.SDK_INT >= 34 ? 549 : 37)) {
                    yis.c("WearEngineClientInner", "bindToService do not has permission");
                    throw new yib(15);
                }
                p();
            }
        }
    }

    private void p() {
        while (!this.d) {
            try {
                yis.b("WearEngineClientInner", "bindService BINDER_LOCK wait");
                f30739c.wait(30000L);
                this.d = true;
            } catch (InterruptedException unused) {
                yis.c("WearEngineClientInner", "bindToService wait error");
                return;
            }
        }
    }

    private Intent c(String str, String str2) {
        PackageManager packageManager = ylx.e().getPackageManager();
        if (packageManager == null) {
            yis.c("WearEngineClientInner", "createExplicitIntent getPackageManager is null");
            throw new yib(12);
        }
        Intent intent = new Intent();
        intent.setPackage(str);
        intent.setClassName(str, str2);
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.size() != 1) {
            yis.d("WearEngineClientInner", "createExplicitIntent implicitIntent List are null");
            return null;
        }
        ResolveInfo resolveInfo = listQueryIntentServices.get(0);
        String str3 = resolveInfo.serviceInfo.packageName;
        String str4 = resolveInfo.serviceInfo.name;
        if (!ylx.a(str3)) {
            yis.c("WearEngineClientInner", "createExplicitIntent verifyAppIdentity failed");
            return null;
        }
        ComponentName componentName = new ComponentName(str3, str4);
        Intent intent2 = new Intent(intent);
        intent2.setComponent(componentName);
        return intent2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.l != null) {
            yis.b("WearEngineClientInner", "mServiceConnectionListener begin onServiceConnect");
            this.l.onServiceConnect();
        }
        if (this.f != null) {
            yis.b("WearEngineClientInner", "mOtaServiceConnectionListener begin onServiceConnect");
            this.f.onServiceConnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.l != null) {
            yis.b("WearEngineClientInner", "mServiceConnectionListener begin onServiceDisconnect");
            this.l.onServiceDisconnect();
        }
        if (this.f != null) {
            yis.b("WearEngineClientInner", "mOtaServiceConnectionListener begin onServiceDisconnect");
            this.f.onServiceDisconnect();
        }
    }

    private void k() {
        yis.b("WearEngineClientInner", "begin executeReleaseConnectionCallback");
        Iterator<ReleaseConnectionCallback> it = this.j.iterator();
        while (it.hasNext()) {
            it.next().onReleaseConnection();
        }
    }
}
