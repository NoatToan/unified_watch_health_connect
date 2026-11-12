package wn1;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.IndexInvitationGetStartedViewModel$canAcceptMoreUsers$1", f = "IndexInvitationGetStartedViewModel.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f186188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f186189c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, long j8, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f186188b = cVar;
        this.f186189c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f186188b, this.f186189c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186187a;
        c cVar = this.f186188b;
        if (i14 == 0) {
            o13.r.b(obj);
            t tVar = cVar.f186194b;
            this.f186187a = 1;
            tVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(tVar, new u(this.f186189c, null), this);
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
            ((Logger) cVar.f186193a.getValue()).debug("canAcceptMoreUsers: Successful!");
            cVar.f186195c.j(fw.m.a.g(fw.m.f73767e, ((v2.b) v2Var).f47386a, 1));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            ((Logger) cVar.f186193a.getValue()).error("canAcceptMoreUsers: Unsuccessful response, response: " + ((v2.a) v2Var).f47384b);
            cVar.f186195c.j(fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5));
        }
        return Unit.INSTANCE;
    }
}
