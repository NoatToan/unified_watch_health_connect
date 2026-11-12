package b12;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p007l6.p;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class h extends w implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1 f14411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f14412b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p1 p1Var, p pVar) {
        super(0);
        this.f14411a = p1Var;
        this.f14412b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Unit invoke() {
        p1 p1Var = this.f14411a;
        p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
        this.f14412b.f110492d = true;
        return Unit.INSTANCE;
    }
}
