package t21;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.k3;
import c2.q3;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import o4.m1;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p3.x1;
import sk0.r1;
import v62.o1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161848a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        long jB;
        int i14 = this.f161848a;
        int i15 = 21;
        int i16 = 23;
        int i17 = 22;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                d dVar = d.f161852a;
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    i7.b(v62.e1.a(t62.b.f162798a), gl1.y.Q(mVar, R.string.selected), null, fb1.c.g(d92.b.f58623a, mVar), mVar, 0, 4);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                d dVar2 = d.f161852a;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    u21.c cVar = new u21.c("", null, false, true, s21.a.ACTIVITY_MULTIPLIER, l01.a.MODERATELY_ACTIVE, 6, null);
                    v21.e eVar = new v21.e((Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b));
                    Object objQ = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new r1(i15);
                        mVar2.K(objQ);
                    }
                    e23.l lVar = (e23.l) objQ;
                    Object objQ2 = mVar2.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new r1(i17);
                        mVar2.K(objQ2);
                    }
                    e23.l lVar2 = (e23.l) objQ2;
                    Object objQ3 = mVar2.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new r1(i16);
                        mVar2.K(objQ3);
                    }
                    e23.l lVar3 = (e23.l) objQ3;
                    Object objQ4 = mVar2.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new sk0.i0(28);
                        mVar2.K(objQ4);
                    }
                    e23.a aVar2 = (e23.a) objQ4;
                    Object objQ5 = mVar2.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new sk0.i0(29);
                        mVar2.K(objQ5);
                    }
                    b.c(cVar, eVar, lVar, lVar2, lVar3, aVar2, (e23.a) objQ5, mVar2, 1797504);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                g gVar = g.f161870a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    u21.l0 l0Var = new u21.l0(0, 0.0d, 0, 0.0d, 0, 0.0d, 0, 127, null);
                    v21.e eVar2 = new v21.e((Context) mVar3.A(AndroidCompositionLocals_androidKt.f6042b));
                    Object objQ6 = mVar3.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ6 == c2565a2) {
                        objQ6 = new r1(24);
                        mVar3.K(objQ6);
                    }
                    e23.l lVar4 = (e23.l) objQ6;
                    Object objQ7 = mVar3.q();
                    if (objQ7 == c2565a2) {
                        objQ7 = new r1(25);
                        mVar3.K(objQ7);
                    }
                    e23.l lVar5 = (e23.l) objQ7;
                    Object objQ8 = mVar3.q();
                    if (objQ8 == c2565a2) {
                        objQ8 = new r1(26);
                        mVar3.K(objQ8);
                    }
                    e23.l lVar6 = (e23.l) objQ8;
                    Object objQ9 = mVar3.q();
                    if (objQ9 == c2565a2) {
                        objQ9 = new f(0);
                        mVar3.K(objQ9);
                    }
                    e23.a aVar3 = (e23.a) objQ9;
                    Object objQ10 = mVar3.q();
                    if (objQ10 == c2565a2) {
                        objQ10 = new f(1);
                        mVar3.K(objQ10);
                    }
                    m.a(l0Var, eVar2, lVar4, lVar5, lVar6, aVar3, (e23.a) objQ10, mVar3, 1797504);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                h hVar = h.f161878a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    h0.b(new u21.i(i53.a.a(new s21.m.b(R.string.lbl_show, "SHOWN"), new s21.m.c(new s21.n(true, "vitamin_c", "Vitamin C", Double.valueOf(75.0d), "mg", 1)), new s21.m.c(new s21.n(true, "vitamin_d", "Vitamin D", Double.valueOf(600.0d), "IU", 2)), new s21.m.b(R.string.lbl_hide, "HIDE"), new s21.m.c(new s21.n(false, "calcium", "Calcium", Double.valueOf(1000.0d), "mg", 3))), null, false, null, null, 30, null), null, null, null, null, null, null, null, null, mVar4, 0, 510);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                i iVar = i.f161891a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    t4.d dVarA = n5.c.a(R.drawable.ic_exclamation, mVar5, 0);
                    h4.r.a aVar4 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar2 = j92.b.f97901d;
                    i7.a(dVarA, null, u1.n.e(l4.k.b(x2.u(x2.h(aVar4, cVar2.f97903b), cVar2.f97903b), k2.i.f102406a), d92.b.a(mVar5).f().f(), m1.f128891a), d92.b.a(mVar5).f().f63508c, mVar5, 48, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                i iVar2 = i.f161891a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    boolean z14 = false;
                    m0.f(new u21.s(false, true, s21.c.TIMELINE, false, false, false, p13.x.k(new s21.k(1, "Breakfast", true, false, new s21.l(new b63.v(7, 0, 0, 0, 12, null), new b63.v(8, 0, 0, 0, 12, null)), false, null, null, 232, null), new s21.k(2, "Lunch", true, false, new s21.l(new b63.v(11, 0, 0, 0, 12, null), new b63.v(12, 0, 0, 0, 12, null)), false, null, null, 232, null), new s21.k(3, "Dinner", true, z14, new s21.l(new b63.v(19, 0, 0, 0, 12, null), new b63.v(20, 0, 0, 0, 12, null)), false, null, Integer.valueOf(R.string.msg_meal_windows_overlapping_error), 104, null), new s21.k(4, "Custom Meal 1", z14, false, null, false, null, null, 168, null), new s21.k(5, "Snacks", true, false, null, false, null == true ? 1 : 0, null, 248, null)), new s21.e0(new b63.v(0, 0, 0, 0, 12, null), null, null, null, 14, null), new s21.e0(new b63.v(23, 59, 0, 0, 12, null), null, null, null, 14, null), null, false, false, false, false, false, null, 65081, null), new v21.e((Context) mVar6.A(AndroidCompositionLocals_androidKt.f6042b)), null, null, null, null, null, null, mVar6, 0, 252);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                i iVar3 = i.f161891a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    boolean z15 = false;
                    m0.f(new u21.s(false, true, s21.c.CLASSIC, false, false, false, p13.x.k(new s21.k(1, "Breakfast", true, false, null, false, null, null, 248, null), new s21.k(2, "Lunch", true, false, null, false, null == true ? 1 : 0, null, 248, null), new s21.k(3, "Dinner", true, z15, null, false, null == true ? 1 : 0, null, 248, null), new s21.k(4, "Custom Meal 1", z15, false, null, false, null == true ? 1 : 0, null, 248, null), new s21.k(5, "Snacks", true, false, null, false, null == true ? 1 : 0, null, 248, null)), new s21.e0(new b63.v(0, 0, 0, 0, 12, null), null, null, null, 14, null), new s21.e0(new b63.v(23, 59, 0, 0, 12, null), null, null, null, 14, null), null, false, false, false, false, false, null, 65081, null), new v21.e((Context) mVar7.A(AndroidCompositionLocals_androidKt.f6042b)), null, null, null, null, null, null, mVar7, 0, 252);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                j jVar = j.f161905a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                m0.d((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 10:
                t51.a aVar5 = t51.a.f162546a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (y51.g) ez0.b.a(ez0.b.f67468a, ez0.c.GC, y51.g.class, new c83.h.a[0], null, null, null, 88);
            case 11:
                Scope scope = (Scope) obj;
                t51.a aVar6 = t51.a.f162546a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                return new y51.f((y51.g) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(y51.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 2, null);
            case 12:
                Scope scope2 = (Scope) obj;
                t51.a aVar7 = t51.a.f162546a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                return new u51.b((pc0.j) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 2, null);
            case 13:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                t51.b bVar = t51.b.f162548a;
                ((Scope) obj).getClass();
                parametersHolder.getClass();
                return new gn.r((j70.d) parametersHolder.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(j70.d.class)));
            case 14:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                t51.b bVar2 = t51.b.f162548a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                j70.d dVar3 = (j70.d) parametersHolder2.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(j70.d.class));
                pb2.a.d dVar4 = (pb2.a.d) dVar3.f97521b;
                if (dVar4 != null) {
                    return new hp.e(dVar3.f97520a, dVar4);
                }
                return null;
            case 15:
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                t51.b bVar3 = t51.b.f162548a;
                ((Scope) obj).getClass();
                parametersHolder3.getClass();
                return new gp.r((hp.e) parametersHolder3.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(hp.e.class)));
            case 16:
                ParametersHolder parametersHolder4 = (ParametersHolder) obj2;
                t51.b bVar4 = t51.b.f162548a;
                ((Scope) obj).getClass();
                parametersHolder4.getClass();
                return new hp.d((r53.i) parametersHolder4.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(r53.i.class)));
            case 17:
                ParametersHolder parametersHolder5 = (ParametersHolder) obj2;
                t51.b bVar5 = t51.b.f162548a;
                ((Scope) obj).getClass();
                parametersHolder5.getClass();
                return new gp.o((hp.d) parametersHolder5.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(hp.d.class)));
            case 18:
                Scope scope3 = (Scope) obj;
                t51.b bVar6 = t51.b.f162548a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                return new v51.b((f12.l) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 19:
                Scope scope4 = (Scope) obj;
                t51.b bVar7 = t51.b.f162548a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                return new u51.c((Context) scope4.get((k23.d<?>) t0Var.b(Context.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (v51.a) scope4.get((k23.d<?>) t0Var.b(v51.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 20:
                Scope scope5 = (Scope) obj;
                t51.b bVar8 = t51.b.f162548a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                return new w51.h0((y51.a) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(y51.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 21:
                Scope scope6 = (Scope) obj;
                ParametersHolder parametersHolder6 = (ParametersHolder) obj2;
                t51.b bVar9 = t51.b.f162548a;
                scope6.getClass();
                parametersHolder6.getClass();
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                String str = (String) parametersHolder6.elementAt(0, t0Var2.b(String.class));
                b63.o oVar = (b63.o) parametersHolder6.elementAt(1, t0Var2.b(b63.o.class));
                z51.h hVar2 = (z51.h) parametersHolder6.elementAt(2, t0Var2.b(z51.h.class));
                y51.a aVar8 = (y51.a) scope6.get((k23.d<?>) t0Var2.b(y51.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                u51.b bVar10 = (u51.b) scope6.get((k23.d<?>) t0Var2.b(u51.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                is1.e eVar3 = (is1.e) scope6.get((k23.d<?>) t0Var2.b(is1.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                u51.c cVar3 = (u51.c) scope6.get((k23.d<?>) t0Var2.b(u51.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                v51.a aVar9 = (v51.a) scope6.get((k23.d<?>) t0Var2.b(v51.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                bv.b.f21239a.getClass();
                bv.b.a();
                return new w51.q0(str, oVar, hVar2, aVar8, bVar10, eVar3, cVar3, aVar9, com.garmin.android.apps.connectmobile.k1.f37122a);
            case 22:
                t70.c cVar4 = t70.c.f162815a;
                ((i02.f) obj).getClass();
                ((i02.f) obj2).getClass();
                return 0;
            case 23:
                t70.c cVar5 = t70.c.f162815a;
                ((i02.f) obj).getClass();
                ((i02.f) obj2).getClass();
                return Boolean.TRUE;
            case 24:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                t70.c cVar6 = t70.c.f162815a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    Object objQ11 = mVar9.q();
                    aVar.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        objQ11 = new f(20);
                        mVar9.K(objQ11);
                    }
                    t70.s0.c(null, (e23.a) objQ11, mVar9, 48, 1);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 25:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                t70.c cVar7 = t70.c.f162815a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    Object objQ12 = mVar10.q();
                    aVar.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = new f(21);
                        mVar10.K(objQ12);
                    }
                    t70.s0.a((e23.a) objQ12, mVar10, 6);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 26:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                t70.c cVar8 = t70.c.f162815a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    Object objQ13 = mVar11.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                    if (objQ13 == c2565a3) {
                        objQ13 = new c(false ? (byte) 1 : (byte) 0, i17);
                        mVar11.K(objQ13);
                    }
                    e23.p pVar = (e23.p) objQ13;
                    Object objQ14 = mVar11.q();
                    if (objQ14 == c2565a3) {
                        objQ14 = new c(false ? (byte) 1 : (byte) 0, i16);
                        mVar11.K(objQ14);
                    }
                    i02.m mVarV = ge1.b.V(pVar, (e23.p) objQ14, mVar11, 390);
                    h4.r.a aVar10 = h4.r.S;
                    o70.t tVar = o70.t.f130077v;
                    String strD = tVar.d(w2.a0.s(mVar11), null);
                    u4.d dVarB = o70.t.b(tVar);
                    o4.d0 d0VarE = tVar.e(null, mVar11, 1);
                    if (d0VarE == null) {
                        mVar11.C(1376450546);
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(mVar11).f().b();
                        mVar11.f();
                    } else {
                        mVar11.C(1376448593);
                        mVar11.f();
                        jB = d0VarE.f128833a;
                    }
                    j53.j jVarB = j53.l.b();
                    Object objQ15 = mVar11.q();
                    if (objQ15 == c2565a3) {
                        objQ15 = new f(22);
                        mVar11.K(objQ15);
                    }
                    t70.s0.b(aVar10, strD, dVarB, jB, mVarV, jVarB, (e23.a) objQ15, mVar11, (i02.m.f86874s << 12) | 1769478);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj).intValue();
                t70.p0 p0Var = (t70.p0) obj2;
                p0Var.getClass();
                return p0Var.f162944a;
            case 28:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                t91.a aVar11 = t91.a.f163199a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    h4.r.a aVar12 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarQ = x2.q(aVar12, j92.b.f97901d.f97905d);
                    s62.a.f157643a.getClass();
                    i7.b(o1.a(t62.b.f162798a), gl1.y.Q(mVar12, R.string.lbl_close), rVarQ, lc.u0.f(mVar12), mVar12, 0, 0);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar13 = (p3.m) obj;
                ((Integer) obj2).getClass();
                mVar13.C(1207975493);
                x1 x1Var13 = p3.n.f135158a;
                int i18 = k3.f22728a;
                c2.g gVarC = q3.c(mVar13);
                mVar13.f();
                return gVarC;
        }
    }

    public /* synthetic */ c(byte b14, int i14) {
        this.f161848a = i14;
    }
}
