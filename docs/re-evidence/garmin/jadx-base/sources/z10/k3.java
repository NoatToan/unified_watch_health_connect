package z10;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.UploadConsentEnforceViewModel$sendDeviceUploadConsentApprovalRequest$1", f = "UploadConsentEnforceViewModel.kt", l = {222}, m = "invokeSuspend", v = 2)
public final class k3 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i3 f201098b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(i3 i3Var, t13.d<? super k3> dVar) {
        super(2, dVar);
        this.f201098b = i3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k3(this.f201098b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201097a;
        i3 i3Var = this.f201098b;
        if (i14 == 0) {
            o13.r.b(obj);
            i3Var.f201049b.m(m0.CONSENT_IN_PROGRESS);
            e20.a aVar2 = i3Var.f201048a;
            d20.e eVar = new d20.e(q92.x.DI_CONNECT_UPLOAD.f143819a);
            this.f201097a = 1;
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
            i3Var.f201049b.m(m0.CONSENT_PARENTAL_REQUESTED);
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
