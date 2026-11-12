package g50;

import e23.p;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\"\u0012\u001e\u0012\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "Lo13/p;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "Lfg0/k;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesViewModel$reloadAndSendCourse$1", f = "CoursesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<r53.j<? super o13.p<? extends List<? extends com.garmin.android.apps.connectmobile.courses.model.d>, ? extends List<? extends fg0.k>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f75923a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f75923a = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f75923a, dVar);
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super o13.p<? extends List<? extends com.garmin.android.apps.connectmobile.courses.model.d>, ? extends List<? extends fg0.k>>> jVar, t13.d<? super Unit> dVar) {
        return ((j) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        p2 p2Var = this.f75923a.f75903i;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, i50.h.a((i50.h) value, null, true, false, false, null, null, null, false, null, 0, false, 16343)));
        return Unit.INSTANCE;
    }
}
