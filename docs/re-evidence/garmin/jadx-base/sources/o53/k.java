package o53;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001d\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u000b\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004R\u0013\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f8\u0002X\u0082\u0004R\u0013\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f8\u0002X\u0082\u0004¨\u0006\u0013"}, d2 = {"Lo53/k;", "T", "Lo53/p0;", "Lo53/j;", "Lv13/d;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lo53/n2;", "Lt13/d;", "delegate", "", "resumeMode", "<init>", "(Lt13/d;I)V", "", "_decisionAndIndex", "Lh53/b;", "_state", "Lo53/u0;", "_parentHandle", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class k<T> extends p0<T> implements j<T>, v13.d, n2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f129358f = AtomicIntegerFieldUpdater.newUpdater(k.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f129359g = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f129360h = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t13.d<T> f129361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t13.g f129362e;

    /* JADX WARN: Multi-variable type inference failed */
    public k(t13.d<? super T> dVar, int i14) {
        super(i14);
        this.f129361d = dVar;
        this.f129362e = dVar.getF129302c();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f129306a;
    }

    public static Object C(x1 x1Var, Object obj, int i14, e23.q qVar) {
        if (obj instanceof v) {
            return obj;
        }
        if (i14 != 1 && i14 != 2) {
            return obj;
        }
        if (qVar != null || (x1Var instanceof i)) {
            return new u(obj, x1Var instanceof i ? (i) x1Var : null, qVar, null, null, 16, null);
        }
        return obj;
    }

    public static void w(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A(Object obj, e23.q qVar, int i14) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f129359g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof x1)) {
                if (obj2 instanceof m) {
                    m mVar = (m) obj2;
                    if (m.f129371c.compareAndSet(mVar, 0, 1)) {
                        if (qVar != null) {
                            j(qVar, mVar.f129416a, obj);
                            return;
                        }
                        return;
                    }
                }
                ds.e0.t(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objC = C((x1) obj2, obj, i14, qVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                    if (!v()) {
                        l();
                    }
                    m(i14);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // o53.j
    public final void B(Object obj) {
        m(this.f129380c);
    }

    public final u53.x D(Object obj, e23.q qVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f129359g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof x1)) {
                return null;
            }
            Object objC = C((x1) obj2, obj, this.f129380c, qVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                    if (!v()) {
                        l();
                    }
                    return l.f129365a;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // o53.j
    public final void F(z zVar, T t7) {
        t13.d<T> dVar = this.f129361d;
        u53.f fVar = dVar instanceof u53.f ? (u53.f) dVar : null;
        A(t7, null, (fVar != null ? fVar.f168732d : null) == zVar ? 4 : this.f129380c);
    }

    @Override // o53.j
    public final u53.x G(Throwable th3) {
        return D(new v(th3, false, 2, null), null);
    }

    @Override // o53.p0
    public final void a(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f129359g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof x1) {
                vb.h.z("Not completed");
                return;
            }
            if (obj instanceof v) {
                return;
            }
            if (!(obj instanceof u)) {
                cancellationException2 = cancellationException;
                u uVar = new u(obj, null, null, null, cancellationException2, 14, null);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, uVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            u uVar2 = (u) obj;
            if (uVar2.f129414e != null) {
                vb.h.z("Must be called at most once");
                return;
            }
            u uVarA = u.a(uVar2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, uVarA)) {
                    i iVar = uVar2.f129411b;
                    if (iVar != null) {
                        i(iVar, cancellationException);
                    }
                    e23.q<Throwable, R, t13.g, Unit> qVar = uVar2.f129412c;
                    if (qVar != 0) {
                        j(qVar, cancellationException, uVar2.f129410a);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    @Override // o53.n2
    public final void b(u53.u<?> uVar, int i14) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i15;
        do {
            atomicIntegerFieldUpdater = f129358f;
            i15 = atomicIntegerFieldUpdater.get(this);
            if ((i15 & 536870911) != 536870911) {
                vb.h.z("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i15, ((i15 >> 29) << 29) + i14));
        t(uVar);
    }

    @Override // o53.p0
    public final t13.d<T> c() {
        return this.f129361d;
    }

    @Override // o53.p0
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // o53.j
    public final boolean e() {
        return !(f129359g.get(this) instanceof x1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o53.p0
    public final <T> T f(Object obj) {
        return obj instanceof u ? (T) ((u) obj).f129410a : obj;
    }

    @Override // v13.d
    public final v13.d getCallerFrame() {
        t13.d<T> dVar = this.f129361d;
        if (dVar instanceof v13.d) {
            return (v13.d) dVar;
        }
        return null;
    }

    @Override // t13.d
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public final t13.g getF129302c() {
        return this.f129362e;
    }

    @Override // o53.p0
    public final Object h() {
        return f129359g.get(this);
    }

    public final void i(i iVar, Throwable th3) {
        try {
            iVar.a(th3);
        } catch (Throwable th4) {
            kotlinx.coroutines.a.a(new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th4), this.f129362e);
        }
    }

    @Override // o53.j
    public final boolean isActive() {
        return f129359g.get(this) instanceof x1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void j(e23.q<? super Throwable, ? super R, ? super t13.g, Unit> qVar, Throwable th3, R r14) {
        t13.g gVar = this.f129362e;
        try {
            qVar.invoke(th3, r14, gVar);
        } catch (Throwable th4) {
            kotlinx.coroutines.a.a(new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th4), gVar);
        }
    }

    public final void k(u53.u<?> uVar, Throwable th3) {
        t13.g gVar = this.f129362e;
        int i14 = f129358f.get(this) & 536870911;
        if (i14 == 536870911) {
            vb.h.z("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            uVar.h(gVar, i14);
        } catch (Throwable th4) {
            kotlinx.coroutines.a.a(new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th4), gVar);
        }
    }

    public final void l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f129360h;
        u0 u0Var = (u0) atomicReferenceFieldUpdater.get(this);
        if (u0Var == null) {
            return;
        }
        u0Var.dispose();
        atomicReferenceFieldUpdater.set(this, w1.f129420a);
    }

    public final void m(int i14) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i15;
        do {
            atomicIntegerFieldUpdater = f129358f;
            i15 = atomicIntegerFieldUpdater.get(this);
            int i16 = i15 >> 29;
            if (i16 != 0) {
                if (i16 != 1) {
                    vb.h.z("Already resumed");
                    return;
                }
                boolean z14 = i14 == 4;
                t13.d<T> dVar = this.f129361d;
                if (!z14 && (dVar instanceof u53.f)) {
                    boolean z15 = i14 == 1 || i14 == 2;
                    int i17 = this.f129380c;
                    if (z15 == (i17 == 1 || i17 == 2)) {
                        u53.f fVar = (u53.f) dVar;
                        z zVar = fVar.f168732d;
                        t13.g f129362e = fVar.f168733e.getF129302c();
                        if (u53.g.c(zVar, f129362e)) {
                            u53.g.b(zVar, f129362e, this);
                            return;
                        }
                        g2.f129341a.getClass();
                        y0 y0VarA = g2.a();
                        if (y0VarA.f129423a >= 4294967296L) {
                            y0VarA.T(this);
                            return;
                        }
                        y0VarA.U(true);
                        try {
                            q0.a(this, dVar, true);
                            do {
                            } while (y0VarA.W());
                        } catch (Throwable th3) {
                            try {
                                g(th3);
                            } finally {
                                y0VarA.H(true);
                            }
                        }
                        return;
                    }
                }
                q0.a(this, dVar, z14);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i15, 1073741824 + (536870911 & i15)));
    }

    public Throwable n(p1 p1Var) {
        return p1Var.Q();
    }

    @Override // o53.j
    public final u53.x o(Object obj, e23.q qVar) {
        return D(obj, qVar);
    }

    public final Object p() throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i14;
        l1 l1Var;
        boolean zV = v();
        do {
            atomicIntegerFieldUpdater = f129358f;
            i14 = atomicIntegerFieldUpdater.get(this);
            int i15 = i14 >> 29;
            if (i15 != 0) {
                if (i15 != 2) {
                    vb.h.z("Already suspended");
                    return null;
                }
                if (zV) {
                    z();
                }
                Object obj = f129359g.get(this);
                if (obj instanceof v) {
                    throw ((v) obj).f129416a;
                }
                int i16 = this.f129380c;
                if ((i16 != 1 && i16 != 2) || (l1Var = (l1) this.f129362e.get(l1.f129368i0)) == null || l1Var.isActive()) {
                    return f(obj);
                }
                CancellationException cancellationExceptionQ = l1Var.Q();
                a(cancellationExceptionQ);
                throw cancellationExceptionQ;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i14, 536870912 + (536870911 & i14)));
        if (((u0) f129360h.get(this)) == null) {
            s();
        }
        if (zV) {
            z();
        }
        return u13.a.COROUTINE_SUSPENDED;
    }

    public final void q() {
        u0 u0VarS = s();
        if (u0VarS != null && e()) {
            u0VarS.dispose();
            f129360h.set(this, w1.f129420a);
        }
    }

    @Override // o53.j
    public final void r(e23.l<? super Throwable, Unit> lVar) {
        t(new i.a(lVar));
    }

    @Override // t13.d
    public final void resumeWith(Object obj) {
        Throwable thB = o13.q.b(obj);
        if (thB != null) {
            obj = new v(thB, false, 2, null);
        }
        A(obj, null, this.f129380c);
    }

    public final u0 s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        l1 l1Var = (l1) this.f129362e.get(l1.f129368i0);
        if (l1Var == null) {
            return null;
        }
        u0 u0VarO = g8.i.O(l1Var, new n(this));
        do {
            atomicReferenceFieldUpdater = f129360h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, u0VarO)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return u0VarO;
    }

    public final void t(x1 x1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f129359g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, x1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if ((obj instanceof i) || (obj instanceof u53.u)) {
                w(x1Var, obj);
                throw null;
            }
            if (obj instanceof v) {
                v vVar = (v) obj;
                if (!v.f129415b.compareAndSet(vVar, 0, 1)) {
                    w(x1Var, obj);
                    throw null;
                }
                if (obj instanceof m) {
                    Throwable th3 = vVar.f129416a;
                    if (x1Var instanceof i) {
                        i((i) x1Var, th3);
                        return;
                    } else {
                        x1Var.getClass();
                        k((u53.u) x1Var, th3);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof u)) {
                if (x1Var instanceof u53.u) {
                    return;
                }
                x1Var.getClass();
                u uVar = new u(obj, (i) x1Var, null, null, null, 28, null);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, uVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            u uVar2 = (u) obj;
            if (uVar2.f129411b != null) {
                w(x1Var, obj);
                throw null;
            }
            if (x1Var instanceof u53.u) {
                return;
            }
            x1Var.getClass();
            i iVar = (i) x1Var;
            Throwable th4 = uVar2.f129414e;
            if (th4 != null) {
                i(iVar, th4);
                return;
            }
            u uVarA = u.a(uVar2, iVar, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, uVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(x());
        sb3.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb3.append(f0.L(this.f129361d));
        sb3.append("){");
        Object obj = f129359g.get(this);
        if (obj instanceof x1) {
            str = "Active";
        } else {
            str = obj instanceof m ? "Cancelled" : "Completed";
        }
        sb3.append(str);
        sb3.append("}@");
        sb3.append(f0.u(this));
        return sb3.toString();
    }

    @Override // o53.j
    public final boolean u(Throwable th3) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f129359g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof x1)) {
                return false;
            }
            m mVar = new m(this, th3, (obj instanceof i) || (obj instanceof u53.u));
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                    x1 x1Var = (x1) obj;
                    if (x1Var instanceof i) {
                        i((i) obj, th3);
                    } else if (x1Var instanceof u53.u) {
                        k((u53.u) obj, th3);
                    }
                    if (!v()) {
                        l();
                    }
                    m(this.f129380c);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    public final boolean v() {
        if (this.f129380c != 2) {
            return false;
        }
        t13.d<T> dVar = this.f129361d;
        dVar.getClass();
        return u53.f.f168731h.get((u53.f) dVar) != null;
    }

    public String x() {
        return "CancellableContinuation";
    }

    @Override // o53.j
    public final <R extends T> void y(R r14, e23.q<? super Throwable, ? super R, ? super t13.g, Unit> qVar) {
        A(r14, qVar, this.f129380c);
    }

    public final void z() {
        t13.d<T> dVar = this.f129361d;
        Throwable th3 = null;
        u53.f fVar = dVar instanceof u53.f ? (u53.f) dVar : null;
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u53.f.f168731h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                u53.x xVar = u53.g.f168737b;
                if (obj != xVar) {
                    if (!(obj instanceof Throwable)) {
                        ds.e0.t(obj, "Inconsistent state ");
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            vb.h.s("Failed requirement.");
                            return;
                        }
                    }
                    th3 = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(fVar, xVar, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(fVar) == xVar);
            }
            if (th3 == null) {
                return;
            }
            l();
            u(th3);
        }
    }
}
