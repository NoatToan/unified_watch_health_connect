package sg2;

import c2.t;
import c2.u;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import f5.z0;
import h5.e0;
import lc.u0;
import o4.d0;
import o4.s0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import rk0.a1;
import s1.b2;
import s1.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.dashboard.workoutcards.BreathworkLottieAnimationViewKt$Glow$1$1", f = "BreathworkLottieAnimationView.kt", l = {84}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f159220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s1.b<Float, s1.n> f159221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f159222c;

        /* JADX INFO: renamed from: sg2.d$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3010a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f159223a;

            static {
                int[] iArr = new int[e.b.values().length];
                try {
                    iArr[e.b.INHALE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.b.INHALE_HOLD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e.b.EXHALE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[e.b.EXHALE_HOLD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f159223a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s1.b<Float, s1.n> bVar, e eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f159221b = bVar;
            this.f159222c = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f159221b, this.f159222c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            float f14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f159220a;
            if (i14 == 0) {
                o13.r.b(obj);
                e eVar = this.f159222c;
                int i15 = C3010a.f159223a[eVar.f159226b.ordinal()];
                if (i15 == 1 || i15 == 2) {
                    f14 = 1.0f;
                } else {
                    if (i15 != 3 && i15 != 4) {
                        u0.r();
                        return null;
                    }
                    f14 = 0.0f;
                }
                Float f15 = new Float(f14);
                b2 b2VarD = s1.l.d(eVar.f159225a * 1000, 0, null, 6);
                this.f159220a = 1;
                if (s1.b.c(this.f159221b, f15, b2VarD, null, this, 12) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(LottieComposition lottieComposition, e eVar, p3.m mVar, int i14) {
        e eVar2;
        o0 o0Var;
        o0 o0VarE = mVar.E(-220558189);
        int i15 = i14 | (o0VarE.r(lottieComposition) ? 4 : 2) | (o0VarE.B(eVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new se0.a(4);
                o0VarE.K(objQ);
            }
            h4.r rVarA = s0.a(aVar, (e23.l) objQ);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            LottieAnimationKt.LottieAnimation(lottieComposition, null, false, false, null, 0.0f, 1, false, false, false, null, false, false, null, null, null, true, false, null, false, null, o0VarE, (i15 & 14) | 1572864, 1572864, 0, 2031550);
            o0Var = o0VarE;
            eVar2 = eVar;
            if (eVar2 != null) {
                o0Var.C(-1869756476);
                c(uVar, eVar2, o0Var, 6 | (i15 & 112));
                o0Var.g0(false);
            } else {
                o0Var.C(-1869702505);
                b(uVar, o0Var, 6);
                o0Var.g0(false);
            }
            o0Var.g0(true);
        } else {
            eVar2 = eVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a1(lottieComposition, eVar2, i14, 16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(t tVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1481779036);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            d(tVar, ((Number) s1.p0.a(s1.p0.c("BreathworkRingsTransition", o0VarE, 0), 0.0f, 1.0f, s1.l.a(s1.l.d(4000, 0, null, 6), y0.Reverse, 4), "alpha", o0VarE, 29112, 0).f155651d.getF182175a()).floatValue(), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(tVar, i14);
        }
    }

    public static final void c(t tVar, e eVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1017364185);
        int i15 = (o0VarE.B(eVar) ? 32 : 16) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = s1.d.a(0.0f, 0.01f);
                o0VarE.K(objQ);
            }
            s1.b bVar = (s1.b) objQ;
            boolean zR = o0VarE.r(bVar) | ((i15 & 112) == 32);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new a(bVar, eVar, null);
                o0VarE.K(objQ2);
            }
            l0.e((e23.p) objQ2, eVar, o0VarE);
            d(tVar, ((Number) bVar.e()).floatValue(), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a1(tVar, eVar, i14, 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e1  */
    public static final void d(t tVar, float f14, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1917251046);
        int i15 = (o0VarE.i(f14) ? 32 : 16) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Float fValueOf = Float.valueOf(0.05f);
            gl.c.f77766a.getClass();
            o13.p pVar = new o13.p(fValueOf, d0.a(d0.c(0.1f, gl.c.a(o0VarE).b(), 14)));
            o13.p pVar2 = new o13.p(Float.valueOf(0.4f), d0.a(d0.c(0.4f, gl.c.a(o0VarE).b(), 14)));
            o13.p pVar3 = new o13.p(Float.valueOf(0.8f), d0.a(d0.c(0.2f, gl.c.a(o0VarE).b(), 14)));
            Float fValueOf2 = Float.valueOf(1.0f);
            d0.f128823b.getClass();
            o13.p[] pVarArr = {pVar, pVar2, pVar3, new o13.p(fValueOf2, d0.a(d0.f128831j))};
            h4.r rVarD = tVar.d(h4.r.S);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (z14) {
                objQ = new a81.d(f14, 8);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a81.d(f14, 8);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarA = s0.a(rVarD, (e23.l) objQ);
            boolean zR = o0VarE.r(pVarArr);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new gv0.c(pVarArr, 1);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new gv0.c(pVarArr, 1);
                    o0VarE.K(objQ2);
                }
            }
            u1.n.b(rVarA, (e23.l) objQ2, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d70.f(tVar, f14, i14, 6);
        }
    }
}
