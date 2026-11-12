package cq0;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectionTermsViewModel$fetchChildLiveTrackConsent$1", f = "IncidentDetectionTermsViewModel.kt", l = {27}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f55160b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j8, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f55160b = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f55160b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f55159a;
        if (i14 == 0) {
            o13.r.b(obj);
            p92.o oVar = p92.o.f136619a;
            q92.x xVar = q92.x.DI_CONNECT_LIVETRACK;
            s92.l lVar = new s92.l(String.valueOf(this.f55160b));
            this.f55159a = 1;
            if (oVar.k(xVar, lVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
