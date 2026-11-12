package v52;

import p005kotlin.Unit;
import q53.w;
import r53.j;
import r53.o2;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static final <T> Object a(j<? super c<? extends T>> jVar, T t7, t13.d<? super Unit> dVar) {
        Object objEmit = jVar.emit(new c.C3278c(t7), dVar);
        return objEmit == u13.a.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
    }

    public static final <T> T b(o2<? extends c<? extends T>> o2Var) {
        o2Var.getClass();
        c<? extends T> value = o2Var.getValue();
        c.C3278c c3278c = value instanceof c.C3278c ? (c.C3278c) value : null;
        if (c3278c != null) {
            return c3278c.f175760a;
        }
        return null;
    }

    public static final <T> T c(o2<? extends c<? extends T>> o2Var) {
        o2Var.getClass();
        T t7 = (T) b(o2Var);
        if (t7 != null) {
            return t7;
        }
        throw new RuntimeException(o2Var + " does not has a successful state value, current value = " + o2Var.getValue());
    }

    public static final <T> Object d(w<? super c<? extends T>> wVar, T t7, t13.d<? super Unit> dVar) {
        Object objH = wVar.h(new c.C3278c(t7), dVar);
        return objH == u13.a.COROUTINE_SUSPENDED ? objH : Unit.INSTANCE;
    }
}
