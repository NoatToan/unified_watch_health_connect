package ya0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.pairing.DevicePairingProgressScreenKt$BtcDevicePairingProgressRoute$2$1", f = "DevicePairingProgressScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<q90.c, Unit> f195525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q90.b f195526b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(e23.l<? super q90.c, Unit> lVar, q90.b bVar, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f195525a = lVar;
        this.f195526b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z(this.f195525a, this.f195526b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        q90.b bVar = this.f195526b;
        this.f195525a.invoke(new q90.c(((q90.b.d) bVar).f143489a, ((q90.b.d) bVar).f143490b, ((q90.b.d) bVar).f143491c, ((q90.b.d) bVar).f143492d, (z80.f) null, false, false, false, false, false, false, 2032, (p005kotlin.jvm.internal.j) null));
        return Unit.INSTANCE;
    }
}
