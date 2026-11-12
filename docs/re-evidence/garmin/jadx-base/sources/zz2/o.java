package zz2;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Ln4/c;", "it", "", "<anonymous>", "(Lo53/b0;Ln4/c;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.skydoves.flexible.bottomsheet.material3.FlexibleBottomSheetKt$FlexibleBottomSheet$5$2$4$1", f = "FlexibleBottomSheet.kt", l = {}, m = "invokeSuspend")
public final class o extends v13.i implements e23.q<o53.b0, n4.c, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f207698a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p1<Boolean> p1Var, t13.d<? super o> dVar) {
        super(3, dVar);
        this.f207698a = p1Var;
    }

    @Override // e23.q
    public final Object invoke(o53.b0 b0Var, n4.c cVar, t13.d<? super Unit> dVar) {
        long j8 = cVar.f123544a;
        return new o(this.f207698a, dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f207698a.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
