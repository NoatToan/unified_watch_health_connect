package o53;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.DispatchException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo53/p0;", "T", "Lx53/h;", "Lkotlinx/coroutines/SchedulerTask;", "", "resumeMode", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class p0<T> extends x53.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f129380c;

    public p0(int i14) {
        this.f129380c = i14;
    }

    public void a(CancellationException cancellationException) {
    }

    public abstract t13.d<T> c();

    public Throwable d(Object obj) {
        v vVar = obj instanceof v ? (v) obj : null;
        if (vVar != null) {
            return vVar.f129416a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T f(Object obj) {
        return obj;
    }

    public final void g(Throwable th3) {
        kotlinx.coroutines.a.a(new e0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th3), c().getF157466b());
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            t13.d<T> dVarC = c();
            dVarC.getClass();
            u53.f fVar = (u53.f) dVarC;
            t13.d<T> dVar = fVar.f168733e;
            Object obj = fVar.f168735g;
            t13.g f157466b = dVar.getF157466b();
            Object objC = u53.z.c(f157466b, obj);
            l1 l1Var = null;
            l2<?> l2VarC = objC != u53.z.f168776a ? y.c(dVar, f157466b, objC) : null;
            try {
                t13.g f157466b2 = dVar.getF157466b();
                Object objH = h();
                Throwable thD = d(objH);
                if (thD == null) {
                    int i14 = this.f129380c;
                    boolean z14 = true;
                    if (i14 != 1 && i14 != 2) {
                        z14 = false;
                    }
                    if (z14) {
                        l1Var = (l1) f157466b2.get(l1.f129368i0);
                    }
                }
                if (l1Var != null && !l1Var.isActive()) {
                    CancellationException cancellationExceptionQ = l1Var.Q();
                    a(cancellationExceptionQ);
                    int i15 = o13.q.f128596b;
                    dVar.resumeWith(o13.r.a(cancellationExceptionQ));
                } else if (thD != null) {
                    int i16 = o13.q.f128596b;
                    dVar.resumeWith(new o13.q.b(thD));
                } else {
                    int i17 = o13.q.f128596b;
                    dVar.resumeWith(f(objH));
                }
                Unit unit = Unit.INSTANCE;
            } finally {
                if (l2VarC == null || l2VarC.x0()) {
                    u53.z.a(f157466b, objC);
                }
            }
        } catch (DispatchException e4) {
            kotlinx.coroutines.a.a(e4.getCause(), c().getF157466b());
        } catch (Throwable th3) {
            g(th3);
        }
    }
}
