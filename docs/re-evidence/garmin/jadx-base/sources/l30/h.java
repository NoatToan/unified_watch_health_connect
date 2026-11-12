package l30;

import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity$setupComposeContent$1$1$2$1", f = "CreateCourseActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CreateCourseActivity f109579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<n30.f> f109580b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CreateCourseActivity createCourseActivity, x3<n30.f> x3Var, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f109579a = createCourseActivity;
        this.f109580b = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f109579a, this.f109580b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        CreateCourseActivity.a aVar2 = CreateCourseActivity.f32989g;
        x3<n30.f> x3Var = this.f109580b;
        boolean z14 = x3Var.getF182175a().f123453a;
        n50.a aVar3 = x3Var.getF182175a().f123454b;
        CreateCourseActivity createCourseActivity = this.f109579a;
        if (!z14) {
            createCourseActivity.hideProgressOverlay();
        } else if (aVar3 != null) {
            createCourseActivity.getClass();
            createCourseActivity.showProgressOverlay(createCourseActivity.getString(aVar3.f123725a));
        } else {
            createCourseActivity.showProgressOverlay();
        }
        return Unit.INSTANCE;
    }
}
