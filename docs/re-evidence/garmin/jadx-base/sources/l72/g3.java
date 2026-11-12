package l72;

import i3.ve;

/* JADX INFO: loaded from: classes9.dex */
public final class g3 {
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    public static final void a(int i14, int i15, h4.r rVar, String str, p3.m mVar) {
        int i16;
        h4.r rVar2;
        int i17;
        boolean z14;
        h4.r rVar3;
        p3.p2 p2VarI0;
        h4.r rVar4;
        str.getClass();
        p3.o0 o0VarE = mVar.E(1557696546);
        if ((i14 & 6) == 0) {
            i16 = i14 | (o0VarE.B(str) ? 4 : 2);
        } else {
            i16 = i14;
        }
        int i18 = i15 & 2;
        if (i18 == 0) {
            if ((i14 & 48) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 32 : 16;
            }
            i17 = 18;
            if ((i16 & 19) != 18) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i18 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                p3.x1 x1Var = p3.n.f135158a;
                g6.f.a aVar = g6.f.f75994b;
                k2.h hVarA = k2.i.a(4);
                d92.b.f58623a.getClass();
                rVar3 = rVar4;
                ve.a(rVar3, hVarA, d92.b.a(o0VarE).e().g(), 0L, 0.0f, 0.0f, null, z3.f.c(2023160317, new fv1.b(str, i17), o0VarE), o0VarE, ((i16 >> 3) & 14) | 12582912, 120);
            } else {
                o0VarE.e();
                rVar3 = rVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new ba2.f(str, rVar3, i14, i15, 10);
            }
        }
        i16 |= 48;
        rVar2 = rVar;
        i17 = 18;
        if ((i16 & 19) != 18) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i18 != 0) {
                rVar4 = h4.r.S;
            } else {
                rVar4 = rVar2;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            g6.f.a aVar2 = g6.f.f75994b;
            k2.h hVarA2 = k2.i.a(4);
            d92.b.f58623a.getClass();
            rVar3 = rVar4;
            ve.a(rVar3, hVarA2, d92.b.a(o0VarE).e().g(), 0L, 0.0f, 0.0f, null, z3.f.c(2023160317, new fv1.b(str, i17), o0VarE), o0VarE, ((i16 >> 3) & 14) | 12582912, 120);
        } else {
            o0VarE.e();
            rVar3 = rVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.f(str, rVar3, i14, i15, 10);
        }
    }
}
