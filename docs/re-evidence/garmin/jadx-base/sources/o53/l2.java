package o53;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lo53/l2;", "T", "Lu53/t;", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lt13/d;", "uCont", "<init>", "(Lt13/g;Lt13/d;)V", "", "threadLocalIsSet", "Z", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l2<T> extends u53.t<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ThreadLocal<o13.p<t13.g, Object>> f129370e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public l2(t13.g gVar, t13.d<? super T> dVar) {
        m2 m2Var = m2.f129373a;
        super(gVar.get(m2Var) == null ? gVar.plus(m2Var) : gVar, dVar);
        this.f129370e = new ThreadLocal<>();
        if (dVar.getF157466b().get(t13.e.f161746w0) instanceof z) {
            return;
        }
        Object objC = u53.z.c(gVar, null);
        u53.z.a(gVar, objC);
        z0(gVar, objC);
    }

    @Override // u53.t, o53.p1
    public final void A(Object obj) {
        y0();
        Object objA = w.a(obj);
        t13.d<T> dVar = this.f168769d;
        t13.g f129302c = dVar.getF157466b();
        Object objC = u53.z.c(f129302c, null);
        l2<?> l2VarC = objC != u53.z.f168776a ? y.c(dVar, f129302c, objC) : null;
        try {
            dVar.resumeWith(objA);
            Unit unit = Unit.INSTANCE;
        } finally {
            if (l2VarC == null || l2VarC.x0()) {
                u53.z.a(f129302c, objC);
            }
        }
    }

    @Override // u53.t
    public final void w0() {
        y0();
    }

    public final boolean x0() {
        boolean z14 = this.threadLocalIsSet && this.f129370e.get() == null;
        this.f129370e.remove();
        return !z14;
    }

    public final void y0() {
        if (this.threadLocalIsSet) {
            o13.p<t13.g, Object> pVar = this.f129370e.get();
            if (pVar != null) {
                u53.z.a(pVar.f128594a, pVar.f128595b);
            }
            this.f129370e.remove();
        }
    }

    public final void z0(t13.g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f129370e.set(new o13.p<>(gVar, obj));
    }
}
