package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileNavKt$userProfileGraph$1$5$1$1", f = "UserProfileNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y3 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab0.a f26544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<z80.h, Unit> f26545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<q90.c> f26546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3.x3<Boolean> f26548e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y3(ab0.a aVar, e23.l<? super z80.h, Unit> lVar, e23.a<q90.c> aVar2, lc.m0 m0Var, p3.x3<Boolean> x3Var, t13.d<? super y3> dVar) {
        super(2, dVar);
        this.f26544a = aVar;
        this.f26545b = lVar;
        this.f26546c = aVar2;
        this.f26547d = m0Var;
        this.f26548e = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y3(this.f26544a, this.f26545b, this.f26546c, this.f26547d, this.f26548e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f26548e.getF182175a().booleanValue()) {
            c4 c4VarY4 = this.f26544a.y4(null);
            if (c4VarY4 instanceof c4.m) {
                z80.h.b bVar = z80.h.f203056a;
                z80.f fVar = this.f26546c.invoke().f143497e;
                Boolean bool = fVar != null ? fVar.f203049g : null;
                bVar.getClass();
                this.f26545b.invoke(bool != null ? new z80.h.a(bool.booleanValue()) : z80.h.c.f203058b);
            } else {
                this.f26547d.h(new d2(17), c4VarY4);
            }
        }
        return Unit.INSTANCE;
    }
}
