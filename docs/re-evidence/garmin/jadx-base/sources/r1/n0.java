package r1;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo4/t0;", "", "invoke", "(Lo4/t0;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class n0 extends p005kotlin.jvm.internal.w implements e23.l<o4.t0, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x3<Float> f149175a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(x3<Float> x3Var) {
        super(1);
        this.f149175a = x3Var;
    }

    @Override // e23.l
    public final Unit invoke(o4.t0 t0Var) {
        t0Var.c(this.f149175a.getF182175a().floatValue());
        return Unit.INSTANCE;
    }
}
