package u13;

import e23.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.y0;
import t13.g;
import t13.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
public class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static t13.d a(p pVar, t13.d dVar, t13.d dVar2) {
        pVar.getClass();
        if (pVar instanceof v13.a) {
            return ((v13.a) pVar).create(dVar, dVar2);
        }
        g f129362e = dVar2.getF129302c();
        return f129362e == h.f161748a ? new b(dVar2, pVar, dVar) : new c(dVar2, f129362e, pVar, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> t13.d<T> b(t13.d<? super T> dVar) {
        t13.d<T> dVar2;
        dVar.getClass();
        v13.c cVar = dVar instanceof v13.c ? (v13.c) dVar : null;
        return (cVar == null || (dVar2 = (t13.d<T>) cVar.intercepted()) == null) ? dVar : dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> Object c(p<? super R, ? super t13.d<? super T>, ? extends Object> pVar, R r14, t13.d<? super T> dVar) {
        pVar.getClass();
        g f129362e = dVar.getF129302c();
        e dVar2 = f129362e == h.f161748a ? new d(dVar) : new e(dVar, f129362e);
        y0.e(2, pVar);
        return pVar.invoke(r14, dVar2);
    }
}
