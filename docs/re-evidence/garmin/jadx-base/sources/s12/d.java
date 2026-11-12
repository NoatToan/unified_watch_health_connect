package s12;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i3.u;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155946a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f155927i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f155930l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f155929k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f155946a = iArr;
        }
    }

    public static final void a(boolean z14, e23.a<Unit> aVar, n nVar, p3.m mVar, int i14) {
        int i15;
        Object obj;
        o0 o0Var;
        aVar.getClass();
        o0 o0VarE = mVar.E(203357808);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            obj = aVar;
            i15 |= o0VarE.r(obj) ? 32 : 16;
        } else {
            obj = aVar;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(nVar) : o0VarE.r(nVar) ? 256 : 128;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            o0Var = o0VarE;
            u.a(z14, aVar, null, 0L, null, null, null, am.j.A(d92.b.f58623a, o0VarE), 0.0f, 0.0f, z3.f.c(376227755, new mw0.h(nVar, obj, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), (p1) objQ, 15), o0VarE), o0Var, i16 & 126, 48, 1916);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(z14, aVar, nVar, i14, 19);
        }
    }
}
