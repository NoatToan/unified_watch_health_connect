package by1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import i3.fe;
import lc.m0;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lby1/x;", "Lzx1/a;", "<init>", "()V", "", "isDataLoading", "isDataError", "Ldy1/p;", "strengthTrainingPlanState", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x extends zx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f22221a = new x();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.navigation.routes.wizard.SetYourGoalRoute$Content$1$1", f = "SetYourGoalRoute.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ey1.a f22222a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ey1.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f22222a = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f22222a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            ey1.a aVar2 = this.f22222a;
            if (!aVar2.f67272d) {
                w9.a aVarA = v1.a(aVar2);
                x53.c cVar = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new ey1.e(aVar2, null), 2);
            }
            return Unit.INSTANCE;
        }
    }

    private x() {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:47:0x013f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0165  */
    /* JADX WARN: Code duplicated, block: B:57:0x0186  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // zx1.a
    public final void a(lc.v vVar, m0 m0Var, fe feVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarQ = a0.q(vVar, m0Var, mVar, -167425672);
        if ((i14 & 48) == 0) {
            i15 = i14 | (o0VarQ.r(m0Var) ? 32 : 16);
        } else {
            i15 = i14;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            c.p.f22335a.getClass();
            b.w wVarA = c.p.a(o0VarQ);
            b.u onBackPressedDispatcher = wVarA != null ? wVarA.getOnBackPressedDispatcher() : null;
            ey1.a aVarN = zf.b.N(o0VarQ);
            p1 p1VarC = s9.c.c(aVarN.f67286r, o0VarQ);
            p1 p1VarC2 = s9.c.c(aVarN.f67287t, o0VarQ);
            p1 p1VarC3 = s9.c.c(aVarN.f67289w, o0VarQ);
            boolean zR = o0VarQ.r(onBackPressedDispatcher);
            Object objQ = o0VarQ.q();
            int i16 = 17;
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new ak0.i(onBackPressedDispatcher, 17);
                o0VarQ.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ak0.i(onBackPressedDispatcher, 17);
                    o0VarQ.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            Unit unit = Unit.INSTANCE;
            boolean zR2 = o0VarQ.r(aVarN);
            Object objQ2 = o0VarQ.q();
            if (zR2) {
                objQ2 = new a(aVarN, null);
                o0VarQ.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a(aVarN, null);
                    o0VarQ.K(objQ2);
                }
            }
            l0.e((e23.p) objQ2, unit, o0VarQ);
            int i17 = 2;
            if (((Boolean) p1VarC2.getF182175a()).booleanValue()) {
                o0VarQ.C(-1320163214);
                String strQ = gl1.y.Q(o0VarQ, R.string.lbl_set_your_goal);
                boolean zBooleanValue = ((Boolean) p1VarC.getF182175a()).booleanValue();
                boolean zR3 = o0VarQ.r(aVarN);
                Object objQ3 = o0VarQ.q();
                if (zR3) {
                    objQ3 = new s(aVarN, i17);
                    o0VarQ.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new s(aVarN, i17);
                        o0VarQ.K(objQ3);
                    }
                }
                e23.a aVar3 = (e23.a) objQ3;
                boolean zR4 = o0VarQ.r(aVarN) | o0VarQ.r(context);
                Object objQ4 = o0VarQ.q();
                if (zR4) {
                    objQ4 = new a42.d(aVarN, context, i16);
                    o0VarQ.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new a42.d(aVarN, context, i16);
                        o0VarQ.K(objQ4);
                    }
                }
                wx1.v.a(strQ, zBooleanValue, aVar3, (e23.a) objQ4, aVar2, o0VarQ, 0);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(-1319447796);
                boolean zBooleanValue2 = ((Boolean) p1VarC.getF182175a()).booleanValue();
                i53.c cVarE = i53.a.e(mx1.d.f121381h);
                mx1.d dVar = ((dy1.p) p1VarC3.getF182175a()).f61595a;
                boolean zR5 = o0VarQ.r(aVarN);
                Object objQ5 = o0VarQ.q();
                if (zR5) {
                    objQ5 = new by1.a(aVarN, 5);
                    o0VarQ.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new by1.a(aVarN, 5);
                        o0VarQ.K(objQ5);
                    }
                }
                e23.l lVar = (e23.l) objQ5;
                boolean zR6 = o0VarQ.r(aVarN) | o0VarQ.B(p1VarC3) | o0VarQ.r(m0Var);
                Object objQ6 = o0VarQ.q();
                if (zR6) {
                    objQ6 = new b(aVarN, m0Var, p1VarC3, i17);
                    o0VarQ.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new b(aVarN, m0Var, p1VarC3, i17);
                        o0VarQ.K(objQ6);
                    }
                }
                e23.a aVar4 = (e23.a) objQ6;
                boolean zR7 = o0VarQ.r(aVarN) | o0VarQ.r(context);
                Object objQ7 = o0VarQ.q();
                if (zR7) {
                    objQ7 = new a42.d(aVarN, context, 18);
                    o0VarQ.K(objQ7);
                } else {
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new a42.d(aVarN, context, 18);
                        o0VarQ.K(objQ7);
                    }
                }
                wx1.u.a(zBooleanValue2, cVarE, dVar, lVar, aVar4, (e23.a) objQ7, aVar2, o0VarQ, 0);
                o0VarQ.g0(false);
            }
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.g(this, vVar, m0Var, feVar, i14, 23);
        }
    }
}
