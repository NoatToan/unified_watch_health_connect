package ta0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceDetectedScreenKt$DeviceConfirmRoute$2$1", f = "DeviceDetectedScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f163412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<l90.k> f163413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l90.k f163414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<l90.k, Unit> f163415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f163416e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(x3<l90.k> x3Var, l90.k kVar, e23.l<? super l90.k, Unit> lVar, e23.a<Unit> aVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f163413b = x3Var;
        this.f163414c = kVar;
        this.f163415d = lVar;
        this.f163416e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p pVar = new p(this.f163413b, this.f163414c, this.f163415d, this.f163416e, dVar);
        pVar.f163412a = obj;
        return pVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        l90.k f182175a = this.f163413b.getF182175a();
        if (f182175a == null) {
            this.f163416e.invoke();
        } else if (!p005kotlin.jvm.internal.s.g(this.f163414c, f182175a)) {
            this.f163415d.invoke(f182175a);
        }
        return Unit.INSTANCE;
    }
}
