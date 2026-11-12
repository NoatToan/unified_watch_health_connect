package aw1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$getRunningCoachPlans$1", f = "FBTPlanWizardViewModel.kt", l = {1705}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f13336b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(h hVar, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f13336b = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c0(this.f13336b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13335a;
        h hVar = this.f13336b;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = h.S1;
            if (hVar.n6().d() == null) {
                hVar.n6().j(g3.a.c(g3.f35298f));
                this.f13335a = 1;
                obj = hVar.O5(null, this);
                if (obj == aVar) {
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
        jv1.f fVar = (jv1.f) obj;
        if (fVar != null) {
            int i16 = h.S1;
            y0<g3<jv1.f>> y0VarN6 = hVar.n6();
            g3.f35298f.getClass();
            y0VarN6.j(g3.a.d(fVar));
        } else {
            int i17 = h.S1;
            hVar.n6().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}
