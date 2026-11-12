package mz1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$getShareableEventData$1", f = "EventDetailsViewModel.kt", l = {403}, m = "invokeSuspend", v = 2)
public final class a1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f121653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f121654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.workouts.data.model.k> f121655e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(e0 e0Var, String str, List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list, t13.d<? super a1> dVar) {
        super(2, dVar);
        this.f121653c = e0Var;
        this.f121654d = str;
        this.f121655e = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a1 a1Var = new a1(this.f121653c, this.f121654d, this.f121655e, dVar);
        a1Var.f121652b = obj;
        return a1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list;
        o53.b0 b0Var = (o53.b0) this.f121652b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121651a;
        e0 e0Var = this.f121653c;
        if (i14 == 0) {
            o13.r.b(obj);
            zf0.d dVar = e0Var.f204384a;
            this.f121652b = b0Var;
            this.f121651a = 1;
            obj = dVar.f(this.f121654d, this);
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
            int i15 = e0.K1;
            ((androidx.lifecycle.y0) e0Var.H0.getValue()).j(new o13.p(Boolean.TRUE, null));
            fg0.k kVar = (fg0.k) ((v2.b) v2Var).f47386a;
            gg0.f eventType = kVar.getEventType();
            if (eventType != null && eventType.g() && (list = this.f121655e) != null && (!list.isEmpty())) {
                kVar.x0(list);
            }
            e0Var.E5(kVar);
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            int i16 = e0.K1;
            androidx.lifecycle.y0 y0Var = (androidx.lifecycle.y0) e0Var.H0.getValue();
            Boolean bool = Boolean.FALSE;
            v2.a aVar2 = (v2.a) v2Var;
            Integer num = aVar2.f47384b;
            y0Var.j(new o13.p(bool, Boolean.valueOf(num != null && num.intValue() == 404)));
            String string = aVar2.f47383a.toString();
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "EventDetailsViewModel", string);
        }
        return Unit.INSTANCE;
    }
}
