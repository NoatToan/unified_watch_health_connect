package om1;

import android.content.Context;
import c2.q;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import f12.l;
import f5.z0;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import lc0.f;
import o4.m1;
import oe0.e;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import ot1.t;
import oy0.i;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import pm1.g;
import s5.x0;
import t60.h;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132972a;

    public /* synthetic */ c(int i14) {
        this.f132972a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f132972a;
        m.a aVar = m.f135153a;
        switch (i14) {
            case 0:
                Scope scope = (Scope) obj;
                d dVar = d.f132973a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                return new nm1.m((l) scope.get((k23.d<?>) s0.f105811a.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 1:
                Scope scope2 = (Scope) obj;
                d dVar2 = d.f132973a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var = s0.f105811a;
                return new pm1.a((nm1.a) scope2.get((k23.d<?>) t0Var.b(nm1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (g) scope2.get((k23.d<?>) t0Var.b(g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 2:
                Scope scope3 = (Scope) obj;
                d dVar3 = d.f132973a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var2 = s0.f105811a;
                return new ql1.b((t60.c) scope3.get((k23.d<?>) t0Var2.b(t60.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (h) scope3.get((k23.d<?>) t0Var2.b(h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 3:
                ((Integer) obj2).getClass();
                oo0.h.g((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                oo0.h.a((m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ov.a aVar2 = ov.a.f134124a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new jv.b();
            case 6:
                Scope scope4 = (Scope) obj;
                ov.a aVar3 = ov.a.f134124a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                return new nv.g((f) scope4.get((k23.d<?>) s0.f105811a.b(f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 7:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                oy0.a aVar4 = oy0.a.f134364a;
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    g6.f.a aVar5 = g6.f.f75994b;
                    r rVarU = x2.u(r.S, 600);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = k.c(rVarU, mVar);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar6);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    u uVar = u.f22885a;
                    i iVar = i.NEWEST_FIRST;
                    Object objQ = mVar.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new t(19);
                        mVar.K(objQ);
                    }
                    e23.l lVar = (e23.l) objQ;
                    Object objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new e(21);
                        mVar.K(objQ2);
                    }
                    oy0.h.a(iVar, lVar, null, (e23.a) objQ2, true, mVar, 27702, 4);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 8:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                oy1.a aVar7 = oy1.a.f134419a;
                ((Scope) obj).getClass();
                parametersHolder.getClass();
                return new py1.c((j70.d) parametersHolder.elementAt(0, s0.f105811a.b(j70.d.class)));
            case 9:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                oy1.a aVar8 = oy1.a.f134419a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                j70.d dVar4 = (j70.d) parametersHolder2.elementAt(0, s0.f105811a.b(j70.d.class));
                fg0.l lVar2 = (fg0.l) dVar4.f97521b;
                if (lVar2 != null) {
                    return new lg0.a(dVar4.f97520a, lVar2);
                }
                return null;
            case 10:
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                oy1.a aVar9 = oy1.a.f134419a;
                ((Scope) obj).getClass();
                parametersHolder3.getClass();
                return new jg0.a((lg0.a) parametersHolder3.elementAt(0, s0.f105811a.b(lg0.a.class)));
            case 11:
                ParametersHolder parametersHolder4 = (ParametersHolder) obj2;
                oy1.a aVar10 = oy1.a.f134419a;
                ((Scope) obj).getClass();
                parametersHolder4.getClass();
                j70.d dVar5 = (j70.d) parametersHolder4.elementAt(0, s0.f105811a.b(j70.d.class));
                fg0.l lVar3 = (fg0.l) dVar5.f97521b;
                if (lVar3 != null) {
                    return new lg0.b(dVar5.f97520a, lVar3, null, 4, null);
                }
                return null;
            case 12:
                ParametersHolder parametersHolder5 = (ParametersHolder) obj2;
                oy1.a aVar11 = oy1.a.f134419a;
                ((Scope) obj).getClass();
                parametersHolder5.getClass();
                return new jg0.b((lg0.b) parametersHolder5.elementAt(0, s0.f105811a.b(lg0.b.class)));
            case 13:
                p00.a aVar12 = p00.a.f134649a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (o00.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, o00.a.class, new c83.h.a[0], null, null, null, 120);
            case 14:
                Scope scope5 = (Scope) obj;
                p00.a aVar13 = p00.a.f134649a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                return new o00.b((o00.a) scope5.get((k23.d<?>) s0.f105811a.b(o00.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 15:
                Scope scope6 = (Scope) obj;
                p00.a aVar14 = p00.a.f134649a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                Context contextAndroidContext = ModuleExtKt.androidContext(scope6);
                t0 t0Var3 = s0.f105811a;
                return new q00.a(contextAndroidContext, (f12.b) scope6.get((k23.d<?>) t0Var3.b(f12.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (o00.b) scope6.get((k23.d<?>) t0Var3.b(o00.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 16:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                p21.a aVar15 = p21.a.f135000a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    t4.d dVarA = n5.c.a(R.drawable.ic_exclamation, mVar2, 0);
                    r.a aVar16 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar = j92.b.f97901d;
                    i7.a(dVarA, null, u1.n.e(l4.k.b(x2.u(x2.h(aVar16, cVar.f97903b), cVar.f97903b), k2.i.f102406a), d92.b.a(mVar2).f().f(), m1.f128891a), d92.b.a(mVar2).f().f63508c, mVar2, 48, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 17:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                p3.h hVar = p3.h.f135102a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 18:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                p3.h hVar2 = p3.h.f135102a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 19:
                Scope scope7 = (Scope) obj;
                p31.a aVar17 = p31.a.f135398a;
                scope7.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var4 = s0.f105811a;
                return new o31.d((c22.k) scope7.get((k23.d<?>) t0Var4.b(c22.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (l) scope7.get((k23.d<?>) t0Var4.b(l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
            case 20:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                p40.b bVar2 = p40.b.f135634a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    String strQ = y.Q(mVar5, R.string.lbl_add_a_note);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, null, com.nimbusds.jose.shaded.gson.internal.a.x(mVar5), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, mVar5), mVar5, 0, 0, 131066);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 21:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                p40.b bVar3 = p40.b.f135634a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    r.a aVar18 = r.S;
                    q40.b bVar4 = new q40.b(0L, "Course Point", "4.05", "km", "678", "m", com.garmin.android.apps.connectmobile.courses.model.f.BRIDGE, null, 10000, 20000, true, true, true, 0.0d, 0.0d);
                    Object objQ3 = mVar6.q();
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new t(25);
                        mVar6.K(objQ3);
                    }
                    p40.u.b(aVar18, bVar4, true, (e23.l) objQ3, mVar6, 3462);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 22:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                p40.c cVar2 = p40.c.f135642a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    String strQ2 = y.Q(mVar7, R.string.lbl_edit);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar7), mVar7, 0, 0, 131070);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 23:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                p40.c cVar3 = p40.c.f135642a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    String strQ3 = y.Q(mVar8, R.string.lbl_remove);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar8), mVar8, 0, 0, 131070);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 24:
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                p40.c cVar4 = p40.c.f135642a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    String strQ4 = y.Q(mVar9, R.string.lbl_cancel);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar9), mVar9, 0, 0, 131070);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 25:
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                p40.c cVar5 = p40.c.f135642a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    String strQ5 = y.Q(mVar10, R.string.message_confirmation_remove_course_point);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97932i, mVar10);
                    g6.f.a aVar19 = g6.f.f75994b;
                    r rVarC2 = c2.l.C(x2.f(r.S, 1.0f), 0.0f, 8, 0.0f, 0.0f, 13);
                    d6.h.f57752b.getClass();
                    mh.c(strQ5, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar10, 48, 0, 130044);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 26:
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                p40.d dVar6 = p40.d.f135648a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    String strQ6 = y.Q(mVar11, R.string.course_planner_delete_all_rests);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ6, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar11), mVar11, 0, 0, 131070);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 27:
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                p40.d dVar7 = p40.d.f135648a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    String strQ7 = y.Q(mVar12, R.string.course_planner_delete_all_cutoffs);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ7, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar12), mVar12, 0, 0, 131070);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 28:
                m mVar13 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                p40.d dVar8 = p40.d.f135648a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    String strQ8 = y.Q(mVar13, R.string.course_planner_delete_all_notes);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ8, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar13), mVar13, 0, 0, 131070);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar14 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                p40.g gVar = p40.g.f135661a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    String strQ9 = y.Q(mVar14, R.string.msg_quit_without_save);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB2 = d92.c.b(j92.f.f97932i, mVar14);
                    r rVarF = x2.f(r.S, 1.0f);
                    d92.b.f58625c.getClass();
                    r rVarC3 = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                    d6.h.f57752b.getClass();
                    mh.c(strQ9, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB2, mVar14, 0, 0, 130044);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
        }
    }
}
