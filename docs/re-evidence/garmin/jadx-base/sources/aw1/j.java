package aw1;

import androidx.lifecycle.y0;
import c22.l3;
import com.garmin.android.apps.connectmobile.g3;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$buildRideWeekAvgUiModel$1", f = "FBTPlanWizardViewModel.kt", l = {3593}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f13438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f13440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f13440c = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f13440c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        vt1.o oVar;
        h hVar;
        hv1.f fVarA;
        hv1.f fVar;
        Double recentWeeklyAvgValue;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13439b;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = h.S1;
            h hVar2 = this.f13440c;
            ((y0) hVar2.f13379l1.getValue()).j(g3.a.c(g3.f35298f));
            jv1.s sVarI6 = hVar2.i6();
            if (sVarI6 != null && (oVar = sVarI6.f101125d) != null) {
                this.f13438a = hVar2;
                this.f13439b = 1;
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
        hVar = this.f13438a;
        o13.r.b(obj);
        jv1.y yVar = (jv1.y) obj;
        if (yVar == null || (recentWeeklyAvgValue = yVar.getRecentWeeklyAvgValue()) == null) {
            fVarA = hv1.f.ZERO_FOUR;
        } else {
            double dDoubleValue = recentWeeklyAvgValue.doubleValue();
            hv1.f.a aVar2 = hv1.f.f85850c;
            long j8 = (long) dDoubleValue;
            l3.f23124b.getClass();
            int i16 = ((int) j8) / DateTimeConstants.SECONDS_PER_HOUR;
            if (l3.a.L1(j8) > 30) {
                i16++;
            }
            aVar2.getClass();
            fVarA = hv1.f.a.a(i16);
            if (fVarA == null) {
                fVarA = hv1.f.ZERO_FOUR;
            }
        }
        int i17 = h.S1;
        y0 y0Var = (y0) hVar.f13379l1.getValue();
        g3.a aVar3 = g3.f35298f;
        jv1.s sVarI7 = hVar.i6();
        if (sVarI7 != null && (fVar = sVarI7.C) != null) {
            fVarA = fVar;
        }
        aVar3.getClass();
        y0Var.j(g3.a.d(fVarA));
        return Unit.INSTANCE;
    }
}
