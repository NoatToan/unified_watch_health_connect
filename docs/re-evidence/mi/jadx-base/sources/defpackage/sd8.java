package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class sd8 extends ifl implements kfl {
    public static final int c;
    public static final c d;
    public static final b e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadFactory f33526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<b> f33527b = new AtomicReference<>(e);

    public static final class a extends ifl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final moo f33528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final sa4 f33529b;
        public final moo c;
        public final c d;

        /* JADX INFO: renamed from: sd8$a$a, reason: collision with other inner class name */
        public class C1103a implements sc0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ sc0 f33530a;

            public C1103a(sc0 sc0Var) {
                this.f33530a = sc0Var;
            }

            @Override // defpackage.sc0
            public void call() {
                if (a.this.isUnsubscribed()) {
                    return;
                }
                this.f33530a.call();
            }
        }

        public a(c cVar) {
            moo mooVar = new moo();
            this.f33528a = mooVar;
            sa4 sa4Var = new sa4();
            this.f33529b = sa4Var;
            this.c = new moo(mooVar, sa4Var);
            this.d = cVar;
        }

        @Override // ifl.a
        public koo a(sc0 sc0Var) {
            return isUnsubscribed() ? noo.b() : this.d.h(new C1103a(sc0Var), 0L, null, this.f33528a);
        }

        @Override // defpackage.koo
        public boolean isUnsubscribed() {
            return this.c.isUnsubscribed();
        }

        @Override // defpackage.koo
        public void unsubscribe() {
            this.c.unsubscribe();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c[] f33533b;
        public long c;

        public b(ThreadFactory threadFactory, int i) {
            this.f33532a = i;
            this.f33533b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f33533b[i2] = new c(threadFactory);
            }
        }

        public c a() {
            int i = this.f33532a;
            if (i == 0) {
                return sd8.d;
            }
            c[] cVarArr = this.f33533b;
            long j = this.c;
            this.c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        public void b() {
            for (c cVar : this.f33533b) {
                cVar.unsubscribe();
            }
        }
    }

    public static final class c extends mlg {
        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int iIntValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (iIntValue <= 0 || iIntValue > iAvailableProcessors) {
            iIntValue = iAvailableProcessors;
        }
        c = iIntValue;
        c cVar = new c(RxThreadFactory.NONE);
        d = cVar;
        cVar.unsubscribe();
        e = new b(null, 0);
    }

    public sd8(ThreadFactory threadFactory) {
        this.f33526a = threadFactory;
        d();
    }

    @Override // defpackage.ifl
    public ifl.a a() {
        return new a(this.f33527b.get().a());
    }

    public koo c(sc0 sc0Var) {
        return this.f33527b.get().a().g(sc0Var, -1L, TimeUnit.NANOSECONDS);
    }

    public void d() {
        b bVar = new b(this.f33526a, c);
        if (d8i.a(this.f33527b, e, bVar)) {
            return;
        }
        bVar.b();
    }

    @Override // defpackage.kfl
    public void shutdown() {
        b bVar;
        b bVar2;
        do {
            bVar = this.f33527b.get();
            bVar2 = e;
            if (bVar == bVar2) {
                return;
            }
        } while (!d8i.a(this.f33527b, bVar, bVar2));
        bVar.b();
    }
}
