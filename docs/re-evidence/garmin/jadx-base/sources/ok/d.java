package ok;

import android.os.Handler;
import android.os.HandlerThread;
import bk.l;
import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicInteger f132415o = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nk.b f132416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f132417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f132418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f132419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f132420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Thread f132421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f132422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f132423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f132424i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Exchanger<c> f132425j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f132426k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f132427l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HandlerThread f132428m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f132429n;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132430a;

        static {
            int[] iArr = new int[l.values().length];
            f132430a = iArr;
            try {
                iArr[l.BROADCAST_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f132430a[l.BURST_TRANSFER_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f132430a[l.ACKNOWLEDGED_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface b {
        void a();
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f132431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f132432b;

        public c(d dVar, e eVar, Long l14) {
            this.f132431a = eVar;
            this.f132432b = l14;
        }
    }

    public d(nk.b bVar, b bVar2) {
        int iIncrementAndGet = f132415o.incrementAndGet();
        this.f132418c = false;
        this.f132419d = new Object();
        this.f132422g = false;
        this.f132423h = new Object();
        this.f132425j = new Exchanger<>();
        this.f132426k = new Object();
        HandlerThread handlerThread = new HandlerThread(e0.f(iIncrementAndGet, "AntCommunicatorExecutor-", "-timeout-handler"));
        this.f132428m = handlerThread;
        handlerThread.start();
        this.f132429n = new Handler(handlerThread.getLooper());
        this.f132417b = bVar2;
        this.f132416a = bVar;
        bVar.a(new ok.b(this));
        if (this.f132418c) {
            h.z("Attempting to start worker thread on dead executor");
            throw null;
        }
        this.f132422g = false;
        Thread thread = new Thread(new ok.c(this), e0.f(iIncrementAndGet, "AntCommunicatorExecutor-", "-worker"));
        this.f132421f = thread;
        thread.start();
    }

    public static void a(d dVar) {
        dVar.getClass();
        int i14 = qk.b.f145071a;
        synchronized (dVar.f132419d) {
            try {
                if (!dVar.f132418c) {
                    dVar.f(true);
                    dVar.f132417b.a();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void b() throws InterruptedException {
        if (c()) {
            return;
        }
        synchronized (this.f132426k) {
            try {
                if (this.f132424i == null) {
                    return;
                }
                if (d(2147483646)) {
                    try {
                        this.f132425j.exchange(null, 1100, TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean c() {
        Thread thread = this.f132421f;
        return thread == null || !thread.isAlive();
    }

    public final boolean d(int i14) {
        synchronized (this.f132426k) {
            try {
                c cVar = this.f132424i;
                if (cVar == null) {
                    return true;
                }
                this.f132427l = true;
                if (cVar.f132431a.k(i14)) {
                    this.f132421f.interrupt();
                    return true;
                }
                this.f132427l = false;
                return false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void e(e eVar) {
        synchronized (this.f132426k) {
            try {
                if (c()) {
                    this.f132420e = eVar;
                    return;
                }
                e eVar2 = this.f132420e;
                if (eVar2 == null || this.f132424i.f132431a != eVar2) {
                    this.f132420e = eVar;
                    if (this.f132424i == null && eVar != null) {
                        try {
                            this.f132425j.exchange(new c(this, eVar, null));
                        } catch (InterruptedException unused) {
                            int i14 = qk.b.f145071a;
                            Thread.currentThread().interrupt();
                        }
                    }
                } else {
                    this.f132420e = eVar;
                    if (eVar == null) {
                        d(2147483646);
                    } else {
                        eVar.getClass();
                        d(0);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final nk.b f(boolean z14) {
        synchronized (this.f132423h) {
            try {
                if (this.f132418c) {
                    return null;
                }
                this.f132418c = true;
                this.f132422g = true;
                if (!c() && this.f132421f != Thread.currentThread()) {
                    synchronized (this.f132426k) {
                        try {
                            if (this.f132424i != null) {
                                d(Integer.MAX_VALUE);
                            } else {
                                this.f132421f.interrupt();
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    try {
                        this.f132421f.join(3000L);
                    } catch (InterruptedException unused) {
                        int i14 = qk.b.f145071a;
                        Thread.currentThread().interrupt();
                    }
                    if (!c()) {
                        int i15 = qk.b.f145071a;
                        z14 = true;
                    }
                }
                this.f132428m.quit();
                try {
                    this.f132428m.join();
                } catch (InterruptedException unused2) {
                    int i16 = qk.b.f145071a;
                }
                nk.b bVar = this.f132416a;
                if (z14) {
                    bVar.release();
                    this.f132416a = null;
                } else {
                    bVar.c();
                }
                return this.f132416a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final boolean g(e eVar, int i14) {
        if (c()) {
            h.z("Worker thread is not running");
            return false;
        }
        synchronized (this.f132425j) {
            synchronized (this.f132426k) {
                if (this.f132424i == null) {
                    i14 = 100;
                } else if (!d(eVar.h())) {
                    return false;
                }
                try {
                    this.f132425j.exchange(new c(this, eVar, null), i14, TimeUnit.MILLISECONDS);
                    return true;
                } catch (TimeoutException unused) {
                    int i15 = qk.b.f145071a;
                    return false;
                }
            }
        }
    }

    public d(wj.a aVar, b bVar) {
        this(new nk.a(aVar), bVar);
    }
}
