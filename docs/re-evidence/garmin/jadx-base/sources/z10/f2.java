package z10;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.LivetrackConsentEnforceViewModel$checkLiveTrackGroupRideConsent$1", f = "LivetrackConsentEnforceViewModel.kt", l = {78}, m = "invokeSuspend", v = 2)
public final class f2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f200992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q92.d f200993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d2 f200994c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(q92.d dVar, d2 d2Var, t13.d<? super f2> dVar2) {
        super(2, dVar2);
        this.f200993b = dVar;
        this.f200994c = d2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f2(this.f200993b, this.f200994c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f200992a;
        q92.d dVar = this.f200993b;
        if (i14 == 0) {
            o13.r.b(obj);
            p92.o oVar = p92.o.f136619a;
            this.f200992a = 1;
            obj = oVar.b(dVar, this);
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
        q92.v vVar = (q92.v) obj;
        boolean zC = vVar != null ? q92.c.c(vVar) : true;
        d2 d2Var = this.f200994c;
        if (zC) {
            d2Var.y4(q92.x.DI_CONNECT_LIVETRACK, vVar);
        } else {
            d2Var.f200958c.m(new a1.a(dVar.f143623b, vVar));
        }
        return Unit.INSTANCE;
    }
}
