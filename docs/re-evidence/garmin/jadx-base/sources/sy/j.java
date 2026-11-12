package sy;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.o;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f161179a;

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
            try {
                iArr[o82.g.f130856i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f161179a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(k kVar, e23.a<Unit> aVar, e23.l<? super b, Unit> lVar, p3.m mVar, int i14) {
        o0 o0Var;
        kVar.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1329638214);
        int i15 = (o0VarE.r(kVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(kVar.f161186g, o0VarE);
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            o oVarB = g22.k.z(dateTimeNow).b();
            o.INSTANCE.getClass();
            o oVarA = o.Companion.a(0);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                n82.f.a aVar2 = new n82.f.a(((l) p1VarC.getF182175a()).f161197b, null, g22.k.z(((l) p1VarC.getF182175a()).f161196a).b(), 2, null);
                o0VarE.K(aVar2);
                objQ = aVar2;
            }
            n82.f fVarA = n82.j.a((n82.f.a) objQ, null, o0VarE, 2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new yd1.a(context);
                o0VarE.K(objQ2);
            }
            yd1.a aVar3 = (yd1.a) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new sy.a(context);
                o0VarE.K(objQ3);
            }
            sy.a aVar4 = (sy.a) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = i53.a.a(o82.g.f130850c, o82.g.f130851d, o82.g.f130853f, o82.g.f130856i);
                o0VarE.K(objQ4);
            }
            z3.e eVarC = z3.f.c(-1118820656, new c42.d(aVar, lVar, kVar, (i53.f) objQ4, fVarA, oVarA, oVarB, aVar3, aVar4), o0VarE);
            o0Var = o0VarE;
            z02.b.a(false, null, null, null, false, eVarC, o0Var, 196608, 31);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(kVar, aVar, lVar, i14);
        }
    }
}
