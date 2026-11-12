package aw1;

import androidx.lifecycle.y0;
import c22.l3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Iterator;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$checkCoachCautionApi$1", f = "FBTPlanWizardViewModel.kt", l = {3265, 3269}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f13455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vt1.n f13456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f13457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f13462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f13463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ vt1.n f13464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f13465k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f13466l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar, vt1.n nVar, boolean z14, boolean z15, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f13463i = hVar;
        this.f13464j = nVar;
        this.f13465k = z14;
        this.f13466l = z15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f13463i, this.f13464j, this.f13465k, this.f13466l, dVar);
        lVar.f13462h = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02da  */
    /* JADX WARN: Code duplicated, block: B:104:0x0347  */
    /* JADX WARN: Code duplicated, block: B:106:0x034b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0379  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0195  */
    /* JADX WARN: Code duplicated, block: B:75:0x019f  */
    /* JADX WARN: Code duplicated, block: B:84:0x020b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0279  */
    /* JADX WARN: Code duplicated, block: B:89:0x0288  */
    /* JADX WARN: Code duplicated, block: B:93:0x02a3  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        vt1.o oVar;
        boolean z14;
        Object objB5;
        h hVar;
        vt1.n nVar;
        boolean z15;
        int i14;
        Number numberValueOf;
        Integer numValueOf;
        Object objJ;
        Integer num;
        h hVar2;
        jv1.m mVar;
        Integer numA;
        hv1.j jVar;
        Double avgSpeed;
        Double recentWeeklyAvgValue;
        vt1.n nVar2;
        v2 v2Var;
        v2.b bVar;
        T t7;
        Integer numZ4;
        Integer suggestedPlanTypeId;
        Iterator<T> it;
        Object next;
        o53.b0 b0Var = (o53.b0) this.f13462h;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f13461g;
        int iIntValue = 0;
        if (i15 == 0) {
            o13.r.b(obj);
            h hVar3 = this.f13463i;
            hVar3.t7();
            jv1.s sVarI6 = hVar3.i6();
            if (sVarI6 != null && (oVar = sVarI6.f101125d) != null) {
                hVar3.m6().j(g3.a.c(g3.f35298f));
                this.f13462h = b0Var;
                this.f13455a = hVar3;
                vt1.n nVar3 = this.f13464j;
                this.f13456b = nVar3;
                boolean z16 = this.f13465k;
                this.f13458d = z16;
                z14 = this.f13466l;
                this.f13459e = z14;
                this.f13460f = 0;
                this.f13461g = 1;
                objB5 = h.b5(hVar3, oVar, this);
                if (objB5 != aVar) {
                    hVar = hVar3;
                    nVar = nVar3;
                    z15 = z16;
                    i14 = 0;
                }
                return aVar;
            }
            return Unit.INSTANCE;
        }
        if (i15 == 1) {
            int i16 = this.f13460f;
            boolean z17 = this.f13459e;
            boolean z18 = this.f13458d;
            vt1.n nVar4 = this.f13456b;
            hVar = this.f13455a;
            o13.r.b(obj);
            i14 = i16;
            nVar = nVar4;
            z15 = z18;
            z14 = z17;
            objB5 = obj;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z19 = this.f13458d;
            num = this.f13457c;
            nVar = this.f13456b;
            hVar2 = this.f13455a;
            o13.r.b(obj);
            z14 = z19;
            objJ = obj;
        }
        nVar2 = nVar;
        v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            bVar = (v2.b) v2Var;
            t7 = bVar.f47386a;
            if (bVar.f47387b == 204) {
                jv1.e eVar = num != null ? new jv1.e(false, null, null, null, null, null, false, false, null, null, 1022, null) : new jv1.e(false, null, null, null, null, null, false, false, null, null, 1022, null);
                int i17 = h.S1;
                jv1.s sVarI7 = hVar2.i6();
                hVar2.k8(sVarI7 != null ? jv1.s.a(sVarI7, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, eVar, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, 511) : null);
                y0<g3<jv1.e>> y0VarM6 = hVar2.m6();
                g3.f35298f.getClass();
                y0VarM6.j(g3.a.d(eVar));
            } else {
                if (z14 || num == null) {
                    numZ4 = null;
                } else {
                    numZ4 = h.Z4(hVar2, num.intValue());
                }
                vt1.n.a aVar2 = vt1.n.f180163d;
                fu1.j jVar2 = (fu1.j) t7;
                suggestedPlanTypeId = jVar2.getSuggestedPlanTypeId();
                aVar2.getClass();
                it = vt1.n.f180170k.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    int i18 = ((vt1.n) next).f180172b;
                    if (suggestedPlanTypeId != null && i18 == suggestedPlanTypeId.intValue()) {
                        break;
                    }
                }
                jv1.e eVar2 = new jv1.e(true, nVar2, (vt1.n) next, null, null, jVar2.getSuggestedRaceTime(), false, false, numZ4, null, 728, null);
                int i19 = h.S1;
                jv1.s sVarI8 = hVar2.i6();
                hVar2.k8(sVarI8 != null ? jv1.s.a(sVarI8, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, eVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, 511) : null);
                y0<g3<jv1.e>> y0VarM7 = hVar2.m6();
                g3.f35298f.getClass();
                y0VarM7.j(g3.a.d(eVar2));
            }
        } else {
            if (v2Var instanceof v2.a) {
                u0.r();
                return null;
            }
            int i24 = h.S1;
            v2.a aVar3 = (v2.a) v2Var;
            hVar2.m6().j(g3.a.a(g3.f35298f, aVar3.f47385c, aVar3.f47383a, null, null, 12));
            String strD = com.airbnb.lottie.animation.keyframe.a.d(aVar3.f47383a, "Error calling checkCoachCaution ");
            i2.a aVar4 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var, "FBTPlanWizardViewModel", strD);
        }
        return Unit.INSTANCE;
        jv1.y yVar = (jv1.y) objB5;
        int i25 = h.S1;
        hVar.getClass();
        double dDoubleValue = (yVar == null || (recentWeeklyAvgValue = yVar.getRecentWeeklyAvgValue()) == null) ? 0.0d : recentWeeklyAvgValue.doubleValue();
        double dDoubleValue2 = (yVar == null || (avgSpeed = yVar.getAvgSpeed()) == null) ? 0.0d : avgSpeed.doubleValue();
        jv1.s sVarI9 = hVar.i6();
        if ((sVarI9 != null ? sVarI9.f101143v : null) != null) {
            jv1.s sVarI10 = hVar.i6();
            numberValueOf = (sVarI10 == null || (jVar = sVarI10.f101143v) == null) ? Double.valueOf(0.0d) : Integer.valueOf(jVar.b());
        } else {
            l3.f23124b.getClass();
            numberValueOf = Double.valueOf(dDoubleValue / 1609.344d);
        }
        jv1.s sVarI11 = hVar.i6();
        if ((sVarI11 != null ? sVarI11.f101144w : null) != null) {
            jv1.s sVarI12 = hVar.i6();
            numValueOf = sVarI12 != null ? sVarI12.f101144w : null;
        } else {
            l3.f23124b.getClass();
            numValueOf = Integer.valueOf(l3.a.p(dDoubleValue2, false));
        }
        Integer numValueOf2 = Integer.valueOf(nVar != null ? nVar.f180172b : vt1.n.FIVE_K.f180172b);
        Integer numValueOf3 = Integer.valueOf(numberValueOf.intValue());
        if (z15) {
            numValueOf = 0;
        }
        Integer num2 = numValueOf;
        jv1.s sVarI13 = hVar.i6();
        if (sVarI13 != null && (mVar = sVarI13.f101129h) != null && (numA = mVar.a()) != null) {
            iIntValue = numA.intValue();
        }
        xw1.c cVar = new xw1.c(null, numValueOf2, numValueOf3, num2, null, iIntValue, null, null, null, null, null, 0, 0, 0, 0, null, null, null, 0, 0, null, null, null, null, null, 33554385, null);
        Integer prePlanWeeklyMileage = cVar.getPrePlanWeeklyMileage();
        gu1.b bVar2 = hVar.P;
        this.f13462h = b0Var;
        this.f13455a = hVar;
        this.f13456b = nVar;
        this.f13457c = prePlanWeeklyMileage;
        this.f13458d = z14;
        this.f13460f = i14;
        this.f13461g = 2;
        bVar2.getClass();
        objJ = com.garmin.android.apps.connectmobile.f0.J(bVar2, new gu1.c(bVar2, cVar, null), this);
        if (objJ != aVar) {
            num = prePlanWeeklyMileage;
            hVar2 = hVar;
            nVar2 = nVar;
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                bVar = (v2.b) v2Var;
                t7 = bVar.f47386a;
                if (bVar.f47387b == 204) {
                    jv1.e eVar3 = num != null ? new jv1.e(false, null, null, null, null, null, false, false, null, null, 1022, null) : new jv1.e(false, null, null, null, null, null, false, false, null, null, 1022, null);
                    int i110 = h.S1;
                    jv1.s sVarI14 = hVar2.i6();
                    hVar2.k8(sVarI14 != null ? jv1.s.a(sVarI14, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, eVar3, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, 511) : null);
                    y0<g3<jv1.e>> y0VarM8 = hVar2.m6();
                    g3.f35298f.getClass();
                    y0VarM8.j(g3.a.d(eVar3));
                } else {
                    if (z14) {
                        numZ4 = null;
                    } else {
                        numZ4 = null;
                    }
                    vt1.n.a aVar5 = vt1.n.f180163d;
                    fu1.j jVar3 = (fu1.j) t7;
                    suggestedPlanTypeId = jVar3.getSuggestedPlanTypeId();
                    aVar5.getClass();
                    it = vt1.n.f180170k.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        int i111 = ((vt1.n) next).f180172b;
                        if (suggestedPlanTypeId != null) {
                            break;
                            break;
                        }
                    }
                    jv1.e eVar4 = new jv1.e(true, nVar2, (vt1.n) next, null, null, jVar3.getSuggestedRaceTime(), false, false, numZ4, null, 728, null);
                    int i112 = h.S1;
                    jv1.s sVarI15 = hVar2.i6();
                    hVar2.k8(sVarI15 != null ? jv1.s.a(sVarI15, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, eVar4, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, 511) : null);
                    y0<g3<jv1.e>> y0VarM9 = hVar2.m6();
                    g3.f35298f.getClass();
                    y0VarM9.j(g3.a.d(eVar4));
                }
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                int i26 = h.S1;
                v2.a aVar6 = (v2.a) v2Var;
                hVar2.m6().j(g3.a.a(g3.f35298f, aVar6.f47385c, aVar6.f47383a, null, null, 12));
                String strD2 = com.airbnb.lottie.animation.keyframe.a.d(aVar6.f47383a, "Error calling checkCoachCaution ");
                i2.a aVar7 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar7.getClass();
                i2.a.f(a2Var2, "FBTPlanWizardViewModel", strD2);
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
