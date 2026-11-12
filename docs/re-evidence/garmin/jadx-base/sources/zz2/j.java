package zz2;

import a03.r0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.skydoves.flexible.bottomsheet.material3.FlexibleBottomSheetKt$FlexibleBottomSheet$3$1", f = "FlexibleBottomSheet.kt", l = {}, m = "invokeSuspend")
public final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a03.p f207687a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a03.p pVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f207687a = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f207687a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        r0<a03.y> r0Var = this.f207687a.f158i;
        r0Var.f175f = r0Var.d().size() == p13.x.k(a03.y.Hidden, a03.y.SlightlyExpanded, a03.y.IntermediatelyExpanded, a03.y.FullyExpanded).size();
        return Unit.INSTANCE;
    }
}
