package c70;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import g22.k;
import n82.j;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25229a;

        static {
            int[] iArr = new int[o82.g.values().length];
            try {
                iArr[o82.g.f130849b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o82.g.f130853f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o82.g.f130854g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o82.g.f130856i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f25229a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(i iVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0Var;
        iVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(950528229);
        int i15 = i14 | (o0VarE.r(iVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(iVar.f25235d, o0VarE);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                n82.f.a aVar3 = new n82.f.a(((h) p1VarC.getF182175a()).f25231b, null, k.z(((h) p1VarC.getF182175a()).f25230a).b(), 2, null);
                o0VarE.K(aVar3);
                objQ = aVar3;
            }
            n82.f fVarA = j.a((n82.f.a) objQ, null, o0VarE, 2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = i53.a.a(o82.g.f130849b, o82.g.f130853f, o82.g.f130854g, o82.g.f130856i);
                o0VarE.K(objQ2);
            }
            i53.f fVar = (i53.f) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new yd1.a(context);
                o0VarE.K(objQ3);
            }
            o0Var = o0VarE;
            z02.b.a(false, null, null, null, false, z3.f.c(-1598036369, new a42.c((e23.a) aVar, (e23.a) aVar2, (Object) fVar, (Object) fVarA, objQ3, (Object) iVar, 11), o0VarE), o0Var, 196608, 31);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c50.f(iVar, aVar, aVar2, i14, 3);
        }
    }
}
