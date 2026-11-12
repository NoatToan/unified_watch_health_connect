package wn1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.ManagePeopleViewModel$removeSecondaryUserFromDevice$1", f = "ManagePeopleViewModel.kt", l = {110}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f186229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f186230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f186231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.smartscale.model.e f186232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, long j8, Long l14, com.garmin.android.apps.connectmobile.smartscale.model.e eVar, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f186229b = h0Var;
        this.f186230c = j8;
        this.f186231d = l14;
        this.f186232e = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g0(this.f186229b, this.f186230c, this.f186231d, this.f186232e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186228a;
        h0 h0Var = this.f186229b;
        if (i14 == 0) {
            o13.r.b(obj);
            t tVar = h0Var.f186243b;
            long jLongValue = this.f186231d.longValue();
            this.f186228a = 1;
            tVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(tVar, new z(this.f186230c, jLongValue, null), this);
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
            h0.x4(h0Var).debug("removeSecondaryUserFromDevice: Successful!");
            u62.z.i("removeSecondaryUserFromDevice: got response code response ", ((v2.b) v2Var).f47387b, (Logger) h0Var.f186242a.getValue());
            y0<fw.m<com.garmin.android.apps.connectmobile.smartscale.model.e>> y0Var = h0Var.f186245d;
            fw.m.a aVar2 = fw.m.f73767e;
            com.garmin.android.apps.connectmobile.smartscale.model.e eVar = this.f186232e;
            y0Var.j(fw.m.a.g(aVar2, eVar, 1));
            if (h0Var.f186248g) {
                Long userProfileId = eVar.getUserProfileId();
                com.garmin.android.apps.connectmobile.userprofile.model.g gVarW0 = h0Var.f186247f.W0();
                h0Var.f186249h = p005kotlin.jvm.internal.s.g(userProfileId, gVarW0 != null ? gVarW0.f46857a : null);
            }
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
