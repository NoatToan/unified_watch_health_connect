package ya0;

import android.content.Context;
import android.widget.Toast;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.pairing.DevicePairingProgressScreenKt$BtcDevicePairingProgressRoute$4$1", f = "DevicePairingProgressScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q90.b f195400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f195401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f195402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<l90.b, Unit> f195403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(q90.b bVar, Context context, String str, e23.l<? super l90.b, Unit> lVar, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f195400a = bVar;
        this.f195401b = context;
        this.f195402c = str;
        this.f195403d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b0(this.f195400a, this.f195401b, this.f195402c, this.f195403d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        q90.b bVar = this.f195400a;
        if (((q90.b.C2705b) bVar).f143484a.getPairingFailure() == yl2.e.DISCONNECTION) {
            Toast.makeText(this.f195401b, this.f195402c, 0).show();
        }
        this.f195403d.invoke(((q90.b.C2705b) bVar).f143485b);
        return Unit.INSTANCE;
    }
}
