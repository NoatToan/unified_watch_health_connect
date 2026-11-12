package u21;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.NutritionSetupCaloriesGoalViewModel$onCaloriesInputChanged$1", f = "NutritionSetupCaloriesGoalViewModel.kt", l = {49}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f167971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f167972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f167973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f167974d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(String str, f0 f0Var, String str2, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f167972b = str;
        this.f167973c = f0Var;
        this.f167974d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g0(this.f167972b, this.f167973c, this.f167974d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f167971a;
        boolean z14 = true;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f167971a = 1;
            if (o53.m0.b(300L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        Integer numI = d53.t.i(this.f167972b);
        f0 f0Var = this.f167973c;
        f0Var.getClass();
        if (numI != null) {
            s21.f0.f156107c.getClass();
            int i15 = f0.a.f167957a[s21.f0.a.a(this.f167974d).ordinal()];
            if (i15 == 1 ? numI.intValue() >= 1500 : i15 == 2 ? numI.intValue() >= 1200 : numI.intValue() >= 1350) {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        boolean z15 = z14;
        p2 p2Var = f0Var.f167954c;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, e0.a((e0) value, null, false, z15, false, 11)));
        return Unit.INSTANCE;
    }
}
