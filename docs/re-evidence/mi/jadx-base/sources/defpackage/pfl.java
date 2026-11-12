package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class pfl {
    public static final AtomicReference<pfl> d = new AtomicReference<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ifl f30350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ifl f30351b;
    public final ifl c;

    public pfl() {
        u5l u5lVarF = s5l.c().f();
        ifl iflVarG = u5lVarF.g();
        if (iflVarG != null) {
            this.f30350a = iflVarG;
        } else {
            this.f30350a = u5l.a();
        }
        ifl iflVarI = u5lVarF.i();
        if (iflVarI != null) {
            this.f30351b = iflVarI;
        } else {
            this.f30351b = u5l.c();
        }
        ifl iflVarJ = u5lVarF.j();
        if (iflVarJ != null) {
            this.c = iflVarJ;
        } else {
            this.c = u5l.e();
        }
    }

    public static ifl a(Executor executor) {
        return new ag8(executor);
    }

    public static pfl b() {
        while (true) {
            AtomicReference<pfl> atomicReference = d;
            pfl pflVar = atomicReference.get();
            if (pflVar != null) {
                return pflVar;
            }
            pfl pflVar2 = new pfl();
            if (d8i.a(atomicReference, null, pflVar2)) {
                return pflVar2;
            }
            pflVar2.d();
        }
    }

    public static ifl c() {
        return p5l.g(b().f30351b);
    }

    public synchronized void d() {
        try {
            Object obj = this.f30350a;
            if (obj instanceof kfl) {
                ((kfl) obj).shutdown();
            }
            Object obj2 = this.f30351b;
            if (obj2 instanceof kfl) {
                ((kfl) obj2).shutdown();
            }
            Object obj3 = this.c;
            if (obj3 instanceof kfl) {
                ((kfl) obj3).shutdown();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
