package nf1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e23.l;
import g22.k;
import h4.r;
import n82.n;
import o53.b0;
import org.joda.time.LocalDate;
import p3.l0;
import p3.m;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125895a;

        static {
            int[] iArr = new int[t82.f.values().length];
            try {
                iArr[t82.f.BACKWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t82.f.FORWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f125895a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, n nVar, o82.a aVar, o82.g gVar, m mVar, int i14) {
        o82.g gVar2;
        String strA;
        aVar.getClass();
        gVar.getClass();
        o0 o0VarE = mVar.E(-1780873427);
        int i15 = i14 | (o0VarE.B(nVar) ? 32 : 16) | (o0VarE.B(aVar) ? 256 : 128) | (o0VarE.k(gVar.ordinal()) ? 2048 : 1024) | 24576;
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarB = nVar.b(o0VarE, (i15 >> 3) & 14);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            yd1.a aVar2 = new yd1.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            if (aVar.f130844b.compareTo(k.t(new LocalDate())) > 0) {
                gVar2 = gVar;
                strA = aVar2.a(new n82.d(new o82.a(aVar.f130843a, k.t(new LocalDate())), gVar2));
            } else {
                gVar2 = gVar;
                strA = ((q82.b.a) p1VarB.getF182175a()).f143362a;
            }
            boolean z14 = false;
            t82.e eVar = new t82.e(!((q82.b.a) p1VarB.getF182175a()).f143363b, !((q82.b.a) p1VarB.getF182175a()).f143364c);
            if ((i15 & 112) == 32) {
                z14 = true;
            }
            boolean zB = o0VarE.B(b0Var) | z14;
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new ml0.e(17, b0Var, nVar);
                o0VarE.K(objQ2);
            }
            int i16 = b92.a.f16960b;
            t82.d.b(rVar, strA, eVar, null, (l) objQ2, o0VarE, 3078);
        } else {
            gVar2 = gVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new na0.a(rVar, nVar, aVar, gVar2, i14);
        }
    }
}
