package b21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSetupNavKt$nutritionSetupGraph$1$15$1$1", f = "NutritionSetupNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y9 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<s21.o> f15422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u21.c0 f15423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.v f15424c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(p3.x3<s21.o> x3Var, u21.c0 c0Var, lc.v vVar, t13.d<? super y9> dVar) {
        super(2, dVar);
        this.f15422a = x3Var;
        this.f15423b = c0Var;
        this.f15424c = vVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y9(this.f15422a, this.f15423b, this.f15424c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y9) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object next;
        Double d14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        s21.o f182175a = this.f15422a.getF182175a();
        if (f182175a != null) {
            u21.c0 c0Var = this.f15423b;
            c0Var.getClass();
            if (f182175a.f156159a) {
                List<s21.n> list = f182175a.f156160b;
                ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                for (s21.n nVarB : list) {
                    if (nVarB.f156154d == null) {
                        Iterator<T> it = c0Var.f167914b.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!p005kotlin.jvm.internal.s.g(((s21.n) next).f156152b, nVarB.f156152b));
                        s21.n nVar = (s21.n) next;
                        nVarB = s21.n.b(nVarB, false, Double.valueOf((nVar == null || (d14 = nVar.f156154d) == null) ? 0.0d : d14.doubleValue()), 0, 55);
                    }
                    arrayList.add(nVarB);
                }
                c0Var.y4(arrayList, true);
            } else {
                r53.p2 p2Var = c0Var.f167916d;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, u21.a0.a((u21.a0) value, false, f182175a, false, 5)));
            }
            this.f15424c.a().f(null, "editMicronutrientsResult");
        }
        return Unit.INSTANCE;
    }
}
