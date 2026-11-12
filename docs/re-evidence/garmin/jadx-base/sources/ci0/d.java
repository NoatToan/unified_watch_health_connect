package ci0;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.o;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import gs1.t;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import l72.x0;
import o53.f0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:130:0x0200  */
    /* JADX WARN: Code duplicated, block: B:132:0x021b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0227  */
    /* JADX WARN: Code duplicated, block: B:139:0x0249  */
    /* JADX WARN: Code duplicated, block: B:142:0x026e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0275  */
    /* JADX WARN: Code duplicated, block: B:145:0x0279  */
    /* JADX WARN: Code duplicated, block: B:150:0x0294  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:156:0x0350  */
    /* JADX WARN: Code duplicated, block: B:158:0x0354  */
    public static final void a(DateTime dateTime, sh0.d dVar, boolean z14, boolean z15, tf0.i iVar, l<? super Boolean, Unit> lVar, l<? super o, Unit> lVar2, l<? super Boolean, Unit> lVar3, l<? super Boolean, Unit> lVar4, m mVar, int i14) {
        int i15;
        Double dValueOf;
        zk0.h hVar;
        String str;
        h5.g.a.f fVar;
        b0 b0Var;
        boolean z16;
        Object objQ;
        String str2;
        m.a.C2565a c2565a;
        boolean zR;
        Object objQ2;
        int i16;
        z zVarA;
        Double d14;
        Double d15;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        boolean zR2;
        Object objQ3;
        Double floorsAscended;
        Double floorsDescended;
        Double floorsAscended2;
        t tVar;
        gs1.z userDailySummary;
        iVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        o0 o0VarE = mVar.E(-116872382);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(dateTime) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z15) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= (32768 & i14) == 0 ? o0VarE.B(iVar) : o0VarE.r(iVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(lVar3) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(lVar4) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = n.f135158a;
            Configuration configuration = (Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a);
            xh0.c cVar2 = new xh0.c((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            gs1.l payload = (dVar == null || (tVar = dVar.f159293b) == null || (userDailySummary = tVar.getUserDailySummary()) == null) ? null : userDailySummary.getPayload();
            String strB = (payload == null || (floorsAscended2 = payload.getFloorsAscended()) == null) ? null : xh0.c.b(floorsAscended2.doubleValue());
            String strB2 = (payload == null || (floorsDescended = payload.getFloorsDescended()) == null) ? null : xh0.c.b(floorsDescended.doubleValue());
            Double dValueOf2 = (payload == null || (floorsAscended = payload.getFloorsAscended()) == null) ? null : Double.valueOf((int) floorsAscended.doubleValue());
            if (payload == null || (dValueOf = payload.getUserFloorsAscendedGoal()) == null) {
                dValueOf = (dVar == null || (hVar = dVar.f159294c) == null) ? null : Double.valueOf(hVar.C());
            }
            r.a aVar = r.S;
            r rVarD = x2.d(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            z zVarA2 = y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == 0) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            int i17 = i15;
            if (o0VarE.T) {
                str = strB;
            } else {
                str = strB;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0Var = b0.f22601a;
                if (f0.E(configuration)) {
                    o0VarE.C(1827610954);
                    r rVarF = x2.f(aVar, 1.0f);
                    objQ = o0VarE.q();
                    m.f135153a.getClass();
                    str2 = strB2;
                    c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new ch1.f(2);
                        o0VarE.K(objQ);
                    }
                    r rVarC3 = v.c((l) objQ, rVarF, true);
                    zR = o0VarE.r(cVar2) | o0VarE.B(dValueOf2) | o0VarE.B(dValueOf);
                    objQ2 = o0VarE.q();
                    if (!zR || objQ2 == c2565a) {
                        i16 = 0;
                        objQ2 = new b(cVar2, i16, dValueOf2, dValueOf);
                        o0VarE.K(objQ2);
                    } else {
                        i16 = 0;
                    }
                    r rVarB = v.b(rVarC3, (l) objQ2);
                    zVarA = y.a(kVar, aVar2, o0VarE, i16);
                    d14 = dValueOf2;
                    d15 = dValueOf;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = k.c(rVarB, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA0, o0VarE);
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, o0VarE);
                    g6.f.a aVar4 = g6.f.f75994b;
                    r rVarQ = x2.q(aVar, 166);
                    h4.g.a aVar5 = h4.d.a.f81537o;
                    r rVarB2 = b0Var.b(rVarQ, aVar5);
                    zR2 = o0VarE.r(cVar2);
                    objQ3 = o0VarE.q();
                    if (zR2 || objQ3 == c2565a) {
                        objQ3 = new b41.a(cVar2, 23);
                        o0VarE.K(objQ3);
                    }
                    c02.h.d(rVarB2, d14, d15, (l) objQ3, o0VarE, 0);
                    String strQ = gl1.y.Q(o0VarE, R.string.floors_climbed_lbl);
                    r rVarB3 = b0Var.b(aVar, aVar5);
                    d92.b.f58623a.getClass();
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    r rVarC4 = c2.l.C(rVarB3, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                    d92.b.f58624b.getClass();
                    mh.c(strQ, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
                    z16 = true;
                    o0VarE.g0(true);
                    x0 x0Var = x0.f111346a;
                    bVar2.getClass();
                    x0Var.e(c2.l.y(aVar, eVar2.f97920e), z3.f.c(2004041260, new c40.i(str, str2, 1), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
                    o0VarE.g0(false);
                } else {
                    z16 = true;
                    o0VarE.C(1829148554);
                    o0VarE.g0(false);
                }
                h.a(dateTime, dVar, z14, z15, iVar, lVar, lVar2, lVar3, lVar4, o0VarE, (i17 & 14) | 64 | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (tf0.i.f164439d << 12) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (234881024 & i17));
                o0VarE.g0(z16);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0Var = b0.f22601a;
            if (f0.E(configuration)) {
                o0VarE.C(1827610954);
                r rVarF2 = x2.f(aVar, 1.0f);
                objQ = o0VarE.q();
                m.f135153a.getClass();
                str2 = strB2;
                c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new ch1.f(2);
                    o0VarE.K(objQ);
                }
                r rVarC5 = v.c((l) objQ, rVarF2, true);
                zR = o0VarE.r(cVar2) | o0VarE.B(dValueOf2) | o0VarE.B(dValueOf);
                objQ2 = o0VarE.q();
                if (zR) {
                    i16 = 0;
                    objQ2 = new b(cVar2, i16, dValueOf2, dValueOf);
                    o0VarE.K(objQ2);
                } else {
                    i16 = 0;
                    objQ2 = new b(cVar2, i16, dValueOf2, dValueOf);
                    o0VarE.K(objQ2);
                }
                r rVarB4 = v.b(rVarC5, (l) objQ2);
                zVarA = y.a(kVar, aVar2, o0VarE, i16);
                d14 = dValueOf2;
                d15 = dValueOf;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarB4, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                g6.f.a aVar6 = g6.f.f75994b;
                r rVarQ2 = x2.q(aVar, 166);
                h4.g.a aVar7 = h4.d.a.f81537o;
                r rVarB5 = b0Var.b(rVarQ2, aVar7);
                zR2 = o0VarE.r(cVar2);
                objQ3 = o0VarE.q();
                if (zR2) {
                    objQ3 = new b41.a(cVar2, 23);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new b41.a(cVar2, 23);
                    o0VarE.K(objQ3);
                }
                c02.h.d(rVarB5, d14, d15, (l) objQ3, o0VarE, 0);
                String strQ2 = gl1.y.Q(o0VarE, R.string.floors_climbed_lbl);
                r rVarB6 = b0Var.b(aVar, aVar7);
                d92.b.f58623a.getClass();
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar3 = j92.b.f97899b;
                r rVarC6 = c2.l.C(rVarB6, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                d92.b.f58624b.getClass();
                mh.c(strQ2, rVarC6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
                z16 = true;
                o0VarE.g0(true);
                x0 x0Var2 = x0.f111346a;
                bVar3.getClass();
                x0Var2.e(c2.l.y(aVar, eVar3.f97920e), z3.f.c(2004041260, new c40.i(str, str2, 1), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
                o0VarE.g0(false);
            } else {
                z16 = true;
                o0VarE.C(1829148554);
                o0VarE.g0(false);
            }
            h.a(dateTime, dVar, z14, z15, iVar, lVar, lVar2, lVar3, lVar4, o0VarE, (i17 & 14) | 64 | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (tf0.i.f164439d << 12) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (234881024 & i17));
            o0VarE.g0(z16);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(dateTime, dVar, z14, z15, iVar, lVar, lVar2, lVar3, lVar4, i14, 0);
        }
    }
}
