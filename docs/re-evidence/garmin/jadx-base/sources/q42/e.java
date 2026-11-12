package q42;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.x1;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.EditGoalScreenKt$EditGoalScreen$1$1", f = "EditGoalScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f142617a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f142617a = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f142617a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            i iVar = this.f142617a;
            iVar.getClass();
            ge1.b.T(v1.a(iVar), null, null, new k(iVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.EditGoalScreenKt$EditGoalScreen$2$1$1", f = "EditGoalScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f142618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f142619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f142620c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f142621d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i f142622e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z14, Context context, e23.a<Unit> aVar, e23.a<Unit> aVar2, i iVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f142618a = z14;
            this.f142619b = context;
            this.f142620c = aVar;
            this.f142621d = aVar2;
            this.f142622e = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f142618a, this.f142619b, this.f142620c, this.f142621d, this.f142622e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (!this.f142618a) {
                Toast.makeText(this.f142619b, R.string.txt_error_occurred, 0).show();
            }
            this.f142620c.invoke();
            this.f142621d.invoke();
            p2 p2Var = this.f142622e.f142648b;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, f.a((f) value, false, 1)));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(i iVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0Var;
        Context context;
        iVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(908803721);
        int i15 = i14 | (o0VarE.r(iVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new pk0.m(29);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            p1 p1VarC = s9.c.c(iVar.f142649c, o0VarE);
            p1 p1VarC2 = s9.c.c(iVar.f142651e, o0VarE);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(iVar);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new a(iVar, null);
                o0VarE.K(objQ2);
            }
            l0.e((e23.p) objQ2, unit, o0VarE);
            Boolean bool = ((f) p1VarC.getF182175a()).f142634b;
            if (bool == null) {
                o0VarE.C(-1301695778);
                o0VarE.g0(false);
                context = context2;
            } else {
                o0VarE.C(-1301695777);
                boolean zBooleanValue = bool.booleanValue();
                boolean zH = ((i15 & 112) == 32) | ((i15 & 896) == 256) | o0VarE.h(zBooleanValue) | o0VarE.r(context2) | o0VarE.r(iVar);
                Object objQ3 = o0VarE.q();
                if (zH || objQ3 == c2565a) {
                    context = context2;
                    b bVar = new b(zBooleanValue, context, aVar2, aVar, iVar, null);
                    o0VarE.K(bVar);
                    objQ3 = bVar;
                } else {
                    context = context2;
                }
                l0.e((e23.p) objQ3, bool, o0VarE);
                o0VarE.g0(false);
            }
            z3.e eVarC = z3.f.c(-1804512365, new oy0.b((Object) iVar, p1Var, p1VarC, (Object) aVar2, (Object) context, (Object) p1VarC2, 4), o0VarE);
            o0Var = o0VarE;
            z02.b.a(false, null, null, null, false, eVarC, o0Var, 196608, 31);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new pp.g(iVar, aVar, aVar2, i14, 2);
        }
    }
}
