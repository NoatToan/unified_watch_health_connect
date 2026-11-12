package mz1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$onEventConversion$1", f = "EventDetailsViewModel.kt", l = {1294}, m = "invokeSuspend", v = 2)
public final class c1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f121667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg0.p f121668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f121669e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(e0 e0Var, fg0.p pVar, String str, t13.d<? super c1> dVar) {
        super(2, dVar);
        this.f121667c = e0Var;
        this.f121668d = pVar;
        this.f121669e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c1 c1Var = new c1(this.f121667c, this.f121668d, this.f121669e, dVar);
        c1Var.f121666b = obj;
        return c1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f121666b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121665a;
        e0 e0Var = this.f121667c;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = e0.K1;
            e0Var.r5().j(g3.a.c(g3.f35298f));
            ig0.b bVarH4 = e0Var.H4();
            this.f121666b = b0Var;
            this.f121665a = 1;
            bVarH4.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(bVarH4, new ig0.c(bVarH4, this.f121669e, this.f121668d, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            int i16 = e0.K1;
            androidx.lifecycle.y0<g3<o13.p<Boolean, fg0.k>>> y0VarR5 = e0Var.r5();
            g3.a aVar2 = g3.f35298f;
            o13.p pVar = new o13.p(Boolean.TRUE, ((v2.b) v2Var).f47386a);
            aVar2.getClass();
            y0VarR5.j(g3.a.d(pVar));
            e0Var.q5();
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            int i17 = e0.K1;
            e0Var.r5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            String string = ((v2.a) v2Var).f47383a.toString();
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "EventDetailsViewModel", string);
        }
        return Unit.INSTANCE;
    }
}
