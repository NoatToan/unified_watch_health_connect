package wn1;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.InvitationDeclineViewModel$declineInvitation$1", f = "InvitationDeclineViewModel.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f186254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.smartscale.model.b f186255c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, com.garmin.android.apps.connectmobile.smartscale.model.b bVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f186254b = lVar;
        this.f186255c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f186254b, this.f186255c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186253a;
        l lVar = this.f186254b;
        if (i14 == 0) {
            o13.r.b(obj);
            t tVar = lVar.f186257b;
            this.f186253a = 1;
            tVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(tVar, new w(this.f186255c, null), this);
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
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            lVar.f186258c.j(fw.m.a.g(fw.m.f73767e, Unit.INSTANCE, 1));
            u62.z.i("declineInvitation: got response code ", ((v2.b) v2Var).f47387b, (Logger) lVar.f186256a.getValue());
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            lVar.f186258c.j(fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5));
            ((Logger) lVar.f186256a.getValue()).debug("declineInvitation: got response code " + ((v2.a) v2Var).f47384b);
        }
        return Unit.INSTANCE;
    }
}
