package com.huawei.openalliance.ad.hsf;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.WhiteListPkgList;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public class f extends e implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e.a f18926b;
    private volatile b d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<PPSHsfService> f18927c = new ArrayList();
    private AtomicInteger e = new AtomicInteger(1);

    private static int a(int i) {
        if (i != -2) {
            return i != 0 ? 4 : 0;
        }
        return 8;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.e.set(1);
        synchronized (this.f18927c) {
            this.f18927c.clear();
        }
        this.d = null;
        this.f18926b.a(1);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.d = b.a.a(iBinder);
            if (this.d != null && "com.huawei.hsf.internal.CoreService".equals(componentName.getClassName())) {
                int iA = a(this.d);
                if (iA == 0) {
                    this.e.set(3);
                    this.f18926b.a();
                    return;
                } else {
                    this.e.set(1);
                    this.f18926b.b(iA);
                    this.f18925a.unbindService(this);
                    return;
                }
            }
            hw.d("PPSHsfApiImpl", "Maybe mCoreService is null or illegal.");
            this.f18925a.unbindService(this);
            this.e.set(1);
            this.f18926b.b(4);
        } catch (Throwable th) {
            hw.c("PPSHsfApiImpl", "PPSHsfApi Service, service error: %s", th.getClass().getSimpleName());
        }
    }

    public final Context c() {
        return this.f18925a;
    }

    @Override // com.huawei.openalliance.ad.hsf.e
    public boolean b() {
        return this.e.get() == 3;
    }

    @Override // com.huawei.openalliance.ad.hsf.e
    public void a() {
        if (this.e.get() != 1) {
            if (this.e.get() == 3) {
                this.f18926b.a();
                return;
            }
            return;
        }
        Context contextC = c();
        String str = Constants.REMOTE_APP_INSTALL_HOST_HSF_PACKAGE;
        PackageInfo packageInfoB = k.b(contextC, Constants.REMOTE_APP_INSTALL_HOST_HSF_PACKAGE);
        if (packageInfoB == null) {
            Context contextC2 = c();
            str = Constants.REMOTE_APP_INSTALL_HOST_HSF_PACKAGE_NEW;
            packageInfoB = k.b(contextC2, Constants.REMOTE_APP_INSTALL_HOST_HSF_PACKAGE_NEW);
        }
        if (packageInfoB == null) {
            this.f18926b.b(1);
        } else {
            this.e.set(2);
            b(str);
        }
    }

    @Override // com.huawei.openalliance.ad.hsf.g
    public PPSHsfService a(String str) {
        PPSHsfService pPSHsfService = null;
        if (this.e.get() != 3) {
            return null;
        }
        synchronized (this.f18927c) {
            for (PPSHsfService pPSHsfService2 : this.f18927c) {
                if (str.equals(pPSHsfService2.a())) {
                    pPSHsfService = pPSHsfService2;
                }
            }
        }
        return pPSHsfService;
    }

    private void b(String str) {
        String str2;
        try {
            Intent intent = new Intent("com.huawei.android.hsf.service.CoreService");
            intent.setPackage(str);
            if (!cc.b(this.f18925a)) {
                String strE = k.e(this.f18925a, str);
                boolean zIsEmpty = TextUtils.isEmpty(strE);
                hw.b("PPSHsfApiImpl", "is sign empty: %s", Boolean.valueOf(zIsEmpty));
                if (!zIsEmpty && !WhiteListPkgList.isTrustApp(this.f18925a, str, strE)) {
                    return;
                }
            }
            boolean zBindService = this.f18925a.bindService(intent, this, 1);
            hw.b("PPSHsfApiImpl", "bindCoreService: %s", Boolean.valueOf(zBindService));
            if (zBindService) {
                return;
            }
            this.e.set(1);
            this.f18926b.b(5);
        } catch (SecurityException unused) {
            str2 = "bindService SecurityException";
            hw.c("PPSHsfApiImpl", str2);
            this.e.set(1);
            this.f18926b.b(5);
        } catch (Exception e) {
            str2 = "bindService " + e.getClass().getSimpleName();
            hw.c("PPSHsfApiImpl", str2);
            this.e.set(1);
            this.f18926b.b(5);
        }
    }

    private int a(b bVar) {
        int iA;
        if (bVar == null) {
            return 4;
        }
        try {
            synchronized (this.f18927c) {
                this.f18927c.clear();
                iA = a(bVar.a(this.f18925a.getPackageName(), this.f18927c));
            }
            return iA;
        } catch (RemoteException unused) {
            hw.d("PPSHsfApiImpl", "Failed to call remote interface for querying the HSF services.");
            return 4;
        }
    }

    public f(Context context, e.a aVar) {
        this.f18925a = context;
        this.f18926b = aVar;
    }
}
