package ya0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.pairing.DevicePairingProgressScreenKt$BleDevicePairingProgressRoute$6$1", f = "DevicePairingProgressScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<q90.c, Boolean, Unit> f195518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q90.a f195519b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(e23.p<? super q90.c, ? super Boolean, Unit> pVar, q90.a aVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f195518a = pVar;
        this.f195519b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f195518a, this.f195519b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        q90.a aVar2 = this.f195519b;
        this.f195518a.invoke(new q90.c(((q90.a.g) aVar2).f143478a, ((q90.a.g) aVar2).f143479b, ((q90.a.g) aVar2).f143480c, ((q90.a.g) aVar2).f143481d, (z80.f) null, false, false, false, false, false, false, 2032, (p005kotlin.jvm.internal.j) null), Boolean.valueOf(((q90.a.g) aVar2).f143482e));
        return Unit.INSTANCE;
    }
}
