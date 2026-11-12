package q83;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import q83.j.a;
import v83.s;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends j83.h implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f143385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2703c f143386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f143387e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadFactory f143388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<b> f143389b = new AtomicReference<>(f143387e);

    public static final class a extends j83.h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s83.k f143390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s83.k f143391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C2703c f143392c;

        /* JADX INFO: renamed from: q83.c$a$a, reason: collision with other inner class name */
        public class C2702a implements n83.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n83.a f143393a;

            public C2702a(n83.a aVar) {
                this.f143393a = aVar;
            }

            @Override // n83.a
            public final void d() {
                if (a.this.f143391b.f157986b) {
                    return;
                }
                this.f143393a.d();
            }
        }

        public a(C2703c c2703c) {
            s83.k kVar = new s83.k();
            this.f143390a = kVar;
            this.f143391b = new s83.k(kVar, new y83.b());
            this.f143392c = c2703c;
        }

        @Override // j83.h.a
        public final j83.o a(n83.a aVar) {
            if (this.f143391b.f157986b) {
                return y83.d.f195249a;
            }
            C2703c c2703c = this.f143392c;
            C2702a c2702a = new C2702a(aVar);
            s83.k kVar = this.f143390a;
            c2703c.getClass();
            j jVar = new j(s.c(c2702a), kVar);
            kVar.a(jVar);
            jVar.f143422a.a(jVar.new a(c2703c.f143420a.submit(jVar)));
            return jVar;
        }

        @Override // j83.o
        public final boolean e() {
            return this.f143391b.f157986b;
        }

        @Override // j83.o
        public final void f() {
            this.f143391b.f();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f143395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C2703c[] f143396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f143397c;

        public b(ThreadFactory threadFactory, int i14) {
            this.f143395a = i14;
            this.f143396b = new C2703c[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                this.f143396b[i15] = new C2703c(threadFactory);
            }
        }
    }

    /* JADX INFO: renamed from: q83.c$c, reason: collision with other inner class name */
    public static final class C2703c extends i {
        public C2703c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int iIntValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (iIntValue <= 0 || iIntValue > iAvailableProcessors) {
            iIntValue = iAvailableProcessors;
        }
        f143385c = iIntValue;
        C2703c c2703c = new C2703c(s83.d.f157958b);
        f143386d = c2703c;
        c2703c.f();
        f143387e = new b(null, 0);
    }

    public c(ThreadFactory threadFactory) {
        this.f143388a = threadFactory;
        start();
    }

    public final j a(n83.a aVar) {
        C2703c c2703c;
        b bVar = this.f143389b.get();
        int i14 = bVar.f143395a;
        if (i14 == 0) {
            c2703c = f143386d;
        } else {
            C2703c[] c2703cArr = bVar.f143396b;
            long j8 = bVar.f143397c;
            bVar.f143397c = 1 + j8;
            c2703c = c2703cArr[(int) (j8 % ((long) i14))];
        }
        return c2703c.g(aVar, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // j83.h
    public final j83.h.a createWorker() {
        C2703c c2703c;
        b bVar = this.f143389b.get();
        int i14 = bVar.f143395a;
        if (i14 == 0) {
            c2703c = f143386d;
        } else {
            C2703c[] c2703cArr = bVar.f143396b;
            long j8 = bVar.f143397c;
            bVar.f143397c = 1 + j8;
            c2703c = c2703cArr[(int) (j8 % ((long) i14))];
        }
        return new a(c2703c);
    }

    @Override // q83.k
    public final void shutdown() {
        while (true) {
            AtomicReference<b> atomicReference = this.f143389b;
            b bVar = atomicReference.get();
            b bVar2 = f143387e;
            if (bVar == bVar2) {
                return;
            }
            do {
                if (atomicReference.compareAndSet(bVar, bVar2)) {
                    for (C2703c c2703c : bVar.f143396b) {
                        c2703c.f();
                    }
                    return;
                }
            } while (atomicReference.get() == bVar);
        }
    }

    @Override // q83.k
    public final void start() {
        AtomicReference<b> atomicReference;
        b bVar;
        b bVar2 = new b(this.f143388a, f143385c);
        do {
            atomicReference = this.f143389b;
            bVar = f143387e;
            if (atomicReference.compareAndSet(bVar, bVar2)) {
                return;
            }
        } while (atomicReference.get() == bVar);
        for (C2703c c2703c : bVar2.f143396b) {
            c2703c.f();
        }
    }
}
