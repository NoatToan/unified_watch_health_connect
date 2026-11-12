package p008y1;

import androidx.compose.foundation.gestures.AnchoredDragFinishedSignal;
import e23.l;
import e23.p;
import g6.f;
import lc.u0;
import o13.r;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import p005kotlin.jvm.internal.s;
import s1.h0;
import s1.k;
import s1.q1;
import s1.y;
import s1.z;
import u1.k1;
import v13.c;
import v13.i;
import xd2.m0;
import xm0.h;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f193170a = new m0(25);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m0 f193171b = new m0(26);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f193172c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y1/e$a", "Ls1/h0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements h0 {
        @Override // s1.h0
        /* JADX INFO: renamed from: a */
        public final float getF155595a() {
            return 0.0f;
        }

        @Override // s1.h0
        public final long b(float f14) {
            return 0L;
        }

        @Override // s1.h0
        public final float c(float f14, float f15) {
            return 0.0f;
        }

        @Override // s1.h0
        public final float d(float f14, long j8) {
            return 0.0f;
        }

        @Override // s1.h0
        public final float e(float f14, float f15, long j8) {
            return 0.0f;
        }
    }

    static {
        f.a aVar = f.f75994b;
        f193172c = new z(new a());
    }

    public static final Object a(r rVar, float f14, p008y1.a aVar, w0 w0Var, Object obj, k kVar, i iVar) {
        Object objA;
        float fC = w0Var.c(obj);
        o0 o0Var = new o0();
        o0Var.f105806a = Float.isNaN(rVar.f193588j.getFloatValue()) ? 0.0f : rVar.f193588j.getFloatValue();
        if (!Float.isNaN(fC)) {
            float f15 = o0Var.f105806a;
            if (f15 != fC && (objA = q1.a(f15, fC, f14, kVar, new h(12, aVar, o0Var), iVar)) == u13.a.COROUTINE_SUSPENDED) {
                return objA;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[RETURN] */
    public static final Object b(w0 w0Var, float f14, float f15, l lVar, e23.a aVar) {
        if (Float.isNaN(f14)) {
            vb.h.s("The offset provided to computeTarget must not be NaN.");
            return null;
        }
        boolean z14 = Math.abs(f15) > 0.0f;
        boolean z15 = z14 && f15 > 0.0f;
        if (!z14) {
            Object objA = w0Var.a(f14);
            objA.getClass();
            return objA;
        }
        if (Math.abs(f15) >= Math.abs(((Number) aVar.invoke()).floatValue())) {
            Object objB = w0Var.b(f14, z15);
            objB.getClass();
            return objB;
        }
        Object objB2 = w0Var.b(f14, false);
        objB2.getClass();
        float fC = w0Var.c(objB2);
        Object objB3 = w0Var.b(f14, true);
        objB3.getClass();
        float fC2 = w0Var.c(objB3);
        float fAbs = Math.abs(((Number) lVar.invoke(Float.valueOf(Math.abs(fC - fC2)))).floatValue());
        if (!z15) {
            fC = fC2;
        }
        boolean z16 = Math.abs(fC - f14) >= fAbs;
        if (z16) {
            if (z15) {
                return objB3;
            }
            return objB2;
        }
        if (z16) {
            u0.r();
            return null;
        }
        if (z15) {
            return objB2;
        }
        return objB3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(e23.a aVar, p pVar, c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f193269b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f193269b = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(cVar);
            }
        } else {
            iVar = new i(cVar);
        }
        Object obj = iVar.f193268a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f193269b;
        try {
            if (i15 == 0) {
                r.b(obj);
                j jVar = new j(aVar, pVar, null);
                iVar.f193269b = 1;
                if (c0.e(jVar, iVar) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return Unit.INSTANCE;
    }

    public static h4.r d(h4.r rVar, r rVar2, b2 b2Var, boolean z14, t3 t3Var) {
        return rVar.then(new c(rVar2, b2Var, z14, null, null, null, null, t3Var, 32, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object e(r rVar, Object obj, float f14, k kVar, y yVar, c cVar) {
        g gVar;
        float f15;
        o0 o0Var;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f193209d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f193209d = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(cVar);
            }
        } else {
            gVar = new g(cVar);
        }
        g gVar2 = gVar;
        Object obj2 = gVar2.f193208c;
        Object obj3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar2.f193209d;
        if (i15 == 0) {
            r.b(obj2);
            o0 o0Var2 = new o0();
            o0Var2.f105806a = f14;
            e23.r hVar = new h(rVar, f14, kVar, o0Var2, yVar, null);
            gVar2.f193207b = o0Var2;
            gVar2.f193206a = f14;
            gVar2.f193209d = 1;
            int i16 = r.f193578o;
            if (rVar.a(obj, k1.Default, hVar, gVar2) == obj3) {
                return obj3;
            }
            f15 = f14;
            o0Var = o0Var2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f15 = gVar2.f193206a;
            o0Var = gVar2.f193207b;
            r.b(obj2);
        }
        return new Float(f15 - o0Var.f105806a);
    }

    public static Object f(r rVar, Object obj, float f14, n nVar) {
        k kVar;
        y yVar;
        if (rVar.c()) {
            kVar = rVar.f193582d;
            if (kVar == null) {
                s.m("snapAnimationSpec");
                throw null;
            }
        } else {
            b.f193089a.getClass();
            kVar = b.f193090b;
        }
        k kVar2 = kVar;
        if (rVar.c()) {
            yVar = rVar.f193583e;
            if (yVar == null) {
                s.m("decayAnimationSpec");
                throw null;
            }
        } else {
            b.f193089a.getClass();
            yVar = b.f193092d;
        }
        return e(rVar, obj, f14, kVar2, yVar, nVar);
    }
}
