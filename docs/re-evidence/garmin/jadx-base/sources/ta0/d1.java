package ta0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceSelectionScreenKt$DeviceSelectionRoute$4$1", f = "DeviceSelectionScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x3<va0.d> f163270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f163271b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(x3<va0.d> x3Var, p1<Boolean> p1Var, t13.d<? super d1> dVar) {
        super(2, dVar);
        this.f163270a = x3Var;
        this.f163271b = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d1(this.f163270a, this.f163271b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f163270a.getF182175a().f176576a.length() > 0) {
            this.f163271b.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
