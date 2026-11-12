package a42;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1032a;

        static {
            int[] iArr = new int[o82.g.values().length];
            try {
                iArr[o82.g.f130849b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f1032a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(e42.b bVar, e23.a aVar, w02.b bVar2, e23.a aVar2, e23.l lVar, ky0.w wVar, p3.m mVar, int i14) {
        bVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-910130915);
        int i15 = i14 | (o0VarE.r(bVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(bVar2) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(wVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            u82.a<o82.a, d42.b> aVar3 = bVar.f62885l;
            u82.a<o82.a, q71.d> aVar4 = bVar.f62886m;
            u82.a<o82.a, q71.d> aVar5 = bVar.f62887n;
            p1 p1VarC = s9.c.c(bVar.f62882i, o0VarE);
            p1 p1VarC2 = s9.c.c(bVar.f62884k, o0VarE);
            boolean zB = o0VarE.B(p1VarC2) | ((i15 & 896) == 256);
            Object objQ = o0VarE.q();
            p3.m.a aVar6 = p3.m.f135153a;
            if (zB) {
                objQ = new a11.n(4, bVar2, p1VarC2);
                o0VarE.K(objQ);
            } else {
                aVar6.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a11.n(4, bVar2, p1VarC2);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar7 = (e23.a) objQ;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ2 = o0VarE.q();
            aVar6.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = i53.a.a(o82.g.f130849b, o82.g.f130853f, o82.g.f130854g, o82.g.f130855h);
                o0VarE.K(objQ2);
            }
            i53.f fVar = (i53.f) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new n82.f.a((o82.g) fVar.get(0), null, null, 6, null);
                o0VarE.K(objQ3);
            }
            n82.f fVarA = n82.j.a((n82.f.a) objQ3, null, o0VarE, 2);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new yd1.a(context);
                o0VarE.K(objQ4);
            }
            z02.d.a(false, z3.f.c(-1731352776, new a3.e(aVar, 2, aVar7, p1VarC2), o0VarE), null, null, null, z3.f.c(2075974580, new e0(fVar, fVarA, (yd1.a) objQ4, aVar3, aVar4, aVar5, aVar2, lVar, wVar, p1VarC, p1VarC2), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(bVar, aVar, bVar2, aVar2, lVar, wVar, i14);
        }
    }
}
