package lh0;

import a11.g0;
import i3.mc;
import i3.ve;
import l30.y0;
import l72.o2;
import l72.w;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.fitness_age.presentation.components.recommendation.FitnessAgeMetricScreenKt$FitnessAgeMetricScreen$2$1$1$1", f = "FitnessAgeMetricScreen.kt", l = {40}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f112414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f112415b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f112415b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f112415b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f112414a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f112414a = 1;
                if (this.f112415b.d(this) == aVar) {
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

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112416a;

        static {
            int[] iArr = new int[dh0.g.values().length];
            try {
                iArr[dh0.g.BODY_FAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dh0.g.BMI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dh0.g.VIGOROUS_DAYS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[dh0.g.VIGOROUS_MINUTES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[dh0.g.RESTING_HR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f112416a = iArr;
        }
    }

    public static final void a(mc mcVar, b0 b0Var, dh0.g gVar, dh0.a aVar, e23.a<Unit> aVar2, e23.l<? super dh0.g, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        b0Var.getClass();
        aVar2.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-950263154);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(mcVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(b0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.k(gVar.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = i15;
            w wVar = w.f111301a;
            z3.e eVarC = z3.f.c(1861856382, new kh0.d(gVar, 24), o0VarE);
            z3.e eVarC2 = z3.f.c(-1943301307, new fn1.n(b0Var, mcVar, 3), o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new o2(21);
                o0VarE.K(objQ);
            }
            wVar.c(eVarC, eVarC2, (e23.a) objQ, mcVar, null, null, z3.f.c(316393040, new i(gVar, aVar, lVar, aVar2, 0), o0VarE), o0VarE, ((i16 << 9) & 7168) | 1573302, 48);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0((Object) mcVar, (Object) b0Var, (Object) gVar, (Object) aVar, (e23.a) aVar2, (Object) lVar, i14, 27);
        }
    }

    public static final void b(z3.e eVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-555663715);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            ve.a(null, null, tn.k.b(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(1162549688, new y0(5, a2.a(o0VarE), eVar), o0VarE), o0VarE, 12582912, 123);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.o(eVar, i14, 10);
        }
    }
}
