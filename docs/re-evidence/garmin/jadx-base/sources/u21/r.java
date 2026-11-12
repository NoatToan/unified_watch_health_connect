package u21;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import v01.b2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.MealCalorieGoalsViewModel$saveMealGoals$1", f = "MealCalorieGoalsViewModel.kt", l = {108}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f168106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f168107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f168108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f168108c = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f168108c, dVar);
        rVar.f168107b = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        Object value3;
        o53.b0 b0Var = (o53.b0) this.f168107b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f168106a;
        p pVar = this.f168108c;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = pVar.f168092k;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, o.a((o) value, null, true, false, false, false, null, 123)));
            b2 b2Var = pVar.f168089h;
            b63.o oVarD = g22.l.d(b63.o.INSTANCE);
            g01.z zVar = pVar.f168090i;
            List<s21.j> list = ((o) pVar.f168092k.getValue()).f168048b;
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            for (s21.j jVar : list) {
                jVar.getClass();
                arrayList.add(new q01.d(jVar.f156129a, jVar.f156133e, jVar.f156134f, jVar.f156135g, jVar.f156136h));
            }
            this.f168107b = b0Var;
            this.f168106a = 1;
            objA = b2Var.a(oVarD, zVar, arrayList, this);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objA = obj;
        }
        if (((q01.k) objA) instanceof q01.k.c) {
            a2 a2Var = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "MealCalorieGoalsViewModel", "saveMealGoals: meals saved successfully");
            p2 p2Var2 = pVar.f168092k;
            do {
                value3 = p2Var2.getValue();
            } while (!p2Var2.b(value3, o.a((o) value3, null, false, true, false, false, new Integer(R.string.msg_settings_saved_successfully), 51)));
        } else {
            a2 a2Var2 = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "MealCalorieGoalsViewModel", "saveMealGoals: failed to save meals");
            p2 p2Var3 = pVar.f168092k;
            do {
                value2 = p2Var3.getValue();
            } while (!p2Var3.b(value2, o.a((o) value2, null, false, false, false, false, new Integer(R.string.generic_error_message), 59)));
        }
        return Unit.INSTANCE;
    }
}
