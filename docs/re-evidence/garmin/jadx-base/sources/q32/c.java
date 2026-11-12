package q32;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e23.l;
import h4.r;
import o70.t;
import ov1.q;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import po2.o;
import yz1.y;
import yz1.z;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f142437a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.M0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.N0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.O0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f142437a = iArr;
        }
    }

    public static final void a(r rVar, t tVar, String str, u4.d dVar, String str2, o32.a aVar, m mVar, int i14) {
        r rVar2;
        int i15;
        o0 o0Var;
        rVar.getClass();
        tVar.getClass();
        str.getClass();
        str2.getClass();
        o0 o0VarE = mVar.E(894376088);
        if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i15 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(tVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(dVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(str2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= (262144 & i14) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            yz1.d dVar2 = aVar != null ? aVar.f128795a : null;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new o(20);
                o0VarE.K(objQ);
            }
            String strA = oi0.c.A(context, (l) objQ, str);
            z zVar = (aVar == null || aVar.f128797c == null) ? z.EMPTY : z.VALID_DATA;
            z zVar2 = zVar;
            e eVarC = f.c(256380795, new q(aVar, 17), o0VarE);
            boolean zR = ((i15 & 112) == 32) | o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new q32.a(tVar, context, 0);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            y.c(rVar2, dVar2, str, strA, dVar, null, 0.0f, 0, null, 0.0f, null, null, null, null, eVarC, (e23.a) objQ2, zVar2, str2, null, null, o0Var, (i15 & 910) | ((i15 << 3) & 57344), ((i15 << 9) & 29360128) | 24576, 802784);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(rVar, tVar, str, dVar, str2, (Object) aVar, i14, 0);
        }
    }
}
