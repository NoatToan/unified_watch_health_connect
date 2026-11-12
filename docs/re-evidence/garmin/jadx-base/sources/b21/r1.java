package b21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionReportsNavKt$nutritionReportsGraph$1$12$4$1", f = "NutritionReportsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.v f15188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.x3<b11.v> f15189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f11.f f15190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r1(lc.v vVar, p3.x3<? extends b11.v> x3Var, f11.f fVar, t13.d<? super r1> dVar) {
        super(2, dVar);
        this.f15188a = vVar;
        this.f15189b = x3Var;
        this.f15190c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r1(this.f15188a, this.f15189b, this.f15190c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        d11.i iVar;
        ArrayList arrayList;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        b11.v f182175a = this.f15189b.getF182175a();
        if (f182175a != null) {
            f11.f fVar = this.f15190c;
            fVar.getClass();
            d11.f fVar2 = fVar.f67926k;
            if (fVar2 != null) {
                r53.p2 p2Var = fVar.f67921f;
                do {
                    value = p2Var.getValue();
                    iVar = (d11.i) value;
                    i53.c<d11.f> cVar = iVar.f57082d;
                    ArrayList arrayList2 = new ArrayList(p13.y.r(cVar, 10));
                    for (d11.f fVar3 : cVar) {
                        if (fVar3.a().equals(fVar2.a()) && p005kotlin.jvm.internal.s.g(fVar3.f57067a.getF14238e().f14253a, f182175a.getF14238e().f14253a)) {
                            fVar3 = new d11.f(f182175a, false);
                        }
                        arrayList2.add(fVar3);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj2 : arrayList2) {
                        String strA = ((d11.f) obj2).a();
                        Object arrayList3 = linkedHashMap.get(strA);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            linkedHashMap.put(strA, arrayList3);
                        }
                        ((List) arrayList3).add(obj2);
                    }
                    arrayList = new ArrayList(linkedHashMap.size());
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        Iterator it3 = ((List) ((Map.Entry) it.next()).getValue()).iterator();
                        if (!it3.hasNext()) {
                            org.apache.commons.lang3.e.w("Empty collection can't be reduced.");
                            return null;
                        }
                        Object next = it3.next();
                        while (it3.hasNext()) {
                            next = ((d11.f) next).b((d11.f) it3.next());
                        }
                        arrayList.add((d11.f) next);
                    }
                } while (!p2Var.b(value, d11.i.a(iVar, null, null, i53.a.j(arrayList), null, d11.e.a(iVar.f57084f, false, false, false, false, false, false, false, 123), null, false, false, false, false, null, 4055)));
            }
        }
        this.f15188a.a().f(null, "standaloneConsumableFoodUpdatedResult");
        return Unit.INSTANCE;
    }
}
