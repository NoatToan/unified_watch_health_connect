package mz1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$getLinkedActivityWeather$1", f = "EventDetailsViewModel.kt", l = {1237}, m = "invokeSuspend", v = 2)
public final class v0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f121947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f121948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f121949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f121950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f121951g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(e0 e0Var, long j8, double d14, double d15, long j14, t13.d<? super v0> dVar) {
        super(2, dVar);
        this.f121947c = e0Var;
        this.f121948d = j8;
        this.f121949e = d14;
        this.f121950f = d15;
        this.f121951g = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v0 v0Var = new v0(this.f121947c, this.f121948d, this.f121949e, this.f121950f, this.f121951g, dVar);
        v0Var.f121946b = obj;
        return v0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f121946b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121945a;
        e0 e0Var = this.f121947c;
        if (i14 == 0) {
            o13.r.b(obj);
            hg0.b bVarB4 = e0Var.B4();
            this.f121946b = b0Var;
            this.f121945a = 1;
            bVarB4.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(bVarB4, new hg0.f(bVarB4, this.f121948d, null), this);
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
            T t7 = ((v2.b) v2Var).f47386a;
            if (t7 == 0) {
                e0.m5(e0Var, lb2.b.a(this.f121949e), lb2.b.a(this.f121950f), this.f121951g);
            } else {
                int i15 = e0.K1;
                ((androidx.lifecycle.y0) e0Var.f121698s1.getValue()).j(t7);
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            String string = ((v2.a) v2Var).f47383a.toString();
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "EventDetailsViewModel", string);
        }
        return Unit.INSTANCE;
    }
}
