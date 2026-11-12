package l30;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lab1/d;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseViewModel$editCourseRelatedPowerGuide$5", f = "CreateCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<v2<? extends ab1.d>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f109639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f109640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f109641c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(e23.a<Unit> aVar, z zVar, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f109640b = aVar;
        this.f109641c = zVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        x xVar = new x(this.f109640b, this.f109641c, dVar);
        xVar.f109639a = obj;
        return xVar;
    }

    @Override // e23.p
    public final Object invoke(v2<? extends ab1.d> v2Var, t13.d<? super Unit> dVar) {
        return ((x) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2 v2Var = (v2) this.f109639a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (v2Var instanceof v2.b) {
            this.f109640b.invoke();
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            this.f109641c.z4(n30.c.f0.f123412a);
        }
        return Unit.INSTANCE;
    }
}
