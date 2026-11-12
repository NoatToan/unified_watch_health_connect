package b50;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "result", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsViewModel$deleteCourse$2", f = "CourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<v2<? extends Unit>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f16094b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p pVar, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f16094b = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w wVar = new w(this.f16094b, dVar);
        wVar.f16093a = obj;
        return wVar;
    }

    @Override // e23.p
    public final Object invoke(v2<? extends Unit> v2Var, t13.d<? super Unit> dVar) {
        return ((w) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2 v2Var = (v2) this.f16093a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        boolean z14 = v2Var instanceof v2.b;
        p pVar = this.f16094b;
        if (z14) {
            pVar.z4(e50.b.t.f62971a);
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            pVar.z4(new e50.b.s(e50.g.OPERATION_DELETE_COURSE));
        }
        return Unit.INSTANCE;
    }
}
