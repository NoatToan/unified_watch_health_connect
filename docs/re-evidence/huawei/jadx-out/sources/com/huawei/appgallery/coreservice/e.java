package com.huawei.appgallery.coreservice;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.appgallery.coreservice.api.ApiClient;
import com.huawei.appgallery.coreservice.api.ConnectConfig;
import com.huawei.appgallery.coreservice.api.IConnectionResult;
import com.huawei.appgallery.coreservice.internal.service.installhiapp.GuideInstallAppGallery;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import com.huawei.appmarket.framework.coreservice.DataHolder;
import com.huawei.appmarket.framework.coreservice.Status;
import com.huawei.appmarket.framework.coreservice.b;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.bgp;
import defpackage.bgq;
import defpackage.bhn;
import defpackage.bhu;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes23.dex */
public class e implements c, ServiceConnection {
    private static AtomicInteger d = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f5210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f5211c;
    private final Context e;
    private ConnectConfig i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<ApiClient.ConnectionCallback> f5209a = new HashSet();
    private boolean f = false;
    private final AtomicInteger h = new AtomicInteger();
    private final ApiClient.ConnectionCallback j = new C0058e();

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        bhn.b("InnerApiClientImpl", "Enter onServiceDisconnected.");
        this.f5210b = null;
        this.f = false;
        this.j.onConnectionSuspended(1);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        bhn.b("InnerApiClientImpl", "Enter onServiceConnected.");
        this.f5210b = b.a.a(iBinder);
        this.j.onConnected();
        this.f = false;
        if (this.h.get() <= 0) {
            bhn.b("InnerApiClientImpl", "service expect to unbind");
            i();
        }
    }

    public boolean c() {
        return this.f;
    }

    public boolean d() {
        b bVar = this.f5210b;
        return bVar != null && bVar.asBinder().isBinderAlive();
    }

    public void c(Set<ApiClient.ConnectionCallback> set) {
        bhn.b("InnerApiClientImpl", "connect()");
        this.h.incrementAndGet();
        this.f = true;
        this.f5209a.addAll(set);
        if (g()) {
            try {
                if (a()) {
                    bhn.b("InnerApiClientImpl", "bind success!");
                    return;
                }
            } catch (SecurityException e) {
                bhn.a("InnerApiClientImpl", "bind Execption", e);
            }
            bhu.a(new a(this, 2), 200L);
        }
    }

    @Override // com.huawei.appgallery.coreservice.c
    public void a(DataHolder dataHolder, com.huawei.appmarket.framework.coreservice.a.AbstractBinderC0060a abstractBinderC0060a) {
        try {
            b bVar = this.f5210b;
            if (bVar != null) {
                bVar.a(dataHolder, abstractBinderC0060a);
            } else if (abstractBinderC0060a != null) {
                a(abstractBinderC0060a, "mTransportService is null");
            }
        } catch (RemoteException unused) {
            a(abstractBinderC0060a, "asyncCall RemoteExecption");
        }
    }

    public void e(ConnectConfig connectConfig) {
        this.i = connectConfig;
    }

    public void e() {
        bhn.b("InnerApiClientImpl", "disconnect()");
        this.h.decrementAndGet();
        i();
    }

    public String c(Context context) {
        String str;
        try {
            return new ServiceVerifyKit.Builder().a(context).c(new Intent(this.i.getConnectServiceAction()), ServiceVerifyKit.Builder.ComponentType.SERVICE).e(this.i.getAppSignCertchain()).b(this.i.getAppFingerprintSignature()).e();
        } catch (RuntimeException unused) {
            str = "get market pkg RuntimeException!";
            bhn.a("InnerApiClientImpl", str);
            return "";
        } catch (Exception unused2) {
            str = "get market pkg Exception!";
            bhn.a("InnerApiClientImpl", str);
            return "";
        }
    }

    private boolean g() {
        String strC = this.i != null ? c(this.e) : b(this.e);
        this.f5211c = strC;
        if (TextUtils.isEmpty(strC)) {
            bhn.a("InnerApiClientImpl", "can not found AppGallery or invalid sign");
            this.f = false;
            ConnectConfig connectConfig = this.i;
            this.j.onConnectionFailed(new bgq(4, connectConfig != null ? GuideInstallAppGallery.c(this.e, connectConfig, this.f5211c) : GuideInstallAppGallery.a(this.e)));
            return false;
        }
        try {
            if (m.a(this.e.getPackageManager().getPackageInfo(this.f5211c, 128))) {
                return true;
            }
            bhn.a("InnerApiClientImpl", "unsupport agd");
            this.f = false;
            ConnectConfig connectConfig2 = this.i;
            this.j.onConnectionFailed(new bgq(7, connectConfig2 != null ? GuideInstallAppGallery.c(this.e, connectConfig2, this.f5211c) : GuideInstallAppGallery.a(this.e)));
            return false;
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            bhn.a("InnerApiClientImpl", "can not found AppGallery");
            this.f = false;
            ConnectConfig connectConfig3 = this.i;
            this.j.onConnectionFailed(new bgq(4, connectConfig3 != null ? GuideInstallAppGallery.c(this.e, connectConfig3, this.f5211c) : GuideInstallAppGallery.a(this.e)));
            return false;
        }
    }

    private void i() {
        this.f = false;
        try {
            if (d()) {
                this.e.unbindService(this);
            } else {
                bhn.b("InnerApiClientImpl", "service does not connected");
            }
            this.f5210b = null;
        } catch (IllegalArgumentException e) {
            bhn.a("InnerApiClientImpl", e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        try {
            bhn.b("InnerApiClientImpl", "start transparent activity");
            Intent intent = new Intent();
            intent.setAction("com.huawei.appmarket.intent.coreservice.LAUNCH_APP");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setPackage(this.f5211c);
            intent.setFlags(268435456);
            this.e.startActivity(intent);
            bhu.a(new a(this, 1), 200L);
        } catch (ActivityNotFoundException unused) {
            bhn.a("InnerApiClientImpl", "transparent activity not found!");
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f = false;
        this.j.onConnectionFailed(new bgq(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        if (TextUtils.isEmpty(this.f5211c)) {
            return false;
        }
        Intent intentE = bgp.e(this.f5211c, this.i);
        intentE.putExtra("mediaPkg", this.e.getPackageName());
        intentE.putExtra("sdkVersion", 9);
        if (Build.VERSION.SDK_INT >= 29) {
            intentE.setIdentifier(this.e.getPackageName() + Constants.LINK + d.getAndIncrement());
        }
        return this.e.bindService(intentE, this, 1);
    }

    public static bgq a(Context context) {
        return new bgq(4, GuideInstallAppGallery.a(context));
    }

    /* JADX INFO: renamed from: com.huawei.appgallery.coreservice.e$e, reason: collision with other inner class name */
    class C0058e implements ApiClient.ConnectionCallback {
        @Override // com.huawei.appgallery.coreservice.api.ApiClient.ConnectionCallback
        public void onConnectionSuspended(int i) {
            bhn.e("InnerApiClientImpl", "ConnectionCallback : onConnectionSuspended()");
            Iterator it = e.this.f5209a.iterator();
            while (it.hasNext()) {
                ((ApiClient.ConnectionCallback) it.next()).onConnectionSuspended(i);
            }
        }

        @Override // com.huawei.appgallery.coreservice.api.ApiClient.ConnectionCallback
        public void onConnectionFailed(IConnectionResult iConnectionResult) {
            bhn.e("InnerApiClientImpl", "OnConnectionFailedListener : onConnectionFailed()");
            Iterator it = e.this.f5209a.iterator();
            while (it.hasNext()) {
                ((ApiClient.ConnectionCallback) it.next()).onConnectionFailed(iConnectionResult);
            }
        }

        @Override // com.huawei.appgallery.coreservice.api.ApiClient.ConnectionCallback
        public void onConnected() {
            bhn.e("InnerApiClientImpl", "ConnectionCallback : onConnected()");
            Iterator it = e.this.f5209a.iterator();
            while (it.hasNext()) {
                ((ApiClient.ConnectionCallback) it.next()).onConnected();
            }
        }

        C0058e() {
        }
    }

    public static String b(Context context) {
        String str;
        try {
            return new ServiceVerifyKit.Builder().a(context).c(new Intent("com.huawei.appmarket.service.intent.ACTION_CORE_SERVICE"), ServiceVerifyKit.Builder.ComponentType.SERVICE).d("com.huawei.appmarket", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212").d("com.huawei.appmarket", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F").e();
        } catch (RuntimeException unused) {
            str = "get market pkg RuntimeException!";
            bhn.a("InnerApiClientImpl", str);
            return "";
        } catch (Exception unused2) {
            str = "get market pkg Exception!";
            bhn.a("InnerApiClientImpl", str);
            return "";
        }
    }

    private void a(com.huawei.appmarket.framework.coreservice.a.AbstractBinderC0060a abstractBinderC0060a, String str) {
        bhn.a("InnerApiClientImpl", "call Failed:" + str);
        try {
            abstractBinderC0060a.call(new Status(4));
        } catch (RemoteException unused) {
            bhn.a("InnerApiClientImpl", str);
        }
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference<e> f5212b;
        public int e;

        @Override // java.lang.Runnable
        public void run() {
            e eVar;
            WeakReference<e> weakReference = this.f5212b;
            if (weakReference == null || (eVar = weakReference.get()) == null) {
                bhn.b("InnerApiClientImpl", "innerApiClient already null");
                return;
            }
            int i = this.e;
            if (i != 1) {
                if (i == 2) {
                    eVar.h();
                }
            } else {
                bhn.b("InnerApiClientImpl", "delay bind core service");
                try {
                    if (eVar.a()) {
                        return;
                    }
                } catch (SecurityException e) {
                    bhn.a("InnerApiClientImpl", "bindCoreService Execption", e);
                }
                eVar.b();
            }
        }

        public a(e eVar, int i) {
            this.e = i;
            this.f5212b = new WeakReference<>(eVar);
        }
    }

    public e(Context context) {
        this.e = context;
    }
}
