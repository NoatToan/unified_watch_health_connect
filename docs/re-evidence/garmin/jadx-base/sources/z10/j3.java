package z10;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.UploadConsentEnforceViewModel$checkDeviceUploadConsentApprovalRequest$1", f = "UploadConsentEnforceViewModel.kt", l = {209}, m = "invokeSuspend", v = 2)
public final class j3 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i3 f201082b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(i3 i3Var, t13.d<? super j3> dVar) {
        super(2, dVar);
        this.f201082b = i3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j3(this.f201082b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201081a;
        i3 i3Var = this.f201082b;
        if (i14 == 0) {
            o13.r.b(obj);
            i3Var.f201049b.m(m0.CONSENT_IN_PROGRESS);
            e20.a aVar2 = i3Var.f201048a;
            String str = q92.x.DI_CONNECT_UPLOAD.f143819a;
            this.f201081a = 1;
            obj = aVar2.a(str, this);
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
            androidx.lifecycle.y0<m0> y0Var = i3Var.f201049b;
            d1 d1Var = d1.f200951a;
            d20.a aVar3 = (d20.a) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
            d1Var.getClass();
            y0Var.m(d1.g(aVar3) ? m0.CONSENT_PARENTAL_ALREADY_REQUESTED : m0.CONSENT_PARENTAL_REQUEST_NEEDED);
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            i3Var.f201049b.m(m0.CONSENT_PARENTAL_REQUEST_ERROR);
        }
        return Unit.INSTANCE;
    }
}
