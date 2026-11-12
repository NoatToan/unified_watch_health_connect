package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileNavKt$userProfileGraph$1$16$1$1", f = "UserProfileNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g3 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kb0.r f26228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c4.b f26229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<q90.c> f26230c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(kb0.r rVar, c4.b bVar, e23.a<q90.c> aVar, t13.d<? super g3> dVar) {
        super(2, dVar);
        this.f26228a = rVar;
        this.f26229b = bVar;
        this.f26230c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g3(this.f26228a, this.f26229b, this.f26230c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        c4.b bVar = this.f26229b;
        int i14 = bVar.f26151a;
        int i15 = bVar.f26152b;
        String str = bVar.f26153c;
        z80.f fVar = this.f26230c.invoke().f143497e;
        this.f26228a.B4(i14, i15, str, fVar != null ? fVar.f203049g : null, p13.j0.f134944a);
        return Unit.INSTANCE;
    }
}
