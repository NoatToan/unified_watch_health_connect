package lp1;

import am.b2;
import am.d2;
import aq.f3;
import aq.h3;
import lc.u0;
import org.joda.time.DateTimeComparator;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114138a;

    public /* synthetic */ d(int i14) {
        this.f114138a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f114138a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e eVar = e.f114139a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, e.f114140b, mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                f fVar = f.f114142a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                Scope scope = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                lq1.b bVar = lq1.b.f114333a;
                scope.getClass();
                parametersHolder.getClass();
                t0 t0Var = s0.f105811a;
                return new rq1.c(new nq1.i((r53.i) parametersHolder.elementAt(0, t0Var.b(r53.i.class)), new ae0.b(), new ae0.d(), new or1.c(), (ae0.f) Scope.get$default(scope, t0Var.b(ae0.f.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (bv.d) Scope.get$default(scope, t0Var.b(bv.d.class), (Qualifier) null, (e23.a) null, 6, (Object) null)));
            case 3:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                lq1.b bVar2 = lq1.b.f114333a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                return new qq1.c((rq1.c) parametersHolder2.elementAt(0, s0.f105811a.b(rq1.c.class)));
            case 4:
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                lq1.b bVar3 = lq1.b.f114333a;
                ((Scope) obj).getClass();
                parametersHolder3.getClass();
                r53.i iVar = (r53.i) parametersHolder3.elementAt(0, s0.f105811a.b(r53.i.class));
                f12.l.f68084a.getClass();
                f12.l lVarA = f12.l.a.a();
                return new rq1.a(new nq1.h(iVar, new ae0.b(), new ae0.e(lVarA.B3() ? "PUSHES" : "STEPS", false, 2, null), lVarA));
            case 5:
                ParametersHolder parametersHolder4 = (ParametersHolder) obj2;
                lq1.b bVar4 = lq1.b.f114333a;
                ((Scope) obj).getClass();
                parametersHolder4.getClass();
                return new qq1.j((rq1.a) parametersHolder4.elementAt(0, s0.f105811a.b(rq1.a.class)));
            case 6:
                ParametersHolder parametersHolder5 = (ParametersHolder) obj2;
                lq1.b bVar5 = lq1.b.f114333a;
                ((Scope) obj).getClass();
                parametersHolder5.getClass();
                r53.i iVar2 = (r53.i) parametersHolder5.elementAt(0, s0.f105811a.b(r53.i.class));
                f12.l.f68084a.getClass();
                f12.l lVarA2 = f12.l.a.a();
                return new rq1.b(new nq1.h(iVar2, new ae0.b(), new ae0.e(lVarA2.B3() ? "PUSHES" : "STEPS", false, 2, null), lVarA2));
            case 7:
                ParametersHolder parametersHolder6 = (ParametersHolder) obj2;
                lq1.b bVar6 = lq1.b.f114333a;
                ((Scope) obj).getClass();
                parametersHolder6.getClass();
                return new qq1.a((rq1.b) parametersHolder6.elementAt(0, s0.f105811a.b(rq1.b.class)));
            case 8:
                Scope scope2 = (Scope) obj;
                lq1.b bVar7 = lq1.b.f114333a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var2 = s0.f105811a;
                return new yq1.e((kq1.a) scope2.get((k23.d<?>) t0Var2.b(kq1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new is1.e(null, 1, null), (o91.a) scope2.get((k23.d<?>) t0Var2.b(o91.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), sq1.b.f160529b, new hq1.b((f12.l) scope2.get((k23.d<?>) t0Var2.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)));
            case 9:
                lq1.c cVar = lq1.c.f114335a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (iq1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, iq1.a.class, new c83.h.a[0], null, null, null, 88);
            case 10:
                Scope scope3 = (Scope) obj;
                lq1.c cVar2 = lq1.c.f114335a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                return new kq1.g((iq1.a) scope3.get((k23.d<?>) s0.f105811a.b(iq1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 11:
                Scope scope4 = (Scope) obj;
                lq1.c cVar3 = lq1.c.f114335a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                return new hq1.b((f12.l) Scope.get$default(scope4, s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
            case 12:
                Scope scope5 = (Scope) obj;
                lr.b bVar8 = lr.b.f114367a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                return (iz0.a) Scope.get$default(scope5, s0.f105811a.b(iz0.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null);
            case 13:
                lr.b bVar9 = lr.b.f114367a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return rd2.f.a();
            case 14:
                lr.b bVar10 = lr.b.f114367a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return am.b.M();
            case 15:
                lr.b bVar11 = lr.b.f114367a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (ko1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ko1.a.class, new c83.h.a[0], null, null, null, 120);
            case 16:
                lr.b bVar12 = lr.b.f114367a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return DateTimeComparator.getInstance();
            case 17:
                lr.b bVar13 = lr.b.f114367a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return ht.a.f85464a;
            case 18:
                Scope scope6 = (Scope) obj;
                lr.b bVar14 = lr.b.f114367a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var3 = s0.f105811a;
                return new am.m((b2) scope6.get((k23.d<?>) t0Var3.b(b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (d2) scope6.get((k23.d<?>) t0Var3.b(d2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kr.g) scope6.get((k23.d<?>) t0Var3.b(kr.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kr.f) scope6.get((k23.d<?>) t0Var3.b(kr.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 19:
                Scope scope7 = (Scope) obj;
                lr.b bVar15 = lr.b.f114367a;
                scope7.getClass();
                ((ParametersHolder) obj2).getClass();
                return new fo1.f((ko1.a) scope7.get((k23.d<?>) s0.f105811a.b(ko1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 20:
                Scope scope8 = (Scope) obj;
                lr.b bVar16 = lr.b.f114367a;
                scope8.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var4 = s0.f105811a;
                return new pc0.j((ac0.c) scope8.get((k23.d<?>) t0Var4.b(ac0.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ic0.b) scope8.get((k23.d<?>) t0Var4.b(ic0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope8.get((k23.d<?>) t0Var4.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.b) scope8.get((k23.d<?>) t0Var4.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.i) scope8.get((k23.d<?>) t0Var4.b(pc0.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.a) scope8.get((k23.d<?>) t0Var4.b(l80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l80.b) scope8.get((k23.d<?>) t0Var4.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (a31.e) scope8.get((k23.d<?>) t0Var4.b(a31.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 21:
                Scope scope9 = (Scope) obj;
                lr.b bVar17 = lr.b.f114367a;
                scope9.getClass();
                ((ParametersHolder) obj2).getClass();
                return new kr.e((kr.a) scope9.get((k23.d<?>) s0.f105811a.b(kr.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 22:
                Scope scope10 = (Scope) obj;
                lr.b bVar18 = lr.b.f114367a;
                scope10.getClass();
                ((ParametersHolder) obj2).getClass();
                return new h3((f3) scope10.get((k23.d<?>) s0.f105811a.b(f3.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 23:
                Scope scope11 = (Scope) obj;
                lr.b bVar19 = lr.b.f114367a;
                scope11.getClass();
                ((ParametersHolder) obj2).getClass();
                return new zf0.d((zf0.b) scope11.get((k23.d<?>) s0.f105811a.b(zf0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 24:
                lr.b bVar20 = lr.b.f114367a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new am.x1();
            case 25:
                Scope scope12 = (Scope) obj;
                lr.b bVar21 = lr.b.f114367a;
                scope12.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var5 = s0.f105811a;
                return new vo1.c((vo1.a) scope12.get((k23.d<?>) t0Var5.b(vo1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b2) scope12.get((k23.d<?>) t0Var5.b(b2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 26:
                lr.b bVar22 = lr.b.f114367a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (ac0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ac0.c.class, new c83.h.a[0], null, null, null, 120);
            case 27:
                lr.b bVar23 = lr.b.f114367a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return u0.g(d60.b.f57806c);
            case 28:
                lr.b bVar24 = lr.b.f114367a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                a22.i.f537b.getClass();
                return a22.i.a.a();
            default:
                Scope scope13 = (Scope) obj;
                lr.b bVar25 = lr.b.f114367a;
                scope13.getClass();
                ((ParametersHolder) obj2).getClass();
                return new cw.s((cw.r) scope13.get((k23.d<?>) s0.f105811a.b(cw.r.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
        }
    }
}
