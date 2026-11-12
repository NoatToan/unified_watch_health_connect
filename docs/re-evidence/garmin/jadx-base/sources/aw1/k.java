package aw1;

import androidx.lifecycle.y0;
import c22.l3;
import com.garmin.android.apps.connectmobile.g3;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$buildRunningWeeklyAvgUIModel$1", f = "FBTPlanWizardViewModel.kt", l = {3530}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f13443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f13445c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f13445c = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f13445c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        vt1.o oVar;
        h hVar;
        hv1.j jVarB;
        Double recentWeeklyAvgValue;
        int iU;
        Double avgSpeed;
        Integer num;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13444b;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = h.S1;
            h hVar2 = this.f13445c;
            ((y0) hVar2.f13376j1.getValue()).j(g3.a.c(g3.f35298f));
            jv1.s sVarI6 = hVar2.i6();
            if (sVarI6 != null && (oVar = sVarI6.f101125d) != null) {
                this.f13443a = hVar2;
                this.f13444b = 1;
                Object objB5 = h.b5(hVar2, oVar, this);
                if (objB5 == aVar) {
                    return aVar;
                }
                hVar = hVar2;
                obj = objB5;
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hVar = this.f13443a;
        o13.r.b(obj);
        jv1.y yVar = (jv1.y) obj;
        int i16 = h.S1;
        jv1.s sVarI7 = hVar.i6();
        double dDoubleValue = 0.0d;
        if (sVarI7 == null || (jVarB = sVarI7.f101143v) == null) {
            hv1.j.a aVar2 = hv1.j.f85874d;
            double dDoubleValue2 = (yVar == null || (recentWeeklyAvgValue = yVar.getRecentWeeklyAvgValue()) == null) ? 0.0d : recentWeeklyAvgValue.doubleValue();
            aVar2.getClass();
            jVarB = hv1.j.a.b(dDoubleValue2);
        }
        jv1.s sVarI8 = hVar.i6();
        if (sVarI8 == null || (num = sVarI8.f101144w) == null) {
            l3.a aVar3 = l3.f23124b;
            if (yVar != null && (avgSpeed = yVar.getAvgSpeed()) != null) {
                dDoubleValue = avgSpeed.doubleValue();
            }
            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            aVar3.getClass();
            iU = l3.a.u(dDoubleValue, zY);
        } else {
            iU = num.intValue();
        }
        if (jVarB == null) {
            jVarB = hv1.j.ZERO;
        }
        jv1.d dVar = new jv1.d(jVarB, iU, yVar);
        o13.t tVar = hVar.f13376j1;
        if (yVar != null) {
            y0 y0Var = (y0) tVar.getValue();
            g3.f35298f.getClass();
            y0Var.j(g3.a.d(dVar));
        } else {
            ((y0) tVar.getValue()).j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}
