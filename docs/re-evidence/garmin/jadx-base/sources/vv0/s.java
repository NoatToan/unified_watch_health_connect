package vv0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingNavigationKt$reports$1$1$1", f = "LifestyleLoggingNavigation.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gw0.u f180477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.v f180478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<Boolean> f180479c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(gw0.u uVar, lc.v vVar, x3<Boolean> x3Var, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f180477a = uVar;
        this.f180478b = vVar;
        this.f180479c = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f180477a, this.f180478b, this.f180479c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f180479c.getF182175a().booleanValue()) {
            gw0.u uVar = this.f180477a;
            uVar.f79776q.i(new o82.a(uVar.f79767h, null, 2, null), true);
            tv0.f fVar = uVar.f79766g;
            fVar.f166547c = fVar.f166546b.g();
            this.f180478b.a().e("REFRESH_DATA");
        }
        return Unit.INSTANCE;
    }
}
