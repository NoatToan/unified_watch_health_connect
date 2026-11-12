package wv0;

import androidx.room.a0;
import i3.mc;
import kotlin.m3;
import kotlin.t1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.w0;
import vd0.f0;
import x5.l0;

/* JADX INFO: loaded from: classes9.dex */
public final class u {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.component.EditCustomBehaviourBottomSheetKt$EditCustomItemContent$1$1", f = "EditCustomBehaviourBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m4.b0 f187448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m3 f187449b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m4.b0 b0Var, m3 m3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f187448a = b0Var;
            this.f187449b = m3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f187448a, this.f187449b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            m4.b0.a(this.f187448a);
            m3 m3Var = this.f187449b;
            if (m3Var != null) {
                m3Var.show();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(mc mcVar, String str, e23.a aVar, e23.l lVar, p3.m mVar, int i14) {
        o0 o0VarO = a0.o(aVar, lVar, mVar, 125466356);
        int i15 = i14 | (o0VarO.B(mcVar) ? 4 : 2) | (o0VarO.B(str) ? 32 : 16) | (o0VarO.r(aVar) ? 256 : 128) | (o0VarO.r(lVar) ? 2048 : 1024);
        if (o0VarO.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarO.G0();
            if ((i14 & 1) != 0 && !o0VarO.o0()) {
                o0VarO.e();
            }
            o0VarO.h0();
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarO.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                int length = str.length();
                objQ = p0.n(new l0(str, og.a.l(length, length), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
                o0VarO.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            l72.w.f111301a.e(z3.f.c(-214867634, new f0(str, lVar, p1Var, aVar), o0VarO), null, aVar, mcVar, false, null, z3.f.c(1010115135, new eb0.a(p1Var, 18), o0VarO), o0VarO, (i15 & 896) | 12582918 | ((i15 << 9) & 7168), 114);
        } else {
            o0VarO.e();
        }
        p2 p2VarI0 = o0VarO.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w21.d(mcVar, str, aVar, lVar, i14, 11);
        }
    }

    public static final void b(l0 l0Var, e23.l<? super l0, Unit> lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-384384108);
        int i15 = i14 | (o0VarE.B(l0Var) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = kg.f.j(o0VarE);
            }
            m4.b0 b0Var = (m4.b0) objQ;
            m3 m3Var = (m3) o0VarE.A(t1.f91499q);
            l72.p1.b(l0Var, m4.e.a(h4.r.S, b0Var), null, null, false, false, null, 0L, null, null, null, null, null, null, lVar, o0VarE, i15 & 14, 24576, 16380);
            o0VarE = o0VarE;
            Boolean bool = Boolean.TRUE;
            boolean zB = o0VarE.B(m3Var);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new a(b0Var, m3Var, null);
                o0VarE.K(objQ2);
            }
            p3.l0.e((e23.p) objQ2, bool, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wb1.i(l0Var, lVar, i14, 12);
        }
    }
}
