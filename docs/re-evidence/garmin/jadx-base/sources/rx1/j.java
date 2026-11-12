package rx1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.a4;
import i3.e9;
import i3.mc;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.n1;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.composables.bottomsheet.EditTrainingDayBottomSheetKt$EditTrainingDayBottomSheet$onDismissRequest$1$1$1", f = "EditTrainingDayBottomSheet.kt", l = {51}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f154991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f154992b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f154992b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f154992b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f154991a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f154991a = 1;
                if (this.f154992b.d(this) == aVar) {
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

    /* JADX WARN: Code duplicated, block: B:65:0x00df  */
    public static final void a(String str, i53.c<dy1.v> cVar, i53.c<dy1.q> cVar2, boolean z14, e23.p<? super a4, ? super mx1.b, Unit> pVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        i53.c<dy1.v> cVar3;
        boolean z15;
        e23.p<? super a4, ? super mx1.b, Unit> pVar2;
        o0 o0Var;
        str.getClass();
        cVar.getClass();
        cVar2.getClass();
        pVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-898370538);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            cVar3 = cVar;
            i15 |= o0VarE.r(cVar3) ? 32 : 16;
        } else {
            cVar3 = cVar;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(cVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 2048 : 1024;
        } else {
            z15 = z14;
        }
        if ((i14 & 24576) == 0) {
            pVar2 = pVar;
            i15 |= o0VarE.r(pVar2) ? 16384 : 8192;
        } else {
            pVar2 = pVar;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            mx1.b.f121357d.getClass();
            mx1.b bVarA = mx1.b.a.a(str);
            if (bVarA == null) {
                bVarA = mx1.b.PUSH_DAY;
            }
            Object[] objArr = new Object[0];
            boolean zK = ((i15 & 896) == 256) | o0VarE.k(bVarA.ordinal());
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zK) {
                objQ = new rk0.f(13, cVar2, bVarA);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new rk0.f(13, cVar2, bVarA);
                    o0VarE.K(objQ);
                }
            }
            n1 n1Var = (n1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 0);
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            b0 b0Var = (b0) objQ2;
            boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF) | ((i15 & 458752) == 131072);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new eu.b(b0Var, mcVarF, aVar, 8);
                o0VarE.K(objQ3);
            }
            e23.a aVar3 = (e23.a) objQ3;
            o0Var = o0VarE;
            l.b(mcVarF, aVar3, null, null, null, z3.f.c(1818248396, new g82.d(z15, cVar3, context, bVarA, aVar3, n1Var, pVar2, cVar2), o0VarE), o0Var, 196608);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(str, cVar, cVar2, z14, pVar, aVar, i14);
        }
    }
}
