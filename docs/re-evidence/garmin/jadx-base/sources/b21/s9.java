package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSetupNavKt$NutritionSetupGraphContainer$3$1", f = "NutritionSetupNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s9 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u21.u0 f15239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<l01.k, Unit> f15240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.x3<s21.a0> f15241c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s9(u21.u0 u0Var, e23.l<? super l01.k, Unit> lVar, p3.x3<s21.a0> x3Var, t13.d<? super s9> dVar) {
        super(2, dVar);
        this.f15239a = u0Var;
        this.f15240b = lVar;
        this.f15241c = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s9(this.f15239a, this.f15240b, this.f15241c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s9) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        o13.p<Boolean, l01.k> pVar = this.f15241c.getF182175a().D;
        if (pVar != null && pVar.f128594a.booleanValue()) {
            this.f15239a.z4();
            this.f15240b.invoke(pVar.f128595b);
        }
        return Unit.INSTANCE;
    }
}
