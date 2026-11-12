package r53;

import kotlinx.coroutines.flow.internal.AbortFlowException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lr53/c1;", "Lr53/j;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c1 implements j<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0 f150544a;

    public c1(p005kotlin.jvm.internal.r0 r0Var) {
        this.f150544a = r0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, u53.x] */
    @Override // r53.j
    public final Object emit(Object obj, t13.d<? super Unit> dVar) {
        p005kotlin.jvm.internal.r0 r0Var = this.f150544a;
        T t7 = r0Var.f105810a;
        ?? r14 = s53.w.f157598a;
        if (t7 == r14) {
            r0Var.f105810a = obj;
            return Unit.INSTANCE;
        }
        r0Var.f105810a = r14;
        throw new AbortFlowException(this);
    }
}
