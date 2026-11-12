package m72;

import i3.e9;
import i3.mc;
import l72.w;
import lc.m0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class p {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.PreviewCatalogActivityKt$ExampleDetailScreen$hideSettingsSheet$1$1$1", f = "PreviewCatalogActivity.kt", l = {362}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f117127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f117128b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f117128b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f117128b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f117127a;
            if (i14 == 0) {
                r.b(obj);
                this.f117127a = 1;
                if (this.f117128b.d(this) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(n72.i iVar, m0 m0Var, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0Var;
        m0Var.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-2020162437);
        int i15 = i14 | (o0VarE.B(iVar) ? 4 : 2) | (o0VarE.r(m0Var) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            n72.j f124915d = iVar.getF124915d();
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            Object[] objArr = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new ll0.b(18);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ2, o0VarE, 48);
            e23.a aVar2 = null;
            mc mcVarF = e9.f(false, null, o0VarE, 0, 3);
            String f124913b = iVar.getF124913b();
            boolean zR = o0VarE.r(m0Var);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new k62.j(m0Var, 18);
                o0VarE.K(objQ3);
            }
            e23.a aVar3 = (e23.a) objQ3;
            u4.d dVar = f124915d != null ? f124915d.f124893a : null;
            if (f124915d != null) {
                o0VarE.C(-1576852973);
                boolean zB = o0VarE.B(p1Var);
                Object objQ4 = o0VarE.q();
                if (zB || objQ4 == c2565a) {
                    objQ4 = new ly0.f(p1Var, 3);
                    o0VarE.K(objQ4);
                }
                aVar2 = (e23.a) objQ4;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1576796181);
                o0VarE.g0(false);
            }
            o0Var = o0VarE;
            f.a(f124913b, aVar3, aVar, dVar, aVar2, z3.f.c(2109347933, new kk1.h(iVar, 29), o0VarE), o0Var, 196608 | (i15 & 896), 0);
            if (f124915d == null || !((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var.C(-1575731641);
                o0Var.g0(false);
            } else {
                o0Var.C(-1576643630);
                boolean zR2 = o0Var.r(b0Var) | o0Var.B(mcVarF) | o0Var.B(p1Var);
                Object objQ5 = o0Var.q();
                if (zR2 || objQ5 == c2565a) {
                    objQ5 = new fo.j(b0Var, mcVarF, p1Var, 5);
                    o0Var.K(objQ5);
                }
                e23.a aVar4 = (e23.a) objQ5;
                w wVar = w.f111301a;
                String str = f124915d.f124894b;
                z3.e eVarC = z3.f.c(909719233, new ll1.g(aVar4, 7), o0Var);
                boolean zB2 = o0Var.B(aVar4);
                Object objQ6 = o0Var.q();
                if (zB2 || objQ6 == c2565a) {
                    objQ6 = new ll0.a(aVar4, 13);
                    o0Var.K(objQ6);
                }
                wVar.f(str, null, null, eVarC, (e23.a) objQ6, mcVarF, false, new o(0), z3.f.c(24746327, new hv0.d(27, f124915d, aVar4), o0Var), o0Var, 805309440, 198);
                o0Var = o0Var;
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lb0.a((Object) iVar, (Object) m0Var, (o13.h) aVar, i14, 16);
        }
    }
}
