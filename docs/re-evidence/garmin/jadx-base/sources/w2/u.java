package w2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class u<T> implements r53.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f181442a;

    public u(n nVar) {
        this.f181442a = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0029 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    @Override // r53.j
    public final Object emit(Object obj, t13.d dVar) {
        Object objB;
        n4.d dVar2 = (n4.d) obj;
        n nVar = this.f181442a;
        if (dVar2 == null) {
            nVar.w();
            return Unit.INSTANCE;
        }
        nVar.getClass();
        if (!u1.g0.f167495b) {
            i0 i0Var = nVar.f181377m;
            if (i0Var == null || (objB = i0Var.b(nVar, dVar2, dVar)) != u13.a.COROUTINE_SUSPENDED) {
                objB = Unit.INSTANCE;
            }
            if (objB == u13.a.COROUTINE_SUSPENDED) {
                return objB;
            }
            return Unit.INSTANCE;
        }
        nVar.f181370f.b();
        objB = Unit.INSTANCE;
        if (objB == u13.a.COROUTINE_SUSPENDED) {
            return objB;
        }
        return Unit.INSTANCE;
    }
}
