package b21;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSearchFoodNavKt$nutritionSearchFoodGraph$1$2$1$2$1", f = "NutritionSearchFoodNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<y21.a> f15009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y21.c f15010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l4.z0 f15011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m21.v f15012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(p3.x3<y21.a> x3Var, y21.c cVar, l4.z0 z0Var, m21.v vVar, lc.m0 m0Var, t13.d<? super l5> dVar) {
        super(2, dVar);
        this.f15009a = x3Var;
        this.f15010b = cVar;
        this.f15011c = z0Var;
        this.f15012d = vVar;
        this.f15013e = m0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l5(this.f15009a, this.f15010b, this.f15011c, this.f15012d, this.f15013e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        List<b11.a.C0202a> list = this.f15009a.getF182175a().f194229f;
        if (list != null) {
            r53.p2 p2Var = this.f15010b.f194238e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, y21.a.a((y21.a) value, false, null, false, false, false, null, false, 95)));
            l4.z0 z0Var = this.f15011c;
            boolean z14 = z0Var.f15006f;
            m21.v vVar = this.f15012d;
            lc.m0 m0Var = this.f15013e;
            if (z14) {
                vVar.getClass();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    vVar.y4((b11.a) it.next());
                }
                m0Var.o(p005kotlin.jvm.internal.s0.f105811a.b(l4.q.class), false);
            } else {
                vVar.f116177b.k(null, list);
                o4.a aVar2 = o4.f15095a;
                String str = z0Var.f15002b;
                aVar2.getClass();
                o4 o4VarA = o4.a.a(str);
                if (o4VarA == null) {
                    o4VarA = o4.LOG_FOOD;
                }
                m0Var.h(new androidx.room.w0(15), new l4.q(o4VarA, b63.u.Companion.a(b63.u.INSTANCE, z0Var.f15003c), z0Var.f15007g, true));
            }
        }
        return Unit.INSTANCE;
    }
}
