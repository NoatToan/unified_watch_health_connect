package w52;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import i3.ve;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182577a;

    public /* synthetic */ k(int i14) {
        this.f182577a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f182577a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l lVar = l.f182602a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = v62.j1.a(t62.b.f162798a);
                    long jA = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar);
                    String strQ = gl1.y.Q(mVar, R.string.workout_step_notes);
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA, strQ, x2.q(aVar, j92.b.f97901d.f97904c), jA, mVar, 0, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                o.c((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                y.c((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                y.i((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                d0.b((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                m0.b((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 6:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                w61.b bVar = w61.b.f183149a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    ub1.l lVarU = zd0.g1.u((zd0.g1) KoinJavaComponent.get$default(zd0.g1.class, null, null, 6, null), c80.s0.TRAINING_STATUS, null, 6);
                    if (lVarU == null) {
                        mVar2.C(-397533106);
                    } else {
                        mVar2.C(-428465645);
                        h4.r.a aVar2 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        lVarU.a(c2.l.y(aVar2, j92.b.f97899b.f97920e), mVar2, 0);
                    }
                    mVar2.f();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                w61.b bVar2 = w61.b.f183149a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, w61.b.f183150b, mVar3, 196608, 31);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 8:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                w71.a aVar3 = w71.a.f183510a;
                ((Scope) obj).getClass();
                parametersHolder.getClass();
                return new f81.a(new x71.d((r53.i) parametersHolder.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(r53.i.class))));
            case 9:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                w71.a aVar4 = w71.a.f183510a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                return new e81.b((f81.a) parametersHolder2.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(f81.a.class)));
            case 10:
                w71.b bVar3 = w71.b.f183512a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (u71.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, u71.a.class, new c83.h.a[0], null, null, null, 88);
            case 11:
                w71.b bVar4 = w71.b.f183512a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (u71.b) ez0.b.a(ez0.b.f67468a, ez0.c.GC, u71.b.class, new c83.h.a[0], null, null, null, 88);
            case 12:
                w71.b bVar5 = w71.b.f183512a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new v71.f();
            case 13:
                Scope scope = (Scope) obj;
                w71.b bVar6 = w71.b.f183512a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                return new v71.n((u71.b) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(u71.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 14:
                w71.b bVar7 = w71.b.f183512a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new y71.b();
            case 15:
                Scope scope2 = (Scope) obj;
                w71.b bVar8 = w71.b.f183512a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                l22.a aVar5 = new l22.a(ModuleExtKt.androidApplication(scope2));
                pi0.e eVar = new pi0.e(ModuleExtKt.androidApplication(scope2));
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                v71.a aVar6 = (v71.a) scope2.get((k23.d<?>) t0Var.b(v71.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                v71.k kVar = (v71.k) scope2.get((k23.d<?>) t0Var.b(v71.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                r71.a aVar7 = (r71.a) scope2.get((k23.d<?>) t0Var.b(r71.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                y71.b bVar9 = (y71.b) scope2.get((k23.d<?>) t0Var.b(y71.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                bv.b.f21239a.getClass();
                bv.b.a();
                return new i81.a(aVar5, eVar, aVar6, kVar, aVar7, bVar9, com.garmin.android.apps.connectmobile.k1.f37122a);
            case 16:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                wa0.a aVar8 = wa0.a.f183760a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    Object objQ = mVar4.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new w72.f(19);
                        mVar4.K(objQ);
                    }
                    wa0.b.b((e23.a) objQ, mVar4, 6);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                wa0.a aVar9 = wa0.a.f183760a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    ve.a(x2.d(h4.r.S, 1.0f), null, tn.k.a(d92.b.f58623a, mVar5), 0L, 0.0f, 0.0f, null, wa0.a.f183762c, mVar5, 12582918, 122);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new uf2.k();
            case 19:
                Scope scope3 = (Scope) obj;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                return new vf2.n((vf2.k) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(vf2.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 20:
                Scope scope4 = (Scope) obj;
                wf2.c cVar = wf2.c.f185026a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                return new nf2.a(ModuleExtKt.androidContext(scope4));
            case 21:
                Scope scope5 = (Scope) obj;
                wf2.c cVar2 = wf2.c.f185026a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                return new dg2.a(ModuleExtKt.androidContext(scope5));
            case 22:
                Scope scope6 = (Scope) obj;
                wf2.c cVar3 = wf2.c.f185026a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                return new fg2.b(ModuleExtKt.androidContext(scope6));
            case 23:
                wf2.c cVar4 = wf2.c.f185026a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new bg2.i();
            case 24:
                Scope scope7 = (Scope) obj;
                wf2.c cVar5 = wf2.c.f185026a;
                scope7.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                return new com.garmin.android.livesessionview.a((uf2.q0) scope7.get((k23.d<?>) t0Var2.b(uf2.q0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (of2.c0) scope7.get((k23.d<?>) t0Var2.b(of2.c0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 25:
                wf2.c cVar6 = wf2.c.f185026a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new bh2.d();
            case 26:
                wf2.c cVar7 = wf2.c.f185026a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new wf2.c.a();
            case 27:
                wf2.c cVar8 = wf2.c.f185026a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new bh2.c();
            case 28:
                wf2.c cVar9 = wf2.c.f185026a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new bh2.b(null, 1, null);
            default:
                wf2.c cVar10 = wf2.c.f185026a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new zg2.i();
        }
    }

    public /* synthetic */ k(int i14, int i15) {
        this.f182577a = i15;
    }
}
