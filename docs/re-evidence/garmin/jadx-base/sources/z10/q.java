package z10;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.BaseConsentViewModel$sendConsentApprovalRequest$1", f = "BaseConsentViewModel.kt", l = {88}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q92.x f201212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f201213c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(q92.x xVar, j jVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f201212b = xVar;
        this.f201213c = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f201212b, this.f201213c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201211a;
        j jVar = this.f201213c;
        if (i14 == 0) {
            o13.r.b(obj);
            q92.x xVar = this.f201212b;
            if (xVar == null) {
                r53.p2 p2Var = jVar.f201061d;
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, z0.CONSENT_PARENTAL_REQUEST_ERROR));
                return Unit.INSTANCE;
            }
            r53.p2 p2Var2 = jVar.f201061d;
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, z0.CONSENT_PARENTAL_REQUEST_IN_PROGRESS));
            e20.a aVar2 = jVar.f201058a;
            d20.e eVar = new d20.e(xVar.f143819a);
            this.f201211a = 1;
            obj = aVar2.c(eVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            r53.p2 p2Var3 = jVar.f201061d;
            do {
                value4 = p2Var3.getValue();
            } while (!p2Var3.b(value4, z0.CONSENT_PARENTAL_REQUESTED));
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            r53.p2 p2Var4 = jVar.f201061d;
            do {
                value3 = p2Var4.getValue();
            } while (!p2Var4.b(value3, z0.CONSENT_PARENTAL_REQUEST_ERROR));
        }
        return Unit.INSTANCE;
    }
}
