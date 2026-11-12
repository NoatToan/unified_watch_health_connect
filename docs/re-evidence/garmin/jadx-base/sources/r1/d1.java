package r1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo4/t0;", "", "invoke", "(Lo4/t0;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class d1 extends p005kotlin.jvm.internal.w implements e23.l<o4.t0, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f149073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Boolean> f149074b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(boolean z14, e23.a<Boolean> aVar) {
        super(1);
        this.f149073a = z14;
        this.f149074b = aVar;
    }

    @Override // e23.l
    public final Unit invoke(o4.t0 t0Var) {
        t0Var.g(!this.f149073a && this.f149074b.invoke().booleanValue());
        return Unit.INSTANCE;
    }
}
