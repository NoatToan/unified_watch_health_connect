package mz1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$getTriathlonTypes$1", f = "EventDetailsViewModel.kt", l = {654}, m = "invokeSuspend", v = 2)
public final class b1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e0 f121658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f121659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f121660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f121661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(e0 e0Var, t13.d<? super b1> dVar) {
        super(2, dVar);
        this.f121661d = e0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b1 b1Var = new b1(this.f121661d, dVar);
        b1Var.f121660c = obj;
        return b1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        e0 e0Var;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.f> list;
        o53.b0 b0Var = (o53.b0) this.f121660c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121659b;
        if (i14 == 0) {
            o13.r.b(obj);
            e0 e0Var2 = this.f121661d;
            d60.b bVarF4 = e0Var2.F4();
            this.f121660c = b0Var;
            this.f121658a = e0Var2;
            this.f121659b = 1;
            bVarF4.getClass();
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(bVarF4, new d60.e0(bVarF4, null), this);
            if (objJ == aVar) {
                return aVar;
            }
            e0Var = e0Var2;
            obj = objJ;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e0Var = this.f121658a;
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            list = (List) ((v2.b) v2Var).f47386a;
            if (list == null) {
                list = p13.j0.f134944a;
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Exception getting triathlon types=");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "EventDetailsViewModel", strD);
            list = p13.j0.f134944a;
        }
        e0Var.getClass();
        list.getClass();
        e0Var.J1 = list;
        return Unit.INSTANCE;
    }
}
