package z01;

import a3.q;
import b11.o;
import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g21.f0;
import g21.u;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.e5;
import j20.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o13.p;
import o4.d0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.q0;
import s5.s0;
import s5.t0;
import s5.x0;
import u1.m0;
import v.h;
import w2.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:100:0x0193  */
    /* JADX WARN: Code duplicated, block: B:101:0x0197  */
    /* JADX WARN: Code duplicated, block: B:104:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:113:0x0205  */
    /* JADX WARN: Code duplicated, block: B:114:0x0208  */
    /* JADX WARN: Code duplicated, block: B:117:0x0233  */
    /* JADX WARN: Code duplicated, block: B:118:0x0236  */
    /* JADX WARN: Code duplicated, block: B:121:0x025f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0262  */
    /* JADX WARN: Code duplicated, block: B:126:0x0293 A[LOOP:0: B:124:0x028d->B:126:0x0293, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:133:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:136:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:137:0x0304  */
    /* JADX WARN: Code duplicated, block: B:140:0x031e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0326  */
    /* JADX WARN: Code duplicated, block: B:147:0x0337  */
    /* JADX WARN: Code duplicated, block: B:148:0x035c  */
    /* JADX WARN: Code duplicated, block: B:151:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:153:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:154:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:157:0x040f  */
    /* JADX WARN: Code duplicated, block: B:159:0x041d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0488  */
    /* JADX WARN: Code duplicated, block: B:163:0x0552  */
    /* JADX WARN: Code duplicated, block: B:167:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:169:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:171:0x0601  */
    /* JADX WARN: Code duplicated, block: B:173:0x0607  */
    /* JADX WARN: Code duplicated, block: B:175:0x0626  */
    /* JADX WARN: Code duplicated, block: B:177:0x063a  */
    /* JADX WARN: Code duplicated, block: B:180:0x0642  */
    /* JADX WARN: Code duplicated, block: B:182:0x0645  */
    /* JADX WARN: Code duplicated, block: B:183:0x064c  */
    /* JADX WARN: Code duplicated, block: B:185:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:190:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:192:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:194:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:197:0x06df  */
    /* JADX WARN: Code duplicated, block: B:201:0x06af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x0098  */
    /* JADX WARN: Code duplicated, block: B:43:0x009b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00db  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x0115 A[PHI: r9 r13
      0x0115: PHI (r9v28 h4.r) = (r9v9 h4.r), (r9v30 h4.r) binds: [B:91:0x0125, B:83:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r13v40 java.lang.String) = (r13v2 java.lang.String), (r13v41 java.lang.String) binds: [B:91:0x0125, B:83:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x011a  */
    /* JADX WARN: Code duplicated, block: B:87:0x011d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0121  */
    /* JADX WARN: Code duplicated, block: B:90:0x0123  */
    /* JADX WARN: Code duplicated, block: B:92:0x0127  */
    /* JADX WARN: Code duplicated, block: B:95:0x014e  */
    /* JADX WARN: Code duplicated, block: B:98:0x018a  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, v21.e eVar, String str, u uVar, f0 f0Var, f0 f0Var2, i53.c<o> cVar, boolean z14, m mVar, int i14, int i15) {
        int i16;
        p3.c<?> cVar2;
        int i17;
        int i18;
        int i19;
        boolean z15;
        o0 o0Var;
        r rVar2;
        String str2;
        boolean z16;
        p2 p2VarI0;
        r rVar3;
        String str3;
        boolean z17;
        Object objQ;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        r rVar4;
        e0.a aVar;
        String str4;
        g.a.b bVar;
        String strQ;
        Integer num;
        Integer numK;
        String strU;
        String strU2;
        String strE;
        String strE2;
        String strQ2;
        Double d14;
        Double dF;
        String strT;
        l22.a aVar2;
        String strT2;
        String strD;
        String strD2;
        String strQ3;
        Double d15;
        Double dF2;
        String strT3;
        String strT4;
        String strD3;
        String strD4;
        String strQ4;
        Double d16;
        Double dF3;
        String strT5;
        String strT6;
        String strD5;
        String strD6;
        ArrayList arrayList;
        Iterator<o> it;
        String str5;
        String str6;
        String strK0;
        s0 s0VarA;
        x0 x0VarB;
        String strConcat;
        String strD7;
        boolean z18;
        String strH;
        boolean zB;
        Object objQ2;
        q0 q0Var;
        p3.c<?> cVar3;
        String str7;
        String str8;
        o0 o0Var2;
        ArrayList arrayList2;
        z zVarA2;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        e0.a aVar3;
        g.a.b bVar2;
        long j8;
        long j14;
        List listK;
        Iterator<o> it3;
        int i24;
        o next;
        int i25;
        o oVar;
        p pVar;
        Double d17;
        String str9;
        List list;
        l22.a aVar4;
        String strB;
        String strB2;
        Double d18;
        boolean z19;
        ArrayList arrayList3;
        Object obj;
        boolean zR;
        int i26;
        int i27;
        int i28;
        int i29;
        uVar.getClass();
        Double d19 = uVar.f75504f;
        Double d24 = uVar.f75505g;
        Double d25 = uVar.f75506h;
        int i30 = uVar.f75500b;
        f0Var.getClass();
        cVar.getClass();
        o0 o0VarE = mVar.E(46980613);
        p3.c<?> cVar4 = o0VarE.f135177b;
        int i34 = i15 & 1;
        if (i34 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(eVar) ? 32 : 16;
        }
        int i35 = i16;
        int i36 = i15 & 4;
        if (i36 == 0) {
            cVar2 = cVar4;
            if ((i14 & 384) == 0) {
                i35 |= o0VarE.B(str) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarE.B(uVar)) {
                    i29 = 2048;
                } else {
                    i29 = 1024;
                }
                i35 |= i29;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.B(f0Var)) {
                    i28 = 16384;
                } else {
                    i28 = 8192;
                }
                i35 |= i28;
            }
            if ((196608 & i14) == 0) {
                if (o0VarE.B(f0Var2)) {
                    i27 = 131072;
                } else {
                    i27 = 65536;
                }
                i35 |= i27;
            }
            if ((1572864 & i14) == 0) {
                if ((2097152 & i14) == 0) {
                    zR = o0VarE.B(cVar);
                } else {
                    zR = o0VarE.r(cVar);
                }
                if (zR) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i35 |= i26;
            }
            i17 = i15 & 128;
            if (i17 != 0) {
                i35 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (o0VarE.h(z14)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i35 |= i18;
            }
            i19 = i35;
            if ((i35 & 4793491) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i19 & 1, z15)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if (i34 != 0) {
                        rVar3 = r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i36 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i17 != 0) {
                        z17 = true;
                    }
                    o0VarE.h0();
                    x1 x1Var = n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarA = l.A(rVar3, 0.0f, j92.b.f97899b.f97920e, 1);
                    objQ = o0VarE.q();
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new yq.d(13);
                        o0VarE.K(objQ);
                    }
                    r rVarC3 = v.c((e23.l) objQ, rVarA, true);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = k.c(rVarC3, o0VarE);
                    g.V.getClass();
                    rVar4 = rVar3;
                    aVar = g.a.f81805b;
                    if (cVar2 == null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    str4 = str3;
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
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
                    l22.a aVarS = a0.s(o0VarE);
                    strQ = gl1.y.Q(o0VarE, R.string.lbl_calories);
                    Integer num2 = f0Var.f75417a;
                    if (f0Var2 != null) {
                        num = f0Var2.f75417a;
                    } else {
                        num = null;
                    }
                    numK = dh.b.K(num2, num);
                    int i37 = v21.e.f175323i;
                    strU = eVar.u(numK, i30, false);
                    strU2 = eVar.u(numK, i30, true);
                    strE = eVar.E(numK, Integer.valueOf(i30), false);
                    strE2 = eVar.E(numK, Integer.valueOf(i30), true);
                    strQ2 = gl1.y.Q(o0VarE, R.string.protein);
                    Double d26 = f0Var.f75420d;
                    if (f0Var2 != null) {
                        d14 = f0Var2.f75420d;
                    } else {
                        d14 = null;
                    }
                    dF = zf.b.F(d26, d14);
                    strT = eVar.t(dF, d25, true, (12 & 8) == 0);
                    aVar2 = aVarS;
                    strT2 = eVar.t(dF, d25, true, (12 & 8) == 0);
                    strD = eVar.D(dF, d25, true, (12 & 8) == 0);
                    strD2 = eVar.D(dF, d25, true, (12 & 8) == 0);
                    strQ3 = gl1.y.Q(o0VarE, R.string.fat);
                    Double d27 = f0Var.f75419c;
                    if (f0Var2 != null) {
                        d15 = f0Var2.f75419c;
                    } else {
                        d15 = null;
                    }
                    dF2 = zf.b.F(d27, d15);
                    strT3 = eVar.t(dF2, d24, true, (12 & 8) == 0);
                    strT4 = eVar.t(dF2, d24, true, (12 & 8) == 0);
                    strD3 = eVar.D(dF2, d24, true, (12 & 8) == 0);
                    strD4 = eVar.D(dF2, d24, true, (12 & 8) == 0);
                    strQ4 = gl1.y.Q(o0VarE, R.string.carbs);
                    Double d28 = f0Var.f75418b;
                    if (f0Var2 != null) {
                        d16 = f0Var2.f75418b;
                    } else {
                        d16 = null;
                    }
                    dF3 = zf.b.F(d28, d16);
                    strT5 = eVar.t(dF3, d19, true, (12 & 8) == 0);
                    strT6 = eVar.t(dF3, d19, true, (12 & 8) == 0);
                    strD5 = eVar.D(dF3, d19, true, (12 & 8) == 0);
                    strD6 = eVar.D(dF3, d19, true, (12 & 8) == 0);
                    arrayList = new ArrayList(p13.y.r(cVar, 10));
                    it = cVar.iterator();
                    while (it.hasNext()) {
                        o next2 = it.next();
                        Iterator<o> it4 = it;
                        Double d29 = next2.f14357b;
                        s21.n nVar = next2.f14356a;
                        arrayList.add(eVar.A(d29, nVar.f156154d, nVar.f156155e, false));
                        it = it4;
                        strT6 = strT6;
                        strD6 = strD6;
                    }
                    str5 = strD6;
                    str6 = strT6;
                    strK0 = h0.k0(arrayList, "\n", null, null, null, 62);
                    s0VarA = t0.a(o0VarE);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarB = d92.c.b(j92.f.f97933j, o0VarE);
                    strConcat = "";
                    if (z17) {
                        strD7 = x.d(strD, "\n", strD3, "\n", strD5);
                    } else {
                        strD7 = "";
                    }
                    if (strK0.length() > 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        strConcat = "\n".concat(strK0);
                    }
                    strH = com.nimbusds.jose.shaded.gson.internal.a.h(strE, "\n", strD7, strConcat);
                    zB = o0VarE.B(strK0) | o0VarE.B(strE) | o0VarE.B(strD7);
                    objQ2 = o0VarE.q();
                    if (zB || objQ2 == m.a.f135155b) {
                        objQ2 = s0.a(s0VarA, strH, x0VarB, 0L, 1020);
                        o0VarE.K(objQ2);
                    }
                    q0Var = (q0) objQ2;
                    if (str4 == null) {
                        o0VarE.C(290815613);
                        o0VarE.g0(false);
                        o0Var2 = o0VarE;
                        str7 = strD5;
                        cVar3 = cVar2;
                        str8 = str4;
                    } else {
                        o0VarE.C(290815614);
                        cVar3 = cVar2;
                        str7 = strD5;
                        y01.a.a(x2.f(r.S, 1.0f), str4, false, null, null, o0VarE, 24966, 8);
                        str8 = str4;
                        o0Var2 = o0VarE;
                        Unit unit = Unit.INSTANCE;
                        o0Var2.g0(false);
                    }
                    r rVarA2 = m0.a(r.S, true, null);
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    arrayList2 = arrayList;
                    r rVarA3 = l.A(rVarA2, eVar2.f97920e, 0.0f, 2);
                    j jVar = j.f22691a;
                    bVar3.getClass();
                    float f14 = eVar2.f97920e;
                    jVar.getClass();
                    j.i iVarI = j.i(f14);
                    h4.d.f81522a.getClass();
                    zVarA2 = y.a(iVarI, h4.d.a.f81536n, o0Var2, 0);
                    x1 x1Var2 = n.f135158a;
                    iHashCode2 = Long.hashCode(o0Var2.U);
                    i2VarA1 = o0Var2.a0();
                    rVarC2 = k.c(rVarA3, o0Var2);
                    g.V.getClass();
                    aVar3 = g.a.f81805b;
                    if (cVar3 == null) {
                        p0.l();
                        throw null;
                    }
                    o0Var2.z();
                    if (o0Var2.T) {
                        o0Var2.M(aVar3);
                    } else {
                        o0Var2.c();
                    }
                    b4.c(g.a.f81810g, zVarA2, o0Var2);
                    b4.c(g.a.f81809f, i2VarA1, o0Var2);
                    bVar2 = g.a.f81813j;
                    if (o0Var2.T || !s.g(o0Var2.q(), Integer.valueOf(iHashCode2))) {
                        h.A(iHashCode2, o0Var2, iHashCode2, bVar2);
                    }
                    b4.c(g.a.f81807d, rVarC2, o0Var2);
                    b0 b0Var2 = b0.f22601a;
                    z3.e eVarC = z3.f.c(-1234467758, new g11.n(numK, uVar, 1), o0Var2);
                    j8 = q0Var.f157282c;
                    a aVar5 = new a(w02.b0.x(o0Var2, (int) (j8 >> 32)), strE, x0VarB, null);
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    LinkedHashMap linkedHashMap = c0235a.f16962a;
                    linkedHashMap.put("title", strQ);
                    linkedHashMap.put("label_metadata", strU2);
                    linkedHashMap.put("value", strE2);
                    b92.a aVarB = c0235a.b();
                    int i38 = b92.a.f16960b;
                    o0 o0Var3 = o0Var2;
                    b.b(null, strQ, strU, eVarC, aVar5, aVarB, o0Var3, 3072);
                    o0Var = o0Var3;
                    if (z17) {
                        o0Var.C(1524086755);
                        z3.e eVarC2 = z3.f.c(-2090938089, new g11.o(dF, uVar, 3), o0Var);
                        j14 = j8;
                        int i39 = (int) (j14 >> 32);
                        a aVar6 = new a(w02.b0.x(o0Var, i39), strD, x0VarB, null);
                        b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                        LinkedHashMap linkedHashMap2 = c0235a2.f16962a;
                        linkedHashMap2.put("title", strQ2);
                        linkedHashMap2.put("label_metadata", strT2);
                        linkedHashMap2.put("value", strD2);
                        b.b(null, strQ2, strT, eVarC2, aVar6, c0235a2.b(), o0Var, 3072);
                        z3.e eVarC3 = z3.f.c(-1994207424, new g11.o(dF2, uVar, 4), o0Var);
                        a aVar7 = new a(w02.b0.x(o0Var, i39), strD3, x0VarB, null);
                        b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                        LinkedHashMap linkedHashMap3 = c0235a3.f16962a;
                        linkedHashMap3.put("title", strQ3);
                        linkedHashMap3.put("label_metadata", strT4);
                        linkedHashMap3.put("value", strD4);
                        b.b(null, strQ3, strT3, eVarC3, aVar7, c0235a3.b(), o0Var, 3072);
                        z3.e eVarC4 = z3.f.c(-1587179937, new g11.o(dF3, uVar, 5), o0Var);
                        a aVar8 = new a(w02.b0.x(o0Var, i39), str7, x0VarB, null);
                        b92.a.C0235a c0235a4 = new b92.a.C0235a(null, 1, null);
                        LinkedHashMap linkedHashMap4 = c0235a4.f16962a;
                        linkedHashMap4.put("title", strQ4);
                        linkedHashMap4.put("label_metadata", str6);
                        linkedHashMap4.put("value", str5);
                        b.b(null, strQ4, strT5, eVarC4, aVar8, c0235a4.b(), o0Var, 3072);
                        o0Var = o0Var;
                        o0Var.g0(false);
                    } else {
                        j14 = j8;
                        o0Var.C(1527505993);
                        o0Var.g0(false);
                    }
                    f02.u.f67749a.getClass();
                    gl.c cVar5 = gl.c.f77766a;
                    cVar5.getClass();
                    d0 d0VarA = d0.a(gl.c.a(o0Var).q());
                    cVar5.getClass();
                    p pVar2 = new p(d0VarA, d0.a(gl.c.a(o0Var).p()));
                    cVar5.getClass();
                    d0 d0VarA2 = d0.a(((d0) gl.c.a(o0Var).f77764r.getF182175a()).f128833a);
                    cVar5.getClass();
                    p pVar3 = new p(d0VarA2, d0.a(gl.c.a(o0Var).r()));
                    cVar5.getClass();
                    d0 d0VarA3 = d0.a(gl.c.a(o0Var).e());
                    cVar5.getClass();
                    listK = p13.x.k(pVar2, pVar3, new p(d0VarA3, d0.a(gl.c.a(o0Var).d())));
                    o0Var.C(-1890370931);
                    it3 = cVar.iterator();
                    i24 = 0;
                    while (it3.hasNext()) {
                        next = it3.next();
                        i25 = i24 + 1;
                        if (i24 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        oVar = next;
                        pVar = (p) h0.e0(i24, listK);
                        if (pVar == null) {
                            list = listK;
                        } else {
                            s21.n nVar2 = oVar.f14356a;
                            d17 = oVar.f14357b;
                            str9 = nVar2.f156155e;
                            String str10 = nVar2.f156152b;
                            String str11 = nVar2.f156153c;
                            b11.n.f14341e.getClass();
                            list = listK;
                            aVar4 = aVar2;
                            strB = b11.n.a.b(str10, str11, aVar4);
                            strB2 = b11.n.a.b(str10, str11, aVar4);
                            d18 = nVar2.f156154d;
                            if (d18 != null) {
                                double dDoubleValue = d18.doubleValue();
                                String strB3 = eVar.B(str9, d17, d18);
                                aVar2 = aVar4;
                                String strB4 = eVar.B(str9, d17, d18);
                                if (i24 >= 0 || i24 >= arrayList2.size()) {
                                    z19 = false;
                                } else {
                                    z19 = true;
                                }
                                if (z19) {
                                    arrayList3 = arrayList2;
                                    obj = arrayList3.get(i24);
                                } else {
                                    arrayList3 = arrayList2;
                                    obj = "";
                                }
                                arrayList2 = arrayList3;
                                String strA = eVar.A(d17, d18, str9, true);
                                z3.e eVarC5 = z3.f.c(471332322, new nc1.a(oVar, pVar, dDoubleValue, 1), o0Var);
                                a aVar9 = new a(w02.b0.x(o0Var, (int) (j14 >> 32)), (String) obj, x0VarB, null);
                                b92.a.C0235a c0235a5 = new b92.a.C0235a(null, 1, null);
                                LinkedHashMap linkedHashMap5 = c0235a5.f16962a;
                                linkedHashMap5.put("title", strB2);
                                linkedHashMap5.put("label_metadata", strB4);
                                linkedHashMap5.put("value", strA);
                                b92.a aVarB2 = c0235a5.b();
                                int i44 = b92.a.f16960b;
                                o0 o0Var4 = o0Var;
                                b.b(null, strB, strB3, eVarC5, aVar9, aVarB2, o0Var4, 3072);
                                o0Var = o0Var4;
                            } else {
                                aVar2 = aVar4;
                            }
                            listK = list;
                            it3 = it3;
                            i24 = i25;
                        }
                        listK = list;
                        it3 = it3;
                        i24 = i25;
                    }
                    e5.u(o0Var, false, true, true);
                    x1 x1Var3 = n.f135158a;
                    z16 = z17;
                    rVar2 = rVar4;
                    str2 = str8;
                } else {
                    o0VarE.e();
                    rVar3 = rVar;
                    str3 = str;
                }
                z17 = z14;
                o0VarE.h0();
                x1 x1Var4 = n.f135158a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarA4 = l.A(rVar3, 0.0f, j92.b.f97899b.f97920e, 1);
                objQ = o0VarE.q();
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new yq.d(13);
                    o0VarE.K(objQ);
                }
                r rVarC4 = v.c((e23.l) objQ, rVarA4, true);
                j.f22691a.getClass();
                j.k kVar2 = j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarC4, o0VarE);
                g.V.getClass();
                rVar4 = rVar3;
                aVar = g.a.f81805b;
                if (cVar2 == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                str4 = str3;
                if (o0VarE.T) {
                    o0VarE.M(aVar);
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
                l22.a aVarS2 = a0.s(o0VarE);
                strQ = gl1.y.Q(o0VarE, R.string.lbl_calories);
                Integer num3 = f0Var.f75417a;
                if (f0Var2 != null) {
                    num = f0Var2.f75417a;
                } else {
                    num = null;
                }
                numK = dh.b.K(num3, num);
                int i310 = v21.e.f175323i;
                strU = eVar.u(numK, i30, false);
                strU2 = eVar.u(numK, i30, true);
                strE = eVar.E(numK, Integer.valueOf(i30), false);
                strE2 = eVar.E(numK, Integer.valueOf(i30), true);
                strQ2 = gl1.y.Q(o0VarE, R.string.protein);
                Double d210 = f0Var.f75420d;
                if (f0Var2 != null) {
                    d14 = f0Var2.f75420d;
                } else {
                    d14 = null;
                }
                dF = zf.b.F(d210, d14);
                strT = eVar.t(dF, d25, true, (12 & 8) == 0);
                aVar2 = aVarS2;
                strT2 = eVar.t(dF, d25, true, (12 & 8) == 0);
                strD = eVar.D(dF, d25, true, (12 & 8) == 0);
                strD2 = eVar.D(dF, d25, true, (12 & 8) == 0);
                strQ3 = gl1.y.Q(o0VarE, R.string.fat);
                Double d211 = f0Var.f75419c;
                if (f0Var2 != null) {
                    d15 = f0Var2.f75419c;
                } else {
                    d15 = null;
                }
                dF2 = zf.b.F(d211, d15);
                strT3 = eVar.t(dF2, d24, true, (12 & 8) == 0);
                strT4 = eVar.t(dF2, d24, true, (12 & 8) == 0);
                strD3 = eVar.D(dF2, d24, true, (12 & 8) == 0);
                strD4 = eVar.D(dF2, d24, true, (12 & 8) == 0);
                strQ4 = gl1.y.Q(o0VarE, R.string.carbs);
                Double d212 = f0Var.f75418b;
                if (f0Var2 != null) {
                    d16 = f0Var2.f75418b;
                } else {
                    d16 = null;
                }
                dF3 = zf.b.F(d212, d16);
                strT5 = eVar.t(dF3, d19, true, (12 & 8) == 0);
                strT6 = eVar.t(dF3, d19, true, (12 & 8) == 0);
                strD5 = eVar.D(dF3, d19, true, (12 & 8) == 0);
                strD6 = eVar.D(dF3, d19, true, (12 & 8) == 0);
                arrayList = new ArrayList(p13.y.r(cVar, 10));
                it = cVar.iterator();
                while (it.hasNext()) {
                    o next3 = it.next();
                    Iterator<o> it5 = it;
                    Double d213 = next3.f14357b;
                    s21.n nVar3 = next3.f14356a;
                    arrayList.add(eVar.A(d213, nVar3.f156154d, nVar3.f156155e, false));
                    it = it5;
                    strT6 = strT6;
                    strD6 = strD6;
                }
                str5 = strD6;
                str6 = strT6;
                strK0 = h0.k0(arrayList, "\n", null, null, null, 62);
                s0VarA = t0.a(o0VarE);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarB = d92.c.b(j92.f.f97933j, o0VarE);
                strConcat = "";
                if (z17) {
                    strD7 = x.d(strD, "\n", strD3, "\n", strD5);
                } else {
                    strD7 = "";
                }
                if (strK0.length() > 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (z18) {
                    strConcat = "\n".concat(strK0);
                }
                strH = com.nimbusds.jose.shaded.gson.internal.a.h(strE, "\n", strD7, strConcat);
                zB = o0VarE.B(strK0) | o0VarE.B(strE) | o0VarE.B(strD7);
                objQ2 = o0VarE.q();
                if (zB) {
                    objQ2 = s0.a(s0VarA, strH, x0VarB, 0L, 1020);
                    o0VarE.K(objQ2);
                } else {
                    objQ2 = s0.a(s0VarA, strH, x0VarB, 0L, 1020);
                    o0VarE.K(objQ2);
                }
                q0Var = (q0) objQ2;
                if (str4 == null) {
                    o0VarE.C(290815613);
                    o0VarE.g0(false);
                    o0Var2 = o0VarE;
                    str7 = strD5;
                    cVar3 = cVar2;
                    str8 = str4;
                } else {
                    o0VarE.C(290815614);
                    cVar3 = cVar2;
                    str7 = strD5;
                    y01.a.a(x2.f(r.S, 1.0f), str4, false, null, null, o0VarE, 24966, 8);
                    str8 = str4;
                    o0Var2 = o0VarE;
                    Unit unit2 = Unit.INSTANCE;
                    o0Var2.g0(false);
                }
                r rVarA5 = m0.a(r.S, true, null);
                j92.b bVar4 = d92.b.f58625c;
                bVar4.getClass();
                j92.e eVar3 = j92.b.f97899b;
                arrayList2 = arrayList;
                r rVarA6 = l.A(rVarA5, eVar3.f97920e, 0.0f, 2);
                j jVar2 = j.f22691a;
                bVar4.getClass();
                float f15 = eVar3.f97920e;
                jVar2.getClass();
                j.i iVarI2 = j.i(f15);
                h4.d.f81522a.getClass();
                zVarA2 = y.a(iVarI2, h4.d.a.f81536n, o0Var2, 0);
                x1 x1Var5 = n.f135158a;
                iHashCode2 = Long.hashCode(o0Var2.U);
                i2VarA1 = o0Var2.a0();
                rVarC2 = k.c(rVarA6, o0Var2);
                g.V.getClass();
                aVar3 = g.a.f81805b;
                if (cVar3 == null) {
                    p0.l();
                    throw null;
                }
                o0Var2.z();
                if (o0Var2.T) {
                    o0Var2.M(aVar3);
                } else {
                    o0Var2.c();
                }
                b4.c(g.a.f81810g, zVarA2, o0Var2);
                b4.c(g.a.f81809f, i2VarA1, o0Var2);
                bVar2 = g.a.f81813j;
                if (o0Var2.T) {
                    h.A(iHashCode2, o0Var2, iHashCode2, bVar2);
                } else {
                    h.A(iHashCode2, o0Var2, iHashCode2, bVar2);
                }
                b4.c(g.a.f81807d, rVarC2, o0Var2);
                b0 b0Var4 = b0.f22601a;
                z3.e eVarC6 = z3.f.c(-1234467758, new g11.n(numK, uVar, 1), o0Var2);
                j8 = q0Var.f157282c;
                a aVar10 = new a(w02.b0.x(o0Var2, (int) (j8 >> 32)), strE, x0VarB, null);
                b92.a.C0235a c0235a6 = new b92.a.C0235a(null, 1, null);
                LinkedHashMap linkedHashMap6 = c0235a6.f16962a;
                linkedHashMap6.put("title", strQ);
                linkedHashMap6.put("label_metadata", strU2);
                linkedHashMap6.put("value", strE2);
                b92.a aVarB3 = c0235a6.b();
                int i311 = b92.a.f16960b;
                o0 o0Var5 = o0Var2;
                b.b(null, strQ, strU, eVarC6, aVar10, aVarB3, o0Var5, 3072);
                o0Var = o0Var5;
                if (z17) {
                    o0Var.C(1524086755);
                    z3.e eVarC7 = z3.f.c(-2090938089, new g11.o(dF, uVar, 3), o0Var);
                    j14 = j8;
                    int i312 = (int) (j14 >> 32);
                    a aVar11 = new a(w02.b0.x(o0Var, i312), strD, x0VarB, null);
                    b92.a.C0235a c0235a7 = new b92.a.C0235a(null, 1, null);
                    LinkedHashMap linkedHashMap7 = c0235a7.f16962a;
                    linkedHashMap7.put("title", strQ2);
                    linkedHashMap7.put("label_metadata", strT2);
                    linkedHashMap7.put("value", strD2);
                    b.b(null, strQ2, strT, eVarC7, aVar11, c0235a7.b(), o0Var, 3072);
                    z3.e eVarC8 = z3.f.c(-1994207424, new g11.o(dF2, uVar, 4), o0Var);
                    a aVar12 = new a(w02.b0.x(o0Var, i312), strD3, x0VarB, null);
                    b92.a.C0235a c0235a8 = new b92.a.C0235a(null, 1, null);
                    LinkedHashMap linkedHashMap8 = c0235a8.f16962a;
                    linkedHashMap8.put("title", strQ3);
                    linkedHashMap8.put("label_metadata", strT4);
                    linkedHashMap8.put("value", strD4);
                    b.b(null, strQ3, strT3, eVarC8, aVar12, c0235a8.b(), o0Var, 3072);
                    z3.e eVarC9 = z3.f.c(-1587179937, new g11.o(dF3, uVar, 5), o0Var);
                    a aVar13 = new a(w02.b0.x(o0Var, i312), str7, x0VarB, null);
                    b92.a.C0235a c0235a9 = new b92.a.C0235a(null, 1, null);
                    LinkedHashMap linkedHashMap9 = c0235a9.f16962a;
                    linkedHashMap9.put("title", strQ4);
                    linkedHashMap9.put("label_metadata", str6);
                    linkedHashMap9.put("value", str5);
                    b.b(null, strQ4, strT5, eVarC9, aVar13, c0235a9.b(), o0Var, 3072);
                    o0Var = o0Var;
                    o0Var.g0(false);
                } else {
                    j14 = j8;
                    o0Var.C(1527505993);
                    o0Var.g0(false);
                }
                f02.u.f67749a.getClass();
                gl.c cVar6 = gl.c.f77766a;
                cVar6.getClass();
                d0 d0VarA4 = d0.a(gl.c.a(o0Var).q());
                cVar6.getClass();
                p pVar4 = new p(d0VarA4, d0.a(gl.c.a(o0Var).p()));
                cVar6.getClass();
                d0 d0VarA5 = d0.a(((d0) gl.c.a(o0Var).f77764r.getF182175a()).f128833a);
                cVar6.getClass();
                p pVar5 = new p(d0VarA5, d0.a(gl.c.a(o0Var).r()));
                cVar6.getClass();
                d0 d0VarA6 = d0.a(gl.c.a(o0Var).e());
                cVar6.getClass();
                listK = p13.x.k(pVar4, pVar5, new p(d0VarA6, d0.a(gl.c.a(o0Var).d())));
                o0Var.C(-1890370931);
                it3 = cVar.iterator();
                i24 = 0;
                while (it3.hasNext()) {
                    next = it3.next();
                    i25 = i24 + 1;
                    if (i24 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    oVar = next;
                    pVar = (p) h0.e0(i24, listK);
                    if (pVar == null) {
                        list = listK;
                    } else {
                        s21.n nVar4 = oVar.f14356a;
                        d17 = oVar.f14357b;
                        str9 = nVar4.f156155e;
                        String str12 = nVar4.f156152b;
                        String str13 = nVar4.f156153c;
                        b11.n.f14341e.getClass();
                        list = listK;
                        aVar4 = aVar2;
                        strB = b11.n.a.b(str12, str13, aVar4);
                        strB2 = b11.n.a.b(str12, str13, aVar4);
                        d18 = nVar4.f156154d;
                        if (d18 != null) {
                            double dDoubleValue2 = d18.doubleValue();
                            String strB5 = eVar.B(str9, d17, d18);
                            aVar2 = aVar4;
                            String strB6 = eVar.B(str9, d17, d18);
                            if (i24 >= 0) {
                                z19 = false;
                            } else {
                                z19 = false;
                            }
                            if (z19) {
                                arrayList3 = arrayList2;
                                obj = arrayList3.get(i24);
                            } else {
                                arrayList3 = arrayList2;
                                obj = "";
                            }
                            arrayList2 = arrayList3;
                            String strA2 = eVar.A(d17, d18, str9, true);
                            z3.e eVarC10 = z3.f.c(471332322, new nc1.a(oVar, pVar, dDoubleValue2, 1), o0Var);
                            a aVar14 = new a(w02.b0.x(o0Var, (int) (j14 >> 32)), (String) obj, x0VarB, null);
                            b92.a.C0235a c0235a10 = new b92.a.C0235a(null, 1, null);
                            LinkedHashMap linkedHashMap10 = c0235a10.f16962a;
                            linkedHashMap10.put("title", strB2);
                            linkedHashMap10.put("label_metadata", strB6);
                            linkedHashMap10.put("value", strA2);
                            b92.a aVarB4 = c0235a10.b();
                            int i45 = b92.a.f16960b;
                            o0 o0Var6 = o0Var;
                            b.b(null, strB, strB5, eVarC10, aVar14, aVarB4, o0Var6, 3072);
                            o0Var = o0Var6;
                        } else {
                            aVar2 = aVar4;
                        }
                        listK = list;
                        it3 = it3;
                        i24 = i25;
                    }
                    listK = list;
                    it3 = it3;
                    i24 = i25;
                }
                e5.u(o0Var, false, true, true);
                x1 x1Var6 = n.f135158a;
                z16 = z17;
                rVar2 = rVar4;
                str2 = str8;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                str2 = str;
                z16 = z14;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new q(rVar2, eVar, str2, uVar, f0Var, f0Var2, cVar, z16, i14, i15);
            }
        }
        i35 |= 384;
        cVar2 = cVar4;
        if ((i14 & 3072) == 0) {
            if (o0VarE.B(uVar)) {
                i29 = 2048;
            } else {
                i29 = 1024;
            }
            i35 |= i29;
        }
        if ((i14 & 24576) == 0) {
            if (o0VarE.B(f0Var)) {
                i28 = 16384;
            } else {
                i28 = 8192;
            }
            i35 |= i28;
        }
        if ((196608 & i14) == 0) {
            if (o0VarE.B(f0Var2)) {
                i27 = 131072;
            } else {
                i27 = 65536;
            }
            i35 |= i27;
        }
        if ((1572864 & i14) == 0) {
            if ((2097152 & i14) == 0) {
                zR = o0VarE.B(cVar);
            } else {
                zR = o0VarE.r(cVar);
            }
            if (zR) {
                i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i26 = 524288;
            }
            i35 |= i26;
        }
        i17 = i15 & 128;
        if (i17 != 0) {
            i35 |= 12582912;
        } else if ((i14 & 12582912) == 0) {
            if (o0VarE.h(z14)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i35 |= i18;
        }
        i19 = i35;
        if ((i35 & 4793491) != 4793490) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i19 & 1, z15)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i34 != 0) {
                    rVar3 = r.S;
                } else {
                    rVar3 = rVar;
                }
                if (i36 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i17 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
            } else {
                if (i34 != 0) {
                    rVar3 = r.S;
                } else {
                    rVar3 = rVar;
                }
                if (i36 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i17 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
            }
            o0VarE.h0();
            x1 x1Var7 = n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA7 = l.A(rVar3, 0.0f, j92.b.f97899b.f97920e, 1);
            objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new yq.d(13);
                o0VarE.K(objQ);
            }
            r rVarC5 = v.c((e23.l) objQ, rVarA7, true);
            j.f22691a.getClass();
            j.k kVar3 = j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = y.a(kVar3, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarC5, o0VarE);
            g.V.getClass();
            rVar4 = rVar3;
            aVar = g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            str4 = str3;
            if (o0VarE.T) {
                o0VarE.M(aVar);
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
            b0 b0Var5 = b0.f22601a;
            l22.a aVarS3 = a0.s(o0VarE);
            strQ = gl1.y.Q(o0VarE, R.string.lbl_calories);
            Integer num4 = f0Var.f75417a;
            if (f0Var2 != null) {
                num = f0Var2.f75417a;
            } else {
                num = null;
            }
            numK = dh.b.K(num4, num);
            int i313 = v21.e.f175323i;
            strU = eVar.u(numK, i30, false);
            strU2 = eVar.u(numK, i30, true);
            strE = eVar.E(numK, Integer.valueOf(i30), false);
            strE2 = eVar.E(numK, Integer.valueOf(i30), true);
            strQ2 = gl1.y.Q(o0VarE, R.string.protein);
            Double d214 = f0Var.f75420d;
            if (f0Var2 != null) {
                d14 = f0Var2.f75420d;
            } else {
                d14 = null;
            }
            dF = zf.b.F(d214, d14);
            strT = eVar.t(dF, d25, true, (12 & 8) == 0);
            aVar2 = aVarS3;
            strT2 = eVar.t(dF, d25, true, (12 & 8) == 0);
            strD = eVar.D(dF, d25, true, (12 & 8) == 0);
            strD2 = eVar.D(dF, d25, true, (12 & 8) == 0);
            strQ3 = gl1.y.Q(o0VarE, R.string.fat);
            Double d215 = f0Var.f75419c;
            if (f0Var2 != null) {
                d15 = f0Var2.f75419c;
            } else {
                d15 = null;
            }
            dF2 = zf.b.F(d215, d15);
            strT3 = eVar.t(dF2, d24, true, (12 & 8) == 0);
            strT4 = eVar.t(dF2, d24, true, (12 & 8) == 0);
            strD3 = eVar.D(dF2, d24, true, (12 & 8) == 0);
            strD4 = eVar.D(dF2, d24, true, (12 & 8) == 0);
            strQ4 = gl1.y.Q(o0VarE, R.string.carbs);
            Double d216 = f0Var.f75418b;
            if (f0Var2 != null) {
                d16 = f0Var2.f75418b;
            } else {
                d16 = null;
            }
            dF3 = zf.b.F(d216, d16);
            strT5 = eVar.t(dF3, d19, true, (12 & 8) == 0);
            strT6 = eVar.t(dF3, d19, true, (12 & 8) == 0);
            strD5 = eVar.D(dF3, d19, true, (12 & 8) == 0);
            strD6 = eVar.D(dF3, d19, true, (12 & 8) == 0);
            arrayList = new ArrayList(p13.y.r(cVar, 10));
            it = cVar.iterator();
            while (it.hasNext()) {
                o next4 = it.next();
                Iterator<o> it6 = it;
                Double d217 = next4.f14357b;
                s21.n nVar5 = next4.f14356a;
                arrayList.add(eVar.A(d217, nVar5.f156154d, nVar5.f156155e, false));
                it = it6;
                strT6 = strT6;
                strD6 = strD6;
            }
            str5 = strD6;
            str6 = strT6;
            strK0 = h0.k0(arrayList, "\n", null, null, null, 62);
            s0VarA = t0.a(o0VarE);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0VarB = d92.c.b(j92.f.f97933j, o0VarE);
            strConcat = "";
            if (z17) {
                strD7 = x.d(strD, "\n", strD3, "\n", strD5);
            } else {
                strD7 = "";
            }
            if (strK0.length() > 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                strConcat = "\n".concat(strK0);
            }
            strH = com.nimbusds.jose.shaded.gson.internal.a.h(strE, "\n", strD7, strConcat);
            zB = o0VarE.B(strK0) | o0VarE.B(strE) | o0VarE.B(strD7);
            objQ2 = o0VarE.q();
            if (zB) {
                objQ2 = s0.a(s0VarA, strH, x0VarB, 0L, 1020);
                o0VarE.K(objQ2);
            } else {
                objQ2 = s0.a(s0VarA, strH, x0VarB, 0L, 1020);
                o0VarE.K(objQ2);
            }
            q0Var = (q0) objQ2;
            if (str4 == null) {
                o0VarE.C(290815613);
                o0VarE.g0(false);
                o0Var2 = o0VarE;
                str7 = strD5;
                cVar3 = cVar2;
                str8 = str4;
            } else {
                o0VarE.C(290815614);
                cVar3 = cVar2;
                str7 = strD5;
                y01.a.a(x2.f(r.S, 1.0f), str4, false, null, null, o0VarE, 24966, 8);
                str8 = str4;
                o0Var2 = o0VarE;
                Unit unit3 = Unit.INSTANCE;
                o0Var2.g0(false);
            }
            r rVarA8 = m0.a(r.S, true, null);
            j92.b bVar5 = d92.b.f58625c;
            bVar5.getClass();
            j92.e eVar4 = j92.b.f97899b;
            arrayList2 = arrayList;
            r rVarA9 = l.A(rVarA8, eVar4.f97920e, 0.0f, 2);
            j jVar3 = j.f22691a;
            bVar5.getClass();
            float f16 = eVar4.f97920e;
            jVar3.getClass();
            j.i iVarI3 = j.i(f16);
            h4.d.f81522a.getClass();
            zVarA2 = y.a(iVarI3, h4.d.a.f81536n, o0Var2, 0);
            x1 x1Var8 = n.f135158a;
            iHashCode2 = Long.hashCode(o0Var2.U);
            i2VarA1 = o0Var2.a0();
            rVarC2 = k.c(rVarA9, o0Var2);
            g.V.getClass();
            aVar3 = g.a.f81805b;
            if (cVar3 == null) {
                p0.l();
                throw null;
            }
            o0Var2.z();
            if (o0Var2.T) {
                o0Var2.M(aVar3);
            } else {
                o0Var2.c();
            }
            b4.c(g.a.f81810g, zVarA2, o0Var2);
            b4.c(g.a.f81809f, i2VarA1, o0Var2);
            bVar2 = g.a.f81813j;
            if (o0Var2.T) {
                h.A(iHashCode2, o0Var2, iHashCode2, bVar2);
            } else {
                h.A(iHashCode2, o0Var2, iHashCode2, bVar2);
            }
            b4.c(g.a.f81807d, rVarC2, o0Var2);
            b0 b0Var6 = b0.f22601a;
            z3.e eVarC11 = z3.f.c(-1234467758, new g11.n(numK, uVar, 1), o0Var2);
            j8 = q0Var.f157282c;
            a aVar15 = new a(w02.b0.x(o0Var2, (int) (j8 >> 32)), strE, x0VarB, null);
            b92.a.C0235a c0235a11 = new b92.a.C0235a(null, 1, null);
            LinkedHashMap linkedHashMap11 = c0235a11.f16962a;
            linkedHashMap11.put("title", strQ);
            linkedHashMap11.put("label_metadata", strU2);
            linkedHashMap11.put("value", strE2);
            b92.a aVarB5 = c0235a11.b();
            int i314 = b92.a.f16960b;
            o0 o0Var7 = o0Var2;
            b.b(null, strQ, strU, eVarC11, aVar15, aVarB5, o0Var7, 3072);
            o0Var = o0Var7;
            if (z17) {
                o0Var.C(1524086755);
                z3.e eVarC12 = z3.f.c(-2090938089, new g11.o(dF, uVar, 3), o0Var);
                j14 = j8;
                int i315 = (int) (j14 >> 32);
                a aVar16 = new a(w02.b0.x(o0Var, i315), strD, x0VarB, null);
                b92.a.C0235a c0235a12 = new b92.a.C0235a(null, 1, null);
                LinkedHashMap linkedHashMap12 = c0235a12.f16962a;
                linkedHashMap12.put("title", strQ2);
                linkedHashMap12.put("label_metadata", strT2);
                linkedHashMap12.put("value", strD2);
                b.b(null, strQ2, strT, eVarC12, aVar16, c0235a12.b(), o0Var, 3072);
                z3.e eVarC13 = z3.f.c(-1994207424, new g11.o(dF2, uVar, 4), o0Var);
                a aVar17 = new a(w02.b0.x(o0Var, i315), strD3, x0VarB, null);
                b92.a.C0235a c0235a13 = new b92.a.C0235a(null, 1, null);
                LinkedHashMap linkedHashMap13 = c0235a13.f16962a;
                linkedHashMap13.put("title", strQ3);
                linkedHashMap13.put("label_metadata", strT4);
                linkedHashMap13.put("value", strD4);
                b.b(null, strQ3, strT3, eVarC13, aVar17, c0235a13.b(), o0Var, 3072);
                z3.e eVarC14 = z3.f.c(-1587179937, new g11.o(dF3, uVar, 5), o0Var);
                a aVar18 = new a(w02.b0.x(o0Var, i315), str7, x0VarB, null);
                b92.a.C0235a c0235a14 = new b92.a.C0235a(null, 1, null);
                LinkedHashMap linkedHashMap14 = c0235a14.f16962a;
                linkedHashMap14.put("title", strQ4);
                linkedHashMap14.put("label_metadata", str6);
                linkedHashMap14.put("value", str5);
                b.b(null, strQ4, strT5, eVarC14, aVar18, c0235a14.b(), o0Var, 3072);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                j14 = j8;
                o0Var.C(1527505993);
                o0Var.g0(false);
            }
            f02.u.f67749a.getClass();
            gl.c cVar7 = gl.c.f77766a;
            cVar7.getClass();
            d0 d0VarA7 = d0.a(gl.c.a(o0Var).q());
            cVar7.getClass();
            p pVar6 = new p(d0VarA7, d0.a(gl.c.a(o0Var).p()));
            cVar7.getClass();
            d0 d0VarA8 = d0.a(((d0) gl.c.a(o0Var).f77764r.getF182175a()).f128833a);
            cVar7.getClass();
            p pVar7 = new p(d0VarA8, d0.a(gl.c.a(o0Var).r()));
            cVar7.getClass();
            d0 d0VarA9 = d0.a(gl.c.a(o0Var).e());
            cVar7.getClass();
            listK = p13.x.k(pVar6, pVar7, new p(d0VarA9, d0.a(gl.c.a(o0Var).d())));
            o0Var.C(-1890370931);
            it3 = cVar.iterator();
            i24 = 0;
            while (it3.hasNext()) {
                next = it3.next();
                i25 = i24 + 1;
                if (i24 < 0) {
                    p13.x.q();
                    throw null;
                }
                oVar = next;
                pVar = (p) h0.e0(i24, listK);
                if (pVar == null) {
                    list = listK;
                } else {
                    s21.n nVar6 = oVar.f14356a;
                    d17 = oVar.f14357b;
                    str9 = nVar6.f156155e;
                    String str14 = nVar6.f156152b;
                    String str15 = nVar6.f156153c;
                    b11.n.f14341e.getClass();
                    list = listK;
                    aVar4 = aVar2;
                    strB = b11.n.a.b(str14, str15, aVar4);
                    strB2 = b11.n.a.b(str14, str15, aVar4);
                    d18 = nVar6.f156154d;
                    if (d18 != null) {
                        double dDoubleValue3 = d18.doubleValue();
                        String strB7 = eVar.B(str9, d17, d18);
                        aVar2 = aVar4;
                        String strB8 = eVar.B(str9, d17, d18);
                        if (i24 >= 0) {
                            z19 = false;
                        } else {
                            z19 = false;
                        }
                        if (z19) {
                            arrayList3 = arrayList2;
                            obj = arrayList3.get(i24);
                        } else {
                            arrayList3 = arrayList2;
                            obj = "";
                        }
                        arrayList2 = arrayList3;
                        String strA3 = eVar.A(d17, d18, str9, true);
                        z3.e eVarC15 = z3.f.c(471332322, new nc1.a(oVar, pVar, dDoubleValue3, 1), o0Var);
                        a aVar19 = new a(w02.b0.x(o0Var, (int) (j14 >> 32)), (String) obj, x0VarB, null);
                        b92.a.C0235a c0235a15 = new b92.a.C0235a(null, 1, null);
                        LinkedHashMap linkedHashMap15 = c0235a15.f16962a;
                        linkedHashMap15.put("title", strB2);
                        linkedHashMap15.put("label_metadata", strB8);
                        linkedHashMap15.put("value", strA3);
                        b92.a aVarB6 = c0235a15.b();
                        int i46 = b92.a.f16960b;
                        o0 o0Var8 = o0Var;
                        b.b(null, strB, strB7, eVarC15, aVar19, aVarB6, o0Var8, 3072);
                        o0Var = o0Var8;
                    } else {
                        aVar2 = aVar4;
                    }
                    listK = list;
                    it3 = it3;
                    i24 = i25;
                }
                listK = list;
                it3 = it3;
                i24 = i25;
            }
            e5.u(o0Var, false, true, true);
            x1 x1Var9 = n.f135158a;
            z16 = z17;
            rVar2 = rVar4;
            str2 = str8;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            str2 = str;
            z16 = z14;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(rVar2, eVar, str2, uVar, f0Var, f0Var2, cVar, z16, i14, i15);
        }
    }
}
