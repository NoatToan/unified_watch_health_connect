package ll1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.init.RecordActivitySelectDeviceScreenKt$RecordActivitySelectDevicesScreen$1$1", f = "RecordActivitySelectDeviceScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f113402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<l> f113403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f113404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<Long, Unit> f113405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p<Long, String, Unit> f113406e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(x3<l> x3Var, m mVar, e23.l<? super Long, Unit> lVar, p<? super Long, ? super String, Unit> pVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f113403b = x3Var;
        this.f113404c = mVar;
        this.f113405d = lVar;
        this.f113406e = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f113403b, this.f113404c, this.f113405d, this.f113406e, dVar);
        jVar.f113402a = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        k kVar = this.f113403b.getF182175a().f113412c;
        if (kVar != null) {
            i2.f36769a.getClass();
            i2.a.b(a2.RECORD_ACTIVITY, "RecordActivitySelectDevicesScreen", "Select device state: " + kVar);
            p2 p2Var = this.f113404c.f113414b;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, l.a((l) value, null, 3)));
            if (kVar instanceof k.b) {
                this.f113405d.invoke(new Long(((k.b) kVar).f113409a));
            } else {
                if (!(kVar instanceof k.a)) {
                    u0.r();
                    return null;
                }
                k.a aVar2 = (k.a) kVar;
                this.f113406e.invoke(new Long(aVar2.f113407a), aVar2.f113408b);
            }
        }
        return Unit.INSTANCE;
    }
}
