package b5;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f15885a = new q(p13.j0.f134944a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements PointerInputEventHandler, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.p f15886a;

        public a(e23.p pVar) {
            this.f15886a = pVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof PointerInputEventHandler) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f15886a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final /* synthetic */ Object invoke(h0 h0Var, t13.d dVar) {
            return this.f15886a.invoke(h0Var, dVar);
        }
    }

    public static final v0 a(PointerInputEventHandler pointerInputEventHandler) {
        return new v0((Object) null, (Object) null, (Object[]) null, pointerInputEventHandler);
    }

    public static final h4.r b(h4.r rVar, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return rVar.then(new r0(obj, null, null, pointerInputEventHandler, 6, null));
    }
}
