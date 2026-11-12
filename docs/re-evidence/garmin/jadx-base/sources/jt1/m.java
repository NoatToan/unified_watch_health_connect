package jt1;

import androidx.lifecycle.n0;
import c2.c1;
import c2.k3;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.group.create.GroupCreationActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import cy0.o;
import e23.p;
import f5.z0;
import gl1.y;
import h4.r;
import h5.e0;
import hk1.a0;
import i3.d6;
import i3.kb;
import i3.m8;
import i3.mc;
import i3.mh;
import i3.wd;
import i3.zd;
import java.util.List;
import java.util.Locale;
import k11.s;
import l11.t;
import l72.a2;
import l72.h3;
import l72.i3;
import l72.y1;
import lc.m0;
import o4.d0;
import o4.t1;
import o4.u1;
import o4.v1;
import o53.b0;
import p005kotlin.Unit;
import p006l2.h1;
import p13.j0;
import p13.u;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m1;
import p3.p0;
import p3.p1;
import p3.x1;
import p5.v;
import r53.d2;
import s5.x0;
import u1.w;
import z2.h2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f100852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f100853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f100854d;

    public /* synthetic */ m(f01.j jVar, e23.l lVar, r rVar, int i14) {
        this.f100851a = 21;
        this.f100852b = jVar;
        this.f100854d = lVar;
        this.f100853c = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0644  */
    /* JADX WARN: Code duplicated, block: B:212:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:220:0x072a  */
    /* JADX WARN: Code duplicated, block: B:226:0x0762  */
    /* JADX WARN: Code duplicated, block: B:232:0x079b  */
    /* JADX WARN: Code duplicated, block: B:238:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:257:0x0840  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:299:0x09dd  */
    /* JADX WARN: Code duplicated, block: B:318:0x0a70  */
    /* JADX WARN: Code duplicated, block: B:335:0x0ae3  */
    /* JADX WARN: Code duplicated, block: B:46:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:51:0x0202  */
    /* JADX WARN: Code duplicated, block: B:99:0x038b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i14;
        int i15;
        Throwable th3;
        p3.m mVar;
        String str;
        int i16 = this.f100851a;
        int i17 = 18;
        int i18 = 7;
        Throwable th4 = null;
        p3.m.a aVar = p3.m.f135153a;
        boolean z14 = false;
        int i19 = 2;
        Object obj3 = this.f100852b;
        Object obj4 = this.f100854d;
        Object obj5 = this.f100853c;
        switch (i16) {
            case 0:
                ((Integer) obj2).getClass();
                n.a((r) obj5, (e23.l) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                jv0.f.a((gv0.d) obj5, (e23.a) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                e23.a aVar2 = (e23.a) obj3;
                l11.a aVar3 = (l11.a) obj5;
                l11.a.d dVar = (l11.a.d) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String strQ = y.Q(mVar2, R.string.food_details);
                    boolean zB = mVar2.B(aVar2);
                    Object objQ = mVar2.q();
                    if (zB) {
                        objQ = new j22.d(aVar2, 18);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new j22.d(aVar2, 18);
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    l11.a.c cVar = aVar3.f108055d;
                    if (cVar instanceof l11.a.c.C2073a) {
                        i14 = -206782326;
                        i15 = R.string.lbl_add;
                    } else {
                        if (!(cVar instanceof l11.a.c.b) && !(cVar instanceof l11.a.c.C2074c)) {
                            throw n23.j.m(mVar2, -206784276);
                        }
                        i14 = -206779125;
                        i15 = R.string.lbl_save;
                    }
                    i53.f fVarA = i53.a.a(new i3("ADD_FOOD", sn.a.h(mVar2, i14, i15, mVar2), !u.m0(new l11.a.d[]{l11.a.d.f.f108102a, l11.a.d.k.f108108a}).contains(dVar), (u4.d) null, (String) null, 24, (p005kotlin.jvm.internal.j) null));
                    boolean zR = mVar2.r(aVar3);
                    Object objQ2 = mVar2.q();
                    if (zR) {
                        objQ2 = new k11.g(aVar3, z14 ? 1 : 0);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new k11.g(aVar3, z14 ? 1 : 0);
                            mVar2.K(objQ2);
                        }
                    }
                    z02.f.e(strQ, null, aVar4, fVarA, (e23.l) objQ2, mVar2, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                s.e((r) obj5, (String) obj3, (e23.l) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                k11.y.a((i53.c) obj5, (v21.e) obj3, (e23.l) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                l11.s sVar = (l11.s) obj5;
                e23.a aVar5 = (e23.a) obj3;
                e23.a aVar6 = (e23.a) obj4;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strT = gl1.d.T(sVar.f108252p, mVar3, 0);
                    i53.f fVarA2 = i53.a.a(new i3("SAVE_RECIPE", y.Q(mVar3, sVar.f108251o), !u.m0(new t.c[]{t.c.f.f108285a, t.c.k.f108291a}).contains(sVar.f108237a), (u4.d) null, (String) null, 24, (p005kotlin.jvm.internal.j) null));
                    boolean zB2 = mVar3.B(aVar6);
                    Object objQ3 = mVar3.q();
                    if (zB2) {
                        objQ3 = new m8(aVar6, 9);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new m8(aVar6, 9);
                            mVar3.K(objQ3);
                        }
                    }
                    z02.f.e(strT, null, aVar5, fVarA2, (e23.l) objQ3, mVar3, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                k62.b.a((List) obj5, (k62.k) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                m1 m1Var = (m1) obj5;
                com.garmin.android.apps.connectmobile.developer.tutorials.b bVar = (com.garmin.android.apps.connectmobile.developer.tutorials.b) obj3;
                e23.l lVar = (e23.l) obj4;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.developer.tutorials.b.a aVar7 = com.garmin.android.apps.connectmobile.developer.tutorials.b.f33722b;
                if (mVar4.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    r rVarE = u1.n.e(x2.d(r.S, 1.0f), vb.h.e(d92.b.f58623a, mVar4), o4.m1.f128891a);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar4.getU());
                    i2 i2VarX = mVar4.x();
                    r rVarC = h4.k.c(rVarE, mVar4);
                    h5.g.V.getClass();
                    e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar8);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar4, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar4);
                    c2.u uVar = c2.u.f22885a;
                    da0.i.a(m1Var.getFloatValue(), mVar4, 0);
                    d0.f128823b.getClass();
                    kb.a(null, null, null, null, null, 0, d0.f128831j, 0L, null, z3.f.c(-1341295317, new hv0.d(13, bVar, lVar), mVar4), mVar4, 806879232, 447);
                    mVar4.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.developer.tutorials.b.a aVar9 = com.garmin.android.apps.connectmobile.developer.tutorials.b.f33722b;
                ((com.garmin.android.apps.connectmobile.developer.tutorials.b) obj5).w6((com.garmin.android.apps.connectmobile.developer.tutorials.b.AbstractC0563b) obj3, (e23.l) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                ih0.s sVar2 = (ih0.s) obj5;
                dh0.a aVar10 = (dh0.a) obj4;
                lc.y yVar = (lc.y) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar5.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    kh0.g.h(mVar5, 0);
                    kh0.g.f(sVar2.x4(aVar10), mVar5, 0);
                    boolean zR2 = mVar5.r(yVar);
                    Object objQ4 = mVar5.q();
                    if (zR2) {
                        objQ4 = new gk1.b(yVar, i19);
                        mVar5.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new gk1.b(yVar, i19);
                            mVar5.K(objQ4);
                        }
                    }
                    kh0.g.g((e23.a) objQ4, mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 10:
                List list = (List) obj5;
                ih0.i iVar = (ih0.i) obj3;
                e23.l lVar2 = (e23.l) obj4;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    int i24 = 0;
                    for (Object obj6 : list) {
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            Throwable th5 = th4;
                            x.q();
                            throw th5;
                        }
                        dh0.d dVar2 = (dh0.d) obj6;
                        boolean z15 = i24 == 0 && dVar2.f59571h != null && list.size() > 1;
                        Double d14 = dVar2.f59565b;
                        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                        dh0.g gVar = dVar2.f59564a;
                        int i26 = kh0.s.a.f104763a[gVar.ordinal()];
                        if (i26 == 1) {
                            th3 = th4;
                            mVar6.C(-2000881530);
                            boolean zB3 = mVar6.B(lVar2) | mVar6.k(gVar.ordinal());
                            Object objQ5 = mVar6.q();
                            if (zB3) {
                                objQ5 = new kh0.m(lVar2, gVar, 4);
                                mVar6.K(objQ5);
                            } else {
                                aVar.getClass();
                                if (objQ5 == p3.m.a.f135155b) {
                                    objQ5 = new kh0.m(lVar2, gVar, 4);
                                    mVar6.K(objQ5);
                                }
                            }
                            mVar = mVar6;
                            kh0.s.b(dDoubleValue, z15, iVar, (e23.a) objQ5, mVar, 512);
                            mVar.f();
                        } else if (i26 != 2) {
                            th3 = th4;
                            if (i26 == 3) {
                                mVar6.C(-2000665987);
                                boolean zB4 = mVar6.B(lVar2) | mVar6.k(gVar.ordinal());
                                Object objQ6 = mVar6.q();
                                if (zB4) {
                                    objQ6 = new kh0.m(lVar2, gVar, 5);
                                    mVar6.K(objQ6);
                                } else {
                                    aVar.getClass();
                                    if (objQ6 == p3.m.a.f135155b) {
                                        objQ6 = new kh0.m(lVar2, gVar, 5);
                                        mVar6.K(objQ6);
                                    }
                                }
                                mVar = mVar6;
                                kh0.s.k(dDoubleValue, z15, iVar, (e23.a) objQ6, mVar, 512);
                                mVar6.f();
                            } else if (i26 == 4) {
                                mVar6.C(-2000438726);
                                boolean zB5 = mVar6.B(lVar2) | mVar6.k(gVar.ordinal());
                                Object objQ7 = mVar6.q();
                                if (zB5) {
                                    objQ7 = new kh0.m(lVar2, gVar, 1);
                                    mVar6.K(objQ7);
                                } else {
                                    aVar.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new kh0.m(lVar2, gVar, 1);
                                        mVar6.K(objQ7);
                                    }
                                }
                                mVar = mVar6;
                                kh0.s.m(dDoubleValue, z15, iVar, (e23.a) objQ7, mVar, 512);
                                mVar6.f();
                            } else {
                                if (i26 != 5) {
                                    throw n23.j.m(mVar6, 1598014448);
                                }
                                mVar6.C(-2000214720);
                                boolean zB6 = mVar6.B(lVar2) | mVar6.k(gVar.ordinal());
                                Object objQ8 = mVar6.q();
                                if (zB6) {
                                    objQ8 = new kh0.m(lVar2, gVar, 2);
                                    mVar6.K(objQ8);
                                } else {
                                    aVar.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new kh0.m(lVar2, gVar, 2);
                                        mVar6.K(objQ8);
                                    }
                                }
                                mVar = mVar6;
                                kh0.s.i(dDoubleValue, z15, iVar, (e23.a) objQ8, mVar, 512);
                                mVar6.f();
                            }
                        } else {
                            th3 = th4;
                            mVar6.C(-2001090718);
                            boolean zB7 = mVar6.B(lVar2) | mVar6.k(gVar.ordinal());
                            Object objQ9 = mVar6.q();
                            if (zB7) {
                                objQ9 = new kh0.m(lVar2, gVar, 3);
                                mVar6.K(objQ9);
                            } else {
                                aVar.getClass();
                                if (objQ9 == p3.m.a.f135155b) {
                                    objQ9 = new kh0.m(lVar2, gVar, 3);
                                    mVar6.K(objQ9);
                                }
                            }
                            mVar = mVar6;
                            kh0.s.d(dDoubleValue, z15, iVar, (e23.a) objQ9, mVar, 512);
                            mVar6.f();
                        }
                        i24 = i25;
                        mVar6 = mVar;
                        th4 = th3;
                    }
                    x1 x1Var6 = p3.n.f135158a;
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 11:
                p1 p1Var = (p1) obj5;
                fj2.f fVar = (fj2.f) obj4;
                p pVar = (p) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar7.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    r.a aVar11 = r.S;
                    b3.b.f15502a.getClass();
                    u4.d dVarC = d3.e.f57308a;
                    if (dVarC == null) {
                        g6.f.a aVar12 = g6.f.f75994b;
                        u4.d.a aVar13 = new u4.d.a("Filled.ArrowForward", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96, null);
                        j0 j0Var = u4.m.f168519a;
                        d0.f128823b.getClass();
                        t1 t1Var = new t1(d0.f128824c, null);
                        u1.f129010b.getClass();
                        v1.f129019b.getClass();
                        int i27 = v1.f129021d;
                        u4.e eVar = new u4.e();
                        eVar.k(12.0f, 4.0f);
                        eVar.j(-1.41f, 1.41f);
                        eVar.i(16.17f, 11.0f);
                        eVar.g(4.0f);
                        eVar.p(2.0f);
                        eVar.h(12.17f);
                        eVar.j(-5.58f, 5.59f);
                        com.nimbusds.jose.shaded.gson.internal.a.w(eVar, 12.0f, 20.0f, 8.0f, -8.0f);
                        u4.d.a.b(aVar13, eVar.f168407a, 0, t1Var, 1.0f, null, 1.0f, i27, 1.0f);
                        dVarC = aVar13.c();
                        d3.e.f57308a = dVarC;
                    }
                    boolean zB8 = mVar7.B(p1Var) | mVar7.r(fVar) | mVar7.B(pVar);
                    Object objQ10 = mVar7.q();
                    if (zB8) {
                        objQ10 = new d6(fVar, 29, p1Var, pVar);
                        mVar7.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new d6(fVar, 29, p1Var, pVar);
                            mVar7.K(objQ10);
                        }
                    }
                    kj2.k.a(aVar11, dVarC, (e23.a) objQ10, mVar7, 390);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                kj2.f.a((String) obj5, (Integer) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                kj2.k.a((r) obj5, (u4.d) obj4, (e23.a) obj3, (p3.m) obj, p0.t(391));
                return Unit.INSTANCE;
            case 14:
                a0 a0Var = (a0) obj5;
                p1 p1Var2 = (p1) obj4;
                p1 p1Var3 = (p1) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar8.n(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    hk1.c cVar2 = ((kk1.j) p1Var2.getF182175a()).f105169e;
                    Object objQ11 = mVar8.q();
                    aVar.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        objQ11 = new kb0.k(p1Var3, 11);
                        mVar8.K(objQ11);
                    }
                    kk1.d.a(cVar2, a0Var, (e23.a) objQ11, mVar8, (a0.f84097n << 3) | 384);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                kk1.d.b((kk1.g) obj5, (e23.a) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                kl0.b.b((il0.a) obj5, (kl0.d) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 17:
                m0 m0Var = (m0) obj5;
                GroupCreationActivity groupCreationActivity = (GroupCreationActivity) obj4;
                zc.d dVar3 = (zc.d) obj3;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i28 = GroupCreationActivity.f36131b;
                if (mVar9.n(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    Object objQ12 = mVar9.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ12 == c2565a) {
                        objQ12 = new kb0.d(21);
                        mVar9.K(objQ12);
                    }
                    e23.l lVar3 = (e23.l) objQ12;
                    Object objQ13 = mVar9.q();
                    if (objQ13 == c2565a) {
                        objQ13 = new kb0.d(22);
                        mVar9.K(objQ13);
                    }
                    e23.l lVar4 = (e23.l) objQ13;
                    Object objQ14 = mVar9.q();
                    if (objQ14 == c2565a) {
                        objQ14 = new kb0.d(23);
                        mVar9.K(objQ14);
                    }
                    e23.l lVar5 = (e23.l) objQ14;
                    Object objQ15 = mVar9.q();
                    if (objQ15 == c2565a) {
                        objQ15 = new kb0.d(24);
                        mVar9.K(objQ15);
                    }
                    e23.l lVar6 = (e23.l) objQ15;
                    boolean zR3 = mVar9.r(groupCreationActivity) | mVar9.r(m0Var) | mVar9.r(dVar3);
                    Object objQ16 = mVar9.q();
                    if (zR3 || objQ16 == c2565a) {
                        objQ16 = new k62.k(groupCreationActivity, i18, m0Var, dVar3);
                        mVar9.K(objQ16);
                    }
                    nc.y.b(m0Var, "wizard_route", null, null, lVar3, lVar4, lVar5, lVar6, (e23.l) objQ16, mVar9, 115015728, 540);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 18:
                b0 b0Var = (b0) obj5;
                p1 p1Var4 = (p1) obj4;
                mc mcVar = (mc) obj3;
                mn1.b bVar3 = (mn1.b) obj;
                bVar3.getClass();
                ((km1.c) obj2).getClass();
                ht.a aVar14 = ht.a.f85464a;
                switch (sn1.c.f160416b[bVar3.ordinal()]) {
                    case 1:
                        str = "SleepScoreDurationFactorsClicked";
                        break;
                    case 2:
                        str = "SleepScoreStressFactorsClicked";
                        break;
                    case 3:
                        str = "SleepScoreDeepFactorsClicked";
                        break;
                    case 4:
                        str = "SleepScoreLightFactorsClicked";
                        break;
                    case 5:
                        str = "SleepScoreRemFactorsClicked";
                        break;
                    case 6:
                        str = "SleepScoreAwRestlessnessFactorsClicked";
                        break;
                    default:
                        str = "";
                        break;
                }
                aVar14.getClass();
                ht.a.a(null, str);
                p1Var4.setValue(bVar3);
                ge1.b.T(b0Var, null, null, new kn1.d.a(mcVar, null), 3);
                return Unit.INSTANCE;
            case 19:
                o oVar = (o) obj5;
                e23.l lVar7 = (e23.l) obj4;
                List list2 = (List) obj3;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    String url = oVar.getUrl();
                    f5.k.f68985a.getClass();
                    f5.k.a.C1427a c1427a = f5.k.a.f68987b;
                    r rVarD = x2.d(r.S, 1.0f);
                    boolean zB9 = mVar10.B(lVar7) | mVar10.r(list2);
                    Object objQ17 = mVar10.q();
                    if (zB9) {
                        objQ17 = new k11.h(i17, lVar7, list2);
                        mVar10.K(objQ17);
                    } else {
                        aVar.getClass();
                        if (objQ17 == p3.m.a.f135155b) {
                            objQ17 = new k11.h(i17, lVar7, list2);
                            mVar10.K(objQ17);
                        }
                    }
                    jf.r.a(url, null, w.d(rVarD, false, null, null, (e23.a) objQ17, 15), null, null, c1427a, null, mVar10, 1572912, 1976);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                h1.b((r) obj5, (h2) obj4, (z3.e) obj3, (p3.m) obj, p0.t(385));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                l21.b.b((f01.j) obj3, (e23.l) obj4, (r) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                l3.b.a((n0) obj5, (e23.l) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                l50.b.a((m50.c) obj5, (d2) obj3, (e23.l) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                i71.x xVar = (i71.x) obj5;
                e23.a aVar15 = (e23.a) obj3;
                com.garmin.android.apps.connectmobile.performance.model.b bVar4 = (com.garmin.android.apps.connectmobile.performance.model.b) obj4;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    if (xVar == null || xVar.f92024m || !xVar.f92023l) {
                        mVar11.C(1351089637);
                        e71.m.a aVar16 = e71.m.f63320c;
                        l71.h.i(bVar4, xVar, mVar11, 0);
                        mVar11.f();
                    } else {
                        mVar11.C(1350982842);
                        l71.h.h(aVar15, mVar11, 0);
                        mVar11.f();
                    }
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 25:
                String str2 = (String) obj4;
                r rVar = (r) obj5;
                x0 x0Var = (x0) obj3;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    mh.c(str2, rVar, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar12, 0, 0, 131068);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 26:
                String str3 = (String) obj5;
                e23.a aVar17 = (e23.a) obj3;
                b92.a aVar18 = (b92.a) obj4;
                p3.m mVar13 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar13.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    String upperCase = str3.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarA = x0.a(j92.f.f97934k, ds.e0.e(mVar13), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    r.a aVar19 = r.S;
                    boolean zB10 = mVar13.B(aVar17);
                    Object objQ18 = mVar13.q();
                    if (zB10) {
                        objQ18 = new l72.t(aVar17, 10);
                        mVar13.K(objQ18);
                    } else {
                        aVar.getClass();
                        if (objQ18 == p3.m.a.f135155b) {
                            objQ18 = new l72.t(aVar17, 10);
                            mVar13.K(objQ18);
                        }
                    }
                    r rVarD2 = w.d(aVar19, true, null, null, (e23.a) objQ18, 14);
                    boolean zB11 = mVar13.B(aVar18) | mVar13.B(str3);
                    Object objQ19 = mVar13.q();
                    if (zB11) {
                        objQ19 = new i70.a(aVar18, str3, 7);
                        mVar13.K(objQ19);
                    } else {
                        aVar.getClass();
                        if (objQ19 == p3.m.a.f135155b) {
                            objQ19 = new i70.a(aVar18, str3, 7);
                            mVar13.K(objQ19);
                        }
                    }
                    mh.c(upperCase, v.c((e23.l) objQ19, rVarD2, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, x0VarA, mVar13, 0, 24576, 114684);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                a2.a((y1) obj5, (e23.a) obj3, (z3.e) obj4, (p3.m) obj, p0.t(385));
                return Unit.INSTANCE;
            case 28:
                c1 c1Var = (c1) obj5;
                String str4 = (String) obj4;
                wd wdVar = (wd) obj3;
                p3.m mVar14 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    r.a aVar20 = r.S;
                    r rVarA = c1Var.a(aVar20, 1.0f, true);
                    c2.j.f22691a.getClass();
                    c2.j.d dVar4 = c2.j.f22693c;
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(dVar4, h4.d.a.f81533k, mVar14, 6);
                    int iHashCode2 = Long.hashCode(mVar14.getU());
                    i2 i2VarX2 = mVar14.x();
                    r rVarC2 = h4.k.c(rVarA, mVar14);
                    h5.g.V.getClass();
                    e0.a aVar21 = h5.g.a.f81805b;
                    if (mVar14.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar14.z();
                    if (mVar14.getT()) {
                        mVar14.M(aVar21);
                    } else {
                        mVar14.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar14);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar14);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar14.getT() || !p005kotlin.jvm.internal.s.g(mVar14.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar14, iHashCode2, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar14);
                    u2 u2Var = u2.f22900a;
                    p5.l.f136032b.getClass();
                    p5.l lVarA = p5.l.a(0);
                    boolean zB12 = mVar14.B(wdVar);
                    Object objQ20 = mVar14.q();
                    if (zB12) {
                        objQ20 = new zd(wdVar, 3);
                        mVar14.K(objQ20);
                    } else {
                        aVar.getClass();
                        if (objQ20 == p3.m.a.f135155b) {
                            objQ20 = new zd(wdVar, 3);
                            mVar14.K(objQ20);
                        }
                    }
                    r rVarD3 = w.d(aVar20, false, null, lVarA, (e23.a) objQ20, 11);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarY = c2.l.y(rVarD3, j92.b.f97899b.f97920e);
                    d6.h.f57752b.getClass();
                    mh.c(str4, rVarY, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, null, mVar14, 0, 0, 261116);
                    mVar14.y();
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                h3.c((e23.q) obj5, (k3) obj4, (e23.q) obj3, (p3.m) obj, p0.t(24583));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ m(e23.a aVar, l11.a aVar2, l11.a.d dVar) {
        this.f100851a = 2;
        this.f100852b = aVar;
        this.f100853c = aVar2;
        this.f100854d = dVar;
    }

    public /* synthetic */ m(Object obj, int i14, Object obj2, Object obj3) {
        this.f100851a = i14;
        this.f100853c = obj;
        this.f100852b = obj2;
        this.f100854d = obj3;
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, boolean z14, int i14) {
        this.f100851a = i14;
        this.f100853c = obj;
        this.f100854d = obj2;
        this.f100852b = obj3;
    }

    public /* synthetic */ m(Object obj, Object obj2, o13.h hVar, int i14, int i15) {
        this.f100851a = i15;
        this.f100853c = obj;
        this.f100854d = obj2;
        this.f100852b = hVar;
    }

    public /* synthetic */ m(Object obj, Object obj2, boolean z14, o13.h hVar, int i14, int i15) {
        this.f100851a = i15;
        this.f100853c = obj;
        this.f100852b = obj2;
        this.f100854d = hVar;
    }

    public /* synthetic */ m(String str, r rVar, x0 x0Var) {
        this.f100851a = 25;
        this.f100854d = str;
        this.f100853c = rVar;
        this.f100852b = x0Var;
    }
}
