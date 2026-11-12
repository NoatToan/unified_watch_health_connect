package l30;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseViewModel$editCourseRelatedPacebands$2", f = "CreateCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<r53.j<? super List<? extends com.garmin.android.apps.connectmobile.pacepro.data.dto.a>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f109618a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f109618a = zVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f109618a, dVar);
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super List<? extends com.garmin.android.apps.connectmobile.pacepro.data.dto.a>> jVar, t13.d<? super Unit> dVar) {
        return ((q) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p2 p2Var = this.f109618a.f109668w;
        p2Var.k(null, n30.f.a((n30.f) p2Var.getValue(), true, n50.a.OPERATION_UPDATE_PACEBANDS, false, null, null, null, 0, false, null, null, 2044));
        return Unit.INSTANCE;
    }
}
