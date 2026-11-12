package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileNavKt$userProfileGraph$1$15$1$1", f = "UserProfileNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c3 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kb0.r f26147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c4.o f26148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<q90.c> f26149c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(kb0.r rVar, c4.o oVar, e23.a<q90.c> aVar, t13.d<? super c3> dVar) {
        super(2, dVar);
        this.f26147a = rVar;
        this.f26148b = oVar;
        this.f26149c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c3(this.f26147a, this.f26148b, this.f26149c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        c4.o oVar = this.f26148b;
        int i14 = oVar.f26176a;
        int i15 = oVar.f26177b;
        String str = oVar.f26178c;
        z80.f fVar = this.f26149c.invoke().f143497e;
        this.f26147a.B4(i14, i15, str, fVar != null ? fVar.f203049g : null, p13.j0.f134944a);
        return Unit.INSTANCE;
    }
}
