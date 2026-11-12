package b21;

import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSearchFoodNavKt$nutritionSearchFoodGraph$1$5$1$1$5$1", f = "NutritionSearchFoodNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<List<b11.v>> f15385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m21.g f15386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.v f15387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15388d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x5(p3.x3<? extends List<? extends b11.v>> x3Var, m21.g gVar, lc.v vVar, lc.m0 m0Var, t13.d<? super x5> dVar) {
        super(2, dVar);
        this.f15385a = x3Var;
        this.f15386b = gVar;
        this.f15387c = vVar;
        this.f15388d = m0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x5(this.f15385a, this.f15386b, this.f15387c, this.f15388d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        c22.c3 c3VarB;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        List<b11.v> f182175a = this.f15385a.getF182175a();
        if (f182175a != null) {
            ArrayList arrayList = new ArrayList(p13.y.r(f182175a, 10));
            Iterator<T> it = f182175a.iterator();
            while (it.hasNext()) {
                arrayList.add(((b11.v) it.next()).H1());
            }
            e5.b(this.f15388d, arrayList);
            m21.g gVar = this.f15386b;
            gVar.getClass();
            if (!f182175a.isEmpty()) {
                Iterator<T> it3 = f182175a.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        c22.x0.f23314a.getClass();
                        c3VarB = c22.g2.b(c22.x0.Jf);
                        break;
                    }
                    if (!(((b11.v) it3.next()) instanceof b11.a.c)) {
                        c3VarB = c22.i.b(R.string.food_added_to_meal);
                        break;
                    }
                }
            } else {
                c22.x0.f23314a.getClass();
                c3VarB = c22.g2.b(c22.x0.Jf);
                break;
            }
            Object obj2 = null;
            m21.d dVar = new m21.d(new b11.u.a(c3VarB, null, 2, null), null, 2, null);
            r53.p2 p2Var = gVar.f116124q;
            while (true) {
                Object value = p2Var.getValue();
                if (p2Var.b(value, m21.e.a((m21.e) value, null, false, false, null, dVar, false, null, null, false, false, null, null, false, null, null, null, 1048539))) {
                    break;
                }
                obj2 = null;
            }
            this.f15387c.a().f(null, "foodsAddedToMealResult");
        }
        return Unit.INSTANCE;
    }
}
