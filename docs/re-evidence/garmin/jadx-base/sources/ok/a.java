package ok;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import bk.g;
import bk.i;
import bk.j;
import bk.l;
import ck.k;
import com.dsi.ant.channel.AntCommandFailedException;
import java.util.concurrent.CountDownLatch;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f132406k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f132407l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CountDownLatch f132408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CountDownLatch f132409n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public wj.a f132410o;

    /* JADX INFO: renamed from: ok.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C2516a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f132412b;

        static {
            int[] iArr = new int[ak.e.values().length];
            f132412b = iArr;
            try {
                iArr[ak.e.CHANNEL_CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f132412b[ak.e.RX_SEARCH_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[l.values().length];
            f132411a = iArr2;
            try {
                iArr2[l.CHANNEL_RESPONSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f132411a[l.ANT_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f132411a[l.CAPABILITIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f132411a[l.CHANNEL_STATUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f132411a[l.CHANNEL_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f132411a[l.CHANNEL_EVENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @Override // ok.e
    public void i() {
        j();
    }

    @Override // ok.e
    public final void l(nk.b bVar, e eVar, Handler handler) {
        if (!(bVar instanceof nk.a)) {
            h.s("Only Ant Channel Communicators are valid.");
        } else {
            this.f132410o = ((nk.a) bVar).f126363a;
            super.l(bVar, eVar, handler);
        }
    }

    @Override // ok.e
    public final void m() {
        synchronized (this.f132433a) {
            try {
                this.f132406k = false;
                this.f132407l = false;
                e eVar = this.f132437e;
                if (eVar == null || !(eVar instanceof a)) {
                    this.f132408m = new CountDownLatch(0);
                    this.f132409n = new CountDownLatch(0);
                }
                super.m();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // ok.e
    public final void o(nk.b bVar, Handler handler) {
        if (!(bVar instanceof nk.a)) {
            h.s("Only Ant Channel Communicators are valid.");
        } else {
            this.f132410o = ((nk.a) bVar).f126363a;
            super.o(bVar, handler);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0085 A[Catch: all -> 0x000d, TRY_LEAVE, TryCatch #2 {all -> 0x000d, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x0010, B:11:0x0014, B:13:0x0016, B:15:0x001d, B:17:0x0021, B:19:0x0027, B:21:0x0032, B:23:0x0036, B:24:0x005d, B:26:0x005f, B:28:0x0061, B:30:0x0065, B:31:0x006d, B:38:0x0081, B:40:0x0085, B:41:0x0087, B:44:0x00a6, B:45:0x00b5, B:46:0x00b6, B:33:0x0071, B:35:0x007c, B:48:0x00b8, B:74:0x014b, B:75:0x014e, B:49:0x00c1, B:54:0x00d0, B:58:0x00e4, B:59:0x00e7, B:60:0x00ea, B:62:0x00f5, B:64:0x00fb, B:66:0x010b, B:67:0x0114, B:70:0x0133, B:71:0x0142, B:72:0x0143, B:73:0x014a), top: B:83:0x0003, inners: #0, #1 }] */
    @Override // ok.e
    public final void q(l lVar, dk.a aVar) {
        ak.c cVar;
        synchronized (this.f132433a) {
            try {
                if (lVar == l.ANT_VERSION) {
                    this.f132409n.countDown();
                }
                if (this.f132442j == null) {
                    return;
                }
                if (this.f132407l && lVar == l.CHANNEL_STATUS) {
                    this.f132407l = false;
                    if (this.f132406k && ((cVar = new j(aVar).f18449c) == ak.c.ASSIGNED || cVar == ak.c.UNASSIGNED)) {
                        int i14 = qk.b.f145071a;
                        this.f132406k = false;
                        this.f132408m.countDown();
                        p(l.CHANNEL_EVENT, new dk.a(64, new byte[]{aVar.f60156b[0], 1, (byte) ak.e.CHANNEL_CLOSED.f3527a}));
                        return;
                    }
                    return;
                }
                if (this.f132406k) {
                    switch (C2516a.f132411a[lVar.ordinal()]) {
                        case 6:
                            ak.e eVar = new g(aVar).f18440c;
                            if (eVar != ak.e.CHANNEL_CLOSED) {
                                if (eVar == ak.e.RX_SEARCH_TIMEOUT) {
                                }
                                if (!this.f132407l) {
                                    this.f132407l = true;
                                    try {
                                        wj.a aVar2 = this.f132410o;
                                        aVar2.getClass();
                                        l lVar2 = l.CHANNEL_STATUS;
                                        Bundle bundle = new Bundle();
                                        dk.a aVarD = aVar2.f185705a.D(lVar2, bundle);
                                        wj.a.b(k.REQUEST_MESSAGE, bundle);
                                    } catch (AntCommandFailedException e4) {
                                        e4.toString();
                                        int i15 = qk.b.f145071a;
                                        this.f132442j.release();
                                        throw new RemoteException();
                                    }
                                    break;
                                }
                                return;
                            }
                            this.f132406k = false;
                            this.f132408m.countDown();
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            p(lVar, aVar);
                        default:
                            if (!this.f132407l) {
                                this.f132407l = true;
                                wj.a aVar3 = this.f132410o;
                                aVar3.getClass();
                                l lVar3 = l.CHANNEL_STATUS;
                                Bundle bundle2 = new Bundle();
                                dk.a aVarD2 = aVar3.f185705a.D(lVar3, bundle2);
                                wj.a.b(k.REQUEST_MESSAGE, bundle2);
                                break;
                            }
                            return;
                    }
                } else {
                    int i16 = C2516a.f132411a[lVar.ordinal()];
                    if (i16 == 1) {
                        i iVar = new i(aVar);
                        if (iVar.f18444b == 76 && iVar.f18446d == ak.l.RESPONSE_NO_ERROR) {
                            int i17 = qk.b.f145071a;
                            this.f132406k = true;
                            if (this.f132408m.getCount() > 0) {
                                throw new RuntimeException("AntChannelTask has an active closingTransition lock after non-locked close call");
                            }
                            this.f132408m = new CountDownLatch(1);
                            this.f132407l = true;
                            try {
                                wj.a aVar4 = this.f132410o;
                                aVar4.getClass();
                                l lVar4 = l.CHANNEL_STATUS;
                                Bundle bundle3 = new Bundle();
                                dk.a aVarD3 = aVar4.f185705a.D(lVar4, bundle3);
                                wj.a.b(k.REQUEST_MESSAGE, bundle3);
                            } catch (AntCommandFailedException e14) {
                                e14.toString();
                                int i18 = qk.b.f145071a;
                                this.f132410o.f();
                                throw new RemoteException();
                            }
                        }
                    } else if (i16 == 6) {
                        int i19 = C2516a.f132412b[new g(aVar).f18440c.ordinal()];
                        if (i19 == 1) {
                            int i24 = qk.b.f145071a;
                        } else if (i19 == 2) {
                            this.f132406k = true;
                        }
                    }
                }
                p(lVar, aVar);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final ak.c s() {
        synchronized (this.f132408m) {
            synchronized (this.f132433a) {
                if (!this.f132406k) {
                    try {
                        wj.a aVar = this.f132410o;
                        aVar.getClass();
                        l lVar = l.CHANNEL_STATUS;
                        Bundle bundle = new Bundle();
                        dk.a aVarD = aVar.f185705a.D(lVar, bundle);
                        wj.a.b(k.REQUEST_MESSAGE, bundle);
                        ak.c cVar = ((j) bk.b.f(aVarD)).f18449c;
                        if (cVar != ak.c.ASSIGNED && cVar != ak.c.UNASSIGNED) {
                            this.f132406k = true;
                            if (this.f132408m.getCount() > 0) {
                                throw new RuntimeException("AntChannelTask has an active closingTransition in locked closing call");
                            }
                            this.f132408m = new CountDownLatch(1);
                            int i14 = 0;
                            while (true) {
                                try {
                                    wj.a aVar2 = this.f132410o;
                                    aVar2.getClass();
                                    Bundle bundle2 = new Bundle();
                                    aVar2.f185705a.u(bundle2);
                                    wj.a.b(k.CLOSE_CHANNEL, bundle2);
                                    break;
                                } catch (AntCommandFailedException e4) {
                                    if (e4.getFailureReason() != wj.c.TRANSFER_IN_PROGRESS) {
                                        if (e4.getFailureReason() == wj.c.CHANNEL_RESPONSE && e4.getResponseMessage().f18446d == ak.l.CHANNEL_IN_WRONG_STATE) {
                                            break;
                                        }
                                        e4.toString();
                                        int i15 = qk.b.f145071a;
                                        throw new RemoteException();
                                    }
                                    i14++;
                                    if (i14 > 27) {
                                        int i16 = qk.b.f145071a;
                                        throw new RemoteException();
                                    }
                                    Thread.sleep(100L);
                                }
                            }
                        }
                        return cVar;
                    } catch (AntCommandFailedException e14) {
                        e14.toString();
                        int i17 = qk.b.f145071a;
                        throw new RemoteException();
                    }
                }
                this.f132408m.await();
                return ak.c.ASSIGNED;
            }
        }
    }

    public final void t() {
        e eVar = this.f132437e;
        if (eVar == null || !(eVar instanceof a)) {
            s();
        } else {
            ((a) eVar).t();
        }
    }

    public final void u() {
        e eVar = this.f132437e;
        if (eVar != null && (eVar instanceof a)) {
            ((a) eVar).u();
            return;
        }
        if (s() == ak.c.ASSIGNED) {
            synchronized (this.f132433a) {
                try {
                    try {
                        wj.a aVar = this.f132410o;
                        aVar.getClass();
                        Bundle bundle = new Bundle();
                        aVar.f185705a.o(bundle);
                        wj.a.b(k.UNASSIGN_CHANNEL, bundle);
                    } catch (AntCommandFailedException e4) {
                        e4.toString();
                        int i14 = qk.b.f145071a;
                        try {
                            wj.a aVar2 = this.f132410o;
                            aVar2.getClass();
                            l lVar = l.CHANNEL_STATUS;
                            Bundle bundle2 = new Bundle();
                            dk.a aVarD = aVar2.f185705a.D(lVar, bundle2);
                            wj.a.b(k.REQUEST_MESSAGE, bundle2);
                            if (((j) bk.b.f(aVarD)).f18449c == ak.c.UNASSIGNED) {
                                return;
                            }
                        } catch (AntCommandFailedException unused) {
                            e4.toString();
                            int i15 = qk.b.f145071a;
                        }
                        throw new RemoteException();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }
}
