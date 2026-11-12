package b21;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionReportsNavKt$nutritionReportsGraph$1$10$1$2$1", f = "NutritionReportsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.v f14824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.x3<b11.v> f14825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f11.g f14826c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l1(lc.v vVar, p3.x3<? extends b11.v> x3Var, f11.g gVar, t13.d<? super l1> dVar) {
        super(2, dVar);
        this.f14824a = vVar;
        this.f14825b = x3Var;
        this.f14826c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l1(this.f14824a, this.f14825b, this.f14826c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Iterable iterable;
        d11.d dVar;
        d11.d dVar2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        b11.v f182175a = this.f14825b.getF182175a();
        if (f182175a != null) {
            f11.g gVar = this.f14826c;
            gVar.getClass();
            r53.p2 p2Var = gVar.f67932d;
            d11.b bVar = (d11.b) p2Var.getValue();
            if ((bVar != null && (dVar2 = bVar.f57044a) != null && (iterable = dVar2.f57059c) != null) || (iterable = p13.j0.f134944a) != null) {
                ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
                for (Object obj2 : iterable) {
                    b11.v vVar = (b11.v) obj2;
                    vVar.getClass();
                    if (p005kotlin.jvm.internal.s.g(vVar.getF14234a(), f182175a.getF14234a())) {
                        obj2 = f182175a;
                    }
                    arrayList.add(obj2);
                }
                d11.b bVar2 = (d11.b) p2Var.getValue();
                if (bVar2 != null && (dVar = bVar2.f57044a) != null) {
                    d11.d dVarA = d11.d.a(dVar, null, null, i53.a.e(arrayList), 3);
                    d11.b bVar3 = (d11.b) p2Var.getValue();
                    p2Var.setValue(bVar3 != null ? d11.b.a(bVar3, dVarA, null, 14) : null);
                }
            }
        }
        this.f14824a.a().f(null, "standaloneConsumableFoodUpdatedResult");
        return Unit.INSTANCE;
    }
}
