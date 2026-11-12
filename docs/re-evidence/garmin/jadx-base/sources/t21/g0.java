package t21;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Le2/n;", Constants.MessagePayloadKeys.FROM, "to", "", "<anonymous>", "(Lo53/b0;Le2/n;Le2/n;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.screen.EditMicronutrientsScreenKt$EditMicronutrientsList$reorderableLazyListState$1$1", f = "EditMicronutrientsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.r<o53.b0, e2.n, e2.n, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ e2.n f161872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ e2.n f161873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<Integer, Integer, Unit> f161874c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(e23.p<? super Integer, ? super Integer, Unit> pVar, t13.d<? super g0> dVar) {
        super(4, dVar);
        this.f161874c = pVar;
    }

    @Override // e23.r
    public final Object invoke(o53.b0 b0Var, e2.n nVar, e2.n nVar2, t13.d<? super Unit> dVar) {
        g0 g0Var = new g0(this.f161874c, dVar);
        g0Var.f161872a = nVar;
        g0Var.f161873b = nVar2;
        return g0Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        e2.n nVar = this.f161872a;
        e2.n nVar2 = this.f161873b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f161874c.invoke(new Integer(nVar.getIndex() - 1), new Integer(nVar2.getIndex() - 1));
        return Unit.INSTANCE;
    }
}
