package f21;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.composable.MacronutrientsChartChipsGroupKt$MacronutrientsChartChipsGroup$2$1", f = "MacronutrientsChartChipsGroup.kt", l = {34}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<g21.l> f68606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g21.l f68607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e2.i0 f68608d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(List<? extends g21.l> list, g21.l lVar, e2.i0 i0Var, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f68606b = list;
        this.f68607c = lVar;
        this.f68608d = i0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f68606b, this.f68607c, this.f68608d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f68605a;
        if (i14 == 0) {
            o13.r.b(obj);
            int iIndexOf = this.f68606b.indexOf(this.f68607c);
            this.f68605a = 1;
            if (e2.i0.f(this.f68608d, iIndexOf, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
