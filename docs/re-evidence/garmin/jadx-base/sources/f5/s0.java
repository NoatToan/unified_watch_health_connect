package f5;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class s0 extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.b f69103a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(q0.b bVar) {
        super(0);
        this.f69103a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Unit invoke() {
        b3 b3Var;
        q0.b bVar = this.f69103a;
        if (!((Boolean) bVar.f69047g.getValue()).booleanValue() && (b3Var = bVar.f69043c) != null) {
            b3Var.deactivate();
        }
        return Unit.INSTANCE;
    }
}
