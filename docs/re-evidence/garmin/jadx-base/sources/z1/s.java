package z1;

import java.util.concurrent.CancellationException;
import kotlin.t1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import p008y1.o2;
import p008y1.t3;
import p3.x1;
import r1.n2;
import s1.q1;
import s1.y;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f200874a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f200874a = 400;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(o2 o2Var, float f14, s1.m mVar, y yVar, e23.l lVar, v13.c cVar) {
        q qVar;
        float f15;
        o0 o0Var;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f200867e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f200867e = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(cVar);
            }
        } else {
            qVar = new q(cVar);
        }
        Object obj = qVar.f200866d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f200867e;
        if (i15 == 0) {
            o13.r.b(obj);
            o0 o0Var2 = new o0();
            boolean z14 = ((Number) mVar.a()).floatValue() == 0.0f;
            p pVar = new p(f14, o0Var2, o2Var, lVar, 0);
            qVar.f200864b = mVar;
            qVar.f200865c = o0Var2;
            qVar.f200863a = f14;
            qVar.f200867e = 1;
            if (q1.d(mVar, yVar, !z14, pVar, qVar) == aVar) {
                return aVar;
            }
            f15 = f14;
            o0Var = o0Var2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f15 = qVar.f200863a;
            o0Var = qVar.f200865c;
            mVar = qVar.f200864b;
            o13.r.b(obj);
        }
        return new a(new Float(f15 - o0Var.f105806a), mVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object b(o2 o2Var, float f14, float f15, s1.m mVar, s1.k kVar, e23.l lVar, v13.c cVar) {
        r rVar;
        float fFloatValue;
        s1.m mVar2;
        o0 o0Var;
        float f16 = f14;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f200873f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f200873f = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(cVar);
            }
        } else {
            rVar = new r(cVar);
        }
        r rVar2 = rVar;
        Object obj = rVar2.f200872e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar2.f200873f;
        if (i15 == 0) {
            o13.r.b(obj);
            o0 o0Var2 = new o0();
            fFloatValue = ((Number) mVar.a()).floatValue();
            Float f17 = new Float(f16);
            boolean z14 = ((Number) mVar.a()).floatValue() == 0.0f;
            p pVar = new p(f15, o0Var2, o2Var, lVar, 1);
            rVar2.f200870c = mVar;
            rVar2.f200871d = o0Var2;
            rVar2.f200868a = f16;
            rVar2.f200869b = fFloatValue;
            rVar2.f200873f = 1;
            if (q1.e(mVar, f17, kVar, !z14, pVar, rVar2) == aVar) {
                return aVar;
            }
            mVar2 = mVar;
            o0Var = o0Var2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            float f18 = rVar2.f200869b;
            float f19 = rVar2.f200868a;
            o0Var = rVar2.f200871d;
            mVar2 = rVar2.f200870c;
            o13.r.b(obj);
            fFloatValue = f18;
            f16 = f19;
        }
        return new a(new Float(f16 - o0Var.f105806a), s1.v.d(mVar2, 0.0f, d(((Number) mVar2.a()).floatValue(), fFloatValue), 29));
    }

    public static final void c(s1.j<Float, s1.n> jVar, o2 o2Var, e23.l<? super Float, Unit> lVar, float f14) {
        float f15;
        try {
            f15 = o2Var.f(f14);
        } catch (CancellationException unused) {
            jVar.a();
            f15 = 0.0f;
        }
        lVar.invoke(Float.valueOf(f15));
        if (Math.abs(f14 - f15) > 0.5f) {
            jVar.a();
        }
    }

    public static final float d(float f14, float f15) {
        if (f15 == 0.0f) {
            return 0.0f;
        }
        return (f15 <= 0.0f ? f14 >= f15 : f14 <= f15) ? f14 : f15;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002b  */
    public static final t3 e(t tVar, p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        Object obj = (g6.c) mVar.A(t1.f91490h);
        y yVarA = n2.a(mVar);
        boolean zB = mVar.B(obj) | mVar.B(tVar) | mVar.B(yVarA);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new o(tVar, yVarA, s1.l.c(5, 0.0f, 400.0f, null));
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new o(tVar, yVarA, s1.l.c(5, 0.0f, 400.0f, null));
                mVar.K(objQ);
            }
        }
        return (t3) objQ;
    }
}
