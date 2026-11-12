package ic1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import et.p;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92628a;

        static {
            int[] iArr = new int[o82.g.values().length];
            try {
                iArr[o82.g.f130850c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o82.g.f130851d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o82.g.f130853f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f92628a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(m mVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.l<? super DateTime, Unit> lVar, p3.m mVar2, int i14) {
        mVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        o0 o0VarE = mVar2.E(1753080791);
        int i15 = i14 | (o0VarE.r(mVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(mVar.f92630b, o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                n82.f.a aVar3 = new n82.f.a(((n) p1VarC.getF182175a()).f92640b, null, ((n) p1VarC.getF182175a()).f92639a, 2, null);
                o0VarE.K(aVar3);
                objQ = aVar3;
            }
            n82.f fVarA = n82.j.a((n82.f.a) objQ, null, o0VarE, 2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = i53.a.a(o82.g.f130850c, o82.g.f130851d, o82.g.f130853f);
                o0VarE.K(objQ2);
            }
            i53.f fVar = (i53.f) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new yd1.a(context);
                o0VarE.K(objQ3);
            }
            z02.d.a(false, z3.f.c(1699184882, new at1.f(aVar, aVar2, 22), o0VarE), null, null, null, z3.f.c(1552015726, new p(fVar, fVarA, (yd1.a) objQ3, mVar, lVar, 25), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g52.d(mVar, aVar, aVar2, lVar, i14, 24);
        }
    }
}
