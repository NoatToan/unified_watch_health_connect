package b50;

import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity$setupComposeContent$1$1$2$1", f = "CourseDetailsActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CourseDetailsActivity f15995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<e50.d> f15996b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CourseDetailsActivity courseDetailsActivity, x3<e50.d> x3Var, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f15995a = courseDetailsActivity;
        this.f15996b = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f15995a, this.f15996b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        CourseDetailsActivity.a aVar2 = CourseDetailsActivity.f33024k;
        x3<e50.d> x3Var = this.f15996b;
        boolean z14 = x3Var.getF182175a().f62989a;
        CourseDetailsActivity courseDetailsActivity = this.f15995a;
        if (z14) {
            e50.g gVar = x3Var.getF182175a().f62990b;
            if (gVar != null) {
                courseDetailsActivity.getClass();
                courseDetailsActivity.showProgressOverlay(courseDetailsActivity.getString(gVar.f63015a));
            } else {
                courseDetailsActivity.showProgressOverlay();
            }
        } else {
            courseDetailsActivity.hideProgressOverlay();
        }
        return Unit.INSTANCE;
    }
}
