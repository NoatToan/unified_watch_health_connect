package rk;

import ak.e;
import ak.j;
import ak.m;
import android.os.Bundle;
import android.os.RemoteException;
import bk.d;
import bk.g;
import bk.h;
import bk.l;
import ck.k;
import com.dsi.ant.channel.AntCommandFailedException;

/* JADX INFO: loaded from: classes7.dex */
public class c extends rk.a {
    public boolean A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ak.b f153037y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Integer f153038z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153039a;

        static {
            int[] iArr = new int[l.values().length];
            f153039a = iArr;
            try {
                iArr[l.CHANNEL_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f153039a[l.BROADCAST_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f153039a[l.ACKNOWLEDGED_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(int i14, int i15, int i16, int i17, int i18, int i19, rk.a.b bVar) {
        super(i15, i16, i19, new ak.b(i14, i17, i18), bVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007f A[Catch: AntCommandFailedException -> 0x0042, TryCatch #0 {AntCommandFailedException -> 0x0042, blocks: (B:3:0x0001, B:10:0x0013, B:12:0x0017, B:14:0x003c, B:18:0x0049, B:20:0x004f, B:22:0x005a, B:27:0x006f, B:29:0x0082, B:25:0x006b, B:28:0x007f, B:17:0x0044, B:31:0x008b, B:33:0x0096, B:35:0x009a, B:37:0x009e), top: B:41:0x0001 }] */
    @Override // ok.e
    public final void a(l lVar, dk.a aVar) {
        try {
            int i14 = a.f153039a[lVar.ordinal()];
            if (i14 == 1) {
                e eVar = new g(aVar).f18440c;
                if (eVar == e.RX_SEARCH_TIMEOUT) {
                    gk.a.a();
                    return;
                } else {
                    if (eVar == e.CHANNEL_CLOSED) {
                        gk.a.a();
                        b();
                        this.f153028w.countDown();
                        return;
                    }
                    return;
                }
            }
            if ((i14 == 2 || i14 == 3) && !this.f153025t) {
                wj.a aVar2 = this.f132410o;
                aVar2.getClass();
                l lVar2 = l.CHANNEL_ID;
                Bundle bundle = new Bundle();
                dk.a aVarD = aVar2.f185705a.D(lVar2, bundle);
                wj.a.b(k.REQUEST_MESSAGE, bundle);
                this.f153037y = ((h) bk.b.f(aVarD)).f18442b;
                bk.k aVar3 = lVar == l.ACKNOWLEDGED_DATA ? new bk.a(aVar) : new d(aVar);
                if (ak.g.a(aVar3) && new ak.g(aVar3).b()) {
                    int i15 = new ak.g(aVar3).f3531b.f3563a;
                    m.a aVar4 = m.a.DBM;
                    if ((i15 == aVar4.f3569a ? aVar4 : m.a.UNKNOWN) == aVar4) {
                        this.f153038z = Integer.valueOf(new ak.g(aVar3).f3531b.f3564b);
                    } else {
                        this.f153038z = null;
                    }
                } else {
                    this.f153038z = null;
                }
                b();
                this.f153028w.countDown();
            }
        } catch (AntCommandFailedException e4) {
            e4.toString();
            gk.a.a();
            b();
            this.A = true;
            this.f153028w.countDown();
        }
    }

    @Override // ok.e
    public final void c() throws RemoteException {
        boolean z14 = false;
        this.A = false;
        this.f153037y = null;
        this.f153038z = null;
        if (v()) {
            e();
            if (y(j.TEN_SECONDS)) {
                try {
                    if (!this.f153025t) {
                        this.f153028w.await();
                    }
                } catch (InterruptedException unused) {
                    b();
                    z14 = true;
                }
                if (this.f153025t || z14) {
                    try {
                        wj.a aVar = this.f132410o;
                        aVar.getClass();
                        Bundle bundle = new Bundle();
                        aVar.f185705a.u(bundle);
                        wj.a.b(k.CLOSE_CHANNEL, bundle);
                    } catch (AntCommandFailedException e4) {
                        if (e4.getFailureReason() != wj.c.INVALID_REQUEST) {
                            e4.toString();
                            int i14 = qk.b.f145071a;
                        }
                    }
                }
                if (this.A) {
                    throw new RemoteException();
                }
                if (this.f153025t) {
                    return;
                }
                if (z14) {
                    w(rk.a.EnumC2896a.INTERRUPTED);
                    return;
                }
                ak.b bVar = this.f153037y;
                if (bVar == null) {
                    w(rk.a.EnumC2896a.SEARCH_TIMEOUT);
                } else {
                    x(rk.a.EnumC2896a.FOUND_DEVICE, bVar, this.f153038z, true);
                }
            }
        }
    }

    @Override // ok.e
    public final String f() {
        return "Single Search Controller";
    }
}
