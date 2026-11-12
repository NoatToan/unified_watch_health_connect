package a03;

import c2.x2;
import c22.s3;
import ca0.o1;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import i3.i7;
import i3.kb;
import i3.mh;
import i3.ve;
import java.util.ArrayList;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p3.x1;
import v62.h1;
import v62.k1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134a;

    public /* synthetic */ n(int i14) {
        this.f134a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f134a;
        p3.m.a aVar = p3.m.f135153a;
        boolean z14 = false;
        iCompareTo = 0;
        int iCompareTo = 0;
        switch (i14) {
            case 0:
                p pVar = (p) obj2;
                ((d4.n) obj).getClass();
                pVar.getClass();
                return pVar.c();
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                a11.a aVar2 = a11.a.f245a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar, R.string.serving_amount);
                    a11.i iVar = new a11.i(0, 100, v21.d.f175321y, 1, null);
                    int i15 = 3;
                    a11.j0 j0Var = new a11.j0(3, 3);
                    Object objQ = mVar.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new n(i15);
                        mVar.K(objQ);
                    }
                    e23.p pVar2 = (e23.p) objQ;
                    Object objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new d(1);
                        mVar.K(objQ2);
                    }
                    a11.q.a(strQ, 2.125d, null, iVar, j0Var, pVar2, (e23.a) objQ2, mVar, 1769520, 4);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                a11.a aVar3 = a11.a.f245a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    ve.a(null, null, vb.h.e(d92.b.f58623a, mVar2), 0L, 0.0f, 0.0f, null, a11.a.f248d, mVar2, 12582912, 123);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Double) obj2).doubleValue();
                a11.a aVar4 = a11.a.f245a;
                ((a11.r) obj).getClass();
                return Unit.INSTANCE;
            case 4:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                a11.b bVar = a11.b.f252a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.u(aVar5, j92.b.f97899b.f97918c), mVar3);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                a11.b bVar2 = a11.b.f252a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.u(aVar6, j92.b.f97899b.f97918c), mVar4);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                a11.c cVar = a11.c.f258a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var = j92.f.f97932i;
                    long jA = zl.a.a(mVar5);
                    h4.r.a aVar7 = h4.r.S;
                    d92.b.f58625c.getClass();
                    mh.c(":", c2.l.A(aVar7, j92.b.f97899b.f97917b, 0.0f, 2), jA, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar5, 6, 0, 131064);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                a11.c cVar2 = a11.c.f258a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.u(aVar8, j92.b.f97899b.f97920e), mVar6);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                a11.c cVar3 = a11.c.f258a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    i53.c cVarH = ds.e0.h(1, 12);
                    Object objQ3 = mVar7.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ3 == c2565a2) {
                        objQ3 = new h(8);
                        mVar7.K(objQ3);
                    }
                    r82.p pVar3 = new r82.p(cVarH, 0, null, null, null, 0.0f, false, false, null, null, (e23.l) objQ3, 1020, null);
                    i53.c cVarE = i53.a.e(p13.x.k("AM", "PM"));
                    Object objQ4 = mVar7.q();
                    if (objQ4 == c2565a2) {
                        objQ4 = new h(9);
                        mVar7.K(objQ4);
                    }
                    a11.z.a(null, pVar3, null, new r82.p(cVarE, 0, null, null, null, 0.0f, false, false, null, null, (e23.l) objQ4, 1020, null), mVar7, 0, 5);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                a11.c cVar4 = a11.c.f258a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    i53.c cVarH2 = ds.e0.h(1, 12);
                    Object objQ5 = mVar8.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                    if (objQ5 == c2565a3) {
                        objQ5 = new h(5);
                        mVar8.K(objQ5);
                    }
                    r82.p pVar4 = new r82.p(cVarH2, 0, null, null, null, 0.0f, false, false, null, null, (e23.l) objQ5, 1020, null);
                    i53.c cVarH3 = ds.e0.h(0, 59);
                    Object objQ6 = mVar8.q();
                    if (objQ6 == c2565a3) {
                        objQ6 = new h(6);
                        mVar8.K(objQ6);
                    }
                    r82.p pVar5 = new r82.p(cVarH3, 0, null, null, null, 0.0f, false, false, null, null, (e23.l) objQ6, 1020, null);
                    i53.c cVarE2 = i53.a.e(p13.x.k("AM", "PM"));
                    Object objQ7 = mVar8.q();
                    if (objQ7 == c2565a3) {
                        objQ7 = new h(7);
                        mVar8.K(objQ7);
                    }
                    a11.z.a(null, pVar4, pVar5, new r82.p(cVarE2, 0, null, null, null, 0.0f, false, false, null, null, (e23.l) objQ7, 1020, null), mVar8, 0, 1);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                a11.d dVar = a11.d.f278a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    t4.d dVarA = n5.c.a(R.drawable.ic_exclamation, mVar9, 0);
                    h4.r.a aVar9 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar5 = j92.b.f97901d;
                    i7.a(dVarA, null, u1.n.e(l4.k.b(x2.u(x2.h(aVar9, cVar5.f97903b), cVar5.f97903b), k2.i.f102406a), d92.b.a(mVar9).f().f(), m1.f128891a), d92.b.a(mVar9).f().f63508c, mVar9, 48, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                a11.d dVar2 = a11.d.f278a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    b63.v vVar = new b63.v(8, 0, 0, 0, 12, null);
                    Object objQ8 = mVar10.q();
                    aVar.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new h(10);
                        mVar10.K(objQ8);
                    }
                    a11.d0.a(false, "Start", "8:00 AM", true, null, vVar, "Start", null, null, null, null, (e23.l) objQ8, null, null, mVar10, 1576374, 48, 14224);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                a31.d dVar3 = a31.d.f921a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    w13.c cVar6 = k31.c.f102642x1;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : cVar6) {
                        if (((k31.c) obj3) != k31.c.f102615c1) {
                            arrayList.add(obj3);
                        }
                    }
                    kb.a(null, null, null, null, null, 0, 0L, 0L, null, z3.f.c(-265702476, new a31.a(p13.h0.N0(arrayList, new a31.d.a()), z14 ? 1 : 0), mVar11), mVar11, C.ENCODING_PCM_32BIT, 511);
                    x1 x1Var12 = p3.n.f135158a;
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                a31.d dVar4 = a31.d.f921a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, true, a31.d.f922b, mVar12, 221184, 15);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                a51.b bVar3 = a51.b.f1412a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    i7.b(k1.a(t62.b.f162798a), gl1.y.Q(mVar13, R.string.move_up), null, 0L, mVar13, 0, 12);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                a51.b bVar4 = a51.b.f1412a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    i7.b(h1.a(t62.b.f162798a), gl1.y.Q(mVar14, R.string.move_down), null, 0L, mVar14, 0, 12);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 16:
                o61.l lVar = (o61.l) obj;
                o61.l lVar2 = (o61.l) obj2;
                a61.e eVar = a61.e.f1563a;
                DateTime dateTime = lVar != null ? lVar.f129608d : null;
                DateTime dateTime2 = lVar2 != null ? lVar2.f129608d : null;
                if (dateTime != null && dateTime2 != null) {
                    iCompareTo = dateTime.compareTo((ReadableInstant) dateTime2);
                }
                return Integer.valueOf(iCompareTo);
            case 17:
                a90.a aVar10 = a90.a.f2011a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new f90.j();
            case 18:
                Scope scope = (Scope) obj;
                a90.a aVar11 = a90.a.f2011a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                return new f90.a((f90.j) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f90.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 19:
                a90.a aVar12 = a90.a.f2011a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new f90.b(s3.b());
            case 20:
                Scope scope2 = (Scope) obj;
                a90.a aVar13 = a90.a.f2011a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                return new f90.f((f90.b) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(f90.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), e20.a.C1315a.a(e20.a.f62587b), s3.b());
            case 21:
                Scope scope3 = (Scope) obj;
                a90.a aVar14 = a90.a.f2011a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                return new f90.d((f90.b) scope3.get((k23.d<?>) t0Var.b(f90.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f90.j) scope3.get((k23.d<?>) t0Var.b(f90.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 22:
                Scope scope4 = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                a90.a aVar15 = a90.a.f2011a;
                scope4.getClass();
                parametersHolder.getClass();
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                return new fa0.h(((Boolean) parametersHolder.elementAt(0, t0Var2.b(Boolean.class))).booleanValue(), (o1) parametersHolder.elementAt(1, t0Var2.b(o1.class)), (q90.c) parametersHolder.elementAt(2, t0Var2.b(q90.c.class)), s3.b(), (f12.l) scope4.get((k23.d<?>) t0Var2.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), e20.a.C1315a.a(e20.a.f62587b), (f90.f) scope4.get((k23.d<?>) t0Var2.b(f90.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f90.d) scope4.get((k23.d<?>) t0Var2.b(f90.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (y80.w) scope4.get((k23.d<?>) t0Var2.b(y80.w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 512, null);
            case 23:
                Scope scope5 = (Scope) obj;
                a90.f fVar = a90.f.f2020a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                return new y80.d((y80.a) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(y80.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 24:
                Scope scope6 = (Scope) obj;
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                a90.f fVar2 = a90.f.f2020a;
                scope6.getClass();
                parametersHolder2.getClass();
                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                return new ia0.g(((Number) parametersHolder2.elementAt(1, t0Var3.b(Long.class))).longValue(), (h90.a) parametersHolder2.elementAt(0, t0Var3.b(h90.a.class)), (y80.d) scope6.get((k23.d<?>) t0Var3.b(y80.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 25:
                Scope scope7 = (Scope) obj;
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                a90.f fVar3 = a90.f.f2020a;
                scope7.getClass();
                parametersHolder3.getClass();
                p005kotlin.jvm.internal.t0 t0Var4 = p005kotlin.jvm.internal.s0.f105811a;
                return new ha0.k(((Number) parametersHolder3.elementAt(0, t0Var4.b(Long.class))).longValue(), (String) parametersHolder3.elementAt(1, t0Var4.b(String.class)), (x80.b) scope7.get((k23.d<?>) t0Var4.b(x80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kl1.a) scope7.get((k23.d<?>) t0Var4.b(kl1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (xs.i) scope7.get((k23.d<?>) t0Var4.b(xs.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 26:
                ParametersHolder parametersHolder4 = (ParametersHolder) obj2;
                a90.f fVar4 = a90.f.f2020a;
                ((Scope) obj).getClass();
                parametersHolder4.getClass();
                p005kotlin.jvm.internal.t0 t0Var5 = p005kotlin.jvm.internal.s0.f105811a;
                return new na0.p((gg1.o0) parametersHolder4.elementAt(0, t0Var5.b(gg1.o0.class)), ((Number) parametersHolder4.elementAt(1, t0Var5.b(Integer.class))).intValue());
            case 27:
                a90.f fVar5 = a90.f.f2020a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new na0.j();
            case 28:
                a90.f fVar6 = a90.f.f2020a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new y80.x((y80.v) ez0.b.a(ez0.b.f67468a, ez0.c.GC, y80.v.class, new c83.h.a[0], null, null, null, 88));
            default:
                Scope scope8 = (Scope) obj;
                ParametersHolder parametersHolder5 = (ParametersHolder) obj2;
                a90.f fVar7 = a90.f.f2020a;
                scope8.getClass();
                parametersHolder5.getClass();
                p005kotlin.jvm.internal.t0 t0Var6 = p005kotlin.jvm.internal.s0.f105811a;
                return new na0.r((y80.q0) scope8.get((k23.d<?>) t0Var6.b(y80.q0.class), (Qualifier) null, new a90.b(((Number) parametersHolder5.elementAt(0, t0Var6.b(Long.class))).longValue(), z14 ? 1 : 0)));
        }
    }
}
