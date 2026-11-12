package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class b1<T> implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<Object> f150539a;

    public b1(p005kotlin.jvm.internal.r0<Object> r0Var) {
        this.f150539a = r0Var;
    }

    @Override // r53.j
    public final Object emit(T t7, t13.d<? super Unit> dVar) {
        p005kotlin.jvm.internal.r0<Object> r0Var = this.f150539a;
        if (r0Var.f105810a == s53.w.f157598a) {
            r0Var.f105810a = t7;
            return Unit.INSTANCE;
        }
        vb.h.s("Flow has more than one element");
        return null;
    }
}
