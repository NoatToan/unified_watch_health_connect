package k71;

import c2.b0;
import c2.j;
import c2.t0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import g6.f;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.mh;
import j21.p;
import kotlin.t1;
import m92.h0;
import m92.u;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import p5.v;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f103280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f103281b;

    static {
        f.a aVar = f.f75994b;
        f103280a = 16;
        f103281b = 24;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:50:0x0101  */
    /* JADX WARN: Code duplicated, block: B:52:0x010f  */
    /* JADX WARN: Code duplicated, block: B:55:0x011e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0181  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:74:0x024a  */
    /* JADX WARN: Code duplicated, block: B:76:0x024e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0257  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static final void a(i53.c<h0.e.c> cVar, String str, String str2, m mVar, int i14, int i15) {
        String str3;
        int i16;
        boolean z14;
        p2 p2VarI0;
        String str4;
        String strP;
        String strP2;
        r.a aVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar2;
        g.a.b bVar;
        boolean z15;
        r.a aVar3;
        String str5;
        boolean zB;
        Object objQ;
        String str6 = str;
        o0 o0VarE = mVar.E(1783050538);
        int i17 = i14 | (o0VarE.B(cVar) ? 4 : 2);
        if ((i14 & 48) == 0) {
            i17 |= o0VarE.B(str6) ? 32 : 16;
        }
        if ((i15 & 4) == 0) {
            str3 = str2;
            int i18 = o0VarE.B(str3) ? 256 : 128;
            i16 = i17 | i18;
            if ((i16 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if ((i15 & 4) != 0) {
                        str4 = str6;
                    }
                    o0VarE.h0();
                    x1 x1Var = n.f135158a;
                    if (str4 == null) {
                        o0VarE.C(-1296638979);
                        o0VarE.g0(false);
                        strP = null;
                    } else {
                        o0VarE.C(-1296638978);
                        strP = y.P(R.string.lbl_common_since_date, new Object[]{str4}, o0VarE);
                        o0VarE.g0(false);
                    }
                    if (strP == null) {
                        strP = "";
                    }
                    strP2 = oi0.c.P(x.k(strP, y.P(R.string.msg_view_last_4_week_feature_trend, new Object[]{y.Q(o0VarE, R.string.lbl_training_status)}, o0VarE)));
                    aVar = r.S;
                    r rVarD = x2.d(aVar, 1.0f);
                    j.f22691a.getClass();
                    j.b bVar2 = j.f22695e;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(bVar2, h4.d.a.f81536n, o0VarE, 6);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = k.c(rVarD, o0VarE);
                    g.V.getClass();
                    aVar2 = g.a.f81805b;
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
                    b4.c(g.a.f81810g, zVarA, o0VarE);
                    b4.c(g.a.f81809f, i2VarA0, o0VarE);
                    bVar = g.a.f81813j;
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(g.a.f81807d, rVarC, o0VarE);
                    b0 b0Var = b0.f22601a;
                    if (cVar != null || cVar.isEmpty()) {
                        o0VarE.C(-401350585);
                        String strQ = y.Q(o0VarE, R.string.common_no_data);
                        r rVarF = x2.f(aVar, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        z15 = false;
                        aVar3 = aVar;
                        str5 = strP2;
                        mh.c(strQ, rVarF, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 48, 0, 131068);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-401841346);
                        r rVarF2 = x2.f(aVar, 1.0f);
                        y3 y3Var = t1.f91490h;
                        r rVarH = x2.h(rVarF2, ((g6.c) o0VarE.A(y3Var)).getF69051c() > 1.5f ? f103281b : f103280a);
                        float f14 = yz1.y.f200480a;
                        u.c(rVarH, u.h(w02.b0.g(((g6.c) o0VarE.A(y3Var)).getF69051c() > 1.5f ? yz1.y.f200481b : yz1.y.f200480a, o0VarE), cVar), yz1.y.l(o0VarE), y.Q(o0VarE, R.string.common_no_data), o0VarE, 0);
                        o0VarE.g0(false);
                        z15 = false;
                        str5 = strP2;
                        aVar3 = aVar;
                    }
                    zB = o0VarE.B(str5);
                    objQ = o0VarE.q();
                    if (zB) {
                        objQ = new jl0.e(str5, 8);
                        o0VarE.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new jl0.e(str5, 8);
                            o0VarE.K(objQ);
                        }
                    }
                    r rVarF3 = x2.f(v.c((l) objQ, aVar3, z15), 1.0f);
                    d92.b.f58623a.getClass();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f15 = eVar.f97918c;
                    bVar3.getClass();
                    str6 = str;
                    t0.a(c2.l.C(rVarF3, 0.0f, f15, 0.0f, eVar.f97920e, 5), j.f22698h, null, null, 0, 0, z3.f.c(-618407185, new p(str6, 1), o0VarE), o0VarE, 1572912, 60);
                    o0VarE.g0(true);
                    str3 = str4;
                } else {
                    o0VarE.e();
                }
                str4 = str3;
                o0VarE.h0();
                x1 x1Var2 = n.f135158a;
                if (str4 == null) {
                    o0VarE.C(-1296638979);
                    o0VarE.g0(false);
                    strP = null;
                } else {
                    o0VarE.C(-1296638978);
                    strP = y.P(R.string.lbl_common_since_date, new Object[]{str4}, o0VarE);
                    o0VarE.g0(false);
                }
                if (strP == null) {
                    strP = "";
                }
                strP2 = oi0.c.P(x.k(strP, y.P(R.string.msg_view_last_4_week_feature_trend, new Object[]{y.Q(o0VarE, R.string.lbl_training_status)}, o0VarE)));
                aVar = r.S;
                r rVarD2 = x2.d(aVar, 1.0f);
                j.f22691a.getClass();
                j.b bVar4 = j.f22695e;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(bVar4, h4.d.a.f81536n, o0VarE, 6);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarD2, o0VarE);
                g.V.getClass();
                aVar2 = g.a.f81805b;
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
                if (cVar != null) {
                    o0VarE.C(-401350585);
                    String strQ2 = y.Q(o0VarE, R.string.common_no_data);
                    r rVarF4 = x2.f(aVar, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    z15 = false;
                    aVar3 = aVar;
                    str5 = strP2;
                    mh.c(strQ2, rVarF4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 48, 0, 131068);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-401350585);
                    String strQ3 = y.Q(o0VarE, R.string.common_no_data);
                    r rVarF5 = x2.f(aVar, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    z15 = false;
                    aVar3 = aVar;
                    str5 = strP2;
                    mh.c(strQ3, rVarF5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 48, 0, 131068);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                }
                zB = o0VarE.B(str5);
                objQ = o0VarE.q();
                if (zB) {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new jl0.e(str5, 8);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new jl0.e(str5, 8);
                    o0VarE.K(objQ);
                }
                r rVarF6 = x2.f(v.c((l) objQ, aVar3, z15), 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar5 = d92.b.f58625c;
                bVar5.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f16 = eVar2.f97918c;
                bVar5.getClass();
                str6 = str;
                t0.a(c2.l.C(rVarF6, 0.0f, f16, 0.0f, eVar2.f97920e, 5), j.f22698h, null, null, 0, 0, z3.f.c(-618407185, new p(str6, 1), o0VarE), o0VarE, 1572912, 60);
                o0VarE.g0(true);
                str3 = str4;
            } else {
                o0VarE.e();
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new an1.d((Object) cVar, (Object) str6, (Object) str3, i14, i15, 14);
            }
        }
        str3 = str2;
        i16 = i17 | i18;
        if ((i16 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if ((i15 & 4) != 0) {
                    str4 = str6;
                } else {
                    str4 = str3;
                }
            } else if ((i15 & 4) != 0) {
                str4 = str6;
            } else {
                str4 = str3;
            }
            o0VarE.h0();
            x1 x1Var3 = n.f135158a;
            if (str4 == null) {
                o0VarE.C(-1296638979);
                o0VarE.g0(false);
                strP = null;
            } else {
                o0VarE.C(-1296638978);
                strP = y.P(R.string.lbl_common_since_date, new Object[]{str4}, o0VarE);
                o0VarE.g0(false);
            }
            if (strP == null) {
                strP = "";
            }
            strP2 = oi0.c.P(x.k(strP, y.P(R.string.msg_view_last_4_week_feature_trend, new Object[]{y.Q(o0VarE, R.string.lbl_training_status)}, o0VarE)));
            aVar = r.S;
            r rVarD3 = x2.d(aVar, 1.0f);
            j.f22691a.getClass();
            j.b bVar6 = j.f22695e;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(bVar6, h4.d.a.f81536n, o0VarE, 6);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarD3, o0VarE);
            g.V.getClass();
            aVar2 = g.a.f81805b;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            bVar = g.a.f81813j;
            if (o0VarE.T) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var3 = b0.f22601a;
            if (cVar != null) {
                o0VarE.C(-401350585);
                String strQ4 = y.Q(o0VarE, R.string.common_no_data);
                r rVarF7 = x2.f(aVar, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                z15 = false;
                aVar3 = aVar;
                str5 = strP2;
                mh.c(strQ4, rVarF7, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 48, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-401350585);
                String strQ5 = y.Q(o0VarE, R.string.common_no_data);
                r rVarF8 = x2.f(aVar, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                z15 = false;
                aVar3 = aVar;
                str5 = strP2;
                mh.c(strQ5, rVarF8, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 48, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            zB = o0VarE.B(str5);
            objQ = o0VarE.q();
            if (zB) {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new jl0.e(str5, 8);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new jl0.e(str5, 8);
                o0VarE.K(objQ);
            }
            r rVarF9 = x2.f(v.c((l) objQ, aVar3, z15), 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar7 = d92.b.f58625c;
            bVar7.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f17 = eVar3.f97918c;
            bVar7.getClass();
            str6 = str;
            t0.a(c2.l.C(rVarF9, 0.0f, f17, 0.0f, eVar3.f97920e, 5), j.f22698h, null, null, 0, 0, z3.f.c(-618407185, new p(str6, 1), o0VarE), o0VarE, 1572912, 60);
            o0VarE.g0(true);
            str3 = str4;
        } else {
            o0VarE.e();
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d((Object) cVar, (Object) str6, (Object) str3, i14, i15, 14);
        }
    }
}
