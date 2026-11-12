package eb0;

import androidx.lifecycle.b0;
import c2.a0;
import c2.j;
import c2.l;
import c2.q2;
import c2.s2;
import c2.t0;
import c2.t2;
import c2.u2;
import c2.x2;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import d92.c;
import da0.u;
import dv0.f;
import e23.q;
import et1.a2;
import gl1.y;
import h4.r;
import i3.mh;
import i3.v2;
import j92.e;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;
import jt1.d;
import k2.h;
import k2.i;
import l72.c1;
import l72.j0;
import l72.n0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.v;
import p3.x1;
import r1.e0;
import s5.x0;
import sc.g;
import tn2.t;
import u1.w;
import x5.l0;
import z80.k;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f63656b;

    public /* synthetic */ a(p1 p1Var, int i14) {
        this.f63655a = i14;
        this.f63656b = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:184:0x0723  */
    /* JADX WARN: Code duplicated, block: B:224:0x084b  */
    /* JADX WARN: Code duplicated, block: B:242:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:28:0x0177  */
    /* JADX WARN: Code duplicated, block: B:68:0x0263  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strQ;
        String strT;
        long jD;
        b0.b bVar;
        int i14 = this.f63655a;
        int i15 = 24;
        int i16 = 4;
        m.a aVar = m.f135153a;
        p1 p1Var = this.f63656b;
        switch (i14) {
            case 0:
                a0 a0Var = (a0) obj;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                a0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(a0Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar2 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l.f(x2.h(aVar2, j92.b.f97899b.f97920e), mVar);
                    boolean z14 = ((k) p1Var.getF182175a()) == k.FEMALE;
                    String strQ2 = y.Q(mVar, R.string.lbl_gender_female);
                    float f14 = u.f58858a;
                    h hVarC = i.c(f14, f14, 0.0f, 0.0f, 12);
                    Object objQ = mVar.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new f(p1Var, 21);
                        mVar.K(objQ);
                    }
                    u.a("btn_gender_female", z14, strQ2, null, hVarC, (e23.a) objQ, mVar, 196614, 8);
                    boolean z15 = ((k) p1Var.getF182175a()) == k.MALE;
                    String strQ3 = y.Q(mVar, R.string.lbl_gender_male);
                    h hVarC2 = i.c(0.0f, 0.0f, f14, f14, 3);
                    Object objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new f(p1Var, 22);
                        mVar.K(objQ2);
                    }
                    u.a("btn_gender_male", z15, strQ3, null, hVarC2, (e23.a) objQ2, mVar, 196614, 8);
                    l.f(a0Var.a(aVar2, 1.0f, true), mVar);
                    String strQ4 = y.Q(mVar, R.string.msg_profile_information_privacy);
                    d92.b.f58624b.getClass();
                    mh.c(strQ4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131070);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                r rVar = (r) obj;
                m mVar2 = (m) obj2;
                v.h.y(-510027827, rVar, (Integer) obj3, mVar2);
                x1 x1Var2 = n.f135158a;
                Object objQ3 = mVar2.q();
                aVar.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new f(p1Var, 25);
                    mVar2.K(objQ3);
                }
                r rVarD = w.d(rVar, false, null, null, (e23.a) objQ3, 15);
                mVar2.f();
                return rVarD;
            case 2:
                r rVar2 = (r) obj;
                m mVar3 = (m) obj2;
                v.h.y(1160965544, rVar2, (Integer) obj3, mVar3);
                x1 x1Var3 = n.f135158a;
                Object objQ4 = mVar3.q();
                aVar.getClass();
                if (objQ4 == m.a.f135155b) {
                    objQ4 = new a2(p1Var, 7);
                    mVar3.K(objQ4);
                }
                r rVarD2 = w.d(rVar2, false, null, null, (e23.a) objQ4, 15);
                mVar3.f();
                return rVarD2;
            case 3:
                m mVar4 = (m) obj2;
                ((Integer) obj3).getClass();
                ((e0) obj).getClass();
                x1 x1Var4 = n.f135158a;
                c1 c1Var = c1.f110940a;
                String strQ5 = y.Q(mVar4, R.string.lbl_nap_limit_reached);
                String strP = y.P(R.string.msg_nap_limit_reached_for_x_naps, new Object[]{8}, mVar4);
                String strQ6 = y.Q(mVar4, R.string.lbl_ok);
                Object objQ5 = mVar4.q();
                aVar.getClass();
                if (objQ5 == m.a.f135155b) {
                    objQ5 = new a2(p1Var, 17);
                    mVar4.K(objQ5);
                }
                c1Var.a(false, strQ5, strP, null, null, strQ6, false, false, (e23.a) objQ5, null, null, mVar4, 100663302, 0, 1752);
                return Unit.INSTANCE;
            case 4:
                m mVar5 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.c1) obj).getClass();
                if (mVar5.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var5 = n.f135158a;
                    for (d91.b bVar2 : d91.b.f58503h) {
                        String strQ7 = y.Q(mVar5, bVar2.f58504a);
                        r.a aVar3 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        r rVarC = l.C(aVar3, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11);
                        j0 j0Var = new j0(strQ7, null, null, false, ((List) p1Var.getF182175a()).contains(bVar2), 14, null);
                        boolean zK = mVar5.k(bVar2.ordinal());
                        Object objQ6 = mVar5.q();
                        if (zK) {
                            objQ6 = new hy.h(11, bVar2, p1Var);
                            mVar5.K(objQ6);
                        } else {
                            aVar.getClass();
                            if (objQ6 == m.a.f135155b) {
                                objQ6 = new hy.h(11, bVar2, p1Var);
                                mVar5.K(objQ6);
                            }
                        }
                        n0.a(rVarC, j0Var, 0L, (e23.l) objQ6, mVar5, 0, 4);
                    }
                    x1 x1Var6 = n.f135158a;
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                m mVar6 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((c2.c1) obj).getClass();
                if (mVar6.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var7 = n.f135158a;
                    for (us1.b bVar3 : us1.b.f172367e) {
                        j0 j0Var2 = new j0(y.Q(mVar6, bVar3.f172369b), null, null, false, ((us1.b) p1Var.getF182175a()) == bVar3, 14, null);
                        boolean zB = mVar6.B(p1Var) | mVar6.k(bVar3.ordinal());
                        Object objQ7 = mVar6.q();
                        if (zB) {
                            objQ7 = new d(false ? 1 : 0, bVar3, p1Var);
                            mVar6.K(objQ7);
                        } else {
                            aVar.getClass();
                            if (objQ7 == m.a.f135155b) {
                                objQ7 = new d(false ? 1 : 0, bVar3, p1Var);
                                mVar6.K(objQ7);
                            }
                        }
                        n0.a(null, j0Var2, 0L, (e23.l) objQ7, mVar6, 0, 5);
                    }
                    x1 x1Var8 = n.f135158a;
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                m mVar7 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar7.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var9 = n.f135158a;
                    j jVar = j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f15 = j92.b.f97899b.f97918c;
                    jVar.getClass();
                    t0.a(null, j.i(f15), null, null, 0, 0, z3.f.c(-856407661, new a(p1Var, 5), mVar7), mVar7, 1572864, 61);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                m mVar8 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar8.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var10 = n.f135158a;
                    gt1.d.a(x2.f(r.S, 1.0f), false, this.f63656b, null, 300, false, mVar8, 24582, 106);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                il0.a aVar4 = (il0.a) obj;
                m mVar9 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                aVar4.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar9.B(aVar4) ? 4 : 2;
                }
                if (mVar9.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var11 = n.f135158a;
                    boolean zB2 = mVar9.B(p1Var);
                    Object objQ8 = mVar9.q();
                    if (zB2) {
                        objQ8 = new v2(p1Var, 29);
                        mVar9.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == m.a.f135155b) {
                            objQ8 = new v2(p1Var, 29);
                            mVar9.K(objQ8);
                        }
                    }
                    kl0.b.e(aVar4, (e23.l) objQ8, mVar9, iIntValue6 & 14);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                m mVar10 = (m) obj2;
                ((Integer) obj3).getClass();
                ((e0) obj).getClass();
                x1 x1Var12 = n.f135158a;
                String strF = androidx.core.view.j.f(g22.n.c(((l0) p1Var.getF182175a()).f188878a.f157138b), "/50");
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(strF, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c.f(j92.f.f97935l, mVar10), mVar10, 0, 0, 131070);
                return Unit.INSTANCE;
            case 10:
                m mVar11 = (m) obj2;
                ((Integer) obj3).getClass();
                ((e0) obj).getClass();
                x1 x1Var13 = n.f135158a;
                r.a aVar5 = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                e eVar = j92.b.f97899b;
                r rVarA = l.A(l.A(aVar5, eVar.f97920e, 0.0f, 2), 0.0f, eVar.f97917b, 1);
                d92.b.f58624b.getClass();
                mh.c(androidx.core.view.j.f(((String) p1Var.getF182175a()).length(), "/10"), rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c.f(j92.f.f97933j, mVar11), mVar11, 0, 0, 131068);
                return Unit.INSTANCE;
            case 11:
                m mVar12 = (m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar12.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var14 = n.f135158a;
                    String strQ8 = y.Q(mVar12, ((Boolean) p1Var.getF182175a()).booleanValue() ? R.string.lbl_show_less : R.string.lbl_show_more);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ8, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c.b(j92.f.f97933j, mVar12), mVar12, 0, 0, 131070);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                m mVar13 = (m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((c2.c1) obj).getClass();
                if (mVar13.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var15 = n.f135158a;
                    String strQ9 = y.Q(mVar13, R.string.course_planner_privacy_note);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97933j;
                    x0 x0VarF = c.f(x0Var, mVar13);
                    r.a aVar6 = r.S;
                    mh.c(strQ9, x2.f(aVar6, 0.8f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar13, 48, 0, 131068);
                    String str = (String) p1Var.getF182175a();
                    mh.c(androidx.core.view.j.f(str != null ? str.length() : 0, " / 250"), x2.f(aVar6, 0.2f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c.f(x0Var, mVar13), mVar13, 48, 0, 131068);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                m mVar14 = (m) obj2;
                ((Integer) obj3).getClass();
                ((e0) obj).getClass();
                x1 x1Var16 = n.f135158a;
                g6.f.a aVar7 = g6.f.f75994b;
                r rVarZ = l.z(r.S, 16, 5);
                if (((km1.i) p1Var.getF182175a()).f105525a != 0) {
                    mVar14.C(206039820);
                    strQ = y.Q(mVar14, ((km1.i) p1Var.getF182175a()).f105525a);
                    mVar14.f();
                } else {
                    mVar14.C(2092310617);
                    mVar14.f();
                    strQ = "";
                }
                String str2 = strQ;
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(str2, rVarZ, zl.a.a(mVar14), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, mVar14, 48, 0, 131064);
                return Unit.INSTANCE;
            case 14:
                m mVar15 = (m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar15.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var17 = n.f135158a;
                    r72.i iVar = (r72.i) p1Var.getF182175a();
                    Object objQ9 = mVar15.q();
                    aVar.getClass();
                    if (objQ9 == m.a.f135155b) {
                        objQ9 = new pp.b(p1Var, i16);
                        mVar15.K(objQ9);
                    }
                    r72.n.c(iVar, (e23.l) objQ9, mVar15, 48);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                am.x0 x0Var2 = (am.x0) obj;
                m mVar16 = (m) obj2;
                ((Integer) obj3).getClass();
                mVar16.C(1551067004);
                x1 x1Var18 = n.f135158a;
                c3 c3Var = x0Var2 != null ? x0Var2.f4360c : null;
                if (c3Var == null) {
                    mVar16.C(-1715944309);
                    mVar16.f();
                    strT = null;
                } else {
                    mVar16.C(-1715944308);
                    strT = gl1.d.T(c3Var, mVar16, 0);
                    mVar16.f();
                }
                if (strT == null) {
                    mVar16.C(221743801);
                    strT = y.P(R.string.label_all_activity_name, new Object[]{gl1.d.T(((rk0.c1) p1Var.getF182175a()).f153082b.f4360c, mVar16, 0)}, mVar16);
                    mVar16.f();
                } else {
                    mVar16.C(221740918);
                    mVar16.f();
                }
                mVar16.f();
                return strT;
            case 16:
                m mVar17 = (m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar17.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var19 = n.f135158a;
                    if (((j70.r) p1Var.getF182175a()) != null) {
                        mVar17.C(1609392572);
                        d92.b.f58623a.getClass();
                        jD = d92.b.a(mVar17).k().b();
                        mVar17.f();
                    } else {
                        mVar17.C(1609476954);
                        d92.b.f58623a.getClass();
                        jD = d92.b.a(mVar17).k().d();
                        mVar17.f();
                    }
                    long j8 = jD;
                    String upperCase = y.Q(mVar17, R.string.lbl_save).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    s5.c cVar = new s5.c(upperCase, null, 2, null);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarA = x0.a(j92.f.f97932i, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    r.a aVar8 = r.S;
                    d92.b.f58625c.getClass();
                    mh.d(cVar, l.C(aVar8, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarA, mVar17, 0, 0, 262140);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 17:
                sc.h hVar = (sc.h) obj;
                m mVar18 = (m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= mVar18.B(hVar) ? 4 : 2;
                }
                if (mVar18.n(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    x1 x1Var20 = n.f135158a;
                    List list = (List) p1Var.getF182175a();
                    boolean z16 = (iIntValue11 & 14) == 4;
                    Object objQ10 = mVar18.q();
                    if (z16) {
                        objQ10 = new t(hVar, i15);
                        mVar18.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == m.a.f135155b) {
                            objQ10 = new t(hVar, i15);
                            mVar18.K(objQ10);
                        }
                    }
                    e23.l lVar = (e23.l) objQ10;
                    if (list instanceof RandomAccess) {
                        int size = list.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= size) {
                                bVar = b0.b.CREATED;
                            } else if (((Boolean) lVar.invoke(list.get(i17))).booleanValue()) {
                                bVar = b0.b.RESUMED;
                            } else {
                                i17++;
                            }
                        }
                    } else {
                        if (list == null || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((Boolean) lVar.invoke(it.next())).booleanValue()) {
                                        bVar = b0.b.RESUMED;
                                    }
                                }
                            }
                        }
                        bVar = b0.b.CREATED;
                    }
                    v.a(s9.j.f158018a.c(s9.m.a(bVar, mVar18)), z3.f.c(-1713684244, new g(hVar, 2, (byte) 0), mVar18), mVar18, 56);
                    x1 x1Var21 = n.f135158a;
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 18:
                m mVar19 = (m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar19.n(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    x1 x1Var22 = n.f135158a;
                    l0 l0Var = (l0) p1Var.getF182175a();
                    Object objQ11 = mVar19.q();
                    aVar.getClass();
                    if (objQ11 == m.a.f135155b) {
                        objQ11 = new vd0.d(p1Var, i15);
                        mVar19.K(objQ11);
                    }
                    wv0.u.b(l0Var, (e23.l) objQ11, mVar19, 48);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar20 = (m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar20.n(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    x1 x1Var23 = n.f135158a;
                    r.a aVar9 = r.S;
                    r rVarF = x2.f(aVar9, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    e eVar2 = j92.b.f97899b;
                    float f16 = eVar2.f97918c;
                    float f17 = eVar2.f97920e;
                    r rVarA2 = l.A(rVarF, 0.0f, f16, 1);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar4 = h4.d.a.f81534l;
                    j.f22691a.getClass();
                    s2 s2VarA = q2.a(j.i(f17), bVar4, mVar20, 48);
                    int iHashCode = Long.hashCode(mVar20.getU());
                    i2 i2VarX = mVar20.x();
                    r rVarC2 = h4.k.c(rVarA2, mVar20);
                    h5.g.V.getClass();
                    h5.e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar20.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar20.z();
                    if (mVar20.getT()) {
                        mVar20.M(aVar10);
                    } else {
                        mVar20.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar20);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar20);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar20.getT() || !s.g(mVar20.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar20, iHashCode, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar20);
                    u2 u2Var = u2.f22900a;
                    String strQ10 = y.Q(mVar20, R.string.concept_personal_records);
                    z5.b.f202439b.getClass();
                    String strB = s5.l0.b(strQ10, z5.b.a.a());
                    d92.b.f58624b.getClass();
                    x0 x0Var3 = j92.f.f97933j;
                    x0 x0VarF2 = c.f(x0Var3, mVar20);
                    r rVarC3 = l.C(u2Var.a(aVar9, 1.0f, true), eVar2.f97920e, 0.0f, 0.0f, 0.0f, 14);
                    d6.h.f57752b.getClass();
                    mh.c(strB, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0VarF2, mVar20, 0, 0, 130044);
                    String strB2 = s5.l0.b(y.Q(mVar20, ((Boolean) p1Var.getF182175a()).booleanValue() ? R.string.lbl_done : R.string.lbl_edit), z5.b.a.a());
                    x0 x0VarA2 = x0.a(x0Var3, ds.e0.e(mVar20), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    boolean zB3 = mVar20.B(p1Var);
                    Object objQ12 = mVar20.q();
                    if (zB3) {
                        objQ12 = new x91.d(p1Var, 3);
                        mVar20.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == m.a.f135155b) {
                            objQ12 = new x91.d(p1Var, 3);
                            mVar20.K(objQ12);
                        }
                    }
                    mh.c(strB2, l.A(l.A(w.d(aVar9, false, null, null, (e23.a) objQ12, 15), f17, 0.0f, 2), 0.0f, eVar2.f97918c, 1), 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0VarA2, mVar20, 0, 0, 130044);
                    mVar20.y();
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
        }
    }
}
