package by1;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import i3.fe;
import java.util.List;
import lc.m0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0010²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Lby1/v;", "Lzx1/a;", "<init>", "()V", "", "isDataLoading", "isDataError", "Ldy1/p;", "strengthTrainingPlanState", "Li53/c;", "Ldy1/v;", "workoutStepsState", "Ldy1/q;", "trainingDaysState", "", "maxSteps", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v extends zx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f22216a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<lc.r> f22217b = p13.w.c(gl1.d.M(new bt1.s(6), "dayIndexKey"));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.navigation.routes.wizard.SetTrainingDaysRoute$Content$1$1", f = "SetTrainingDaysRoute.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ey1.a f22218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f22219b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ey1.a aVar, Context context, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f22218a = aVar;
            this.f22219b = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f22218a, this.f22219b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f22218a.J4(this.f22219b);
            return Unit.INSTANCE;
        }
    }

    private v() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zx1.a
    public final void a(lc.v vVar, m0 m0Var, fe feVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        boolean z14;
        ey1.a aVar;
        o0 o0VarQ = a0.q(vVar, m0Var, mVar, 1491151768);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarQ.r(vVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarQ.r(m0Var) ? 32 : 16;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            c.p.f22335a.getClass();
            b.w wVarA = c.p.a(o0VarQ);
            b.u onBackPressedDispatcher = wVarA != null ? wVarA.getOnBackPressedDispatcher() : null;
            ey1.a aVarN = zf.b.N(o0VarQ);
            p1 p1VarC = s9.c.c(aVarN.f67286r, o0VarQ);
            p1 p1VarC2 = s9.c.c(aVarN.f67287t, o0VarQ);
            p1 p1VarC3 = s9.c.c(aVarN.f67289w, o0VarQ);
            p1 p1VarC4 = s9.c.c(aVarN.A, o0VarQ);
            p1 p1VarC5 = s9.c.c(aVarN.C, o0VarQ);
            p1 p1VarC6 = s9.c.c(aVarN.f67288v, o0VarQ);
            Bundle bundleA = vVar.f111888h.a();
            int i16 = bundleA != null ? bundleA.getInt("dayIndexKey") : 0;
            mx1.f fVar = ((dy1.p) p1VarC3.getF182175a()).f61598d;
            boolean z15 = !(fVar != null && fVar.d());
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                mx1.f fVar2 = ((dy1.p) p1VarC3.getF182175a()).f61598d;
                if (fVar2 == null) {
                    fVar2 = mx1.g.f121403a;
                }
                mx1.h.i iVar = new mx1.h.i(fVar2, aVarN.f67285q != null, aVarN.y4(), i16 + 1);
                o0VarQ.K(iVar);
                objQ = iVar;
            }
            mx1.h.i iVar2 = (mx1.h.i) objQ;
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarQ.r(aVarN) | o0VarQ.r(context);
            Object objQ2 = o0VarQ.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new a(aVarN, context, null);
                o0VarQ.K(objQ2);
            }
            l0.e((e23.p) objQ2, unit, o0VarQ);
            boolean zR2 = o0VarQ.r(aVarN) | o0VarQ.r(iVar2) | o0VarQ.r(m0Var);
            Object objQ3 = o0VarQ.q();
            if (zR2 || objQ3 == c2565a) {
                objQ3 = new ak0.m(aVarN, 18, iVar2, m0Var);
                o0VarQ.K(objQ3);
            }
            c.w.a(0, 1, (e23.a) objQ3, o0VarQ, false);
            if (((Boolean) p1VarC2.getF182175a()).booleanValue()) {
                o0VarQ.C(57673810);
                String strQ = gl1.y.Q(o0VarQ, R.string.lbl_stp_set_training_days);
                boolean zBooleanValue = ((Boolean) p1VarC.getF182175a()).booleanValue();
                boolean zR3 = o0VarQ.r(aVarN) | o0VarQ.r(context);
                Object objQ4 = o0VarQ.q();
                if (zR3 || objQ4 == c2565a) {
                    objQ4 = new bb0.d(13, aVarN, context);
                    o0VarQ.K(objQ4);
                }
                e23.a aVar2 = (e23.a) objQ4;
                boolean zR4 = o0VarQ.r(aVarN) | o0VarQ.r(context);
                Object objQ5 = o0VarQ.q();
                int i17 = 15;
                if (zR4 || objQ5 == c2565a) {
                    objQ5 = new a42.d(aVarN, context, i17);
                    o0VarQ.K(objQ5);
                }
                e23.a aVar3 = (e23.a) objQ5;
                boolean zR5 = o0VarQ.r(onBackPressedDispatcher);
                Object objQ6 = o0VarQ.q();
                if (zR5 || objQ6 == c2565a) {
                    objQ6 = new ak0.i(onBackPressedDispatcher, 15);
                    o0VarQ.K(objQ6);
                }
                wx1.v.a(strQ, zBooleanValue, aVar2, aVar3, (e23.a) objQ6, o0VarQ, 0);
                o0Var = o0VarQ;
                o0Var.g0(false);
            } else {
                o0Var = o0VarQ;
                o0Var.C(58579971);
                dy1.v vVar2 = (dy1.v) h0.e0(i16, (i53.c) p1VarC4.getF182175a());
                int i18 = iVar2.f121435e;
                int iIntValue = ((Number) p1VarC6.getF182175a()).intValue();
                mx1.f fVar3 = ((dy1.p) p1VarC3.getF182175a()).f61598d;
                boolean z16 = fVar3 != null && fVar3.c();
                boolean zBooleanValue2 = ((Boolean) p1VarC.getF182175a()).booleanValue();
                i53.c cVar = (i53.c) p1VarC4.getF182175a();
                i53.c cVar2 = (i53.c) p1VarC5.getF182175a();
                boolean zR6 = o0Var.r(aVarN);
                Object objQ7 = o0Var.q();
                if (zR6 || objQ7 == c2565a) {
                    objQ7 = new s(aVarN, 1);
                    o0Var.K(objQ7);
                }
                e23.a aVar4 = (e23.a) objQ7;
                boolean zR7 = o0Var.r(aVarN);
                Object objQ8 = o0Var.q();
                if (zR7 || objQ8 == c2565a) {
                    objQ8 = new s(aVarN, 0);
                    o0Var.K(objQ8);
                }
                e23.a aVar5 = (e23.a) objQ8;
                boolean zR8 = o0Var.r(vVar2) | o0Var.r(aVarN);
                Object objQ9 = o0Var.q();
                if (zR8 || objQ9 == c2565a) {
                    z14 = false;
                    objQ9 = new t(vVar2, aVarN, 0);
                    o0Var.K(objQ9);
                } else {
                    z14 = false;
                }
                e23.p pVar = (e23.p) objQ9;
                boolean zR9 = o0Var.r(vVar2) | o0Var.r(aVarN);
                Object objQ10 = o0Var.q();
                if (zR9 || objQ10 == c2565a) {
                    objQ10 = new u(vVar2, aVarN);
                    o0Var.K(objQ10);
                }
                e23.l lVar = (e23.l) objQ10;
                boolean zR10 = o0Var.r(vVar2) | o0Var.r(aVarN);
                Object objQ11 = o0Var.q();
                if (zR10 || objQ11 == c2565a) {
                    objQ11 = new t(vVar2, aVarN, 1);
                    o0Var.K(objQ11);
                }
                e23.p pVar2 = (e23.p) objQ11;
                boolean zR11 = o0Var.r(vVar2) | o0Var.r(aVarN);
                Object objQ12 = o0Var.q();
                if (zR11 || objQ12 == c2565a) {
                    objQ12 = new t(vVar2, aVarN, 2);
                    o0Var.K(objQ12);
                }
                e23.p pVar3 = (e23.p) objQ12;
                boolean zR12 = o0Var.r(aVarN) | o0Var.r(context) | o0Var.r(m0Var);
                Object objQ13 = o0Var.q();
                if (zR12 || objQ13 == c2565a) {
                    objQ13 = new n(aVarN, context, m0Var, 1);
                    o0Var.K(objQ13);
                }
                e23.l lVar2 = (e23.l) objQ13;
                boolean zR13 = o0Var.r(vVar2) | o0Var.r(aVarN) | o0Var.k(i16) | o0Var.B(p1VarC4) | o0Var.r(m0Var);
                Object objQ14 = o0Var.q();
                if (zR13 || objQ14 == c2565a) {
                    aVar = aVarN;
                    b81.b bVar = new b81.b(vVar2, i16, m0Var, aVar, p1VarC4, 1);
                    o0Var.K(bVar);
                    objQ14 = bVar;
                } else {
                    aVar = aVarN;
                }
                e23.l lVar3 = (e23.l) objQ14;
                boolean zR14 = o0Var.r(aVar) | o0Var.r(context);
                Object objQ15 = o0Var.q();
                int i19 = 14;
                if (zR14 || objQ15 == c2565a) {
                    objQ15 = new a42.d(aVar, context, i19);
                    o0Var.K(objQ15);
                }
                e23.a aVar6 = (e23.a) objQ15;
                boolean zR15 = o0Var.r(onBackPressedDispatcher);
                Object objQ16 = o0Var.q();
                if (zR15 || objQ16 == c2565a) {
                    objQ16 = new ak0.i(onBackPressedDispatcher, 14);
                    o0Var.K(objQ16);
                }
                wx1.s.a(i18, iIntValue, i16, z15, z16, zBooleanValue2, cVar, cVar2, aVar4, aVar5, pVar, lVar, pVar2, pVar3, lVar2, lVar3, aVar6, (e23.a) objQ16, o0Var, 0);
                o0Var.g0(z14);
            }
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.g(this, vVar, m0Var, feVar, i14, 21);
        }
    }

    @Override // zx1.a
    public final List<lc.r> b() {
        return f22217b;
    }
}
