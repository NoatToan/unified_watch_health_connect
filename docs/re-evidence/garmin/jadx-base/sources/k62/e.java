package k62;

import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.myworkouts.MyWorkoutsInitialStateCheckScreenKt$MyWorkoutsInitialStateCheckScreen$1$1", f = "MyWorkoutsInitialStateCheckScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Boolean f103183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f103184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f103185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f103186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x3<g> f103187e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Boolean bool, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, x3<g> x3Var, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f103183a = bool;
        this.f103184b = aVar;
        this.f103185c = aVar2;
        this.f103186d = aVar3;
        this.f103187e = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f103183a, this.f103184b, this.f103185c, this.f103186d, this.f103187e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        Boolean bool = this.f103183a;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (zBooleanValue) {
                this.f103184b.invoke();
            } else {
                if (zBooleanValue) {
                    u0.r();
                    return null;
                }
                boolean z14 = this.f103187e.getF182175a().f103189b;
                if (z14) {
                    this.f103185c.invoke();
                } else {
                    if (z14) {
                        u0.r();
                        return null;
                    }
                    this.f103186d.invoke();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
