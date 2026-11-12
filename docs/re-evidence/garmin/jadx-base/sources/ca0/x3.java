package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileNavKt$userProfileGraph$1$24$2$1", f = "UserProfileNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x3 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<z80.h, Unit> f26536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.x3<z80.l> f26537b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x3(e23.l<? super z80.h, Unit> lVar, p3.x3<z80.l> x3Var, t13.d<? super x3> dVar) {
        super(2, dVar);
        this.f26536a = lVar;
        this.f26537b = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x3(this.f26536a, this.f26537b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        z80.h hVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        z80.l f182175a = this.f26537b.getF182175a();
        if (f182175a == null || (hVar = f182175a.f203084m) == null) {
            hVar = z80.h.c.f203058b;
        }
        this.f26536a.invoke(hVar);
        return Unit.INSTANCE;
    }
}
