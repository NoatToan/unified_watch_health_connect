package f51;

import e23.p;
import h4.g;
import o13.r;
import o53.b0;
import o53.m0;
import p004k6.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: f51.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.pacepro.presentation.composables.dialog.SendToDeviceSuccessfulPopupKt$SendToDeviceSuccessfulPopup$1$1", f = "SendToDeviceSuccessfulPopup.kt", l = {29}, m = "invokeSuspend", v = 2)
    public static final class C1428a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f69168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f69169b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1428a(e23.a<Unit> aVar, d<? super C1428a> dVar) {
            super(2, dVar);
            this.f69169b = aVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C1428a(this.f69169b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((C1428a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f69168a;
            if (i14 == 0) {
                r.b(obj);
                this.f69168a = 1;
                if (m0.b(2500L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            this.f69169b.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    public static final void a(int i14, e23.a aVar, String str, m mVar) {
        o0 o0VarL = h.l(2097396827, aVar, str, mVar);
        int i15 = (o0VarL.B(str) ? 4 : 2) | i14 | (o0VarL.r(aVar) ? 32 : 16);
        if (o0VarL.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Unit unit = Unit.INSTANCE;
            int i16 = i15 & 112;
            boolean z14 = i16 == 32;
            Object objQ = o0VarL.q();
            m.a aVar2 = m.f135153a;
            if (z14) {
                objQ = new C1428a(aVar, null);
                o0VarL.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new C1428a(aVar, null);
                    o0VarL.K(objQ);
                }
            }
            l0.e((p) objQ, unit, o0VarL);
            h4.d.f81522a.getClass();
            g gVar = h4.d.a.f81528f;
            boolean z15 = i16 == 32;
            Object objQ2 = o0VarL.q();
            if (z15) {
                objQ2 = new eu.a(aVar, 10);
                o0VarL.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new eu.a(aVar, 10);
                    o0VarL.K(objQ2);
                }
            }
            p004k6.g.b(gVar, 0L, (e23.a) objQ2, new d0(false, true, true, false), f.c(956526808, new as.p(str, 27), o0VarL), o0VarL, 27654, 2);
        } else {
            o0VarL.e();
        }
        p2 p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ao1.g(str, aVar, i14, 7);
        }
    }
}
