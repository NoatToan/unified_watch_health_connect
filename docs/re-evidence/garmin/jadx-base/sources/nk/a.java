package nk;

import ak.c;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import bk.j;
import bk.l;
import ck.k;
import ok.d;
import vb.h;
import wj.i;

/* JADX INFO: loaded from: classes7.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wj.a f126363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f126364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ServiceConnection f126365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile ok.b f126366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f126367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f126368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2430a f126369g;

    /* JADX INFO: renamed from: nk.a$a, reason: collision with other inner class name */
    public class C2430a implements i {
        public C2430a() {
        }

        @Override // wj.i
        public final void a(l lVar, dk.a aVar) {
            ok.b bVar = a.this.f126366d;
            if (bVar != null) {
                bVar.a(lVar, aVar);
            }
        }

        @Override // wj.i
        public final void b() {
            ok.b bVar = a.this.f126366d;
            if (bVar != null) {
                d.a(bVar.f132413a);
            }
        }
    }

    public a(wj.a aVar) {
        this.f126367e = false;
        this.f126368f = new Object();
        this.f126369g = new C2430a();
        this.f126364b = null;
        this.f126365c = null;
        this.f126363a = aVar;
        f();
    }

    @Override // nk.b
    public final void a(ok.b bVar) {
        this.f126366d = bVar;
    }

    @Override // nk.b
    public final void b(byte[] bArr) {
        wj.a aVar = this.f126363a;
        aVar.getClass();
        if (bArr.length != 8) {
            h.w();
            return;
        }
        Bundle bundle = new Bundle();
        aVar.f185705a.b(bArr, bundle);
        wj.a.b(k.ACKNOWLEDGED_DATA, bundle);
    }

    @Override // nk.b
    public final void c() {
        this.f126366d = null;
    }

    @Override // nk.b
    public final c d() {
        wj.a aVar = this.f126363a;
        aVar.getClass();
        l lVar = l.CHANNEL_STATUS;
        Bundle bundle = new Bundle();
        dk.a aVarD = aVar.f185705a.D(lVar, bundle);
        wj.a.b(k.REQUEST_MESSAGE, bundle);
        return ((j) bk.b.f(aVarD)).f18449c;
    }

    @Override // nk.b
    public final void e(byte[] bArr) {
        wj.a aVar = this.f126363a;
        aVar.getClass();
        if (bArr.length < 8) {
            h.w();
            return;
        }
        Bundle bundle = new Bundle();
        aVar.f185705a.d(bArr, bundle);
        wj.a.b(k.BURST_TRANSFER_DATA, bundle);
    }

    public final void f() {
        wj.a aVar = this.f126363a;
        if (aVar == null) {
            h.s("Can't create a communicator around a null ANT channel.");
            return;
        }
        aVar.f185705a.g();
        wj.a aVar2 = this.f126363a;
        C2430a c2430a = this.f126369g;
        if (c2430a == null) {
            aVar2.f185707c = false;
            aVar2.f185705a.t();
        } else {
            wj.a.b bVar = aVar2.f185706b;
            bVar.f185708a = c2430a;
            aVar2.f185705a.y(bVar);
            aVar2.f185707c = true;
        }
    }

    @Override // nk.b
    public final void release() {
        synchronized (this.f126368f) {
            try {
                if (this.f126367e) {
                    return;
                }
                this.f126367e = true;
                this.f126363a.f();
                ServiceConnection serviceConnection = this.f126365c;
                if (serviceConnection != null) {
                    this.f126364b.unbindService(serviceConnection);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public a(wj.a aVar, ServiceConnection serviceConnection, Context context) {
        this.f126367e = false;
        this.f126368f = new Object();
        this.f126369g = new C2430a();
        this.f126364b = context;
        this.f126365c = serviceConnection;
        this.f126363a = aVar;
        f();
    }
}
