package rk;

import ak.d;
import ak.f;
import ak.h;
import ak.i;
import ak.j;
import android.os.Bundle;
import android.os.RemoteException;
import ck.k;
import com.dsi.ant.channel.AntCommandFailedException;
import com.dsi.ant.utils.communicator.AntChannelSearchController;
import j20.x;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends ok.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f153021p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f153022q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f153023r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ak.b f153024s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f153025t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f153026u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f153027v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CountDownLatch f153028w = new CountDownLatch(0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f153029x;

    /* JADX INFO: renamed from: rk.a$a, reason: collision with other inner class name */
    public enum EnumC2896a {
        INTERRUPTED,
        SEARCH_TIMEOUT,
        FOUND_DEVICE,
        /* JADX INFO: Fake field, exist only in values array */
        NO_DEVICE_MATCH
    }

    public interface b {
    }

    public a(int i14, int i15, int i16, ak.b bVar, b bVar2) {
        this.f153021p = i15;
        this.f153022q = i14;
        this.f153023r = i16;
        if (bVar == null) {
            x.l("ChannelId is null");
            throw null;
        }
        this.f153024s = bVar;
        if (bVar2 != null) {
            this.f153029x = bVar2;
        } else {
            x.l("ResultReceiver is null");
            throw null;
        }
    }

    @Override // ok.e
    public final boolean j() {
        this.f153025t = true;
        b();
        this.f153028w.countDown();
        return true;
    }

    @Override // ok.e
    public final void n() {
        this.f153025t = false;
        this.f153026u = false;
    }

    public final boolean v() throws RemoteException {
        try {
            u();
        } catch (InterruptedException unused) {
            if (!this.f153025t) {
                w(EnumC2896a.INTERRUPTED);
                return false;
            }
        }
        if (!this.f153025t) {
            try {
                wj.a aVar = this.f132410o;
                d dVar = d.BIDIRECTIONAL_SLAVE;
                aVar.getClass();
                f fVar = new f();
                Bundle bundle = new Bundle();
                aVar.f185705a.i(dVar, fVar, bundle);
                wj.a.b(k.ASSIGN_CHANNEL, bundle);
                wj.a aVar2 = this.f132410o;
                int i14 = this.f153022q;
                aVar2.getClass();
                Bundle bundle2 = new Bundle();
                aVar2.f185705a.F(i14, bundle2);
                wj.a.b(k.CHANNEL_RF_FREQUENCY, bundle2);
                wj.a aVar3 = this.f132410o;
                int i15 = this.f153021p;
                aVar3.getClass();
                Bundle bundle3 = new Bundle();
                aVar3.f185705a.q(i15, bundle3);
                wj.a.b(k.CHANNEL_PERIOD, bundle3);
                this.f132410o.d(0);
                i iVar = new i();
                iVar.f3540b = true;
                wj.a aVar4 = this.f132410o;
                aVar4.getClass();
                Bundle bundle4 = new Bundle();
                if (vj.a.f178442c > 40000) {
                    aVar4.f185705a.j(iVar, bundle4);
                } else {
                    bundle4.putParcelable("com.dsi.ant.serviceerror", new xj.b(wj.c.INVALID_REQUEST));
                }
                wj.a.b(k.LIB_CONFIG, bundle4);
                if (!this.f153025t) {
                    return true;
                }
            } catch (AntCommandFailedException e4) {
                e4.toString();
                int i16 = qk.b.f145071a;
                throw new RemoteException();
            }
        }
        return false;
    }

    public final void w(EnumC2896a enumC2896a) {
        x(enumC2896a, null, null, true);
    }

    public final void x(EnumC2896a enumC2896a, ak.b bVar, Integer num, boolean z14) {
        synchronized (this.f153027v) {
            try {
                if (!this.f153025t && !this.f153026u) {
                    this.f153026u = z14;
                    ((AntChannelSearchController.g) this.f153029x).a(enumC2896a, bVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean y(j jVar) throws RemoteException {
        if (this.f153025t) {
            return false;
        }
        try {
            wj.a aVar = this.f132410o;
            ak.b bVar = this.f153024s;
            aVar.getClass();
            Bundle bundle = new Bundle();
            aVar.f185705a.m(bVar, bundle);
            wj.a.b(k.CHANNEL_ID, bundle);
            wj.a aVar2 = this.f132410o;
            int i14 = this.f153023r;
            aVar2.getClass();
            Bundle bundle2 = new Bundle();
            aVar2.f185705a.s(i14, bundle2);
            wj.a.b(k.PROXIMITY_SEARCH, bundle2);
            wj.a aVar3 = this.f132410o;
            aVar3.getClass();
            h hVar = h.DISABLED;
            Bundle bundle3 = new Bundle();
            xj.a aVar4 = aVar3.f185705a;
            aVar4.k(jVar, bundle3);
            wj.a.b(k.LOW_PRIORITY_SEARCH_TIMEOUT, bundle3);
            Bundle bundle4 = new Bundle();
            aVar4.C(hVar, bundle4);
            wj.a.b(k.SEARCH_TIMEOUT, bundle4);
            this.f153028w = new CountDownLatch(1);
            if (this.f153025t) {
                return false;
            }
            wj.a aVar5 = this.f132410o;
            aVar5.getClass();
            Bundle bundle5 = new Bundle();
            aVar5.f185705a.z(bundle5);
            wj.a.b(k.OPEN_CHANNEL, bundle5);
            return true;
        } catch (AntCommandFailedException e4) {
            e4.toString();
            int i15 = qk.b.f145071a;
            throw new RemoteException();
        }
    }
}
