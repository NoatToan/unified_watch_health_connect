package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceMigrationNavKt$deviceMigrationGraph$1$5$1$1", f = "DeviceMigrationNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qa0.f f26186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f26188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.x3<qa0.c> f26189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(qa0.f fVar, lc.m0 m0Var, e23.a<Unit> aVar, p3.x3<qa0.c> x3Var, t13.d<? super d1> dVar) {
        super(2, dVar);
        this.f26186a = fVar;
        this.f26187b = m0Var;
        this.f26188c = aVar;
        this.f26189d = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d1(this.f26186a, this.f26187b, this.f26188c, this.f26189d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (!this.f26189d.getF182175a().f143841a) {
            f1.d dVar = ((qa0.c) this.f26186a.f143856e.getValue()).f143842b ? f1.d.INSTANCE : null;
            if (dVar != null) {
                this.f26187b.h(new k(21), dVar);
            } else {
                this.f26188c.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
