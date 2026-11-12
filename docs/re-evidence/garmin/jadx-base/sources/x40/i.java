package x40;

import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity$setupComposeContent$1$1$2$1", f = "CreateCustomCourseActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CreateCustomCourseActivity f188694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<a50.g> f188695b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CreateCustomCourseActivity createCustomCourseActivity, x3<a50.g> x3Var, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f188694a = createCustomCourseActivity;
        this.f188695b = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f188694a, this.f188695b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        CreateCustomCourseActivity.a aVar2 = CreateCustomCourseActivity.f33013f;
        x3<a50.g> x3Var = this.f188695b;
        boolean z14 = x3Var.getF182175a().f1390a;
        CreateCustomCourseActivity createCustomCourseActivity = this.f188694a;
        if (z14) {
            n50.a aVar3 = x3Var.getF182175a().f1391b;
            if (aVar3 != null) {
                createCustomCourseActivity.showProgressOverlay(createCustomCourseActivity.getString(aVar3.f123725a));
            } else {
                createCustomCourseActivity.showProgressOverlay();
            }
        } else {
            createCustomCourseActivity.hideProgressOverlay();
        }
        return Unit.INSTANCE;
    }
}
