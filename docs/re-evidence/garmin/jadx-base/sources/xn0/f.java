package xn0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.o;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import cr.u;
import e23.l;
import gl1.y;
import h4.r;
import in0.m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.t1;
import m92.h0;
import m92.p0;
import n92.j;
import o13.p;
import o4.d0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import s5.s0;
import s5.x0;
import w5.q;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:108:0x014f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0158  */
    /* JADX WARN: Code duplicated, block: B:120:0x017a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0187  */
    /* JADX WARN: Code duplicated, block: B:123:0x018f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0198  */
    /* JADX WARN: Code duplicated, block: B:127:0x019a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0230  */
    /* JADX WARN: Code duplicated, block: B:139:0x0247  */
    /* JADX WARN: Code duplicated, block: B:140:0x024a  */
    /* JADX WARN: Code duplicated, block: B:143:0x0258  */
    /* JADX WARN: Code duplicated, block: B:144:0x025b  */
    /* JADX WARN: Code duplicated, block: B:147:0x0267  */
    /* JADX WARN: Code duplicated, block: B:150:0x026f  */
    /* JADX WARN: Code duplicated, block: B:151:0x0280  */
    /* JADX WARN: Code duplicated, block: B:160:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:163:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:164:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:168:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:171:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:173:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:174:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:177:0x040d  */
    /* JADX WARN: Code duplicated, block: B:180:0x041c  */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, final i53.c<h0.e.a> cVar, final i53.c<h0.d.b> cVar2, final j23.g<o> gVar, p0 p0Var, final un0.a aVar, final m mVar, final float f14, final float f15, final String str2, final String str3, final String str4, boolean z14, p3.m mVar2, final int i14, final int i15, final int i16) {
        p0 p0Var2;
        float f16;
        boolean z15;
        int i17;
        boolean z16;
        o0 o0Var;
        final String str5;
        final boolean z17;
        final p0 p0Var3;
        p2 p2VarI0;
        int i18;
        int i19;
        p0 bVar;
        String str6;
        int i24;
        p0 p0Var4;
        boolean z18;
        long jF;
        long jC;
        float fFloatValue;
        float fFloatValue2;
        boolean z19;
        int i25;
        boolean z24;
        int i26;
        int i27;
        boolean z25;
        boolean z26;
        Object objQ;
        p3.m.a aVar2;
        int i28;
        boolean z27;
        long j8;
        float f17;
        float f18;
        boolean z28;
        boolean z29;
        boolean z34;
        boolean z35;
        Object objQ2;
        o0 o0Var2;
        long j14;
        cVar.getClass();
        cVar2.getClass();
        mVar.getClass();
        str2.getClass();
        str4.getClass();
        o0 o0VarE = mVar2.E(-1881519499);
        int i29 = (i14 & 6) == 0 ? i14 | 2 : i14;
        if ((i14 & 48) == 0) {
            i29 |= (i14 & 64) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i29 |= (i14 & 512) == 0 ? o0VarE.B(cVar2) : o0VarE.r(cVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i29 |= o0VarE.r(gVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            if ((i16 & 16) == 0) {
                p0Var2 = p0Var;
                int i30 = o0VarE.r(p0Var2) ? 16384 : 8192;
                i29 |= i30;
            } else {
                p0Var2 = p0Var;
            }
            i29 |= i30;
        } else {
            p0Var2 = p0Var;
        }
        if ((196608 & i14) == 0) {
            i29 |= (262144 & i14) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i29 |= o0VarE.k(mVar.ordinal()) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            f16 = f14;
            i29 |= o0VarE.i(f16) ? 8388608 : 4194304;
        } else {
            f16 = f14;
        }
        if ((i14 & 100663296) == 0) {
            i29 |= o0VarE.i(f15) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i29 |= o0VarE.B(str2) ? 536870912 : 268435456;
        }
        int i34 = i15 | (o0VarE.B(str3) ? 4 : 2) | (o0VarE.B(str4) ? 32 : 16);
        int i35 = i16 & 4096;
        if (i35 == 0) {
            if ((i15 & 384) == 0) {
                z15 = z14;
                i34 |= o0VarE.h(z15) ? 256 : 128;
            }
            i17 = i29;
            if ((i17 & 306783379) == 306783378 || (i34 & 147) != 146) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i17 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    String strQ = y.Q(o0VarE, R.string.lbl_sleep_averages);
                    i18 = i17 & (-15);
                    if ((i16 & 16) != 0) {
                        bVar = new d02.b();
                        i19 = i17 & (-57359);
                    } else {
                        i19 = i18;
                        bVar = p0Var2;
                    }
                    str6 = strQ;
                    i24 = i19;
                    p0Var4 = bVar;
                    if (i35 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                } else {
                    o0VarE.e();
                    i24 = i17 & (-15);
                    if ((i16 & 16) != 0) {
                        i24 = i17 & (-57359);
                    }
                    str6 = str;
                    z18 = z15;
                    p0Var4 = p0Var2;
                }
                o0VarE.h0();
                x1 x1Var = n.f135158a;
                zn0.b.f205391a.getClass();
                gl.c.f77766a.getClass();
                jF = gl.c.a(o0VarE).f();
                jC = d0.c(0.7f, gl.c.a(o0VarE).g(), 14);
                s0 s0Var = new s0((q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (g6.o) o0VarE.A(t1.f91496n), 0, 8, null);
                p pVar = new p(Float.valueOf(0.0f), Float.valueOf(7.0f - 1));
                fFloatValue = ((Number) pVar.f128594a).floatValue();
                fFloatValue2 = ((Number) pVar.f128595b).floatValue();
                if ((i24 & 896) != 256 || ((i24 & 512) != 0 && o0VarE.r(cVar2))) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean zL = z19 | o0VarE.l(jC) | o0VarE.i(fFloatValue) | o0VarE.i(fFloatValue2);
                i25 = 29360128 & i24;
                if (i25 == 8388608) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z36 = zL | z24;
                i26 = i24 & 234881024;
                i27 = i24;
                if (i26 == 67108864) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z36 | z25;
                objQ = o0VarE.q();
                aVar2 = p3.m.f135153a;
                if (z26) {
                    i28 = 32;
                    z27 = true;
                    objQ = new c81.a(cVar2, jC, fFloatValue, fFloatValue2, f16, f15, 2);
                    j8 = jC;
                    f17 = fFloatValue;
                    f18 = fFloatValue2;
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        i28 = 32;
                        z27 = true;
                        objQ = new c81.a(cVar2, jC, fFloatValue, fFloatValue2, f16, f15, 2);
                        j8 = jC;
                        f17 = fFloatValue;
                        f18 = fFloatValue2;
                        o0VarE.K(objQ);
                    } else {
                        f18 = fFloatValue2;
                        f17 = fFloatValue;
                        i28 = 32;
                        z27 = true;
                        j8 = jC;
                    }
                }
                l lVar = (l) objQ;
                boolean zL2 = o0VarE.l(jF);
                if ((i27 & 112) != i28 || ((i27 & 64) != 0 && o0VarE.r(cVar))) {
                    z28 = z27;
                } else {
                    z28 = false;
                }
                boolean zI = zL2 | z28 | o0VarE.i(f17) | o0VarE.i(f18);
                if (i25 == 8388608) {
                    z29 = z27;
                } else {
                    z29 = false;
                }
                boolean z37 = zI | z29;
                if (i26 == 67108864) {
                    z34 = z27;
                } else {
                    z34 = false;
                }
                z35 = z37 | z34;
                objQ2 = o0VarE.q();
                if (z35) {
                    o0Var2 = o0VarE;
                    c81.a aVar3 = new c81.a(jF, cVar, f17, f18, f14, f15, 3);
                    j14 = jF;
                    o0Var2.K(aVar3);
                    objQ2 = aVar3;
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        o0Var2 = o0VarE;
                        c81.a aVar4 = new c81.a(jF, cVar, f17, f18, f14, f15, 3);
                        j14 = jF;
                        o0Var2.K(aVar4);
                        objQ2 = aVar4;
                    } else {
                        j14 = jF;
                        o0Var2 = o0VarE;
                    }
                }
                g6.f.a aVar5 = g6.f.f75994b;
                r rVarH = x2.h(x2.f(r.S, 1.0f), 350);
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                r rVarA = c2.l.A(rVarH, eVar.f97920e, 0.0f, 2);
                bVar2.getClass();
                r rVarC = c2.l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
                l[] lVarArr = new l[2];
                lVarArr[0] = lVar;
                lVarArr[z27] = (l) objQ2;
                i53.f fVarA = i53.a.a(lVarArr);
                ArrayList arrayListD = c02.a.d((o) gVar.getStart(), (o) gVar.b());
                j92.f fVar = d92.b.f58624b;
                fVar.getClass();
                x0 x0Var = j92.f.f97935l;
                n92.d dVar = new n92.d(arrayListD, s0Var, d92.c.f(x0Var, o0Var2), null, null, 24, null);
                j jVar = new j(p0Var4, Float.valueOf(f14), Float.valueOf(f15), 0, 8, null);
                fVar.getClass();
                z17 = z18;
                final p0 p0Var5 = p0Var4;
                final long j15 = j14;
                final long j16 = j8;
                String str7 = str6;
                o0Var = o0Var2;
                m92.r.b(rVarC, fVarA, null, str7, false, y.Q(o0Var2, R.string.common_no_data), 0.0f, 0.0f, new n92.a(jVar, null, new n92.g(sn.a.c(o0Var2), s0Var, d92.c.f(x0Var, o0Var2), null, 8, null), dVar, 2, null), z3.f.c(-1004401776, new u(str4, j14, j8), o0Var2), z3.f.c(-1338278716, new e23.q() { // from class: xn0.c
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Object obj4;
                        Object next;
                        float f19;
                        Float f22 = (Float) obj;
                        p3.m mVar3 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= mVar3.B(f22) ? 4 : 2;
                        }
                        if (mVar3.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                            x1 x1Var2 = n.f135158a;
                            Iterator<E> it = cVar2.iterator();
                            while (true) {
                                obj4 = null;
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                                h0.d.b bVar3 = (h0.d.b) next;
                                if (f22 != null && ((int) bVar3.f117343a) == ((int) f22.floatValue())) {
                                    break;
                                }
                            }
                            final h0.d.b bVar4 = (h0.d.b) next;
                            for (Object obj5 : cVar) {
                                h0.e.a aVar6 = (h0.e.a) obj5;
                                if (f22 != null && ((int) aVar6.f117346a) == ((int) f22.floatValue())) {
                                    obj4 = obj5;
                                    break;
                                }
                            }
                            final h0.e.a aVar7 = (h0.e.a) obj4;
                            if (bVar4 != null) {
                                f19 = bVar4.f117343a;
                            } else {
                                if (aVar7 == null) {
                                    x1 x1Var3 = n.f135158a;
                                    return Unit.INSTANCE;
                                }
                                f19 = aVar7.f117346a;
                            }
                            int i36 = (int) f19;
                            o oVar = (o) gVar.getStart();
                            b63.i.INSTANCE.getClass();
                            DateTime dateTimeAtStartOfDay = g22.l.h(b63.q.e(oVar, i36, b63.i.f16190d)).toDateTimeAtStartOfDay();
                            pi0.e eVar2 = new pi0.e((Context) mVar3.A(AndroidCompositionLocals_androidKt.f6042b));
                            dateTimeAtStartOfDay.getClass();
                            String strA = eVar2.a(dateTimeAtStartOfDay, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                            final long j17 = j15;
                            final p0 p0Var6 = p0Var5;
                            final String str8 = str3;
                            final String str9 = str2;
                            final un0.a aVar8 = aVar;
                            final m mVar4 = mVar;
                            final long j18 = j16;
                            final boolean z38 = z17;
                            m92.y.a(strA, z3.f.c(1069894355, new e23.p() { // from class: xn0.e
                                @Override // e23.p
                                public final Object invoke(Object obj6, Object obj7) {
                                    p3.m mVar5 = (p3.m) obj6;
                                    int iIntValue2 = ((Integer) obj7).intValue();
                                    if (mVar5.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var4 = n.f135158a;
                                        h0.e.a aVar9 = aVar7;
                                        String str10 = str8;
                                        if (aVar9 == null) {
                                            mVar5.C(270456477);
                                            mVar5.f();
                                        } else {
                                            mVar5.C(270456478);
                                            m92.y.b(d0.a(j17), p0Var6.a(aVar9.f117347b), str10, null, str9, null, mVar5, 0, 40);
                                            mVar5.f();
                                        }
                                        h0.d.b bVar5 = bVar4;
                                        if (bVar5 == null) {
                                            mVar5.C(270757952);
                                            mVar5.f();
                                        } else {
                                            mVar5.C(270757953);
                                            String strG = aVar8.g(mVar4, new j23.d(bVar5.f117344b, bVar5.f117345c), false);
                                            d0 d0VarA = d0.a(j18);
                                            if (!z38) {
                                                str10 = null;
                                            }
                                            m92.y.b(d0VarA, strG, str10, null, y.Q(mVar5, R.string.lbl_typical_range), null, mVar5, 0, 40);
                                            mVar5.f();
                                        }
                                    } else {
                                        mVar5.e();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, mVar3), mVar3, 384);
                            x1 x1Var4 = n.f135158a;
                        } else {
                            mVar3.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0Var2), o0Var, C.ENCODING_PCM_32BIT, 6, 212);
                p0Var3 = p0Var5;
                str5 = str7;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str5 = str;
                z17 = z15;
                p0Var3 = p0Var2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: xn0.d
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i14 | 1);
                        int iT2 = p3.p0.t(i15);
                        f.a(str5, cVar, cVar2, gVar, p0Var3, aVar, mVar, f14, f15, str2, str3, str4, z17, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i34 |= 384;
        z15 = z14;
        i17 = i29;
        if ((i17 & 306783379) == 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (o0VarE.n(i17 & 1, z16)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                String strQ2 = y.Q(o0VarE, R.string.lbl_sleep_averages);
                i18 = i17 & (-15);
                if ((i16 & 16) != 0) {
                    bVar = new d02.b();
                    i19 = i17 & (-57359);
                } else {
                    i19 = i18;
                    bVar = p0Var2;
                }
                str6 = strQ2;
                i24 = i19;
                p0Var4 = bVar;
                if (i35 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
            } else {
                String strQ3 = y.Q(o0VarE, R.string.lbl_sleep_averages);
                i18 = i17 & (-15);
                if ((i16 & 16) != 0) {
                    bVar = new d02.b();
                    i19 = i17 & (-57359);
                } else {
                    i19 = i18;
                    bVar = p0Var2;
                }
                str6 = strQ3;
                i24 = i19;
                p0Var4 = bVar;
                if (i35 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
            }
            o0VarE.h0();
            x1 x1Var2 = n.f135158a;
            zn0.b.f205391a.getClass();
            gl.c.f77766a.getClass();
            jF = gl.c.a(o0VarE).f();
            jC = d0.c(0.7f, gl.c.a(o0VarE).g(), 14);
            s0 s0Var2 = new s0((q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (g6.o) o0VarE.A(t1.f91496n), 0, 8, null);
            p pVar2 = new p(Float.valueOf(0.0f), Float.valueOf(7.0f - 1));
            fFloatValue = ((Number) pVar2.f128594a).floatValue();
            fFloatValue2 = ((Number) pVar2.f128595b).floatValue();
            if ((i24 & 896) != 256) {
                z19 = true;
            } else {
                z19 = true;
            }
            boolean zL3 = z19 | o0VarE.l(jC) | o0VarE.i(fFloatValue) | o0VarE.i(fFloatValue2);
            i25 = 29360128 & i24;
            if (i25 == 8388608) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean z38 = zL3 | z24;
            i26 = i24 & 234881024;
            i27 = i24;
            if (i26 == 67108864) {
                z25 = true;
            } else {
                z25 = false;
            }
            z26 = z38 | z25;
            objQ = o0VarE.q();
            aVar2 = p3.m.f135153a;
            if (z26) {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    i28 = 32;
                    z27 = true;
                    objQ = new c81.a(cVar2, jC, fFloatValue, fFloatValue2, f16, f15, 2);
                    j8 = jC;
                    f17 = fFloatValue;
                    f18 = fFloatValue2;
                    o0VarE.K(objQ);
                } else {
                    f18 = fFloatValue2;
                    f17 = fFloatValue;
                    i28 = 32;
                    z27 = true;
                    j8 = jC;
                }
            } else {
                i28 = 32;
                z27 = true;
                objQ = new c81.a(cVar2, jC, fFloatValue, fFloatValue2, f16, f15, 2);
                j8 = jC;
                f17 = fFloatValue;
                f18 = fFloatValue2;
                o0VarE.K(objQ);
            }
            l lVar2 = (l) objQ;
            boolean zL4 = o0VarE.l(jF);
            if ((i27 & 112) != i28) {
                z28 = z27;
            } else {
                z28 = z27;
            }
            boolean zI2 = zL4 | z28 | o0VarE.i(f17) | o0VarE.i(f18);
            if (i25 == 8388608) {
                z29 = z27;
            } else {
                z29 = false;
            }
            boolean z39 = zI2 | z29;
            if (i26 == 67108864) {
                z34 = z27;
            } else {
                z34 = false;
            }
            z35 = z39 | z34;
            objQ2 = o0VarE.q();
            if (z35) {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    o0Var2 = o0VarE;
                    c81.a aVar6 = new c81.a(jF, cVar, f17, f18, f14, f15, 3);
                    j14 = jF;
                    o0Var2.K(aVar6);
                    objQ2 = aVar6;
                } else {
                    j14 = jF;
                    o0Var2 = o0VarE;
                }
            } else {
                o0Var2 = o0VarE;
                c81.a aVar7 = new c81.a(jF, cVar, f17, f18, f14, f15, 3);
                j14 = jF;
                o0Var2.K(aVar7);
                objQ2 = aVar7;
            }
            g6.f.a aVar8 = g6.f.f75994b;
            r rVarH2 = x2.h(x2.f(r.S, 1.0f), 350);
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar2 = j92.b.f97899b;
            r rVarA2 = c2.l.A(rVarH2, eVar2.f97920e, 0.0f, 2);
            bVar3.getClass();
            r rVarC2 = c2.l.C(rVarA2, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
            l[] lVarArr2 = new l[2];
            lVarArr2[0] = lVar2;
            lVarArr2[z27] = (l) objQ2;
            i53.f fVarA2 = i53.a.a(lVarArr2);
            ArrayList arrayListD2 = c02.a.d((o) gVar.getStart(), (o) gVar.b());
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var2 = j92.f.f97935l;
            n92.d dVar2 = new n92.d(arrayListD2, s0Var2, d92.c.f(x0Var2, o0Var2), null, null, 24, null);
            j jVar2 = new j(p0Var4, Float.valueOf(f14), Float.valueOf(f15), 0, 8, null);
            fVar2.getClass();
            z17 = z18;
            final p0 p0Var6 = p0Var4;
            final long j17 = j14;
            final long j18 = j8;
            String str8 = str6;
            o0Var = o0Var2;
            m92.r.b(rVarC2, fVarA2, null, str8, false, y.Q(o0Var2, R.string.common_no_data), 0.0f, 0.0f, new n92.a(jVar2, null, new n92.g(sn.a.c(o0Var2), s0Var2, d92.c.f(x0Var2, o0Var2), null, 8, null), dVar2, 2, null), z3.f.c(-1004401776, new u(str4, j14, j8), o0Var2), z3.f.c(-1338278716, new e23.q() { // from class: xn0.c
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Object obj4;
                    Object next;
                    float f19;
                    Float f22 = (Float) obj;
                    p3.m mVar3 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= mVar3.B(f22) ? 4 : 2;
                    }
                    if (mVar3.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                        x1 x1Var3 = n.f135158a;
                        Iterator<E> it = cVar2.iterator();
                        while (true) {
                            obj4 = null;
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            h0.d.b bVar4 = (h0.d.b) next;
                            if (f22 != null && ((int) bVar4.f117343a) == ((int) f22.floatValue())) {
                                break;
                            }
                        }
                        final h0.d.b bVar5 = (h0.d.b) next;
                        for (Object obj5 : cVar) {
                            h0.e.a aVar9 = (h0.e.a) obj5;
                            if (f22 != null && ((int) aVar9.f117346a) == ((int) f22.floatValue())) {
                                obj4 = obj5;
                                break;
                            }
                        }
                        final h0.e.a aVar10 = (h0.e.a) obj4;
                        if (bVar5 != null) {
                            f19 = bVar5.f117343a;
                        } else {
                            if (aVar10 == null) {
                                x1 x1Var4 = n.f135158a;
                                return Unit.INSTANCE;
                            }
                            f19 = aVar10.f117346a;
                        }
                        int i36 = (int) f19;
                        o oVar = (o) gVar.getStart();
                        b63.i.INSTANCE.getClass();
                        DateTime dateTimeAtStartOfDay = g22.l.h(b63.q.e(oVar, i36, b63.i.f16190d)).toDateTimeAtStartOfDay();
                        pi0.e eVar3 = new pi0.e((Context) mVar3.A(AndroidCompositionLocals_androidKt.f6042b));
                        dateTimeAtStartOfDay.getClass();
                        String strA = eVar3.a(dateTimeAtStartOfDay, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                        final long j19 = j17;
                        final p0 p0Var7 = p0Var6;
                        final String str9 = str3;
                        final String str10 = str2;
                        final un0.a aVar11 = aVar;
                        final m mVar4 = mVar;
                        final long j110 = j18;
                        final boolean z310 = z17;
                        m92.y.a(strA, z3.f.c(1069894355, new e23.p() { // from class: xn0.e
                            @Override // e23.p
                            public final Object invoke(Object obj6, Object obj7) {
                                p3.m mVar5 = (p3.m) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                if (mVar5.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    x1 x1Var5 = n.f135158a;
                                    h0.e.a aVar12 = aVar10;
                                    String str11 = str9;
                                    if (aVar12 == null) {
                                        mVar5.C(270456477);
                                        mVar5.f();
                                    } else {
                                        mVar5.C(270456478);
                                        m92.y.b(d0.a(j19), p0Var7.a(aVar12.f117347b), str11, null, str10, null, mVar5, 0, 40);
                                        mVar5.f();
                                    }
                                    h0.d.b bVar6 = bVar5;
                                    if (bVar6 == null) {
                                        mVar5.C(270757952);
                                        mVar5.f();
                                    } else {
                                        mVar5.C(270757953);
                                        String strG = aVar11.g(mVar4, new j23.d(bVar6.f117344b, bVar6.f117345c), false);
                                        d0 d0VarA = d0.a(j110);
                                        if (!z310) {
                                            str11 = null;
                                        }
                                        m92.y.b(d0VarA, strG, str11, null, y.Q(mVar5, R.string.lbl_typical_range), null, mVar5, 0, 40);
                                        mVar5.f();
                                    }
                                } else {
                                    mVar5.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar3), mVar3, 384);
                        x1 x1Var5 = n.f135158a;
                    } else {
                        mVar3.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0Var2), o0Var, C.ENCODING_PCM_32BIT, 6, 212);
            p0Var3 = p0Var6;
            str5 = str8;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str5 = str;
            z17 = z15;
            p0Var3 = p0Var2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: xn0.d
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    f.a(str5, cVar, cVar2, gVar, p0Var3, aVar, mVar, f14, f15, str2, str3, str4, z17, (p3.m) obj, iT, iT2, i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
