package b21;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionReportsNavKt$nutritionReportsGraph$1$11$1$2$1", f = "NutritionReportsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.v f15058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.x3<b11.v> f15059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l11.n f15060c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n1(lc.v vVar, p3.x3<? extends b11.v> x3Var, l11.n nVar, t13.d<? super n1> dVar) {
        super(2, dVar);
        this.f15058a = vVar;
        this.f15059b = x3Var;
        this.f15060c = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n1(this.f15058a, this.f15059b, this.f15060c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        l11.l lVar;
        Object value;
        l11.m mVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        b11.v f182175a = this.f15059b.getF182175a();
        if (f182175a != null) {
            l11.n nVar = this.f15060c;
            nVar.getClass();
            r53.p2 p2Var = nVar.f108199j;
            l11.m mVar2 = (l11.m) p2Var.getValue();
            if (mVar2 != null && (lVar = mVar2.f108184a) != null) {
                b11.a.b bVar = lVar.f108179a;
                i53.c<b11.v> cVar = bVar.f14233i;
                cVar.getClass();
                ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
                for (b11.v vVar : cVar) {
                    b11.v vVar2 = vVar;
                    vVar2.getClass();
                    if (p005kotlin.jvm.internal.s.g(vVar2.getF14234a(), f182175a.getF14234a())) {
                        vVar = f182175a;
                    }
                    arrayList.add(vVar);
                }
                b11.a.b bVarD = b11.a.b.d(bVar, null, false, null, i53.a.e(arrayList), 255);
                do {
                    value = p2Var.getValue();
                    mVar = (l11.m) value;
                } while (!p2Var.b(value, mVar != null ? l11.m.a(mVar, l11.l.a(mVar.f108184a, bVarD, null, 30)) : null));
            }
        }
        this.f15058a.a().f(null, "standaloneConsumableFoodUpdatedResult");
        return Unit.INSTANCE;
    }
}
