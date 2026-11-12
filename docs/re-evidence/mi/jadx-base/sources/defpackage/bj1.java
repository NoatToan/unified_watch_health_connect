package defpackage;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class bj1 extends n1p {
    public static volatile bj1 c;
    public static final Executor d = new Executor() { // from class: zi1
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            bj1.j(runnable);
        }
    };
    public static final Executor e = new Executor() { // from class: aj1
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            bj1.k(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n1p f4274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1p f4275b;

    public bj1() {
        fx5 fx5Var = new fx5();
        this.f4275b = fx5Var;
        this.f4274a = fx5Var;
    }

    public static Executor g() {
        return e;
    }

    public static bj1 h() {
        if (c != null) {
            return c;
        }
        synchronized (bj1.class) {
            try {
                if (c == null) {
                    c = new bj1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public static Executor i() {
        return d;
    }

    public static /* synthetic */ void j(Runnable runnable) {
        h().d(runnable);
    }

    public static /* synthetic */ void k(Runnable runnable) {
        h().a(runnable);
    }

    @Override // defpackage.n1p
    public void a(Runnable runnable) {
        this.f4274a.a(runnable);
    }

    @Override // defpackage.n1p
    public boolean c() {
        return this.f4274a.c();
    }

    @Override // defpackage.n1p
    public void d(Runnable runnable) {
        this.f4274a.d(runnable);
    }

    public void l(n1p n1pVar) {
        if (n1pVar == null) {
            n1pVar = this.f4275b;
        }
        this.f4274a = n1pVar;
    }
}
