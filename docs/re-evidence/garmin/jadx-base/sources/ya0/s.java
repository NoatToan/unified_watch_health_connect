package ya0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.pairing.DevicePairingProgressScreenKt$BleDevicePairingProgressRoute$10$1", f = "DevicePairingProgressScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<Long, l90.b, Unit> f195512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q90.a f195513b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(e23.p<? super Long, ? super l90.b, Unit> pVar, q90.a aVar, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f195512a = pVar;
        this.f195513b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f195512a, this.f195513b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        q90.a aVar2 = this.f195513b;
        this.f195512a.invoke(new Long(((q90.a.d) aVar2).f143467a), ((q90.a.d) aVar2).f143468b);
        return Unit.INSTANCE;
    }
}
