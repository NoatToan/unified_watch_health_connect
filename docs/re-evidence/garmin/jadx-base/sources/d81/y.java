package d81;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ca0.j1;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class y {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58371a;

        static {
            int[] iArr = new int[o82.g.values().length];
            try {
                iArr[o82.g.f130850c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o82.g.f130854g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f58371a = iArr;
        }
    }

    public static final void a(i81.a aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1553774854);
        int i15 = 2;
        int i16 = (o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.r(aVar2) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = i53.a.a(o82.g.f130850c, o82.g.f130854g, o82.g.f130856i);
                o0VarE.K(objQ);
            }
            i53.f fVar = (i53.f) objQ;
            boolean zB = o0VarE.B(aVar);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new j1(25, aVar, context);
                o0VarE.K(objQ2);
            }
            z02.d.a(false, z3.f.c(1664908693, new c50.f(aVar, 21, aVar2, context), o0VarE), null, null, null, z3.f.c(-1747350511, new d50.i((Object) fVar, (Object) context, (Object) aVar, (o13.h) objQ2, 2), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(aVar, aVar2, i14, i15);
        }
    }
}
