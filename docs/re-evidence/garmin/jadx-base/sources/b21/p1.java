package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionReportsNavKt$nutritionReportsGraph$1$12$2$1", f = "NutritionReportsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f11.m f15126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l4.f f15128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f11.f f15129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3.x3<d11.i> f15130e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(f11.m mVar, lc.m0 m0Var, l4.f fVar, f11.f fVar2, p3.x3<d11.i> x3Var, t13.d<? super p1> dVar) {
        super(2, dVar);
        this.f15126a = mVar;
        this.f15127b = m0Var;
        this.f15128c = fVar;
        this.f15129d = fVar2;
        this.f15130e = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p1(this.f15126a, this.f15127b, this.f15128c, this.f15129d, this.f15130e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p3.x3<d11.i> x3Var = this.f15130e;
        if (x3Var.getF182175a().f57088j) {
            i53.c<d11.f> cVar = x3Var.getF182175a().f57082d;
            f11.m mVar = this.f15126a;
            mVar.getClass();
            cVar.getClass();
            mVar.f68014a = cVar;
            l4.f fVar = this.f15128c;
            lc.y.l(this.f15127b, new l4.m((m21.b) new m21.b.c(fVar.f14875b), b63.u.Companion.a(b63.u.INSTANCE, fVar.f14876c), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null));
        }
        this.f15129d.y4();
        return Unit.INSTANCE;
    }
}
