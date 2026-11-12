package androidx.lifecycle;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f8037a;

        public a(e23.l lVar) {
            lVar.getClass();
            this.f8037a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f8037a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f8037a.invoke(obj);
        }
    }

    public static final w0 a(s0 s0Var, e23.l lVar) {
        s0Var.getClass();
        w0 w0Var = s0Var.f8014e != s0.f8009k ? new w0(lVar.invoke(s0Var.d())) : new w0();
        w0Var.n(s0Var, new a(new a42.i(6, w0Var, lVar)));
        return w0Var;
    }

    public static final w0 b(y0 y0Var, e23.l lVar) {
        s0 s0Var;
        y0Var.getClass();
        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
        Object obj = y0Var.f8014e;
        Object obj2 = s0.f8009k;
        w0 w0Var = (obj == obj2 || (s0Var = (s0) lVar.invoke(y0Var.d())) == null || s0Var.f8014e == obj2) ? new w0() : new w0(s0Var.d());
        w0Var.n(y0Var, new a(new a4.a(lVar, 4, r0Var, w0Var)));
        return w0Var;
    }
}
