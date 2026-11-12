package a11;

import a03.n0;
import am.e1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import b82.k1;
import c2.h2;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.accompanist.drawablepainter.DrawablePainter2Kt;
import com.google.android.exoplayer2.C;
import et1.r1;
import et1.w1;
import f5.z0;
import f72.l1;
import gg1.o0;
import i3.a1;
import i3.b1;
import i3.c1;
import i3.d7;
import i3.h1;
import i3.mc;
import i3.mh;
import i3.pc;
import i3.ve;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import l72.p2;
import l72.v2;
import o4.m1;
import o72.a3;
import o72.u1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n1;
import p3.o1;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import s5.x0;
import u1.a2;
import u1.y0;
import v62.k6;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f346k;

    public /* synthetic */ l(rk0.j jVar, e23.l lVar, p1 p1Var, e23.l lVar2, x3 x3Var, o0 o0Var, e23.l lVar3, x3 x3Var2, p1 p1Var2, e23.p pVar) {
        this.f336a = 8;
        this.f339d = jVar;
        this.f340e = lVar;
        this.f338c = p1Var;
        this.f341f = lVar2;
        this.f342g = x3Var;
        this.f344i = o0Var;
        this.f345j = lVar3;
        this.f346k = x3Var2;
        this.f337b = p1Var2;
        this.f343h = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj, Object obj2, Object obj3) {
        p3.m mVar;
        n30.f fVar = (n30.f) this.f339d;
        e23.l lVar = (e23.l) this.f340e;
        a1 a1Var = (a1) this.f341f;
        p1 p1Var = (p1) this.f338c;
        p1 p1Var2 = (p1) this.f342g;
        p1 p1Var3 = (p1) this.f343h;
        n1 n1Var = (n1) this.f345j;
        p1 p1Var4 = (p1) this.f344i;
        n1 n1Var2 = (n1) this.f346k;
        n1 n1Var3 = (n1) this.f337b;
        p3.m mVar2 = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((h2) obj).getClass();
        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(mVar2.getU());
            i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(aVar, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar2);
            } else {
                mVar2.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, mVar2);
            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar2, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar2);
            c2.u uVar = c2.u.f22885a;
            Object objQ = mVar2.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new ky0.k(p1Var, 25);
                mVar2.K(objQ);
            }
            mVar2.L(1765406104);
            g8.a.a(m30.m.class, aVar, g8.i.U(mVar2), Bundle.EMPTY, (e23.l) objQ, mVar2, 24576, 0);
            h4.r.a aVar3 = aVar;
            mVar2.R();
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                mVar2.C(-710771688);
                Drawable drawable = (Drawable) p1Var3.getF182175a();
                if (drawable == null) {
                    mVar2.C(-559085847);
                    mVar2.f();
                    mVar = mVar2;
                } else {
                    mVar2.C(-559085846);
                    y0.a(DrawablePainter2Kt.rememberDrawablePainter(drawable, mVar2, 0), null, c2.l.C(uVar.c(aVar3, h4.d.a.f81528f), 0.0f, 0.0f, 0.0f, w02.b0.x(mVar2, n1Var.getIntValue()), 7), null, null, 0.0f, null, mVar2, 48, 120);
                    mVar = mVar2;
                    mVar.f();
                }
                mVar.f();
            } else {
                mVar = mVar2;
                aVar3 = aVar3;
                mVar.C(-558676863);
                mVar.f();
            }
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA = v2.a(c2.l.y(aVar3, j92.b.f97899b.f97920e), fVar.f123455c, new l72.q(27), mVar, 0);
            k2.h hVar = k2.i.f102406a;
            h4.r.a aVar4 = aVar3;
            long j8 = d92.b.a(mVar).f().f63508c;
            long j14 = d92.b.a(mVar).f().f63509d;
            boolean zB = mVar.B(lVar);
            Object objQ2 = mVar.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new gt1.k(lVar, 19);
                mVar.K(objQ2);
            }
            m30.h.f116346a.getClass();
            p3.m mVar3 = mVar;
            d7.d((e23.a) objQ2, rVarA, hVar, j8, j14, null, m30.h.f116347b, mVar3, 12582912, 96);
            if (((Boolean) p1Var4.getF182175a()).booleanValue() || a1Var.f87409a.c() != pc.PartiallyExpanded || n1Var2.getIntValue() <= 0 || n1Var3.getIntValue() <= 0) {
                mVar3.C(-557283103);
                mVar3.f();
            } else {
                mVar3.C(-557675191);
                m30.g.a(c2.l.C(uVar.c(aVar4, h4.d.a.f81531i), 0.0f, 0.0f, 0.0f, w02.b0.x(mVar3, n1Var3.getIntValue() + n1Var2.getIntValue()), 7), new n30.d(fVar.f123458f.size() > 1, fVar.f123465m), lVar, mVar3, 0);
                mVar3.f();
            }
            mVar3.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0119  */
    /* JADX WARN: Code duplicated, block: B:50:0x013f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0160  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x021b  */
    /* JADX WARN: Code duplicated, block: B:86:0x023d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0285  */
    private final Object b(Object obj, Object obj2, Object obj3) {
        p3.m mVar;
        List list = (List) this.f339d;
        i53.c<pv0.d> cVar = (i53.c) this.f340e;
        nw0.j0 j0Var = (nw0.j0) this.f341f;
        e23.l lVar = (e23.l) this.f342g;
        nw0.r rVar = (nw0.r) this.f343h;
        o53.b0 b0Var = (o53.b0) this.f344i;
        mc mcVar = (mc) this.f345j;
        p1 p1Var = (p1) this.f338c;
        mc mcVar2 = (mc) this.f346k;
        aw0.a aVar = (aw0.a) this.f337b;
        int iIntValue = ((Integer) obj).intValue();
        p3.m mVar2 = (p3.m) obj2;
        int iIntValue2 = ((Integer) obj3).intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= mVar2.k(iIntValue) ? 4 : 2;
        }
        if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            pv0.b bVar = (pv0.b) list.get(iIntValue);
            ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
            for (pv0.d dVar : cVar) {
                arrayList.add(pv0.d.a(dVar, aVar.a(Long.valueOf(dVar.f141358a), dVar.f141361d), null, 1015));
                bVar = bVar;
            }
            pv0.b bVar2 = bVar;
            List<pv0.d> listA = pv0.f.a(arrayList, bVar2);
            String str = j0Var instanceof nw0.j0.b ? ((nw0.j0.b) j0Var).f128056a : "";
            str.getClass();
            String lowerCase = d53.w.i0(str).toString().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (!d53.w.J(lowerCase)) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : listA) {
                    String str2 = ((pv0.d) obj4).f141361d;
                    if (str2 != null && d53.w.z(str2, str, true)) {
                        arrayList2.add(obj4);
                    }
                }
                listA = arrayList2;
            }
            i53.c cVarE = i53.a.e(p13.h0.N0(listA, new pv0.e()));
            boolean zB = mVar2.B(lVar) | mVar2.k(bVar2 == null ? -1 : bVar2.ordinal());
            Object objQ = mVar2.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ = new nw0.q.a(lVar, bVar2, null);
                mVar2.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new nw0.q.a(lVar, bVar2, null);
                    mVar2.K(objQ);
                }
            }
            l0.e((e23.p) objQ, bVar2, mVar2);
            if (bVar2 == null) {
                mVar2.C(868224576);
                boolean zR = mVar2.r(rVar);
                Object objQ2 = mVar2.q();
                if (zR) {
                    objQ2 = new nw0.m(rVar, 0);
                    mVar2.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new nw0.m(rVar, 0);
                        mVar2.K(objQ2);
                    }
                }
                e23.l lVar2 = (e23.l) objQ2;
                boolean zR2 = mVar2.r(b0Var) | mVar2.B(mcVar);
                Object objQ3 = mVar2.q();
                if (zR2) {
                    objQ3 = new nw0.n(b0Var, mcVar, 0);
                    mVar2.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new nw0.n(b0Var, mcVar, 0);
                        mVar2.K(objQ3);
                    }
                }
                wv0.i.b(cVarE, lVar2, (e23.a) objQ3, mVar2, pv0.d.f141356k);
                mVar2.f();
            } else if (og2.k.y(bVar2)) {
                mVar2.C(1145567623);
                if (j0Var instanceof nw0.j0.a) {
                    mVar2.C(1145597073);
                    boolean zB2 = mVar2.B(p1Var) | mVar2.r(b0Var) | mVar2.B(mcVar2);
                    Object objQ4 = mVar2.q();
                    if (zB2) {
                        objQ4 = new kh0.e(b0Var, p1Var, mcVar2, 2);
                        mVar2.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new kh0.e(b0Var, p1Var, mcVar2, 2);
                            mVar2.K(objQ4);
                        }
                    }
                    e23.l lVar3 = (e23.l) objQ4;
                    boolean zR3 = mVar2.r(rVar);
                    Object objQ5 = mVar2.q();
                    if (zR3) {
                        objQ5 = new nw0.m(rVar, 1);
                        mVar2.K(objQ5);
                    } else {
                        aVar2.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new nw0.m(rVar, 1);
                            mVar2.K(objQ5);
                        }
                    }
                    e23.l lVar4 = (e23.l) objQ5;
                    boolean zR4 = mVar2.r(b0Var) | mVar2.B(mcVar);
                    Object objQ6 = mVar2.q();
                    if (zR4) {
                        objQ6 = new nw0.n(b0Var, mcVar, 1);
                        mVar2.K(objQ6);
                    } else {
                        aVar2.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new nw0.n(b0Var, mcVar, 1);
                            mVar2.K(objQ6);
                        }
                    }
                    nw0.q.d(cVarE, lVar3, lVar4, (e23.a) objQ6, mVar2, pv0.d.f141356k);
                    mVar = mVar2;
                    mVar.f();
                } else {
                    mVar = mVar2;
                    mVar.C(1146264751);
                    boolean zR5 = mVar.r(rVar);
                    Object objQ7 = mVar.q();
                    if (zR5) {
                        objQ7 = new nw0.m(rVar, 2);
                        mVar.K(objQ7);
                    } else {
                        aVar2.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new nw0.m(rVar, 2);
                            mVar.K(objQ7);
                        }
                    }
                    e23.l lVar5 = (e23.l) objQ7;
                    boolean zR6 = mVar.r(b0Var) | mVar.B(mcVar);
                    Object objQ8 = mVar.q();
                    if (zR6) {
                        objQ8 = new nw0.n(b0Var, mcVar, 2);
                        mVar.K(objQ8);
                    } else {
                        aVar2.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new nw0.n(b0Var, mcVar, 2);
                            mVar.K(objQ8);
                        }
                    }
                    wv0.i.h(cVarE, lVar5, (e23.a) objQ8, z3.f.c(-1122619945, new a6.c(rVar, 12), mVar), mVar, pv0.d.f141356k | 3072);
                    mVar.f();
                }
                mVar.f();
            } else {
                mVar2.C(868290326);
                boolean zR7 = mVar2.r(rVar);
                Object objQ9 = mVar2.q();
                if (zR7) {
                    objQ9 = new nw0.m(rVar, 3);
                    mVar2.K(objQ9);
                } else {
                    aVar2.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new nw0.m(rVar, 3);
                        mVar2.K(objQ9);
                    }
                }
                wv0.i.d(cVarE, (e23.l) objQ9, mVar2, pv0.d.f141356k);
                mVar2.f();
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
    private final Object c(Object obj, Object obj2, Object obj3) {
        String strValueOf;
        String note;
        Set set;
        cy0.l lVar = (cy0.l) this.f340e;
        b63.o oVar = (b63.o) this.f341f;
        Map map = (Map) this.f342g;
        String str = (String) this.f339d;
        i53.c cVar = (i53.c) this.f343h;
        fy0.e eVar = (fy0.e) this.f344i;
        Set set2 = (Set) this.f345j;
        Set set3 = (Set) this.f346k;
        p1 p1Var = (p1) this.f338c;
        p1 p1Var2 = (p1) this.f337b;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            if (lVar == null || (strValueOf = lVar.getDate()) == null) {
                strValueOf = String.valueOf(oVar);
            }
            Object obj4 = map.get(strValueOf);
            if (obj4 == null) {
                obj4 = lVar;
            }
            cy0.l lVar2 = (cy0.l) obj4;
            if (lVar2 == null || (note = lVar2.getNote()) == null) {
                note = "";
            }
            boolean zR = mVar.r(lVar) | mVar.r(map) | mVar.B(strValueOf) | mVar.r(set2) | mVar.r(set3);
            Object objQ = mVar.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                set = set3;
                aa2.p pVar = new aa2.p(lVar, map, strValueOf, set2, set, p1Var, 20);
                mVar.K(pVar);
                objQ = pVar;
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    set = set3;
                    aa2.p pVar2 = new aa2.p(lVar, map, strValueOf, set2, set, p1Var, 20);
                    mVar.K(pVar2);
                    objQ = pVar2;
                } else {
                    set = set3;
                }
            }
            e23.l lVar3 = (e23.l) objQ;
            boolean zR2 = mVar.r(set) | mVar.r(set2) | mVar.r(map);
            Object objQ2 = mVar.q();
            if (zR2) {
                ob0.e eVar2 = new ob0.e(set, set2, p1Var2, map, p1Var, 4);
                mVar.K(eVar2);
                objQ2 = eVar2;
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    ob0.e eVar3 = new ob0.e(set, set2, p1Var2, map, p1Var, 4);
                    mVar.K(eVar3);
                    objQ2 = eVar3;
                }
            }
            oy0.f.a(str, note, cVar, eVar, lVar3, (e23.p) objQ2, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0555  */
    /* JADX WARN: Code duplicated, block: B:103:0x0564  */
    /* JADX WARN: Code duplicated, block: B:105:0x0572  */
    /* JADX WARN: Code duplicated, block: B:109:0x0590  */
    /* JADX WARN: Code duplicated, block: B:111:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:113:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:118:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:119:0x0618  */
    /* JADX WARN: Code duplicated, block: B:121:0x0623  */
    /* JADX WARN: Code duplicated, block: B:123:0x0629  */
    /* JADX WARN: Code duplicated, block: B:137:0x06be  */
    /* JADX WARN: Code duplicated, block: B:139:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:142:0x0706  */
    /* JADX WARN: Code duplicated, block: B:144:0x070a  */
    /* JADX WARN: Code duplicated, block: B:146:0x070e  */
    /* JADX WARN: Code duplicated, block: B:24:0x010f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0118  */
    /* JADX WARN: Code duplicated, block: B:27:0x011c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0139  */
    /* JADX WARN: Code duplicated, block: B:47:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:49:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:55:0x022e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0231  */
    /* JADX WARN: Code duplicated, block: B:60:0x0279  */
    /* JADX WARN: Code duplicated, block: B:64:0x02be  */
    /* JADX WARN: Code duplicated, block: B:68:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x033a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0343  */
    /* JADX WARN: Code duplicated, block: B:74:0x0347  */
    /* JADX WARN: Code duplicated, block: B:77:0x035c  */
    /* JADX WARN: Code duplicated, block: B:80:0x036d  */
    /* JADX WARN: Code duplicated, block: B:84:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x040a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x040f  */
    /* JADX WARN: Code duplicated, block: B:91:0x049b  */
    /* JADX WARN: Code duplicated, block: B:94:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:95:0x0511  */
    /* JADX WARN: Code duplicated, block: B:97:0x0548  */
    /* JADX WARN: Code duplicated, block: B:99:0x0551  */
    private final Object d(Object obj, Object obj2, Object obj3) {
        e23.l lVar;
        p1 p1Var;
        h5.g.a.f fVar;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        List<jk0.n> list;
        h4.r.a aVar;
        j92.b bVar;
        j92.e eVar;
        float f14;
        Object objQ;
        p3.m.a.C2565a c2565a;
        String str;
        String str2;
        boolean zB;
        Object objQ2;
        String strQ;
        boolean zB2;
        Object objQ3;
        boolean zB3;
        Object objQ4;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarX2;
        h4.r rVarC2;
        h5.e0.a aVar2;
        h5.g.a.e eVar2;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar2;
        j92.b bVar3;
        h5.g.a.f fVar2;
        i53.f fVar3;
        c2.z zVarA2;
        int iHashCode3;
        i2 i2VarX3;
        h4.r rVarC3;
        e23.l lVar2;
        boolean zB4;
        Object objQ5;
        i53.c cVar;
        p1 p1Var2;
        boolean zB5;
        Object objQ6;
        boolean zB6;
        Object objQ7;
        final int i14;
        final int i15;
        final rk0.j jVar = (rk0.j) this.f339d;
        final e23.l lVar3 = (e23.l) this.f340e;
        p1 p1Var3 = (p1) this.f338c;
        final e23.l lVar4 = (e23.l) this.f341f;
        x3 x3Var = (x3) this.f342g;
        o0 o0Var = (o0) this.f344i;
        e23.l lVar5 = (e23.l) this.f345j;
        x3 x3Var2 = (x3) this.f346k;
        p1 p1Var4 = (p1) this.f337b;
        e23.p pVar = (e23.p) this.f343h;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.t) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarD = c2.l.D(a2.b(x2.c(aVar3, 1.0f), a2.a(mVar), true));
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81536n;
            c2.z zVarA3 = c2.y.a(kVar, aVar4, mVar, 0);
            int iHashCode4 = Long.hashCode(mVar.getU());
            i2 i2VarX4 = mVar.x();
            h4.r rVarC4 = h4.k.c(rVarD, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar5);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, zVarA3, mVar);
            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
            b4.c(c1623g2, i2VarX4, mVar);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (mVar.getT()) {
                lVar = lVar5;
                p1Var = p1Var4;
            } else {
                p1Var = p1Var4;
                lVar = lVar5;
                if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode4))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC4, mVar);
                c2.b0 b0Var = c2.b0.f22601a;
                h4.r rVarE = u1.n.e(aVar3, vb.h.e(d92.b.f58623a, mVar), m1.f128891a);
                zVarA = c2.y.a(kVar, aVar4, mVar, 0);
                iHashCode = Long.hashCode(mVar.getU());
                i2VarX = mVar.x();
                rVarC = h4.k.c(rVarE, mVar);
                if (mVar.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar5);
                } else {
                    mVar.c();
                }
                b4.c(eVar3, zVarA, mVar);
                b4.c(c1623g2, i2VarX, mVar);
                if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar, iHashCode, bVar4);
                }
                b4.c(fVar, rVarC, mVar);
                jk0.j jVar2 = jVar.f153165a;
                list = jVar2.f99270i;
                p3.m.a aVar6 = p3.m.f135153a;
                if (list == null && p13.h0.L(list)) {
                    mVar.C(1583263954);
                    d92.b.f58625c.getClass();
                    h4.r rVarC5 = c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7);
                    List<jk0.n> list2 = jVar2.f99270i;
                    ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((jk0.n) it.next()).f99298d);
                    }
                    boolean zB7 = mVar.B(lVar3) | mVar.r(jVar);
                    Object objQ8 = mVar.q();
                    if (zB7) {
                        i15 = 0;
                        objQ8 = new e23.a() { // from class: rk0.c
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r1v2, types: [p13.j0] */
                            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
                            @Override // e23.a
                            public final Object invoke() {
                                ?? arrayList2;
                                switch (i15) {
                                    case 0:
                                        lVar3.invoke(jVar.f153165a.f99270i);
                                        break;
                                    case 1:
                                        Collection collection = jVar.f153165a.f99270i;
                                        if (collection == null) {
                                            collection = p13.j0.f134944a;
                                        }
                                        lVar3.invoke(collection);
                                        break;
                                    default:
                                        List<jk0.s> list3 = jVar.f153165a.f99268g;
                                        if (list3 != null) {
                                            arrayList2 = new ArrayList(p13.y.r(list3, 10));
                                            Iterator it3 = list3.iterator();
                                            while (it3.hasNext()) {
                                                arrayList2.add(og2.k.L((jk0.s) it3.next()));
                                            }
                                        } else {
                                            arrayList2 = p13.j0.f134944a;
                                        }
                                        lVar3.invoke(arrayList2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ8);
                    } else {
                        aVar6.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            i15 = 0;
                            objQ8 = new e23.a() { // from class: rk0.c
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r1v2, types: [p13.j0] */
                                /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
                                @Override // e23.a
                                public final Object invoke() {
                                    ?? arrayList2;
                                    switch (i15) {
                                        case 0:
                                            lVar3.invoke(jVar.f153165a.f99270i);
                                            break;
                                        case 1:
                                            Collection collection = jVar.f153165a.f99270i;
                                            if (collection == null) {
                                                collection = p13.j0.f134944a;
                                            }
                                            lVar3.invoke(collection);
                                            break;
                                        default:
                                            List<jk0.s> list3 = jVar.f153165a.f99268g;
                                            if (list3 != null) {
                                                arrayList2 = new ArrayList(p13.y.r(list3, 10));
                                                Iterator it3 = list3.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList2.add(og2.k.L((jk0.s) it3.next()));
                                                }
                                            } else {
                                                arrayList2 = p13.j0.f134944a;
                                            }
                                            lVar3.invoke(arrayList2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ8);
                        } else {
                            i15 = 0;
                        }
                    }
                    rk0.h.e(rVarC5, arrayList, (e23.a) objQ8, mVar, i15);
                    mVar.f();
                } else {
                    mVar.C(1583670457);
                    mVar.f();
                }
                aVar = h4.r.S;
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                float f15 = eVar.f97918c;
                f14 = eVar.f97920e;
                c2.l.f(x2.h(aVar, f15), mVar);
                h4.r rVarZ = c2.l.z(aVar, f14, eVar.f97918c);
                objQ = mVar.q();
                aVar6.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new r82.e(22);
                    mVar.K(objQ);
                }
                h4.r rVarC6 = p5.v.c((e23.l) objQ, rVarZ, true);
                s62.a.f157643a.getClass();
                uk0.q.a(rVarC6, l1.a(t62.c.f162799a), null, j92.b.f97901d.f97906e, jVar2.f99262a, null, mVar, 196992, 0);
                h4.r rVarA = c2.l.A(aVar, f14, 0.0f, 2);
                str = jVar2.f99267f;
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                d92.b.f58624b.getClass();
                x0 x0Var = j92.f.f97933j;
                x0 x0VarF = d92.c.f(x0Var, mVar);
                String strQ2 = gl1.y.Q(mVar, R.string.lbl_read_more);
                String strQ3 = gl1.y.Q(mVar, R.string.lbl_read_less);
                x0 x0VarA = x0.a(x0Var, ds.e0.e(mVar), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                zB = mVar.B(p1Var3);
                objQ2 = mVar.q();
                if (zB || objQ2 == c2565a) {
                    objQ2 = new qk0.m(p1Var3, 28);
                    mVar.K(objQ2);
                }
                g02.n.a(rVarA, str2, 4, x0VarF, strQ2, strQ3, x0VarA, null, null, (e23.a) objQ2, mVar, 384);
                rk0.h.a(c2.l.y(aVar, f14), jVar2, mVar, 0);
                strQ = gl1.y.Q(mVar, R.string.add_photos);
                l72.f0.a aVar7 = l72.f0.a.f111000a;
                String strQ4 = gl1.y.Q(mVar, R.string.social_photo);
                u4.d dVarA = k6.a(t62.b.f162798a);
                zB2 = mVar.B(strQ);
                objQ3 = mVar.q();
                if (zB2 || objQ3 == c2565a) {
                    objQ3 = new o60.b(strQ, 23);
                    mVar.K(objQ3);
                }
                h4.r rVarF = x2.f(c2.l.z(p5.v.c((e23.l) objQ3, aVar, false), f14, eVar.f97921f), 1.0f);
                zB3 = mVar.B(lVar3) | mVar.r(jVar);
                objQ4 = mVar.q();
                if (zB3 || objQ4 == c2565a) {
                    final int i16 = 1;
                    objQ4 = new e23.a() { // from class: rk0.c
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r1v2, types: [p13.j0] */
                        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
                        @Override // e23.a
                        public final Object invoke() {
                            ?? arrayList2;
                            switch (i16) {
                                case 0:
                                    lVar3.invoke(jVar.f153165a.f99270i);
                                    break;
                                case 1:
                                    Collection collection = jVar.f153165a.f99270i;
                                    if (collection == null) {
                                        collection = p13.j0.f134944a;
                                    }
                                    lVar3.invoke(collection);
                                    break;
                                default:
                                    List<jk0.s> list3 = jVar.f153165a.f99268g;
                                    if (list3 != null) {
                                        arrayList2 = new ArrayList(p13.y.r(list3, 10));
                                        Iterator it3 = list3.iterator();
                                        while (it3.hasNext()) {
                                            arrayList2.add(og2.k.L((jk0.s) it3.next()));
                                        }
                                    } else {
                                        arrayList2 = p13.j0.f134944a;
                                    }
                                    lVar3.invoke(arrayList2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ4);
                }
                aVar7.h(0, 8, (e23.a) objQ4, rVarF, strQ4, mVar, dVarA, false);
                mVar.y();
                h4.d.f81522a.getClass();
                h4.g.b bVar5 = h4.d.a.f81535m;
                c2.j.f22691a.getClass();
                s2VarA = q2.a(c2.j.f22692b, bVar5, mVar, 48);
                x1 x1Var2 = p3.n.f135158a;
                iHashCode2 = Long.hashCode(mVar.getU());
                i2VarX2 = mVar.x();
                rVarC2 = h4.k.c(aVar, mVar);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (mVar.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar2);
                } else {
                    mVar.c();
                }
                eVar2 = h5.g.a.f81810g;
                b4.c(eVar2, s2VarA, mVar);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarX2, mVar);
                bVar2 = h5.g.a.f81813j;
                if (mVar.getT()) {
                    bVar3 = bVar;
                } else {
                    bVar3 = bVar;
                    if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                    }
                    fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC2, mVar);
                    mh.c(gl1.y.Q(mVar, R.string.concept_gear), v2.a(c2.l.C(c2.l.C(u2.f22900a.a(aVar, 1.0f, true), eVar.f97920e, 0.0f, 0.0f, 0.0f, 14), 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), p13.h0.L((i53.f) x3Var.getF182175a()), new qk0.a(24), mVar, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97930g), mVar, 0, 0, 131068);
                    if (p13.h0.L((i53.f) x3Var.getF182175a())) {
                        mVar.C(-1162070924);
                        zB6 = mVar.B(lVar4) | mVar.r(jVar);
                        objQ7 = mVar.q();
                        if (!zB6 || objQ7 == c2565a) {
                            i14 = 2;
                            objQ7 = new e23.a() { // from class: rk0.c
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r1v2, types: [p13.j0] */
                                /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
                                @Override // e23.a
                                public final Object invoke() {
                                    ?? arrayList2;
                                    switch (i14) {
                                        case 0:
                                            lVar4.invoke(jVar.f153165a.f99270i);
                                            break;
                                        case 1:
                                            Collection collection = jVar.f153165a.f99270i;
                                            if (collection == null) {
                                                collection = p13.j0.f134944a;
                                            }
                                            lVar4.invoke(collection);
                                            break;
                                        default:
                                            List<jk0.s> list3 = jVar.f153165a.f99268g;
                                            if (list3 != null) {
                                                arrayList2 = new ArrayList(p13.y.r(list3, 10));
                                                Iterator it3 = list3.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList2.add(og2.k.L((jk0.s) it3.next()));
                                                }
                                            } else {
                                                arrayList2 = p13.j0.f134944a;
                                            }
                                            lVar4.invoke(arrayList2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ7);
                        } else {
                            i14 = 2;
                        }
                        mh.c(gl1.y.Q(mVar, R.string.lbl_edit), v2.a(c2.l.C(c2.l.A(u1.w.d(aVar, false, null, null, (e23.a) objQ7, 15), f14, 0.0f, i14), 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), p13.h0.L((i53.f) x3Var.getF182175a()), new qk0.a(25), mVar, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97932i, ds.e0.e(mVar), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar, 0, 0, 131068);
                        mVar.f();
                    } else {
                        mVar.C(-1161283524);
                        c2.l.f(x2.u(aVar, f14), mVar);
                        mVar.f();
                    }
                    mVar.y();
                    fVar3 = (i53.f) x3Var.getF182175a();
                    fVar3.getClass();
                    if (fVar3.isEmpty()) {
                        mVar.C(-396481307);
                        j92.d dVar = j92.b.f97900c;
                        k2.h hVarA = k2.i.a(dVar.f97911c);
                        long jA = d92.b.a(mVar).c().a();
                        float f16 = dVar.f97911c;
                        bVar3.getClass();
                        float f17 = dVar.f97912d;
                        bVar3.getClass();
                        float f18 = dVar.f97912d;
                        bVar3.getClass();
                        ve.a(c2.l.B(aVar, f18, f16, dVar.f97912d, f17), hVarA, jA, 0L, 0.0f, 0.0f, null, z3.f.c(1239109769, new b71.n(lVar4, 16, (byte) 0), mVar), mVar, 12582912, 120);
                        mVar.f();
                    } else {
                        mVar.C(-395415558);
                        bVar3.getClass();
                        h4.r rVarA2 = c2.l.A(aVar, eVar.f97920e, 0.0f, 2);
                        bVar3.getClass();
                        zVarA2 = c2.y.a(c2.j.i(eVar.f97918c), h4.d.a.f81536n, mVar, 0);
                        iHashCode3 = Long.hashCode(mVar.getU());
                        i2VarX3 = mVar.x();
                        rVarC3 = h4.k.c(rVarA2, mVar);
                        if (mVar.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar2);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar2, zVarA2, mVar);
                        b4.c(c1623g, i2VarX3, mVar);
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar, iHashCode3, bVar2);
                        }
                        b4.c(fVar2, rVarC3, mVar);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        mVar.C(540768159);
                        for (uk0.g gVar : (i53.f) x3Var.getF182175a()) {
                            mVar.N(540770024, gVar.f171812a);
                            h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                            lVar2 = lVar;
                            zB4 = mVar.B(lVar2) | mVar.r(gVar);
                            objQ5 = mVar.q();
                            if (zB4 || objQ5 == p3.m.a.f135155b) {
                                objQ5 = new qn0.f(29, lVar2, gVar);
                                mVar.K(objQ5);
                            }
                            uk0.f.a(rVarF2, gVar, o0Var, (e23.a) objQ5, mVar, 6);
                            mVar.Q();
                            lVar = lVar2;
                        }
                        mVar.f();
                        mVar.y();
                        mVar.f();
                    }
                    mVar.C(680013310);
                    cVar = (i53.c) x3Var2.getF182175a();
                    if (p13.h0.L((i53.f) x3Var.getF182175a())) {
                        mVar.C(323839057);
                        h4.r.a aVar8 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        c2.l.f(x2.h(aVar8, j92.b.f97899b.f97920e), mVar);
                        mVar.f();
                    } else {
                        mVar.C(323942845);
                        mVar.f();
                    }
                    if (cVar != null || cVar.isEmpty()) {
                        p1Var2 = p1Var;
                        mVar.C(324465660);
                        p2 p2Var = p2.f111205a;
                        String strQ5 = gl1.y.Q(mVar, R.string.add_default_activities);
                        rk0.o.f153236a.getClass();
                        z3.e eVar4 = rk0.o.f153237b;
                        zB5 = mVar.B(p1Var2) | mVar.B(pVar);
                        objQ6 = mVar.q();
                        if (zB5 || objQ6 == p3.m.a.f135155b) {
                            objQ6 = new hl1.s(p1Var2, pVar);
                            mVar.K(objQ6);
                        }
                        p2Var.g(strQ5, null, null, null, eVar4, false, false, (e23.a) objQ6, mVar, 24576, 238);
                        mVar.f();
                    } else {
                        mVar.C(324020686);
                        p2 p2Var2 = p2.f111205a;
                        String strQ6 = gl1.y.Q(mVar, R.string.default_activities);
                        uk0.i.f171830a.getClass();
                        String strB = uk0.i.b(cVar, mVar, 384);
                        String str3 = strB == null ? "" : strB;
                        p1 p1Var5 = p1Var;
                        boolean zB8 = mVar.B(p1Var5) | mVar.B(pVar) | mVar.B(cVar);
                        Object objQ9 = mVar.q();
                        if (zB8 || objQ9 == p3.m.a.f135155b) {
                            objQ9 = new q42.v(cVar, 13, p1Var5, pVar);
                            mVar.K(objQ9);
                        }
                        p2Var2.h(strQ6, str3, null, null, null, false, false, null, null, null, (e23.a) objQ9, mVar, 0, 0, 1020);
                        mVar.f();
                    }
                    Unit unit = Unit.INSTANCE;
                    mVar.f();
                    h4.r.a aVar9 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar9, j92.b.f97899b.f97921f), mVar);
                    mVar.y();
                    x1 x1Var3 = p3.n.f135158a;
                }
                v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
                fVar2 = h5.g.a.f81807d;
                b4.c(fVar2, rVarC2, mVar);
                mh.c(gl1.y.Q(mVar, R.string.concept_gear), v2.a(c2.l.C(c2.l.C(u2.f22900a.a(aVar, 1.0f, true), eVar.f97920e, 0.0f, 0.0f, 0.0f, 14), 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), p13.h0.L((i53.f) x3Var.getF182175a()), new qk0.a(24), mVar, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97930g), mVar, 0, 0, 131068);
                if (p13.h0.L((i53.f) x3Var.getF182175a())) {
                    mVar.C(-1162070924);
                    zB6 = mVar.B(lVar4) | mVar.r(jVar);
                    objQ7 = mVar.q();
                    if (zB6) {
                        i14 = 2;
                        objQ7 = new e23.a() { // from class: rk0.c
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r1v2, types: [p13.j0] */
                            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
                            @Override // e23.a
                            public final Object invoke() {
                                ?? arrayList2;
                                switch (i14) {
                                    case 0:
                                        lVar4.invoke(jVar.f153165a.f99270i);
                                        break;
                                    case 1:
                                        Collection collection = jVar.f153165a.f99270i;
                                        if (collection == null) {
                                            collection = p13.j0.f134944a;
                                        }
                                        lVar4.invoke(collection);
                                        break;
                                    default:
                                        List<jk0.s> list3 = jVar.f153165a.f99268g;
                                        if (list3 != null) {
                                            arrayList2 = new ArrayList(p13.y.r(list3, 10));
                                            Iterator it3 = list3.iterator();
                                            while (it3.hasNext()) {
                                                arrayList2.add(og2.k.L((jk0.s) it3.next()));
                                            }
                                        } else {
                                            arrayList2 = p13.j0.f134944a;
                                        }
                                        lVar4.invoke(arrayList2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ7);
                    } else {
                        i14 = 2;
                        objQ7 = new e23.a() { // from class: rk0.c
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r1v2, types: [p13.j0] */
                            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
                            @Override // e23.a
                            public final Object invoke() {
                                ?? arrayList2;
                                switch (i14) {
                                    case 0:
                                        lVar4.invoke(jVar.f153165a.f99270i);
                                        break;
                                    case 1:
                                        Collection collection = jVar.f153165a.f99270i;
                                        if (collection == null) {
                                            collection = p13.j0.f134944a;
                                        }
                                        lVar4.invoke(collection);
                                        break;
                                    default:
                                        List<jk0.s> list3 = jVar.f153165a.f99268g;
                                        if (list3 != null) {
                                            arrayList2 = new ArrayList(p13.y.r(list3, 10));
                                            Iterator it3 = list3.iterator();
                                            while (it3.hasNext()) {
                                                arrayList2.add(og2.k.L((jk0.s) it3.next()));
                                            }
                                        } else {
                                            arrayList2 = p13.j0.f134944a;
                                        }
                                        lVar4.invoke(arrayList2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ7);
                    }
                    mh.c(gl1.y.Q(mVar, R.string.lbl_edit), v2.a(c2.l.C(c2.l.A(u1.w.d(aVar, false, null, null, (e23.a) objQ7, 15), f14, 0.0f, i14), 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), p13.h0.L((i53.f) x3Var.getF182175a()), new qk0.a(25), mVar, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97932i, ds.e0.e(mVar), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar, 0, 0, 131068);
                    mVar.f();
                } else {
                    mVar.C(-1161283524);
                    c2.l.f(x2.u(aVar, f14), mVar);
                    mVar.f();
                }
                mVar.y();
                fVar3 = (i53.f) x3Var.getF182175a();
                fVar3.getClass();
                if (fVar3.isEmpty()) {
                    mVar.C(-396481307);
                    j92.d dVar2 = j92.b.f97900c;
                    k2.h hVarA2 = k2.i.a(dVar2.f97911c);
                    long jA2 = d92.b.a(mVar).c().a();
                    float f19 = dVar2.f97911c;
                    bVar3.getClass();
                    float f110 = dVar2.f97912d;
                    bVar3.getClass();
                    float f111 = dVar2.f97912d;
                    bVar3.getClass();
                    ve.a(c2.l.B(aVar, f111, f19, dVar2.f97912d, f110), hVarA2, jA2, 0L, 0.0f, 0.0f, null, z3.f.c(1239109769, new b71.n(lVar4, 16, (byte) 0), mVar), mVar, 12582912, 120);
                    mVar.f();
                } else {
                    mVar.C(-395415558);
                    bVar3.getClass();
                    h4.r rVarA3 = c2.l.A(aVar, eVar.f97920e, 0.0f, 2);
                    bVar3.getClass();
                    zVarA2 = c2.y.a(c2.j.i(eVar.f97918c), h4.d.a.f81536n, mVar, 0);
                    iHashCode3 = Long.hashCode(mVar.getU());
                    i2VarX3 = mVar.x();
                    rVarC3 = h4.k.c(rVarA3, mVar);
                    if (mVar.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar2);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, zVarA2, mVar);
                    b4.c(c1623g, i2VarX3, mVar);
                    if (mVar.getT()) {
                        v.h.z(iHashCode3, mVar, iHashCode3, bVar2);
                    } else {
                        v.h.z(iHashCode3, mVar, iHashCode3, bVar2);
                    }
                    b4.c(fVar2, rVarC3, mVar);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    mVar.C(540768159);
                    while (r0.hasNext()) {
                        mVar.N(540770024, gVar.f171812a);
                        h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                        lVar2 = lVar;
                        zB4 = mVar.B(lVar2) | mVar.r(gVar);
                        objQ5 = mVar.q();
                        if (zB4) {
                            objQ5 = new qn0.f(29, lVar2, gVar);
                            mVar.K(objQ5);
                        } else {
                            objQ5 = new qn0.f(29, lVar2, gVar);
                            mVar.K(objQ5);
                        }
                        uk0.f.a(rVarF3, gVar, o0Var, (e23.a) objQ5, mVar, 6);
                        mVar.Q();
                        lVar = lVar2;
                    }
                    mVar.f();
                    mVar.y();
                    mVar.f();
                }
                mVar.C(680013310);
                cVar = (i53.c) x3Var2.getF182175a();
                if (p13.h0.L((i53.f) x3Var.getF182175a())) {
                    mVar.C(323839057);
                    h4.r.a aVar10 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar10, j92.b.f97899b.f97920e), mVar);
                    mVar.f();
                } else {
                    mVar.C(323942845);
                    mVar.f();
                }
                if (cVar != null) {
                    p1Var2 = p1Var;
                    mVar.C(324465660);
                    p2 p2Var3 = p2.f111205a;
                    String strQ7 = gl1.y.Q(mVar, R.string.add_default_activities);
                    rk0.o.f153236a.getClass();
                    z3.e eVar5 = rk0.o.f153237b;
                    zB5 = mVar.B(p1Var2) | mVar.B(pVar);
                    objQ6 = mVar.q();
                    if (zB5) {
                        objQ6 = new hl1.s(p1Var2, pVar);
                        mVar.K(objQ6);
                    } else {
                        objQ6 = new hl1.s(p1Var2, pVar);
                        mVar.K(objQ6);
                    }
                    p2Var3.g(strQ7, null, null, null, eVar5, false, false, (e23.a) objQ6, mVar, 24576, 238);
                    mVar.f();
                } else {
                    p1Var2 = p1Var;
                    mVar.C(324465660);
                    p2 p2Var4 = p2.f111205a;
                    String strQ8 = gl1.y.Q(mVar, R.string.add_default_activities);
                    rk0.o.f153236a.getClass();
                    z3.e eVar6 = rk0.o.f153237b;
                    zB5 = mVar.B(p1Var2) | mVar.B(pVar);
                    objQ6 = mVar.q();
                    if (zB5) {
                        objQ6 = new hl1.s(p1Var2, pVar);
                        mVar.K(objQ6);
                    } else {
                        objQ6 = new hl1.s(p1Var2, pVar);
                        mVar.K(objQ6);
                    }
                    p2Var4.g(strQ8, null, null, null, eVar6, false, false, (e23.a) objQ6, mVar, 24576, 238);
                    mVar.f();
                }
                Unit unit2 = Unit.INSTANCE;
                mVar.f();
                h4.r.a aVar11 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.h(aVar11, j92.b.f97899b.f97921f), mVar);
                mVar.y();
                x1 x1Var4 = p3.n.f135158a;
            }
            v.h.z(iHashCode4, mVar, iHashCode4, bVar4);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC4, mVar);
            c2.b0 b0Var4 = c2.b0.f22601a;
            h4.r rVarE2 = u1.n.e(aVar3, vb.h.e(d92.b.f58623a, mVar), m1.f128891a);
            zVarA = c2.y.a(kVar, aVar4, mVar, 0);
            iHashCode = Long.hashCode(mVar.getU());
            i2VarX = mVar.x();
            rVarC = h4.k.c(rVarE2, mVar);
            if (mVar.F() != null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar5);
            } else {
                mVar.c();
            }
            b4.c(eVar3, zVarA, mVar);
            b4.c(c1623g2, i2VarX, mVar);
            if (mVar.getT()) {
                v.h.z(iHashCode, mVar, iHashCode, bVar4);
            } else {
                v.h.z(iHashCode, mVar, iHashCode, bVar4);
            }
            b4.c(fVar, rVarC, mVar);
            jk0.j jVar3 = jVar.f153165a;
            list = jVar3.f99270i;
            p3.m.a aVar12 = p3.m.f135153a;
            if (list == null) {
                mVar.C(1583670457);
                mVar.f();
            } else {
                mVar.C(1583670457);
                mVar.f();
            }
            aVar = h4.r.S;
            d92.b.f58623a.getClass();
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            float f112 = eVar.f97918c;
            f14 = eVar.f97920e;
            c2.l.f(x2.h(aVar, f112), mVar);
            h4.r rVarZ2 = c2.l.z(aVar, f14, eVar.f97918c);
            objQ = mVar.q();
            aVar12.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new r82.e(22);
                mVar.K(objQ);
            }
            h4.r rVarC7 = p5.v.c((e23.l) objQ, rVarZ2, true);
            s62.a.f157643a.getClass();
            uk0.q.a(rVarC7, l1.a(t62.c.f162799a), null, j92.b.f97901d.f97906e, jVar3.f99262a, null, mVar, 196992, 0);
            h4.r rVarA4 = c2.l.A(aVar, f14, 0.0f, 2);
            str = jVar3.f99267f;
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            d92.b.f58624b.getClass();
            x0 x0Var2 = j92.f.f97933j;
            x0 x0VarF2 = d92.c.f(x0Var2, mVar);
            String strQ9 = gl1.y.Q(mVar, R.string.lbl_read_more);
            String strQ10 = gl1.y.Q(mVar, R.string.lbl_read_less);
            x0 x0VarA2 = x0.a(x0Var2, ds.e0.e(mVar), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
            zB = mVar.B(p1Var3);
            objQ2 = mVar.q();
            if (zB) {
                objQ2 = new qk0.m(p1Var3, 28);
                mVar.K(objQ2);
            } else {
                objQ2 = new qk0.m(p1Var3, 28);
                mVar.K(objQ2);
            }
            g02.n.a(rVarA4, str2, 4, x0VarF2, strQ9, strQ10, x0VarA2, null, null, (e23.a) objQ2, mVar, 384);
            rk0.h.a(c2.l.y(aVar, f14), jVar3, mVar, 0);
            strQ = gl1.y.Q(mVar, R.string.add_photos);
            l72.f0.a aVar13 = l72.f0.a.f111000a;
            String strQ11 = gl1.y.Q(mVar, R.string.social_photo);
            u4.d dVarA2 = k6.a(t62.b.f162798a);
            zB2 = mVar.B(strQ);
            objQ3 = mVar.q();
            if (zB2) {
                objQ3 = new o60.b(strQ, 23);
                mVar.K(objQ3);
            } else {
                objQ3 = new o60.b(strQ, 23);
                mVar.K(objQ3);
            }
            h4.r rVarF4 = x2.f(c2.l.z(p5.v.c((e23.l) objQ3, aVar, false), f14, eVar.f97921f), 1.0f);
            zB3 = mVar.B(lVar3) | mVar.r(jVar);
            objQ4 = mVar.q();
            if (zB3) {
                final int i17 = 1;
                objQ4 = new e23.a() { // from class: rk0.c
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v2, types: [p13.j0] */
                    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
                    @Override // e23.a
                    public final Object invoke() {
                        ?? arrayList2;
                        switch (i17) {
                            case 0:
                                lVar3.invoke(jVar.f153165a.f99270i);
                                break;
                            case 1:
                                Collection collection = jVar.f153165a.f99270i;
                                if (collection == null) {
                                    collection = p13.j0.f134944a;
                                }
                                lVar3.invoke(collection);
                                break;
                            default:
                                List<jk0.s> list3 = jVar.f153165a.f99268g;
                                if (list3 != null) {
                                    arrayList2 = new ArrayList(p13.y.r(list3, 10));
                                    Iterator it3 = list3.iterator();
                                    while (it3.hasNext()) {
                                        arrayList2.add(og2.k.L((jk0.s) it3.next()));
                                    }
                                } else {
                                    arrayList2 = p13.j0.f134944a;
                                }
                                lVar3.invoke(arrayList2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ4);
            } else {
                final int i18 = 1;
                objQ4 = new e23.a() { // from class: rk0.c
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v2, types: [p13.j0] */
                    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
                    @Override // e23.a
                    public final Object invoke() {
                        ?? arrayList2;
                        switch (i18) {
                            case 0:
                                lVar3.invoke(jVar.f153165a.f99270i);
                                break;
                            case 1:
                                Collection collection = jVar.f153165a.f99270i;
                                if (collection == null) {
                                    collection = p13.j0.f134944a;
                                }
                                lVar3.invoke(collection);
                                break;
                            default:
                                List<jk0.s> list3 = jVar.f153165a.f99268g;
                                if (list3 != null) {
                                    arrayList2 = new ArrayList(p13.y.r(list3, 10));
                                    Iterator it3 = list3.iterator();
                                    while (it3.hasNext()) {
                                        arrayList2.add(og2.k.L((jk0.s) it3.next()));
                                    }
                                } else {
                                    arrayList2 = p13.j0.f134944a;
                                }
                                lVar3.invoke(arrayList2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ4);
            }
            aVar13.h(0, 8, (e23.a) objQ4, rVarF4, strQ11, mVar, dVarA2, false);
            mVar.y();
            h4.d.f81522a.getClass();
            h4.g.b bVar6 = h4.d.a.f81535m;
            c2.j.f22691a.getClass();
            s2VarA = q2.a(c2.j.f22692b, bVar6, mVar, 48);
            x1 x1Var5 = p3.n.f135158a;
            iHashCode2 = Long.hashCode(mVar.getU());
            i2VarX2 = mVar.x();
            rVarC2 = h4.k.c(aVar, mVar);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (mVar.F() != null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, mVar);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX2, mVar);
            bVar2 = h5.g.a.f81813j;
            if (mVar.getT()) {
                bVar3 = bVar;
                if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar2 = h5.g.a.f81807d;
                b4.c(fVar2, rVarC2, mVar);
                mh.c(gl1.y.Q(mVar, R.string.concept_gear), v2.a(c2.l.C(c2.l.C(u2.f22900a.a(aVar, 1.0f, true), eVar.f97920e, 0.0f, 0.0f, 0.0f, 14), 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), p13.h0.L((i53.f) x3Var.getF182175a()), new qk0.a(24), mVar, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97930g), mVar, 0, 0, 131068);
                if (p13.h0.L((i53.f) x3Var.getF182175a())) {
                    mVar.C(-1162070924);
                    zB6 = mVar.B(lVar4) | mVar.r(jVar);
                    objQ7 = mVar.q();
                    if (zB6) {
                        i14 = 2;
                        objQ7 = new e23.a() { // from class: rk0.c
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r1v2, types: [p13.j0] */
                            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
                            @Override // e23.a
                            public final Object invoke() {
                                ?? arrayList2;
                                switch (i14) {
                                    case 0:
                                        lVar4.invoke(jVar.f153165a.f99270i);
                                        break;
                                    case 1:
                                        Collection collection = jVar.f153165a.f99270i;
                                        if (collection == null) {
                                            collection = p13.j0.f134944a;
                                        }
                                        lVar4.invoke(collection);
                                        break;
                                    default:
                                        List<jk0.s> list3 = jVar.f153165a.f99268g;
                                        if (list3 != null) {
                                            arrayList2 = new ArrayList(p13.y.r(list3, 10));
                                            Iterator it3 = list3.iterator();
                                            while (it3.hasNext()) {
                                                arrayList2.add(og2.k.L((jk0.s) it3.next()));
                                            }
                                        } else {
                                            arrayList2 = p13.j0.f134944a;
                                        }
                                        lVar4.invoke(arrayList2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ7);
                    } else {
                        i14 = 2;
                        objQ7 = new e23.a() { // from class: rk0.c
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r1v2, types: [p13.j0] */
                            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
                            @Override // e23.a
                            public final Object invoke() {
                                ?? arrayList2;
                                switch (i14) {
                                    case 0:
                                        lVar4.invoke(jVar.f153165a.f99270i);
                                        break;
                                    case 1:
                                        Collection collection = jVar.f153165a.f99270i;
                                        if (collection == null) {
                                            collection = p13.j0.f134944a;
                                        }
                                        lVar4.invoke(collection);
                                        break;
                                    default:
                                        List<jk0.s> list3 = jVar.f153165a.f99268g;
                                        if (list3 != null) {
                                            arrayList2 = new ArrayList(p13.y.r(list3, 10));
                                            Iterator it3 = list3.iterator();
                                            while (it3.hasNext()) {
                                                arrayList2.add(og2.k.L((jk0.s) it3.next()));
                                            }
                                        } else {
                                            arrayList2 = p13.j0.f134944a;
                                        }
                                        lVar4.invoke(arrayList2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ7);
                    }
                    mh.c(gl1.y.Q(mVar, R.string.lbl_edit), v2.a(c2.l.C(c2.l.A(u1.w.d(aVar, false, null, null, (e23.a) objQ7, 15), f14, 0.0f, i14), 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), p13.h0.L((i53.f) x3Var.getF182175a()), new qk0.a(25), mVar, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97932i, ds.e0.e(mVar), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar, 0, 0, 131068);
                    mVar.f();
                } else {
                    mVar.C(-1161283524);
                    c2.l.f(x2.u(aVar, f14), mVar);
                    mVar.f();
                }
                mVar.y();
                fVar3 = (i53.f) x3Var.getF182175a();
                fVar3.getClass();
                if (fVar3.isEmpty()) {
                    mVar.C(-396481307);
                    j92.d dVar3 = j92.b.f97900c;
                    k2.h hVarA3 = k2.i.a(dVar3.f97911c);
                    long jA3 = d92.b.a(mVar).c().a();
                    float f113 = dVar3.f97911c;
                    bVar3.getClass();
                    float f114 = dVar3.f97912d;
                    bVar3.getClass();
                    float f115 = dVar3.f97912d;
                    bVar3.getClass();
                    ve.a(c2.l.B(aVar, f115, f113, dVar3.f97912d, f114), hVarA3, jA3, 0L, 0.0f, 0.0f, null, z3.f.c(1239109769, new b71.n(lVar4, 16, (byte) 0), mVar), mVar, 12582912, 120);
                    mVar.f();
                } else {
                    mVar.C(-395415558);
                    bVar3.getClass();
                    h4.r rVarA5 = c2.l.A(aVar, eVar.f97920e, 0.0f, 2);
                    bVar3.getClass();
                    zVarA2 = c2.y.a(c2.j.i(eVar.f97918c), h4.d.a.f81536n, mVar, 0);
                    iHashCode3 = Long.hashCode(mVar.getU());
                    i2VarX3 = mVar.x();
                    rVarC3 = h4.k.c(rVarA5, mVar);
                    if (mVar.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar2);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, zVarA2, mVar);
                    b4.c(c1623g, i2VarX3, mVar);
                    if (mVar.getT()) {
                        v.h.z(iHashCode3, mVar, iHashCode3, bVar2);
                    } else {
                        v.h.z(iHashCode3, mVar, iHashCode3, bVar2);
                    }
                    b4.c(fVar2, rVarC3, mVar);
                    c2.b0 b0Var5 = c2.b0.f22601a;
                    mVar.C(540768159);
                    while (r0.hasNext()) {
                        mVar.N(540770024, gVar.f171812a);
                        h4.r rVarF5 = x2.f(h4.r.S, 1.0f);
                        lVar2 = lVar;
                        zB4 = mVar.B(lVar2) | mVar.r(gVar);
                        objQ5 = mVar.q();
                        if (zB4) {
                            objQ5 = new qn0.f(29, lVar2, gVar);
                            mVar.K(objQ5);
                        } else {
                            objQ5 = new qn0.f(29, lVar2, gVar);
                            mVar.K(objQ5);
                        }
                        uk0.f.a(rVarF5, gVar, o0Var, (e23.a) objQ5, mVar, 6);
                        mVar.Q();
                        lVar = lVar2;
                    }
                    mVar.f();
                    mVar.y();
                    mVar.f();
                }
                mVar.C(680013310);
                cVar = (i53.c) x3Var2.getF182175a();
                if (p13.h0.L((i53.f) x3Var.getF182175a())) {
                    mVar.C(323839057);
                    h4.r.a aVar14 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar14, j92.b.f97899b.f97920e), mVar);
                    mVar.f();
                } else {
                    mVar.C(323942845);
                    mVar.f();
                }
                if (cVar != null) {
                    p1Var2 = p1Var;
                    mVar.C(324465660);
                    p2 p2Var5 = p2.f111205a;
                    String strQ12 = gl1.y.Q(mVar, R.string.add_default_activities);
                    rk0.o.f153236a.getClass();
                    z3.e eVar7 = rk0.o.f153237b;
                    zB5 = mVar.B(p1Var2) | mVar.B(pVar);
                    objQ6 = mVar.q();
                    if (zB5) {
                        objQ6 = new hl1.s(p1Var2, pVar);
                        mVar.K(objQ6);
                    } else {
                        objQ6 = new hl1.s(p1Var2, pVar);
                        mVar.K(objQ6);
                    }
                    p2Var5.g(strQ12, null, null, null, eVar7, false, false, (e23.a) objQ6, mVar, 24576, 238);
                    mVar.f();
                } else {
                    p1Var2 = p1Var;
                    mVar.C(324465660);
                    p2 p2Var6 = p2.f111205a;
                    String strQ13 = gl1.y.Q(mVar, R.string.add_default_activities);
                    rk0.o.f153236a.getClass();
                    z3.e eVar8 = rk0.o.f153237b;
                    zB5 = mVar.B(p1Var2) | mVar.B(pVar);
                    objQ6 = mVar.q();
                    if (zB5) {
                        objQ6 = new hl1.s(p1Var2, pVar);
                        mVar.K(objQ6);
                    } else {
                        objQ6 = new hl1.s(p1Var2, pVar);
                        mVar.K(objQ6);
                    }
                    p2Var6.g(strQ13, null, null, null, eVar8, false, false, (e23.a) objQ6, mVar, 24576, 238);
                    mVar.f();
                }
                Unit unit3 = Unit.INSTANCE;
                mVar.f();
                h4.r.a aVar15 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.h(aVar15, j92.b.f97899b.f97921f), mVar);
                mVar.y();
                x1 x1Var6 = p3.n.f135158a;
            } else {
                bVar3 = bVar;
            }
            v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
            fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC2, mVar);
            mh.c(gl1.y.Q(mVar, R.string.concept_gear), v2.a(c2.l.C(c2.l.C(u2.f22900a.a(aVar, 1.0f, true), eVar.f97920e, 0.0f, 0.0f, 0.0f, 14), 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), p13.h0.L((i53.f) x3Var.getF182175a()), new qk0.a(24), mVar, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97930g), mVar, 0, 0, 131068);
            if (p13.h0.L((i53.f) x3Var.getF182175a())) {
                mVar.C(-1162070924);
                zB6 = mVar.B(lVar4) | mVar.r(jVar);
                objQ7 = mVar.q();
                if (zB6) {
                    i14 = 2;
                    objQ7 = new e23.a() { // from class: rk0.c
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r1v2, types: [p13.j0] */
                        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
                        @Override // e23.a
                        public final Object invoke() {
                            ?? arrayList2;
                            switch (i14) {
                                case 0:
                                    lVar4.invoke(jVar.f153165a.f99270i);
                                    break;
                                case 1:
                                    Collection collection = jVar.f153165a.f99270i;
                                    if (collection == null) {
                                        collection = p13.j0.f134944a;
                                    }
                                    lVar4.invoke(collection);
                                    break;
                                default:
                                    List<jk0.s> list3 = jVar.f153165a.f99268g;
                                    if (list3 != null) {
                                        arrayList2 = new ArrayList(p13.y.r(list3, 10));
                                        Iterator it3 = list3.iterator();
                                        while (it3.hasNext()) {
                                            arrayList2.add(og2.k.L((jk0.s) it3.next()));
                                        }
                                    } else {
                                        arrayList2 = p13.j0.f134944a;
                                    }
                                    lVar4.invoke(arrayList2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ7);
                } else {
                    i14 = 2;
                    objQ7 = new e23.a() { // from class: rk0.c
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r1v2, types: [p13.j0] */
                        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
                        @Override // e23.a
                        public final Object invoke() {
                            ?? arrayList2;
                            switch (i14) {
                                case 0:
                                    lVar4.invoke(jVar.f153165a.f99270i);
                                    break;
                                case 1:
                                    Collection collection = jVar.f153165a.f99270i;
                                    if (collection == null) {
                                        collection = p13.j0.f134944a;
                                    }
                                    lVar4.invoke(collection);
                                    break;
                                default:
                                    List<jk0.s> list3 = jVar.f153165a.f99268g;
                                    if (list3 != null) {
                                        arrayList2 = new ArrayList(p13.y.r(list3, 10));
                                        Iterator it3 = list3.iterator();
                                        while (it3.hasNext()) {
                                            arrayList2.add(og2.k.L((jk0.s) it3.next()));
                                        }
                                    } else {
                                        arrayList2 = p13.j0.f134944a;
                                    }
                                    lVar4.invoke(arrayList2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ7);
                }
                mh.c(gl1.y.Q(mVar, R.string.lbl_edit), v2.a(c2.l.C(c2.l.A(u1.w.d(aVar, false, null, null, (e23.a) objQ7, 15), f14, 0.0f, i14), 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), p13.h0.L((i53.f) x3Var.getF182175a()), new qk0.a(25), mVar, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97932i, ds.e0.e(mVar), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar, 0, 0, 131068);
                mVar.f();
            } else {
                mVar.C(-1161283524);
                c2.l.f(x2.u(aVar, f14), mVar);
                mVar.f();
            }
            mVar.y();
            fVar3 = (i53.f) x3Var.getF182175a();
            fVar3.getClass();
            if (fVar3.isEmpty()) {
                mVar.C(-396481307);
                j92.d dVar4 = j92.b.f97900c;
                k2.h hVarA4 = k2.i.a(dVar4.f97911c);
                long jA4 = d92.b.a(mVar).c().a();
                float f116 = dVar4.f97911c;
                bVar3.getClass();
                float f117 = dVar4.f97912d;
                bVar3.getClass();
                float f118 = dVar4.f97912d;
                bVar3.getClass();
                ve.a(c2.l.B(aVar, f118, f116, dVar4.f97912d, f117), hVarA4, jA4, 0L, 0.0f, 0.0f, null, z3.f.c(1239109769, new b71.n(lVar4, 16, (byte) 0), mVar), mVar, 12582912, 120);
                mVar.f();
            } else {
                mVar.C(-395415558);
                bVar3.getClass();
                h4.r rVarA6 = c2.l.A(aVar, eVar.f97920e, 0.0f, 2);
                bVar3.getClass();
                zVarA2 = c2.y.a(c2.j.i(eVar.f97918c), h4.d.a.f81536n, mVar, 0);
                iHashCode3 = Long.hashCode(mVar.getU());
                i2VarX3 = mVar.x();
                rVarC3 = h4.k.c(rVarA6, mVar);
                if (mVar.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar2);
                } else {
                    mVar.c();
                }
                b4.c(eVar2, zVarA2, mVar);
                b4.c(c1623g, i2VarX3, mVar);
                if (mVar.getT()) {
                    v.h.z(iHashCode3, mVar, iHashCode3, bVar2);
                } else {
                    v.h.z(iHashCode3, mVar, iHashCode3, bVar2);
                }
                b4.c(fVar2, rVarC3, mVar);
                c2.b0 b0Var6 = c2.b0.f22601a;
                mVar.C(540768159);
                while (r0.hasNext()) {
                    mVar.N(540770024, gVar.f171812a);
                    h4.r rVarF6 = x2.f(h4.r.S, 1.0f);
                    lVar2 = lVar;
                    zB4 = mVar.B(lVar2) | mVar.r(gVar);
                    objQ5 = mVar.q();
                    if (zB4) {
                        objQ5 = new qn0.f(29, lVar2, gVar);
                        mVar.K(objQ5);
                    } else {
                        objQ5 = new qn0.f(29, lVar2, gVar);
                        mVar.K(objQ5);
                    }
                    uk0.f.a(rVarF6, gVar, o0Var, (e23.a) objQ5, mVar, 6);
                    mVar.Q();
                    lVar = lVar2;
                }
                mVar.f();
                mVar.y();
                mVar.f();
            }
            mVar.C(680013310);
            cVar = (i53.c) x3Var2.getF182175a();
            if (p13.h0.L((i53.f) x3Var.getF182175a())) {
                mVar.C(323839057);
                h4.r.a aVar16 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.h(aVar16, j92.b.f97899b.f97920e), mVar);
                mVar.f();
            } else {
                mVar.C(323942845);
                mVar.f();
            }
            if (cVar != null) {
                p1Var2 = p1Var;
                mVar.C(324465660);
                p2 p2Var7 = p2.f111205a;
                String strQ14 = gl1.y.Q(mVar, R.string.add_default_activities);
                rk0.o.f153236a.getClass();
                z3.e eVar9 = rk0.o.f153237b;
                zB5 = mVar.B(p1Var2) | mVar.B(pVar);
                objQ6 = mVar.q();
                if (zB5) {
                    objQ6 = new hl1.s(p1Var2, pVar);
                    mVar.K(objQ6);
                } else {
                    objQ6 = new hl1.s(p1Var2, pVar);
                    mVar.K(objQ6);
                }
                p2Var7.g(strQ14, null, null, null, eVar9, false, false, (e23.a) objQ6, mVar, 24576, 238);
                mVar.f();
            } else {
                p1Var2 = p1Var;
                mVar.C(324465660);
                p2 p2Var8 = p2.f111205a;
                String strQ15 = gl1.y.Q(mVar, R.string.add_default_activities);
                rk0.o.f153236a.getClass();
                z3.e eVar10 = rk0.o.f153237b;
                zB5 = mVar.B(p1Var2) | mVar.B(pVar);
                objQ6 = mVar.q();
                if (zB5) {
                    objQ6 = new hl1.s(p1Var2, pVar);
                    mVar.K(objQ6);
                } else {
                    objQ6 = new hl1.s(p1Var2, pVar);
                    mVar.K(objQ6);
                }
                p2Var8.g(strQ15, null, null, null, eVar10, false, false, (e23.a) objQ6, mVar, 24576, 238);
                mVar.f();
            }
            Unit unit4 = Unit.INSTANCE;
            mVar.f();
            h4.r.a aVar17 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(x2.h(aVar17, j92.b.f97899b.f97921f), mVar);
            mVar.y();
            x1 x1Var7 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x009d  */
    private final Object e(Object obj, Object obj2, Object obj3) {
        e2.i0 i0Var = (e2.i0) this.f339d;
        x3 x3Var = (x3) this.f340e;
        p1 p1Var = (p1) this.f338c;
        List list = (List) this.f341f;
        x3 x3Var2 = (x3) this.f342g;
        Context context = (Context) this.f343h;
        c.q qVar = (c.q) this.f344i;
        List list2 = (List) this.f345j;
        List list3 = (List) this.f346k;
        x3 x3Var3 = (x3) this.f337b;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.t) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarD = x2.d(h4.r.S, 1.0f);
            boolean zB = mVar.B(x3Var) | mVar.B(p1Var) | mVar.r(list) | mVar.B(x3Var2) | mVar.r(context) | mVar.r(qVar) | mVar.r(list2) | mVar.r(list3) | mVar.B(x3Var3);
            Object objQ = mVar.q();
            if (zB) {
                i3.b4 b4Var = new i3.b4(list, list2, list3, x3Var, p1Var, context, qVar, x3Var2, x3Var3, 4);
                mVar.K(b4Var);
                objQ = b4Var;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    i3.b4 b4Var2 = new i3.b4(list, list2, list3, x3Var, p1Var, context, qVar, x3Var2, x3Var3, 4);
                    mVar.K(b4Var2);
                    objQ = b4Var2;
                }
            }
            e2.c.b(rVarD, i0Var, null, null, null, null, false, null, (e23.l) objQ, mVar, 6, 508);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object f(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f339d;
        String str2 = (String) this.f340e;
        String str3 = (String) this.f341f;
        Integer num = (Integer) this.f342g;
        List list = (List) this.f343h;
        String str4 = (String) this.f344i;
        List list2 = (List) this.f337b;
        p1 p1Var = (p1) this.f338c;
        n1 n1Var = (n1) this.f345j;
        n1 n1Var2 = (n1) this.f346k;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            String str5 = (String) p1Var.getF182175a();
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new vd0.d(p1Var, 23);
                mVar.K(objQ);
            }
            e23.l lVar = (e23.l) objQ;
            Object objQ2 = mVar.q();
            if (objQ2 == c2565a) {
                objQ2 = new a3(n1Var, 15);
                mVar.K(objQ2);
            }
            e23.l lVar2 = (e23.l) objQ2;
            Object objQ3 = mVar.q();
            if (objQ3 == c2565a) {
                objQ3 = new a3(n1Var2, 16);
                mVar.K(objQ3);
            }
            wv0.d.c(str, str2, str3, str5, num, list, lVar, lVar2, str4, list2, (e23.l) objQ3, mVar, 14155776);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0367  */
    /* JADX WARN: Code duplicated, block: B:139:0x0466  */
    /* JADX WARN: Code duplicated, block: B:141:0x0498  */
    /* JADX WARN: Code duplicated, block: B:143:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:144:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:149:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:152:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:154:0x04f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:157:0x052d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0536  */
    /* JADX WARN: Code duplicated, block: B:160:0x053a  */
    /* JADX WARN: Code duplicated, block: B:165:0x0557  */
    /* JADX WARN: Code duplicated, block: B:167:0x0566  */
    /* JADX WARN: Code duplicated, block: B:169:0x056a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0570  */
    /* JADX WARN: Code duplicated, block: B:173:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:175:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:176:0x05af  */
    /* JADX WARN: Code duplicated, block: B:181:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:183:0x0600  */
    /* JADX WARN: Code duplicated, block: B:185:0x0604  */
    /* JADX WARN: Code duplicated, block: B:187:0x0630  */
    /* JADX WARN: Code duplicated, block: B:189:0x0637  */
    /* JADX WARN: Code duplicated, block: B:192:0x0676  */
    /* JADX WARN: Code duplicated, block: B:194:0x067d  */
    /* JADX WARN: Code duplicated, block: B:198:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:200:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:202:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:205:0x0705  */
    /* JADX WARN: Code duplicated, block: B:207:0x070c  */
    /* JADX WARN: Code duplicated, block: B:209:0x071e  */
    /* JADX WARN: Code duplicated, block: B:212:0x072b  */
    /* JADX WARN: Code duplicated, block: B:213:0x073d  */
    /* JADX WARN: Code duplicated, block: B:215:0x0744  */
    /* JADX WARN: Code duplicated, block: B:216:0x0751  */
    /* JADX WARN: Code duplicated, block: B:250:0x0863  */
    /* JADX WARN: Code duplicated, block: B:255:0x088d  */
    /* JADX WARN: Code duplicated, block: B:264:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:299:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:305:0x0a49  */
    /* JADX WARN: Code duplicated, block: B:333:0x0b9e  */
    /* JADX WARN: Code duplicated, block: B:336:0x0bd2  */
    /* JADX WARN: Code duplicated, block: B:338:0x0bd5  */
    /* JADX WARN: Code duplicated, block: B:343:0x0c08  */
    /* JADX WARN: Code duplicated, block: B:347:0x0c33  */
    /* JADX WARN: Code duplicated, block: B:349:0x0c57  */
    /* JADX WARN: Code duplicated, block: B:351:0x0c5f  */
    /* JADX WARN: Code duplicated, block: B:353:0x0c6f  */
    /* JADX WARN: Code duplicated, block: B:359:0x0c93  */
    /* JADX WARN: Code duplicated, block: B:363:0x0cb7  */
    /* JADX WARN: Code duplicated, block: B:367:0x0d02  */
    /* JADX WARN: Code duplicated, block: B:369:0x0d0b  */
    /* JADX WARN: Code duplicated, block: B:370:0x0d11  */
    /* JADX WARN: Code duplicated, block: B:375:0x0d2e  */
    /* JADX WARN: Code duplicated, block: B:379:0x0d44  */
    /* JADX WARN: Code duplicated, block: B:383:0x0da0  */
    /* JADX WARN: Code duplicated, block: B:385:0x0dec  */
    /* JADX WARN: Code duplicated, block: B:84:0x02d3  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        n1 n1Var;
        h5.g.a.f fVar;
        p3.m mVar;
        Object objQ;
        p3.m.a.C2565a c2565a;
        int i14;
        n1 n1Var2;
        Object objQ2;
        boolean zB;
        Object objQ3;
        boolean zB2;
        Object objQ4;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        boolean zB3;
        Object objQ5;
        boolean zB4;
        Object objQ6;
        boolean zB5;
        Object objQ7;
        p3.m mVar2;
        n1 n1Var3;
        boolean zB6;
        Object objQ8;
        gv0.d dVar;
        p1 p1Var;
        p1 p1Var2;
        e23.a aVar;
        e23.l lVar;
        e23.a aVar2;
        h5.g.a.f fVar2;
        c2.b0 b0Var;
        boolean z14;
        o51.g gVar;
        i53.c<o51.c> cVar;
        p3.m mVar3;
        boolean zR;
        Object objQ9;
        o51.c cVar2;
        boolean zB7;
        Object objQ10;
        z0 z0VarD;
        int iHashCode2;
        i2 i2VarX2;
        h4.r rVarC2;
        z0 z0VarD2;
        int iHashCode3;
        i2 i2VarX3;
        h4.r rVarC3;
        e23.a aVar3;
        boolean zB8;
        Object objQ11;
        e23.l lVar2;
        boolean zB9;
        Object objQ12;
        z0 z0VarD3;
        int iHashCode4;
        i2 i2VarX4;
        h4.r rVarC4;
        String strH;
        int i15 = this.f336a;
        p3.m.a aVar4 = p3.m.f135153a;
        Object obj4 = this.f337b;
        Object obj5 = this.f346k;
        Object obj6 = this.f344i;
        Object obj7 = this.f345j;
        Object obj8 = this.f343h;
        Object obj9 = this.f342g;
        Object obj10 = this.f338c;
        Object obj11 = this.f341f;
        Object obj12 = this.f340e;
        Object obj13 = this.f339d;
        switch (i15) {
            case 0:
                String str = (String) obj13;
                i53.f fVar3 = (i53.f) obj12;
                final j0 j0Var = (j0) obj11;
                final i iVar = (i) obj9;
                e23.p pVar = (e23.p) obj8;
                p1 p1Var3 = (p1) obj10;
                final p3.l1 l1Var = (p3.l1) obj6;
                final n1 n1Var4 = (n1) obj7;
                n1 n1Var5 = (n1) obj5;
                e23.a aVar5 = (e23.a) obj4;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar4.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    h4.r rVarY = c2.l.y(aVar6, f14);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar7 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA = c2.y.a(c2.j.f22694d, aVar7, mVar4, 48);
                    int iHashCode5 = Long.hashCode(mVar4.getU());
                    i2 i2VarX5 = mVar4.x();
                    h4.r rVarC5 = h4.k.c(rVarY, mVar4);
                    h5.g.V.getClass();
                    h5.e0.a aVar8 = h5.g.a.f81805b;
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
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA, mVar4);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX5, mVar4);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar4.getT()) {
                        n1Var = n1Var5;
                    } else {
                        n1Var = n1Var5;
                        if (!p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode5))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC5, mVar4);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        h4.r rVarF = x2.f(aVar6, 1.0f);
                        d92.b.f58624b.getClass();
                        mh.c(str, rVarF, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar4), mVar4, 48, 0, 131068);
                        mVar = mVar4;
                        c2.l.f(x2.h(aVar6, f14), mVar);
                        int iOrdinal = ((r) p1Var3.getF182175a()).ordinal();
                        objQ = mVar.q();
                        aVar4.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new m(p1Var3, 0);
                            mVar.K(objQ);
                        }
                        k1.a(fVar3, iOrdinal, null, null, 0.0f, (e23.l) objQ, mVar, 196608, 28);
                        c2.l.f(x2.h(aVar6, f14), mVar);
                        i14 = q.a.f366a[((r) p1Var3.getF182175a()).ordinal()];
                        if (i14 != 1) {
                            p1Var3 = p1Var3;
                            n1Var2 = n1Var;
                            mVar.C(-953145451);
                            objQ2 = mVar.q();
                            if (objQ2 == c2565a) {
                                objQ2 = new m4.b0();
                                mVar.K(objQ2);
                            }
                            m4.b0 b0Var3 = (m4.b0) objQ2;
                            double doubleValue = l1Var.getDoubleValue();
                            int i16 = j0Var.f325a;
                            int i17 = j0Var.f326b;
                            zB = mVar.B(iVar);
                            objQ3 = mVar.q();
                            if (zB || objQ3 == c2565a) {
                                objQ3 = new n0(iVar, l1Var, n1Var4, n1Var2, 1);
                                mVar.K(objQ3);
                            }
                            e23.l lVar3 = (e23.l) objQ3;
                            zB2 = mVar.B(pVar);
                            objQ4 = mVar.q();
                            if (zB2 || objQ4 == c2565a) {
                                objQ4 = new n(0, pVar, l1Var);
                                mVar.K(objQ4);
                            }
                            g.a(doubleValue, i16, i17, b0Var3, lVar3, (e23.a) objQ4, mVar, 3072);
                            mVar.f();
                            Unit unit = Unit.INSTANCE;
                        } else {
                            if (i14 == 2) {
                                throw n23.j.m(mVar, 523442179);
                            }
                            mVar.C(-952102208);
                            int i18 = iVar.f310a;
                            int i19 = iVar.f311b;
                            i53.c<h> cVar3 = iVar.f312c;
                            int intValue = n1Var4.getIntValue();
                            int intValue2 = n1Var.getIntValue();
                            zB5 = mVar.B(iVar) | mVar.B(j0Var);
                            objQ7 = mVar.q();
                            if (!zB5 || objQ7 == c2565a) {
                                final int i24 = 0;
                                final n1 n1Var6 = n1Var;
                                mVar2 = mVar;
                                objQ7 = new e23.l() { // from class: a11.o
                                    @Override // e23.l
                                    public final Object invoke(Object obj14) {
                                        int i25 = i24;
                                        int iIntValue2 = ((Integer) obj14).intValue();
                                        switch (i25) {
                                            case 0:
                                                n1 n1Var7 = n1Var4;
                                                if (n1Var7.getIntValue() != iIntValue2) {
                                                    n1Var7.t(iIntValue2);
                                                    l1Var.u(q.d(n1Var7.getIntValue(), n1Var6.getIntValue(), iVar, j0Var.f326b));
                                                }
                                                break;
                                            default:
                                                n1 n1Var8 = n1Var4;
                                                if (n1Var8.getIntValue() != iIntValue2) {
                                                    n1Var8.t(iIntValue2);
                                                    l1Var.u(q.d(n1Var6.getIntValue(), n1Var8.getIntValue(), iVar, j0Var.f326b));
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                n1Var3 = n1Var6;
                                mVar2.K(objQ7);
                            } else {
                                n1Var3 = n1Var;
                                mVar2 = mVar;
                            }
                            e23.l lVar4 = (e23.l) objQ7;
                            zB6 = mVar2.B(iVar) | mVar2.B(j0Var);
                            objQ8 = mVar2.q();
                            if (zB6 || objQ8 == c2565a) {
                                final int i25 = 1;
                                final n1 n1Var7 = n1Var3;
                                e23.l lVar5 = new e23.l() { // from class: a11.o
                                    @Override // e23.l
                                    public final Object invoke(Object obj14) {
                                        int i26 = i25;
                                        int iIntValue2 = ((Integer) obj14).intValue();
                                        switch (i26) {
                                            case 0:
                                                n1 n1Var8 = n1Var7;
                                                if (n1Var8.getIntValue() != iIntValue2) {
                                                    n1Var8.t(iIntValue2);
                                                    l1Var.u(q.d(n1Var8.getIntValue(), n1Var4.getIntValue(), iVar, j0Var.f326b));
                                                }
                                                break;
                                            default:
                                                n1 n1Var9 = n1Var7;
                                                if (n1Var9.getIntValue() != iIntValue2) {
                                                    n1Var9.t(iIntValue2);
                                                    l1Var.u(q.d(n1Var4.getIntValue(), n1Var9.getIntValue(), iVar, j0Var.f326b));
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(lVar5);
                                objQ8 = lVar5;
                            }
                            p3.m mVar5 = mVar2;
                            t.a(i18, i19, cVar3, intValue, intValue2, lVar4, (e23.l) objQ8, mVar5, 0);
                            mVar = mVar5;
                            mVar.f();
                            Unit unit2 = Unit.INSTANCE;
                            n1Var2 = n1Var3;
                        }
                        c2.l.f(x2.h(aVar6, eVar.f97922g), mVar);
                        h4.r rVarF2 = x2.f(aVar6, 1.0f);
                        s2VarA = q2.a(c2.j.f22693c, h4.d.a.f81533k, mVar, 6);
                        iHashCode = Long.hashCode(mVar.getU());
                        i2VarX = mVar.x();
                        rVarC = h4.k.c(rVarF2, mVar);
                        if (mVar.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar8);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar2, s2VarA, mVar);
                        b4.c(c1623g, i2VarX, mVar);
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar, iHashCode, bVar);
                        }
                        b4.c(fVar, rVarC, mVar);
                        u2 u2Var = u2.f22900a;
                        zB3 = mVar.B(aVar5);
                        objQ5 = mVar.q();
                        if (zB3 || objQ5 == c2565a) {
                            objQ5 = new defpackage.c(aVar5, 1);
                            mVar.K(objQ5);
                        }
                        c1 c1Var = c1.f87691a;
                        long jB = d92.b.a(mVar).k().b();
                        c1Var.getClass();
                        b1 b1VarC = c1.c(0L, jB, 0L, mVar, 13);
                        a.f245a.getClass();
                        h1.c((e23.a) objQ5, null, false, null, b1VarC, null, null, null, a.f246b, mVar, C.ENCODING_PCM_32BIT, 494);
                        zB4 = mVar.B(iVar) | mVar.B(j0Var) | mVar.B(pVar);
                        objQ6 = mVar.q();
                        if (zB4 || objQ6 == c2565a) {
                            objQ6 = new p((Object) iVar, (Object) j0Var, (Object) pVar, (Object) p1Var3, (Object) n1Var4, (Object) n1Var2, (Object) l1Var, 0);
                            mVar.K(objQ6);
                        }
                        h1.c((e23.a) objQ6, null, false, null, c1.c(0L, zl.a.a(mVar), 0L, mVar, 13), null, null, null, a.f247c, mVar, C.ENCODING_PCM_32BIT, 494);
                        mVar.y();
                        mVar.y();
                    }
                    v.h.z(iHashCode5, mVar4, iHashCode5, bVar);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC5, mVar4);
                    c2.b0 b0Var4 = c2.b0.f22601a;
                    h4.r rVarF3 = x2.f(aVar6, 1.0f);
                    d92.b.f58624b.getClass();
                    mh.c(str, rVarF3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar4), mVar4, 48, 0, 131068);
                    mVar = mVar4;
                    c2.l.f(x2.h(aVar6, f14), mVar);
                    int iOrdinal2 = ((r) p1Var3.getF182175a()).ordinal();
                    objQ = mVar.q();
                    aVar4.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new m(p1Var3, 0);
                        mVar.K(objQ);
                    }
                    k1.a(fVar3, iOrdinal2, null, null, 0.0f, (e23.l) objQ, mVar, 196608, 28);
                    c2.l.f(x2.h(aVar6, f14), mVar);
                    i14 = q.a.f366a[((r) p1Var3.getF182175a()).ordinal()];
                    if (i14 != 1) {
                        p1Var3 = p1Var3;
                        n1Var2 = n1Var;
                        mVar.C(-953145451);
                        objQ2 = mVar.q();
                        if (objQ2 == c2565a) {
                            objQ2 = new m4.b0();
                            mVar.K(objQ2);
                        }
                        m4.b0 b0Var5 = (m4.b0) objQ2;
                        double doubleValue2 = l1Var.getDoubleValue();
                        int i110 = j0Var.f325a;
                        int i111 = j0Var.f326b;
                        zB = mVar.B(iVar);
                        objQ3 = mVar.q();
                        if (zB) {
                            objQ3 = new n0(iVar, l1Var, n1Var4, n1Var2, 1);
                            mVar.K(objQ3);
                        } else {
                            objQ3 = new n0(iVar, l1Var, n1Var4, n1Var2, 1);
                            mVar.K(objQ3);
                        }
                        e23.l lVar6 = (e23.l) objQ3;
                        zB2 = mVar.B(pVar);
                        objQ4 = mVar.q();
                        if (zB2) {
                            objQ4 = new n(0, pVar, l1Var);
                            mVar.K(objQ4);
                        } else {
                            objQ4 = new n(0, pVar, l1Var);
                            mVar.K(objQ4);
                        }
                        g.a(doubleValue2, i110, i111, b0Var5, lVar6, (e23.a) objQ4, mVar, 3072);
                        mVar.f();
                        Unit unit3 = Unit.INSTANCE;
                    } else {
                        if (i14 == 2) {
                            throw n23.j.m(mVar, 523442179);
                        }
                        mVar.C(-952102208);
                        int i112 = iVar.f310a;
                        int i113 = iVar.f311b;
                        i53.c<h> cVar4 = iVar.f312c;
                        int intValue3 = n1Var4.getIntValue();
                        int intValue4 = n1Var.getIntValue();
                        zB5 = mVar.B(iVar) | mVar.B(j0Var);
                        objQ7 = mVar.q();
                        if (zB5) {
                            final int i26 = 0;
                            final n1 n1Var8 = n1Var;
                            mVar2 = mVar;
                            objQ7 = new e23.l() { // from class: a11.o
                                @Override // e23.l
                                public final Object invoke(Object obj14) {
                                    int i27 = i26;
                                    int iIntValue2 = ((Integer) obj14).intValue();
                                    switch (i27) {
                                        case 0:
                                            n1 n1Var9 = n1Var4;
                                            if (n1Var9.getIntValue() != iIntValue2) {
                                                n1Var9.t(iIntValue2);
                                                l1Var.u(q.d(n1Var9.getIntValue(), n1Var8.getIntValue(), iVar, j0Var.f326b));
                                            }
                                            break;
                                        default:
                                            n1 n1Var10 = n1Var4;
                                            if (n1Var10.getIntValue() != iIntValue2) {
                                                n1Var10.t(iIntValue2);
                                                l1Var.u(q.d(n1Var8.getIntValue(), n1Var10.getIntValue(), iVar, j0Var.f326b));
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            n1Var3 = n1Var8;
                            mVar2.K(objQ7);
                        } else {
                            final int i27 = 0;
                            final n1 n1Var9 = n1Var;
                            mVar2 = mVar;
                            objQ7 = new e23.l() { // from class: a11.o
                                @Override // e23.l
                                public final Object invoke(Object obj14) {
                                    int i28 = i27;
                                    int iIntValue2 = ((Integer) obj14).intValue();
                                    switch (i28) {
                                        case 0:
                                            n1 n1Var10 = n1Var4;
                                            if (n1Var10.getIntValue() != iIntValue2) {
                                                n1Var10.t(iIntValue2);
                                                l1Var.u(q.d(n1Var10.getIntValue(), n1Var9.getIntValue(), iVar, j0Var.f326b));
                                            }
                                            break;
                                        default:
                                            n1 n1Var11 = n1Var4;
                                            if (n1Var11.getIntValue() != iIntValue2) {
                                                n1Var11.t(iIntValue2);
                                                l1Var.u(q.d(n1Var9.getIntValue(), n1Var11.getIntValue(), iVar, j0Var.f326b));
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            n1Var3 = n1Var9;
                            mVar2.K(objQ7);
                        }
                        e23.l lVar7 = (e23.l) objQ7;
                        zB6 = mVar2.B(iVar) | mVar2.B(j0Var);
                        objQ8 = mVar2.q();
                        if (zB6) {
                            final int i28 = 1;
                            final n1 n1Var10 = n1Var3;
                            e23.l lVar8 = new e23.l() { // from class: a11.o
                                @Override // e23.l
                                public final Object invoke(Object obj14) {
                                    int i29 = i28;
                                    int iIntValue2 = ((Integer) obj14).intValue();
                                    switch (i29) {
                                        case 0:
                                            n1 n1Var11 = n1Var10;
                                            if (n1Var11.getIntValue() != iIntValue2) {
                                                n1Var11.t(iIntValue2);
                                                l1Var.u(q.d(n1Var11.getIntValue(), n1Var4.getIntValue(), iVar, j0Var.f326b));
                                            }
                                            break;
                                        default:
                                            n1 n1Var12 = n1Var10;
                                            if (n1Var12.getIntValue() != iIntValue2) {
                                                n1Var12.t(iIntValue2);
                                                l1Var.u(q.d(n1Var4.getIntValue(), n1Var12.getIntValue(), iVar, j0Var.f326b));
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(lVar8);
                            objQ8 = lVar8;
                        } else {
                            final int i29 = 1;
                            final n1 n1Var11 = n1Var3;
                            e23.l lVar9 = new e23.l() { // from class: a11.o
                                @Override // e23.l
                                public final Object invoke(Object obj14) {
                                    int i210 = i29;
                                    int iIntValue2 = ((Integer) obj14).intValue();
                                    switch (i210) {
                                        case 0:
                                            n1 n1Var12 = n1Var11;
                                            if (n1Var12.getIntValue() != iIntValue2) {
                                                n1Var12.t(iIntValue2);
                                                l1Var.u(q.d(n1Var12.getIntValue(), n1Var4.getIntValue(), iVar, j0Var.f326b));
                                            }
                                            break;
                                        default:
                                            n1 n1Var13 = n1Var11;
                                            if (n1Var13.getIntValue() != iIntValue2) {
                                                n1Var13.t(iIntValue2);
                                                l1Var.u(q.d(n1Var4.getIntValue(), n1Var13.getIntValue(), iVar, j0Var.f326b));
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(lVar9);
                            objQ8 = lVar9;
                        }
                        p3.m mVar6 = mVar2;
                        t.a(i112, i113, cVar4, intValue3, intValue4, lVar7, (e23.l) objQ8, mVar6, 0);
                        mVar = mVar6;
                        mVar.f();
                        Unit unit4 = Unit.INSTANCE;
                        n1Var2 = n1Var3;
                    }
                    c2.l.f(x2.h(aVar6, eVar.f97922g), mVar);
                    h4.r rVarF4 = x2.f(aVar6, 1.0f);
                    s2VarA = q2.a(c2.j.f22693c, h4.d.a.f81533k, mVar, 6);
                    iHashCode = Long.hashCode(mVar.getU());
                    i2VarX = mVar.x();
                    rVarC = h4.k.c(rVarF4, mVar);
                    if (mVar.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar8);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, s2VarA, mVar);
                    b4.c(c1623g, i2VarX, mVar);
                    if (mVar.getT()) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    } else {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, mVar);
                    u2 u2Var2 = u2.f22900a;
                    zB3 = mVar.B(aVar5);
                    objQ5 = mVar.q();
                    if (zB3) {
                        objQ5 = new defpackage.c(aVar5, 1);
                        mVar.K(objQ5);
                    } else {
                        objQ5 = new defpackage.c(aVar5, 1);
                        mVar.K(objQ5);
                    }
                    c1 c1Var2 = c1.f87691a;
                    long jB2 = d92.b.a(mVar).k().b();
                    c1Var2.getClass();
                    b1 b1VarC2 = c1.c(0L, jB2, 0L, mVar, 13);
                    a.f245a.getClass();
                    h1.c((e23.a) objQ5, null, false, null, b1VarC2, null, null, null, a.f246b, mVar, C.ENCODING_PCM_32BIT, 494);
                    zB4 = mVar.B(iVar) | mVar.B(j0Var) | mVar.B(pVar);
                    objQ6 = mVar.q();
                    if (zB4) {
                        objQ6 = new p((Object) iVar, (Object) j0Var, (Object) pVar, (Object) p1Var3, (Object) n1Var4, (Object) n1Var2, (Object) l1Var, 0);
                        mVar.K(objQ6);
                    } else {
                        objQ6 = new p((Object) iVar, (Object) j0Var, (Object) pVar, (Object) p1Var3, (Object) n1Var4, (Object) n1Var2, (Object) l1Var, 0);
                        mVar.K(objQ6);
                    }
                    h1.c((e23.a) objQ6, null, false, null, c1.c(0L, zl.a.a(mVar), 0L, mVar, 13), null, null, null, a.f247c, mVar, C.ENCODING_PCM_32BIT, 494);
                    mVar.y();
                    mVar.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 1:
                pu0.b bVar2 = (pu0.b) obj13;
                c.q qVar = (c.q) obj12;
                uu0.c cVar5 = (uu0.c) obj11;
                b.g gVar2 = (b.g) obj9;
                c.q qVar2 = (c.q) obj8;
                gv0.d dVar2 = (gv0.d) obj6;
                e23.a aVar9 = (e23.a) obj4;
                p1 p1Var4 = (p1) obj10;
                p1 p1Var5 = (p1) obj7;
                p1 p1Var6 = (p1) obj5;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar7.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    mVar7.C(742135083);
                    List<pu0.i> list = bVar2.f141191i;
                    ArrayList<pu0.i> arrayList = new ArrayList();
                    for (Object obj14 : list) {
                        if (((pu0.i) obj14).f141261b != null) {
                            arrayList.add(obj14);
                        }
                    }
                    for (pu0.i iVar2 : arrayList) {
                        p2 p2Var = p2.f111205a;
                        String str2 = iVar2.f141261b;
                        String strV = str2 != null ? jg.b.v(gVar2, str2) : null;
                        if (strV == null) {
                            strV = "";
                        }
                        String str3 = strV;
                        String strQ = gl1.y.Q(mVar7, R.string.contact_management_contact_info_label_mobile);
                        boolean zR2 = mVar7.r(iVar2) | mVar7.r(gVar2) | mVar7.r(qVar2) | mVar7.r(bVar2) | mVar7.r(dVar2) | mVar7.B(aVar9);
                        Object objQ13 = mVar7.q();
                        if (zR2) {
                            pu0.b bVar3 = bVar2;
                            e23.a aVar10 = aVar9;
                            dVar = dVar2;
                            p1Var = p1Var6;
                            p1Var2 = p1Var5;
                            av0.b bVar4 = new av0.b(iVar2, gVar2, qVar2, aVar10, p1Var4, bVar3, dVar, p1Var2, p1Var);
                            aVar = aVar10;
                            bVar2 = bVar3;
                            mVar7.K(bVar4);
                            objQ13 = bVar4;
                        } else {
                            aVar4.getClass();
                            if (objQ13 == p3.m.a.f135155b) {
                                pu0.b bVar5 = bVar2;
                                e23.a aVar11 = aVar9;
                                dVar = dVar2;
                                p1Var = p1Var6;
                                p1Var2 = p1Var5;
                                av0.b bVar6 = new av0.b(iVar2, gVar2, qVar2, aVar11, p1Var4, bVar5, dVar, p1Var2, p1Var);
                                aVar = aVar11;
                                bVar2 = bVar5;
                                mVar7.K(bVar6);
                                objQ13 = bVar6;
                            } else {
                                aVar = aVar9;
                                dVar = dVar2;
                                p1Var = p1Var6;
                                p1Var2 = p1Var5;
                            }
                        }
                        p2Var.h(str3, strQ, null, null, null, false, false, null, null, null, (e23.a) objQ13, mVar7, 0, 0, 1020);
                        p1Var5 = p1Var2;
                        p1Var6 = p1Var;
                        dVar2 = dVar;
                        aVar9 = aVar;
                    }
                    mVar7.f();
                    p2 p2Var2 = p2.f111205a;
                    String strQ2 = gl1.y.Q(mVar7, R.string.contact_management_label_add_phone);
                    av0.a.f13149a.getClass();
                    z3.e eVar3 = av0.a.f13151c;
                    boolean zR3 = mVar7.r(qVar) | mVar7.r(cVar5) | mVar7.r(gVar2) | mVar7.r(bVar2);
                    Object objQ14 = mVar7.q();
                    if (zR3) {
                        af0.e eVar4 = new af0.e(qVar, cVar5, gVar2, bVar2, 3);
                        mVar7.K(eVar4);
                        objQ14 = eVar4;
                    } else {
                        aVar4.getClass();
                        if (objQ14 == p3.m.a.f135155b) {
                            af0.e eVar5 = new af0.e(qVar, cVar5, gVar2, bVar2, 3);
                            mVar7.K(eVar5);
                            objQ14 = eVar5;
                        }
                    }
                    p2Var2.g(strQ2, null, null, eVar3, null, false, false, (e23.a) objQ14, mVar7, 3072, 246);
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 2:
                pt1.c cVar6 = (pt1.c) obj13;
                je2.b bVar7 = (je2.b) obj12;
                e23.l lVar10 = (e23.l) obj11;
                e23.a aVar12 = (e23.a) obj4;
                e23.l lVar11 = (e23.l) obj9;
                o53.b0 b0Var6 = (o53.b0) obj8;
                e23.l lVar12 = (e23.l) obj10;
                e23.r rVar = (e23.r) obj6;
                e23.a aVar13 = (e23.a) obj7;
                e23.a aVar14 = (e23.a) obj5;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((h2) obj).getClass();
                if (mVar8.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    h4.r.a aVar15 = h4.r.S;
                    h4.d.f81522a.getClass();
                    z0 z0VarD4 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode6 = Long.hashCode(mVar8.getU());
                    i2 i2VarX6 = mVar8.x();
                    h4.r rVarC6 = h4.k.c(aVar15, mVar8);
                    h5.g.V.getClass();
                    h5.e0.a aVar16 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar16);
                    } else {
                        mVar8.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD4, mVar8);
                    b4.c(h5.g.a.f81809f, i2VarX6, mVar8);
                    h5.g.a.b bVar8 = h5.g.a.f81813j;
                    if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode6))) {
                        v.h.z(iHashCode6, mVar8, iHashCode6, bVar8);
                    }
                    b4.c(h5.g.a.f81807d, rVarC6, mVar8);
                    c2.u uVar = c2.u.f22885a;
                    boolean zContains = p13.x.k(kt1.a.MULTIPLE_TRAIL_PREVIEW, kt1.a.SINGLE_TRAIL_PREVIEW).contains(cVar6.f140820e.f140798a);
                    int i30 = w1.a.f65931a[cVar6.f140820e.f140798a.ordinal()];
                    boolean z15 = (i30 == 1 || i30 == 2) ? false : true;
                    pt1.d dVar3 = cVar6.f140819d;
                    boolean zB10 = mVar8.B(lVar11) | mVar8.r(b0Var6) | mVar8.r(bVar7) | mVar8.r(cVar6);
                    Object objQ15 = mVar8.q();
                    if (zB10) {
                        af0.e eVar6 = new af0.e(lVar11, b0Var6, bVar7, cVar6, 20);
                        mVar8.K(eVar6);
                        objQ15 = eVar6;
                    } else {
                        aVar4.getClass();
                        if (objQ15 == p3.m.a.f135155b) {
                            af0.e eVar7 = new af0.e(lVar11, b0Var6, bVar7, cVar6, 20);
                            mVar8.K(eVar7);
                            objQ15 = eVar7;
                        }
                    }
                    e23.a aVar17 = (e23.a) objQ15;
                    boolean zR4 = mVar8.r(b0Var6) | mVar8.r(bVar7) | mVar8.B(lVar12);
                    Object objQ16 = mVar8.q();
                    if (zR4) {
                        objQ16 = new cw1.g0(b0Var6, 15, lVar12, bVar7);
                        mVar8.K(objQ16);
                    } else {
                        aVar4.getClass();
                        if (objQ16 == p3.m.a.f135155b) {
                            objQ16 = new cw1.g0(b0Var6, 15, lVar12, bVar7);
                            mVar8.K(objQ16);
                        }
                    }
                    w1.a(dVar3, bVar7, zContains, z15, lVar10, aVar12, aVar17, (e23.a) objQ16, rVar, lVar12, mVar8, 64);
                    if (cVar6.f140817b) {
                        mVar8.C(-1108855419);
                        boolean z16 = cVar6.f140822g;
                        h4.r rVarC7 = uVar.c(aVar15, h4.d.a.f81531i);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        w1.d(0, aVar13, c2.l.y(rVarC7, j92.b.f97899b.f97920e), mVar8, z16);
                        mVar8.f();
                    } else {
                        mVar8.C(-1108403749);
                        mVar8.f();
                    }
                    pt1.i iVar3 = cVar6.f140821f.f140870d;
                    boolean zR5 = mVar8.r(cVar6) | mVar8.r(bVar7) | mVar8.B(aVar14);
                    Object objQ17 = mVar8.q();
                    if (zR5) {
                        objQ17 = new r1(cVar6, aVar14, bVar7, null);
                        mVar8.K(objQ17);
                    } else {
                        aVar4.getClass();
                        if (objQ17 == p3.m.a.f135155b) {
                            objQ17 = new r1(cVar6, aVar14, bVar7, null);
                            mVar8.K(objQ17);
                        }
                    }
                    l0.e((e23.p) objQ17, iVar3, mVar8);
                    mVar8.y();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 3:
                p1 p1Var7 = (p1) obj10;
                e23.l lVar13 = (e23.l) obj13;
                o1 o1Var = (o1) obj12;
                o51.d dVar4 = (o51.d) obj11;
                e23.a aVar18 = (e23.a) obj4;
                e2.i0 i0Var = (e2.i0) obj9;
                e23.l lVar14 = (e23.l) obj8;
                e23.l lVar15 = (e23.l) obj6;
                p1 p1Var8 = (p1) obj7;
                e23.a aVar19 = (e23.a) obj5;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar9.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h4.r.a aVar20 = h4.r.S;
                    h4.r rVarD = x2.d(aVar20, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar21 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA2 = c2.y.a(c2.j.f22694d, aVar21, mVar9, 48);
                    int iHashCode7 = Long.hashCode(mVar9.getU());
                    i2 i2VarX7 = mVar9.x();
                    h4.r rVarC8 = h4.k.c(rVarD, mVar9);
                    h5.g.V.getClass();
                    h5.e0.a aVar22 = h5.g.a.f81805b;
                    if (mVar9.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar9.z();
                    if (mVar9.getT()) {
                        mVar9.M(aVar22);
                    } else {
                        mVar9.c();
                    }
                    h5.g.a.e eVar8 = h5.g.a.f81810g;
                    b4.c(eVar8, zVarA2, mVar9);
                    h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                    b4.c(c1623g2, i2VarX7, mVar9);
                    h5.g.a.b bVar9 = h5.g.a.f81813j;
                    if (mVar9.getT()) {
                        lVar = lVar13;
                        aVar2 = aVar18;
                    } else {
                        aVar2 = aVar18;
                        lVar = lVar13;
                        if (!p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode7))) {
                        }
                        fVar2 = h5.g.a.f81807d;
                        b4.c(fVar2, rVarC8, mVar9);
                        b0Var = c2.b0.f22601a;
                        z14 = dVar4.f129225c;
                        gVar = dVar4.f129227e;
                        cVar = dVar4.f129226d;
                        if (z14) {
                            mVar9.C(-2035553273);
                            h4.r rVarB = a2.b(b0Var.a(aVar20, 1.0f, true), a2.a(mVar9), true);
                            z0VarD3 = c2.q.d(h4.d.a.f81528f, false);
                            iHashCode4 = Long.hashCode(mVar9.getU());
                            i2VarX4 = mVar9.x();
                            rVarC4 = h4.k.c(rVarB, mVar9);
                            if (mVar9.F() != null) {
                                p0.l();
                                throw null;
                            }
                            mVar9.z();
                            if (mVar9.getT()) {
                                mVar9.M(aVar22);
                            } else {
                                mVar9.c();
                            }
                            b4.c(eVar8, z0VarD3, mVar9);
                            b4.c(c1623g2, i2VarX4, mVar9);
                            if (mVar9.getT() || !p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode4))) {
                                v.h.z(iHashCode4, mVar9, iHashCode4, bVar9);
                            }
                            b4.c(fVar2, rVarC4, mVar9);
                            c2.u uVar2 = c2.u.f22885a;
                            h51.b.f82076a.getClass();
                            b82.n.a(h51.b.f82077b, gl1.y.Q(mVar9, R.string.pacepro_lbl_error_state_message), gl1.y.Q(mVar9, R.string.pacepro_lbl_error_state_pull_to_refresh_hint), null, null, mVar9, 6, 24);
                            mVar9.y();
                            mVar9.f();
                        } else {
                            if (cVar == null) {
                                mVar9.C(-2034569240);
                                h4.r rVarB2 = a2.b(b0Var.a(aVar20, 1.0f, true), a2.a(mVar9), true);
                                z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                                iHashCode3 = Long.hashCode(mVar9.getU());
                                i2VarX3 = mVar9.x();
                                rVarC3 = h4.k.c(rVarB2, mVar9);
                                if (mVar9.F() != null) {
                                    p0.l();
                                    throw null;
                                }
                                mVar9.z();
                                if (mVar9.getT()) {
                                    mVar9.M(aVar22);
                                } else {
                                    mVar9.c();
                                }
                                b4.c(eVar8, z0VarD2, mVar9);
                                b4.c(c1623g2, i2VarX3, mVar9);
                                if (mVar9.getT() || !p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode3))) {
                                    v.h.z(iHashCode3, mVar9, iHashCode3, bVar9);
                                }
                                b4.c(fVar2, rVarC3, mVar9);
                                c2.u uVar3 = c2.u.f22885a;
                                mVar9.y();
                                mVar9.f();
                            } else if (cVar.isEmpty()) {
                                mVar9.C(-2034236672);
                                h4.r rVarB3 = a2.b(b0Var.a(aVar20, 1.0f, true), a2.a(mVar9), true);
                                z0VarD = c2.q.d(h4.d.a.f81525c, false);
                                iHashCode2 = Long.hashCode(mVar9.getU());
                                i2VarX2 = mVar9.x();
                                rVarC2 = h4.k.c(rVarB3, mVar9);
                                if (mVar9.F() != null) {
                                    p0.l();
                                    throw null;
                                }
                                mVar9.z();
                                if (mVar9.getT()) {
                                    mVar9.M(aVar22);
                                } else {
                                    mVar9.c();
                                }
                                b4.c(eVar8, z0VarD, mVar9);
                                b4.c(c1623g2, i2VarX2, mVar9);
                                if (mVar9.getT() || !p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode2))) {
                                    v.h.z(iHashCode2, mVar9, iHashCode2, bVar9);
                                }
                                b4.c(fVar2, rVarC2, mVar9);
                                c2.u uVar4 = c2.u.f22885a;
                                h51.b.f82076a.getClass();
                                b82.n.a(h51.b.f82078c, gl1.y.Q(mVar9, R.string.pacepro_lbl_empty_state_title), gl1.y.Q(mVar9, R.string.pacepro_lbl_empty_state_message), null, null, mVar9, 6, 24);
                                mVar3 = mVar9;
                                mVar3.y();
                                mVar3.f();
                            } else {
                                mVar3 = mVar9;
                                mVar3.C(-2033177898);
                                h4.r rVarA = b0Var.a(aVar20, 1.0f, true);
                                zR = mVar3.r(dVar4) | mVar3.B(o1Var) | mVar3.B(p1Var7) | mVar3.B(lVar14) | mVar3.B(lVar15);
                                objQ9 = mVar3.q();
                                if (zR) {
                                    e1 e1Var = new e1(dVar4, o1Var, p1Var7, lVar14, lVar15, 22);
                                    mVar3.K(e1Var);
                                    objQ9 = e1Var;
                                } else {
                                    aVar4.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        e1 e1Var2 = new e1(dVar4, o1Var, p1Var7, lVar14, lVar15, 22);
                                        mVar3.K(e1Var2);
                                        objQ9 = e1Var2;
                                    }
                                }
                                e2.c.b(rVarA, i0Var, null, null, aVar21, null, false, null, (e23.l) objQ9, mVar3, 196608, 476);
                                cVar2 = (o51.c) p13.h0.d0(cVar);
                                zB7 = mVar3.B(p1Var8) | mVar3.r(cVar2) | mVar3.B(i0Var);
                                objQ10 = mVar3.q();
                                if (zB7) {
                                    objQ10 = new h51.d.C1625d(cVar2, i0Var, p1Var8, null);
                                    mVar3.K(objQ10);
                                } else {
                                    aVar4.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new h51.d.C1625d(cVar2, i0Var, p1Var8, null);
                                        mVar3.K(objQ10);
                                    }
                                }
                                l0.e((e23.p) objQ10, cVar2, mVar3);
                                mVar3.f();
                            }
                            l72.f0 f0Var = l72.f0.f110999a;
                            String strQ3 = gl1.y.Q(mVar3, R.string.create_pacepro_strategy);
                            h4.r rVarF5 = x2.f(aVar20, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f0Var.d(0, 9, aVar19, c2.l.y(rVarF5, j92.b.f97899b.f97920e), strQ3, mVar3, null, false);
                            mVar3.y();
                            if (((Boolean) p1Var7.getF182175a()).booleanValue()) {
                                mVar3.C(437328515);
                                zB8 = mVar3.B(p1Var7);
                                objQ11 = mVar3.q();
                                if (zB8) {
                                    objQ11 = new gp.e(p1Var7, 16);
                                    mVar3.K(objQ11);
                                } else {
                                    aVar4.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new gp.e(p1Var7, 16);
                                        mVar3.K(objQ11);
                                    }
                                }
                                e23.a aVar23 = (e23.a) objQ11;
                                lVar2 = lVar;
                                zB9 = mVar3.B(lVar2) | mVar3.B(o1Var) | mVar3.B(p1Var7);
                                objQ12 = mVar3.q();
                                if (zB9) {
                                    objQ12 = new h51.c(lVar2, o1Var, p1Var7);
                                    mVar3.K(objQ12);
                                } else {
                                    aVar4.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        objQ12 = new h51.c(lVar2, o1Var, p1Var7);
                                        mVar3.K(objQ12);
                                    }
                                }
                                o53.f0.h(aVar23, (e23.a) objQ12, mVar3, 0);
                                mVar3.f();
                            } else {
                                mVar3.C(437682163);
                                mVar3.f();
                            }
                            if (gVar.f129264c) {
                                mVar3.C(437753711);
                                f51.a.a(0, aVar2, gVar.f129265d, mVar3);
                                mVar3.f();
                            } else {
                                aVar3 = aVar2;
                                if (gVar.f129263b) {
                                    mVar3.C(438029797);
                                    xy2.b.g(aVar3, mVar3, 0);
                                    mVar3.f();
                                } else {
                                    mVar3.C(438166259);
                                    mVar3.f();
                                }
                            }
                        }
                        mVar3 = mVar9;
                        l72.f0 f0Var2 = l72.f0.f110999a;
                        String strQ4 = gl1.y.Q(mVar3, R.string.create_pacepro_strategy);
                        h4.r rVarF6 = x2.f(aVar20, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f0Var2.d(0, 9, aVar19, c2.l.y(rVarF6, j92.b.f97899b.f97920e), strQ4, mVar3, null, false);
                        mVar3.y();
                        if (((Boolean) p1Var7.getF182175a()).booleanValue()) {
                            mVar3.C(437328515);
                            zB8 = mVar3.B(p1Var7);
                            objQ11 = mVar3.q();
                            if (zB8) {
                                aVar4.getClass();
                                if (objQ11 == p3.m.a.f135155b) {
                                    objQ11 = new gp.e(p1Var7, 16);
                                    mVar3.K(objQ11);
                                }
                            } else {
                                objQ11 = new gp.e(p1Var7, 16);
                                mVar3.K(objQ11);
                            }
                            e23.a aVar24 = (e23.a) objQ11;
                            lVar2 = lVar;
                            zB9 = mVar3.B(lVar2) | mVar3.B(o1Var) | mVar3.B(p1Var7);
                            objQ12 = mVar3.q();
                            if (zB9) {
                                aVar4.getClass();
                                if (objQ12 == p3.m.a.f135155b) {
                                    objQ12 = new h51.c(lVar2, o1Var, p1Var7);
                                    mVar3.K(objQ12);
                                }
                            } else {
                                objQ12 = new h51.c(lVar2, o1Var, p1Var7);
                                mVar3.K(objQ12);
                            }
                            o53.f0.h(aVar24, (e23.a) objQ12, mVar3, 0);
                            mVar3.f();
                        } else {
                            mVar3.C(437682163);
                            mVar3.f();
                        }
                        if (gVar.f129264c) {
                            mVar3.C(437753711);
                            f51.a.a(0, aVar2, gVar.f129265d, mVar3);
                            mVar3.f();
                        } else {
                            aVar3 = aVar2;
                            if (gVar.f129263b) {
                                mVar3.C(438029797);
                                xy2.b.g(aVar3, mVar3, 0);
                                mVar3.f();
                            } else {
                                mVar3.C(438166259);
                                mVar3.f();
                            }
                        }
                    }
                    v.h.z(iHashCode7, mVar9, iHashCode7, bVar9);
                    fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC8, mVar9);
                    b0Var = c2.b0.f22601a;
                    z14 = dVar4.f129225c;
                    gVar = dVar4.f129227e;
                    cVar = dVar4.f129226d;
                    if (z14) {
                        mVar9.C(-2035553273);
                        h4.r rVarB4 = a2.b(b0Var.a(aVar20, 1.0f, true), a2.a(mVar9), true);
                        z0VarD3 = c2.q.d(h4.d.a.f81528f, false);
                        iHashCode4 = Long.hashCode(mVar9.getU());
                        i2VarX4 = mVar9.x();
                        rVarC4 = h4.k.c(rVarB4, mVar9);
                        if (mVar9.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar9.z();
                        if (mVar9.getT()) {
                            mVar9.M(aVar22);
                        } else {
                            mVar9.c();
                        }
                        b4.c(eVar8, z0VarD3, mVar9);
                        b4.c(c1623g2, i2VarX4, mVar9);
                        if (mVar9.getT()) {
                            v.h.z(iHashCode4, mVar9, iHashCode4, bVar9);
                        } else {
                            v.h.z(iHashCode4, mVar9, iHashCode4, bVar9);
                        }
                        b4.c(fVar2, rVarC4, mVar9);
                        c2.u uVar5 = c2.u.f22885a;
                        h51.b.f82076a.getClass();
                        b82.n.a(h51.b.f82077b, gl1.y.Q(mVar9, R.string.pacepro_lbl_error_state_message), gl1.y.Q(mVar9, R.string.pacepro_lbl_error_state_pull_to_refresh_hint), null, null, mVar9, 6, 24);
                        mVar9.y();
                        mVar9.f();
                    } else {
                        if (cVar == null) {
                            mVar9.C(-2034569240);
                            h4.r rVarB5 = a2.b(b0Var.a(aVar20, 1.0f, true), a2.a(mVar9), true);
                            z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                            iHashCode3 = Long.hashCode(mVar9.getU());
                            i2VarX3 = mVar9.x();
                            rVarC3 = h4.k.c(rVarB5, mVar9);
                            if (mVar9.F() != null) {
                                p0.l();
                                throw null;
                            }
                            mVar9.z();
                            if (mVar9.getT()) {
                                mVar9.M(aVar22);
                            } else {
                                mVar9.c();
                            }
                            b4.c(eVar8, z0VarD2, mVar9);
                            b4.c(c1623g2, i2VarX3, mVar9);
                            if (mVar9.getT()) {
                                v.h.z(iHashCode3, mVar9, iHashCode3, bVar9);
                            } else {
                                v.h.z(iHashCode3, mVar9, iHashCode3, bVar9);
                            }
                            b4.c(fVar2, rVarC3, mVar9);
                            c2.u uVar6 = c2.u.f22885a;
                            mVar9.y();
                            mVar9.f();
                        } else if (cVar.isEmpty()) {
                            mVar9.C(-2034236672);
                            h4.r rVarB6 = a2.b(b0Var.a(aVar20, 1.0f, true), a2.a(mVar9), true);
                            z0VarD = c2.q.d(h4.d.a.f81525c, false);
                            iHashCode2 = Long.hashCode(mVar9.getU());
                            i2VarX2 = mVar9.x();
                            rVarC2 = h4.k.c(rVarB6, mVar9);
                            if (mVar9.F() != null) {
                                p0.l();
                                throw null;
                            }
                            mVar9.z();
                            if (mVar9.getT()) {
                                mVar9.M(aVar22);
                            } else {
                                mVar9.c();
                            }
                            b4.c(eVar8, z0VarD, mVar9);
                            b4.c(c1623g2, i2VarX2, mVar9);
                            if (mVar9.getT()) {
                                v.h.z(iHashCode2, mVar9, iHashCode2, bVar9);
                            } else {
                                v.h.z(iHashCode2, mVar9, iHashCode2, bVar9);
                            }
                            b4.c(fVar2, rVarC2, mVar9);
                            c2.u uVar7 = c2.u.f22885a;
                            h51.b.f82076a.getClass();
                            b82.n.a(h51.b.f82078c, gl1.y.Q(mVar9, R.string.pacepro_lbl_empty_state_title), gl1.y.Q(mVar9, R.string.pacepro_lbl_empty_state_message), null, null, mVar9, 6, 24);
                            mVar3 = mVar9;
                            mVar3.y();
                            mVar3.f();
                        } else {
                            mVar3 = mVar9;
                            mVar3.C(-2033177898);
                            h4.r rVarA2 = b0Var.a(aVar20, 1.0f, true);
                            zR = mVar3.r(dVar4) | mVar3.B(o1Var) | mVar3.B(p1Var7) | mVar3.B(lVar14) | mVar3.B(lVar15);
                            objQ9 = mVar3.q();
                            if (zR) {
                                aVar4.getClass();
                                if (objQ9 == p3.m.a.f135155b) {
                                    e1 e1Var3 = new e1(dVar4, o1Var, p1Var7, lVar14, lVar15, 22);
                                    mVar3.K(e1Var3);
                                    objQ9 = e1Var3;
                                }
                            } else {
                                e1 e1Var4 = new e1(dVar4, o1Var, p1Var7, lVar14, lVar15, 22);
                                mVar3.K(e1Var4);
                                objQ9 = e1Var4;
                            }
                            e2.c.b(rVarA2, i0Var, null, null, aVar21, null, false, null, (e23.l) objQ9, mVar3, 196608, 476);
                            cVar2 = (o51.c) p13.h0.d0(cVar);
                            zB7 = mVar3.B(p1Var8) | mVar3.r(cVar2) | mVar3.B(i0Var);
                            objQ10 = mVar3.q();
                            if (zB7) {
                                aVar4.getClass();
                                if (objQ10 == p3.m.a.f135155b) {
                                    objQ10 = new h51.d.C1625d(cVar2, i0Var, p1Var8, null);
                                    mVar3.K(objQ10);
                                }
                            } else {
                                objQ10 = new h51.d.C1625d(cVar2, i0Var, p1Var8, null);
                                mVar3.K(objQ10);
                            }
                            l0.e((e23.p) objQ10, cVar2, mVar3);
                            mVar3.f();
                        }
                        l72.f0 f0Var3 = l72.f0.f110999a;
                        String strQ5 = gl1.y.Q(mVar3, R.string.create_pacepro_strategy);
                        h4.r rVarF7 = x2.f(aVar20, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f0Var3.d(0, 9, aVar19, c2.l.y(rVarF7, j92.b.f97899b.f97920e), strQ5, mVar3, null, false);
                        mVar3.y();
                        if (((Boolean) p1Var7.getF182175a()).booleanValue()) {
                            mVar3.C(437328515);
                            zB8 = mVar3.B(p1Var7);
                            objQ11 = mVar3.q();
                            if (zB8) {
                                aVar4.getClass();
                                if (objQ11 == p3.m.a.f135155b) {
                                    objQ11 = new gp.e(p1Var7, 16);
                                    mVar3.K(objQ11);
                                }
                            } else {
                                objQ11 = new gp.e(p1Var7, 16);
                                mVar3.K(objQ11);
                            }
                            e23.a aVar25 = (e23.a) objQ11;
                            lVar2 = lVar;
                            zB9 = mVar3.B(lVar2) | mVar3.B(o1Var) | mVar3.B(p1Var7);
                            objQ12 = mVar3.q();
                            if (zB9) {
                                aVar4.getClass();
                                if (objQ12 == p3.m.a.f135155b) {
                                    objQ12 = new h51.c(lVar2, o1Var, p1Var7);
                                    mVar3.K(objQ12);
                                }
                            } else {
                                objQ12 = new h51.c(lVar2, o1Var, p1Var7);
                                mVar3.K(objQ12);
                            }
                            o53.f0.h(aVar25, (e23.a) objQ12, mVar3, 0);
                            mVar3.f();
                        } else {
                            mVar3.C(437682163);
                            mVar3.f();
                        }
                        if (gVar.f129264c) {
                            mVar3.C(437753711);
                            f51.a.a(0, aVar2, gVar.f129265d, mVar3);
                            mVar3.f();
                        } else {
                            aVar3 = aVar2;
                            if (gVar.f129263b) {
                                mVar3.C(438029797);
                                xy2.b.g(aVar3, mVar3, 0);
                                mVar3.f();
                            } else {
                                mVar3.C(438166259);
                                mVar3.f();
                            }
                        }
                    }
                    mVar3 = mVar9;
                    l72.f0 f0Var4 = l72.f0.f110999a;
                    String strQ6 = gl1.y.Q(mVar3, R.string.create_pacepro_strategy);
                    h4.r rVarF8 = x2.f(aVar20, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f0Var4.d(0, 9, aVar19, c2.l.y(rVarF8, j92.b.f97899b.f97920e), strQ6, mVar3, null, false);
                    mVar3.y();
                    if (((Boolean) p1Var7.getF182175a()).booleanValue()) {
                        mVar3.C(437328515);
                        zB8 = mVar3.B(p1Var7);
                        objQ11 = mVar3.q();
                        if (zB8) {
                            aVar4.getClass();
                            if (objQ11 == p3.m.a.f135155b) {
                                objQ11 = new gp.e(p1Var7, 16);
                                mVar3.K(objQ11);
                            }
                        } else {
                            objQ11 = new gp.e(p1Var7, 16);
                            mVar3.K(objQ11);
                        }
                        e23.a aVar26 = (e23.a) objQ11;
                        lVar2 = lVar;
                        zB9 = mVar3.B(lVar2) | mVar3.B(o1Var) | mVar3.B(p1Var7);
                        objQ12 = mVar3.q();
                        if (zB9) {
                            aVar4.getClass();
                            if (objQ12 == p3.m.a.f135155b) {
                                objQ12 = new h51.c(lVar2, o1Var, p1Var7);
                                mVar3.K(objQ12);
                            }
                        } else {
                            objQ12 = new h51.c(lVar2, o1Var, p1Var7);
                            mVar3.K(objQ12);
                        }
                        o53.f0.h(aVar26, (e23.a) objQ12, mVar3, 0);
                        mVar3.f();
                    } else {
                        mVar3.C(437682163);
                        mVar3.f();
                    }
                    if (gVar.f129264c) {
                        mVar3.C(437753711);
                        f51.a.a(0, aVar2, gVar.f129265d, mVar3);
                        mVar3.f();
                    } else {
                        aVar3 = aVar2;
                        if (gVar.f129263b) {
                            mVar3.C(438029797);
                            xy2.b.g(aVar3, mVar3, 0);
                            mVar3.f();
                        } else {
                            mVar3.C(438166259);
                            mVar3.f();
                        }
                    }
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 4:
                return a(obj, obj2, obj3);
            case 5:
                return b(obj, obj2, obj3);
            case 6:
                o53.b0 b0Var7 = (o53.b0) obj13;
                mc mcVar = (mc) obj12;
                p1 p1Var9 = (p1) obj10;
                i53.c<b82.s.b> cVar7 = (i53.c) obj11;
                i53.c<b82.s.b> cVar8 = (i53.c) obj9;
                p1 p1Var10 = (p1) obj8;
                p1 p1Var11 = (p1) obj6;
                p1 p1Var12 = (p1) obj7;
                p1 p1Var13 = (p1) obj5;
                p1 p1Var14 = (p1) obj4;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar10.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    if (((Boolean) p1Var10.getF182175a()).booleanValue()) {
                        mVar10.C(331229521);
                        boolean zR6 = mVar10.r(b0Var7) | mVar10.B(mcVar) | mVar10.B(p1Var9);
                        Object objQ18 = mVar10.q();
                        if (zR6) {
                            objQ18 = new fo.j(b0Var7, mcVar, p1Var9, 12);
                            mVar10.K(objQ18);
                        } else {
                            aVar4.getClass();
                            if (objQ18 == p3.m.a.f135155b) {
                                objQ18 = new fo.j(b0Var7, mcVar, p1Var9, 12);
                                mVar10.K(objQ18);
                            }
                        }
                        u1.a((e23.a) objQ18, mVar10, 0);
                        mVar10.f();
                    } else {
                        mVar10.C(331662095);
                        b82.s sVar = b82.s.f16758a;
                        String str4 = ((Boolean) p1Var11.getF182175a()).booleanValue() ? "What’s New in [Feature]" : null;
                        String str5 = ((Boolean) p1Var12.getF182175a()).booleanValue() ? "[Changes Made]" : null;
                        i53.c<b82.s.b> cVar9 = ((Boolean) p1Var13.getF182175a()).booleanValue() ? cVar7 : cVar8;
                        if (((Boolean) p1Var14.getF182175a()).booleanValue()) {
                            mVar10.C(1087432543);
                            mVar10.f();
                            strH = "Custom Label ";
                        } else {
                            strH = sn.a.h(mVar10, 1950371350, R.string.gak_lbl_continue, mVar10);
                        }
                        String str6 = strH;
                        boolean zR7 = mVar10.r(b0Var7) | mVar10.B(mcVar) | mVar10.B(p1Var9);
                        Object objQ19 = mVar10.q();
                        if (zR7) {
                            objQ19 = new fo.j(b0Var7, mcVar, p1Var9, 13);
                            mVar10.K(objQ19);
                        } else {
                            aVar4.getClass();
                            if (objQ19 == p3.m.a.f135155b) {
                                objQ19 = new fo.j(b0Var7, mcVar, p1Var9, 13);
                                mVar10.K(objQ19);
                            }
                        }
                        int i34 = b82.s.b.f16761e;
                        sVar.a(str4, str5, str6, cVar9, (e23.a) objQ19, mVar10, 0, 0);
                        mVar10.f();
                    }
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 7:
                return c(obj, obj2, obj3);
            case 8:
                return d(obj, obj2, obj3);
            case 9:
                return e(obj, obj2, obj3);
            case 10:
                return f(obj, obj2, obj3);
            default:
                a50.g gVar3 = (a50.g) obj13;
                e23.l lVar16 = (e23.l) obj12;
                a1 a1Var = (a1) obj11;
                p1 p1Var15 = (p1) obj10;
                p1 p1Var16 = (p1) obj9;
                p1 p1Var17 = (p1) obj8;
                n1 n1Var12 = (n1) obj7;
                p1 p1Var18 = (p1) obj6;
                n1 n1Var13 = (n1) obj5;
                n1 n1Var14 = (n1) obj4;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((h2) obj).getClass();
                if (mVar11.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h4.r.a aVar27 = h4.r.S;
                    h4.d.f81522a.getClass();
                    z0 z0VarD5 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode8 = Long.hashCode(mVar11.getU());
                    i2 i2VarX8 = mVar11.x();
                    h4.r rVarC9 = h4.k.c(aVar27, mVar11);
                    h5.g.V.getClass();
                    h5.e0.a aVar28 = h5.g.a.f81805b;
                    if (mVar11.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar11.z();
                    if (mVar11.getT()) {
                        mVar11.M(aVar28);
                    } else {
                        mVar11.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD5, mVar11);
                    b4.c(h5.g.a.f81809f, i2VarX8, mVar11);
                    h5.g.a.b bVar10 = h5.g.a.f81813j;
                    if (mVar11.getT() || !p005kotlin.jvm.internal.s.g(mVar11.q(), Integer.valueOf(iHashCode8))) {
                        v.h.z(iHashCode8, mVar11, iHashCode8, bVar10);
                    }
                    b4.c(h5.g.a.f81807d, rVarC9, mVar11);
                    c2.u uVar8 = c2.u.f22885a;
                    Object objQ20 = mVar11.q();
                    aVar4.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ20 == c2565a2) {
                        objQ20 = new xq1.c(p1Var15, 6);
                        mVar11.K(objQ20);
                    }
                    mVar11.L(1765406104);
                    g8.a.a(y40.p.class, aVar27, g8.i.U(mVar11), Bundle.EMPTY, (e23.l) objQ20, mVar11, 24576, 0);
                    mVar11.R();
                    if (((Boolean) p1Var16.getF182175a()).booleanValue()) {
                        mVar11.C(503495470);
                        Drawable drawable = (Drawable) p1Var17.getF182175a();
                        if (drawable == null) {
                            mVar11.C(-1571509613);
                            mVar11.f();
                        } else {
                            mVar11.C(-1571509612);
                            y0.a(DrawablePainter2Kt.rememberDrawablePainter(drawable, mVar11, 0), null, c2.l.C(uVar8.c(aVar27, h4.d.a.f81528f), 0.0f, 0.0f, 0.0f, w02.b0.x(mVar11, n1Var12.getIntValue()), 7), null, null, 0.0f, null, mVar11, 48, 120);
                            mVar11.f();
                        }
                        mVar11.f();
                    } else {
                        mVar11.C(-1571100629);
                        mVar11.f();
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA3 = v2.a(c2.l.y(aVar27, j92.b.f97899b.f97920e), gVar3.f1392c, new xn.a(20), mVar11, 0);
                    k2.h hVar = k2.i.f102406a;
                    long j8 = d92.b.a(mVar11).f().f63508c;
                    long j14 = d92.b.a(mVar11).f().f63509d;
                    boolean zB11 = mVar11.B(lVar16);
                    Object objQ21 = mVar11.q();
                    if (zB11 || objQ21 == c2565a2) {
                        objQ21 = new ub0.h(lVar16, 23);
                        mVar11.K(objQ21);
                    }
                    y40.d.f194398a.getClass();
                    d7.d((e23.a) objQ21, rVarA3, hVar, j8, j14, null, y40.d.f194399b, mVar11, 12582912, 96);
                    if (((Boolean) p1Var18.getF182175a()).booleanValue() || a1Var.f87409a.c() != pc.PartiallyExpanded || n1Var13.getIntValue() <= 0 || n1Var14.getIntValue() <= 0) {
                        mVar11.C(-1569715797);
                        mVar11.f();
                    } else {
                        mVar11.C(-1570102119);
                        h4.r rVarC10 = c2.l.C(uVar8.c(aVar27, h4.d.a.f81531i), 0.0f, 0.0f, 0.0f, w02.b0.x(mVar11, n1Var14.getIntValue() + n1Var13.getIntValue()), 7);
                        boolean z17 = gVar3.f1396g.size() > 1;
                        boolean z18 = gVar3.f1407r;
                        a50.b bVar11 = gVar3.f1398i;
                        y40.o.a(rVarC10, new a50.f(z17, z18, bVar11.f1247a && z18 && bVar11.f1250d), lVar16, mVar11, 0);
                        mVar11.f();
                    }
                    mVar11.y();
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l(Comparable comparable, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, p1 p1Var, p1 p1Var2, p1 p1Var3, int i14) {
        this.f336a = i14;
        this.f339d = comparable;
        this.f340e = obj;
        this.f341f = obj2;
        this.f342g = obj3;
        this.f343h = obj4;
        this.f344i = obj5;
        this.f337b = obj6;
        this.f338c = p1Var;
        this.f345j = p1Var2;
        this.f346k = p1Var3;
    }

    public /* synthetic */ l(Object obj, e23.l lVar, a1 a1Var, p1 p1Var, p1 p1Var2, p1 p1Var3, n1 n1Var, p1 p1Var4, n1 n1Var2, n1 n1Var3, int i14) {
        this.f336a = i14;
        this.f339d = obj;
        this.f340e = lVar;
        this.f341f = a1Var;
        this.f338c = p1Var;
        this.f342g = p1Var2;
        this.f343h = p1Var3;
        this.f345j = n1Var;
        this.f344i = p1Var4;
        this.f346k = n1Var2;
        this.f337b = n1Var3;
    }

    public /* synthetic */ l(Object obj, Object obj2, p1 p1Var, List list, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, x3 x3Var, int i14) {
        this.f336a = i14;
        this.f339d = obj;
        this.f340e = obj2;
        this.f338c = p1Var;
        this.f341f = list;
        this.f342g = obj3;
        this.f343h = obj4;
        this.f344i = obj5;
        this.f345j = obj6;
        this.f346k = obj7;
        this.f337b = x3Var;
    }

    public /* synthetic */ l(String str, i53.f fVar, j0 j0Var, i iVar, e23.p pVar, p1 p1Var, p3.l1 l1Var, n1 n1Var, n1 n1Var2, e23.a aVar) {
        this.f336a = 0;
        this.f339d = str;
        this.f340e = fVar;
        this.f341f = j0Var;
        this.f342g = iVar;
        this.f343h = pVar;
        this.f338c = p1Var;
        this.f344i = l1Var;
        this.f345j = n1Var;
        this.f346k = n1Var2;
        this.f337b = aVar;
    }

    public /* synthetic */ l(List list, i53.c cVar, nw0.j0 j0Var, e23.l lVar, nw0.r rVar, o53.b0 b0Var, mc mcVar, p1 p1Var, mc mcVar2, aw0.a aVar) {
        this.f336a = 5;
        this.f339d = list;
        this.f340e = cVar;
        this.f341f = j0Var;
        this.f342g = lVar;
        this.f343h = rVar;
        this.f344i = b0Var;
        this.f345j = mcVar;
        this.f338c = p1Var;
        this.f346k = mcVar2;
        this.f337b = aVar;
    }

    public /* synthetic */ l(p1 p1Var, e23.l lVar, o1 o1Var, o51.d dVar, e23.a aVar, e2.i0 i0Var, e23.l lVar2, e23.l lVar3, p1 p1Var2, e23.a aVar2) {
        this.f336a = 3;
        this.f338c = p1Var;
        this.f339d = lVar;
        this.f340e = o1Var;
        this.f341f = dVar;
        this.f337b = aVar;
        this.f342g = i0Var;
        this.f343h = lVar2;
        this.f344i = lVar3;
        this.f345j = p1Var2;
        this.f346k = aVar2;
    }

    public /* synthetic */ l(pt1.c cVar, je2.b bVar, e23.l lVar, e23.a aVar, e23.l lVar2, o53.b0 b0Var, e23.l lVar3, e23.r rVar, e23.a aVar2, e23.a aVar3) {
        this.f336a = 2;
        this.f339d = cVar;
        this.f340e = bVar;
        this.f341f = lVar;
        this.f337b = aVar;
        this.f342g = lVar2;
        this.f343h = b0Var;
        this.f338c = lVar3;
        this.f344i = rVar;
        this.f345j = aVar2;
        this.f346k = aVar3;
    }

    public /* synthetic */ l(cy0.l lVar, b63.o oVar, Map map, String str, i53.c cVar, fy0.e eVar, Set set, Set set2, p1 p1Var, p1 p1Var2) {
        this.f336a = 7;
        this.f340e = lVar;
        this.f341f = oVar;
        this.f342g = map;
        this.f339d = str;
        this.f343h = cVar;
        this.f344i = eVar;
        this.f345j = set;
        this.f346k = set2;
        this.f338c = p1Var;
        this.f337b = p1Var2;
    }
}
