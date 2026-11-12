package b50;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$duplicateCourse$2", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f0 extends v13.i implements e23.p<v2<? extends com.garmin.android.apps.connectmobile.courses.model.e>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f15975b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p pVar, t13.d<? super f0> dVar) {
        super(2, dVar);
        this.f15975b = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f0 f0Var = new f0(this.f15975b, dVar);
        f0Var.f15974a = obj;
        return f0Var;
    }

    @Override // e23.p
    public final Object invoke(v2<? extends com.garmin.android.apps.connectmobile.courses.model.e> v2Var, t13.d<? super Unit> dVar) {
        return ((f0) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        v2 v2Var = (v2) this.f15974a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        boolean z14 = v2Var instanceof v2.b;
        p pVar = this.f15975b;
        if (z14) {
            com.garmin.android.apps.connectmobile.courses.model.e eVar2 = (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a;
            w20.a aVar2 = ((e50.d) pVar.f16041y.getValue()).f62992d;
            boolean z15 = false;
            if (aVar2 != null && (eVar = aVar2.f181476a) != null && eVar.f0()) {
                z15 = true;
            }
            pVar.z4(new e50.b.r(eVar2, z15));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            pVar.z4(new e50.b.s(e50.g.OPERATION_DUPLICATE_COURSE));
        }
        return Unit.INSTANCE;
    }
}
