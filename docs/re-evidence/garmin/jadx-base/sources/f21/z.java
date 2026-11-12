package f21;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.composable.MicronutrientsChartChipsGroupsKt$MicronutrientsChartChipsGroup$2$1", f = "MicronutrientsChartChipsGroups.kt", l = {34}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<g21.r> f68635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g21.r f68636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e2.i0 f68637d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(List<? extends g21.r> list, g21.r rVar, e2.i0 i0Var, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f68635b = list;
        this.f68636c = rVar;
        this.f68637d = i0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z(this.f68635b, this.f68636c, this.f68637d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f68634a;
        if (i14 == 0) {
            o13.r.b(obj);
            int iIndexOf = this.f68635b.indexOf(this.f68636c);
            this.f68634a = 1;
            if (e2.i0.f(this.f68637d, iIndexOf, this) == aVar) {
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
