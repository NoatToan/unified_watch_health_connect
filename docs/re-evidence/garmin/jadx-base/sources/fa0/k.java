package fa0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q92.x;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.consent.DeviceSetupConsentViewModel$sendConsentApprovalRequest$1", f = "DeviceSetupConsentViewModel.kt", l = {169}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f70159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f70160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f70161d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(x xVar, h hVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f70160c = xVar;
        this.f70161d = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f70160c, this.f70161d, dVar);
        kVar.f70159b = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f70158a;
        h hVar = this.f70161d;
        if (i14 == 0) {
            r.b(obj);
            a2 a2Var = a2.DEVICE_SETUP;
            x xVar = this.f70160c;
            String strN = fb1.c.n("Sending parental approval request for consent type: ", xVar.f143819a);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "ConsentViewModel", strN);
            p2 p2Var = hVar.f70132n;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, new c(true, null, null, null, null, 30, null)));
            e20.a aVar2 = hVar.f70124f;
            d20.e eVar = new d20.e(xVar.f143819a);
            this.f70159b = null;
            this.f70158a = 1;
            obj = aVar2.c(eVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            p2 p2Var2 = hVar.f70132n;
            do {
                value3 = p2Var2.getValue();
            } while (!p2Var2.b(value3, new c(false, null, null, a.CONSENT_PARENTAL_REQUESTED, null, 23, null)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            p2 p2Var3 = hVar.f70132n;
            do {
                value2 = p2Var3.getValue();
            } while (!p2Var3.b(value2, new c(false, null, null, a.CONSENT_PARENTAL_REQUEST_ERROR, null, 23, null)));
        }
        return Unit.INSTANCE;
    }
}
