package i11;

import b11.q;
import b82.d2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h5.e0;
import i3.mc;
import i3.mh;
import l72.w;
import o13.r;
import o4.m1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import u1.a2;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.composable.NutritionContentBottomSheetKt$NutritionContentBottomSheet$1$1$1$1", f = "NutritionContentBottomSheet.kt", l = {46}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f87100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f87101b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f87101b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f87101b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f87100a;
            if (i14 == 0) {
                r.b(obj);
                this.f87100a = 1;
                if (this.f87101b.d(this) == aVar) {
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

    public static final void a(mc mcVar, b0 b0Var, b11.f fVar, v21.e eVar, p3.m mVar, int i14) {
        mcVar.getClass();
        b0Var.getClass();
        eVar.getClass();
        o0 o0VarE = mVar.E(134601741);
        int i15 = 2;
        int i16 = i14 | (o0VarE.B(mcVar) ? 4 : 2) | (o0VarE.r(b0Var) ? 32 : 16) | (o0VarE.B(fVar) ? 256 : 128) | (o0VarE.r(eVar) ? 2048 : 1024);
        int i17 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            w wVar = w.f111301a;
            b.f87074a.getClass();
            z3.e eVar2 = b.f87075b;
            z3.e eVarC = z3.f.c(-16150004, new fn1.n(b0Var, mcVar, i17), o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new i01.j(6);
                o0VarE.K(objQ);
            }
            wVar.e(eVar2, eVarC, (e23.a) objQ, mcVar, true, null, z3.f.c(-220527070, new hv0.d(i15, fVar, eVar), o0VarE), o0VarE, ((i16 << 9) & 7168) | 12607926, 96);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g52.d(mcVar, b0Var, fVar, eVar, i14, 20);
        }
    }

    public static final void b(Integer num, i53.c<q> cVar, v21.e eVar, p3.m mVar, int i14) {
        boolean z14;
        cVar.getClass();
        eVar.getClass();
        o0 o0VarE = mVar.E(835352734);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(num) ? 4 : 2) | (o0VarE.r(cVar) ? 32 : 16) | (o0VarE.r(eVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarB = a2.b(x2.d(aVar, 1.0f), a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            z zVarA = y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarE, j92.b.f97899b.f97920e);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                z14 = true;
                objQ = new f(1);
                o0VarE.K(objQ);
            } else {
                z14 = true;
            }
            h4.r rVarC2 = v.c((e23.l) objQ, rVarY, z14);
            int i16 = 0;
            z zVarA2 = y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            String strC = eVar.c(num);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(strC, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97928e), o0VarE), o0VarE, 0, 0, 131070);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_calories);
            fVar2.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(z14);
            o0VarE.C(739833146);
            int i17 = 0;
            for (q qVar : cVar) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    x.q();
                    throw null;
                }
                d2.f16532a.g(i17, 384, 2, null, o0VarE, z3.f.c(813821255, new l(qVar, eVar, i16), o0VarE));
                i17 = i18;
            }
            o0VarE.g0(false);
            o0VarE.g0(z14);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gw1.c(num, cVar, eVar, i14, 12);
        }
    }
}
