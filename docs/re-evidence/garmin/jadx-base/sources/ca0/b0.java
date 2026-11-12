package ca0;

import com.garmin.android.gfdi.configuration.SupportedCapability;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceCustomizationNavKt$deviceCustomizationGraph$1$14$5$1$1", f = "DeviceCustomizationNav.kt", l = {333}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public lc.m0 f26076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ja0.a f26079d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(lc.m0 m0Var, ja0.a aVar, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f26078c = m0Var;
        this.f26079d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b0(this.f26078c, this.f26079d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        lc.m0 m0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f26077b;
        lc.m0 m0Var2 = this.f26078c;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f26076a = m0Var2;
            this.f26077b = 1;
            ja0.a aVar2 = this.f26079d;
            obj = aVar2.f98052c.c(aVar2.f98050a, SupportedCapability.SPORT_PROFILE_SETUP) ? aVar2.x4(this) : new i0.n((la0.a) null, 1, (p005kotlin.jvm.internal.j) null);
            if (obj == aVar) {
                return aVar;
            }
            m0Var = m0Var2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m0Var = this.f26076a;
            o13.r.b(obj);
        }
        m0Var.h(zf.b.G(m0Var2), obj);
        return Unit.INSTANCE;
    }
}
