package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceCustomizationNavKt$deviceCustomizationGraph$1$19$1$1", f = "DeviceCustomizationNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ga0.a f26200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ la0.a f26201b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ga0.a aVar, la0.a aVar2, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f26200a = aVar;
        this.f26201b = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e0(this.f26200a, this.f26201b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ga0.a aVar2 = this.f26200a;
        aVar2.getClass();
        ge1.b.T(androidx.lifecycle.v1.a(aVar2), null, null, new ga0.b(aVar2, this.f26201b, null), 3);
        return Unit.INSTANCE;
    }
}
