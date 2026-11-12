package fo;

import i3.mc;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListScreenKt$ActivitiesListScreen$hideBottomSheet$1", f = "ActivitiesListScreen.kt", l = {142}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mc f72400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f72401c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(mc mcVar, p1<Boolean> p1Var, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f72400b = mcVar;
        this.f72401c = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f72400b, this.f72401c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72399a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f72399a = 1;
            if (this.f72400b.d(this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        this.f72401c.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
