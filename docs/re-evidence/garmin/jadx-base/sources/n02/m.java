package n02;

import b82.o;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import ds.e0;
import h4.r;
import j23.t;
import p13.h0;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r82.p;

/* JADX INFO: loaded from: classes10.dex */
public final class m {
    public static final void a(r rVar, String str, String str2, String str3, String str4, int i14, int i15, int i16, e23.l lVar, p3.m mVar, int i17) {
        r rVar2;
        String str5;
        String str6;
        r rVar3;
        String str7;
        int i18;
        String str8;
        Object lVar2;
        p1 p1Var;
        p1 p1Var2;
        n1 n1Var;
        int i19;
        int i24;
        int i25;
        n1 n1Var2;
        o0 o0VarE = mVar.E(-1529435170);
        int i26 = i17 | 182 | (o0VarE.B(str3) ? 2048 : 1024) | (o0VarE.B(str4) ? 16384 : 8192) | (o0VarE.k(i14) ? 131072 : 65536) | (o0VarE.k(i15) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.k(i16) ? 8388608 : 4194304) | (o0VarE.r(lVar) ? 67108864 : 33554432);
        if (o0VarE.n(i26 & 1, (38347923 & i26) != 38347922)) {
            o0VarE.G0();
            if ((i17 & 1) == 0 || o0VarE.o0()) {
                rVar3 = r.S;
                str7 = ":";
                i18 = i26 & (-897);
                str8 = ":";
            } else {
                o0VarE.e();
                rVar3 = rVar;
                str7 = str2;
                i18 = i26 & (-897);
                str8 = str;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            if (i14 > i15 || i14 > i16 || i16 > i15) {
                vb.h.s("Failed requirement.");
                return;
            }
            int i27 = i14 / 60;
            int i28 = i15 / 60;
            int i29 = i14 % 60;
            int i30 = i15 % 60;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(i53.a.e(new j23.l(i27, i28)));
                o0VarE.K(objQ);
            }
            p1 p1Var3 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(c(i27, i28, i29, i30, i16 / 60));
                o0VarE.K(objQ2);
            }
            p1 p1Var4 = (p1) objQ2;
            int i34 = i18;
            Object[] objArr = new Object[0];
            int i35 = (i34 & 29360128) ^ 12582912;
            r rVar4 = rVar3;
            boolean z14 = (i35 > 8388608 && o0VarE.k(i16)) || (i34 & 12582912) == 8388608;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new db0.a(i16, p1Var3, 1);
                o0VarE.K(objQ3);
            }
            n1 n1Var3 = (n1) d4.a.e(objArr, (e23.a) objQ3, o0VarE, 0);
            Object[] objArr2 = new Object[0];
            boolean z15 = (i35 > 8388608 && o0VarE.k(i16)) || (i34 & 12582912) == 8388608;
            Object objQ4 = o0VarE.q();
            if (z15 || objQ4 == c2565a) {
                objQ4 = new db0.a(i16, p1Var4, 2);
                o0VarE.K(objQ4);
            }
            n1 n1Var4 = (n1) d4.a.e(objArr2, (e23.a) objQ4, o0VarE, 0);
            i53.c cVar = (i53.c) p1Var3.getF182175a();
            int intValue = n1Var3.getIntValue();
            z3.e eVarC = z3.f.c(-2120467911, new o(str7, str8, 23), o0VarE);
            int i36 = i34 & 234881024;
            String str9 = str8;
            boolean zB = (i36 == 67108864) | o0VarE.B(n1Var3) | o0VarE.k(i27) | o0VarE.k(i28) | o0VarE.k(i29) | o0VarE.k(i30) | o0VarE.B(n1Var4);
            Object objQ5 = o0VarE.q();
            if (zB || objQ5 == c2565a) {
                p1Var = p1Var3;
                p1Var2 = p1Var4;
                lVar2 = new l(n1Var3, lVar, p1Var2, p1Var, i27, i28, i29, i30, n1Var4);
                n1Var = n1Var3;
                i19 = i27;
                i24 = i28;
                i25 = i29;
                i30 = i30;
                n1Var2 = n1Var4;
                o0VarE.K(lVar2);
            } else {
                i25 = i29;
                p1Var = p1Var3;
                i19 = i27;
                i24 = i28;
                p1Var2 = p1Var4;
                n1Var2 = n1Var4;
                lVar2 = objQ5;
                n1Var = n1Var3;
            }
            p pVar = new p(cVar, intValue, null, null, eVarC, 0.0f, false, false, null, null, (e23.l) lVar2, 1004, null);
            i53.c cVar2 = (i53.c) p1Var2.getF182175a();
            int intValue2 = n1Var2.getIntValue();
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = new mi0.i(20);
                o0VarE.K(objQ6);
            }
            e23.l lVar3 = (e23.l) objQ6;
            String str10 = str7;
            z3.e eVarC2 = z3.f.c(-83220519, new o(str4, str3, 24), o0VarE);
            n1 n1Var5 = n1Var2;
            boolean zB2 = o0VarE.B(n1Var5) | o0VarE.k(i19) | o0VarE.k(i24) | o0VarE.k(i25) | o0VarE.k(i30) | o0VarE.B(n1Var) | (i36 == 67108864);
            Object objQ7 = o0VarE.q();
            if (zB2 || objQ7 == c2565a) {
                l lVar4 = new l(n1Var5, lVar, p1Var2, p1Var, n1Var, i19, i24, i25, i30);
                o0VarE.K(lVar4);
                objQ7 = lVar4;
            }
            r82.k.c(rVar4, i53.a.a(pVar, new p(cVar2, intValue2, lVar3, null, eVarC2, 0.0f, false, false, null, null, (e23.l) objQ7, 1000, null)), o0VarE, 6, 0);
            str5 = str9;
            rVar2 = rVar4;
            str6 = str10;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            str5 = str;
            str6 = str2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fx0.l(rVar2, str5, str6, str3, str4, i14, i15, i16, lVar, i17);
        }
    }

    public static final int b(i53.c cVar, int i14) {
        Integer num = (Integer) h0.d0(cVar);
        int iIntValue = num != null ? num.intValue() : i14;
        Integer num2 = (Integer) h0.n0(cVar);
        int iIndexOf = cVar.indexOf(Integer.valueOf(t.e(i14, iIntValue, num2 != null ? num2.intValue() : i14)));
        if (iIndexOf < 0) {
            return 0;
        }
        return iIndexOf;
    }

    public static final i53.c<Integer> c(int i14, int i15, int i16, int i17, int i18) {
        if (i14 == i15) {
            return e0.h(i16, i17);
        }
        if (i18 == i15) {
            return e0.h(0, i17);
        }
        return i18 == i14 ? e0.h(i16, 59) : e0.h(0, 59);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(n1 n1Var, e23.l lVar, p1 p1Var, p1 p1Var2, int i14, int i15, int i16, int i17, n1 n1Var2) {
        i53.c cVar = (i53.c) p1Var.getF182175a();
        p1Var.setValue(c(i14, i15, i16, i17, ((Number) ((i53.c) p1Var2.getF182175a()).get(n1Var.getIntValue())).intValue()));
        i53.c cVar2 = (i53.c) p1Var.getF182175a();
        Integer num = (Integer) h0.e0(n1Var2.getIntValue(), cVar);
        n1Var2.t(b(cVar2, num != null ? num.intValue() : ((Number) h0.b0(cVar)).intValue()));
        lVar.invoke(Integer.valueOf(((Number) ((i53.c) p1Var.getF182175a()).get(n1Var2.getIntValue())).intValue() + (((Number) ((i53.c) p1Var2.getF182175a()).get(n1Var.getIntValue())).intValue() * 60)));
    }
}
