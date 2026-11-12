package u21;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkd1/g;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "<anonymous>", "(Lkd1/g;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.NutritionSetupViewModel$saveReminders$2", f = "NutritionSetupViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b1 extends v13.i implements e23.p<kd1.g, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f167904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f167905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l01.k f167906c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(u0 u0Var, l01.k kVar, t13.d<? super b1> dVar) {
        super(2, dVar);
        this.f167905b = u0Var;
        this.f167906c = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b1 b1Var = new b1(this.f167905b, this.f167906c, dVar);
        b1Var.f167904a = obj;
        return b1Var;
    }

    @Override // e23.p
    public final Object invoke(kd1.g gVar, t13.d<? super Unit> dVar) {
        return ((b1) create(gVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        s21.a0 a0Var;
        Boolean bool;
        Boolean bool2;
        Object value2;
        Object value3;
        kd1.g gVar = (kd1.g) this.f167904a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        boolean z14 = gVar instanceof kd1.g.b;
        u0 u0Var = this.f167905b;
        if (z14) {
            p2 p2Var = u0Var.f168164o;
            do {
                value3 = p2Var.getValue();
            } while (!p2Var.b(value3, s21.a0.a((s21.a0) value3, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false, null, false, false, null, null, null, null, 0, -83886081, 3)));
        } else if (gVar instanceof kd1.g.a) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "NutritionSetupViewModel", "Failed to save nutrition reminders");
            p2 p2Var2 = u0Var.f168164o;
            do {
                value2 = p2Var2.getValue();
            } while (!p2Var2.b(value2, s21.a0.a((s21.a0) value2, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, s21.y.REMINDERS, false, false, null, null, null, null, 0, -83886081, 3)));
        } else {
            if (!(gVar instanceof kd1.g.c)) {
                lc.u0.r();
                return null;
            }
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "NutritionSetupViewModel", "Successfully saved nutrition reminders");
            p2 p2Var3 = u0Var.f168164o;
            do {
                value = p2Var3.getValue();
                a0Var = (s21.a0) value;
                bool = a0Var.f156037b;
                bool2 = Boolean.TRUE;
            } while (!p2Var3.b(value, s21.a0.a(a0Var, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, !p005kotlin.jvm.internal.s.g(bool, bool2), p005kotlin.jvm.internal.s.g(a0Var.f156037b, bool2) ? new o13.p(bool2, this.f167906c) : null, null, null, null, 0, -889192449, 3)));
        }
        return Unit.INSTANCE;
    }
}
