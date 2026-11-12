package ca0;

import android.content.Context;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceDiscoveryNavKt$deviceDiscoveryGraph$1$9$2$1", f = "DeviceDiscoveryNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.x3<o13.q<l90.b>> f26066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<Context, l90.b, Unit> f26067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f26068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26069e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a1(p3.x3<o13.q<l90.b>> x3Var, e23.p<? super Context, ? super l90.b, Unit> pVar, Context context, lc.m0 m0Var, t13.d<? super a1> dVar) {
        super(2, dVar);
        this.f26066b = x3Var;
        this.f26067c = pVar;
        this.f26068d = context;
        this.f26069e = m0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a1 a1Var = new a1(this.f26066b, this.f26067c, this.f26068d, this.f26069e, dVar);
        a1Var.f26065a = obj;
        return a1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        o13.q<l90.b> f182175a = this.f26066b.getF182175a();
        if (f182175a != null) {
            Object obj2 = f182175a.f128597a;
            if (obj2 instanceof o13.q.b) {
                obj2 = null;
            }
            l90.b bVar = (l90.b) obj2;
            if (bVar != null) {
                this.f26067c.invoke(this.f26068d, bVar);
            } else {
                b1.g gVar = b1.g.INSTANCE;
                this.f26069e.h(new k(16), gVar);
            }
        }
        return Unit.INSTANCE;
    }
}
