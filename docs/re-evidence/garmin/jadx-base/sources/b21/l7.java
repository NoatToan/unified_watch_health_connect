package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSettingsNavKt$nutritionSettingsGraph$1$1$1$1$1", f = "NutritionSettingsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l7 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.v f15015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q21.r f15017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f15018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3.x3<Boolean> f15019e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(lc.v vVar, lc.m0 m0Var, q21.r rVar, e23.a<Unit> aVar, p3.x3<Boolean> x3Var, t13.d<? super l7> dVar) {
        super(2, dVar);
        this.f15015a = vVar;
        this.f15016b = m0Var;
        this.f15017c = rVar;
        this.f15018d = aVar;
        this.f15019e = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l7(this.f15015a, this.f15016b, this.f15017c, this.f15018d, this.f15019e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l7) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f15019e.getF182175a().booleanValue()) {
            l4 l4Var = ((l4.h0) lc.w.a(this.f15015a, p005kotlin.jvm.internal.s0.f105811a.b(l4.h0.class))).f14900b;
            boolean z14 = l4Var instanceof l4.e0;
            q21.r rVar = this.f15017c;
            lc.m0 m0Var = this.f15016b;
            if (z14) {
                m0Var.h(new androidx.room.w0(16), new l4.e0(rVar.f142293f));
            } else if (l4Var instanceof l4.v) {
                m0Var.h(new androidx.room.w0(17), l4.v.INSTANCE);
            } else if (l4Var instanceof l4.t) {
                m0Var.h(new androidx.room.w0(18), l4.t.INSTANCE);
            } else if (l4Var instanceof l4.x) {
                m0Var.h(new androidx.room.w0(19), l4.x.INSTANCE);
            } else if (l4Var instanceof l4.w) {
                m0Var.h(new androidx.room.w0(20), l4.w.INSTANCE);
            } else if (l4Var instanceof l4.f0) {
                m0Var.h(new androidx.room.w0(21), l4.f0.INSTANCE);
            } else if (l4Var instanceof l4.o0) {
                m0Var.h(new androidx.room.w0(22), new l4.o0(true, rVar.f142293f));
            } else {
                this.f15018d.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
