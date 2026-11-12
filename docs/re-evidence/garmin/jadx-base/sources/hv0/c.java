package hv0;

import androidx.room.a0;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.google.firebase.messaging.Constants;
import e23.l;
import g02.q0;
import h4.k;
import h4.r;
import h5.e0;
import h82.p;
import ho2.o;
import i3.i7;
import i3.mh;
import java.util.LinkedHashMap;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.c0;
import s5.x0;
import v62.e1;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static final void a(m mVar, int i14) {
        o0 o0VarE = mVar.E(1579511654);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            s62.a.f157643a.getClass();
            u4.d dVarA = e1.a(t62.b.f162798a);
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            i7.b(dVarA, null, x2.q(aVar, j92.b.f97901d.f97904c), hb.a.s(o0VarE), o0VarE, 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(i14, 6);
        }
    }

    public static final void b(ou0.b bVar, int i14, l<? super ou0.b, Unit> lVar, e23.a<Unit> aVar, m mVar, int i15) {
        o0 o0VarP = a0.p(lVar, aVar, mVar, -1801734261);
        int i16 = i15 | (o0VarP.B(bVar) ? 4 : 2) | (o0VarP.k(i14) ? 32 : 16) | (o0VarP.r(lVar) ? 256 : 128) | (o0VarP.r(aVar) ? 2048 : 1024);
        if (o0VarP.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarP, 0);
            int iHashCode = Long.hashCode(o0VarP.U);
            i2 i2VarA0 = o0VarP.a0();
            r rVarC = k.c(aVar2, o0VarP);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarP.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar3);
            } else {
                o0VarP.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarP);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarP);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarP.T || !s.g(o0VarP.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarP, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarP);
            b0 b0Var = b0.f22601a;
            String strQ = gl1.y.Q(o0VarP, R.string.msg_choose_friends_to_share_location);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarP);
            r rVarF = x2.f(aVar2, 1.0f);
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar3.getClass();
            mh.c(strQ, c2.l.z(rVarF, f14, eVar.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarP, 0, 0, 131068);
            o0VarP = o0VarP;
            c(bVar, lVar, o0VarP, (i16 & 14) | ((i16 >> 3) & 112));
            c0.c(b0Var, s.g(bVar, ou0.b.C2540b.f133962a), null, null, null, null, z3.f.c(-1119945603, new af1.l(i14, aVar, 5), o0VarP), o0VarP, 1572870, 30);
            o0VarP.g0(true);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(bVar, i14, lVar, aVar, i15, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:49:0x017a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0205  */
    public static final void c(final ou0.b bVar, l<? super ou0.b, Unit> lVar, m mVar, int i14) {
        l<? super ou0.b, Unit> lVar2 = lVar;
        o0 o0VarE = mVar.E(1515743703);
        int i15 = i14 | (o0VarE.B(bVar) ? 4 : 2);
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar2) ? 32 : 16;
        }
        final int i16 = 1;
        final int i17 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            l72.p2 p2Var = l72.p2.f111205a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_off);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_off);
            ou0.b.c cVar = ou0.b.c.f133963a;
            c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, e(strQ2, s.g(bVar, cVar), o0VarE));
            b92.a aVarB = c0235a.b();
            boolean zG = s.g(bVar, cVar);
            z3.e eVarC = z3.f.c(361401974, new e23.p() { // from class: hv0.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = i17;
                    ou0.b bVar3 = bVar;
                    m mVar2 = (m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i18) {
                        case 0:
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var2 = n.f135158a;
                                if (s.g(bVar3, ou0.b.c.f133963a)) {
                                    mVar2.C(-956738257);
                                    c.a(mVar2, 0);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-956679636);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            break;
                        case 1:
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var3 = n.f135158a;
                                if (s.g(bVar3, ou0.b.a.f133961a)) {
                                    mVar2.C(-707620943);
                                    c.a(mVar2, 0);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-707562322);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var4 = n.f135158a;
                                if (s.g(bVar3, ou0.b.C2540b.f133962a)) {
                                    mVar2.C(-1819556312);
                                    c.a(mVar2, 0);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1819497691);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            int i18 = i15 & 112;
            boolean z14 = i18 == 32;
            Object objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (z14) {
                objQ = new gt1.k(lVar2, 4);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new gt1.k(lVar2, 4);
                    o0VarE.K(objQ);
                }
            }
            int i19 = b92.a.f16960b;
            boolean z15 = false;
            p2Var.g(strQ, null, aVarB, null, eVarC, false, zG, (e23.a) objQ, o0VarE, 24576, 170);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_all_friends);
            String strQ4 = gl1.y.Q(o0VarE, R.string.msg_share_location_description_friends);
            b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
            String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_all_friends);
            ou0.b.a aVar4 = ou0.b.a.f133961a;
            String strE = e(strQ5, s.g(bVar, aVar4), o0VarE);
            LinkedHashMap linkedHashMap = c0235a2.f16962a;
            linkedHashMap.put(Constants.ScionAnalytics.PARAM_LABEL, strE);
            linkedHashMap.put("label_secondary", gl1.y.Q(o0VarE, R.string.msg_share_location_description_friends));
            b92.a aVarB2 = c0235a2.b();
            boolean zG2 = s.g(bVar, aVar4);
            z3.e eVarC2 = z3.f.c(-729523756, new e23.p() { // from class: hv0.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i110 = i16;
                    ou0.b bVar3 = bVar;
                    m mVar2 = (m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i110) {
                        case 0:
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var2 = n.f135158a;
                                if (s.g(bVar3, ou0.b.c.f133963a)) {
                                    mVar2.C(-956738257);
                                    c.a(mVar2, 0);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-956679636);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            break;
                        case 1:
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var3 = n.f135158a;
                                if (s.g(bVar3, ou0.b.a.f133961a)) {
                                    mVar2.C(-707620943);
                                    c.a(mVar2, 0);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-707562322);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var4 = n.f135158a;
                                if (s.g(bVar3, ou0.b.C2540b.f133962a)) {
                                    mVar2.C(-1819556312);
                                    c.a(mVar2, 0);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1819497691);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            boolean z16 = i18 == 32;
            Object objQ2 = o0VarE.q();
            if (z16) {
                lVar2 = lVar;
                objQ2 = new gt1.k(lVar2, 5);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    lVar2 = lVar;
                    objQ2 = new gt1.k(lVar2, 5);
                    o0VarE.K(objQ2);
                } else {
                    lVar2 = lVar;
                }
            }
            p2Var.h(strQ3, strQ4, null, null, aVarB2, false, zG2, null, eVarC2, null, (e23.a) objQ2, o0VarE, 100663296, 0, 684);
            String strQ6 = gl1.y.Q(o0VarE, R.string.lbl_invite_only);
            String strQ7 = gl1.y.Q(o0VarE, R.string.msg_share_location_description_invite_only);
            b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
            String strQ8 = gl1.y.Q(o0VarE, R.string.lbl_invite_only);
            ou0.b.C2540b c2540b = ou0.b.C2540b.f133962a;
            String strE2 = e(strQ8, s.g(bVar, c2540b), o0VarE);
            LinkedHashMap linkedHashMap2 = c0235a3.f16962a;
            linkedHashMap2.put(Constants.ScionAnalytics.PARAM_LABEL, strE2);
            linkedHashMap2.put("label_secondary", gl1.y.Q(o0VarE, R.string.msg_share_location_description_invite_only));
            b92.a aVarB3 = c0235a3.b();
            boolean zG3 = s.g(bVar, c2540b);
            final int i24 = 2;
            z3.e eVarC3 = z3.f.c(392081213, new e23.p() { // from class: hv0.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i110 = i24;
                    ou0.b bVar3 = bVar;
                    m mVar2 = (m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i110) {
                        case 0:
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var2 = n.f135158a;
                                if (s.g(bVar3, ou0.b.c.f133963a)) {
                                    mVar2.C(-956738257);
                                    c.a(mVar2, 0);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-956679636);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            break;
                        case 1:
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var3 = n.f135158a;
                                if (s.g(bVar3, ou0.b.a.f133961a)) {
                                    mVar2.C(-707620943);
                                    c.a(mVar2, 0);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-707562322);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var4 = n.f135158a;
                                if (s.g(bVar3, ou0.b.C2540b.f133962a)) {
                                    mVar2.C(-1819556312);
                                    c.a(mVar2, 0);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-1819497691);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            if (i18 == 32) {
                z15 = true;
            }
            Object objQ3 = o0VarE.q();
            if (z15) {
                objQ3 = new gt1.k(lVar2, 3);
                o0VarE.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new gt1.k(lVar2, 3);
                    o0VarE.K(objQ3);
                }
            }
            p2Var.h(strQ6, strQ7, null, null, aVarB3, false, zG3, null, eVarC3, null, (e23.a) objQ3, o0VarE, 100663296, 0, 684);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f2.o(bVar, lVar2, i14, 23);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(gv0.d dVar, int i14, l<? super ou0.b, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i15) {
        dVar.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1132562287);
        int i16 = i15 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            p1 p1VarC = s9.c.c(dVar.f79194k0, o0VarE);
            ou0.f fVar = (ou0.f) ((g3) s9.c.c(dVar.f79204w, o0VarE).getF182175a()).f35301b;
            ou0.b bVar = fVar != null ? fVar.f133984b : null;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_grouptrack);
            gl1.d.b(strQ, aVar2, ((g3) p1VarC.getF182175a()).f35300a == fw.p.LOADING, null, null, null, z3.f.c(-487501501, new a42.m(i14, bVar, lVar, aVar, p1VarC, 1), o0VarE), o0VarE, ((i16 >> 9) & 112) | 1572864, 56);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(dVar, i14, lVar, aVar, aVar2, i15);
        }
    }

    public static final String e(String str, boolean z14, m mVar) {
        x1 x1Var = n.f135158a;
        if (z14) {
            mVar.C(1547463086);
            str = str + ". " + gl1.y.Q(mVar, R.string.lbl_selected);
        } else {
            mVar.C(1547464863);
        }
        mVar.f();
        return str;
    }
}
