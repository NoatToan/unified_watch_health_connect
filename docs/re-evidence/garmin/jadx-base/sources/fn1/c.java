package fn1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.a5;
import i3.e9;
import i3.mc;
import km1.c0;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.detail.coach.SleepCoachDailyScreenKt$SleepCoachDailyScreen$3$1$1", f = "SleepCoachDailyScreen.kt", l = {49}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f72184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f72185b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f72185b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f72185b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f72184a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f72184a = 1;
                if (this.f72185b.b(this) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(km1.c cVar, DateTime dateTime, sm1.s sVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0Var;
        Object a5Var;
        p1 p1Var;
        mc mcVar;
        b0 b0Var;
        sVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(602346644);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | (o0VarE.r(dateTime) ? 32 : 16) | (o0VarE.r(sVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var2 = (b0) objQ;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(null);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            int i16 = i15 & 7168;
            boolean z14 = i16 == 2048;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new eu.a(aVar, 13);
                o0VarE.K(objQ3);
            }
            e23.a aVar3 = (e23.a) objQ3;
            boolean z15 = (57344 & i15) == 16384;
            Object objQ4 = o0VarE.q();
            if (z15 || objQ4 == c2565a) {
                objQ4 = new eu.a(aVar2, 14);
                o0VarE.K(objQ4);
            }
            e23.a aVar4 = (e23.a) objQ4;
            int i17 = i15 & 14;
            boolean zR = (i17 == 4 || ((i15 & 8) != 0 && o0VarE.r(cVar))) | o0VarE.r(context) | o0VarE.r(sVar) | o0VarE.r(dateTime) | (i16 == 2048) | o0VarE.r(b0Var2) | o0VarE.B(mcVarF);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a) {
                a5Var = new a5(cVar, context, sVar, dateTime, aVar, b0Var2, p1Var2, mcVarF, 2);
                p1Var = p1Var2;
                mcVar = mcVarF;
                b0Var = b0Var2;
                o0VarE.K(a5Var);
            } else {
                p1Var = p1Var2;
                a5Var = objQ5;
                mcVar = mcVarF;
                b0Var = b0Var2;
            }
            int i18 = km1.c.B;
            int i19 = i15 & 896;
            m.g(cVar, dateTime, sVar, aVar3, aVar4, (e23.l) a5Var, o0VarE, i18 | i17 | (i15 & 112) | i19);
            o0Var = o0VarE;
            if (!mcVar.e() || ((c0) p1Var.getF182175a()) == null) {
                o0Var.C(136996718);
                o0Var.g0(false);
            } else {
                o0Var.C(136855451);
                r.b((c0) p1Var.getF182175a(), cVar, sVar, mcVar, b0Var, o0Var, (i18 << 3) | ((i15 << 3) & 112) | i19);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(cVar, dateTime, sVar, aVar, aVar2, i14, 19);
        }
    }
}
