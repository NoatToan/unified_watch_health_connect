package n70;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "", "Lo13/p;", "Lo70/c;", "Lr70/s;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetKeyStatsItemsUseCase$getActivityTrendPromptWidgets$1", f = "GetKeyStatsItemsUseCase.kt", l = {269}, m = "invokeSuspend", v = 2)
public final class r2 extends v13.i implements e23.p<r53.j<? super List<? extends o13.p<? extends o70.c, ? extends r70.s>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f124527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f124528b;

    public r2(t13.d<? super r2> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r2 r2Var = new r2(dVar);
        r2Var.f124528b = obj;
        return r2Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super List<? extends o13.p<? extends o70.c, ? extends r70.s>>> jVar, t13.d<? super Unit> dVar) {
        return ((r2) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f124528b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f124527a;
        if (i14 == 0) {
            o13.r.b(obj);
            p13.j0 j0Var = p13.j0.f134944a;
            this.f124528b = null;
            this.f124527a = 1;
            if (jVar.emit(j0Var, this) == aVar) {
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
