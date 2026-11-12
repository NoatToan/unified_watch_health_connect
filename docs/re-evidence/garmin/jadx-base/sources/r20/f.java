package r20;

import c2.b0;
import c2.j;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import l72.f0;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import qk0.o;
import v.h;

/* JADX INFO: loaded from: classes7.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0038  */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x0107  */
    /* JADX WARN: Code duplicated, block: B:48:0x0114  */
    /* JADX WARN: Code duplicated, block: B:50:0x0118  */
    /* JADX WARN: Code duplicated, block: B:53:0x0121  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void a(e23.a aVar, int i14, m mVar, int i15) {
        int i16;
        int i17;
        boolean z14;
        p2 p2VarI0;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar2;
        g.a.b bVar;
        boolean z15;
        Object objQ;
        o0 o0VarE = mVar.E(-1402157497);
        int i18 = i15 & 1;
        if (i18 == 0) {
            if ((i14 & 6) == 0) {
                i17 = (o0VarE.r(aVar) ? 4 : 2) | i14;
            } else {
                i16 = i14;
            }
            if ((i16 & 3) != 2) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i18 != 0) {
                    aVar = null;
                }
                x1 x1Var = n.f135158a;
                h4.d.f81522a.getClass();
                h4.g.a aVar3 = h4.d.a.f81537o;
                r.a aVar4 = r.S;
                j.f22691a.getClass();
                zVarA = y.a(j.f22694d, aVar3, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(aVar4, o0VarE);
                g.V.getClass();
                aVar2 = g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(g.a.f81810g, zVarA, o0VarE);
                b4.c(g.a.f81809f, i2VarA0, o0VarE);
                bVar = g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                u4.d.b bVar2 = u4.d.f168373k;
                b82.n.c(n5.e.b(R.drawable.bike, o0VarE, 6), gl1.y.Q(o0VarE, R.string.loading_error), gl1.y.Q(o0VarE, R.string.trail_reviews_loading_error_message), null, null, o0VarE, 0, 24);
                if (aVar != null) {
                    o0VarE.C(-1190778049);
                    f0 f0Var = f0.f110999a;
                    String strQ = gl1.y.Q(o0VarE, R.string.lbl_reload);
                    if ((i16 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objQ = o0VarE.q();
                    if (z15) {
                        objQ = new o(aVar, 11);
                        o0VarE.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new o(aVar, 11);
                            o0VarE.K(objQ);
                        }
                    }
                    f0Var.d(0, 13, (e23.a) objQ, null, strQ, o0VarE, null, false);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1190618523);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
            } else {
                o0VarE.e();
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new as.f(aVar, i14, i15);
            }
        }
        i17 = i14 | 6;
        i16 = i17;
        if ((i16 & 3) != 2) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i18 != 0) {
                aVar = null;
            }
            x1 x1Var2 = n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.a aVar5 = h4.d.a.f81537o;
            r.a aVar6 = r.S;
            j.f22691a.getClass();
            zVarA = y.a(j.f22694d, aVar5, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(aVar6, o0VarE);
            g.V.getClass();
            aVar2 = g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            bVar = g.a.f81813j;
            if (o0VarE.T) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            u4.d.b bVar3 = u4.d.f168373k;
            b82.n.c(n5.e.b(R.drawable.bike, o0VarE, 6), gl1.y.Q(o0VarE, R.string.loading_error), gl1.y.Q(o0VarE, R.string.trail_reviews_loading_error_message), null, null, o0VarE, 0, 24);
            if (aVar != null) {
                o0VarE.C(-1190778049);
                f0 f0Var2 = f0.f110999a;
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_reload);
                if ((i16 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ = o0VarE.q();
                if (z15) {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new o(aVar, 11);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new o(aVar, 11);
                    o0VarE.K(objQ);
                }
                f0Var2.d(0, 13, (e23.a) objQ, null, strQ2, o0VarE, null, false);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1190618523);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new as.f(aVar, i14, i15);
        }
    }
}
