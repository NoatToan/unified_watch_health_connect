package rx1;

import c2.x2;
import i3.e9;
import i3.mc;
import i3.ve;
import kotlin.t1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import x5.l0;

/* JADX INFO: loaded from: classes10.dex */
public final class v {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.composables.bottomsheet.SetNameBottomSheetKt$SetNameBottomSheet$2$1", f = "SetNameBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m4.b0 f155030a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m4.b0 b0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f155030a = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f155030a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            m4.b0.a(this.f155030a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.composables.bottomsheet.SetNameBottomSheetKt$SetNameBottomSheet$onDismissRequest$1$1$1", f = "SetNameBottomSheet.kt", l = {76}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f155031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f155032b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc mcVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f155032b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f155032b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f155031a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f155031a = 1;
                if (this.f155032b.d(this) == aVar) {
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

    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    public static final void a(String str, String str2, e23.l<? super String, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        str.getClass();
        str2.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-121546672);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = {str};
            l0.f188876d.getClass();
            d4.l lVar2 = l0.f188877e;
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                objQ = new a90.c(str, 14);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a90.c(str, 14);
                    o0VarE.K(objQ);
                }
            }
            p1 p1VarF = d4.a.f(objArr, lVar2, (e23.a) objQ, o0VarE, 0);
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            b0 b0Var = (b0) objQ2;
            boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new eu.b(b0Var, mcVarF, aVar, 11);
                o0VarE.K(objQ3);
            }
            e23.a aVar3 = (e23.a) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = kg.f.j(o0VarE);
            }
            m4.b0 b0Var2 = (m4.b0) objQ4;
            l.b(mcVarF, aVar3, null, null, null, z3.f.c(753057754, new ku1.l(str2, aVar3, lVar, p1VarF, b0Var2), o0VarE), o0VarE, 196608);
            Unit unit = Unit.INSTANCE;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new a(b0Var2, null);
                o0VarE.K(objQ5);
            }
            p3.l0.e((e23.p) objQ5, unit, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new qy0.d((Object) str, (Object) str2, (e23.l) lVar, (e23.a) aVar, i14, 16);
        }
    }

    public static final void b(l0 l0Var, h4.r rVar, Integer num, e23.l lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1815179246);
        int i15 = i14 | (o0VarE.B(l0Var) ? 4 : 2) | (o0VarE.B(rVar) ? 32 : 16) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            ve.a(x2.f(h4.r.S, 1.0f).then(rVar), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-1433245175, new t((m4.q) o0VarE.A(t1.f91491i), l0Var, num, lVar, 0), o0VarE), o0VarE, 12582912, 122);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new qy0.d(l0Var, rVar, num, lVar, i14, 17);
        }
    }
}
