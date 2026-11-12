package l30;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "climbs", "", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseViewModel$fetchSecondaryClimbs$1", f = "CreateCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<List<? extends ClimbDTO>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f109558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f109559b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(z zVar, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f109559b = zVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d0 d0Var = new d0(this.f109559b, dVar);
        d0Var.f109558a = obj;
        return d0Var;
    }

    @Override // e23.p
    public final Object invoke(List<? extends ClimbDTO> list, t13.d<? super Unit> dVar) {
        return ((d0) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.f109558a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        z zVar = this.f109559b;
        p2 p2Var = zVar.f109668w;
        p2Var.k(null, n30.f.a((n30.f) p2Var.getValue(), false, null, false, null, null, null, ((n30.f) zVar.f109668w.getValue()).f123460h + 1, false, null, null, 1919));
        zVar.z4(new n30.c.m0(list));
        return Unit.INSTANCE;
    }
}
