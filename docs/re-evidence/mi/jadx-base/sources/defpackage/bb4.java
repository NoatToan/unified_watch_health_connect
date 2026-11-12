package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class bb4 extends hfl {
    public static final b e;
    public static final RxThreadFactory f;
    public static final int g = f(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());
    public static final c h;
    public final ThreadFactory c;
    public final AtomicReference<b> d;

    public static final class a extends hfl.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final uge f4005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final na4 f4006b;
        public final uge c;
        public final c d;
        public volatile boolean e;

        public a(c cVar) {
            this.d = cVar;
            uge ugeVar = new uge();
            this.f4005a = ugeVar;
            na4 na4Var = new na4();
            this.f4006b = na4Var;
            uge ugeVar2 = new uge();
            this.c = ugeVar2;
            ugeVar2.a(ugeVar);
            ugeVar2.a(na4Var);
        }

        @Override // hfl.c
        public jz6 b(Runnable runnable) {
            return this.e ? EmptyDisposable.INSTANCE : this.d.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f4005a);
        }

        @Override // hfl.c
        public jz6 c(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.e ? EmptyDisposable.INSTANCE : this.d.e(runnable, j, timeUnit, this.f4006b);
        }

        @Override // defpackage.jz6
        public void dispose() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.c.dispose();
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return this.e;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c[] f4008b;
        public long c;

        public b(int i, ThreadFactory threadFactory) {
            this.f4007a = i;
            this.f4008b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f4008b[i2] = new c(threadFactory);
            }
        }

        public c a() {
            int i = this.f4007a;
            if (i == 0) {
                return bb4.h;
            }
            c[] cVarArr = this.f4008b;
            long j = this.c;
            this.c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        public void b() {
            for (c cVar : this.f4008b) {
                cVar.dispose();
            }
        }
    }

    public static final class c extends nlg {
        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new RxThreadFactory("RxComputationShutdown"));
        h = cVar;
        cVar.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f = rxThreadFactory;
        b bVar = new b(0, rxThreadFactory);
        e = bVar;
        bVar.b();
    }

    public bb4() {
        this(f);
    }

    public static int f(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    @Override // defpackage.hfl
    public hfl.c b() {
        return new a(this.d.get().a());
    }

    @Override // defpackage.hfl
    public jz6 d(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.d.get().a().f(runnable, j, timeUnit);
    }

    @Override // defpackage.hfl
    public jz6 e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.d.get().a().g(runnable, j, j2, timeUnit);
    }

    public void g() {
        b bVar = new b(g, this.c);
        if (d8i.a(this.d, e, bVar)) {
            return;
        }
        bVar.b();
    }

    public bb4(ThreadFactory threadFactory) {
        this.c = threadFactory;
        this.d = new AtomicReference<>(e);
        g();
    }
}
