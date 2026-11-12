package go;

import b82.t0;
import bt1.o;
import c2.b0;
import c2.j;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import d53.t;
import e23.l;
import e23.p;
import e23.q;
import g02.h0;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.mh;
import j92.f;
import java.util.Arrays;
import k2.i;
import m4.g0;
import o4.d0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.w;
import v.h;
import x5.v;

/* JADX INFO: loaded from: classes7.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, Double d14, Double d15, String str, String str2, jo.a aVar, jo.a aVar2, q qVar, p pVar, m mVar, int i14) {
        int i15;
        jo.a aVar3;
        final q qVar2;
        Object dVar;
        p1 p1Var;
        p1 p1Var2;
        Double d16;
        Double d17;
        Object obj;
        r.a aVar4;
        int i16;
        final p1 p1Var3;
        final p1 p1Var4;
        final p1 p1Var5;
        boolean z14;
        String str3;
        t0.b bVar;
        final int i17;
        Object obj2;
        m.a.C2565a c2565a;
        boolean z15;
        t0.b bVar2;
        String strValueOf;
        String strValueOf2;
        rVar.getClass();
        qVar.getClass();
        o0 o0VarE = mVar.E(-743985327);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        int i18 = i15 | (o0VarE.B(d14) ? 32 : 16) | (o0VarE.B(d15) ? 256 : 128) | (o0VarE.B(str) ? 2048 : 1024) | (o0VarE.B(str2) ? 16384 : 8192) | (o0VarE.B(aVar) ? 131072 : 65536) | (o0VarE.B(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if ((i14 & 12582912) == 0) {
            i18 |= o0VarE.r(qVar) ? 8388608 : 4194304;
        }
        int i19 = i18 | (o0VarE.r(pVar) ? 67108864 : 33554432);
        if (o0VarE.n(i19 & 1, (38347923 & i19) != 38347922)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a2 = m.a.f135155b;
            String str4 = "";
            if (objQ == c2565a2) {
                if (d14 == null || (strValueOf2 = String.valueOf((int) d14.doubleValue())) == null) {
                    strValueOf2 = "";
                }
                objQ = p0.n(strValueOf2);
                o0VarE.K(objQ);
            }
            p1 p1Var6 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a2) {
                if (d15 != null && (strValueOf = String.valueOf((int) d15.doubleValue())) != null) {
                    str4 = strValueOf;
                }
                objQ2 = p0.n(str4);
                o0VarE.K(objQ2);
            }
            p1 p1Var7 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            String strP = null;
            if (objQ3 == c2565a2) {
                objQ3 = p0.n(null);
                o0VarE.K(objQ3);
            }
            p1 p1Var8 = (p1) objQ3;
            boolean z16 = ((i19 & 896) == 256) | ((i19 & 112) == 32);
            Object objQ4 = o0VarE.q();
            if (z16 || objQ4 == c2565a2) {
                p1Var = p1Var7;
                p1Var2 = p1Var6;
                d16 = d15;
                d17 = d14;
                dVar = new d(d17, d16, p1Var2, p1Var, null);
                o0VarE.K(dVar);
            } else {
                dVar = objQ4;
                p1Var = p1Var7;
                p1Var2 = p1Var6;
                d16 = d15;
                d17 = d14;
            }
            int i24 = i19 >> 3;
            l0.f(d17, d16, (p) dVar, o0VarE);
            j jVar = j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97920e;
            jVar.getClass();
            j.i iVarI = j.i(f14);
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(iVarI, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            p1 p1Var9 = p1Var2;
            r rVarC = k.c(rVar, o0VarE);
            g.V.getClass();
            e0.a aVar5 = g.a.f81805b;
            p1 p1Var10 = p1Var;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, s2VarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar3 = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            t0 t0Var = t0.f16792a;
            eo.e eVar = (eo.e) p1Var8.getF182175a();
            eo.e eVar2 = eo.e.MINIMUM;
            String str5 = eVar == eVar2 ? (String) p1Var9.getF182175a() : (String) pVar.invoke(eVar2, (String) p1Var9.getF182175a());
            r.a aVar6 = r.S;
            r rVarA = u2Var.a(aVar6, 1.0f, true);
            int i25 = 29360128 & i19;
            boolean z17 = i25 == 8388608;
            Object objQ5 = o0VarE.q();
            if (z17 || objQ5 == c2565a2) {
                final int i26 = 0;
                aVar4 = aVar6;
                qVar2 = qVar;
                i16 = i24;
                p1Var3 = p1Var8;
                p1Var4 = p1Var9;
                p1Var5 = p1Var10;
                z14 = true;
                obj = new l() { // from class: go.b
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj3) {
                        g0 g0Var = (g0) obj3;
                        switch (i26) {
                            case 0:
                                g0Var.getClass();
                                boolean zA = g0Var.a();
                                p1 p1Var11 = p1Var3;
                                if (zA) {
                                    eo.e eVar3 = eo.e.MINIMUM;
                                    p1Var11.setValue(eVar3);
                                    qVar2.invoke(d53.s.f((String) p1Var4.getF182175a()), d53.s.f((String) p1Var5.getF182175a()), eVar3);
                                } else if (((eo.e) p1Var11.getF182175a()) == eo.e.MINIMUM) {
                                    p1Var11.setValue(null);
                                }
                                break;
                            default:
                                g0Var.getClass();
                                boolean zA2 = g0Var.a();
                                p1 p1Var12 = p1Var3;
                                if (zA2) {
                                    eo.e eVar4 = eo.e.MAXIMUM;
                                    p1Var12.setValue(eVar4);
                                    qVar2.invoke(d53.s.f((String) p1Var4.getF182175a()), d53.s.f((String) p1Var5.getF182175a()), eVar4);
                                } else if (((eo.e) p1Var12.getF182175a()) == eo.e.MAXIMUM) {
                                    p1Var12.setValue(null);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(obj);
            } else {
                aVar4 = aVar6;
                obj = objQ5;
                p1Var3 = p1Var8;
                qVar2 = qVar;
                p1Var4 = p1Var9;
                p1Var5 = p1Var10;
                z14 = true;
                i16 = i24;
            }
            r rVarB = m4.e.b(rVarA, (l) obj);
            String strQ = y.Q(o0VarE, R.string.lbl_minimum);
            v.f188954b.getClass();
            boolean z18 = z14;
            int i27 = v.f188957e;
            if (aVar == null) {
                o0VarE.C(1156168225);
                o0VarE.g0(false);
                str3 = null;
            } else {
                o0VarE.C(1156168226);
                int i28 = aVar.f99689a;
                Object[] objArrA = aVar.a();
                String strP2 = y.P(i28, Arrays.copyOf(objArrA, objArrA.length), o0VarE);
                o0VarE.g0(false);
                str3 = strP2;
            }
            if (aVar == null || (bVar = t0.b.ERROR) == null) {
                bVar = t0.b.MESSAGE;
            }
            boolean z19 = i25 == 8388608 ? z18 : false;
            Object objQ6 = o0VarE.q();
            if (z19 || objQ6 == c2565a2) {
                i17 = 0;
                objQ6 = new l() { // from class: go.c
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj3) {
                        Long lJ;
                        Long lJ2;
                        String str6 = (String) obj3;
                        switch (i17) {
                            case 0:
                                str6.getClass();
                                if (str6.length() == 0 || ((lJ = t.j(str6)) != null && lJ.longValue() <= 99999999)) {
                                    p1 p1Var11 = p1Var4;
                                    p1Var11.setValue(str6);
                                    qVar2.invoke(d53.s.f((String) p1Var11.getF182175a()), d53.s.f((String) p1Var5.getF182175a()), eo.e.MINIMUM);
                                }
                                break;
                            default:
                                str6.getClass();
                                if (str6.length() == 0 || ((lJ2 = t.j(str6)) != null && lJ2.longValue() <= 99999999)) {
                                    p1 p1Var12 = p1Var4;
                                    p1Var12.setValue(str6);
                                    qVar2.invoke(d53.s.f((String) p1Var5.getF182175a()), d53.s.f((String) p1Var12.getF182175a()), eo.e.MAXIMUM);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ6);
            } else {
                i17 = 0;
            }
            r.a aVar7 = aVar4;
            t0Var.e(str5, rVarB, str, strQ, null, false, false, str3, bVar, null, i27, 0L, 0L, null, null, (l) objQ6, o0VarE, i16 & 896, 6, 31344);
            eo.e eVar3 = (eo.e) p1Var3.getF182175a();
            eo.e eVar4 = eo.e.MAXIMUM;
            String str6 = eVar3 == eVar4 ? (String) p1Var5.getF182175a() : (String) pVar.invoke(eVar4, (String) p1Var5.getF182175a());
            r rVarA2 = u2Var.a(aVar7, 1.0f, z18);
            boolean z24 = i25 == 8388608 ? z18 : false;
            Object objQ7 = o0VarE.q();
            if (z24 || objQ7 == c2565a2) {
                final int i29 = 1;
                c2565a = c2565a2;
                obj2 = new l() { // from class: go.b
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj3) {
                        g0 g0Var = (g0) obj3;
                        switch (i29) {
                            case 0:
                                g0Var.getClass();
                                boolean zA = g0Var.a();
                                p1 p1Var11 = p1Var3;
                                if (zA) {
                                    eo.e eVar5 = eo.e.MINIMUM;
                                    p1Var11.setValue(eVar5);
                                    qVar2.invoke(d53.s.f((String) p1Var4.getF182175a()), d53.s.f((String) p1Var5.getF182175a()), eVar5);
                                } else if (((eo.e) p1Var11.getF182175a()) == eo.e.MINIMUM) {
                                    p1Var11.setValue(null);
                                }
                                break;
                            default:
                                g0Var.getClass();
                                boolean zA2 = g0Var.a();
                                p1 p1Var12 = p1Var3;
                                if (zA2) {
                                    eo.e eVar6 = eo.e.MAXIMUM;
                                    p1Var12.setValue(eVar6);
                                    qVar2.invoke(d53.s.f((String) p1Var4.getF182175a()), d53.s.f((String) p1Var5.getF182175a()), eVar6);
                                } else if (((eo.e) p1Var12.getF182175a()) == eo.e.MAXIMUM) {
                                    p1Var12.setValue(null);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(obj2);
            } else {
                c2565a = c2565a2;
                obj2 = objQ7;
            }
            r rVarB2 = m4.e.b(rVarA2, (l) obj2);
            String strQ2 = y.Q(o0VarE, R.string.lbl_maximum);
            if (aVar2 == null) {
                o0VarE.C(1157354657);
                z15 = false;
                o0VarE.g0(false);
                aVar3 = aVar2;
            } else {
                o0VarE.C(1157354658);
                aVar3 = aVar2;
                int i30 = aVar3.f99689a;
                Object[] objArrA2 = aVar3.a();
                strP = y.P(i30, Arrays.copyOf(objArrA2, objArrA2.length), o0VarE);
                z15 = false;
                o0VarE.g0(false);
            }
            String str7 = strP;
            if (aVar3 == null || (bVar2 = t0.b.ERROR) == null) {
                bVar2 = t0.b.MESSAGE;
            }
            t0.b bVar4 = bVar2;
            if (i25 == 8388608) {
                z15 = true;
            }
            Object objQ8 = o0VarE.q();
            if (z15 || objQ8 == c2565a) {
                final int i34 = 1;
                objQ8 = new l() { // from class: go.c
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj3) {
                        Long lJ;
                        Long lJ2;
                        String str8 = (String) obj3;
                        switch (i34) {
                            case 0:
                                str8.getClass();
                                if (str8.length() == 0 || ((lJ = t.j(str8)) != null && lJ.longValue() <= 99999999)) {
                                    p1 p1Var11 = p1Var5;
                                    p1Var11.setValue(str8);
                                    qVar2.invoke(d53.s.f((String) p1Var11.getF182175a()), d53.s.f((String) p1Var4.getF182175a()), eo.e.MINIMUM);
                                }
                                break;
                            default:
                                str8.getClass();
                                if (str8.length() == 0 || ((lJ2 = t.j(str8)) != null && lJ2.longValue() <= 99999999)) {
                                    p1 p1Var12 = p1Var5;
                                    p1Var12.setValue(str8);
                                    qVar2.invoke(d53.s.f((String) p1Var4.getF182175a()), d53.s.f((String) p1Var12.getF182175a()), eo.e.MAXIMUM);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ8);
            }
            t0Var.e(str6, rVarB2, str2, strQ2, null, false, false, str7, bVar4, null, i27, 0L, 0L, null, null, (l) objQ8, o0VarE, (i19 >> 6) & 896, 6, 31344);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            aVar3 = aVar2;
            qVar2 = qVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fo.b(rVar, d14, d15, str, str2, aVar, aVar3, qVar2, pVar, i14);
        }
    }

    public static final void b(r rVar, String str, String str2, String str3, String str4, String str5, String str6, jo.a aVar, jo.a aVar2, e23.a aVar3, e23.a aVar4, m mVar, int i14, int i15) {
        int i16;
        String strQ;
        String strQ2;
        t0.b bVar;
        String str7;
        t0.b bVar2;
        boolean z14;
        rVar.getClass();
        aVar3.getClass();
        aVar4.getClass();
        o0 o0VarE = mVar.E(618517098);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(str2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(str3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.B(str4) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            if ((i15 & 32) == 0) {
                strQ = str5;
                int i17 = o0VarE.B(strQ) ? 131072 : 65536;
                i16 |= i17;
            } else {
                strQ = str5;
            }
            i16 |= i17;
        } else {
            strQ = str5;
        }
        if ((1572864 & i14) == 0) {
            if ((i15 & 64) == 0) {
                strQ2 = str6;
                int i18 = o0VarE.B(strQ2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                i16 |= i18;
            } else {
                strQ2 = str6;
            }
            i16 |= i18;
        } else {
            strQ2 = str6;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= o0VarE.B(aVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i16 |= o0VarE.B(aVar2) ? 67108864 : 33554432;
        }
        if ((805306368 & i14) == 0) {
            i16 |= o0VarE.r(aVar3) ? 536870912 : 268435456;
        }
        if (o0VarE.n(i16 & 1, (306783379 & i16) != 306783378)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                if ((i15 & 32) != 0) {
                    strQ = y.Q(o0VarE, R.string.lbl_minimum);
                    i16 &= -458753;
                }
                if ((i15 & 64) != 0) {
                    strQ2 = y.Q(o0VarE, R.string.lbl_maximum);
                    i16 &= -3670017;
                }
            } else {
                o0VarE.e();
                if ((i15 & 32) != 0) {
                    i16 &= -458753;
                }
                if ((i15 & 64) != 0) {
                    i16 &= -3670017;
                }
            }
            String str8 = strQ;
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            j jVar = j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97920e;
            jVar.getClass();
            j.i iVarI = j.i(f14);
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(iVarI, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVar, o0VarE);
            g.V.getClass();
            e0.a aVar5 = g.a.f81805b;
            String strP = null;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, s2VarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar3 = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            r.a aVar6 = r.S;
            r rVarA = u2Var.a(aVar6, 1.0f, true);
            f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = f.f97931h;
            x0 x0VarB = d92.c.b(x0Var, o0VarE);
            if (aVar == null || (bVar = t0.b.ERROR) == null) {
                bVar = t0.b.MESSAGE;
            }
            t0.b bVar4 = bVar;
            if (aVar == null) {
                o0VarE.C(1649241416);
                o0VarE.g0(false);
                str7 = null;
            } else {
                o0VarE.C(1649241417);
                int i19 = aVar.f99689a;
                Object[] objArrA = aVar.a();
                String strP2 = y.P(i19, Arrays.copyOf(objArrA, objArrA.length), o0VarE);
                o0VarE.g0(false);
                str7 = strP2;
            }
            c(rVarA, str8, str, str3, x0VarB, str7, bVar4, aVar3, o0VarE, ((i16 >> 12) & 112) | ((i16 << 3) & 896) | (i16 & 7168) | ((i16 >> 6) & 29360128));
            strQ = str8;
            r rVarA2 = u2Var.a(aVar6, 1.0f, true);
            fVar.getClass();
            x0 x0VarB2 = d92.c.b(x0Var, o0VarE);
            if (aVar2 == null || (bVar2 = t0.b.ERROR) == null) {
                bVar2 = t0.b.MESSAGE;
            }
            t0.b bVar5 = bVar2;
            if (aVar2 == null) {
                o0VarE.C(1649666984);
                z14 = false;
            } else {
                z14 = false;
                o0VarE.C(1649666985);
                int i24 = aVar2.f99689a;
                Object[] objArrA2 = aVar2.a();
                strP = y.P(i24, Arrays.copyOf(objArrA2, objArrA2.length), o0VarE);
            }
            o0VarE.g0(z14);
            c(rVarA2, strQ2, str2, str4, x0VarB2, strP, bVar5, aVar4, o0VarE, ((i16 >> 15) & 112) | (i16 & 896) | ((i16 >> 3) & 7168) | 12582912);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(rVar, str, str2, str3, str4, strQ, strQ2, aVar, aVar2, aVar3, aVar4, i14, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(r rVar, String str, String str2, String str3, x0 x0Var, String str4, t0.b bVar, e23.a aVar, m mVar, int i14) {
        int i15;
        String str5;
        o0 o0Var;
        long jA;
        long jC;
        boolean z14;
        o0 o0VarE = mVar.E(22704175);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            str5 = str3;
            i15 |= o0VarE.B(str5) ? 2048 : 1024;
        } else {
            str5 = str3;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(x0Var) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(str4) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.k(bVar == null ? -1 : bVar.ordinal()) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = kg.f.b(o0VarE);
            }
            p1 p1VarK = xy2.b.k((a2.j) objQ, o0VarE, 6);
            if (((Boolean) p1VarK.getF182175a()).booleanValue()) {
                o0VarE.C(343888884);
                d92.b.f58623a.getClass();
                jA = ((d0) d92.b.a(o0VarE).g().b().f82540c.getF182175a()).f128833a;
            } else {
                o0VarE.C(343890006);
                d92.b.f58623a.getClass();
                jA = d92.b.a(o0VarE).g().b().a();
            }
            o0VarE.g0(false);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            int i16 = i15;
            r rVarC = k.c(rVar, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
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
            g.a.b bVar2 = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            r.a aVar3 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarC2 = c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
            d92.b.f58624b.getClass();
            long j8 = jA;
            mh.c(str, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(f.f97932i, o0VarE), o0VarE, (i16 >> 3) & 14, 0, 131068);
            String str6 = str2.length() == 0 ? str5 : str2;
            r rVarF = x2.f(aVar3, 1.0f);
            boolean z15 = (i16 & 29360128) == 8388608;
            Object objQ2 = o0VarE.q();
            if (z15 || objQ2 == c2565a) {
                objQ2 = new h0(aVar, 18);
                o0VarE.K(objQ2);
            }
            r rVarD = w.d(rVarF, false, null, null, (e23.a) objQ2, 15);
            long jA2 = d92.b.a(o0VarE).g().a().a();
            bVar3.getClass();
            j92.d dVar = j92.b.f97900c;
            float f14 = dVar.f97910b;
            float f15 = dVar.f97910b;
            r rVarE = u1.n.e(rVarD, jA2, i.a(f14));
            float f16 = ((Boolean) p1VarK.getF182175a()).booleanValue() ? 2 : 1;
            g6.f.a aVar4 = g6.f.f75994b;
            bVar3.getClass();
            r rVarB = u1.q.b(f16, j8, rVarE, i.a(f15));
            bVar3.getClass();
            r rVarY = c2.l.y(rVarB, eVar.f97920e);
            bVar3.getClass();
            r rVarB2 = l4.k.b(rVarY, i.a(f15));
            if (str2.length() == 0) {
                o0VarE.C(129694379);
                jC = d0.c(0.5f, d92.b.a(o0VarE).k().b(), 14);
                o0VarE.g0(false);
            } else {
                o0VarE.C(129695326);
                o0VarE.g0(false);
                jC = x0Var.c();
            }
            mh.c(str6, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var, jC, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131068);
            if (str4 == null) {
                o0VarE.C(-274371176);
                o0VarE.g0(false);
                o0Var = o0VarE;
                z14 = true;
            } else {
                o0VarE.C(-274371175);
                o0Var = o0VarE;
                z14 = true;
                t0.f16792a.a(str4, null, bVar, o0Var, (i16 >> 12) & 896, 2);
                Unit unit = Unit.INSTANCE;
                o0Var.g0(false);
            }
            o0Var.g0(z14);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(rVar, str, str2, str3, x0Var, str4, bVar, aVar, i14);
        }
    }
}
