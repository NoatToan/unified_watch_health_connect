package db0;

import as.p;
import b82.f0;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import ds.e0;
import e23.l;
import h4.r;
import j23.t;
import java.util.List;
import org.joda.time.DateTimeConstants;
import p3.m;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r82.k;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:63:0x014e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0151  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f6  */
    public static final void a(r rVar, String str, String str2, int i14, int i15, l lVar, m mVar, int i16) {
        r rVar2;
        String str3;
        String str4;
        int i17;
        int i18;
        String str5;
        int i19;
        boolean z14;
        Object objQ;
        n1 n1Var;
        boolean z15;
        Object objQ2;
        int i24;
        n1 n1Var2;
        int i25;
        boolean z16;
        boolean z17;
        Object bVar;
        n1 n1Var3;
        int i26;
        p1 p1Var;
        int i27;
        i53.c cVar;
        n1 n1Var4;
        boolean zB;
        Object objQ3;
        o0 o0VarE = mVar.E(-23131125);
        int i28 = i16 | 28080 | (o0VarE.k(i15) ? 131072 : 65536) | (o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i28 & 1, (599187 & i28) != 599186)) {
            o0VarE.G0();
            if ((i16 & 1) == 0 || o0VarE.o0()) {
                str3 = "";
                i18 = 117961200;
                str5 = "";
            } else {
                o0VarE.e();
                str3 = str;
                str5 = str2;
                i18 = i14;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            if (i18 < 0 || i15 < 0 || i15 > i18) {
                h.s("Failed requirement.");
                return;
            }
            int i29 = i18 / DateTimeConstants.SECONDS_PER_HOUR;
            int i30 = (i18 % DateTimeConstants.SECONDS_PER_HOUR) / 60;
            Object objQ4 = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ4 == c2565a) {
                objQ4 = i53.a.e(new j23.l(0, i29));
                o0VarE.K(objQ4);
            }
            i53.c cVar2 = (i53.c) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.n(b(i29, 0, 0, i30, i15 / DateTimeConstants.SECONDS_PER_HOUR));
                o0VarE.K(objQ5);
            }
            p1 p1Var2 = (p1) objQ5;
            Object[] objArr = new Object[0];
            int i34 = (i28 & 458752) ^ 196608;
            if (i34 <= 131072 || !o0VarE.k(i15)) {
                i19 = i28;
                if ((i19 & 196608) != 131072) {
                    z14 = false;
                }
                objQ = o0VarE.q();
                if (z14 || objQ == c2565a) {
                    objQ = new ag0.a(cVar2, i15, 3);
                    o0VarE.K(objQ);
                }
                n1Var = (n1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 0);
                Object[] objArr2 = new Object[0];
                z15 = (i34 <= 131072 && o0VarE.k(i15)) || (i19 & 196608) == 131072;
                objQ2 = o0VarE.q();
                if (!z15 || objQ2 == c2565a) {
                    i24 = 0;
                    objQ2 = new a(i15, p1Var2, 0);
                    o0VarE.K(objQ2);
                } else {
                    i24 = 0;
                }
                n1Var2 = (n1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, i24);
                int intValue = n1Var.getIntValue();
                z3.e eVarC = z3.f.c(-743546111, new p(str3, 14), o0VarE);
                boolean zB2 = o0VarE.B(n1Var) | o0VarE.k(i29) | o0VarE.k(0) | o0VarE.k(0) | o0VarE.k(i30) | o0VarE.B(n1Var2);
                i25 = i19 & 3670016;
                if (i25 == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zB2 | z16;
                Object objQ6 = o0VarE.q();
                if (!z17 || objQ6 == c2565a) {
                    int i35 = i18;
                    n1Var3 = n1Var;
                    i26 = i35;
                    p1Var = p1Var2;
                    bVar = new b(n1Var3, cVar2, lVar, p1Var, i29, 0, 0, i30, n1Var2);
                    i27 = 0;
                    cVar = cVar2;
                    i30 = i30;
                    n1Var4 = n1Var2;
                    o0VarE.K(bVar);
                } else {
                    int i36 = i18;
                    n1Var3 = n1Var;
                    i26 = i36;
                    n1Var4 = n1Var2;
                    cVar = cVar2;
                    bVar = objQ6;
                    p1Var = p1Var2;
                    i27 = 0;
                }
                r82.p pVar = new r82.p(cVar, intValue, null, null, eVarC, 0.0f, false, false, null, null, (l) bVar, 1004, null);
                i53.c cVar3 = (i53.c) p1Var.getF182175a();
                int intValue2 = n1Var4.getIntValue();
                z3.e eVarC2 = z3.f.c(-1711507040, new p(str5, 15), o0VarE);
                zB = o0VarE.B(n1Var4) | o0VarE.k(i29) | o0VarE.k(i27) | o0VarE.k(0) | o0VarE.k(i30) | o0VarE.B(n1Var3) | (i25 == 1048576);
                objQ3 = o0VarE.q();
                if (zB || objQ3 == c2565a) {
                    objQ3 = new b(n1Var4, cVar, lVar, p1Var, n1Var3, i29, i27, 0, i30);
                    o0VarE.K(objQ3);
                }
                i53.f fVarA = i53.a.a(pVar, new r82.p(cVar3, intValue2, null, null, eVarC2, 0.0f, false, false, null, null, (l) objQ3, 1004, null));
                rVar2 = rVar;
                k.c(rVar2, fVarA, o0VarE, 6, 0);
                i17 = i26;
                str4 = str5;
            } else {
                i19 = i28;
            }
            z14 = true;
            objQ = o0VarE.q();
            if (z14) {
                objQ = new ag0.a(cVar2, i15, 3);
                o0VarE.K(objQ);
            } else {
                objQ = new ag0.a(cVar2, i15, 3);
                o0VarE.K(objQ);
            }
            n1Var = (n1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 0);
            Object[] objArr3 = new Object[0];
            if (i34 <= 131072) {
            }
            objQ2 = o0VarE.q();
            if (z15) {
                i24 = 0;
                objQ2 = new a(i15, p1Var2, 0);
                o0VarE.K(objQ2);
            } else {
                i24 = 0;
                objQ2 = new a(i15, p1Var2, 0);
                o0VarE.K(objQ2);
            }
            n1Var2 = (n1) d4.a.e(objArr3, (e23.a) objQ2, o0VarE, i24);
            int intValue3 = n1Var.getIntValue();
            z3.e eVarC3 = z3.f.c(-743546111, new p(str3, 14), o0VarE);
            boolean zB3 = o0VarE.B(n1Var) | o0VarE.k(i29) | o0VarE.k(0) | o0VarE.k(0) | o0VarE.k(i30) | o0VarE.B(n1Var2);
            i25 = i19 & 3670016;
            if (i25 == 1048576) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = zB3 | z16;
            Object objQ7 = o0VarE.q();
            if (z17) {
                int i37 = i18;
                n1Var3 = n1Var;
                i26 = i37;
                p1Var = p1Var2;
                bVar = new b(n1Var3, cVar2, lVar, p1Var, i29, 0, 0, i30, n1Var2);
                i27 = 0;
                cVar = cVar2;
                i30 = i30;
                n1Var4 = n1Var2;
                o0VarE.K(bVar);
            } else {
                int i38 = i18;
                n1Var3 = n1Var;
                i26 = i38;
                p1Var = p1Var2;
                bVar = new b(n1Var3, cVar2, lVar, p1Var, i29, 0, 0, i30, n1Var2);
                i27 = 0;
                cVar = cVar2;
                i30 = i30;
                n1Var4 = n1Var2;
                o0VarE.K(bVar);
            }
            r82.p pVar2 = new r82.p(cVar, intValue3, null, null, eVarC3, 0.0f, false, false, null, null, (l) bVar, 1004, null);
            i53.c cVar4 = (i53.c) p1Var.getF182175a();
            int intValue4 = n1Var4.getIntValue();
            z3.e eVarC4 = z3.f.c(-1711507040, new p(str5, 15), o0VarE);
            zB = o0VarE.B(n1Var4) | o0VarE.k(i29) | o0VarE.k(i27) | o0VarE.k(0) | o0VarE.k(i30) | o0VarE.B(n1Var3) | (i25 == 1048576);
            objQ3 = o0VarE.q();
            if (zB) {
                objQ3 = new b(n1Var4, cVar, lVar, p1Var, n1Var3, i29, i27, 0, i30);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new b(n1Var4, cVar, lVar, p1Var, n1Var3, i29, i27, 0, i30);
                o0VarE.K(objQ3);
            }
            i53.f fVarA2 = i53.a.a(pVar2, new r82.p(cVar4, intValue4, null, null, eVarC4, 0.0f, false, false, null, null, (l) objQ3, 1004, null));
            rVar2 = rVar;
            k.c(rVar2, fVarA2, o0VarE, 6, 0);
            i17 = i26;
            str4 = str5;
        } else {
            rVar2 = rVar;
            o0VarE.e();
            str3 = str;
            str4 = str2;
            i17 = i14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(rVar2, str3, str4, i17, i15, lVar, i16);
        }
    }

    public static final i53.c<Integer> b(int i14, int i15, int i16, int i17, int i18) {
        if (i14 == i15) {
            return e0.h(i16, i17);
        }
        if (i18 == i14) {
            return e0.h(0, i17);
        }
        return i18 == i15 ? e0.h(i16, 59) : e0.h(0, 59);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(n1 n1Var, i53.c cVar, l lVar, p1 p1Var, int i14, int i15, int i16, int i17, n1 n1Var2) {
        i53.c cVar2 = (i53.c) p1Var.getF182175a();
        p1Var.setValue(b(i14, i15, i16, i17, ((Number) cVar.get(n1Var.getIntValue())).intValue()));
        n1Var2.t(d(((Number) cVar2.get(n1Var2.getIntValue())).intValue(), (i53.c) p1Var.getF182175a()));
        lVar.invoke(Integer.valueOf((((Number) ((i53.c) p1Var.getF182175a()).get(n1Var2.getIntValue())).intValue() * 60) + (((Number) cVar.get(n1Var.getIntValue())).intValue() * DateTimeConstants.SECONDS_PER_HOUR)));
    }

    public static final int d(int i14, List list) {
        return t.e(list.indexOf(Integer.valueOf(i14)), 0, list.size() - 1);
    }
}
