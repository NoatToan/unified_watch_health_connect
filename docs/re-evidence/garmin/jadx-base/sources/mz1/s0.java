package mz1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$getForecastWeather$1", f = "EventDetailsViewModel.kt", l = {1207}, m = "invokeSuspend", v = 2)
public final class s0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f121927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f121928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f121929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f121930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f121931g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(e0 e0Var, double d14, double d15, long j8, int i14, t13.d<? super s0> dVar) {
        super(2, dVar);
        this.f121927c = e0Var;
        this.f121928d = d14;
        this.f121929e = d15;
        this.f121930f = j8;
        this.f121931g = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s0 s0Var = new s0(this.f121927c, this.f121928d, this.f121929e, this.f121930f, this.f121931g, dVar);
        s0Var.f121926b = obj;
        return s0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        o53.b0 b0Var = (o53.b0) this.f121926b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121925a;
        double d14 = this.f121929e;
        double d15 = this.f121928d;
        e0 e0Var = this.f121927c;
        if (i14 == 0) {
            o13.r.b(obj);
            f42.b bVar = (f42.b) e0Var.f204386c.getValue();
            int iA = lb2.b.a(d15);
            int iA2 = lb2.b.a(d14);
            this.f121926b = b0Var;
            this.f121925a = 1;
            bVar.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new f42.c(bVar, iA, iA2, this.f121930f, this.f121931g, null), this);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objJ = obj;
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            int i15 = e0.K1;
            ((androidx.lifecycle.y0) e0Var.f121694o1.getValue()).j(((v2.b) v2Var).f47386a);
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return 0;
            }
            e0.m5(e0Var, lb2.b.a(d15), lb2.b.a(d14), this.f121930f);
            String string = ((v2.a) v2Var).f47383a.toString();
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "EventDetailsViewModel", string);
        }
        return Unit.INSTANCE;
    }
}
