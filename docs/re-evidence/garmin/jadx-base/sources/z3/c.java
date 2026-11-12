package z3;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;
import p1.q0;
import p3.w1;
import z3.c.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lz3/c;", "Lz3/c$a;", "A", "", "<init>", "()V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c<A extends a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f202079a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f202080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f202081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q0<A> f202082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q0<A> f202083e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz3/c$a;", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {
        public abstract void a();

        public abstract void b(Throwable th3);
    }

    public c() {
        int i14 = z3.a.f202077b;
        this.f202081c = new b(0);
        this.f202082d = new q0<>(0, 1, null);
        this.f202083e = new q0<>(0, 1, null);
    }

    public final p3.e a(A a14, e23.a<Unit> aVar) {
        int i14;
        int i15;
        int i16;
        p0 p0Var = new p0();
        p0Var.f105807a = -1;
        synchronized (this.f202079a) {
            Throwable th3 = this.f202080b;
            if (th3 != null) {
                a14.b(th3);
                p3.e.f135066j0.getClass();
                return p3.e.a.f135068b;
            }
            b bVar = this.f202081c;
            do {
                i14 = bVar.get();
                i15 = i14 + 1;
            } while (!bVar.compareAndSet(i14, i15));
            boolean z14 = (134217727 & i15) == 1;
            p0Var.f105807a = (i15 >>> 27) & 15;
            this.f202082d.g(a14);
            if (z14 && aVar != null) {
                try {
                    aVar.invoke();
                } catch (Throwable th4) {
                    synchronized (this.f202079a) {
                        try {
                            if (this.f202080b == null) {
                                this.f202080b = th4;
                                q0<A> q0Var = this.f202082d;
                                Object[] objArr = q0Var.f134667a;
                                int i17 = q0Var.f134668b;
                                for (int i18 = 0; i18 < i17; i18++) {
                                    ((a) objArr[i18]).b(th4);
                                }
                                this.f202082d.j();
                                b bVar2 = this.f202081c;
                                do {
                                    i16 = bVar2.get();
                                    int i19 = z3.a.f202077b;
                                } while (!bVar2.compareAndSet(i16, ((((i16 >>> 27) & 15) + 1) & 15) << 27));
                                Unit unit = Unit.INSTANCE;
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
            }
            return new w1(new x72.k(a14, 11, this, p0Var));
        }
    }

    public final void b(e23.l<? super A, Unit> lVar) {
        int i14;
        synchronized (this.f202079a) {
            try {
                q0<A> q0Var = this.f202082d;
                this.f202082d = this.f202083e;
                this.f202083e = q0Var;
                b bVar = this.f202081c;
                do {
                    i14 = bVar.get();
                    int i15 = z3.a.f202077b;
                } while (!bVar.compareAndSet(i14, ((((i14 >>> 27) & 15) + 1) & 15) << 27));
                int i16 = q0Var.f134668b;
                for (int i17 = 0; i17 < i16; i17++) {
                    lVar.invoke(q0Var.b(i17));
                }
                q0Var.j();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
