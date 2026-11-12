package i21;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.viewmodel.NutritionReportsViewModel$switchToNoGoal$1", f = "NutritionReportsViewModel.kt", l = {689}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f87366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f87367b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(d dVar, t13.d<? super u> dVar2) {
        super(2, dVar2);
        this.f87367b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f87367b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objD4;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f87366a;
        d dVar = this.f87367b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = dVar.f87285q;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, c.a((c) value, null, null, null, null, null, null, null, null, null, null, false, false, null, true, false, false, null, null, 4063231)));
            this.f87366a = 1;
            objD4 = d.D4(dVar, this);
            if (objD4 == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objD4 = obj;
        }
        b bVar = (b) objD4;
        p2 p2Var2 = dVar.f87285q;
        do {
            value2 = p2Var2.getValue();
        } while (!p2Var2.b(value2, c.a((c) value2, new a(bVar, null, 2, null), null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, 4046846)));
        return Unit.INSTANCE;
    }
}
