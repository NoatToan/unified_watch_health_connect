package zj0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.g3;
import e23.p;
import ew1.f2;
import g02.s0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import v13.i;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.feedback.GCPlusFeedbackActivityKt$GCPlusFeedbackScreen$1$1", f = "GCPlusFeedbackActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f204894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f204895b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, Context context, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f204894a = eVar;
            this.f204895b = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f204894a, this.f204895b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            e eVar = this.f204894a;
            eVar.getClass();
            Context context = this.f204895b;
            context.getClass();
            ge1.b.T(v1.a(eVar), null, null, new d(eVar, context, null), 3);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(e eVar, e23.a<Unit> aVar, m mVar, int i14) {
        eVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-2056429747);
        int i15 = (o0VarE.r(eVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            p1 p1VarB = p0.b(eVar.f204904d, g3.a.c(g3.f35298f), null, o0VarE, g3.f35299g << 3, 2);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(eVar) | o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new a(eVar, context, null);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a(eVar, context, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((p) objQ, unit, o0VarE);
            s0.a(null, ((g3) p1VarB.getF182175a()).f35300a == fw.p.LOADING, f.c(-454942141, new f2(p1VarB, aVar), o0VarE), o0VarE, 384, 1);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new zi1.a(eVar, aVar, i14, i16);
        }
    }
}
