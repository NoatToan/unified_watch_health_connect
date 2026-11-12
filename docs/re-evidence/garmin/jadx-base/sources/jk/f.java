package jk;

import android.os.RemoteException;
import com.dsi.ant.channel.AntCommandFailedException;
import com.google.common.base.Ascii;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f extends p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f99033m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f99034n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j.h f99035o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CountDownLatch f99036p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f99037q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f99038r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f99039s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f99040t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f99041u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f99042v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f99043w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final byte[] f99044x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final ScheduledExecutorService f99031y = Executors.newScheduledThreadPool(1);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte f99032z = 67;
    public static final int A = -1;
    public static final int B = 1;
    public static final byte[] C = {3, 7, Ascii.SI, Ascii.DC4, Ascii.EM, Ascii.GS, 34, 40, 45, 49, 54, 60, 65, 70, 75, 80};
    public static final Random D = new Random();

    public class a implements Callable<Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f99045a;

        public a(byte[] bArr) {
            this.f99045a = bArr;
        }

        @Override // java.util.concurrent.Callable
        public final Exception call() {
            f fVar = f.this;
            try {
                nk.b bVar = fVar.f132442j;
                if (bVar == null) {
                    return null;
                }
                bVar.b(this.f99045a);
                return null;
            } catch (AntCommandFailedException e4) {
                if (e4.getFailureReason() == wj.c.TRANSFER_IN_PROGRESS) {
                    ScheduledExecutorService scheduledExecutorService = f.f99031y;
                    int i14 = qk.b.f145071a;
                } else {
                    ScheduledExecutorService scheduledExecutorService2 = f.f99031y;
                    e4.toString();
                    int i15 = qk.b.f145071a;
                    fVar.b();
                    fVar.f99036p.countDown();
                }
                return e4;
            }
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f99048b;

        static {
            int[] iArr = new int[bk.l.values().length];
            f99048b = iArr;
            try {
                iArr[bk.l.CHANNEL_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99048b[bk.l.BROADCAST_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ak.e.values().length];
            f99047a = iArr2;
            try {
                iArr2[ak.e.RX_SEARCH_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f99047a[ak.e.CHANNEL_CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f99047a[ak.e.TRANSFER_TX_COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f99047a[ak.e.TRANSFER_TX_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public f(j.k kVar, long j8, int i14) {
        super(kVar);
        this.f99034n = 0;
        this.f99035o = j.h.LINK_IDLE;
        int i15 = A;
        this.f99037q = i15;
        this.f99038r = i15;
        this.f99039s = i15;
        this.f99040t = false;
        this.f99041u = false;
        this.f99042v = 1;
        this.f99043w = i15;
        this.f99044x = new byte[]{68, 2, 0, 4, 0, 0, 0, 0};
        this.f99033m = j8;
        this.f99034n = i14;
    }

    @Override // ok.e
    public final void a(bk.l lVar, dk.a aVar) throws RemoteException {
        int i14 = b.f99048b[lVar.ordinal()];
        if (i14 == 1) {
            int i15 = b.f99047a[new bk.g(aVar).f18440c.ordinal()];
            if (i15 == 1) {
                int i16 = qk.b.f145071a;
                return;
            }
            if (i15 == 2) {
                int i17 = qk.b.f145071a;
                b();
                this.f99036p.countDown();
                return;
            } else if (i15 != 3) {
                if (i15 != 4) {
                    return;
                }
                this.f99041u = false;
                return;
            } else {
                this.f99040t = true;
                this.f99041u = false;
                this.f99042v = 1;
                b();
                this.f99036p.countDown();
                return;
            }
        }
        if (i14 != 2) {
            return;
        }
        int i18 = this.f99037q;
        int i19 = A;
        byte b14 = f99032z;
        if (i18 == i19) {
            byte[] bArr = aVar.f60156b;
            if (b14 == bArr[1]) {
                byte b15 = bArr[3];
                this.f99037q = b15;
                if (b15 != 0) {
                    int i24 = qk.b.f145071a;
                    return;
                }
                this.f99038r = ik.a.d(7, bArr) & 32767;
                this.f99039s = ik.a.d(5, aVar.f60156b);
                b();
                this.f99036p.countDown();
                return;
            }
            return;
        }
        if (this.f99040t || i18 != 0) {
            if (i18 == 0) {
                byte[] bArr2 = aVar.f60156b;
                if (b14 == bArr2[1]) {
                    byte b16 = bArr2[3];
                    int i25 = B;
                    if (i25 == b16) {
                        if (ik.a.f(5, bArr2) != this.f99033m) {
                            int i26 = qk.b.f145071a;
                        } else {
                            this.f99037q = i25;
                        }
                        b();
                        this.f99036p.countDown();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i27 = this.f99042v + 1;
        this.f99042v = i27;
        if (i27 > 15) {
            b();
            this.f99036p.countDown();
            return;
        }
        if (this.f99041u || i27 % 3 != 0) {
            return;
        }
        this.f99041u = true;
        int i28 = qk.b.f145071a;
        try {
            t(this.f99044x).get();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            if (!(cause instanceof RemoteException)) {
                throw ((RuntimeException) cause);
            }
            throw ((RemoteException) cause);
        }
    }

    @Override // ok.e
    public final void c() throws RemoteException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        byte[] bArr = this.f99044x;
        j.k kVar = this.f99181l;
        try {
            try {
                j.h hVar = j.h.LINK_CONNECTING;
                this.f99035o = hVar;
                kVar.a(hVar, j.g.CONNECTION_REQUESTED);
                int i14 = this.f99034n;
                int iCeil = i14 != 0 ? (int) Math.ceil((((double) i14) * 4.0d) / 10.0d) : 10;
                int i15 = 0;
                while (true) {
                    i15++;
                    if (i15 > iCeil) {
                        int i16 = qk.b.f145071a;
                        j.h hVar2 = j.h.NOT_CONNECTED;
                        this.f99035o = hVar2;
                        kVar.a(hVar2, j.g.CONNECTION_LOST);
                        this.f99180k = j.i.FAIL_OTHER_DEVICE_COMMUNICATION_ERROR;
                        return;
                    }
                    ak.c cVarD = this.f132442j.d();
                    if (cVarD != ak.c.TRACKING && cVarD != ak.c.SEARCHING) {
                        if (i14 == 0) {
                            int i17 = qk.b.f145071a;
                            j.h hVar3 = j.h.NOT_CONNECTED;
                            this.f99035o = hVar3;
                            kVar.a(hVar3, j.g.CONNECTION_LOST);
                            this.f99180k = j.i.FAIL_DEVICE_TRANSMISSION_LOST;
                            return;
                        }
                        u();
                    }
                    this.f99037q = A;
                    int i18 = qk.b.f145071a;
                    this.f99036p = new CountDownLatch(1);
                    e();
                    this.f99036p.await(10L, timeUnit);
                    if (this.f99037q == 0) {
                        kVar.a(this.f99035o, j.g.LINK_START);
                        this.f99040t = false;
                        this.f99041u = true;
                        this.f99042v = 1;
                        ik.a.c(bArr, 4, this.f99033m);
                        byte[] bArr2 = C;
                        bArr[2] = bArr2[D.nextInt(bArr2.length)];
                        try {
                            this.f99036p = new CountDownLatch(1);
                            e();
                            Exception exc = t(bArr).get();
                            if (exc != null) {
                                throw ((AntCommandFailedException) exc);
                            }
                        } catch (AntCommandFailedException e4) {
                            if (e4.getFailureReason() == wj.c.TRANSFER_IN_PROGRESS) {
                                int i19 = qk.b.f145071a;
                            } else {
                                e4.toString();
                                int i24 = qk.b.f145071a;
                            }
                        } catch (ExecutionException e14) {
                            throw ((RemoteException) e14.getCause());
                        }
                        this.f99036p.await(10L, timeUnit);
                        if (this.f99040t) {
                            this.f99036p = new CountDownLatch(1);
                            e();
                            this.f99036p.await(10L, timeUnit);
                            if (this.f99037q == B) {
                                j.h hVar4 = j.h.AUTH_IDLE;
                                this.f99035o = hVar4;
                                kVar.a(hVar4, j.g.LINK_PASS);
                                this.f99180k = j.i.SUCCESS;
                                return;
                            }
                        }
                    }
                }
            } catch (AntCommandFailedException e15) {
                e15.toString();
                int i25 = qk.b.f145071a;
                throw new RemoteException();
            }
        } catch (InterruptedException unused) {
            int i26 = qk.b.f145071a;
            this.f99180k = j.i.FAIL_EXECUTOR_CANCELLED_TASK;
            Thread.currentThread().interrupt();
        }
    }

    @Override // ok.e
    public final String f() {
        return "ANT-FS Host Link Channel Task";
    }

    @Override // jk.p
    public final boolean s(j.h hVar) {
        return hVar == j.h.NOT_CONNECTED || hVar == j.h.LINK_IDLE;
    }

    public final ScheduledFuture<Exception> t(byte[] bArr) {
        return f99031y.schedule(new a(bArr), (long) ((((j) this.f132437e).f99076x / 32768.0f) * 1000.0f * 0.8f), TimeUnit.MILLISECONDS);
    }

    public abstract void u();
}
