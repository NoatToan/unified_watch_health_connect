package b21;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSearchFoodNavKt$nutritionSearchFoodGraph$1$3$1$2$1", f = "NutritionSearchFoodNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.v f15063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.x3<b11.v> f15064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x11.l f15065c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n5(lc.v vVar, p3.x3<? extends b11.v> x3Var, x11.l lVar, t13.d<? super n5> dVar) {
        super(2, dVar);
        this.f15063a = vVar;
        this.f15064b = x3Var;
        this.f15065c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n5(this.f15063a, this.f15064b, this.f15065c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        x11.k kVarA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        b11.v f182175a = this.f15064b.getF182175a();
        if (f182175a != null) {
            x11.l lVar = this.f15065c;
            LinkedHashMap linkedHashMap = lVar.f188440g;
            r53.p2 p2Var = lVar.f188442i;
            do {
                value = p2Var.getValue();
                kVarA = (x11.k) value;
                v11.b.e eVar = lVar.f188439f;
                if (eVar != null) {
                    v11.c cVar = eVar.f174678c;
                    Iterable<v11.b.e> iterable = (List) linkedHashMap.get(cVar);
                    if (iterable == null) {
                        iterable = p13.j0.f134944a;
                    }
                    ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
                    for (v11.b.e eVarA : iterable) {
                        if (eVar.f174679d.equals(eVarA.f174679d) && p005kotlin.jvm.internal.s.g(eVarA.f174676a.getF14238e().f14253a, f182175a.getF14238e().f14253a)) {
                            eVarA = v11.b.e.a(eVarA, f182175a, false, 14);
                        }
                        arrayList.add(eVarA);
                    }
                    linkedHashMap.put(cVar, arrayList);
                    lVar.f188439f = null;
                    kVarA = x11.k.a(kVarA, false, lVar.B4(), lVar.y4(), 3);
                }
            } while (!p2Var.b(value, kVarA));
        }
        this.f15063a.a().f(null, "standaloneConsumableFoodUpdatedResult");
        return Unit.INSTANCE;
    }
}
