package aw1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$setFindEventResultDTOs$1", f = "FBTPlanWizardViewModel.kt", l = {3138}, m = "invokeSuspend", v = 2)
public final class o0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f13524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fg0.p f13525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f13528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f13529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fg0.p f13530g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(h hVar, fg0.p pVar, t13.d<? super o0> dVar) {
        super(2, dVar);
        this.f13529f = hVar;
        this.f13530g = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o0 o0Var = new o0(this.f13529f, this.f13530g, dVar);
        o0Var.f13528e = obj;
        return o0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        h hVar;
        fg0.p pVar;
        String str;
        o53.b0 b0Var = (o53.b0) this.f13528e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13527d;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = h.S1;
            hVar = this.f13529f;
            hVar.p6().j(g3.a.c(g3.f35298f));
            fg0.p pVar2 = this.f13530g;
            String garminEventUuid = pVar2.getGarminEventUuid();
            if (garminEventUuid != null) {
                zf0.d dVar = hVar.f204384a;
                this.f13528e = b0Var;
                this.f13524a = hVar;
                this.f13525b = pVar2;
                this.f13526c = garminEventUuid;
                this.f13527d = 1;
                Object objF = dVar.f(garminEventUuid, this);
                if (objF == aVar) {
                    return aVar;
                }
                pVar = pVar2;
                obj = objF;
                str = garminEventUuid;
            } else {
                hVar.p6().j(g3.a.d(Unit.INSTANCE));
                hVar.p5();
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = this.f13526c;
        pVar = this.f13525b;
        hVar = this.f13524a;
        o13.r.b(obj);
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            fg0.k kVar = (fg0.k) ((v2.b) v2Var).f47386a;
            Boolean race = kVar.getRace();
            pVar.i(race != null ? race.booleanValue() : true);
            pVar.h(kVar.h());
            int i16 = h.S1;
            y0<g3<Unit>> y0VarP6 = hVar.p6();
            g3.a aVar2 = g3.f35298f;
            Unit unit = Unit.INSTANCE;
            aVar2.getClass();
            y0VarP6.j(g3.a.d(unit));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strN = fb1.c.n("Error getting shareable event details for event uuid ", str);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "FBTPlanWizardViewModel", strN);
            int i17 = h.S1;
            hVar.p6().j(g3.a.a(g3.f35298f, fb1.c.n("Error getting shareable event details for event uuid ", str), null, null, null, 14));
        }
        hVar.p5();
        return Unit.INSTANCE;
    }
}
