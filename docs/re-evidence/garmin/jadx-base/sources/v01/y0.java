package v01;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lkd1/c;", "Lq01/g;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetNutritionRemindersUseCase$invoke$4", f = "GetNutritionRemindersUseCase.kt", l = {57}, m = "invokeSuspend", v = 2)
public final class y0 extends v13.i implements e23.p<r53.j<? super kd1.c<? extends q01.g>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f174610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f174611b;

    public y0(t13.d<? super y0> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        y0 y0Var = new y0(dVar);
        y0Var.f174611b = obj;
        return y0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super kd1.c<? extends q01.g>> jVar, t13.d<? super Unit> dVar) {
        return ((y0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f174611b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174610a;
        if (i14 == 0) {
            o13.r.b(obj);
            kd1.c.a aVar2 = kd1.c.a.f104497a;
            this.f174611b = null;
            this.f174610a = 1;
            if (jVar.emit(aVar2, this) == aVar) {
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
