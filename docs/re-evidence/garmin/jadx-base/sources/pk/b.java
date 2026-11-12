package pk;

import ak.c;
import android.os.RemoteException;
import bk.g;
import bk.l;
import com.dsi.ant.channel.AntCommandFailedException;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import ok.e;

/* JADX INFO: loaded from: classes7.dex */
public class b extends e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC2618b f138175o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f138176p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CountDownLatch f138178r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ek.a f138171k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f138172l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f138173m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f138174n = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f138181u = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f138179s = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f138177q = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f138180t = false;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f138182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f138183b;

        static {
            int[] iArr = new int[l.values().length];
            f138183b = iArr;
            try {
                iArr[l.CHANNEL_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f138183b[l.BROADCAST_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f138183b[l.ACKNOWLEDGED_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ak.e.values().length];
            f138182a = iArr2;
            try {
                iArr2[ak.e.RX_SEARCH_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f138182a[ak.e.CHANNEL_CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f138182a[ak.e.TRANSFER_TX_COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f138182a[ak.e.TRANSFER_TX_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f138182a[ak.e.CHANNEL_COLLISION.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f138182a[ak.e.RX_FAIL.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: pk.b$b, reason: collision with other inner class name */
    public interface InterfaceC2618b {
        void a(l lVar, dk.a aVar);
    }

    public b(byte[] bArr, InterfaceC2618b interfaceC2618b, fk.a aVar) {
        this.f138176p = bArr;
        this.f138175o = interfaceC2618b;
    }

    @Override // ok.e
    public void a(l lVar, dk.a aVar) {
        InterfaceC2618b interfaceC2618b = this.f138175o;
        if (interfaceC2618b != null) {
            interfaceC2618b.a(lVar, aVar);
        }
        int i14 = a.f138183b[lVar.ordinal()];
        if (i14 != 1) {
            if ((i14 == 2 || i14 == 3) && !this.f138179s) {
                u();
                return;
            }
            return;
        }
        switch (a.f138182a[new g(aVar).f18440c.ordinal()]) {
            case 1:
                gk.a.a();
                break;
            case 2:
                gk.a.a();
                b();
                this.f138178r.countDown();
                break;
            case 3:
                this.f138180t = false;
                this.f138179s = true;
                b();
                this.f138178r.countDown();
                break;
            case 4:
                this.f138180t = false;
                u();
                break;
            case 5:
            case 6:
                if (!this.f138179s) {
                    u();
                }
                break;
        }
    }

    @Override // ok.e
    public final void c() throws RemoteException {
        if (this.f138176p.length < 8) {
            gk.a.a();
            t(ek.a.FAIL_BAD_PARAMS);
            return;
        }
        try {
            if (this.f132442j.d() != c.TRACKING) {
                gk.a.a();
                t(ek.a.FAIL_DEVICE_TRANSMISSION_LOST);
                return;
            }
            this.f138178r = new CountDownLatch(1);
            e();
            u();
            while (!this.f138174n && !this.f138179s) {
                try {
                    this.f138178r.await();
                } catch (InterruptedException unused) {
                    gk.a.a();
                }
            }
            if (this.f138179s) {
                t(ek.a.SUCCESS);
            } else {
                t(ek.a.FAIL_DEVICE_COMMUNICATION_FAILURE);
            }
        } catch (AntCommandFailedException e4) {
            e4.toString();
            gk.a.a();
            t(ek.a.FAIL_DEVICE_COMMUNICATION_FAILURE);
            throw new RemoteException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        InterfaceC2618b interfaceC2618b = bVar.f138175o;
        InterfaceC2618b interfaceC2618b2 = this.f138175o;
        if (interfaceC2618b2 == null) {
            if (interfaceC2618b != null) {
                return false;
            }
        } else if (!interfaceC2618b2.equals(interfaceC2618b)) {
            return false;
        }
        return this.f138179s == bVar.f138179s && this.f138174n == bVar.f138174n && this.f138180t == bVar.f138180t && Arrays.equals(this.f138176p, bVar.f138176p) && this.f138171k == bVar.f138171k;
    }

    @Override // ok.e
    public String f() {
        return "Send Transfer Data";
    }

    public final int hashCode() {
        InterfaceC2618b interfaceC2618b = this.f138175o;
        int iHashCode = (Arrays.hashCode(this.f138176p) + (((((((((interfaceC2618b == null ? 0 : interfaceC2618b.hashCode()) + 31) * 31) + (this.f138179s ? 1231 : 1237)) * 31) + (this.f138174n ? 1231 : 1237)) * 31) + (this.f138180t ? 1231 : 1237)) * 31)) * 961;
        ek.a aVar = this.f138171k;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // ok.e
    public final void i() {
        this.f138174n = true;
        j();
    }

    @Override // ok.e
    public final boolean j() {
        if (!this.f138173m) {
            return false;
        }
        int i14 = gk.a.f77715a;
        gk.a.EnumC1568a.DEBUG.ordinal();
        this.f138177q = 12;
        return true;
    }

    @Override // ok.e
    public final void n() {
    }

    public void s() {
        this.f138177q++;
        this.f138179s = false;
        this.f138180t = true;
    }

    public void t(ek.a aVar) {
        synchronized (this.f138172l) {
            try {
                if (this.f138171k == null) {
                    this.f138171k = aVar;
                } else {
                    Objects.toString(aVar);
                    Objects.toString(this.f138171k);
                    int i14 = gk.a.f77715a;
                    gk.a.EnumC1568a.DEBUG.ordinal();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void u() {
        if (this.f138180t) {
            return;
        }
        if (this.f138177q >= 12) {
            int i14 = gk.a.f77715a;
            gk.a.EnumC1568a.DEBUG.ordinal();
            b();
            this.f138178r.countDown();
            return;
        }
        s();
        try {
            byte[] bArr = this.f138176p;
            int length = bArr.length;
            nk.b bVar = this.f132442j;
            if (length > 8) {
                bVar.e(bArr);
            } else {
                bVar.b(bArr);
            }
        } catch (AntCommandFailedException e4) {
            if (e4.getFailureReason() == wj.c.TRANSFER_IN_PROGRESS) {
                int i15 = gk.a.f77715a;
                gk.a.EnumC1568a.VERBOSE.ordinal();
            } else {
                if (e4.getFailureReason() == wj.c.TRANSFER_FAILED) {
                    this.f138180t = false;
                    return;
                }
                e4.toString();
                gk.a.a();
                b();
                this.f138179s = false;
                this.f138178r.countDown();
            }
        }
    }
}
