package wn1;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.ManagePeopleViewModel$cancelInvitationRequest$1", f = "ManagePeopleViewModel.kt", l = {85}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f186209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f186210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.smartscale.model.e f186211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h0 h0Var, Long l14, com.garmin.android.apps.connectmobile.smartscale.model.e eVar, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f186209b = h0Var;
        this.f186210c = l14;
        this.f186211d = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e0(this.f186209b, this.f186210c, this.f186211d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186208a;
        h0 h0Var = this.f186209b;
        if (i14 == 0) {
            o13.r.b(obj);
            t tVar = h0Var.f186243b;
            long jLongValue = this.f186210c.longValue();
            this.f186208a = 1;
            tVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(tVar, new v(jLongValue, null), this);
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
            h0.x4(h0Var).debug("cancelInvitationRequest: Successful!");
            u62.z.i("cancelInvitationRequest: got response code response ", ((v2.b) v2Var).f47387b, (Logger) h0Var.f186242a.getValue());
            h0Var.f186245d.j(fw.m.a.g(fw.m.f73767e, this.f186211d, 1));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            h0.x4(h0Var).error("executeTask: Unsuccessful task, code " + ((v2.a) v2Var).f47384b);
            h0Var.f186245d.j(fw.m.a.b(fw.m.f73767e, new fw.r(), null, 1));
        }
        return Unit.INSTANCE;
    }
}
