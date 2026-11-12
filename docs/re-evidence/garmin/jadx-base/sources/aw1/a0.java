package aw1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$getCyclingCoachPlans$1", f = "FBTPlanWizardViewModel.kt", l = {1603}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f13325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f13326d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(h hVar, String str, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f13325c = hVar;
        this.f13326d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a0 a0Var = new a0(this.f13325c, this.f13326d, dVar);
        a0Var.f13324b = obj;
        return a0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        ArrayList arrayListC5;
        jv1.s sVarI6;
        fg0.k kVar;
        LocalDate date;
        o53.b0 b0Var = (o53.b0) this.f13324b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13323a;
        h hVar = this.f13325c;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = h.S1;
            if (hVar.n6().d() == null) {
                hVar.n6().j(g3.a.c(g3.f35298f));
                uw1.b bVar = hVar.T;
                this.f13324b = b0Var;
                this.f13323a = 1;
                bVar.getClass();
                objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new uw1.d(this.f13326d, null), this);
                if (objJ == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        objJ = obj;
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            if (!hVar.d7() || (sVarI6 = hVar.i6()) == null || (kVar = sVarI6.f101124c) == null || (date = kVar.getDate()) == null) {
                arrayListC5 = h.c5(hVar, (List) ((v2.b) v2Var).f47386a);
            } else {
                ArrayList arrayListC6 = h.c5(hVar, (List) ((v2.b) v2Var).f47386a);
                arrayListC5 = new ArrayList();
                for (Object obj2 : arrayListC6) {
                    o13.p<LocalDate, LocalDate> pVarD = ((tw1.c) obj2).d();
                    if (pVarD != null ? tu1.a.o(date, pVarD.f128594a, pVarD.f128595b) : true) {
                        arrayListC5.add(obj2);
                    }
                }
            }
            jv1.f fVar = new jv1.f(vt1.o.f180176g, null, null, arrayListC5, false, false, null, 118, null);
            y0<g3<jv1.f>> y0VarN6 = hVar.n6();
            g3.f35298f.getClass();
            y0VarN6.j(g3.a.d(fVar));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            int i16 = h.S1;
            hVar.n6().j(g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13));
        }
        return Unit.INSTANCE;
    }
}
