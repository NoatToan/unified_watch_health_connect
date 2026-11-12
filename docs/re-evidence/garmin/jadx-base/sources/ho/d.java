package ho;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.presentation.filtering.ActivitySelectionViewModel$onShowActivities$1", f = "ActivitySelectionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f84600a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f84600a = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f84600a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        i53.f fVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        c cVar = this.f84600a;
        if (((j) cVar.f84595d.f150540a.getValue()).f84637b) {
            c.x4(cVar);
        } else {
            p2 p2Var = cVar.f84594c;
            do {
                value = p2Var.getValue();
                fVar = (i53.f) cVar.f84593b.getValue();
                ((j) value).getClass();
                fVar.getClass();
            } while (!p2Var.b(value, new j(fVar, true)));
        }
        return Unit.INSTANCE;
    }
}
