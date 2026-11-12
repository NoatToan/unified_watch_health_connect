package jk;

import android.os.RemoteException;
import com.dsi.ant.channel.AntCommandFailedException;
import com.google.common.primitives.UnsignedBytes;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class g extends p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CountDownLatch f99049m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f99050n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f99051o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f99052p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final byte[] f99053q;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f99055b;

        static {
            int[] iArr = new int[bk.l.values().length];
            f99055b = iArr;
            try {
                iArr[bk.l.CHANNEL_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99055b[bk.l.BROADCAST_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f99055b[bk.l.ACKNOWLEDGED_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ak.e.values().length];
            f99054a = iArr2;
            try {
                iArr2[ak.e.RX_SEARCH_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f99054a[ak.e.TRANSFER_TX_COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f99054a[ak.e.TRANSFER_TX_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public g(j.k kVar) {
        super(kVar);
        this.f99050n = false;
        this.f99051o = false;
        this.f99052p = -1;
        this.f99053q = new byte[]{70, -1, -1, -1, -1, 0, 67, 2};
    }

    @Override // ok.e
    public final void a(bk.l lVar, dk.a aVar) {
        int i14 = a.f99055b[lVar.ordinal()];
        if (i14 == 1) {
            int i15 = a.f99054a[new bk.g(aVar).f18440c.ordinal()];
            if (i15 == 1) {
                int i16 = qk.b.f145071a;
                b();
                this.f99049m.countDown();
                return;
            } else if (i15 == 2) {
                this.f99050n = true;
                this.f99052p = 0;
                return;
            } else {
                if (i15 != 3) {
                    return;
                }
                int i17 = this.f99052p;
                this.f99052p = (2 - (i17 % 3)) + i17;
                return;
            }
        }
        if (i14 == 2 || i14 == 3) {
            if ((aVar.f60156b[1] & UnsignedBytes.MAX_VALUE) == 67) {
                int i18 = qk.b.f145071a;
                this.f99051o = true;
                b();
                this.f99049m.countDown();
                return;
            }
            if (this.f99050n) {
                return;
            }
            int i19 = this.f99052p + 1;
            this.f99052p = i19;
            if (i19 > 10) {
                int i24 = qk.b.f145071a;
                b();
                this.f99049m.countDown();
            } else if (i19 % 3 == 0) {
                try {
                    this.f132442j.b(this.f99053q);
                } catch (AntCommandFailedException e4) {
                    if (e4.getFailureReason() == wj.c.TRANSFER_IN_PROGRESS) {
                        int i25 = qk.b.f145071a;
                        return;
                    }
                    e4.toString();
                    int i26 = qk.b.f145071a;
                    b();
                    this.f99049m.countDown();
                }
            }
        }
    }

    @Override // ok.e
    public final void c() throws RemoteException {
        try {
            ak.c cVarD = this.f132442j.d();
            if (cVarD != ak.c.TRACKING && cVarD != ak.c.SEARCHING) {
                int i14 = qk.b.f145071a;
                this.f99181l.a(j.h.NOT_CONNECTED, j.g.CONNECTION_LOST);
                this.f99180k = j.i.FAIL_DEVICE_TRANSMISSION_LOST;
                return;
            }
            this.f99049m = new CountDownLatch(1);
            e();
            this.f99049m.await(20L, TimeUnit.SECONDS);
            b();
            if (this.f99051o) {
                int i15 = qk.b.f145071a;
                this.f99180k = j.i.SUCCESS;
            } else {
                int i16 = qk.b.f145071a;
                this.f99180k = j.i.FAIL_OTHER_DEVICE_COMMUNICATION_ERROR;
            }
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
        return "ANT-FS Session Request";
    }

    @Override // jk.p
    public final boolean s(j.h hVar) {
        return hVar == j.h.NOT_CONNECTED;
    }
}
