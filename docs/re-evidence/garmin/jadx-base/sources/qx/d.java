package qx;

import bt1.o;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mc;
import ku1.l;
import l72.w;
import o53.b0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:76:0x00f1  */
    public static final void a(mc mcVar, b0 b0Var, String str, String str2, String str3, z3.e eVar, z3.e eVar2, z3.e eVar3, m mVar, int i14) {
        int i15;
        Object obj;
        Object obj2;
        Object obj3;
        b0Var.getClass();
        str.getClass();
        o0 o0VarE = mVar.E(-1869909228);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(mcVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(b0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(str2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(str3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            obj = eVar;
            i15 |= o0VarE.r(obj) ? 131072 : 65536;
        } else {
            obj = eVar;
        }
        if ((1572864 & i14) == 0) {
            obj2 = eVar2;
            i15 |= o0VarE.r(obj2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            obj2 = eVar2;
        }
        if ((12582912 & i14) == 0) {
            obj3 = eVar3;
            i15 |= o0VarE.r(obj3) ? 8388608 : 4194304;
        } else {
            obj3 = eVar3;
        }
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = n.f135158a;
            int i16 = i15;
            w wVar = w.f111301a;
            z3.e eVarC = z3.f.c(-1763365419, new fn1.n(b0Var, mcVar, 4), o0VarE);
            boolean zR = o0VarE.r(b0Var) | ((i16 & 14) == 4);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new nw0.n(b0Var, mcVar, 5);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new nw0.n(b0Var, mcVar, 5);
                    o0VarE.K(objQ);
                }
            }
            wVar.f(str, null, null, eVarC, (e23.a) objQ, mcVar, true, null, z3.f.c(-602611349, new l(str2, str3, obj2, obj, obj3, 13), o0VarE), o0VarE, ((i16 >> 6) & 14) | 806882304 | ((i16 << 15) & 458752), 390);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(mcVar, b0Var, str, str2, str3, eVar, eVar2, eVar3, i14, 9);
        }
    }
}
