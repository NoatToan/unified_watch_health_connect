package b21;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSearchFoodNavKt$nutritionSearchFoodGraph$1$3$1$1$1", f = "NutritionSearchFoodNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x11.l f15041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<b11.v> f15042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m21.v f15043c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m5(x11.l lVar, List<? extends b11.v> list, m21.v vVar, t13.d<? super m5> dVar) {
        super(2, dVar);
        this.f15041a = lVar;
        this.f15042b = list;
        this.f15043c = vVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m5(this.f15041a, this.f15042b, this.f15043c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        x11.l lVar = this.f15041a;
        lVar.getClass();
        List<b11.v> list = this.f15042b;
        list.getClass();
        LinkedHashMap linkedHashMap = lVar.f188440g;
        List list2 = (List) linkedHashMap.get(v11.c.ADDED);
        if (list2 == null) {
            list2 = p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        int i14 = 0;
        for (Object obj2 : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            arrayList.add(x11.l.z4(lVar, list2.size() + i14, (b11.v) obj2, v11.c.ADDED));
            i14 = i15;
        }
        linkedHashMap.put(v11.c.ADDED, p13.h0.C0(list2, arrayList));
        r53.p2 p2Var = lVar.f188442i;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, x11.k.a((x11.k) value, false, lVar.B4(), lVar.y4(), 3)));
        this.f15043c.x4();
        return Unit.INSTANCE;
    }
}
