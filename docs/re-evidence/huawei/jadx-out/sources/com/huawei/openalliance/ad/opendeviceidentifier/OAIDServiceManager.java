package com.huawei.openalliance.ad.opendeviceidentifier;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.huawei.openalliance.ad.analysis.c;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.WhiteListPkgList;
import com.huawei.openalliance.ad.cu;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.cd;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.k;
import com.huawei.openalliance.ad.utils.o;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class OAIDServiceManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static OAIDServiceManager f19834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f19835b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f19836c = new byte[0];
    private cu d;
    private Context e;
    private c k;
    private int l;
    private Set<OaidResultCallback> f = new HashSet();
    private boolean g = false;
    private final byte[] h = new byte[0];
    private final String i = "oaid_timeout_task" + hashCode();
    private long j = -1;
    private ServiceConnection m = new ServiceConnection() { // from class: com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.5
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            hw.b("OAIDServiceManager", "OAID service disconnected");
            OAIDServiceManager.this.a((cu) null);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                OAIDServiceManager.this.a((String) null, (String) null);
                dq.a(OAIDServiceManager.this.i);
                hw.b("OAIDServiceManager", "OAID service connected " + System.currentTimeMillis());
                OAIDServiceManager.this.a(cu.a.a(iBinder));
                if (!OAIDServiceManager.this.b()) {
                    final cu cuVarC = OAIDServiceManager.this.c();
                    o.f(new Runnable() { // from class: com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.5.1
                        @Override // java.lang.Runnable
                        public void run() {
                            OAIDServiceManager oAIDServiceManager;
                            if (cuVarC != null) {
                                synchronized (OAIDServiceManager.f19836c) {
                                    try {
                                        String strA = cuVarC.a();
                                        boolean zB = cuVarC.b();
                                        Iterator it = OAIDServiceManager.this.f.iterator();
                                        while (it.hasNext()) {
                                            ((OaidResultCallback) it.next()).a(strA, zB);
                                        }
                                        oAIDServiceManager = OAIDServiceManager.this;
                                    } catch (Throwable th) {
                                        try {
                                            hw.c("OAIDServiceManager", "get oaid Exception: " + th.getClass().getSimpleName());
                                            OAIDServiceManager.this.e();
                                            oAIDServiceManager = OAIDServiceManager.this;
                                        } catch (Throwable th2) {
                                            OAIDServiceManager.this.f.clear();
                                            throw th2;
                                        }
                                    }
                                    oAIDServiceManager.f.clear();
                                }
                                return;
                            }
                            OAIDServiceManager.this.e();
                        }
                    });
                } else {
                    hw.c("OAIDServiceManager", "oaid require is already timeout");
                }
            } catch (Throwable th) {
                hw.c("OAIDServiceManager", "Oaid Service, service error: %s", th.getClass().getSimpleName());
            }
        }
    };

    public static abstract class OaidResultCallback {
        public abstract void a();

        public abstract void a(String str, boolean z);

        public int b() {
            return -1;
        }
    }

    public void requireOaid(final OaidResultCallback oaidResultCallback, final long j) {
        if (oaidResultCallback == null) {
            return;
        }
        if (fp.b(this.e).ai() == 0 && cd.b(this.e)) {
            hw.b("OAIDServiceManager", "requireOaid via provider");
            o.a(new Runnable() { // from class: com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.1
                @Override // java.lang.Runnable
                public void run() {
                    OAIDServiceManager.this.a(oaidResultCallback, j);
                }
            });
        } else {
            hw.b("OAIDServiceManager", "requireOaid via aidl");
            b(oaidResultCallback, j);
        }
    }

    public void requireOaid(OaidResultCallback oaidResultCallback) {
        requireOaid(oaidResultCallback, 400L);
    }

    public static OAIDServiceManager getInstance(Context context) {
        OAIDServiceManager oAIDServiceManager;
        synchronized (f19835b) {
            if (f19834a == null) {
                f19834a = new OAIDServiceManager(context);
            }
            oAIDServiceManager = f19834a;
        }
        return oAIDServiceManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        synchronized (f19836c) {
            try {
                try {
                    try {
                        for (final OaidResultCallback oaidResultCallback : this.f) {
                            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.3
                                @Override // java.lang.Runnable
                                public void run() {
                                    oaidResultCallback.a();
                                }
                            });
                        }
                    } catch (RuntimeException e) {
                        hw.c("OAIDServiceManager", "notifyOaidAcquireFail RuntimeException " + e.getClass().getSimpleName());
                    }
                } catch (Exception e2) {
                    hw.c("OAIDServiceManager", "notifyOaidAcquireFail " + e2.getClass().getSimpleName());
                }
                this.f.clear();
            } catch (Throwable th) {
                this.f.clear();
                throw th;
            }
        }
    }

    private boolean d() {
        String simpleName;
        String message;
        try {
            hw.b("OAIDServiceManager", "bindService " + System.currentTimeMillis());
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            String strE = k.e(this.e);
            intent.setPackage(strE);
            if (!cc.b(this.e)) {
                String strE2 = k.e(this.e, strE);
                boolean zIsEmpty = TextUtils.isEmpty(strE2);
                hw.b("OAIDServiceManager", "is sign empty: %s", Boolean.valueOf(zIsEmpty));
                if (!zIsEmpty && !WhiteListPkgList.isTrustApp(this.e, strE, strE2)) {
                    return false;
                }
            }
            boolean zBindService = this.e.bindService(intent, this.m, 1);
            hw.b("OAIDServiceManager", "bind service result: %s", Boolean.valueOf(zBindService));
            if (!zBindService) {
                e();
                a((String) null, "bind result false");
            }
            return zBindService;
        } catch (SecurityException e) {
            hw.c("OAIDServiceManager", "bindService SecurityException");
            e();
            String simpleName2 = e.getClass().getSimpleName();
            message = e.getMessage();
            simpleName = simpleName2;
            a(simpleName, message);
            return false;
        } catch (Exception e2) {
            hw.c("OAIDServiceManager", "bindService " + e2.getClass().getSimpleName());
            e();
            simpleName = e2.getClass().getSimpleName();
            message = e2.getMessage();
            a(simpleName, message);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public cu c() {
        cu cuVar;
        synchronized (this) {
            cuVar = this.d;
        }
        return cuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        boolean z;
        synchronized (this.h) {
            z = this.g;
        }
        return z;
    }

    private void b(OaidResultCallback oaidResultCallback, long j) {
        cu cuVarC = c();
        if (cuVarC != null) {
            o.a(new a(oaidResultCallback, cuVarC), o.a.CALCULATION, false);
            return;
        }
        if (this.j < 0) {
            this.j = as.c();
            this.l = oaidResultCallback.b();
        }
        synchronized (f19836c) {
            this.f.add(oaidResultCallback);
        }
        if (d()) {
            b(j);
        }
    }

    private void b(long j) {
        dq.a(this.i);
        a(false);
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.2
            @Override // java.lang.Runnable
            public void run() {
                o.f(new Runnable() { // from class: com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        hw.b("OAIDServiceManager", "bind timeout " + System.currentTimeMillis());
                        OAIDServiceManager.this.a(true);
                        OAIDServiceManager.this.e();
                    }
                });
            }
        }, this.i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        synchronized (this.h) {
            this.g = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final String str2) {
        final long jC = as.c() - this.j;
        if (jC > SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
            return;
        }
        final int i = this.l;
        hw.a("OAIDServiceManager", "aidl bind duration: %d msg: %s", Long.valueOf(jC), str2);
        o.h(new Runnable() { // from class: com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.4
            @Override // java.lang.Runnable
            public void run() {
                OAIDServiceManager.this.k.a(HealthZonePushReceiver.ECG_MEASUREMENT_ABNORMAL, jC, str, str2, i);
            }
        });
        this.j = -1L;
        this.l = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(OaidResultCallback oaidResultCallback, long j) {
        a(j);
        synchronized (f19836c) {
            this.f.add(oaidResultCallback);
        }
        Pair<String, Boolean> pairA = cd.a(this.e);
        dq.a(this.i);
        if (b()) {
            hw.c("OAIDServiceManager", "provider timeout");
        } else {
            oaidResultCallback.a((String) pairA.first, ((Boolean) pairA.second).booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(cu cuVar) {
        synchronized (this) {
            this.d = cuVar;
        }
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private OaidResultCallback f19850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private cu f19851b;

        @Override // java.lang.Runnable
        public void run() {
            String str;
            try {
                this.f19850a.a(this.f19851b.a(), this.f19851b.b());
            } catch (RemoteException unused) {
                str = "requireOaid RemoteException";
                hw.c("OAIDServiceManager", str);
                this.f19850a.a();
            } catch (Exception unused2) {
                str = "requireOaid exception";
                hw.c("OAIDServiceManager", str);
                this.f19850a.a();
            }
        }

        a(OaidResultCallback oaidResultCallback, cu cuVar) {
            this.f19850a = oaidResultCallback;
            this.f19851b = cuVar;
        }
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<OAIDServiceManager> f19852a;

        @Override // java.lang.Runnable
        public void run() {
            OAIDServiceManager oAIDServiceManager = this.f19852a.get();
            hw.a("OAIDServiceManager", "provider timeout");
            if (oAIDServiceManager != null) {
                oAIDServiceManager.e();
                oAIDServiceManager.a(true);
            }
        }

        public b(OAIDServiceManager oAIDServiceManager) {
            this.f19852a = new WeakReference<>(oAIDServiceManager);
        }
    }

    private void a(long j) {
        dq.a(this.i);
        a(false);
        dq.a(new b(this), this.i, j);
    }

    private OAIDServiceManager(Context context) {
        this.e = context.getApplicationContext();
        this.k = new c(context);
    }
}
