package kb0;

import android.content.DialogInterface;
import b63.v;
import c2.x2;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.PregnancyHistoryActivity;
import ds.e0;
import f72.kb;
import i3.i7;
import i3.ve;
import java.util.List;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.x;
import p3.x1;
import zb0.k1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103772a;

    public /* synthetic */ f(int i14) {
        this.f103772a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f103772a;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g gVar = g.f103773a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    v vVar = new v(22, 0, 0, 0, 12, null);
                    v vVar2 = new v(6, 0, 0, 0, 12, null);
                    mb0.h hVar = mb0.h.MONDAY;
                    mb0.c cVar = mb0.c.SELECTED;
                    mb0.b bVar = new mb0.b(hVar, cVar);
                    mb0.h hVar2 = mb0.h.TUESDAY;
                    mb0.c cVar2 = mb0.c.UNSELECTED;
                    mb0.b bVar2 = new mb0.b(hVar2, cVar2);
                    mb0.b bVar3 = new mb0.b(mb0.h.WEDNESDAY, cVar);
                    mb0.h hVar3 = mb0.h.THURSDAY;
                    mb0.c cVar3 = mb0.c.ALREADY_SELECTED_NOT_CLICKABLE;
                    List listK = x.k(bVar, bVar2, bVar3, new mb0.b(hVar3, cVar3), new mb0.b(mb0.h.FRIDAY, cVar2), new mb0.b(mb0.h.SATURDAY, mb0.c.ALREADY_SELECTED_CLICKABLE), new mb0.b(mb0.h.SUNDAY, cVar3));
                    Object objQ = mVar.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new d(3);
                        mVar.K(objQ);
                    }
                    e23.l lVar = (e23.l) objQ;
                    Object objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new d(4);
                        mVar.K(objQ2);
                    }
                    e23.l lVar2 = (e23.l) objQ2;
                    Object objQ3 = mVar.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new d(5);
                        mVar.K(objQ3);
                    }
                    e23.l lVar3 = (e23.l) objQ3;
                    Object objQ4 = mVar.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new k62.l(18);
                        mVar.K(objQ4);
                    }
                    e23.a aVar2 = (e23.a) objQ4;
                    Object objQ5 = mVar.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new d(6);
                        mVar.K(objQ5);
                    }
                    e23.l lVar4 = (e23.l) objQ5;
                    Object objQ6 = mVar.q();
                    if (objQ6 == c2565a) {
                        objQ6 = new k62.l(19);
                        mVar.K(objQ6);
                    }
                    e23.a aVar3 = (e23.a) objQ6;
                    Object objQ7 = mVar.q();
                    if (objQ7 == c2565a) {
                        objQ7 = new k62.l(16);
                        mVar.K(objQ7);
                    }
                    e23.a aVar4 = (e23.a) objQ7;
                    Object objQ8 = mVar.q();
                    if (objQ8 == c2565a) {
                        objQ8 = new k62.l(17);
                        mVar.K(objQ8);
                    }
                    m.a(true, vVar, vVar2, listK, false, null, lVar, lVar2, lVar3, aVar2, lVar4, aVar3, aVar4, (e23.a) objQ8, mVar, 920346630, 3510);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                h hVar4 = h.f103777a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = kb.a(t62.c.f162799a);
                    long jB = e0.b(d92.b.f58623a, mVar2);
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58625c.getClass();
                    j92.c cVar4 = j92.b.f97901d;
                    i7.b(dVarA, null, x2.u(x2.h(aVar5, cVar4.f97905d), cVar4.f97905d), jB, mVar2, 48, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                h hVar5 = h.f103777a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = v62.f.a(t62.b.f162798a);
                    long jB2 = e0.b(d92.b.f58623a, mVar3);
                    h4.r.a aVar6 = h4.r.S;
                    d92.b.f58625c.getClass();
                    j92.c cVar5 = j92.b.f97901d;
                    i7.b(dVarA2, null, x2.u(x2.h(aVar6, cVar5.f97905d), cVar5.f97905d), jB2, mVar3, 48, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                boolean z14 = false;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                h hVar6 = h.f103777a;
                if ((iIntValue4 & 3) != 2) {
                    z14 = true;
                }
                if (mVar4.n(iIntValue4 & 1, z14)) {
                    x1 x1Var4 = p3.n.f135158a;
                    v vVar3 = new v(23, 0, 0, 0, 12, null);
                    v vVar4 = new v(8, 0, 0, 0, 12, null);
                    z80.h.a aVar7 = new z80.h.a(true);
                    Object objQ9 = mVar4.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ9 == c2565a2) {
                        objQ9 = new d(7);
                        mVar4.K(objQ9);
                    }
                    e23.l lVar5 = (e23.l) objQ9;
                    Object objQ10 = mVar4.q();
                    if (objQ10 == c2565a2) {
                        objQ10 = new d(8);
                        mVar4.K(objQ10);
                    }
                    e23.l lVar6 = (e23.l) objQ10;
                    Object objQ11 = mVar4.q();
                    if (objQ11 == c2565a2) {
                        objQ11 = new k62.l(20);
                        mVar4.K(objQ11);
                    }
                    e23.a aVar8 = (e23.a) objQ11;
                    Object objQ12 = mVar4.q();
                    if (objQ12 == c2565a2) {
                        objQ12 = new k62.l(21);
                        mVar4.K(objQ12);
                    }
                    e23.a aVar9 = (e23.a) objQ12;
                    Object objQ13 = mVar4.q();
                    if (objQ13 == c2565a2) {
                        objQ13 = new k62.l(22);
                        mVar4.K(objQ13);
                    }
                    o.a(vVar3, vVar4, "", aVar7, lVar5, lVar6, aVar8, aVar9, (e23.a) objQ13, mVar4, 115040640);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                h hVar7 = h.f103777a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    ve.a(x2.d(h4.r.S, 1.0f), null, tn.k.a(d92.b.f58623a, mVar5), 0L, 0.0f, 0.0f, null, h.f103780d, mVar5, 12582918, 122);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                i iVar = i.f103781a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA3 = kb.a(t62.c.f162799a);
                    long jB3 = e0.b(d92.b.f58623a, mVar6);
                    h4.r.a aVar10 = h4.r.S;
                    d92.b.f58625c.getClass();
                    j92.c cVar6 = j92.b.f97901d;
                    i7.b(dVarA3, null, x2.u(x2.h(aVar10, cVar6.f97905d), cVar6.f97905d), jB3, mVar6, 48, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                i iVar2 = i.f103781a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA4 = v62.f.a(t62.b.f162798a);
                    long jB4 = e0.b(d92.b.f58623a, mVar7);
                    h4.r.a aVar11 = h4.r.S;
                    d92.b.f58625c.getClass();
                    j92.c cVar7 = j92.b.f97901d;
                    i7.b(dVarA4, null, x2.u(x2.h(aVar11, cVar7.f97905d), cVar7.f97905d), jB4, mVar7, 48, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                i iVar3 = i.f103781a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    v vVar5 = new v(22, 0, 0, 0, 12, null);
                    v vVar6 = new v(6, 0, 0, 0, 12, null);
                    z80.h.a aVar12 = new z80.h.a(true);
                    Object objQ14 = mVar8.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                    if (objQ14 == c2565a3) {
                        objQ14 = new d(9);
                        mVar8.K(objQ14);
                    }
                    e23.l lVar7 = (e23.l) objQ14;
                    Object objQ15 = mVar8.q();
                    if (objQ15 == c2565a3) {
                        objQ15 = new d(10);
                        mVar8.K(objQ15);
                    }
                    e23.l lVar8 = (e23.l) objQ15;
                    Object objQ16 = mVar8.q();
                    if (objQ16 == c2565a3) {
                        objQ16 = new d(11);
                        mVar8.K(objQ16);
                    }
                    e23.l lVar9 = (e23.l) objQ16;
                    Object objQ17 = mVar8.q();
                    if (objQ17 == c2565a3) {
                        objQ17 = new k62.l(23);
                        mVar8.K(objQ17);
                    }
                    e23.a aVar13 = (e23.a) objQ17;
                    Object objQ18 = mVar8.q();
                    if (objQ18 == c2565a3) {
                        objQ18 = new k62.l(24);
                        mVar8.K(objQ18);
                    }
                    q.a(vVar5, vVar6, aVar12, lVar7, lVar8, lVar9, aVar13, (e23.a) objQ18, mVar8, 14380032);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                i iVar4 = i.f103781a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    ve.a(x2.d(h4.r.S, 1.0f), null, tn.k.a(d92.b.f58623a, mVar9), 0L, 0.0f, 0.0f, null, i.f103784d, mVar9, 12582918, 122);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                PregnancyHistoryActivity.a aVar14 = PregnancyHistoryActivity.f40886b;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 10:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.a aVar15 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.f40906o;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                return Unit.INSTANCE;
            case 11:
                DialogInterface dialogInterface3 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.a aVar16 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.f40906o;
                dialogInterface3.getClass();
                dialogInterface3.dismiss();
                return Unit.INSTANCE;
            case 12:
                DialogInterface dialogInterface4 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.a aVar17 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.f40906o;
                dialogInterface4.getClass();
                dialogInterface4.dismiss();
                return Unit.INSTANCE;
            case 13:
                Scope scope = (Scope) obj;
                kc0.b bVar4 = kc0.b.f103923a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                return new ii1.k((ii1.d) scope.get((k23.d<?>) s0.f105811a.b(ii1.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 14:
                Scope scope2 = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                kc0.b bVar5 = kc0.b.f103923a;
                scope2.getClass();
                parametersHolder.getClass();
                t0 t0Var = s0.f105811a;
                return new ki1.l(((Number) parametersHolder.elementAt(0, t0Var.b(Long.class))).longValue(), new ii1.c((rd2.f) scope2.get((k23.d<?>) t0Var.b(rd2.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 2, null), new ii1.e((l80.b) scope2.get((k23.d<?>) t0Var.b(l80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null)), (hi1.e) scope2.get((k23.d<?>) t0Var.b(hi1.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new ii1.f((gi1.a) scope2.get((k23.d<?>) t0Var.b(gi1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 2, null), (ji1.b) scope2.get((k23.d<?>) t0Var.b(ji1.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ii1.m) scope2.get((k23.d<?>) t0Var.b(ii1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ii1.k) scope2.get((k23.d<?>) t0Var.b(ii1.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hi1.a) scope2.get((k23.d<?>) t0Var.b(hi1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 15:
                kc0.b bVar6 = kc0.b.f103923a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (rc0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, rc0.a.class, new c83.h.a[0], null, null, null, 120);
            case 16:
                kc0.b bVar7 = kc0.b.f103923a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new jg1.c();
            case 17:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                kc0.b bVar8 = kc0.b.f103923a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                return new zi1.e(((Number) parametersHolder2.elementAt(0, s0.f105811a.b(Long.class))).longValue());
            case 18:
                Scope scope3 = (Scope) obj;
                kc0.b bVar9 = kc0.b.f103923a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                return new rg1.h((qg1.a) scope3.get((k23.d<?>) s0.f105811a.b(qg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 19:
                Scope scope4 = (Scope) obj;
                kc0.b bVar10 = kc0.b.f103923a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                return new tc0.d((rc0.a) scope4.get((k23.d<?>) s0.f105811a.b(rc0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 20:
                Scope scope5 = (Scope) obj;
                kc0.b bVar11 = kc0.b.f103923a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                return new l22.a(ModuleExtKt.androidContext(scope5));
            case 21:
                Scope scope6 = (Scope) obj;
                kc0.b bVar12 = kc0.b.f103923a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                return new k1((l22.b) scope6.get((k23.d<?>) s0.f105811a.b(l22.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 22:
                Scope scope7 = (Scope) obj;
                kc0.b bVar13 = kc0.b.f103923a;
                scope7.getClass();
                ((ParametersHolder) obj2).getClass();
                return new ug1.c((rg1.a) scope7.get((k23.d<?>) s0.f105811a.b(rg1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), fj1.b.a.a(fj1.b.f71828c));
            case 23:
                kc0.b bVar14 = kc0.b.f103923a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (qg1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, qg1.a.class, new c83.h.a[0], null, null, null, 120);
            case 24:
                Scope scope8 = (Scope) obj;
                kc0.b bVar15 = kc0.b.f103923a;
                scope8.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var2 = s0.f105811a;
                return new qc0.d((k1) scope8.get((k23.d<?>) t0Var2.b(k1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tc0.a) scope8.get((k23.d<?>) t0Var2.b(tc0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 25:
                Scope scope9 = (Scope) obj;
                kc0.b bVar16 = kc0.b.f103923a;
                scope9.getClass();
                ((ParametersHolder) obj2).getClass();
                return new gi1.b((f12.l) scope9.get((k23.d<?>) s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 26:
                kc0.b bVar17 = kc0.b.f103923a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new hi1.a();
            case 27:
                Scope scope10 = (Scope) obj;
                kc0.b bVar18 = kc0.b.f103923a;
                scope10.getClass();
                ((ParametersHolder) obj2).getClass();
                return new ji1.a(ModuleExtKt.androidContext(scope10), (mv0.e) scope10.get((k23.d<?>) s0.f105811a.b(mv0.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 28:
                Scope scope11 = (Scope) obj;
                kc0.b bVar19 = kc0.b.f103923a;
                scope11.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var3 = s0.f105811a;
                return new ji1.b((ji1.a) scope11.get((k23.d<?>) t0Var3.b(ji1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (mv0.e) scope11.get((k23.d<?>) t0Var3.b(mv0.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
            default:
                Scope scope12 = (Scope) obj;
                kc0.b bVar20 = kc0.b.f103923a;
                scope12.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var4 = s0.f105811a;
                return new hi1.e((ji1.b) scope12.get((k23.d<?>) t0Var4.b(ji1.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), new ii1.g((gi1.a) scope12.get((k23.d<?>) t0Var4.b(gi1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 2, null));
        }
    }
}
