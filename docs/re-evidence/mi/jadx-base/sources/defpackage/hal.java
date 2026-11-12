package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.internal.producers.SingleProducer;

/* JADX INFO: loaded from: classes3.dex */
public final class hal<T> extends p4h<T> {
    public static final boolean c = Boolean.valueOf(System.getProperty("rx.just.strong-mode", "false")).booleanValue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f19874b;

    public class a implements zta<sc0, koo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sd8 f19875a;

        public a(sd8 sd8Var) {
            this.f19875a = sd8Var;
        }

        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public koo call(sc0 sc0Var) {
            return this.f19875a.c(sc0Var);
        }
    }

    public class b implements zta<sc0, koo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ifl f19877a;

        public class a implements sc0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ sc0 f19879a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ifl.a f19880b;

            public a(sc0 sc0Var, ifl.a aVar) {
                this.f19879a = sc0Var;
                this.f19880b = aVar;
            }

            @Override // defpackage.sc0
            public void call() {
                try {
                    this.f19879a.call();
                } finally {
                    this.f19880b.unsubscribe();
                }
            }
        }

        public b(ifl iflVar) {
            this.f19877a = iflVar;
        }

        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public koo call(sc0 sc0Var) {
            ifl.a aVarA = this.f19877a.a();
            aVarA.a(new a(sc0Var, aVarA));
            return aVarA;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public class c<R> implements p4h.a<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ zta f19881a;

        public c(zta ztaVar) {
            this.f19881a = ztaVar;
        }

        @Override // defpackage.tc0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(xno<? super R> xnoVar) {
            p4h p4hVar = (p4h) this.f19881a.call(hal.this.f19874b);
            if (p4hVar instanceof hal) {
                xnoVar.setProducer(hal.D(xnoVar, ((hal) p4hVar).f19874b));
            } else {
                p4hVar.B(hoo.a(xnoVar));
            }
        }
    }

    public static final class d<T> implements p4h.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f19883a;

        public d(T t) {
            this.f19883a = t;
        }

        @Override // defpackage.tc0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(xno<? super T> xnoVar) {
            xnoVar.setProducer(hal.D(xnoVar, this.f19883a));
        }
    }

    public static final class e<T> implements p4h.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f19884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zta<sc0, koo> f19885b;

        public e(T t, zta<sc0, koo> ztaVar) {
            this.f19884a = t;
            this.f19885b = ztaVar;
        }

        @Override // defpackage.tc0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(xno<? super T> xnoVar) {
            xnoVar.setProducer(new f(xnoVar, this.f19884a, this.f19885b));
        }
    }

    public static final class f<T> extends AtomicBoolean implements cbi, sc0 {
        private static final long serialVersionUID = -2466317989629281651L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xno<? super T> f19886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f19887b;
        public final zta<sc0, koo> c;

        public f(xno<? super T> xnoVar, T t, zta<sc0, koo> ztaVar) {
            this.f19886a = xnoVar;
            this.f19887b = t;
            this.c = ztaVar;
        }

        @Override // defpackage.sc0
        public void call() {
            xno<? super T> xnoVar = this.f19886a;
            if (xnoVar.isUnsubscribed()) {
                return;
            }
            T t = this.f19887b;
            try {
                xnoVar.onNext(t);
                if (xnoVar.isUnsubscribed()) {
                    return;
                }
                xnoVar.onCompleted();
            } catch (Throwable th) {
                pf8.f(th, xnoVar, t);
            }
        }

        @Override // defpackage.cbi
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
            if (j == 0 || !compareAndSet(false, true)) {
                return;
            }
            this.f19886a.add(this.c.call(this));
        }

        @Override // java.util.concurrent.atomic.AtomicBoolean
        public String toString() {
            return "ScalarAsyncProducer[" + this.f19887b + ", " + get() + "]";
        }
    }

    public static final class g<T> implements cbi {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xno<? super T> f19888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f19889b;
        public boolean c;

        public g(xno<? super T> xnoVar, T t) {
            this.f19888a = xnoVar;
            this.f19889b = t;
        }

        @Override // defpackage.cbi
        public void request(long j) {
            if (this.c) {
                return;
            }
            if (j < 0) {
                throw new IllegalStateException("n >= required but it was " + j);
            }
            if (j == 0) {
                return;
            }
            this.c = true;
            xno<? super T> xnoVar = this.f19888a;
            if (xnoVar.isUnsubscribed()) {
                return;
            }
            T t = this.f19889b;
            try {
                xnoVar.onNext(t);
                if (xnoVar.isUnsubscribed()) {
                    return;
                }
                xnoVar.onCompleted();
            } catch (Throwable th) {
                pf8.f(th, xnoVar, t);
            }
        }
    }

    public hal(T t) {
        super(p5l.e(new d(t)));
        this.f19874b = t;
    }

    public static <T> hal<T> C(T t) {
        return new hal<>(t);
    }

    public static <T> cbi D(xno<? super T> xnoVar, T t) {
        return c ? new SingleProducer(xnoVar, t) : new g(xnoVar, t);
    }

    public T E() {
        return this.f19874b;
    }

    public <R> p4h<R> F(zta<? super T, ? extends p4h<? extends R>> ztaVar) {
        return p4h.A(new c(ztaVar));
    }

    public p4h<T> G(ifl iflVar) {
        return p4h.A(new e(this.f19874b, iflVar instanceof sd8 ? new a((sd8) iflVar) : new b(iflVar)));
    }
}
