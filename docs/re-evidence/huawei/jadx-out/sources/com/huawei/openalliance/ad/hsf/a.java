package com.huawei.openalliance.ad.hsf;

import android.content.Context;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.o;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class a implements e.a {
    private static a d;
    private static final byte[] e = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f18912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f18913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<C0212a> f18914c = new CopyOnWriteArrayList();

    public interface b {
        void a();

        void b();

        void c();
    }

    @Override // com.huawei.openalliance.ad.hsf.e.a
    public void b(int i) {
        hw.b("HsfPackageInstaller", "onConnectionFailed result: %d", Integer.valueOf(i));
        this.f18913b = null;
        if (i != 5 && i != 1) {
            c();
            return;
        }
        for (C0212a c0212a : this.f18914c) {
            if (c0212a.f18921c != null) {
                c0212a.f18921c.a();
            }
        }
        this.f18914c.clear();
    }

    public void a(String str, String str2, b bVar) {
        if (this.f18913b == null) {
            if (this.f18912a.b()) {
                d dVarB = b();
                this.f18913b = dVarB;
                if (dVarB == null) {
                    a(bVar);
                }
            } else {
                this.f18914c.add(new C0212a(str, str2, bVar));
                this.f18912a.a();
            }
        }
        b(str, str2, bVar);
    }

    @Override // com.huawei.openalliance.ad.hsf.e.a
    public void a(int i) {
        hw.b("HsfPackageInstaller", "onConnectionSuspended cause: %d", Integer.valueOf(i));
        this.f18913b = null;
        c();
    }

    @Override // com.huawei.openalliance.ad.hsf.e.a
    public void a() {
        this.f18913b = b();
        for (C0212a c0212a : this.f18914c) {
            if (this.f18913b == null) {
                a(c0212a.f18921c);
            } else {
                b(c0212a.f18919a, c0212a.f18920b, c0212a.f18921c);
            }
        }
        this.f18914c.clear();
    }

    private void c() {
        Iterator<C0212a> it = this.f18914c.iterator();
        while (it.hasNext()) {
            a(it.next().f18921c);
        }
        this.f18914c.clear();
    }

    private void b(final String str, final String str2, final b bVar) {
        final d dVar = this.f18913b;
        if (dVar != null) {
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.hsf.a.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        dVar.a(str, str2, new c.a() { // from class: com.huawei.openalliance.ad.hsf.a.1.1
                            @Override // com.huawei.openalliance.ad.hsf.c
                            public void a(String str3, int i) {
                                hw.a("HsfPackageInstaller", "packageInstalled %s code: %d", str3, Integer.valueOf(i));
                                if (i != 1) {
                                    a.this.a(bVar);
                                } else {
                                    a.this.b(bVar);
                                }
                            }
                        }, 2);
                    } catch (Exception e2) {
                        hw.c("HsfPackageInstaller", "installPackage " + e2.getClass().getSimpleName());
                        a.this.a(bVar);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(b bVar) {
        if (bVar != null) {
            bVar.b();
        }
    }

    private d b() {
        PPSHsfService pPSHsfServiceA = this.f18912a.a("com.huawei.hsf.pm.service.IPackageManager");
        if (pPSHsfServiceA != null) {
            return d.a.a(pPSHsfServiceA.b());
        }
        hw.c("HsfPackageInstaller", "cannot find package manager, hsf isConnected: %s", Boolean.valueOf(this.f18912a.b()));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar) {
        if (bVar != null) {
            bVar.c();
        }
    }

    public static a a(Context context) {
        a aVar;
        synchronized (e) {
            if (d == null) {
                d = new a(context);
            }
            aVar = d;
        }
        return aVar;
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.hsf.a$a, reason: collision with other inner class name */
    static class C0212a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f18919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f18920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        b f18921c;

        C0212a(String str, String str2, b bVar) {
            this.f18919a = str;
            this.f18920b = str2;
            this.f18921c = bVar;
        }
    }

    private a(Context context) {
        e eVarA = e.a(context, this);
        this.f18912a = eVarA;
        eVarA.a();
    }
}
