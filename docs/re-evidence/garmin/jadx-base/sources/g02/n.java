package g02;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.i7;
import i3.p7;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.y3;
import v62.b3;

/* JADX INFO: loaded from: classes10.dex */
public final class n {
    /* JADX WARN: Code duplicated, block: B:84:0x0274  */
    public static final void a(h4.r rVar, String str, int i14, s5.x0 x0Var, String str2, String str3, s5.x0 x0Var2, String str4, String str5, e23.a aVar, p3.m mVar, int i15) {
        String str6;
        String str7;
        int i16;
        String strQ;
        String strQ2;
        String str8;
        boolean z14;
        boolean z15;
        boolean z16;
        p3.o0 o0VarE = mVar.E(-503197324);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i15 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(x0Var) ? 2048 : 1024) | (o0VarE.B(str2) ? 16384 : 8192) | (o0VarE.B(str3) ? 131072 : 65536) | (o0VarE.B(x0Var2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 37748736 | (o0VarE.r(aVar) ? 536870912 : 268435456);
        if (o0VarE.n(i17 & 1, (306783379 & i17) != 306783378)) {
            o0VarE.G0();
            if ((i15 & 1) == 0 || o0VarE.o0()) {
                i16 = i17 & (-264241153);
                strQ = gl1.y.Q(o0VarE, R.string.workout_add_notes);
                strQ2 = gl1.y.Q(o0VarE, R.string.edit_notes);
            } else {
                o0VarE.e();
                strQ2 = str5;
                i16 = i17 & (-264241153);
                strQ = str4;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            if (str.length() == 0) {
                o0VarE.C(287812820);
                if (aVar != null) {
                    o0VarE.C(287845184);
                    y3 y3Var = p7.f89282d;
                    g6.f.f75994b.getClass();
                    p3.v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(129304760, new e11.f0(aVar, strQ, 19, x0Var2), o0VarE), o0VarE, 56);
                    z16 = false;
                    o0VarE.g0(false);
                } else {
                    z16 = false;
                    o0VarE.C(288602452);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z16);
                str6 = strQ;
                str8 = strQ2;
                z15 = true;
            } else {
                o0VarE.C(288654098);
                h4.r.a aVar3 = h4.r.S;
                c2.j.f22691a.getClass();
                String str9 = strQ;
                s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(aVar3, o0VarE);
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                int i18 = i16 << 3;
                str6 = str9;
                int i19 = i16;
                q.b(str, u2Var.a(c2.l.C(aVar3, 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13), 1.0f, true), i14, x0Var, null, str2, str3, x0Var2, o0VarE, ((i16 >> 3) & 14) | 384 | (i16 & 7168) | (458752 & i18) | (3670016 & i18) | (i18 & 29360128), 16);
                o0VarE = o0VarE;
                if (aVar == null) {
                    o0VarE.C(-1705583486);
                    o0VarE.g0(false);
                    z14 = false;
                    str8 = strQ2;
                } else {
                    o0VarE.C(-1705583485);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = b3.a(t62.b.f162798a);
                    bVar2.getClass();
                    h4.r rVarY = c2.l.y(aVar3, eVar2.f97917b);
                    bVar2.getClass();
                    h4.r rVarC3 = c2.l.C(rVarY, eVar2.f97918c, 0.0f, 0.0f, 0.0f, 14);
                    bVar2.getClass();
                    h4.r rVarQ = x2.q(rVarC3, j92.b.f97901d.f97903b);
                    boolean z17 = (i19 & 1879048192) == 536870912;
                    Object objQ = o0VarE.q();
                    if (z17) {
                        objQ = new eu.a(aVar, 27);
                        o0VarE.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new eu.a(aVar, 27);
                            o0VarE.K(objQ);
                        }
                    }
                    str8 = strQ2;
                    i7.b(dVarA, str8, u1.w.d(rVarQ, false, null, null, (e23.a) objQ, 15), sn.a.y(o0VarE), o0VarE, 0, 0);
                    Unit unit = Unit.INSTANCE;
                    z14 = false;
                    o0VarE.g0(false);
                }
                z15 = true;
                o0VarE.g0(true);
                o0VarE.g0(z14);
            }
            o0VarE.g0(z15);
            str7 = str8;
        } else {
            o0VarE.e();
            str6 = str4;
            str7 = str5;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fo.b(rVar, str, i14, x0Var, str2, str3, x0Var2, str6, str7, aVar, i15);
        }
    }
}
