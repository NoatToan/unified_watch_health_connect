package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lr53/t2;", "T", "Lr53/j;", "collector", "Lkotlin/Function2;", "Lt13/d;", "", "", "action", "<init>", "(Lr53/j;Le23/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t2<T> implements j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j<T> f150877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.p<j<? super T>, t13.d<? super Unit>, Object> f150878b;

    /* JADX WARN: Multi-variable type inference failed */
    public t2(j<? super T> jVar, e23.p<? super j<? super T>, ? super t13.d<? super Unit>, ? extends Object> pVar) {
        this.f150877a = jVar;
        this.f150878b = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (((r53.t2) r7).a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [v13.c] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v13.c cVar) {
        s2 s2Var;
        s53.x xVar;
        t2<T> t2Var;
        if (cVar instanceof s2) {
            s2Var = (s2) cVar;
            int i14 = s2Var.f150863e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s2Var.f150863e = i14 - Integer.MIN_VALUE;
            } else {
                s2Var = new s2(this, cVar);
            }
        } else {
            s2Var = new s2(this, cVar);
        }
        Object obj = s2Var.f150861c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        ?? r14 = s2Var.f150863e;
        try {
            if (r14 != 0) {
                if (r14 == 1) {
                    xVar = s2Var.f150860b;
                    t2Var = s2Var.f150859a;
                    o13.r.b(obj);
                } else {
                    if (r14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            xVar = new s53.x(this.f150877a, s2Var.getF129302c());
            e23.p<j<? super T>, t13.d<? super Unit>, Object> pVar = this.f150878b;
            s2Var.f150859a = this;
            s2Var.f150860b = xVar;
            s2Var.f150863e = 1;
            if (pVar.invoke(xVar, s2Var) != aVar) {
                t2Var = this;
            }
            return aVar;
            xVar.releaseIntercepted();
            j<T> jVar = t2Var.f150877a;
            r14 = jVar instanceof t2;
            if (r14 == 0) {
                return Unit.INSTANCE;
            }
            s2Var.f150859a = null;
            s2Var.f150860b = null;
            s2Var.f150863e = 2;
        } catch (Throwable th3) {
            r14.releaseIntercepted();
            throw th3;
        }
    }

    @Override // r53.j
    public final Object emit(T t7, t13.d<? super Unit> dVar) {
        return this.f150877a.emit(t7, dVar);
    }
}
