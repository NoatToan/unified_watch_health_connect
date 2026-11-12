package mz1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$getPastEventWeather$1", f = "EventDetailsViewModel.kt", l = {1185}, m = "invokeSuspend", v = 2)
public final class y0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f121984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f121985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f121986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f121987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f121988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f121989h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(e0 e0Var, int i14, int i15, long j8, String str, String str2, t13.d<? super y0> dVar) {
        super(2, dVar);
        this.f121984c = e0Var;
        this.f121985d = i14;
        this.f121986e = i15;
        this.f121987f = j8;
        this.f121988g = str;
        this.f121989h = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        y0 y0Var = new y0(this.f121984c, this.f121985d, this.f121986e, this.f121987f, this.f121988g, this.f121989h, dVar);
        y0Var.f121983b = obj;
        return y0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        o53.b0 b0Var = (o53.b0) this.f121983b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121982a;
        e0 e0Var = this.f121984c;
        if (i14 == 0) {
            o13.r.b(obj);
            f42.b bVar = (f42.b) e0Var.f204386c.getValue();
            this.f121983b = b0Var;
            this.f121982a = 1;
            bVar.getClass();
            objC = bVar.C(new f42.d(bVar, this.f121985d, this.f121986e, this.f121987f, this.f121988g, this.f121989h, null), this);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objC = obj;
        }
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            T t7 = ((v2.b) v2Var).f47386a;
            if (t7 != 0) {
                int i15 = e0.K1;
                ((androidx.lifecycle.y0) e0Var.f121696q1.getValue()).j(t7);
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
