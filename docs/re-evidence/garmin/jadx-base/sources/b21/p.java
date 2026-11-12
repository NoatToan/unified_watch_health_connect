package b21;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionMealSettingsSubGraphKt$mealSettingsSubGraph$1$3$1$1$1", f = "NutritionMealSettingsSubGraph.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u21.f f15118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u21.h f15120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.v f15121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3.x3<Boolean> f15122e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u21.f fVar, int i14, u21.h hVar, lc.v vVar, p3.x3<Boolean> x3Var, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f15118a = fVar;
        this.f15119b = i14;
        this.f15120c = hVar;
        this.f15121d = vVar;
        this.f15122e = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f15118a, this.f15119b, this.f15120c, this.f15121d, this.f15122e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        s21.j jVar;
        Object value;
        Object next;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (p005kotlin.jvm.internal.s.g(this.f15122e.getF182175a(), Boolean.TRUE)) {
            List<s21.j> list = this.f15118a.f167951b;
            if (list != null) {
                Iterator<T> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((s21.j) next).f156129a != this.f15119b);
                jVar = (s21.j) next;
            } else {
                jVar = null;
            }
            if (jVar == null) {
                return Unit.INSTANCE;
            }
            Integer num = jVar.f156133e;
            Integer num2 = new Integer(jVar.f156132d);
            r53.p2 p2Var = this.f15120c.f167985h;
            u21.g gVar = (u21.g) p2Var.getValue();
            if (!p005kotlin.jvm.internal.s.g(gVar.f167967g, num) || !p005kotlin.jvm.internal.s.g(gVar.f167968h, num2)) {
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, u21.g.a((u21.g) value, null, null, num, num2, null, 831)));
            }
            this.f15121d.a().f(null, "EditMealCaloriesGoalsUpdatedResult");
        }
        return Unit.INSTANCE;
    }
}
