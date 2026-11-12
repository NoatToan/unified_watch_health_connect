package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSearchFoodNavKt$nutritionSearchFoodGraph$1$5$1$1$3$1", f = "NutritionSearchFoodNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.v f15312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.x3<b11.a> f15313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l4.m f15314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m21.g f15315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i21.d f15316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b63.u f15317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m21.v f15318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f11.m f15319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15320i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v5(lc.v vVar, p3.x3<? extends b11.a> x3Var, l4.m mVar, m21.g gVar, i21.d dVar, b63.u uVar, m21.v vVar2, f11.m mVar2, lc.m0 m0Var, t13.d<? super v5> dVar2) {
        super(2, dVar2);
        this.f15312a = vVar;
        this.f15313b = x3Var;
        this.f15314c = mVar;
        this.f15315d = gVar;
        this.f15316e = dVar;
        this.f15317f = uVar;
        this.f15318g = vVar2;
        this.f15319h = mVar2;
        this.f15320i = m0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v5(this.f15312a, this.f15313b, this.f15314c, this.f15315d, this.f15316e, this.f15317f, this.f15318g, this.f15319h, this.f15320i, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        d11.h hVarY4;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        b11.a f182175a = this.f15313b.getF182175a();
        if (f182175a != null) {
            l4.m mVar = this.f15314c;
            m21.b bVar = mVar.f14927b;
            boolean z14 = bVar instanceof m21.b.e;
            m21.g gVar = this.f15315d;
            if (z14) {
                gVar.J4(f182175a.getF14237d(), f182175a.b());
                this.f15316e.Q4(p13.w.c(this.f15317f.b()));
            } else if (bVar instanceof m21.b.a) {
                e5.b(this.f15320i, p13.w.c(f182175a.H1()));
                gVar.H4(f182175a);
            } else if (bVar instanceof m21.b.C2206b) {
                this.f15318g.y4(f182175a);
                gVar.I4(f182175a, mVar.f14930e);
            } else {
                if (!(bVar instanceof m21.b.c)) {
                    lc.u0.r();
                    return null;
                }
                f11.m mVar2 = this.f15319h;
                if (mVar2 != null && (hVarY4 = f11.m.y4(mVar2, f182175a)) != null) {
                    gVar.K4(hVarY4);
                }
            }
        }
        this.f15312a.a().f(null, "foodLoggedResult");
        return Unit.INSTANCE;
    }
}
