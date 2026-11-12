package z41;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.w;
import c22.l3;
import cw1.y0;
import java.text.DecimalFormat;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import ta0.g0;

/* JADX INFO: loaded from: classes9.dex */
public final class q {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final t41.f fVar, final double d14, final n02.g gVar, final e23.a<Unit> aVar, final e23.q<? super t41.f, ? super Double, ? super n02.g, Unit> qVar, p3.m mVar, final int i14) {
        p1 p1Var;
        int i15;
        n02.g gVar2;
        p1 p1Var2;
        fVar.getClass();
        gVar.getClass();
        aVar.getClass();
        qVar.getClass();
        o0 o0VarE = mVar.E(-1764095671);
        int i16 = i14 | (o0VarE.k(fVar.ordinal()) ? 4 : 2) | (o0VarE.m(d14) ? 32 : 16) | (o0VarE.k(gVar.ordinal()) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(qVar) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new j(3);
                o0VarE.K(objQ);
            }
            p1 p1Var3 = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            boolean z14 = (i16 & 14) == 4;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new yr.o0(fVar, 11);
                o0VarE.K(objQ2);
            }
            p1 p1Var4 = (p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 0);
            Object[] objArr3 = new Object[0];
            boolean z15 = (i16 & 112) == 32;
            Object objQ3 = o0VarE.q();
            if (z15 || objQ3 == c2565a) {
                objQ3 = new y0(d14, 1);
                o0VarE.K(objQ3);
            }
            p1 p1Var5 = (p1) d4.a.e(objArr3, (e23.a) objQ3, o0VarE, 0);
            Object[] objArr4 = new Object[0];
            boolean z16 = (i16 & 896) == 256;
            Object objQ4 = o0VarE.q();
            if (z16 || objQ4 == c2565a) {
                objQ4 = new yr.o0(gVar, 12);
                o0VarE.K(objQ4);
            }
            p1 p1Var6 = (p1) d4.a.e(objArr4, (e23.a) objQ4, o0VarE, 0);
            n02.g gVarValueOf = n02.g.valueOf((String) p1Var6.getF182175a());
            double dDoubleValue = ((Number) p1Var5.getF182175a()).doubleValue();
            boolean zB = o0VarE.B((String) p1Var6.getF182175a()) | o0VarE.m(dDoubleValue);
            Object objQ5 = o0VarE.q();
            if (zB || objQ5 == c2565a) {
                l3.a aVar2 = l3.f23124b;
                double dB = gVarValueOf.b(((Number) p1Var5.getF182175a()).doubleValue());
                boolean z17 = gVarValueOf == n02.g.KILOMETERS;
                DecimalFormat decimalFormat = l3.f23125c;
                aVar2.getClass();
                objQ5 = p0.n(l3.a.Q(context, dB, decimalFormat, true, z17));
                o0VarE.K(objQ5);
            }
            p1 p1Var7 = (p1) objQ5;
            boolean zB2 = ((i16 & 7168) == 2048) | ((57344 & i16) == 16384) | o0VarE.B(p1Var4) | o0VarE.B(p1Var5) | o0VarE.k(gVarValueOf.ordinal());
            Object objQ6 = o0VarE.q();
            if (zB2 || objQ6 == c2565a) {
                p1Var = p1Var5;
                i15 = 1;
                p50.d dVar = new p50.d((Object) qVar, (Object) gVarValueOf, (Object) aVar, (Object) p1Var4, (Object) p1Var, 21);
                gVar2 = gVarValueOf;
                p1Var2 = p1Var4;
                o0VarE.K(dVar);
                objQ6 = dVar;
            } else {
                p1Var2 = p1Var4;
                p1Var = p1Var5;
                gVar2 = gVarValueOf;
                i15 = 1;
            }
            w.a(0, i15, (e23.a) objQ6, o0VarE, false);
            c.f202336a.getClass();
            z02.d.a(false, c.f202337b, null, null, null, z3.f.c(7853728, new g0(p1Var, p1Var6, p1Var2, p1Var3, p1Var7, gVar2, 27), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(d14, gVar, aVar, qVar, i14) { // from class: z41.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ double f202364b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ n02.g f202365c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ e23.a f202366d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.q f202367e;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    q.a(this.f202363a, this.f202364b, this.f202365c, this.f202366d, this.f202367e, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
