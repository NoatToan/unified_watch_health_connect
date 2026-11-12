package r1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class c extends p005kotlin.jvm.internal.w implements e23.l<f5.v1.a, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f5.v1 f149019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f149020b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f5.v1 v1Var, l0 l0Var) {
        super(1);
        this.f149019a = v1Var;
        this.f149020b = l0Var;
    }

    @Override // e23.l
    public final Unit invoke(f5.v1.a aVar) {
        aVar.r(this.f149019a, 0, 0, this.f149020b.f149140c.getFloatValue());
        return Unit.INSTANCE;
    }
}
