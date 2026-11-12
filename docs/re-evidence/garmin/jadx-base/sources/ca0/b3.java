package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileNavKt$userProfileGraph$1$10$1$1", f = "UserProfileNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b3 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<z80.l> f26138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ob0.h f26139b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(p3.x3<z80.l> x3Var, ob0.h hVar, t13.d<? super b3> dVar) {
        super(2, dVar);
        this.f26138a = x3Var;
        this.f26139b = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b3(this.f26138a, this.f26139b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        gg1.o0 o0Var;
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        z80.l f182175a = this.f26138a.getF182175a();
        if (f182175a != null && (o0Var = f182175a.f203076e) != null) {
            ob0.h hVar = this.f26139b;
            hVar.getClass();
            r53.p2 p2Var = hVar.f131129c;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, o0Var));
            hVar.x4();
        }
        return Unit.INSTANCE;
    }
}
