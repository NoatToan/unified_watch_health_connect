package pv1;

import com.garmin.android.apps.connectmobile.g3;
import e23.p;
import jv1.y;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$fetchTrainingLevelRecommendation$1", f = "FBTEditPreferencesViewModel.kt", l = {1329}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jv1.m f141498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f141499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f141500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f141501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vt1.o f141502e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, vt1.o oVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f141501d = bVar;
        this.f141502e = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f141501d, this.f141502e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ?? r14;
        jv1.m mVar;
        fg0.k kVar;
        fg0.d completionTarget;
        tw1.k kVarJ;
        double dG;
        Double recentWeeklyAvgValue;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141500c;
        boolean zG = false;
        b bVar = this.f141501d;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = bVar.f141489a1;
            p2 p2Var2 = bVar.N0;
            p2Var.k(null, g3.a.c(g3.f35298f));
            mv1.a aVar2 = (mv1.a) p2Var2.getValue();
            jv1.m mVar2 = (aVar2 == null || (kVar = aVar2.f121169g) == null || (completionTarget = kVar.getCompletionTarget()) == null) ? null : new jv1.m(completionTarget.getValue(), completionTarget.getUnit(), completionTarget.getUnitType());
            mv1.a aVar3 = (mv1.a) p2Var2.getValue();
            ?? r15 = aVar3 != null ? aVar3.f121165c : 0;
            this.f141498a = mVar2;
            this.f141499b = r15;
            this.f141500c = 1;
            Object objS5 = bVar.s5(this.f141502e, this);
            if (objS5 == aVar) {
                return aVar;
            }
            r14 = r15;
            obj = objS5;
            mVar = mVar2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i15 = this.f141499b;
            mVar = this.f141498a;
            r.b(obj);
            r14 = i15;
        }
        y yVar = (y) obj;
        if (r14 == 0) {
            zG = true;
        } else if (yVar != null) {
            zG = s.g(yVar.getHasMinimumHistory(), Boolean.TRUE);
        }
        if (zG) {
            double dDoubleValue = 0.0d;
            if (r14 == 0 && mVar != null) {
                og0.a aVar4 = og0.a.f131967a;
                Double d14 = mVar.f101076a;
                double dDoubleValue2 = d14 != null ? d14.doubleValue() : 0.0d;
                gg0.i iVar = mVar.f101077b;
                if (iVar == null) {
                    iVar = gg0.i.METER;
                }
                aVar4.getClass();
                dG = og0.a.g(dDoubleValue2, iVar);
            } else {
                dG = 0.0d;
            }
            hv1.j.a aVar5 = hv1.j.f85874d;
            if (yVar != null && (recentWeeklyAvgValue = yVar.getRecentWeeklyAvgValue()) != null) {
                dDoubleValue = recentWeeklyAvgValue.doubleValue();
            }
            aVar5.getClass();
            hv1.j jVarB = hv1.j.a.b(dDoubleValue);
            if (jVarB == null) {
                jVarB = hv1.j.ZERO;
            }
            int iB = (jVarB == hv1.j.TWENTY_FIVE_PLUS || jVarB == hv1.j.FORTY_PLUS_KM) ? 26 : jVarB.b();
            tu1.i.f166483a.getClass();
            kVarJ = tu1.i.a.j(dG, iB);
        } else {
            kVarJ = null;
        }
        p2 p2Var3 = bVar.f141489a1;
        g3.f35298f.getClass();
        p2Var3.k(null, g3.a.d(kVarJ));
        return Unit.INSTANCE;
    }
}
