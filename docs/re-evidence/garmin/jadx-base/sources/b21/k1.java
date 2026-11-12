package b21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionReportsNavKt$nutritionReportsGraph$1$10$1$1$1", f = "NutritionReportsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.v f14791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.x3<List<b11.a>> f14792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f11.g f14793c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k1(lc.v vVar, p3.x3<? extends List<? extends b11.a>> x3Var, f11.g gVar, t13.d<? super k1> dVar) {
        super(2, dVar);
        this.f14791a = vVar;
        this.f14792b = x3Var;
        this.f14793c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k1(this.f14791a, this.f14792b, this.f14793c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Collection collection;
        d11.d dVar;
        d11.d dVar2;
        Iterable iterableC;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        List<b11.a> f182175a = this.f14792b.getF182175a();
        if (f182175a != null) {
            f11.g gVar = this.f14793c;
            r53.p2 p2Var = gVar.f67932d;
            ArrayList arrayList = new ArrayList();
            for (b11.a aVar2 : f182175a) {
                if (aVar2 instanceof b11.v) {
                    iterableC = p13.w.c(aVar2);
                } else {
                    if (!(aVar2 instanceof b11.a.b)) {
                        lc.u0.r();
                        return null;
                    }
                    iterableC = ((b11.a.b) aVar2).f14233i;
                }
                p13.d0.v(arrayList, iterableC);
            }
            d11.b bVar = (d11.b) p2Var.getValue();
            if (bVar == null || (dVar2 = bVar.f57044a) == null || (collection = dVar2.f57059c) == null) {
                collection = p13.j0.f134944a;
            }
            ArrayList arrayListC0 = p13.h0.C0(collection, arrayList);
            d11.b bVar2 = (d11.b) p2Var.getValue();
            if (bVar2 != null && (dVar = bVar2.f57044a) != null) {
                d11.d dVarA = d11.d.a(dVar, null, null, i53.a.e(arrayListC0), 3);
                d11.b bVar3 = (d11.b) p2Var.getValue();
                p2Var.setValue(bVar3 != null ? d11.b.a(bVar3, dVarA, null, 14) : null);
                gVar.x4(v01.f.NO_FOOD);
            }
        }
        this.f14791a.a().f(null, "addedFoodResult");
        return Unit.INSTANCE;
    }
}
