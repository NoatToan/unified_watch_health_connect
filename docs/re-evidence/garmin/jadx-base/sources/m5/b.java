package m5;

import f5.c0;
import g6.n;
import n4.d;
import n4.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ln4/d;", "invoke", "()Ln4/d;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class b extends w implements e23.a<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<d> f116639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f116640b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e23.a<d> aVar, c0 c0Var) {
        super(0);
        this.f116639a = aVar;
        this.f116640b = c0Var;
    }

    @Override // e23.a
    public final d invoke() {
        d dVarInvoke;
        e23.a<d> aVar = this.f116639a;
        if (aVar != null && (dVarInvoke = aVar.invoke()) != null) {
            return dVarInvoke;
        }
        c0 c0Var = this.f116640b;
        if (!c0Var.isAttached()) {
            c0Var = null;
        }
        if (c0Var != null) {
            return h.c(n.c(c0Var.a()));
        }
        return null;
    }
}
