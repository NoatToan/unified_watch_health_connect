package jk;

import android.os.Bundle;
import android.os.RemoteException;
import com.dsi.ant.channel.AntCommandFailedException;
import com.google.common.base.Ascii;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class d extends p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f99008m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CountDownLatch f99009n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f99010o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f99011p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f99012q;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f99014b;

        static {
            int[] iArr = new int[bk.l.values().length];
            f99014b = iArr;
            try {
                iArr[bk.l.CHANNEL_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99014b[bk.l.BROADCAST_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ak.e.values().length];
            f99013a = iArr2;
            try {
                iArr2[ak.e.CHANNEL_CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f99013a[ak.e.RX_SEARCH_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f99013a[ak.e.TRANSFER_TX_COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f99013a[ak.e.TRANSFER_TX_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public d(j.k kVar, int i14, int i15, int i16, int i17, int i18) {
        super(kVar);
        byte[] bArr = {68, 3, 0, 0, 0, 0, 0, 0};
        this.f99008m = bArr;
        this.f99010o = false;
        ik.a.a(2, i14, bArr);
        ik.a.a(3, i15, bArr);
        ik.a.a(4, i16, bArr);
        this.f99011p = i17;
        this.f99012q = i18;
    }

    @Override // ok.e
    public final void a(bk.l lVar, dk.a aVar) throws RemoteException {
        int i14 = a.f99014b[lVar.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                return;
            }
            bk.d dVar = new bk.d(aVar);
            if (dVar.j()[0] == 67 || dVar.j()[0] == 69) {
                byte b14 = dVar.j()[0];
                if ((dVar.j()[2] & Ascii.SI) == 0) {
                    b();
                    this.f99009n.countDown();
                    return;
                } else {
                    if (this.f99010o) {
                        return;
                    }
                    try {
                        this.f132442j.b(this.f99008m);
                        this.f99010o = true;
                        return;
                    } catch (AntCommandFailedException e4) {
                        if (e4.getFailureReason() == wj.c.TRANSFER_IN_PROGRESS) {
                            this.f99010o = true;
                            return;
                        } else {
                            int i15 = qk.b.f145071a;
                            throw new RemoteException();
                        }
                    }
                }
            }
            return;
        }
        int i16 = a.f99013a[new bk.g(aVar).f18440c.ordinal()];
        if (i16 == 1) {
            int i17 = qk.b.f145071a;
            b();
            this.f99009n.countDown();
            return;
        }
        if (i16 == 2) {
            int i18 = qk.b.f145071a;
            return;
        }
        if (i16 != 3) {
            if (i16 != 4) {
                return;
            }
            this.f99010o = false;
            return;
        }
        try {
            nk.b bVar = this.f132442j;
            if (bVar instanceof nk.a) {
                wj.a aVar2 = ((nk.a) bVar).f126363a;
                int i19 = this.f99011p;
                aVar2.getClass();
                Bundle bundle = new Bundle();
                aVar2.f185705a.q(i19, bundle);
                wj.a.b(ck.k.CHANNEL_PERIOD, bundle);
                wj.a aVar3 = ((nk.a) this.f132442j).f126363a;
                int i24 = this.f99012q;
                aVar3.getClass();
                Bundle bundle2 = new Bundle();
                aVar3.f185705a.F(i24, bundle2);
                wj.a.b(ck.k.CHANNEL_RF_FREQUENCY, bundle2);
            }
            b();
            this.f99009n.countDown();
        } catch (AntCommandFailedException unused) {
            int i25 = qk.b.f145071a;
            throw new RemoteException();
        }
    }

    @Override // ok.e
    public final void c() throws RemoteException {
        try {
            this.f99009n = new CountDownLatch(1);
            e();
            ak.c cVarD = this.f132442j.d();
            ak.c cVar = ak.c.TRACKING;
            j.k kVar = this.f99181l;
            if (cVarD == cVar) {
                kVar.a(j.h.DISCONNECTING, j.g.DISCONNECT_REQUESTED);
                this.f99009n.await(2750L, TimeUnit.MILLISECONDS);
                kVar.a(j.h.NOT_CONNECTED, j.g.DISCONNECT_PASS);
                this.f99180k = j.i.SUCCESS;
                return;
            }
            nk.b bVar = this.f132442j;
            if (bVar instanceof nk.a) {
                wj.a aVar = ((nk.a) bVar).f126363a;
                int i14 = this.f99011p;
                aVar.getClass();
                Bundle bundle = new Bundle();
                aVar.f185705a.q(i14, bundle);
                wj.a.b(ck.k.CHANNEL_PERIOD, bundle);
                wj.a aVar2 = ((nk.a) this.f132442j).f126363a;
                int i15 = this.f99012q;
                aVar2.getClass();
                Bundle bundle2 = new Bundle();
                aVar2.f185705a.F(i15, bundle2);
                wj.a.b(ck.k.CHANNEL_RF_FREQUENCY, bundle2);
            }
            b();
            int i16 = qk.b.f145071a;
            kVar.a(j.h.NOT_CONNECTED, j.g.CONNECTION_LOST);
            this.f99180k = j.i.FAIL_DEVICE_TRANSMISSION_LOST;
        } catch (AntCommandFailedException e4) {
            e4.toString();
            int i17 = qk.b.f145071a;
            throw new RemoteException();
        } catch (InterruptedException unused) {
            int i18 = qk.b.f145071a;
            this.f99180k = j.i.FAIL_EXECUTOR_CANCELLED_TASK;
            Thread.currentThread().interrupt();
        }
    }

    @Override // ok.e
    public final String f() {
        return "ANT-FS Host Disconnect Channel Task";
    }

    @Override // jk.p
    public final boolean s(j.h hVar) {
        return (hVar == j.h.NOT_CONNECTED || hVar == j.h.DEAD) ? false : true;
    }
}
