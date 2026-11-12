package k62;

import c22.s3;
import c80.s;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import zd0.j1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.myworkouts.MyWorkoutsInitialStateCheckViewModel$checkInitialState$1", f = "MyWorkoutsInitialStateCheckViewModel.kt", l = {35}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f103197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f103198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f103199c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f103199c = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f103199c, dVar);
        iVar.f103198b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        g gVar;
        Object value2;
        Boolean boolValueOf;
        b0 b0Var = (b0) this.f103198b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f103197a;
        h hVar = this.f103199c;
        if (i14 == 0) {
            r.b(obj);
            hVar.f103193b.m();
            a2 a2Var = a2.WORKOUTS;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "MyWorkoutsInitialStateCheckViewModel", "Checking initial state for My Workouts.");
            p2 p2Var = hVar.f103194c;
            do {
                value = p2Var.getValue();
                gVar = (g) value;
            } while (!p2Var.b(value, new g(true, gVar.f103189b, gVar.f103190c)));
            j1 j1Var = hVar.f103192a;
            this.f103198b = b0Var;
            this.f103197a = 1;
            obj = j1Var.i(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        boolean z14 = obj instanceof s.a;
        boolean zB = s3.b();
        p2 p2Var2 = hVar.f103194c;
        do {
            value2 = p2Var2.getValue();
            boolValueOf = Boolean.valueOf(z14);
            ((g) value2).getClass();
        } while (!p2Var2.b(value2, new g(false, zB, boolValueOf)));
        i2.f36769a.getClass();
        i2.a.b(a2.WORKOUTS, "MyWorkoutsInitialStateCheckViewModel", "Initial state check complete. hasActiveSubscription=" + z14 + ", isChildAccount=" + zB);
        return Unit.INSTANCE;
    }
}
