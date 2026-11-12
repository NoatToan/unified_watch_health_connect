package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\n\u0010\u0002\u001a\u00060\u0000R\u00020\u00012\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyc/k0$a;", "Lyc/k0;", "prependHint", "appendHint", "", "invoke", "(Lyc/k0$a;Lyc/k0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class m0 extends p005kotlin.jvm.internal.w implements e23.p<k0.a, k0.a, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t4 f196154a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(t4 t4Var) {
        super(2);
        this.f196154a = t4Var;
    }

    @Override // e23.p
    public final Unit invoke(k0.a aVar, k0.a aVar2) {
        k0.a aVar3 = aVar;
        k0.a aVar4 = aVar2;
        aVar3.getClass();
        aVar4.getClass();
        t4 t4Var = aVar3.f196106a;
        c1 c1Var = c1.PREPEND;
        t4 t4Var2 = this.f196154a;
        if (i0.f(t4Var2, t4Var, c1Var)) {
            aVar3.f196106a = t4Var2;
            aVar3.f196107b.d(t4Var2);
        }
        if (i0.f(t4Var2, aVar4.f196106a, c1.APPEND)) {
            aVar4.f196106a = t4Var2;
            aVar4.f196107b.d(t4Var2);
        }
        return Unit.INSTANCE;
    }
}
