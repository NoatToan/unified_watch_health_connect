package si1;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import gl1.y;
import h5.e0;
import i3.e5;
import i3.fe;
import i3.mh;
import java.util.Locale;
import l72.d3;
import o4.d0;
import o4.q1;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import rk0.a1;
import s5.i0;
import s5.r0;
import s5.x0;
import s70.a0;
import sg0.q0;
import u1.a2;
import w5.c0;
import w5.f0;
import zd0.u1;

/* JADX INFO: loaded from: classes10.dex */
public final class q {
    public static final void a(e eVar, h4.r rVar, e23.a aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-751366079);
        int i15 = 4;
        int i16 = (o0VarE.k(eVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.B(rVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = eVar == e.LOADING;
            d(y.Q(o0VarE, R.string.device_settings_inreach_finish_activation_title), y.Q(o0VarE, R.string.device_settings_inreach_finish_activation_description), y.Q(o0VarE, R.string.device_settings_inreach_activate_device), rVar, z3.f.c(-2028068132, new rw0.g(z14, i15), o0VarE), !z14, aVar, o0VarE, ((i16 << 12) & 3670016) | ((i16 << 6) & 7168) | 24576, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rx1.u(eVar, rVar, aVar, i14, 13);
        }
    }

    public static final void b(int i14, int i15, e23.a aVar, h4.r rVar, p3.m mVar) {
        int i16;
        e23.a aVar2;
        o0 o0VarE = mVar.E(-139956260);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
        } else {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            if (i17 != 0) {
                rVar = h4.r.S;
            }
            h4.r rVar2 = rVar;
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(o0VarE, R.string.lbl_finish_inReach_setup);
            String strQ2 = y.Q(o0VarE, R.string.msg_get_inreach_old_devices);
            String strQ3 = y.Q(o0VarE, R.string.lbl_get_started);
            c.f159367a.getClass();
            aVar2 = aVar;
            d(strQ, strQ2, strQ3, rVar2, c.f159369c, false, aVar2, o0VarE, ((i16 << 9) & 7168) | 24576 | ((i16 << 15) & 3670016), 32);
            rVar = rVar2;
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dj0.b(rVar, aVar2, i14, i15);
        }
    }

    public static final void c(k kVar, r53.i iVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, p3.m mVar, int i14) {
        kVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        o0 o0VarE = mVar.E(1252912157);
        int i15 = i14 | (o0VarE.r(kVar) ? 4 : 2) | (o0VarE.r(iVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192) | (o0VarE.r(aVar4) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar = (fe) objQ;
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(iVar);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new n(iVar, feVar, null);
                o0VarE.K(objQ2);
            }
            l0.e((e23.p) objQ2, unit, o0VarE);
            boolean zR2 = o0VarE.r(kVar);
            Object objQ3 = o0VarE.q();
            if (zR2 || objQ3 == c2565a) {
                objQ3 = new o(kVar, null);
                o0VarE.K(objQ3);
            }
            l0.e((e23.p) objQ3, kVar, o0VarE);
            z02.d.a(kVar.f159394a, z3.f.c(1256507128, new a0(aVar2, 3), o0VarE), null, null, null, z3.f.c(-143625612, new oy0.b(kVar, feVar, aVar, aVar3, aVar4, aVar2, 22), o0VarE), o0VarE, 196656, 28);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oy0.b(kVar, iVar, aVar, aVar2, aVar3, aVar4, i14, 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:103:0x0209  */
    /* JADX WARN: Code duplicated, block: B:106:0x0239  */
    /* JADX WARN: Code duplicated, block: B:108:0x0240  */
    /* JADX WARN: Code duplicated, block: B:109:0x0244  */
    /* JADX WARN: Code duplicated, block: B:112:0x0251  */
    /* JADX WARN: Code duplicated, block: B:114:0x025f  */
    /* JADX WARN: Code duplicated, block: B:117:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:119:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:121:0x0359  */
    /* JADX WARN: Code duplicated, block: B:123:0x035d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0361  */
    /* JADX WARN: Code duplicated, block: B:127:0x0365  */
    /* JADX WARN: Code duplicated, block: B:130:0x0370  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:77:0x0105  */
    /* JADX WARN: Code duplicated, block: B:79:0x0122  */
    /* JADX WARN: Code duplicated, block: B:82:0x016d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0174  */
    /* JADX WARN: Code duplicated, block: B:85:0x0178  */
    /* JADX WARN: Code duplicated, block: B:88:0x018d  */
    /* JADX WARN: Code duplicated, block: B:91:0x019e  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ee  */
    public static final void d(String str, String str2, String str3, h4.r rVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        boolean z16;
        o0 o0Var;
        boolean z17;
        p2 p2VarI0;
        boolean z18;
        j92.b bVar;
        j92.e eVar;
        h4.r rVarD;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar2;
        h5.g.a.e eVar2;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar2;
        int i17;
        h5.g.a.f fVar;
        u2 u2Var;
        h4.r.a aVar3;
        z0 z0VarD;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        z zVarA;
        int iHashCode3;
        i2 i2VarA2;
        h4.r rVarC3;
        long jC;
        boolean z19;
        Object objQ;
        int i18;
        o0 o0VarE = mVar.E(1281127649);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(str3) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(rVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(pVar) ? 16384 : 8192;
        }
        int i19 = i15 & 32;
        if (i19 == 0) {
            if ((196608 & i14) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 131072 : 65536;
            }
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(aVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i16 |= i18;
            }
            if ((599187 & i16) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i19 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                x1 x1Var = p3.n.f135158a;
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                k2.h hVarA = k2.i.a(eVar.f97918c);
                h4.r rVarF = x2.f(u1.n.e(rVar, d92.b.a(o0VarE).e().c(), hVarA), 1.0f);
                if (z18) {
                    o0VarE.C(-1491927879);
                    h4.r.a aVar4 = h4.r.S;
                    if ((3670016 & i16) == 1048576) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objQ = o0VarE.q();
                    if (z19) {
                        objQ = new q0(aVar, 4);
                        o0VarE.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new q0(aVar, 4);
                            o0VarE.K(objQ);
                        }
                    }
                    rVarD = u1.w.d(aVar4, false, null, null, (e23.a) objQ, 15);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1491926935);
                    o0VarE.g0(false);
                    rVarD = h4.r.S;
                }
                h4.r rVarB = l4.k.b(rVarF.then(rVarD), hVarA);
                bVar.getClass();
                h4.r rVarY = c2.l.y(rVarB, eVar.f97920e);
                c2.j.f22691a.getClass();
                c2.j.C0343j c0343j = c2.j.f22692b;
                h4.d.f81522a.getClass();
                s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarY, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                eVar2 = h5.g.a.f81810g;
                b4.c(eVar2, s2VarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar2 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    i17 = i16;
                } else {
                    i17 = i16;
                    if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    u2Var = u2.f22900a;
                    aVar3 = h4.r.S;
                    bVar.getClass();
                    h4.r rVarC4 = c2.l.C(aVar3, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11);
                    bVar.getClass();
                    h4.r rVarQ = x2.q(rVarC4, j92.b.f97901d.f97906e);
                    z0VarD = c2.q.d(h4.d.a.f81528f, false);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarQ, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    c2.u uVar = c2.u.f22885a;
                    e5.q((i17 >> 12) & 14, pVar, o0VarE, true);
                    h4.r rVarA = u2Var.a(aVar3, 1.0f, true);
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode3 = Long.hashCode(o0VarE.U);
                    i2VarA2 = o0VarE.a0();
                    rVarC3 = h4.k.c(rVarA, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar2, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA2, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC3, o0VarE);
                    b0 b0Var = b0.f22601a;
                    j92.f fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    mh.c(str, null, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97931h), o0VarE, i17 & 14, 0, 131066);
                    fVar2.getClass();
                    x0 x0Var = j92.f.f97932i;
                    long jB = d92.b.a(o0VarE).k().b();
                    bVar.getClass();
                    mh.c(str2, c2.l.C(aVar3, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), jB, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, (i17 >> 3) & 14, 0, 131064);
                    o0Var = o0VarE;
                    fVar2.getClass();
                    x0 x0VarE = d92.c.e(x0Var);
                    if (z18) {
                        o0Var.C(-1798625843);
                        jC = d92.b.a(o0Var).k().a();
                    } else {
                        o0Var.C(-1798624711);
                        jC = d0.c(0.5f, d92.b.a(o0Var).k().a(), 14);
                    }
                    o0Var.g0(false);
                    long j8 = jC;
                    bVar.getClass();
                    mh.c(str3, c2.l.C(aVar3, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), j8, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE, o0Var, (i17 >> 6) & 14, 0, 131064);
                    o0Var.g0(true);
                    o0Var.g0(true);
                    z17 = z18;
                }
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                u2Var = u2.f22900a;
                aVar3 = h4.r.S;
                bVar.getClass();
                h4.r rVarC5 = c2.l.C(aVar3, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11);
                bVar.getClass();
                h4.r rVarQ2 = x2.q(rVarC5, j92.b.f97901d.f97906e);
                z0VarD = c2.q.d(h4.d.a.f81528f, false);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarQ2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                c2.u uVar2 = c2.u.f22885a;
                e5.q((i17 >> 12) & 14, pVar, o0VarE, true);
                h4.r rVarA2 = u2Var.a(aVar3, 1.0f, true);
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = h4.k.c(rVarA2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
                } else {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
                }
                b4.c(fVar, rVarC3, o0VarE);
                b0 b0Var2 = b0.f22601a;
                j92.f fVar3 = d92.b.f58624b;
                fVar3.getClass();
                mh.c(str, null, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97931h), o0VarE, i17 & 14, 0, 131066);
                fVar3.getClass();
                x0 x0Var2 = j92.f.f97932i;
                long jB2 = d92.b.a(o0VarE).k().b();
                bVar.getClass();
                mh.c(str2, c2.l.C(aVar3, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), jB2, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, o0VarE, (i17 >> 3) & 14, 0, 131064);
                o0Var = o0VarE;
                fVar3.getClass();
                x0 x0VarE2 = d92.c.e(x0Var2);
                if (z18) {
                    o0Var.C(-1798625843);
                    jC = d92.b.a(o0Var).k().a();
                } else {
                    o0Var.C(-1798624711);
                    jC = d0.c(0.5f, d92.b.a(o0Var).k().a(), 14);
                }
                o0Var.g0(false);
                long j14 = jC;
                bVar.getClass();
                mh.c(str3, c2.l.C(aVar3, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), j14, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE2, o0Var, (i17 >> 6) & 14, 0, 131064);
                o0Var.g0(true);
                o0Var.g0(true);
                z17 = z18;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z17 = z15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.n(str, str2, str3, rVar, pVar, z17, aVar, i14, i15, 11);
            }
        }
        i16 |= 196608;
        z15 = z14;
        if ((1572864 & i14) == 0) {
            if (o0VarE.r(aVar)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i16 |= i18;
        }
        if ((599187 & i16) != 599186) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i19 != 0) {
                z18 = true;
            } else {
                z18 = z15;
            }
            x1 x1Var2 = p3.n.f135158a;
            d92.b.f58623a.getClass();
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            k2.h hVarA2 = k2.i.a(eVar.f97918c);
            h4.r rVarF2 = x2.f(u1.n.e(rVar, d92.b.a(o0VarE).e().c(), hVarA2), 1.0f);
            if (z18) {
                o0VarE.C(-1491927879);
                h4.r.a aVar5 = h4.r.S;
                if ((3670016 & i16) == 1048576) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objQ = o0VarE.q();
                if (z19) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new q0(aVar, 4);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new q0(aVar, 4);
                    o0VarE.K(objQ);
                }
                rVarD = u1.w.d(aVar5, false, null, null, (e23.a) objQ, 15);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1491926935);
                o0VarE.g0(false);
                rVarD = h4.r.S;
            }
            h4.r rVarB2 = l4.k.b(rVarF2.then(rVarD), hVarA2);
            bVar.getClass();
            h4.r rVarY2 = c2.l.y(rVarB2, eVar.f97920e);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j2 = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2VarA = q2.a(c0343j2, h4.d.a.f81533k, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarY2, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                i17 = i16;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                u2Var = u2.f22900a;
                aVar3 = h4.r.S;
                bVar.getClass();
                h4.r rVarC6 = c2.l.C(aVar3, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11);
                bVar.getClass();
                h4.r rVarQ3 = x2.q(rVarC6, j92.b.f97901d.f97906e);
                z0VarD = c2.q.d(h4.d.a.f81528f, false);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarQ3, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                c2.u uVar3 = c2.u.f22885a;
                e5.q((i17 >> 12) & 14, pVar, o0VarE, true);
                h4.r rVarA3 = u2Var.a(aVar3, 1.0f, true);
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = h4.k.c(rVarA3, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
                } else {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
                }
                b4.c(fVar, rVarC3, o0VarE);
                b0 b0Var3 = b0.f22601a;
                j92.f fVar4 = d92.b.f58624b;
                fVar4.getClass();
                mh.c(str, null, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97931h), o0VarE, i17 & 14, 0, 131066);
                fVar4.getClass();
                x0 x0Var3 = j92.f.f97932i;
                long jB3 = d92.b.a(o0VarE).k().b();
                bVar.getClass();
                mh.c(str2, c2.l.C(aVar3, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), jB3, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var3, o0VarE, (i17 >> 3) & 14, 0, 131064);
                o0Var = o0VarE;
                fVar4.getClass();
                x0 x0VarE3 = d92.c.e(x0Var3);
                if (z18) {
                    o0Var.C(-1798625843);
                    jC = d92.b.a(o0Var).k().a();
                } else {
                    o0Var.C(-1798624711);
                    jC = d0.c(0.5f, d92.b.a(o0Var).k().a(), 14);
                }
                o0Var.g0(false);
                long j15 = jC;
                bVar.getClass();
                mh.c(str3, c2.l.C(aVar3, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), j15, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE3, o0Var, (i17 >> 6) & 14, 0, 131064);
                o0Var.g0(true);
                o0Var.g0(true);
                z17 = z18;
            } else {
                i17 = i16;
            }
            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2Var = u2.f22900a;
            aVar3 = h4.r.S;
            bVar.getClass();
            h4.r rVarC7 = c2.l.C(aVar3, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11);
            bVar.getClass();
            h4.r rVarQ4 = x2.q(rVarC7, j92.b.f97901d.f97906e);
            z0VarD = c2.q.d(h4.d.a.f81528f, false);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarQ4, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            c2.u uVar4 = c2.u.f22885a;
            e5.q((i17 >> 12) & 14, pVar, o0VarE, true);
            h4.r rVarA4 = u2Var.a(aVar3, 1.0f, true);
            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            iHashCode3 = Long.hashCode(o0VarE.U);
            i2VarA2 = o0VarE.a0();
            rVarC3 = h4.k.c(rVarA4, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            } else {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var4 = b0.f22601a;
            j92.f fVar5 = d92.b.f58624b;
            fVar5.getClass();
            mh.c(str, null, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97931h), o0VarE, i17 & 14, 0, 131066);
            fVar5.getClass();
            x0 x0Var4 = j92.f.f97932i;
            long jB4 = d92.b.a(o0VarE).k().b();
            bVar.getClass();
            mh.c(str2, c2.l.C(aVar3, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), jB4, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var4, o0VarE, (i17 >> 3) & 14, 0, 131064);
            o0Var = o0VarE;
            fVar5.getClass();
            x0 x0VarE4 = d92.c.e(x0Var4);
            if (z18) {
                o0Var.C(-1798625843);
                jC = d92.b.a(o0Var).k().a();
            } else {
                o0Var.C(-1798624711);
                jC = d0.c(0.5f, d92.b.a(o0Var).k().a(), 14);
            }
            o0Var.g0(false);
            long j16 = jC;
            bVar.getClass();
            mh.c(str3, c2.l.C(aVar3, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), j16, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE4, o0Var, (i17 >> 6) & 14, 0, 131064);
            o0Var.g0(true);
            o0Var.g0(true);
            z17 = z18;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z17 = z15;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.n(str, str2, str3, rVar, pVar, z17, aVar, i14, i15, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x031a  */
    /* JADX WARN: Code duplicated, block: B:101:0x032b  */
    /* JADX WARN: Code duplicated, block: B:106:0x044d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0452  */
    /* JADX WARN: Code duplicated, block: B:113:0x0499  */
    /* JADX WARN: Code duplicated, block: B:115:0x049d  */
    /* JADX WARN: Code duplicated, block: B:118:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:119:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:122:0x04c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:128:0x057c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0583  */
    /* JADX WARN: Code duplicated, block: B:131:0x0587  */
    /* JADX WARN: Code duplicated, block: B:134:0x0594  */
    /* JADX WARN: Code duplicated, block: B:136:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:142:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:144:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:145:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:148:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:150:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:153:0x0601  */
    /* JADX WARN: Code duplicated, block: B:155:0x0625  */
    /* JADX WARN: Code duplicated, block: B:157:0x0637  */
    /* JADX WARN: Code duplicated, block: B:159:0x063d  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ec  */
    public static final void e(final r rVar, final long j8, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final e eVar, fe feVar, final e23.a aVar, final e23.a aVar2, final e23.a aVar3, p3.m mVar, final int i14) {
        final fe feVar2;
        o0 o0Var;
        h5.g.a.e eVar2;
        h5.g.a.f fVar;
        boolean z19;
        j92.f fVar2;
        x0 x0Var;
        j92.b bVar;
        j92.e eVar3;
        float f14;
        h5.g.a.e eVar4;
        o0 o0Var2;
        String str;
        s5.c.b bVar2;
        j92.b bVar3;
        int iG;
        boolean zR;
        Object objQ;
        p3.m.a.C2565a c2565a;
        o0 o0Var3;
        boolean z24;
        boolean z25;
        boolean zR2;
        Object objQ2;
        float f15;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.g.a.b bVar4;
        z zVarA;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        o0 o0VarE = mVar.E(506973595);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(rVar) ? 4 : 2) | (o0VarE.l(j8) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.h(z15) ? 2048 : 1024) | (o0VarE.h(z16) ? 16384 : 8192) | (o0VarE.h(z17) ? 131072 : 65536) | (o0VarE.h(z18) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.k(eVar == null ? -1 : eVar.ordinal()) ? 8388608 : 4194304) | (o0VarE.r(aVar) ? 536870912 : 268435456);
        int i16 = (o0VarE.r(aVar2) ? 4 : 2) | (o0VarE.r(aVar3) ? 32 : 16);
        if (o0VarE.n(i15 & 1, ((306783379 & i15) == 306783378 && (i16 & 19) == 18) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            Activity activity = (Activity) o0VarE.A(c.n.f22332a);
            Object objQ3 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ3 == c2565a2) {
                objQ3 = (u1) KoinJavaComponent.get$default(u1.class, null, null, 6, null);
                o0VarE.K(objQ3);
            }
            u1 u1Var = (u1) objQ3;
            t tVar = new t();
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a2) {
                objQ4 = new se0.a(8);
                o0VarE.K(objQ4);
            }
            final c.q qVarC = c.w.c(tVar, (e23.l) objQ4, o0VarE, 48);
            v vVar = new v();
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a2) {
                objQ5 = new se0.a(9);
                o0VarE.K(objQ5);
            }
            final c.q qVarC2 = c.w.c(vVar, (e23.l) objQ5, o0VarE, 48);
            g.h hVar = new g.h();
            boolean z26 = (1879048192 & i15) == 536870912;
            Object objQ6 = o0VarE.q();
            if (z26 || objQ6 == c2565a2) {
                objQ6 = new rx1.m(aVar, 4);
                o0VarE.K(objQ6);
            }
            c.q qVarC3 = c.w.c(hVar, (e23.l) objQ6, o0VarE, 0);
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarB = a2.b(x2.f(aVar4, 1.0f), a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar5 = h4.d.a.f81536n;
            z zVarA2 = c2.y.a(kVar, aVar5, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar5 = h5.g.a.f81810g;
            b4.c(eVar5, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar5 = h5.g.a.f81813j;
            if (o0VarE.T) {
                eVar2 = eVar5;
            } else {
                eVar2 = eVar5;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                b0 b0Var = b0.f22601a;
                l72.s sVar = l72.s.f111232a;
                if (z16 || !(eVar == e.LOADING || eVar == e.INACTIVE)) {
                    z19 = false;
                } else {
                    z19 = true;
                }
                sVar.a(z19, z3.f.c(-700549214, new a1(21, eVar, aVar2), o0VarE), o0VarE, 48);
                sVar.a(z17, z3.f.c(-1757852085, new a0(aVar3, 4), o0VarE), o0VarE, 48 | ((i15 >> 15) & 14));
                String upperCase = y.Q(o0VarE, R.string.device_settings_inreach_plan_header).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                d92.b.f58623a.getClass();
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0Var = j92.f.f97932i;
                x0 x0VarF = d92.c.f(x0Var, o0VarE);
                h4.r rVarF = x2.f(aVar4, 1.0f);
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar3 = j92.b.f97899b;
                float f16 = eVar3.f97920e;
                f14 = eVar3.f97920e;
                h4.r rVarC4 = c2.l.C(rVarF, 0.0f, f16, 0.0f, 0.0f, 13);
                bVar.getClass();
                eVar4 = eVar2;
                mh.c(upperCase, c2.l.A(rVarC4, f14, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                String str2 = rVar.f159429a;
                fVar2.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97936m, o0VarE);
                h4.r rVarF2 = x2.f(aVar4, 1.0f);
                bVar.getClass();
                h4.r rVarA = c2.l.A(rVarF2, f14, 0.0f, 2);
                bVar.getClass();
                mh.c(str2, c2.l.C(rVarA, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                String str3 = rVar.f159430b;
                fVar2.getClass();
                x0 x0VarF2 = d92.c.f(x0Var, o0VarE);
                h4.r rVarF3 = x2.f(aVar4, 1.0f);
                bVar.getClass();
                h4.r rVarA2 = c2.l.A(rVarF3, f14, 0.0f, 2);
                bVar.getClass();
                mh.c(str3, c2.l.C(rVarA2, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0VarE, 0, 0, 131068);
                o0Var2 = o0VarE;
                str = rVar.f159432d;
                if (str == null) {
                    o0Var2.C(258021273);
                    o0Var2.g0(false);
                    bVar3 = bVar;
                } else {
                    o0Var2.C(258021274);
                    o0Var2.C(1255251279);
                    bVar3 = bVar;
                    bVar2 = new s5.c.b(0, 1, null);
                    bVar2.b(str);
                    bVar2.b(StringUtils.SPACE);
                    o0Var2.C(1255254458);
                    iG = bVar2.g(new s5.m.b("https://support.garmin.com/sas/grmn/?contentId=eJz14OUvnG1MivsmEzhSi8", new r0(new i0(hb.a.e(o0Var2), 0L, (f0) null, (w5.b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null), null, null, null, 14, null), null, 4, null));
                    try {
                        bVar2.b(y.Q(o0Var2, R.string.common_learn_more));
                        Unit unit = Unit.INSTANCE;
                        bVar2.f(iG);
                        o0Var2.g0(false);
                        s5.c cVarK = bVar2.k();
                        o0Var2.g0(false);
                        fVar2.getClass();
                        x0 x0VarF3 = d92.c.f(x0Var, o0Var2);
                        h4.r rVarF4 = x2.f(aVar4, 1.0f);
                        bVar3.getClass();
                        h4.r rVarA3 = c2.l.A(rVarF4, f14, 0.0f, 2);
                        bVar3.getClass();
                        mh.d(cVarK, c2.l.C(rVarA3, 0.0f, eVar3.f97919d, 0.0f, 0.0f, 13), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarF3, o0Var2, 0, 0, 262140);
                        o0Var2 = o0Var2;
                        o0Var2.g0(false);
                    } catch (Throwable th3) {
                        bVar2.f(iG);
                        throw th3;
                    }
                }
                l72.p2 p2Var = l72.p2.f111205a;
                bVar3.getClass();
                h4.r rVarC5 = c2.l.C(aVar4, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                String strQ = y.Q(o0Var2, R.string.device_settings_inreach_emergency_info);
                z3.e eVarC = z3.f.c(307885178, new rw0.g(z18, 3), o0Var2);
                zR = o0Var2.r(activity) | o0Var2.r(qVarC3) | o0Var2.r(u1Var);
                objQ = o0Var2.q();
                if (zR) {
                    c2565a = c2565a2;
                } else {
                    c2565a = c2565a2;
                    if (objQ == c2565a) {
                    }
                    o0Var3 = o0Var2;
                    p2Var.g(strQ, rVarC5, null, null, eVarC, false, false, (e23.a) objQ, o0Var3, 24576, 236);
                    String strQ2 = y.Q(o0Var3, R.string.device_settings_inreach_plan_manage_subscription);
                    c.f159367a.getClass();
                    z3.e eVar6 = c.f159368b;
                    if ((i15 & 896) == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean zR3 = z24 | o0Var3.r(qVarC);
                    if ((i15 & 112) == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zR2 = z25 | zR3 | o0Var3.r(rVar) | o0Var3.r(qVarC2);
                    objQ2 = o0Var3.q();
                    if (!zR2 || objQ2 == c2565a) {
                        f15 = 1.0f;
                        e23.a aVar7 = new e23.a() { // from class: si1.l
                            @Override // e23.a
                            public final Object invoke() {
                                ht.a aVar8 = ht.a.f85464a;
                                Bundle bundleA = h7.c.a(new o13.p("Screen", "InReachPlanDetails"), new o13.p("Action", "ManagePlan"));
                                aVar8.getClass();
                                ht.a.a(bundleA, "UserAction");
                                if (z14) {
                                    qVarC.a(Long.valueOf(j8), null);
                                } else {
                                    Uri uri = rVar.f159431c;
                                    if (uri != null) {
                                        qVarC2.a(uri, null);
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var3.K(aVar7);
                        objQ2 = aVar7;
                    } else {
                        f15 = 1.0f;
                    }
                    p2Var.g(strQ2, null, null, null, eVar6, false, false, (e23.a) objQ2, o0Var3, 24576, 238);
                    String strQ3 = y.Q(o0Var3, R.string.device_settings_inreach_plan_help_caption);
                    fVar2.getClass();
                    x0 x0VarF4 = d92.c.f(j92.f.f97933j, o0Var3);
                    h4.r rVarF5 = x2.f(aVar4, f15);
                    bVar3.getClass();
                    h4.r rVarC6 = c2.l.C(rVarF5, 0.0f, eVar3.f97917b, 0.0f, 0.0f, 13);
                    bVar3.getClass();
                    mh.c(strQ3, c2.l.A(rVarC6, f14, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF4, o0Var3, 0, 0, 131068);
                    o0Var = o0Var3;
                    bVar3.getClass();
                    s.a(i16 & 112, aVar3, c2.l.y(aVar4, f14), o0Var);
                    o0Var.g0(true);
                    h4.r rVarD = x2.d(aVar4, f15);
                    z0VarD = c2.q.d(h4.d.a.f81531i, false);
                    iHashCode = Long.hashCode(o0Var.U);
                    i2VarA0 = o0Var.a0();
                    rVarC = h4.k.c(rVarD, o0Var);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar6);
                    } else {
                        o0Var.c();
                    }
                    b4.c(r51, z0VarD, o0Var);
                    b4.c(c1623g, i2VarA0, o0Var);
                    if (o0Var.T && p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode))) {
                        bVar4 = bVar5;
                    } else {
                        bVar4 = bVar5;
                        v.h.A(iHashCode, o0Var, iHashCode, bVar4);
                    }
                    b4.c(fVar, rVarC, o0Var);
                    c2.u uVar = c2.u.f22885a;
                    zVarA = c2.y.a(kVar, aVar5, o0Var, 0);
                    iHashCode2 = Long.hashCode(o0Var.U);
                    i2VarA1 = o0Var.a0();
                    rVarC2 = h4.k.c(aVar4, o0Var);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(r47);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar4, zVarA, o0Var);
                    b4.c(c1623g, i2VarA1, o0Var);
                    if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0Var, iHashCode2, bVar4);
                    }
                    b4.c(fVar, rVarC2, o0Var);
                    feVar2 = feVar;
                    d3.b(feVar2, null, o0Var, 6, 2);
                    if (z15) {
                        o0Var.C(1888193955);
                        o0Var.g0(false);
                    } else {
                        j92.b bVar6 = bVar3;
                        h4.r rVarG = ds.e0.g(o0Var, 1887917187, aVar4, f15, bVar6);
                        float f17 = eVar3.f97920e;
                        bVar6.getClass();
                        float f18 = eVar3.f97920e;
                        bVar6.getClass();
                        f.a(c2.l.C(rVarG, f17, 0.0f, f18, eVar3.f97920e, 2), o0Var, 0);
                        o0Var.g0(false);
                    }
                    o0Var.g0(true);
                    o0Var.g0(true);
                }
                objQ = new ok0.d((Object) activity, qVarC3, (Object) u1Var, (Object) b0Var, 22);
                o0Var2.K(objQ);
                o0Var3 = o0Var2;
                p2Var.g(strQ, rVarC5, null, null, eVarC, false, false, (e23.a) objQ, o0Var3, 24576, 236);
                String strQ4 = y.Q(o0Var3, R.string.device_settings_inreach_plan_manage_subscription);
                c.f159367a.getClass();
                z3.e eVar7 = c.f159368b;
                if ((i15 & 896) == 256) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean zR4 = z24 | o0Var3.r(qVarC);
                if ((i15 & 112) == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zR2 = z25 | zR4 | o0Var3.r(rVar) | o0Var3.r(qVarC2);
                objQ2 = o0Var3.q();
                if (zR2) {
                    f15 = 1.0f;
                    e23.a aVar8 = new e23.a() { // from class: si1.l
                        @Override // e23.a
                        public final Object invoke() {
                            ht.a aVar9 = ht.a.f85464a;
                            Bundle bundleA = h7.c.a(new o13.p("Screen", "InReachPlanDetails"), new o13.p("Action", "ManagePlan"));
                            aVar9.getClass();
                            ht.a.a(bundleA, "UserAction");
                            if (z14) {
                                qVarC.a(Long.valueOf(j8), null);
                            } else {
                                Uri uri = rVar.f159431c;
                                if (uri != null) {
                                    qVarC2.a(uri, null);
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var3.K(aVar8);
                    objQ2 = aVar8;
                } else {
                    f15 = 1.0f;
                    e23.a aVar9 = new e23.a() { // from class: si1.l
                        @Override // e23.a
                        public final Object invoke() {
                            ht.a aVar10 = ht.a.f85464a;
                            Bundle bundleA = h7.c.a(new o13.p("Screen", "InReachPlanDetails"), new o13.p("Action", "ManagePlan"));
                            aVar10.getClass();
                            ht.a.a(bundleA, "UserAction");
                            if (z14) {
                                qVarC.a(Long.valueOf(j8), null);
                            } else {
                                Uri uri = rVar.f159431c;
                                if (uri != null) {
                                    qVarC2.a(uri, null);
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var3.K(aVar9);
                    objQ2 = aVar9;
                }
                p2Var.g(strQ4, null, null, null, eVar7, false, false, (e23.a) objQ2, o0Var3, 24576, 238);
                String strQ5 = y.Q(o0Var3, R.string.device_settings_inreach_plan_help_caption);
                fVar2.getClass();
                x0 x0VarF5 = d92.c.f(j92.f.f97933j, o0Var3);
                h4.r rVarF6 = x2.f(aVar4, f15);
                bVar3.getClass();
                h4.r rVarC7 = c2.l.C(rVarF6, 0.0f, eVar3.f97917b, 0.0f, 0.0f, 13);
                bVar3.getClass();
                mh.c(strQ5, c2.l.A(rVarC7, f14, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF5, o0Var3, 0, 0, 131068);
                o0Var = o0Var3;
                bVar3.getClass();
                s.a(i16 & 112, aVar3, c2.l.y(aVar4, f14), o0Var);
                o0Var.g0(true);
                h4.r rVarD2 = x2.d(aVar4, f15);
                z0VarD = c2.q.d(h4.d.a.f81531i, false);
                iHashCode = Long.hashCode(o0Var.U);
                i2VarA0 = o0Var.a0();
                rVarC = h4.k.c(rVarD2, o0Var);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar6);
                } else {
                    o0Var.c();
                }
                b4.c(r51, z0VarD, o0Var);
                b4.c(c1623g, i2VarA0, o0Var);
                if (o0Var.T) {
                    bVar4 = bVar5;
                    v.h.A(iHashCode, o0Var, iHashCode, bVar4);
                } else {
                    bVar4 = bVar5;
                    v.h.A(iHashCode, o0Var, iHashCode, bVar4);
                }
                b4.c(fVar, rVarC, o0Var);
                c2.u uVar2 = c2.u.f22885a;
                zVarA = c2.y.a(kVar, aVar5, o0Var, 0);
                iHashCode2 = Long.hashCode(o0Var.U);
                i2VarA1 = o0Var.a0();
                rVarC2 = h4.k.c(aVar4, o0Var);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(r47);
                } else {
                    o0Var.c();
                }
                b4.c(eVar4, zVarA, o0Var);
                b4.c(c1623g, i2VarA1, o0Var);
                if (o0Var.T) {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar4);
                } else {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar4);
                }
                b4.c(fVar, rVarC2, o0Var);
                feVar2 = feVar;
                d3.b(feVar2, null, o0Var, 6, 2);
                if (z15) {
                    j92.b bVar7 = bVar3;
                    h4.r rVarG2 = ds.e0.g(o0Var, 1887917187, aVar4, f15, bVar7);
                    float f19 = eVar3.f97920e;
                    bVar7.getClass();
                    float f110 = eVar3.f97920e;
                    bVar7.getClass();
                    f.a(c2.l.C(rVarG2, f19, 0.0f, f110, eVar3.f97920e, 2), o0Var, 0);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1888193955);
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                o0Var.g0(true);
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar5);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var2 = b0.f22601a;
            l72.s sVar2 = l72.s.f111232a;
            if (z16) {
                z19 = false;
            } else {
                z19 = false;
            }
            sVar2.a(z19, z3.f.c(-700549214, new a1(21, eVar, aVar2), o0VarE), o0VarE, 48);
            sVar2.a(z17, z3.f.c(-1757852085, new a0(aVar3, 4), o0VarE), o0VarE, 48 | ((i15 >> 15) & 14));
            String upperCase2 = y.Q(o0VarE, R.string.device_settings_inreach_plan_header).toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            d92.b.f58623a.getClass();
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0Var = j92.f.f97932i;
            x0 x0VarF6 = d92.c.f(x0Var, o0VarE);
            h4.r rVarF7 = x2.f(aVar4, 1.0f);
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar3 = j92.b.f97899b;
            float f111 = eVar3.f97920e;
            f14 = eVar3.f97920e;
            h4.r rVarC8 = c2.l.C(rVarF7, 0.0f, f111, 0.0f, 0.0f, 13);
            bVar.getClass();
            eVar4 = eVar2;
            mh.c(upperCase2, c2.l.A(rVarC8, f14, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF6, o0VarE, 0, 0, 131068);
            String str4 = rVar.f159429a;
            fVar2.getClass();
            x0 x0VarB2 = d92.c.b(j92.f.f97936m, o0VarE);
            h4.r rVarF8 = x2.f(aVar4, 1.0f);
            bVar.getClass();
            h4.r rVarA4 = c2.l.A(rVarF8, f14, 0.0f, 2);
            bVar.getClass();
            mh.c(str4, c2.l.C(rVarA4, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 131068);
            String str5 = rVar.f159430b;
            fVar2.getClass();
            x0 x0VarF7 = d92.c.f(x0Var, o0VarE);
            h4.r rVarF9 = x2.f(aVar4, 1.0f);
            bVar.getClass();
            h4.r rVarA5 = c2.l.A(rVarF9, f14, 0.0f, 2);
            bVar.getClass();
            mh.c(str5, c2.l.C(rVarA5, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF7, o0VarE, 0, 0, 131068);
            o0Var2 = o0VarE;
            str = rVar.f159432d;
            if (str == null) {
                o0Var2.C(258021273);
                o0Var2.g0(false);
                bVar3 = bVar;
            } else {
                o0Var2.C(258021274);
                o0Var2.C(1255251279);
                bVar3 = bVar;
                bVar2 = new s5.c.b(0, 1, null);
                bVar2.b(str);
                bVar2.b(StringUtils.SPACE);
                o0Var2.C(1255254458);
                iG = bVar2.g(new s5.m.b("https://support.garmin.com/sas/grmn/?contentId=eJz14OUvnG1MivsmEzhSi8", new r0(new i0(hb.a.e(o0Var2), 0L, (f0) null, (w5.b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null), null, null, null, 14, null), null, 4, null));
                bVar2.b(y.Q(o0Var2, R.string.common_learn_more));
                Unit unit2 = Unit.INSTANCE;
                bVar2.f(iG);
                o0Var2.g0(false);
                s5.c cVarK2 = bVar2.k();
                o0Var2.g0(false);
                fVar2.getClass();
                x0 x0VarF8 = d92.c.f(x0Var, o0Var2);
                h4.r rVarF10 = x2.f(aVar4, 1.0f);
                bVar3.getClass();
                h4.r rVarA6 = c2.l.A(rVarF10, f14, 0.0f, 2);
                bVar3.getClass();
                mh.d(cVarK2, c2.l.C(rVarA6, 0.0f, eVar3.f97919d, 0.0f, 0.0f, 13), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarF8, o0Var2, 0, 0, 262140);
                o0Var2 = o0Var2;
                o0Var2.g0(false);
            }
            l72.p2 p2Var2 = l72.p2.f111205a;
            bVar3.getClass();
            h4.r rVarC9 = c2.l.C(aVar4, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
            String strQ6 = y.Q(o0Var2, R.string.device_settings_inreach_emergency_info);
            z3.e eVarC2 = z3.f.c(307885178, new rw0.g(z18, 3), o0Var2);
            zR = o0Var2.r(activity) | o0Var2.r(qVarC3) | o0Var2.r(u1Var);
            objQ = o0Var2.q();
            if (zR) {
                c2565a = c2565a2;
                if (objQ == c2565a) {
                }
                o0Var3 = o0Var2;
                p2Var2.g(strQ6, rVarC9, null, null, eVarC2, false, false, (e23.a) objQ, o0Var3, 24576, 236);
                String strQ7 = y.Q(o0Var3, R.string.device_settings_inreach_plan_manage_subscription);
                c.f159367a.getClass();
                z3.e eVar8 = c.f159368b;
                if ((i15 & 896) == 256) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean zR5 = z24 | o0Var3.r(qVarC);
                if ((i15 & 112) == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zR2 = z25 | zR5 | o0Var3.r(rVar) | o0Var3.r(qVarC2);
                objQ2 = o0Var3.q();
                if (zR2) {
                    f15 = 1.0f;
                    e23.a aVar10 = new e23.a() { // from class: si1.l
                        @Override // e23.a
                        public final Object invoke() {
                            ht.a aVar11 = ht.a.f85464a;
                            Bundle bundleA = h7.c.a(new o13.p("Screen", "InReachPlanDetails"), new o13.p("Action", "ManagePlan"));
                            aVar11.getClass();
                            ht.a.a(bundleA, "UserAction");
                            if (z14) {
                                qVarC.a(Long.valueOf(j8), null);
                            } else {
                                Uri uri = rVar.f159431c;
                                if (uri != null) {
                                    qVarC2.a(uri, null);
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var3.K(aVar10);
                    objQ2 = aVar10;
                } else {
                    f15 = 1.0f;
                    e23.a aVar11 = new e23.a() { // from class: si1.l
                        @Override // e23.a
                        public final Object invoke() {
                            ht.a aVar12 = ht.a.f85464a;
                            Bundle bundleA = h7.c.a(new o13.p("Screen", "InReachPlanDetails"), new o13.p("Action", "ManagePlan"));
                            aVar12.getClass();
                            ht.a.a(bundleA, "UserAction");
                            if (z14) {
                                qVarC.a(Long.valueOf(j8), null);
                            } else {
                                Uri uri = rVar.f159431c;
                                if (uri != null) {
                                    qVarC2.a(uri, null);
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var3.K(aVar11);
                    objQ2 = aVar11;
                }
                p2Var2.g(strQ7, null, null, null, eVar8, false, false, (e23.a) objQ2, o0Var3, 24576, 238);
                String strQ8 = y.Q(o0Var3, R.string.device_settings_inreach_plan_help_caption);
                fVar2.getClass();
                x0 x0VarF9 = d92.c.f(j92.f.f97933j, o0Var3);
                h4.r rVarF11 = x2.f(aVar4, f15);
                bVar3.getClass();
                h4.r rVarC10 = c2.l.C(rVarF11, 0.0f, eVar3.f97917b, 0.0f, 0.0f, 13);
                bVar3.getClass();
                mh.c(strQ8, c2.l.A(rVarC10, f14, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF9, o0Var3, 0, 0, 131068);
                o0Var = o0Var3;
                bVar3.getClass();
                s.a(i16 & 112, aVar3, c2.l.y(aVar4, f14), o0Var);
                o0Var.g0(true);
                h4.r rVarD3 = x2.d(aVar4, f15);
                z0VarD = c2.q.d(h4.d.a.f81531i, false);
                iHashCode = Long.hashCode(o0Var.U);
                i2VarA0 = o0Var.a0();
                rVarC = h4.k.c(rVarD3, o0Var);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar6);
                } else {
                    o0Var.c();
                }
                b4.c(r51, z0VarD, o0Var);
                b4.c(c1623g, i2VarA0, o0Var);
                if (o0Var.T) {
                    bVar4 = bVar5;
                    v.h.A(iHashCode, o0Var, iHashCode, bVar4);
                } else {
                    bVar4 = bVar5;
                    v.h.A(iHashCode, o0Var, iHashCode, bVar4);
                }
                b4.c(fVar, rVarC, o0Var);
                c2.u uVar3 = c2.u.f22885a;
                zVarA = c2.y.a(kVar, aVar5, o0Var, 0);
                iHashCode2 = Long.hashCode(o0Var.U);
                i2VarA1 = o0Var.a0();
                rVarC2 = h4.k.c(aVar4, o0Var);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(r47);
                } else {
                    o0Var.c();
                }
                b4.c(eVar4, zVarA, o0Var);
                b4.c(c1623g, i2VarA1, o0Var);
                if (o0Var.T) {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar4);
                } else {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar4);
                }
                b4.c(fVar, rVarC2, o0Var);
                feVar2 = feVar;
                d3.b(feVar2, null, o0Var, 6, 2);
                if (z15) {
                    j92.b bVar8 = bVar3;
                    h4.r rVarG3 = ds.e0.g(o0Var, 1887917187, aVar4, f15, bVar8);
                    float f112 = eVar3.f97920e;
                    bVar8.getClass();
                    float f113 = eVar3.f97920e;
                    bVar8.getClass();
                    f.a(c2.l.C(rVarG3, f112, 0.0f, f113, eVar3.f97920e, 2), o0Var, 0);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1888193955);
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                o0Var.g0(true);
            } else {
                c2565a = c2565a2;
            }
            objQ = new ok0.d((Object) activity, qVarC3, (Object) u1Var, (Object) b0Var2, 22);
            o0Var2.K(objQ);
            o0Var3 = o0Var2;
            p2Var2.g(strQ6, rVarC9, null, null, eVarC2, false, false, (e23.a) objQ, o0Var3, 24576, 236);
            String strQ9 = y.Q(o0Var3, R.string.device_settings_inreach_plan_manage_subscription);
            c.f159367a.getClass();
            z3.e eVar9 = c.f159368b;
            if ((i15 & 896) == 256) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean zR6 = z24 | o0Var3.r(qVarC);
            if ((i15 & 112) == 32) {
                z25 = true;
            } else {
                z25 = false;
            }
            zR2 = z25 | zR6 | o0Var3.r(rVar) | o0Var3.r(qVarC2);
            objQ2 = o0Var3.q();
            if (zR2) {
                f15 = 1.0f;
                e23.a aVar12 = new e23.a() { // from class: si1.l
                    @Override // e23.a
                    public final Object invoke() {
                        ht.a aVar13 = ht.a.f85464a;
                        Bundle bundleA = h7.c.a(new o13.p("Screen", "InReachPlanDetails"), new o13.p("Action", "ManagePlan"));
                        aVar13.getClass();
                        ht.a.a(bundleA, "UserAction");
                        if (z14) {
                            qVarC.a(Long.valueOf(j8), null);
                        } else {
                            Uri uri = rVar.f159431c;
                            if (uri != null) {
                                qVarC2.a(uri, null);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0Var3.K(aVar12);
                objQ2 = aVar12;
            } else {
                f15 = 1.0f;
                e23.a aVar13 = new e23.a() { // from class: si1.l
                    @Override // e23.a
                    public final Object invoke() {
                        ht.a aVar14 = ht.a.f85464a;
                        Bundle bundleA = h7.c.a(new o13.p("Screen", "InReachPlanDetails"), new o13.p("Action", "ManagePlan"));
                        aVar14.getClass();
                        ht.a.a(bundleA, "UserAction");
                        if (z14) {
                            qVarC.a(Long.valueOf(j8), null);
                        } else {
                            Uri uri = rVar.f159431c;
                            if (uri != null) {
                                qVarC2.a(uri, null);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0Var3.K(aVar13);
                objQ2 = aVar13;
            }
            p2Var2.g(strQ9, null, null, null, eVar9, false, false, (e23.a) objQ2, o0Var3, 24576, 238);
            String strQ10 = y.Q(o0Var3, R.string.device_settings_inreach_plan_help_caption);
            fVar2.getClass();
            x0 x0VarF10 = d92.c.f(j92.f.f97933j, o0Var3);
            h4.r rVarF12 = x2.f(aVar4, f15);
            bVar3.getClass();
            h4.r rVarC11 = c2.l.C(rVarF12, 0.0f, eVar3.f97917b, 0.0f, 0.0f, 13);
            bVar3.getClass();
            mh.c(strQ10, c2.l.A(rVarC11, f14, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF10, o0Var3, 0, 0, 131068);
            o0Var = o0Var3;
            bVar3.getClass();
            s.a(i16 & 112, aVar3, c2.l.y(aVar4, f14), o0Var);
            o0Var.g0(true);
            h4.r rVarD4 = x2.d(aVar4, f15);
            z0VarD = c2.q.d(h4.d.a.f81531i, false);
            iHashCode = Long.hashCode(o0Var.U);
            i2VarA0 = o0Var.a0();
            rVarC = h4.k.c(rVarD4, o0Var);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar6);
            } else {
                o0Var.c();
            }
            b4.c(r51, z0VarD, o0Var);
            b4.c(c1623g, i2VarA0, o0Var);
            if (o0Var.T) {
                bVar4 = bVar5;
                v.h.A(iHashCode, o0Var, iHashCode, bVar4);
            } else {
                bVar4 = bVar5;
                v.h.A(iHashCode, o0Var, iHashCode, bVar4);
            }
            b4.c(fVar, rVarC, o0Var);
            c2.u uVar4 = c2.u.f22885a;
            zVarA = c2.y.a(kVar, aVar5, o0Var, 0);
            iHashCode2 = Long.hashCode(o0Var.U);
            i2VarA1 = o0Var.a0();
            rVarC2 = h4.k.c(aVar4, o0Var);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(r47);
            } else {
                o0Var.c();
            }
            b4.c(eVar4, zVarA, o0Var);
            b4.c(c1623g, i2VarA1, o0Var);
            if (o0Var.T) {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar4);
            } else {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar4);
            }
            b4.c(fVar, rVarC2, o0Var);
            feVar2 = feVar;
            d3.b(feVar2, null, o0Var, 6, 2);
            if (z15) {
                j92.b bVar9 = bVar3;
                h4.r rVarG4 = ds.e0.g(o0Var, 1887917187, aVar4, f15, bVar9);
                float f114 = eVar3.f97920e;
                bVar9.getClass();
                float f115 = eVar3.f97920e;
                bVar9.getClass();
                f.a(c2.l.C(rVarG4, f114, 0.0f, f115, eVar3.f97920e, 2), o0Var, 0);
                o0Var.g0(false);
            } else {
                o0Var.C(1888193955);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            feVar2 = feVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(j8, z14, z15, z16, z17, z18, eVar, feVar2, aVar, aVar2, aVar3, i14) { // from class: si1.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f159411b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f159412c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f159413d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f159414e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f159415f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f159416g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ e f159417h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ fe f159418i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ e23.a f159419j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ e23.a f159420k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ e23.a f159421l;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(100663297);
                    q.e(this.f159410a, this.f159411b, this.f159412c, this.f159413d, this.f159414e, this.f159415f, this.f159416g, this.f159417h, this.f159418i, this.f159419j, this.f159420k, this.f159421l, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
