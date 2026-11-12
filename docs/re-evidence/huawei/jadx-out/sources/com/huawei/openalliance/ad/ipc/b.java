package com.huawei.openalliance.ad.ipc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import com.huawei.openalliance.ad.analysis.c;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.WhiteListPkgList;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.k;
import com.huawei.openalliance.ad.utils.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b<SERVICE extends IInterface> implements com.huawei.openalliance.ad.ipc.a.InterfaceC0217a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f19250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected c f19251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected com.huawei.openalliance.ad.ipc.a f19252c;
    private SERVICE e;
    private final String d = "install_service_timeout_task" + hashCode();
    private boolean f = false;
    private final byte[] g = new byte[0];
    private Set<a> h = new CopyOnWriteArraySet();
    private long i = -1;
    private ServiceConnection j = new ServiceConnection() { // from class: com.huawei.openalliance.ad.ipc.b.3
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            hw.b(b.this.b(), "PPS remote service disconnected");
            b.this.a((IInterface) null);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                if (b.this.h().equalsIgnoreCase(componentName.getClassName())) {
                    b.this.a((String) null, (String) null);
                    if (b.this.e()) {
                        dq.a(b.this.d);
                    }
                    hw.b(b.this.b(), "PPS remote service connected " + System.currentTimeMillis());
                    final IInterface iInterfaceA = b.this.a(iBinder);
                    b.this.a(iInterfaceA);
                    if (b.this.i() && b.this.e()) {
                        hw.c(b.this.b(), "install request is already timeout");
                        return;
                    } else {
                        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.ipc.b.3.1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.lang.Runnable
                            public void run() {
                                if (iInterfaceA != null) {
                                    ArrayList arrayList = new ArrayList(b.this.h);
                                    b.this.h.clear();
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        ((a) it.next()).a(iInterfaceA);
                                    }
                                }
                            }
                        });
                        return;
                    }
                }
                b.this.a("pps remote service name not match, disconnect service.");
                b.this.a((IInterface) null);
            } catch (Throwable th) {
                hw.c(b.this.b(), "BaseASM Service, service error: %s", th.getClass().getSimpleName());
            }
        }
    };

    protected abstract SERVICE a(IBinder iBinder);

    protected abstract String c();

    protected abstract String d();

    protected boolean e() {
        return true;
    }

    protected abstract boolean f();

    protected abstract String g();

    protected abstract String h();

    protected String b() {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void a(a aVar, long j) {
        hw.a(b(), "handleTask");
        aVar.a(this.f19252c);
        this.f19252c.a();
        IInterface iInterfaceK = k();
        if (iInterfaceK != null) {
            aVar.a(iInterfaceK);
            return;
        }
        if (this.i < 0) {
            this.i = as.c();
        }
        this.h.add(aVar);
        if (j() && e()) {
            a(j);
        }
    }

    @Override // com.huawei.openalliance.ad.ipc.a.InterfaceC0217a
    public void a() {
        synchronized (this) {
            this.f19250a.unbindService(this.j);
            this.e = null;
        }
    }

    private SERVICE k() {
        SERVICE service;
        synchronized (this) {
            service = this.e;
        }
        return service;
    }

    private boolean j() {
        try {
            hw.b(b(), "bindService " + System.currentTimeMillis());
            Intent intent = new Intent(c());
            String strD = d();
            intent.setPackage(strD);
            if (!cc.b(this.f19250a) && k.a(strD)) {
                String strE = k.e(this.f19250a, strD);
                boolean zIsEmpty = TextUtils.isEmpty(strE);
                hw.b(b(), "is sign empty: %s", Boolean.valueOf(zIsEmpty));
                if (!zIsEmpty && !WhiteListPkgList.isTrustApp(this.f19250a, strD, strE)) {
                    return false;
                }
            }
            boolean zBindService = this.f19250a.bindService(intent, this.j, 1);
            hw.b(b(), "bind service result: %s", Boolean.valueOf(zBindService));
            if (!zBindService) {
                a("bind service failed");
                a((String) null, "bind result false");
            }
            return zBindService;
        } catch (SecurityException e) {
            hw.c(b(), "bindService SecurityException");
            a("bindService SecurityException");
            a(e.getClass().getSimpleName(), e.getMessage());
            return false;
        } catch (Exception e2) {
            hw.c(b(), "bindService " + e2.getClass().getSimpleName());
            a("bindService " + e2.getClass().getSimpleName());
            a(e2.getClass().getSimpleName(), e2.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        boolean z;
        synchronized (this.g) {
            z = this.f;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        synchronized (this.g) {
            this.f = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final String str2) {
        if (f()) {
            final long jC = as.c() - this.i;
            hw.a(b(), "aidl bind duration: %d msg: %s", Long.valueOf(jC), str2);
            o.h(new Runnable() { // from class: com.huawei.openalliance.ad.ipc.b.2
                @Override // java.lang.Runnable
                public void run() {
                    b.this.f19251b.a(b.this.g(), jC, str, str2, -1);
                }
            });
            this.i = -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        try {
            ArrayList arrayList = new ArrayList(this.h);
            this.h.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(str);
            }
        } catch (Throwable th) {
            try {
                hw.c(b(), "notifyServiceCallFail " + th.getClass().getSimpleName());
            } finally {
                this.h.clear();
            }
        }
    }

    public static abstract class a<SERVICE extends IInterface> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.huawei.openalliance.ad.ipc.a f19260a;

        public abstract void a(SERVICE service);

        public void a(String str) {
        }

        protected void finalize() {
            try {
                super.finalize();
                o.f(new Runnable() { // from class: com.huawei.openalliance.ad.ipc.b.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (a.this.f19260a != null) {
                            a.this.f19260a.b();
                        }
                    }
                });
            } catch (Throwable th) {
                hw.b("BaseAidlSer", "finalize err: %s", th.getClass().getSimpleName());
            }
        }

        public void a(com.huawei.openalliance.ad.ipc.a aVar) {
            this.f19260a = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SERVICE service) {
        synchronized (this) {
            this.e = service;
        }
    }

    private void a(long j) {
        dq.a(this.d);
        a(false);
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.ipc.b.1
            @Override // java.lang.Runnable
            public void run() {
                hw.b(b.this.b(), "bind timeout " + System.currentTimeMillis());
                b.this.a(true);
                b.this.a("service bind timeout");
            }
        }, this.d, j);
    }

    public b(Context context) {
        this.f19250a = context.getApplicationContext();
        this.f19251b = new c(context);
    }
}
