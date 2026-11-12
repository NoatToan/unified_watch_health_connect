package kn1;

import c2.x2;
import ds.e0;
import e23.p;
import f21.u;
import i3.e9;
import i3.mc;
import kd0.j5;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.detail.score.SleepScoreFactorBaseModalKt$FactorBaseModal$3$1$2$1$1$1", f = "SleepScoreFactorBaseModal.kt", l = {52}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f105659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f105660b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f105660b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f105660b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f105659a;
            if (i14 == 0) {
                r.b(obj);
                this.f105659a = 1;
                if (this.f105660b.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:58:0x0109  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public static final void a(int i14, mc mcVar, b0 b0Var, p<? super p3.m, ? super Integer, Unit> pVar, p<? super p3.m, ? super Integer, Unit> pVar2, p3.m mVar, int i15, int i16) {
        int i17;
        p<? super p3.m, ? super Integer, Unit> pVar3;
        boolean z14;
        o0 o0Var;
        p2 p2VarI0;
        p<? super p3.m, ? super Integer, Unit> pVar4;
        Object objQ;
        int i18;
        mcVar.getClass();
        b0Var.getClass();
        pVar2.getClass();
        o0 o0VarE = mVar.E(322907856);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.B(mcVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.r(b0Var) ? 256 : 128;
        }
        int i19 = i16 & 8;
        if (i19 == 0) {
            if ((i15 & 3072) == 0) {
                pVar3 = pVar;
                i17 |= o0VarE.r(pVar3) ? 2048 : 1024;
            }
            if ((i15 & 24576) == 0) {
                if (o0VarE.r(pVar2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i17 |= i18;
            }
            if ((i17 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                if (i19 != 0) {
                    kn1.a.f105643a.getClass();
                    pVar4 = kn1.a.f105644b;
                } else {
                    pVar4 = pVar3;
                }
                x1 x1Var = p3.n.f135158a;
                long jF = vb.h.f(d92.b.f58623a, o0VarE);
                long jF2 = e0.f(o0VarE);
                h4.r rVarD = x2.d(h4.r.S, 1.0f);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new j5(12);
                    o0VarE.K(objQ);
                }
                kn1.a.f105643a.getClass();
                o0Var = o0VarE;
                e9.a((e23.a) objQ, rVarD, mcVar, 0.0f, false, null, jF, 0L, 0.0f, jF2, kn1.a.f105645c, new kc0.a(19), null, z3.f.c(1393968178, new a42.m(i14, b0Var, mcVar, pVar4, pVar2), o0VarE), o0Var, ((i17 << 3) & 896) | 54, 3078, 4536);
                pVar3 = pVar4;
            } else {
                o0Var = o0VarE;
                o0Var.e();
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new u(i14, mcVar, b0Var, pVar3, pVar2, i15, i16);
            }
        }
        i17 |= 3072;
        pVar3 = pVar;
        if ((i15 & 24576) == 0) {
            if (o0VarE.r(pVar2)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i17 |= i18;
        }
        if ((i17 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            if (i19 != 0) {
                kn1.a.f105643a.getClass();
                pVar4 = kn1.a.f105644b;
            } else {
                pVar4 = pVar3;
            }
            x1 x1Var2 = p3.n.f135158a;
            long jF3 = vb.h.f(d92.b.f58623a, o0VarE);
            long jF4 = e0.f(o0VarE);
            h4.r rVarD2 = x2.d(h4.r.S, 1.0f);
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new j5(12);
                o0VarE.K(objQ);
            }
            kn1.a.f105643a.getClass();
            o0Var = o0VarE;
            e9.a((e23.a) objQ, rVarD2, mcVar, 0.0f, false, null, jF3, 0L, 0.0f, jF4, kn1.a.f105645c, new kc0.a(19), null, z3.f.c(1393968178, new a42.m(i14, b0Var, mcVar, pVar4, pVar2), o0VarE), o0Var, ((i17 << 3) & 896) | 54, 3078, 4536);
            pVar3 = pVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(i14, mcVar, b0Var, pVar3, pVar2, i15, i16);
        }
    }
}
