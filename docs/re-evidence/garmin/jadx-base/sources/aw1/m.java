package aw1;

import androidx.lifecycle.y0;
import c22.l3;
import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$checkCoachCautionForMarathon$1", f = "FBTPlanWizardViewModel.kt", l = {3322}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f13480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vt1.n f13481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f13484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f13485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vt1.n f13486g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h hVar, boolean z14, vt1.n nVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f13484e = hVar;
        this.f13485f = z14;
        this.f13486g = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f13484e, this.f13485f, this.f13486g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fb  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        h hVar;
        vt1.o oVar;
        Object objB5;
        boolean z14;
        vt1.n nVar;
        int iB;
        vt1.n nVar2;
        vt1.n nVar3;
        Integer numZ4;
        jv1.e eVar;
        hv1.j jVar;
        Double recentWeeklyAvgValue;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13483d;
        if (i14 == 0) {
            o13.r.b(obj);
            hVar = this.f13484e;
            hVar.t7();
            jv1.s sVarI6 = hVar.i6();
            if (sVarI6 != null && (oVar = sVarI6.f101125d) != null) {
                hVar.m6().j(g3.a.c(g3.f35298f));
                this.f13480a = hVar;
                vt1.n nVar4 = this.f13486g;
                this.f13481b = nVar4;
                boolean z15 = this.f13485f;
                this.f13482c = z15;
                this.f13483d = 1;
                objB5 = h.b5(hVar, oVar, this);
                if (objB5 == aVar) {
                    return aVar;
                }
                z14 = z15;
                nVar = nVar4;
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z14 = this.f13482c;
        vt1.n nVar5 = this.f13481b;
        h hVar2 = this.f13480a;
        o13.r.b(obj);
        nVar = nVar5;
        hVar = hVar2;
        objB5 = obj;
        jv1.y yVar = (jv1.y) objB5;
        double dDoubleValue = (yVar == null || (recentWeeklyAvgValue = yVar.getRecentWeeklyAvgValue()) == null) ? 0.0d : recentWeeklyAvgValue.doubleValue();
        int i15 = h.S1;
        jv1.s sVarI7 = hVar.i6();
        if ((sVarI7 != null ? sVarI7.f101143v : null) != null) {
            jv1.s sVarI8 = hVar.i6();
            iB = (sVarI8 == null || (jVar = sVarI8.f101143v) == null) ? 0 : jVar.b();
        } else {
            l3.f23124b.getClass();
            iB = MathKt.b(dDoubleValue / 1609.344d);
        }
        vt1.l.f180150b.getClass();
        if (iB == vt1.l.TEN_K_CAUTION_THRESHOLD_MILES.f180155a) {
            nVar3 = vt1.n.FIVE_K;
        } else {
            if (iB >= vt1.l.HALF_MARATHON_CAUTION_THRESHOLD_MILES.f180155a) {
                if (iB < vt1.l.MARATHON_CAUTION_THRESHOLD_MILES.f180155a) {
                    nVar3 = vt1.n.HALF_MARATHON;
                } else {
                    nVar2 = null;
                }
                if (z14) {
                    numZ4 = h.Z4(hVar, iB);
                } else {
                    numZ4 = null;
                }
                if (nVar2 == null || numZ4 != null) {
                    eVar = new jv1.e(true, nVar, nVar2, null, null, null, false, false, numZ4, null, 760, null);
                } else {
                    eVar = new jv1.e(false, null, null, null, null, null, false, false, null, null, 1022, null);
                }
                jv1.s sVarI9 = hVar.i6();
                hVar.k8(sVarI9 != null ? jv1.s.a(sVarI9, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, eVar, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, 511) : null);
                y0<g3<jv1.e>> y0VarM6 = hVar.m6();
                g3.f35298f.getClass();
                y0VarM6.j(g3.a.d(eVar));
                return Unit.INSTANCE;
            }
            nVar3 = vt1.n.TEN_K;
        }
        nVar2 = nVar3;
        if (z14) {
            numZ4 = h.Z4(hVar, iB);
        } else {
            numZ4 = null;
        }
        if (nVar2 == null) {
            eVar = new jv1.e(true, nVar, nVar2, null, null, null, false, false, numZ4, null, 760, null);
        } else {
            eVar = new jv1.e(true, nVar, nVar2, null, null, null, false, false, numZ4, null, 760, null);
        }
        jv1.s sVarI10 = hVar.i6();
        hVar.k8(sVarI10 != null ? jv1.s.a(sVarI10, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, eVar, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, 511) : null);
        y0<g3<jv1.e>> y0VarM7 = hVar.m6();
        g3.f35298f.getClass();
        y0VarM7.j(g3.a.d(eVar));
        return Unit.INSTANCE;
    }
}
