package l72;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class f extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f110997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p007l6.p f110998b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p3.p1 p1Var, p007l6.p pVar) {
        super(0);
        this.f110997a = p1Var;
        this.f110998b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Unit invoke() {
        p3.p1 p1Var = this.f110997a;
        p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
        this.f110998b.f110492d = true;
        return Unit.INSTANCE;
    }
}
