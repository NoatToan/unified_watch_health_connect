package ku1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import fg0.t;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.w;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:113:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:117:0x0265  */
    /* JADX WARN: Code duplicated, block: B:118:0x0267  */
    /* JADX WARN: Code duplicated, block: B:121:0x026e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0278  */
    /* JADX WARN: Code duplicated, block: B:125:0x027a  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:136:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:139:0x035d  */
    /* JADX WARN: Code duplicated, block: B:146:0x03df  */
    /* JADX WARN: Code duplicated, block: B:148:0x03ee  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z14, final fg0.k kVar, final Double d14, final Double d15, final boolean z15, final t tVar, final DateTime dateTime, final DateTime dateTime2, final ArrayList arrayList, final e23.a aVar, final e23.a aVar2, final e23.a aVar3, p3.m mVar, final int i14) {
        int i15;
        o0 o0Var;
        int i16;
        h5.g.a.f fVar;
        b0 b0Var;
        int i17;
        j92.f fVar2;
        int i18;
        boolean z16;
        Object objQ;
        int i19;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        o0 o0Var2;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1027514698);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(false) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(d14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(d15) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.h(z15) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i15 |= (i14 & 2097152) == 0 ? o0VarE.B(tVar) : o0VarE.r(tVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i15 |= o0VarE.r(dateTime) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i15 |= o0VarE.r(dateTime2) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i15 |= o0VarE.r(arrayList) ? 536870912 : 268435456;
        }
        int i24 = i15;
        int i25 = 48 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024);
        if (o0VarE.n(i24 & 1, ((i24 & 306783379) == 306783378 && (i25 & 1171) == 1170) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            pi0.e eVar = new pi0.e(context);
            r.a aVar4 = r.S;
            r rVarF = x2.f(aVar4, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            r rVarY = c2.l.y(rVarF, eVar2.f97920e);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar5 = h4.d.a.f81536n;
            z zVarA2 = y.a(kVar2, aVar5, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            String strI = null;
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
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                i16 = i25;
            } else {
                i16 = i25;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0Var = b0.f22601a;
                bVar.getClass();
                r rVarC3 = c2.l.C(aVar4, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
                if (z14) {
                    i17 = R.string.lbl_plan_recap;
                } else {
                    i17 = R.string.lbl_coming_up;
                }
                String strQ = gl1.y.Q(o0VarE, i17);
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                i18 = i16;
                mh.c(strQ, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, 0, 0, 131068);
                long jW = ds.e0.w(o0VarE);
                g6.f.a aVar7 = g6.f.f75994b;
                r rVarE = u1.n.e(aVar4, jW, k2.i.a(8));
                if ((i18 & 14) == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objQ = o0VarE.q();
                if (z16) {
                    i19 = 0;
                    objQ = new a(aVar, 0);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        i19 = 0;
                        objQ = new a(aVar, 0);
                        o0VarE.K(objQ);
                    } else {
                        i19 = 0;
                    }
                }
                r rVarD = w.d(rVarE, true, null, null, (e23.a) objQ, 14);
                zVarA = y.a(kVar2, aVar5, o0VarE, i19);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarD, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar3, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                r rVarB = b0Var.b(aVar4, h4.d.a.f81537o);
                bVar.getClass();
                float f14 = eVar2.f97920e;
                bVar.getClass();
                r rVarC4 = c2.l.C(rVarB, 0.0f, f14, 0.0f, eVar2.f97918c, 5);
                String strL = eVar.l(dateTime, dateTime2, pi0.f.SHORT_MONTH_NO_WEEKDAY);
                fVar2.getClass();
                mh.c(strL, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, 0, 0, 131068);
                o0Var2 = o0VarE;
                bVar.getClass();
                float f15 = eVar2.f97920e;
                bVar.getClass();
                float f16 = eVar2.f97920e;
                bVar.getClass();
                hw1.e.a(c2.l.C(aVar4, f15, 0.0f, f16, eVar2.f97920e, 2), arrayList, o0Var2, (i24 >> 24) & 112);
                o0Var2.g0(true);
                if (kVar != null) {
                    o0Var2.C(1644018313);
                    bVar.getClass();
                    c2.l.f(x2.h(aVar4, eVar2.f97918c), o0Var2);
                    if (z14 && d14 != null && d15 != null) {
                        fy1.i.a aVar8 = fy1.i.f73924a;
                        double dDoubleValue = d15.doubleValue();
                        double dDoubleValue2 = d14.doubleValue();
                        aVar8.getClass();
                        strI = fy1.i.a.i(context, dDoubleValue, dDoubleValue2, true, z15, false);
                    }
                    jg0.d.a(x2.f(aVar4, 1.0f), kVar, tVar, z14, strI, false, null, null, false, aVar2, aVar3, null, o0Var2, (fg0.k.X << 3) | 6 | ((i24 >> 3) & 112) | (t.f71346c << 6) | ((i24 >> 12) & 896) | ((i24 << 6) & 7168) | 12582912 | (234881024 & (i24 << 24)) | ((i18 << 21) & 1879048192), (i18 >> 9) & 14, 2144);
                    o0Var2.g0(false);
                } else {
                    o0Var2.C(1645107126);
                    o0Var2.g0(i19);
                }
                o0Var2.g0(true);
                o0Var = o0Var2;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0Var = b0.f22601a;
            bVar.getClass();
            r rVarC5 = c2.l.C(aVar4, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
            if (z14) {
                i17 = R.string.lbl_plan_recap;
            } else {
                i17 = R.string.lbl_coming_up;
            }
            String strQ2 = gl1.y.Q(o0VarE, i17);
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            i18 = i16;
            mh.c(strQ2, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, 0, 0, 131068);
            long jW2 = ds.e0.w(o0VarE);
            g6.f.a aVar9 = g6.f.f75994b;
            r rVarE2 = u1.n.e(aVar4, jW2, k2.i.a(8));
            if ((i18 & 14) == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            objQ = o0VarE.q();
            if (z16) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    i19 = 0;
                    objQ = new a(aVar, 0);
                    o0VarE.K(objQ);
                } else {
                    i19 = 0;
                }
            } else {
                i19 = 0;
                objQ = new a(aVar, 0);
                o0VarE.K(objQ);
            }
            r rVarD2 = w.d(rVarE2, true, null, null, (e23.a) objQ, 14);
            zVarA = y.a(kVar2, aVar5, o0VarE, i19);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarD2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar3, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            r rVarB2 = b0Var.b(aVar4, h4.d.a.f81537o);
            bVar.getClass();
            float f17 = eVar2.f97920e;
            bVar.getClass();
            r rVarC6 = c2.l.C(rVarB2, 0.0f, f17, 0.0f, eVar2.f97918c, 5);
            String strL2 = eVar.l(dateTime, dateTime2, pi0.f.SHORT_MONTH_NO_WEEKDAY);
            fVar2.getClass();
            mh.c(strL2, rVarC6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, 0, 0, 131068);
            o0Var2 = o0VarE;
            bVar.getClass();
            float f18 = eVar2.f97920e;
            bVar.getClass();
            float f19 = eVar2.f97920e;
            bVar.getClass();
            hw1.e.a(c2.l.C(aVar4, f18, 0.0f, f19, eVar2.f97920e, 2), arrayList, o0Var2, (i24 >> 24) & 112);
            o0Var2.g0(true);
            if (kVar != null) {
                o0Var2.C(1644018313);
                bVar.getClass();
                c2.l.f(x2.h(aVar4, eVar2.f97918c), o0Var2);
                if (z14) {
                    fy1.i.a aVar10 = fy1.i.f73924a;
                    double dDoubleValue3 = d15.doubleValue();
                    double dDoubleValue4 = d14.doubleValue();
                    aVar10.getClass();
                    strI = fy1.i.a.i(context, dDoubleValue3, dDoubleValue4, true, z15, false);
                }
                jg0.d.a(x2.f(aVar4, 1.0f), kVar, tVar, z14, strI, false, null, null, false, aVar2, aVar3, null, o0Var2, (fg0.k.X << 3) | 6 | ((i24 >> 3) & 112) | (t.f71346c << 6) | ((i24 >> 12) & 896) | ((i24 << 6) & 7168) | 12582912 | (234881024 & (i24 << 24)) | ((i18 << 21) & 1879048192), (i18 >> 9) & 14, 2144);
                o0Var2.g0(false);
            } else {
                o0Var2.C(1645107126);
                o0Var2.g0(i19);
            }
            o0Var2.g0(true);
            o0Var = o0Var2;
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: ku1.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c.a(z14, kVar, d14, d15, z15, tVar, dateTime, dateTime2, arrayList, aVar, aVar2, aVar3, (p3.m) obj, p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
