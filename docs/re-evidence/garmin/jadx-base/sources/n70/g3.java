package n70;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq53/t;", "", "Lvb0/e;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetRemainingInReachSubscriptionsUseCase$getDismissedBannerData$1", f = "GetRemainingInReachSubscriptionsUseCase.kt", l = {72}, m = "invokeSuspend", v = 2)
public final class g3 extends v13.i implements e23.p<q53.t<? super List<? extends vb0.e>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f124236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f124237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d3 f124238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(d3 d3Var, t13.d<? super g3> dVar) {
        super(2, dVar);
        this.f124238c = d3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g3 g3Var = new g3(this.f124238c, dVar);
        g3Var.f124237b = obj;
        return g3Var;
    }

    @Override // e23.p
    public final Object invoke(q53.t<? super List<? extends vb0.e>> tVar, t13.d<? super Unit> dVar) {
        return ((g3) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        q53.t tVar = (q53.t) this.f124237b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f124236a;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = d3.f124134d;
            d3 d3Var = this.f124238c;
            tVar.i(d3Var.b());
            lp.k kVar = new lp.k(d3Var, tVar, 2);
            d3Var.f124136b.u3(kVar);
            mt0.s1 s1Var = new mt0.s1(6, d3Var, kVar);
            this.f124237b = null;
            this.f124236a = 1;
            if (q53.r.a(tVar, s1Var, this) == aVar) {
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
