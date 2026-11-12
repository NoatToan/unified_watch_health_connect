package b21;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSearchFoodNavKt$nutritionSearchFoodGraph$1$1$1$4$1", f = "NutritionSearchFoodNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<x11.b> f14742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m21.v f14743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x11.e f14744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f14745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.o f14746e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(p3.x3<x11.b> x3Var, m21.v vVar, x11.e eVar, lc.m0 m0Var, l4.o oVar, t13.d<? super i5> dVar) {
        super(2, dVar);
        this.f14742a = x3Var;
        this.f14743b = vVar;
        this.f14744c = eVar;
        this.f14745d = m0Var;
        this.f14746e = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i5(this.f14742a, this.f14743b, this.f14744c, this.f14745d, this.f14746e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        List<b11.v> list = this.f14742a.getF182175a().f188390j;
        if (list != null) {
            this.f14743b.f116177b.k(null, list);
            this.f14744c.x4();
            l4.o oVar = this.f14746e;
            oVar.getClass();
            o4.a aVar2 = o4.f15095a;
            String str = oVar.f14936b;
            aVar2.getClass();
            o4 o4VarA = o4.a.a(str);
            if (o4VarA == null) {
                o4VarA = o4.LOG_FOOD;
            }
            lc.y.l(this.f14745d, new l4.q(o4VarA, b63.u.Companion.a(b63.u.INSTANCE, oVar.f14937c), oVar.f14940f, false, 8, (p005kotlin.jvm.internal.j) null));
        }
        return Unit.INSTANCE;
    }
}
