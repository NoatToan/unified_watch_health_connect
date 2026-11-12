package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.navigation.PhonePermissionsNavKt$phonePermissionsGraph$1$1$1$1", f = "PhonePermissionsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ za0.i f26468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f26469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.x3<za0.i.b> f26470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(lc.m0 m0Var, za0.i iVar, e23.a<Unit> aVar, p3.x3<za0.i.b> x3Var, t13.d<? super s2> dVar) {
        super(2, dVar);
        this.f26467a = m0Var;
        this.f26468b = iVar;
        this.f26469c = aVar;
        this.f26470d = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s2(this.f26467a, this.f26468b, this.f26469c, this.f26470d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p3.x3<za0.i.b> x3Var = this.f26470d;
        if (!x3Var.getF182175a().f203254a) {
            if (x3Var.getF182175a().f203255b.isEmpty()) {
                this.f26469c.invoke();
            } else {
                r90.a aVar2 = (r90.a) p13.h0.b0(x3Var.getF182175a().f203255b);
                this.f26468b.getClass();
                u2 u2VarX4 = za0.i.x4(aVar2);
                this.f26467a.h(new d2(8), u2VarX4);
            }
        }
        return Unit.INSTANCE;
    }
}
