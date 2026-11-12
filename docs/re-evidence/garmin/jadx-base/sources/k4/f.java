package k4;

import e23.l;
import h5.d2;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk4/e;", "currentNode", "Lh5/d2;", "invoke", "(Lk4/e;)Lh5/d2;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class f extends w implements l<e, d2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f102818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f102819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f102820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, e eVar, m0 m0Var) {
        super(1);
        this.f102818a = cVar;
        this.f102819b = eVar;
        this.f102820c = m0Var;
    }

    @Override // e23.l
    public final d2 invoke(e eVar) {
        e eVar2 = eVar;
        if (!eVar2.getIsAttached()) {
            return d2.SkipSubtreeAndContinueTraversal;
        }
        if (eVar2.f102811e != null) {
            e5.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
        }
        l<c, i> lVar = eVar2.f102808b;
        i iVarInvoke = lVar != null ? lVar.invoke(this.f102818a) : null;
        eVar2.f102811e = iVarInvoke;
        boolean z14 = iVarInvoke != null;
        if (z14) {
            e eVar3 = this.f102819b;
            eVar3.getClass();
            h5.k.h(eVar3).getDragAndDropManager().b(eVar2);
        }
        m0 m0Var = this.f102820c;
        m0Var.f105804a = m0Var.f105804a || z14;
        return d2.ContinueTraversal;
    }
}
